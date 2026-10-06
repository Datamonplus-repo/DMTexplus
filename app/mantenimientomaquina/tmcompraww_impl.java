package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmcompraww_impl extends GXDataArea
{
   public tmcompraww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmcompraww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcompraww_impl.class ));
   }

   public tmcompraww_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbMComOri = new HTMLChoice();
      cmbMComEst = new HTMLChoice();
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7ColumnsSelector);
      AV24FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV55TFMComCod = GXutil.lval( httpContext.GetPar( "TFMComCod")) ;
      AV56TFMComCod_To = GXutil.lval( httpContext.GetPar( "TFMComCod_To")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV65TFMComOri_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59TFMComEst_Sels);
      AV63TFMComFch = localUtil.parseDateParm( httpContext.GetPar( "TFMComFch")) ;
      AV67TFMComSolFch = localUtil.parseDateParm( httpContext.GetPar( "TFMComSolFch")) ;
      AV57TFMComEntFch = localUtil.parseDateParm( httpContext.GetPar( "TFMComEntFch")) ;
      AV73TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV74TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV71TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV72TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV84Pgmname = httpContext.GetPar( "Pgmname") ;
      AV44OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV46OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV33GroupBy = httpContext.GetPar( "GroupBy") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27GridCollapsedRecords);
      AV34GroupKey = httpContext.GetPar( "GroupKey") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28GridCollapsedRecordsChildren);
      AV19EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
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
      pa13X2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start13X2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmcompraww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMCompraWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmcompraww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV40ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV40ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV29GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV30GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV7ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV7ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMCOD", GXutil.ltrim( localUtil.ntoc( AV55TFMComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV56TFMComCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFMCOMORI_SELS", AV65TFMComOri_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFMCOMORI_SELS", AV65TFMComOri_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFMCOMEST_SELS", AV59TFMComEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFMCOMEST_SELS", AV59TFMComEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMFCH", localUtil.dtoc( AV63TFMComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMSOLFCH", localUtil.dtoc( AV67TFMComSolFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMENTFCH", localUtil.dtoc( AV57TFMComEntFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV73TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV74TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM", GXutil.rtrim( AV71TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM_SEL", GXutil.rtrim( AV72TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV44OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV46OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPBY", AV33GroupBy);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDS", AV27GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDS", AV27GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPKEY", AV34GroupKey);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDSCHILDREN", AV28GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDSCHILDREN", AV28GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV31GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV31GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMORI_SELSJSON", AV66TFMComOri_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMCOMEST_SELSJSON", AV60TFMComEst_SelsJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vADDCHILDREN", AV6AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowgroup", GXutil.rtrim( Ddo_grid_Allowgroup));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Title", GXutil.rtrim( Dvelop_confirmpanel_recibir_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_recibir_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recibir_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recibir_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recibir_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_recibir_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_recibir_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Gridinternalname", GXutil.rtrim( Grid_group_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Columnindex", GXutil.ltrim( localUtil.ntoc( Grid_group_Columnindex, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hasrowgroups", GXutil.booltostr( Grid_empowerer_Hasrowgroups));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedtext_get", GXutil.rtrim( Ddo_grid_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "MCOMEST_Text", GXutil.rtrim( cmbMComEst.getDescription()));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Result", GXutil.rtrim( Dvelop_confirmpanel_recibir_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedtext_get", GXutil.rtrim( Ddo_grid_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RECIBIR_Result", GXutil.rtrim( Dvelop_confirmpanel_recibir_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Result));
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
         we13X2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt13X2( ) ;
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
      return formatLink("app.mantenimientomaquina.tmcompraww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMCompraWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Compras", "") ;
   }

   public void wb13X0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_13X2( true) ;
      }
      else
      {
         wb_table1_27_13X2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_13X2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV84Pgmname), GXutil.rtrim( localUtil.format( AV84Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrids_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV29GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV30GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0077"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0077"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_55_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0077"+"");
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
         ucDdo_grid.setProperty("AllowGroup", Ddo_grid_Allowgroup);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV7ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_84_13X2( true) ;
      }
      else
      {
         wb_table2_84_13X2( false) ;
      }
      return  ;
   }

   public void wb_table2_84_13X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_89_13X2( true) ;
      }
      else
      {
         wb_table3_89_13X2( false) ;
      }
      return  ;
   }

   public void wb_table3_89_13X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_group.setProperty("ColumnIndex", Grid_group_Columnindex);
         ucGrid_group.render(context, "dvelop.dvgroupby", Grid_group_Internalname, "GRID_GROUPContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("HasRowGroups", Grid_empowerer_Hasrowgroups);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mcomfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mcomfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mcomfchauxdate_Internalname, localUtil.format(AV12DDO_MComFchAuxDate, "99/99/99"), localUtil.format( AV12DDO_MComFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mcomfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mcomfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mcomsolfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mcomsolfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mcomsolfchauxdate_Internalname, localUtil.format(AV14DDO_MComSolFchAuxDate, "99/99/99"), localUtil.format( AV14DDO_MComSolFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mcomsolfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mcomsolfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mcomentfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mcomentfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mcomentfchauxdate_Internalname, localUtil.format(AV10DDO_MComEntFchAuxDate, "99/99/99"), localUtil.format( AV10DDO_MComEntFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mcomentfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mcomentfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 55 )
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

   public void start13X2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Compras", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup13X0( ) ;
   }

   public void ws13X2( )
   {
      start13X2( ) ;
      evt13X2( ) ;
   }

   public void evt13X2( )
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
                           e1113X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1213X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1313X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1413X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1513X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RECIBIR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1613X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CANCELAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1713X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1813X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1913X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e2013X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e2113X2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           AV23Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV23Expand);
                           AV25Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
                           AV17DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV17DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV26GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A11055MComCod = localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A11045MComExt = httpContext.cgiGet( edtMComExt_Internalname) ;
                           cmbMComOri.setName( cmbMComOri.getInternalname() );
                           cmbMComOri.setValue( httpContext.cgiGet( cmbMComOri.getInternalname()) );
                           A11050MComOri = httpContext.cgiGet( cmbMComOri.getInternalname()) ;
                           cmbMComEst.setName( cmbMComEst.getInternalname() );
                           cmbMComEst.setValue( httpContext.cgiGet( cmbMComEst.getInternalname()) );
                           A11049MComEst = httpContext.cgiGet( cmbMComEst.getInternalname()) ;
                           A11046MComFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMComFch_Internalname), 0)) ;
                           A11047MComSolFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMComSolFch_Internalname), 0)) ;
                           A11048MComEntFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMComEntFch_Internalname), 0)) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n795PrvNum = false ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A13719PrvNNom = httpContext.cgiGet( edtPrvNNom_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2213X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2313X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2413X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2513X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2613X2 ();
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
                     if ( nCmpId == 77 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0077") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0077", "", sEvt);
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

   public void we13X2( )
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

   public void pa13X2( )
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelector ,
                                 String AV24FilterFullText ,
                                 long AV55TFMComCod ,
                                 long AV56TFMComCod_To ,
                                 GXSimpleCollection<String> AV65TFMComOri_Sels ,
                                 GXSimpleCollection<String> AV59TFMComEst_Sels ,
                                 java.util.Date AV63TFMComFch ,
                                 java.util.Date AV67TFMComSolFch ,
                                 java.util.Date AV57TFMComEntFch ,
                                 int AV73TFPrvNum ,
                                 int AV74TFPrvNum_To ,
                                 String AV71TFPrvNom ,
                                 String AV72TFPrvNom_Sel ,
                                 String AV84Pgmname ,
                                 short AV44OrderedBy ,
                                 boolean AV46OrderedDsc ,
                                 String AV33GroupBy ,
                                 GXSimpleCollection<String> AV27GridCollapsedRecords ,
                                 String AV34GroupKey ,
                                 GXSimpleCollection<String> AV28GridCollapsedRecordsChildren ,
                                 String AV19EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2313X2 ();
      GRID_nCurrentRecord = 0 ;
      rf13X2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMCompraWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmcompraww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf13X2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV84Pgmname = "MantenimientoMaquina.TMCompraWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11050MComOri ,
                                           AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                           A11049MComEst ,
                                           AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                           Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) ,
                                           Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) ,
                                           Integer.valueOf(AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels.size()) ,
                                           Integer.valueOf(AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels.size()) ,
                                           AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                           AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                           AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                           Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) ,
                                           Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) ,
                                           AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                           AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11046MComFch ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV44OrderedBy) ,
                                           Boolean.valueOf(AV46OrderedDsc) ,
                                           AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ,
                                           Integer.valueOf(AV28GridCollapsedRecordsChildren.size()) ,
                                           A396EmprCod ,
                                           AV28GridCollapsedRecordsChildren } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom), 30, "%") ;
      /* Using cursor H013X2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod), Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to), AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch, AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch, AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch, Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum), Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to), lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom, AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11048MComEntFch = H013X2_A11048MComEntFch[0] ;
         A11047MComSolFch = H013X2_A11047MComSolFch[0] ;
         A11046MComFch = H013X2_A11046MComFch[0] ;
         A11049MComEst = H013X2_A11049MComEst[0] ;
         A11050MComOri = H013X2_A11050MComOri[0] ;
         A11045MComExt = H013X2_A11045MComExt[0] ;
         A11055MComCod = H013X2_A11055MComCod[0] ;
         A407EmprNom = H013X2_A407EmprNom[0] ;
         n407EmprNom = H013X2_n407EmprNom[0] ;
         A396EmprCod = H013X2_A396EmprCod[0] ;
         A794PrvNom = H013X2_A794PrvNom[0] ;
         n794PrvNom = H013X2_n794PrvNom[0] ;
         A795PrvNum = H013X2_A795PrvNum[0] ;
         n795PrvNum = H013X2_n795PrvNum[0] ;
         A407EmprNom = H013X2_A407EmprNom[0] ;
         n407EmprNom = H013X2_n407EmprNom[0] ;
         A794PrvNom = H013X2_A794PrvNom[0] ;
         n794PrvNom = H013X2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "manual", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, "M") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "automático", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "confirmada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "enviada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cancelada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "recibida", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "R") == 0 ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ( AV28GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A11055MComCod, 10, 0)), AV28GridCollapsedRecordsChildren) ) )
            {
               A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf13X2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e2313X2 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A11050MComOri ,
                                              AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                              A11049MComEst ,
                                              AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                              Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) ,
                                              Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) ,
                                              Integer.valueOf(AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels.size()) ,
                                              Integer.valueOf(AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels.size()) ,
                                              AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                              AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                              AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                              Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) ,
                                              Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) ,
                                              AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                              AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                              Long.valueOf(A11055MComCod) ,
                                              A11046MComFch ,
                                              A11047MComSolFch ,
                                              A11048MComEntFch ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              Short.valueOf(AV44OrderedBy) ,
                                              Boolean.valueOf(AV46OrderedDsc) ,
                                              AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ,
                                              Integer.valueOf(AV28GridCollapsedRecordsChildren.size()) ,
                                              A396EmprCod ,
                                              AV28GridCollapsedRecordsChildren } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom), 30, "%") ;
         /* Using cursor H013X3 */
         pr_default.execute(1, new Object[] {Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod), Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to), AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch, AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch, AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch, Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum), Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to), lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom, AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A11048MComEntFch = H013X3_A11048MComEntFch[0] ;
            A11047MComSolFch = H013X3_A11047MComSolFch[0] ;
            A11046MComFch = H013X3_A11046MComFch[0] ;
            A11049MComEst = H013X3_A11049MComEst[0] ;
            A11050MComOri = H013X3_A11050MComOri[0] ;
            A11045MComExt = H013X3_A11045MComExt[0] ;
            A11055MComCod = H013X3_A11055MComCod[0] ;
            A407EmprNom = H013X3_A407EmprNom[0] ;
            n407EmprNom = H013X3_n407EmprNom[0] ;
            A396EmprCod = H013X3_A396EmprCod[0] ;
            A794PrvNom = H013X3_A794PrvNom[0] ;
            n794PrvNom = H013X3_n794PrvNom[0] ;
            A795PrvNum = H013X3_A795PrvNum[0] ;
            n795PrvNum = H013X3_n795PrvNum[0] ;
            A407EmprNom = H013X3_A407EmprNom[0] ;
            n407EmprNom = H013X3_n407EmprNom[0] ;
            A794PrvNom = H013X3_A794PrvNom[0] ;
            n794PrvNom = H013X3_n794PrvNom[0] ;
            if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "manual", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, "M") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "automático", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "confirmada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "enviada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cancelada", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "recibida", "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "R") == 0 ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ( AV28GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A11055MComCod, 10, 0)), AV28GridCollapsedRecordsChildren) ) )
               {
                  A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
                  e2413X2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(55) ;
         wb13X0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes13X2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
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
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV7ColumnsSelector, AV24FilterFullText, AV55TFMComCod, AV56TFMComCod_To, AV65TFMComOri_Sels, AV59TFMComEst_Sels, AV63TFMComFch, AV67TFMComSolFch, AV57TFMComEntFch, AV73TFPrvNum, AV74TFPrvNum_To, AV71TFPrvNom, AV72TFPrvNom_Sel, AV84Pgmname, AV44OrderedBy, AV46OrderedDsc, AV33GroupBy, AV27GridCollapsedRecords, AV34GroupKey, AV28GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV84Pgmname = "MantenimientoMaquina.TMCompraWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup13X0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2213X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV40ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV7ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV30GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowgroup = httpContext.cgiGet( "DDO_GRID_Allowgroup") ;
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
         Dvelop_confirmpanel_recibir_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Title") ;
         Dvelop_confirmpanel_recibir_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Confirmationtext") ;
         Dvelop_confirmpanel_recibir_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_recibir_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Nobuttoncaption") ;
         Dvelop_confirmpanel_recibir_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_recibir_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Yesbuttonposition") ;
         Dvelop_confirmpanel_recibir_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Confirmtype") ;
         Dvelop_confirmpanel_cancelar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Title") ;
         Dvelop_confirmpanel_cancelar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Confirmationtext") ;
         Dvelop_confirmpanel_cancelar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cancelar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Confirmtype") ;
         Grid_group_Gridinternalname = httpContext.cgiGet( "GRID_GROUP_Gridinternalname") ;
         Grid_group_Columnindex = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_GROUP_Columnindex"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Hasrowgroups = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hasrowgroups")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedtext_get = httpContext.cgiGet( "DDO_GRID_Selectedtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_recibir_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RECIBIR_Result") ;
         Dvelop_confirmpanel_cancelar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Result") ;
         /* Read variables values. */
         AV24FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FilterFullText", AV24FilterFullText);
         AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mcomfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MCOMFCHAUXDATE");
            GX_FocusControl = edtavDdo_mcomfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12DDO_MComFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_MComFchAuxDate", localUtil.format(AV12DDO_MComFchAuxDate, "99/99/99"));
         }
         else
         {
            AV12DDO_MComFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mcomfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_MComFchAuxDate", localUtil.format(AV12DDO_MComFchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mcomsolfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MCOMSOLFCHAUXDATE");
            GX_FocusControl = edtavDdo_mcomsolfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_MComSolFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_MComSolFchAuxDate", localUtil.format(AV14DDO_MComSolFchAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_MComSolFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mcomsolfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_MComSolFchAuxDate", localUtil.format(AV14DDO_MComSolFchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mcomentfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MCOMENTFCHAUXDATE");
            GX_FocusControl = edtavDdo_mcomentfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10DDO_MComEntFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDO_MComEntFchAuxDate", localUtil.format(AV10DDO_MComEntFchAuxDate, "99/99/99"));
         }
         else
         {
            AV10DDO_MComEntFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mcomentfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDO_MComEntFchAuxDate", localUtil.format(AV10DDO_MComEntFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMCompraWW");
         AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("mantenimientomaquina\\tmcompraww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e2213X2 ();
      if (returnInSub) return;
   }

   public void e2213X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmcompraww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV78UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmcompraww_impl.this.AV19EmprCod = GXv_char2[0] ;
      tmcompraww_impl.this.AV20EmprNom = GXv_char3[0] ;
      tmcompraww_impl.this.AV78UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      GXt_int5 = AV5Acabats2013 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int6) ;
      tmcompraww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV5Acabats2013 = GXt_int5 ;
      GXt_char1 = AV50Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmcompraww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Station = GXt_char1 ;
      GXv_char4[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char2[0] = AV78UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmcompraww_impl.this.AV19EmprCod = GXv_char4[0] ;
      tmcompraww_impl.this.AV20EmprNom = GXv_char3[0] ;
      tmcompraww_impl.this.AV78UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      Grid_group_Gridinternalname = subGrid_Internalname ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "GridInternalName", Grid_group_Gridinternalname);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV37HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Compras", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV44OrderedBy < 1 )
      {
         AV44OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2313X2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV79WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV79WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV41ManageFiltersExecutionStep == 1 )
      {
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV41ManageFiltersExecutionStep == 2 )
      {
         AV41ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV49Session.getValue("MantenimientoMaquina.TMCompraWWColumnsSelector"), "") != 0 )
      {
         AV9ColumnsSelectorXML = AV49Session.getValue("MantenimientoMaquina.TMCompraWWColumnsSelector") ;
         AV7ColumnsSelector.fromxml(AV9ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMComCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      cmbMComOri.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Visible", GXutil.ltrimstr( cmbMComOri.getVisible(), 5, 0), !bGXsfl_55_Refreshing);
      cmbMComEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbMComEst.getVisible(), 5, 0), !bGXsfl_55_Refreshing);
      edtMComFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComFch_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtMComSolFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolFch_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtMComEntFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntFch_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV7ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      AV29GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GridCurrentPage), 10, 0));
      AV30GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridPageCount), 10, 0));
      cmbMComEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Columnheaderclass", cmbMComEst.getColumnHeaderClass(), !bGXsfl_55_Refreshing);
      AV25Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e1213X2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e1313X2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1413X2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) )
      {
         if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) || ( GXutil.strcmp(GXutil.trim( GXutil.str( AV44OrderedBy, 4, 0)), Ddo_grid_Selectedvalue_get) != 0 ) )
         {
            AV33GroupBy = ((GXutil.strcmp(AV33GroupBy, Ddo_grid_Selectedtext_get)==0) ? "" : Ddo_grid_Selectedtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33GroupBy", AV33GroupBy);
         }
         AV44OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44OrderedBy), 4, 0));
         AV46OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0)||(GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>")==0)&&(GXutil.strcmp("", AV33GroupBy)==0)&&AV46OrderedDsc ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComCod") == 0 )
         {
            AV55TFMComCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMComCod), 10, 0));
            AV56TFMComCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMComCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComOri") == 0 )
         {
            AV66TFMComOri_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFMComOri_SelsJson", AV66TFMComOri_SelsJson);
            AV65TFMComOri_Sels.fromJSonString(AV66TFMComOri_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComEst") == 0 )
         {
            AV60TFMComEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFMComEst_SelsJson", AV60TFMComEst_SelsJson);
            AV59TFMComEst_Sels.fromJSonString(AV60TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComFch") == 0 )
         {
            AV63TFMComFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFMComFch", localUtil.format(AV63TFMComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComSolFch") == 0 )
         {
            AV67TFMComSolFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFMComSolFch", localUtil.format(AV67TFMComSolFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MComEntFch") == 0 )
         {
            AV57TFMComEntFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFMComEntFch", localUtil.format(AV57TFMComEntFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV73TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvNum), 6, 0));
            AV74TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV71TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrvNom", AV71TFPrvNom);
            AV72TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvNom_Sel", AV72TFPrvNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFMComEst_Sels", AV59TFMComEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFMComOri_Sels", AV65TFMComOri_Sels);
   }

   private void e2413X2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         if ( GXutil.strcmp(AV33GroupBy, "PrvNum") == 0 )
         {
            AV25Grid_GroupCaption = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
            AV25Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Codigo Proveedor", ""), AV25Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
            AV34GroupKey = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
         }
         else if ( GXutil.strcmp(AV33GroupBy, "PrvNom") == 0 )
         {
            AV25Grid_GroupCaption = A794PrvNom ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
            AV25Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Proveedor", ""), AV25Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV25Grid_GroupCaption);
            AV34GroupKey = GXutil.trim( A794PrvNom) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
         }
         AV38Index = AV27GridCollapsedRecords.indexof(AV34GroupKey) ;
         AV23Expand = ((AV38Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV23Expand);
         edtavExpand_Columnclass = ((AV38Index>0) ? "WWPExpand" : "WWPCollapse") ;
         AV17DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV17DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-bars", "", "", "", "", "", "", ""), (short)(0));
         if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Recibir", ""), "fa fa-bars", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Cancelar", ""), "fa fa-bars", "", "", "", "", "", "", ""), (short)(0));
         if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "P") == 0 )
         {
            cmbMComEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "C") == 0 )
         {
            cmbMComEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagInfoLight WWColumnTagInfoLightSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "E") == 0 )
         {
            cmbMComEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagInfo WWColumnTagInfoSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "X") == 0 )
         {
            cmbMComEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagDanger WWColumnTagDangerSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "R") == 0 )
         {
            cmbMComEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
         }
         else
         {
            cmbMComEst.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         }
         if ( AV28GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(55) ;
         }
         sendrow_552( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV26GridActions, 4, 0)) );
   }

   public void e1513X2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV9ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV7ColumnsSelector.fromJSonString(AV9ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMCompraWWColumnsSelector", ((GXutil.strcmp("", AV9ColumnsSelectorXML)==0) ? "" : AV7ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e1113X2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMCompraWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV84Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMCompraWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV42ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientoMaquina.TMCompraWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmcompraww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV42ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV42ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV42ManageFiltersXml) ;
            AV31GridState.fromxml(AV42ManageFiltersXml, null, null);
            AV44OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44OrderedBy), 4, 0));
            AV46OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            AV33GroupBy = AV31GridState.getgxTv_SdtWWPGridState_Groupby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33GroupBy", AV33GroupBy);
            AV27GridCollapsedRecords.fromJSonString(AV31GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV27GridCollapsedRecords.size() > 0 )
            {
               AV6AddChildren = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AddChildren", AV6AddChildren);
               AV97GXV1 = 1 ;
               while ( AV97GXV1 <= AV27GridCollapsedRecords.size() )
               {
                  AV34GroupKey = (String)AV27GridCollapsedRecords.elementAt(-1+AV97GXV1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S272 ();
                  if (returnInSub) return;
                  AV97GXV1 = (int)(AV97GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFMComOri_Sels", AV65TFMComOri_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFMComEst_Sels", AV59TFMComEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
   }

   public void e2513X2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV26GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV26GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV26GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV26GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV26GridActions == 5 )
      {
         /* Execute user subroutine: 'DO RECIBIR' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV26GridActions == 6 )
      {
         /* Execute user subroutine: 'DO CANCELAR' */
         S242 ();
         if (returnInSub) return;
      }
      AV26GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV26GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e1613X2( )
   {
      /* Dvelop_confirmpanel_recibir_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_recibir_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RECIBIR' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e1713X2( )
   {
      /* Dvelop_confirmpanel_cancelar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cancelar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CANCELAR' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e1813X2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e1913X2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.mantenimientomaquina.tmcomprawwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmcompraww_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      tmcompraww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFMComEst_Sels", AV59TFMComEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFMComOri_Sels", AV65TFMComOri_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e2013X2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.mantenimientomaquina.tmcomprawwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFMComEst_Sels", AV59TFMComEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFMComOri_Sels", AV65TFMComOri_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e2113X2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.mantenimientomaquina.tmcomprawwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFMComEst_Sels", AV59TFMComEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFMComOri_Sels", AV65TFMComOri_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
   }

   public void e2613X2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33GroupBy, "PrvNum") == 0 )
      {
         AV34GroupKey = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
      }
      else if ( GXutil.strcmp(AV33GroupBy, "PrvNom") == 0 )
      {
         AV34GroupKey = GXutil.trim( A794PrvNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
      }
      AV38Index = AV27GridCollapsedRecords.indexof(AV34GroupKey) ;
      if ( AV38Index > 0 )
      {
         AV27GridCollapsedRecords.removeItem((int)(AV38Index));
      }
      else
      {
         AV27GridCollapsedRecords.add(AV34GroupKey, 0);
      }
      AV6AddChildren = (0==AV38Index) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AddChildren", AV6AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S272 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridCollapsedRecords", AV27GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridCollapsedRecordsChildren", AV28GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7ColumnsSelector", AV7ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40ManageFiltersData", AV40ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31GridState", AV31GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV44OrderedBy, 4, 0))+":"+(AV46OrderedDsc ? "DSC" : "ASC")+((GXutil.strcmp("", AV33GroupBy)==0) ? "" : " GRP") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV7ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComCod", "", "Compra", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComOri", "", "Origen", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComEst", "", "Estado", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComFch", "", "Fecha", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComSolFch", "", "F. Solicitada", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MComEntFch", "", "F. Entrada", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrvNum", "", "Codigo Proveedor", false, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV7ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrvNom", "", "Proveedor", true, "") ;
      AV7ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV77UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMCompraWWColumnsSelector", GXv_char4) ;
      tmcompraww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV77UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV77UserCustomValue)==0) ) )
      {
         AV8ColumnsSelectorAux.fromxml(AV77UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV7ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV8ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV7ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV40ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientoMaquina.TMCompraWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV40ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV24FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FilterFullText", AV24FilterFullText);
      AV55TFMComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFMComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMComCod), 10, 0));
      AV56TFMComCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFMComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMComCod_To), 10, 0));
      AV65TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV59TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV63TFMComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFMComFch", localUtil.format(AV63TFMComFch, "99/99/99"));
      AV67TFMComSolFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFMComSolFch", localUtil.format(AV67TFMComSolFch, "99/99/99"));
      AV57TFMComEntFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFMComEntFch", localUtil.format(AV57TFMComEntFch, "99/99/99"));
      AV73TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvNum), 6, 0));
      AV74TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFPrvNum_To), 6, 0));
      AV71TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrvNom", AV71TFPrvNom);
      AV72TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvNom_Sel", AV72TFPrvNom_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV27GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcoment", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcompraview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MComCod","TabCode"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else if ( ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) || ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcoment", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Para modificar el estado de la orden debe estar Pendiente, Confirmada o Enviada, para la orden de compra Nro %2", A11049MComEst, GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0), "", "", "", "", "", "", ""));
      }
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmcompra", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"Mode","EmprCod","MComCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Para Eliminar el estado de la orden de estar Pendiente y su estado es %1, para la orden de compra Nro %2", A11049MComEst, GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0), "", "", "", "", "", "", ""));
      }
   }

   public void S222( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pmcom00", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11055MComCod,10,0))}, new String[] {"EmprCod","MComCod"}) , new Object[] {"A396EmprCod","A11055MComCod"});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO RECIBIR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) != 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Estado %1, no válido para procedimiento Recibir en la orden de compra %2 ", cmbMComEst.getDescription(), GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0), "", "", "", "", "", "", ""));
      }
      else
      {
         AV98Emprcod_selected = A396EmprCod ;
         AV99Mcomcod_selected = A11055MComCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_RECIBIRContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S252( )
   {
      /* 'DO ACTION RECIBIR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A11055MComCod ;
      new app.pmcomrec(remoteHandle, context).execute( GXv_char4, GXv_int14) ;
      tmcompraww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmcompraww_impl.this.A11055MComCod = GXv_int14[0] ;
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO CANCELAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) != 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Estado %1, no válido para Cancelar la orden de compra %2 ", cmbMComEst.getDescription(), GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0), "", "", "", "", "", "", ""));
      }
      else
      {
         AV98Emprcod_selected = A396EmprCod ;
         AV99Mcomcod_selected = A11055MComCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CANCELARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S262( )
   {
      /* 'DO ACTION CANCELAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int15[0] = (int)(A11055MComCod) ;
      new app.mantenimientomaquina.pmmscan(remoteHandle, context).execute( GXv_char4, GXv_int15) ;
      tmcompraww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmcompraww_impl.this.A11055MComCod = GXv_int15[0] ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue(AV84Pgmname+"GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV84Pgmname+"GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV49Session.getValue(AV84Pgmname+"GridState"), null, null);
      }
      AV44OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44OrderedBy), 4, 0));
      AV33GroupBy = AV31GridState.getgxTv_SdtWWPGridState_Groupby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GroupBy", AV33GroupBy);
      AV46OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46OrderedDsc", AV46OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV31GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV31GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV31GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
      AV27GridCollapsedRecords.fromJSonString(AV31GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV27GridCollapsedRecords.size() > 0 )
      {
         AV6AddChildren = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6AddChildren", AV6AddChildren);
         AV100GXV2 = 1 ;
         while ( AV100GXV2 <= AV27GridCollapsedRecords.size() )
         {
            AV34GroupKey = (String)AV27GridCollapsedRecords.elementAt(-1+AV100GXV2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GroupKey", AV34GroupKey);
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S272 ();
            if (returnInSub) return;
            AV100GXV2 = (int)(AV100GXV2+1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV101GXV3 = 1 ;
      while ( AV101GXV3 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV3));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FilterFullText", AV24FilterFullText);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV55TFMComCod = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMComCod), 10, 0));
            AV56TFMComCod_To = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMComCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV66TFMComOri_SelsJson = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFMComOri_SelsJson", AV66TFMComOri_SelsJson);
            AV65TFMComOri_Sels.fromJSonString(AV66TFMComOri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV60TFMComEst_SelsJson = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFMComEst_SelsJson", AV60TFMComEst_SelsJson);
            AV59TFMComEst_Sels.fromJSonString(AV60TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV63TFMComFch = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFMComFch", localUtil.format(AV63TFMComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV67TFMComSolFch = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFMComSolFch", localUtil.format(AV67TFMComSolFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV57TFMComEntFch = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFMComEntFch", localUtil.format(AV57TFMComEntFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV73TFPrvNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFPrvNum), 6, 0));
            AV74TFPrvNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV71TFPrvNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFPrvNom", AV71TFPrvNom);
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV72TFPrvNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPrvNom_Sel", AV72TFPrvNom_Sel);
         }
         AV101GXV3 = (int)(AV101GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV65TFMComOri_Sels.size()==0), AV66TFMComOri_SelsJson, GXv_char4) ;
      tmcompraww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV59TFMComEst_Sels.size()==0), AV60TFMComEst_SelsJson, GXv_char3) ;
      tmcompraww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFPrvNom_Sel)==0), AV72TFPrvNom_Sel, GXv_char2) ;
      tmcompraww_impl.this.GXt_char17 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char16+"|||||"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFPrvNom)==0), AV71TFPrvNom, GXv_char4) ;
      tmcompraww_impl.this.GXt_char17 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV55TFMComCod) ? "" : GXutil.str( AV55TFMComCod, 10, 0))+"|||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFMComFch)) ? "" : localUtil.dtoc( AV63TFMComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFMComSolFch)) ? "" : localUtil.dtoc( AV67TFMComSolFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFMComEntFch)) ? "" : localUtil.dtoc( AV57TFMComEntFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV73TFPrvNum) ? "" : GXutil.str( AV73TFPrvNum, 6, 0))+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV56TFMComCod_To) ? "" : GXutil.str( AV56TFMComCod_To, 10, 0))+"||||||"+((0==AV74TFPrvNum_To) ? "" : GXutil.str( AV74TFPrvNum_To, 6, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV31GridState.fromxml(AV49Session.getValue(AV84Pgmname+"GridState"), null, null);
      AV43OldGridState.fromxml(AV31GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV31GridState.setgxTv_SdtWWPGridState_Orderedby( AV44OrderedBy );
      AV31GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV46OrderedDsc );
      AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV24FilterFullText)==0), (short)(0), AV24FilterFullText, "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMCOD", "", !((0==AV55TFMComCod)&&(0==AV56TFMComCod_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFMComCod, 10, 0)), GXutil.trim( GXutil.str( AV56TFMComCod_To, 10, 0))) ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMORI_SEL", "", !(AV65TFMComOri_Sels.size()==0), (short)(0), AV65TFMComOri_Sels.toJSonString(false), "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMEST_SEL", "", !(AV59TFMComEst_Sels.size()==0), (short)(0), AV59TFMComEst_Sels.toJSonString(false), "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFMComFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV63TFMComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMSOLFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFMComSolFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV67TFMComSolFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMCOMENTFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFMComEntFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV57TFMComEntFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRVNUM", "", !((0==AV73TFPrvNum)&&(0==AV74TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV74TFPrvNum_To, 6, 0))) ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV31GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRVNOM", "", !(GXutil.strcmp("", AV71TFPrvNom)==0), (short)(0), AV71TFPrvNom, "", !(GXutil.strcmp("", AV72TFPrvNom_Sel)==0), AV72TFPrvNom_Sel, "") ;
      AV31GridState = GXv_SdtWWPGridState18[0] ;
      AV31GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV31GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      AV31GridState.setgxTv_SdtWWPGridState_Groupby( AV33GroupBy );
      if ( ! (GXutil.strcmp("", AV33GroupBy)==0) && ! ( ( ( AV44OrderedBy == 7 ) && ( GXutil.strcmp(AV33GroupBy, "PrvNum") == 0 ) ) || ( ( AV44OrderedBy == 8 ) && ( GXutil.strcmp(AV33GroupBy, "PrvNom") == 0 ) ) ) )
      {
         AV33GroupBy = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33GroupBy", AV33GroupBy);
      }
      Grid_group_Columnindex = ((GXutil.strcmp("", AV33GroupBy)==0) ? -1 : 1) ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "ColumnIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid_group_Columnindex), 9, 0));
      if ( (GXutil.strcmp("", AV33GroupBy)==0) || new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV43OldGridState, AV31GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV27GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
         AV28GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV31GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV27GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV31GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV75TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV75TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV84Pgmname );
      AV75TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV75TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV37HTTPRequest.getScriptName()+"?"+AV37HTTPRequest.getQuerystring() );
      AV75TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoMaquina.TMCompra" );
      AV49Session.setValue("TrnContext", AV75TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S272( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV18DiscardFirst = true ;
      AV36GroupPrvNum = (int)(GXutil.lval( AV34GroupKey)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GroupPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GroupPrvNum), 6, 0));
      AV81GroupPrvNom = AV34GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81GroupPrvNom", AV81GroupPrvNom);
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = AV24FilterFullText ;
      AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod = AV55TFMComCod ;
      AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to = AV56TFMComCod_To ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = AV65TFMComOri_Sels ;
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = AV59TFMComEst_Sels ;
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = AV63TFMComFch ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = AV67TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = AV57TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum = AV73TFPrvNum ;
      AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to = AV74TFPrvNum_To ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = AV71TFPrvNom ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = AV72TFPrvNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A11050MComOri ,
                                           AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                           A11049MComEst ,
                                           AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                           Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) ,
                                           Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) ,
                                           Integer.valueOf(AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels.size()) ,
                                           Integer.valueOf(AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels.size()) ,
                                           AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                           AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                           AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                           Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) ,
                                           Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) ,
                                           AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                           AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                           AV33GroupBy ,
                                           Integer.valueOf(AV36GroupPrvNum) ,
                                           AV81GroupPrvNom ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11046MComFch ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom), 30, "%") ;
      /* Using cursor H013X4 */
      pr_default.execute(2, new Object[] {Long.valueOf(AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod), Long.valueOf(AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to), AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch, AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch, AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch, Integer.valueOf(AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum), Integer.valueOf(AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to), lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom, AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel, Integer.valueOf(AV36GroupPrvNum), AV81GroupPrvNom});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A794PrvNom = H013X4_A794PrvNom[0] ;
         n794PrvNom = H013X4_n794PrvNom[0] ;
         A795PrvNum = H013X4_A795PrvNum[0] ;
         n795PrvNum = H013X4_n795PrvNum[0] ;
         A11048MComEntFch = H013X4_A11048MComEntFch[0] ;
         A11047MComSolFch = H013X4_A11047MComSolFch[0] ;
         A11046MComFch = H013X4_A11046MComFch[0] ;
         A11055MComCod = H013X4_A11055MComCod[0] ;
         A11049MComEst = H013X4_A11049MComEst[0] ;
         A11050MComOri = H013X4_A11050MComOri[0] ;
         A396EmprCod = H013X4_A396EmprCod[0] ;
         A794PrvNom = H013X4_A794PrvNom[0] ;
         n794PrvNom = H013X4_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV48RecordKey = A396EmprCod + ";" + GXutil.trim( GXutil.str( A11055MComCod, 10, 0)) ;
            AV38Index = AV28GridCollapsedRecordsChildren.indexof(AV48RecordKey) ;
            if ( AV6AddChildren && ( AV38Index == 0 ) )
            {
               if ( ! AV18DiscardFirst )
               {
                  AV28GridCollapsedRecordsChildren.add(AV48RecordKey, 0);
               }
               else
               {
                  AV18DiscardFirst = false ;
               }
            }
            else
            {
               if ( ( ! AV6AddChildren ) && ( AV38Index > 0 ) )
               {
                  AV28GridCollapsedRecordsChildren.removeItem((int)(AV38Index));
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void wb_table3_89_13X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cancelar_Internalname, tblTabledvelop_confirmpanel_cancelar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cancelar.setProperty("Title", Dvelop_confirmpanel_cancelar_Title);
         ucDvelop_confirmpanel_cancelar.setProperty("ConfirmationText", Dvelop_confirmpanel_cancelar_Confirmationtext);
         ucDvelop_confirmpanel_cancelar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cancelar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cancelar_Nobuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cancelar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cancelar_Yesbuttonposition);
         ucDvelop_confirmpanel_cancelar.setProperty("ConfirmType", Dvelop_confirmpanel_cancelar_Confirmtype);
         ucDvelop_confirmpanel_cancelar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cancelar_Internalname, "DVELOP_CONFIRMPANEL_CANCELARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CANCELARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_89_13X2e( true) ;
      }
      else
      {
         wb_table3_89_13X2e( false) ;
      }
   }

   public void wb_table2_84_13X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_recibir_Internalname, tblTabledvelop_confirmpanel_recibir_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_recibir.setProperty("Title", Dvelop_confirmpanel_recibir_Title);
         ucDvelop_confirmpanel_recibir.setProperty("ConfirmationText", Dvelop_confirmpanel_recibir_Confirmationtext);
         ucDvelop_confirmpanel_recibir.setProperty("YesButtonCaption", Dvelop_confirmpanel_recibir_Yesbuttoncaption);
         ucDvelop_confirmpanel_recibir.setProperty("NoButtonCaption", Dvelop_confirmpanel_recibir_Nobuttoncaption);
         ucDvelop_confirmpanel_recibir.setProperty("CancelButtonCaption", Dvelop_confirmpanel_recibir_Cancelbuttoncaption);
         ucDvelop_confirmpanel_recibir.setProperty("YesButtonPosition", Dvelop_confirmpanel_recibir_Yesbuttonposition);
         ucDvelop_confirmpanel_recibir.setProperty("ConfirmType", Dvelop_confirmpanel_recibir_Confirmtype);
         ucDvelop_confirmpanel_recibir.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_recibir_Internalname, "DVELOP_CONFIRMPANEL_RECIBIRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RECIBIRContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_84_13X2e( true) ;
      }
      else
      {
         wb_table2_84_13X2e( false) ;
      }
   }

   public void wb_table1_27_13X2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV40ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_32_13X2( true) ;
      }
      else
      {
         wb_table4_32_13X2( false) ;
      }
      return  ;
   }

   public void wb_table4_32_13X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_13X2e( true) ;
      }
      else
      {
         wb_table1_27_13X2e( false) ;
      }
   }

   public void wb_table4_32_13X2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV24FilterFullText, GXutil.rtrim( localUtil.format( AV24FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\TMCompraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_32_13X2e( true) ;
      }
      else
      {
         wb_table4_32_13X2e( false) ;
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
      pa13X2( ) ;
      ws13X2( ) ;
      we13X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613174", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmcompraww.js", "?20268211613174", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_55_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_55_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_55_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_55_idx ;
      edtMComCod_Internalname = "MCOMCOD_"+sGXsfl_55_idx ;
      edtMComExt_Internalname = "MCOMEXT_"+sGXsfl_55_idx ;
      cmbMComOri.setInternalname( "MCOMORI_"+sGXsfl_55_idx );
      cmbMComEst.setInternalname( "MCOMEST_"+sGXsfl_55_idx );
      edtMComFch_Internalname = "MCOMFCH_"+sGXsfl_55_idx ;
      edtMComSolFch_Internalname = "MCOMSOLFCH_"+sGXsfl_55_idx ;
      edtMComEntFch_Internalname = "MCOMENTFCH_"+sGXsfl_55_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_55_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_55_idx ;
      edtPrvNNom_Internalname = "PRVNNOM_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_55_fel_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_55_fel_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_55_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_55_fel_idx ;
      edtMComCod_Internalname = "MCOMCOD_"+sGXsfl_55_fel_idx ;
      edtMComExt_Internalname = "MCOMEXT_"+sGXsfl_55_fel_idx ;
      cmbMComOri.setInternalname( "MCOMORI_"+sGXsfl_55_fel_idx );
      cmbMComEst.setInternalname( "MCOMEST_"+sGXsfl_55_fel_idx );
      edtMComFch_Internalname = "MCOMFCH_"+sGXsfl_55_fel_idx ;
      edtMComSolFch_Internalname = "MCOMSOLFCH_"+sGXsfl_55_fel_idx ;
      edtMComEntFch_Internalname = "MCOMENTFCH_"+sGXsfl_55_fel_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_55_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_55_fel_idx ;
      edtPrvNNom_Internalname = "PRVNNOM_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb13X0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV23Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVEXPAND.CLICK."+sGXsfl_55_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV25Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV17DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+"e2713x2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV26GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV26GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV26GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_55_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV26GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMComCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComCod_Internalname,GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMComCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComExt_Internalname,GXutil.rtrim( A11045MComExt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbMComOri.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbMComOri.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MCOMORI_" + sGXsfl_55_idx ;
            cmbMComOri.setName( GXCCtl );
            cmbMComOri.setWebtags( "" );
            cmbMComOri.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            cmbMComOri.addItem("A", httpContext.getMessage( "Automático", ""), (short)(0));
            if ( cmbMComOri.getItemCount() > 0 )
            {
               A11050MComOri = cmbMComOri.getValidValue(A11050MComOri) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMComOri,cmbMComOri.getInternalname(),GXutil.rtrim( A11050MComOri),Integer.valueOf(1),cmbMComOri.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbMComOri.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbMComOri.setValue( GXutil.rtrim( A11050MComOri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComOri.getInternalname(), "Values", cmbMComOri.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbMComEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbMComEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MCOMEST_" + sGXsfl_55_idx ;
            cmbMComEst.setName( GXCCtl );
            cmbMComEst.setWebtags( "" );
            cmbMComEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbMComEst.addItem("C", httpContext.getMessage( "Confirmada", ""), (short)(0));
            cmbMComEst.addItem("E", httpContext.getMessage( "Enviada", ""), (short)(0));
            cmbMComEst.addItem("X", httpContext.getMessage( "Cancelada", ""), (short)(0));
            cmbMComEst.addItem("R", httpContext.getMessage( "Recibida", ""), (short)(0));
            if ( cmbMComEst.getItemCount() > 0 )
            {
               A11049MComEst = cmbMComEst.getValidValue(A11049MComEst) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMComEst,cmbMComEst.getInternalname(),GXutil.rtrim( A11049MComEst),Integer.valueOf(1),cmbMComEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbMComEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbMComEst.getColumnClass(),cmbMComEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbMComEst.setValue( GXutil.rtrim( A11049MComEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMComEst.getInternalname(), "Values", cmbMComEst.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMComFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComFch_Internalname,localUtil.format(A11046MComFch, "99/99/99"),localUtil.format( A11046MComFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMComFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMComSolFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComSolFch_Internalname,localUtil.format(A11047MComSolFch, "99/99/99"),localUtil.format( A11047MComSolFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComSolFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMComSolFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMComEntFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMComEntFch_Internalname,localUtil.format(A11048MComEntFch, "99/99/99"),localUtil.format( A11048MComEntFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMComEntFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMComEntFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNNom_Internalname,A13719PrvNNom,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes13X2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMComCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Compra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbMComOri.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Origen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbMComEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMComFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMComSolFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F. Solicitada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMComEntFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F. Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV23Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV25Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11045MComExt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11050MComOri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbMComOri.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11049MComEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbMComEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbMComEst.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbMComEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11046MComFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11047MComSolFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComSolFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11048MComEntFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMComEntFch_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", A13719PrvNNom);
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
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      edtavExpand_Internalname = "vEXPAND" ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMComCod_Internalname = "MCOMCOD" ;
      edtMComExt_Internalname = "MCOMEXT" ;
      cmbMComOri.setInternalname( "MCOMORI" );
      cmbMComEst.setInternalname( "MCOMEST" );
      edtMComFch_Internalname = "MCOMFCH" ;
      edtMComSolFch_Internalname = "MCOMSOLFCH" ;
      edtMComEntFch_Internalname = "MCOMENTFCH" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrvNNom_Internalname = "PRVNNOM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablegrids_Internalname = "TABLEGRIDS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_recibir_Internalname = "DVELOP_CONFIRMPANEL_RECIBIR" ;
      tblTabledvelop_confirmpanel_recibir_Internalname = "TABLEDVELOP_CONFIRMPANEL_RECIBIR" ;
      Dvelop_confirmpanel_cancelar_Internalname = "DVELOP_CONFIRMPANEL_CANCELAR" ;
      tblTabledvelop_confirmpanel_cancelar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CANCELAR" ;
      Grid_group_Internalname = "GRID_GROUP" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_mcomfchauxdate_Internalname = "vDDO_MCOMFCHAUXDATE" ;
      divDdo_mcomfchauxdates_Internalname = "DDO_MCOMFCHAUXDATES" ;
      edtavDdo_mcomsolfchauxdate_Internalname = "vDDO_MCOMSOLFCHAUXDATE" ;
      divDdo_mcomsolfchauxdates_Internalname = "DDO_MCOMSOLFCHAUXDATES" ;
      edtavDdo_mcomentfchauxdate_Internalname = "vDDO_MCOMENTFCHAUXDATE" ;
      divDdo_mcomentfchauxdates_Internalname = "DDO_MCOMENTFCHAUXDATES" ;
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
      edtPrvNNom_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtMComEntFch_Jsonclick = "" ;
      edtMComSolFch_Jsonclick = "" ;
      edtMComFch_Jsonclick = "" ;
      cmbMComEst.setJsonclick( "" );
      cmbMComEst.setColumnClass( "WWColumn hidden-xs" );
      cmbMComOri.setJsonclick( "" );
      edtMComExt_Jsonclick = "" ;
      edtMComCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavGrid_groupcaption_Jsonclick = "" ;
      edtavGrid_groupcaption_Visible = 0 ;
      edtavGrid_groupcaption_Enabled = 1 ;
      edtavExpand_Jsonclick = "" ;
      edtavExpand_Columnclass = "WWIconActionColumn" ;
      edtavExpand_Visible = 0 ;
      edtavExpand_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbMComEst.setColumnHeaderClass( "" );
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtMComEntFch_Visible = -1 ;
      edtMComSolFch_Visible = -1 ;
      edtMComFch_Visible = -1 ;
      cmbMComEst.setVisible( -1 );
      cmbMComOri.setVisible( -1 );
      edtMComCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_mcomentfchauxdate_Jsonclick = "" ;
      edtavDdo_mcomsolfchauxdate_Jsonclick = "" ;
      edtavDdo_mcomfchauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbMComEst.setDescription( "" );
      Grid_empowerer_Fixedcolumns = ";;;L;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_group_Columnindex = 1 ;
      Dvelop_confirmpanel_cancelar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cancelar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cancelar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cancelar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cancelar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cancelar_Confirmationtext = "¿Desea Cancelar la Compra?" ;
      Dvelop_confirmpanel_cancelar_Title = "" ;
      Dvelop_confirmpanel_recibir_Confirmtype = "1" ;
      Dvelop_confirmpanel_recibir_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_recibir_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_recibir_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_recibir_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_recibir_Confirmationtext = "¿Desea aplicar la accion de Recibir?" ;
      Dvelop_confirmpanel_recibir_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "MantenimientoMaquina.TMCompraWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|M:Manual,A:Automático|P:Pendiente,C:Confirmada,E:Enviada,X:Cancelada,R:Recibida|||||" ;
      Ddo_grid_Allowmultipleselection = "|T|T|||||" ;
      Ddo_grid_Datalisttype = "|FixedValues|FixedValues|||||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||||T" ;
      Ddo_grid_Filterisrange = "T||||||T|" ;
      Ddo_grid_Filtertype = "Numeric|||Date|Date|Date|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|||T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Allowgroup = "||||||T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "6:MComCod|8:MComOri|9:MComEst|10:MComFch|11:MComSolFch|12:MComEntFch|13:PrvNum|14:PrvNom" ;
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
      Form.setCaption( httpContext.getMessage( " Compras", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV26GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV26GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridActions), 4, 0));
      }
      GXCCtl = "MCOMORI_" + sGXsfl_55_idx ;
      cmbMComOri.setName( GXCCtl );
      cmbMComOri.setWebtags( "" );
      cmbMComOri.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbMComOri.addItem("A", httpContext.getMessage( "Automático", ""), (short)(0));
      if ( cmbMComOri.getItemCount() > 0 )
      {
         A11050MComOri = cmbMComOri.getValidValue(A11050MComOri) ;
      }
      GXCCtl = "MCOMEST_" + sGXsfl_55_idx ;
      cmbMComEst.setName( GXCCtl );
      cmbMComEst.setWebtags( "" );
      cmbMComEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbMComEst.addItem("C", httpContext.getMessage( "Confirmada", ""), (short)(0));
      cmbMComEst.addItem("E", httpContext.getMessage( "Enviada", ""), (short)(0));
      cmbMComEst.addItem("X", httpContext.getMessage( "Cancelada", ""), (short)(0));
      cmbMComEst.addItem("R", httpContext.getMessage( "Recibida", ""), (short)(0));
      if ( cmbMComEst.getItemCount() > 0 )
      {
         A11049MComEst = cmbMComEst.getValidValue(A11049MComEst) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1213X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1313X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1413X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedtext_get',ctrl:'DDO_GRID',prop:'SelectedText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2413X2',iparms:[{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbMComEst'},{av:'A11049MComEst',fld:'MCOMEST',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV23Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'AV17DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV26GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'cmbMComEst'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1513X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1113X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV36GroupPrvNum',fld:'vGROUPPRVNUM',pic:'ZZZZZ9'},{av:'AV81GroupPrvNom',fld:'vGROUPPRVNOM',pic:''},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2513X2',iparms:[{av:'cmbavGridactions'},{av:'AV26GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'cmbMComEst'},{av:'A11049MComEst',fld:'MCOMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV26GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECIBIR.CLOSE","{handler:'e1613X2',iparms:[{av:'Dvelop_confirmpanel_recibir_Result',ctrl:'DVELOP_CONFIRMPANEL_RECIBIR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECIBIR.CLOSE",",oparms:[{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CANCELAR.CLOSE","{handler:'e1713X2',iparms:[{av:'Dvelop_confirmpanel_cancelar_Result',ctrl:'DVELOP_CONFIRMPANEL_CANCELAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CANCELAR.CLOSE",",oparms:[{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1813X2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1913X2',iparms:[{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV36GroupPrvNum',fld:'vGROUPPRVNUM',pic:'ZZZZZ9'},{av:'AV81GroupPrvNom',fld:'vGROUPPRVNOM',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2013X2',iparms:[{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV36GroupPrvNum',fld:'vGROUPPRVNUM',pic:'ZZZZZ9'},{av:'AV81GroupPrvNom',fld:'vGROUPPRVNOM',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2113X2',iparms:[{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV60TFMComEst_SelsJson',fld:'vTFMCOMEST_SELSJSON',pic:''},{av:'AV66TFMComOri_SelsJson',fld:'vTFMCOMORI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV36GroupPrvNum',fld:'vGROUPPRVNUM',pic:'ZZZZZ9'},{av:'AV81GroupPrvNom',fld:'vGROUPPRVNOM',pic:''}]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e2613X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFMComCod',fld:'vTFMCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV56TFMComCod_To',fld:'vTFMCOMCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV65TFMComOri_Sels',fld:'vTFMCOMORI_SELS',pic:''},{av:'AV59TFMComEst_Sels',fld:'vTFMCOMEST_SELS',pic:''},{av:'AV63TFMComFch',fld:'vTFMCOMFCH',pic:''},{av:'AV67TFMComSolFch',fld:'vTFMCOMSOLFCH',pic:''},{av:'AV57TFMComEntFch',fld:'vTFMCOMENTFCH',pic:''},{av:'AV73TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV71TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV72TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'AV44OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV46OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV34GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV27GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV6AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV36GroupPrvNum',fld:'vGROUPPRVNUM',pic:'ZZZZZ9'},{av:'AV81GroupPrvNom',fld:'vGROUPPRVNOM',pic:''},{av:'AV28GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV7ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMComCod_Visible',ctrl:'MCOMCOD',prop:'Visible'},{av:'cmbMComOri'},{av:'cmbMComEst'},{av:'edtMComFch_Visible',ctrl:'MCOMFCH',prop:'Visible'},{av:'edtMComSolFch_Visible',ctrl:'MCOMSOLFCH',prop:'Visible'},{av:'edtMComEntFch_Visible',ctrl:'MCOMENTFCH',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'AV29GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV30GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV40ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV31GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2713X2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MCOMCOD","{handler:'valid_Mcomcod',iparms:[]");
      setEventMetadata("VALID_MCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_MCOMORI","{handler:'valid_Mcomori',iparms:[]");
      setEventMetadata("VALID_MCOMORI",",oparms:[]}");
      setEventMetadata("VALID_MCOMEST","{handler:'valid_Mcomest',iparms:[]");
      setEventMetadata("VALID_MCOMEST",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prvnnom',iparms:[]");
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
      Ddo_grid_Selectedtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_recibir_Result = "" ;
      Dvelop_confirmpanel_cancelar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24FilterFullText = "" ;
      AV65TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV63TFMComFch = GXutil.nullDate() ;
      AV67TFMComSolFch = GXutil.nullDate() ;
      AV57TFMComEntFch = GXutil.nullDate() ;
      AV71TFPrvNom = "" ;
      AV72TFPrvNom_Sel = "" ;
      AV84Pgmname = "" ;
      AV33GroupBy = "" ;
      AV27GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34GroupKey = "" ;
      AV28GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV40ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66TFMComOri_SelsJson = "" ;
      AV60TFMComEst_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_group_Gridinternalname = "" ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV12DDO_MComFchAuxDate = GXutil.nullDate() ;
      AV14DDO_MComSolFchAuxDate = GXutil.nullDate() ;
      AV10DDO_MComEntFchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Expand = "" ;
      AV25Grid_GroupCaption = "" ;
      AV17DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A11045MComExt = "" ;
      A11050MComOri = "" ;
      A11049MComEst = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      A794PrvNom = "" ;
      A13719PrvNNom = "" ;
      AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = "" ;
      AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch = GXutil.nullDate() ;
      AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch = GXutil.nullDate() ;
      AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch = GXutil.nullDate() ;
      AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = "" ;
      AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel = "" ;
      scmdbuf = "" ;
      lV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext = "" ;
      lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom = "" ;
      H013X2_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X2_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X2_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X2_A11049MComEst = new String[] {""} ;
      H013X2_A11050MComOri = new String[] {""} ;
      H013X2_A11045MComExt = new String[] {""} ;
      H013X2_A11055MComCod = new long[1] ;
      H013X2_A407EmprNom = new String[] {""} ;
      H013X2_n407EmprNom = new boolean[] {false} ;
      H013X2_A396EmprCod = new String[] {""} ;
      H013X2_A794PrvNom = new String[] {""} ;
      H013X2_n794PrvNom = new boolean[] {false} ;
      H013X2_A795PrvNum = new int[1] ;
      H013X2_n795PrvNum = new boolean[] {false} ;
      H013X3_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X3_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X3_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X3_A11049MComEst = new String[] {""} ;
      H013X3_A11050MComOri = new String[] {""} ;
      H013X3_A11045MComExt = new String[] {""} ;
      H013X3_A11055MComCod = new long[1] ;
      H013X3_A407EmprNom = new String[] {""} ;
      H013X3_n407EmprNom = new boolean[] {false} ;
      H013X3_A396EmprCod = new String[] {""} ;
      H013X3_A794PrvNom = new String[] {""} ;
      H013X3_n794PrvNom = new boolean[] {false} ;
      H013X3_A795PrvNum = new int[1] ;
      H013X3_n795PrvNum = new boolean[] {false} ;
      hsh = "" ;
      AV50Station = "" ;
      AV20EmprNom = "" ;
      AV78UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV37HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV79WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV9ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV42ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV77UserCustomValue = "" ;
      AV8ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV98Emprcod_selected = "" ;
      GXv_int14 = new long[1] ;
      GXv_int15 = new int[1] ;
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      AV43OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV75TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV81GroupPrvNom = "" ;
      H013X4_A794PrvNom = new String[] {""} ;
      H013X4_n794PrvNom = new boolean[] {false} ;
      H013X4_A795PrvNum = new int[1] ;
      H013X4_n795PrvNum = new boolean[] {false} ;
      H013X4_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X4_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X4_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H013X4_A11055MComCod = new long[1] ;
      H013X4_A11049MComEst = new String[] {""} ;
      H013X4_A11050MComOri = new String[] {""} ;
      H013X4_A396EmprCod = new String[] {""} ;
      AV48RecordKey = "" ;
      ucDvelop_confirmpanel_cancelar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_recibir = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcompraww__default(),
         new Object[] {
             new Object[] {
            H013X2_A11048MComEntFch, H013X2_A11047MComSolFch, H013X2_A11046MComFch, H013X2_A11049MComEst, H013X2_A11050MComOri, H013X2_A11045MComExt, H013X2_A11055MComCod, H013X2_A407EmprNom, H013X2_n407EmprNom, H013X2_A396EmprCod,
            H013X2_A794PrvNom, H013X2_n794PrvNom, H013X2_A795PrvNum, H013X2_n795PrvNum
            }
            , new Object[] {
            H013X3_A11048MComEntFch, H013X3_A11047MComSolFch, H013X3_A11046MComFch, H013X3_A11049MComEst, H013X3_A11050MComOri, H013X3_A11045MComExt, H013X3_A11055MComCod, H013X3_A407EmprNom, H013X3_n407EmprNom, H013X3_A396EmprCod,
            H013X3_A794PrvNom, H013X3_n794PrvNom, H013X3_A795PrvNum, H013X3_n795PrvNum
            }
            , new Object[] {
            H013X4_A794PrvNom, H013X4_n794PrvNom, H013X4_A795PrvNum, H013X4_n795PrvNum, H013X4_A11048MComEntFch, H013X4_A11047MComSolFch, H013X4_A11046MComFch, H013X4_A11055MComCod, H013X4_A11049MComEst, H013X4_A11050MComOri,
            H013X4_A396EmprCod
            }
         }
      );
      AV84Pgmname = "MantenimientoMaquina.TMCompraWW" ;
      /* GeneXus formulas. */
      AV84Pgmname = "MantenimientoMaquina.TMCompraWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV5Acabats2013 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV44OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV26GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int AV73TFPrvNum ;
   private int AV74TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum ;
   private int AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to ;
   private int AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size ;
   private int AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size ;
   private int AV28GridCollapsedRecordsChildren_size ;
   private int edtMComCod_Visible ;
   private int edtMComFch_Visible ;
   private int edtMComSolFch_Visible ;
   private int edtMComEntFch_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int AV47PageToGo ;
   private int AV97GXV1 ;
   private int GXv_int15[] ;
   private int AV100GXV2 ;
   private int AV101GXV3 ;
   private int AV36GroupPrvNum ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavExpand_Visible ;
   private int edtavGrid_groupcaption_Visible ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV55TFMComCod ;
   private long AV56TFMComCod_To ;
   private long AV29GridCurrentPage ;
   private long AV30GridPageCount ;
   private long A11055MComCod ;
   private long GRID_nCurrentRecord ;
   private long AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod ;
   private long AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to ;
   private long GRID_nRecordCount ;
   private long AV38Index ;
   private long AV99Mcomcod_selected ;
   private long GXv_int14[] ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_recibir_Result ;
   private String Dvelop_confirmpanel_cancelar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_55_idx="0001" ;
   private String AV71TFPrvNom ;
   private String AV72TFPrvNom_Sel ;
   private String AV84Pgmname ;
   private String AV19EmprCod ;
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
   private String Ddo_grid_Allowgroup ;
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
   private String Dvelop_confirmpanel_recibir_Title ;
   private String Dvelop_confirmpanel_recibir_Confirmationtext ;
   private String Dvelop_confirmpanel_recibir_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_recibir_Nobuttoncaption ;
   private String Dvelop_confirmpanel_recibir_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_recibir_Yesbuttonposition ;
   private String Dvelop_confirmpanel_recibir_Confirmtype ;
   private String Dvelop_confirmpanel_cancelar_Title ;
   private String Dvelop_confirmpanel_cancelar_Confirmationtext ;
   private String Dvelop_confirmpanel_cancelar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cancelar_Confirmtype ;
   private String Grid_group_Gridinternalname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divTablegrids_Internalname ;
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
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_mcomfchauxdates_Internalname ;
   private String edtavDdo_mcomfchauxdate_Internalname ;
   private String edtavDdo_mcomfchauxdate_Jsonclick ;
   private String divDdo_mcomsolfchauxdates_Internalname ;
   private String edtavDdo_mcomsolfchauxdate_Internalname ;
   private String edtavDdo_mcomsolfchauxdate_Jsonclick ;
   private String divDdo_mcomentfchauxdates_Internalname ;
   private String edtavDdo_mcomentfchauxdate_Internalname ;
   private String edtavDdo_mcomentfchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV23Expand ;
   private String edtavExpand_Internalname ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV17DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtMComCod_Internalname ;
   private String A11045MComExt ;
   private String edtMComExt_Internalname ;
   private String A11050MComOri ;
   private String A11049MComEst ;
   private String edtMComFch_Internalname ;
   private String edtMComSolFch_Internalname ;
   private String edtMComEntFch_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPrvNNom_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ;
   private String AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ;
   private String hsh ;
   private String AV50Station ;
   private String AV20EmprNom ;
   private String AV78UsurCod ;
   private String edtavExpand_Columnclass ;
   private String AV98Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String AV81GroupPrvNom ;
   private String tblTabledvelop_confirmpanel_cancelar_Internalname ;
   private String Dvelop_confirmpanel_cancelar_Internalname ;
   private String tblTabledvelop_confirmpanel_recibir_Internalname ;
   private String Dvelop_confirmpanel_recibir_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavExpand_Jsonclick ;
   private String edtavGrid_groupcaption_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtMComCod_Jsonclick ;
   private String edtMComExt_Jsonclick ;
   private String edtMComFch_Jsonclick ;
   private String edtMComSolFch_Jsonclick ;
   private String edtMComEntFch_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvNNom_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV63TFMComFch ;
   private java.util.Date AV67TFMComSolFch ;
   private java.util.Date AV57TFMComEntFch ;
   private java.util.Date AV12DDO_MComFchAuxDate ;
   private java.util.Date AV14DDO_MComSolFchAuxDate ;
   private java.util.Date AV10DDO_MComEntFchAuxDate ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private java.util.Date AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ;
   private java.util.Date AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ;
   private java.util.Date AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV46OrderedDsc ;
   private boolean AV6AddChildren ;
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
   private boolean Grid_empowerer_Hasrowgroups ;
   private boolean wbLoad ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n795PrvNum ;
   private boolean n794PrvNom ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean AV18DiscardFirst ;
   private String AV66TFMComOri_SelsJson ;
   private String AV60TFMComEst_SelsJson ;
   private String AV9ColumnsSelectorXML ;
   private String AV42ManageFiltersXml ;
   private String AV77UserCustomValue ;
   private String AV24FilterFullText ;
   private String AV33GroupBy ;
   private String AV34GroupKey ;
   private String AV25Grid_GroupCaption ;
   private String A13719PrvNNom ;
   private String AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ;
   private String lV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ;
   private String AV22ExcelFilename ;
   private String AV21ErrorMessage ;
   private String AV48RecordKey ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV37HTTPRequest ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cancelar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_recibir ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbMComOri ;
   private HTMLChoice cmbMComEst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H013X2_A11048MComEntFch ;
   private java.util.Date[] H013X2_A11047MComSolFch ;
   private java.util.Date[] H013X2_A11046MComFch ;
   private String[] H013X2_A11049MComEst ;
   private String[] H013X2_A11050MComOri ;
   private String[] H013X2_A11045MComExt ;
   private long[] H013X2_A11055MComCod ;
   private String[] H013X2_A407EmprNom ;
   private boolean[] H013X2_n407EmprNom ;
   private String[] H013X2_A396EmprCod ;
   private String[] H013X2_A794PrvNom ;
   private boolean[] H013X2_n794PrvNom ;
   private int[] H013X2_A795PrvNum ;
   private boolean[] H013X2_n795PrvNum ;
   private java.util.Date[] H013X3_A11048MComEntFch ;
   private java.util.Date[] H013X3_A11047MComSolFch ;
   private java.util.Date[] H013X3_A11046MComFch ;
   private String[] H013X3_A11049MComEst ;
   private String[] H013X3_A11050MComOri ;
   private String[] H013X3_A11045MComExt ;
   private long[] H013X3_A11055MComCod ;
   private String[] H013X3_A407EmprNom ;
   private boolean[] H013X3_n407EmprNom ;
   private String[] H013X3_A396EmprCod ;
   private String[] H013X3_A794PrvNom ;
   private boolean[] H013X3_n794PrvNom ;
   private int[] H013X3_A795PrvNum ;
   private boolean[] H013X3_n795PrvNum ;
   private String[] H013X4_A794PrvNom ;
   private boolean[] H013X4_n794PrvNom ;
   private int[] H013X4_A795PrvNum ;
   private boolean[] H013X4_n795PrvNum ;
   private java.util.Date[] H013X4_A11048MComEntFch ;
   private java.util.Date[] H013X4_A11047MComSolFch ;
   private java.util.Date[] H013X4_A11046MComFch ;
   private long[] H013X4_A11055MComCod ;
   private String[] H013X4_A11049MComEst ;
   private String[] H013X4_A11050MComOri ;
   private String[] H013X4_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV65TFMComOri_Sels ;
   private GXSimpleCollection<String> AV59TFMComEst_Sels ;
   private GXSimpleCollection<String> AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ;
   private GXSimpleCollection<String> AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ;
   private GXSimpleCollection<String> AV27GridCollapsedRecords ;
   private GXSimpleCollection<String> AV28GridCollapsedRecordsChildren ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV40ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV43OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV75TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV79WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class tmcompraww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H013X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                          long AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod ,
                                          long AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to ,
                                          int AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size ,
                                          int AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size ,
                                          java.util.Date AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                          java.util.Date AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                          java.util.Date AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                          int AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum ,
                                          int AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to ,
                                          String AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                          String AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                          long A11055MComCod ,
                                          java.util.Date A11046MComFch ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV44OrderedBy ,
                                          boolean AV46OrderedDsc ,
                                          String AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ,
                                          int AV28GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV28GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[9];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.MComEntFch, T1.MComSolFch, T1.MComFch, T1.MComEst, T1.MComOri, T1.MComExt, T1.MComCod, T2.EmprNom, T1.EmprCod, T3.PrvNom, T1.PrvNum FROM ((TXPMRepCo T1" ;
      scmdbuf += " INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      if ( ! (0==AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      if ( AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV44OrderedBy == 1 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComCod" ;
      }
      else if ( ( AV44OrderedBy == 1 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComCod DESC" ;
      }
      else if ( ( AV44OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComOri" ;
      }
      else if ( ( AV44OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComOri DESC" ;
      }
      else if ( ( AV44OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEst" ;
      }
      else if ( ( AV44OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEst DESC" ;
      }
      else if ( ( AV44OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComFch" ;
      }
      else if ( ( AV44OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComSolFch" ;
      }
      else if ( ( AV44OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComSolFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 6 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEntFch" ;
      }
      else if ( ( AV44OrderedBy == 6 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEntFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 7 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV44OrderedBy == 7 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV44OrderedBy == 8 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV44OrderedBy == 8 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H013X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                          long AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod ,
                                          long AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to ,
                                          int AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size ,
                                          int AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size ,
                                          java.util.Date AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                          java.util.Date AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                          java.util.Date AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                          int AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum ,
                                          int AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to ,
                                          String AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                          String AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                          long A11055MComCod ,
                                          java.util.Date A11046MComFch ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV44OrderedBy ,
                                          boolean AV46OrderedDsc ,
                                          String AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext ,
                                          int AV28GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV28GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[9];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.MComEntFch, T1.MComSolFch, T1.MComFch, T1.MComEst, T1.MComOri, T1.MComExt, T1.MComCod, T2.EmprNom, T1.EmprCod, T3.PrvNom, T1.PrvNum FROM ((TXPMRepCo T1" ;
      scmdbuf += " INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int22[0] = (byte)(1) ;
      }
      if ( ! (0==AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      if ( AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (0==AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV44OrderedBy == 1 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComCod" ;
      }
      else if ( ( AV44OrderedBy == 1 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComCod DESC" ;
      }
      else if ( ( AV44OrderedBy == 2 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComOri" ;
      }
      else if ( ( AV44OrderedBy == 2 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComOri DESC" ;
      }
      else if ( ( AV44OrderedBy == 3 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEst" ;
      }
      else if ( ( AV44OrderedBy == 3 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEst DESC" ;
      }
      else if ( ( AV44OrderedBy == 4 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComFch" ;
      }
      else if ( ( AV44OrderedBy == 4 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 5 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComSolFch" ;
      }
      else if ( ( AV44OrderedBy == 5 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComSolFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 6 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEntFch" ;
      }
      else if ( ( AV44OrderedBy == 6 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEntFch DESC" ;
      }
      else if ( ( AV44OrderedBy == 7 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV44OrderedBy == 7 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV44OrderedBy == 8 ) && ! AV46OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV44OrderedBy == 8 ) && ( AV46OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H013X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels ,
                                          long AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod ,
                                          long AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to ,
                                          int AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size ,
                                          int AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size ,
                                          java.util.Date AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch ,
                                          java.util.Date AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch ,
                                          java.util.Date AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch ,
                                          int AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum ,
                                          int AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to ,
                                          String AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel ,
                                          String AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom ,
                                          String AV33GroupBy ,
                                          int AV36GroupPrvNum ,
                                          String AV81GroupPrvNom ,
                                          long A11055MComCod ,
                                          java.util.Date A11046MComFch ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String AV85Mantenimientomaquina_tmcomprawwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[11];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T2.PrvNom, T1.PrvNum, T1.MComEntFch, T1.MComSolFch, T1.MComFch, T1.MComCod, T1.MComEst, T1.MComOri, T1.EmprCod FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV86Mantenimientomaquina_tmcomprawwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int25[0] = (byte)(1) ;
      }
      if ( ! (0==AV87Mantenimientomaquina_tmcomprawwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
      }
      if ( AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV88Mantenimientomaquina_tmcomprawwds_4_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      if ( AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV89Mantenimientomaquina_tmcomprawwds_5_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Mantenimientomaquina_tmcomprawwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_tmcomprawwds_7_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Mantenimientomaquina_tmcomprawwds_8_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_tmcomprawwds_9_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV94Mantenimientomaquina_tmcomprawwds_10_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmcomprawwds_11_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmcomprawwds_12_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV33GroupBy, "PrvNum") == 0 ) && (0==AV36GroupPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum IS NULL)");
      }
      if ( ( GXutil.strcmp(AV33GroupBy, "PrvNum") == 0 ) && ! (0==AV36GroupPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV33GroupBy, "PrvNom") == 0 ) && (GXutil.strcmp("", AV81GroupPrvNom)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom IS NULL)");
      }
      if ( ( GXutil.strcmp(AV33GroupBy, "PrvNom") == 0 ) && ! (GXutil.strcmp("", AV81GroupPrvNom)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H013X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (GXSimpleCollection<String>)dynConstraints[26] );
            case 1 :
                  return conditional_H013X3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (GXSimpleCollection<String>)dynConstraints[26] );
            case 2 :
                  return conditional_H013X4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H013X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((long[]) buf[7])[0] = rslt.getLong(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
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
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               return;
      }
   }

}

