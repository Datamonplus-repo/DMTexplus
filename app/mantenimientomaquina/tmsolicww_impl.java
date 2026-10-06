package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmsolicww_impl extends GXDataArea
{
   public tmsolicww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmsolicww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmsolicww_impl.class ));
   }

   public tmsolicww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbSMEst = new HTMLChoice();
      cmbavSmcal = new HTMLChoice();
      cmbSMCal = new HTMLChoice();
      cmbavOmest = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InModo") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InModo") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InModo") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV91InModo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91InModo", AV91InModo);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91InModo, ""))));
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
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV8ColumnsSelector);
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV39TFSMCod = (int)(GXutil.lval( httpContext.GetPar( "TFSMCod"))) ;
      AV40TFSMCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFSMCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV43TFSMEst_Sels);
      AV45TFSMFchCre = localUtil.parseDTimeParm( httpContext.GetPar( "TFSMFchCre")) ;
      AV55TFSMUsuCre = httpContext.GetPar( "TFSMUsuCre") ;
      AV56TFSMUsuCre_Sel = httpContext.GetPar( "TFSMUsuCre_Sel") ;
      AV47TFSMMaqCod = httpContext.GetPar( "TFSMMaqCod") ;
      AV48TFSMMaqCod_Sel = httpContext.GetPar( "TFSMMaqCod_Sel") ;
      AV51TFSMPri = (byte)(GXutil.lval( httpContext.GetPar( "TFSMPri"))) ;
      AV52TFSMPri_To = (byte)(GXutil.lval( httpContext.GetPar( "TFSMPri_To"))) ;
      AV41TFSMDsc = httpContext.GetPar( "TFSMDsc") ;
      AV42TFSMDsc_Sel = httpContext.GetPar( "TFSMDsc_Sel") ;
      AV49TFSMMaqDsc = httpContext.GetPar( "TFSMMaqDsc") ;
      AV50TFSMMaqDsc_Sel = httpContext.GetPar( "TFSMMaqDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV37TFSMCal_Sels);
      AV53TFSMTxt = httpContext.GetPar( "TFSMTxt") ;
      AV54TFSMTxt_Sel = httpContext.GetPar( "TFSMTxt_Sel") ;
      AV30Modo = httpContext.GetPar( "Modo") ;
      AV94Pgmname = httpContext.GetPar( "Pgmname") ;
      AV31OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV33OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV91InModo = httpContext.GetPar( "InModo") ;
      AV76GroupBy = httpContext.GetPar( "GroupBy") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV81GridCollapsedRecords);
      AV78GroupKey = httpContext.GetPar( "GroupKey") ;
      A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
      A9445OMEst = httpContext.GetPar( "OMEst") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV80GridCollapsedRecordsChildren);
      AV15EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
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
      paLF2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startLF2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmsolicww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV91InModo))}, new String[] {"InModo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Modo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91InModo, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMSolicWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmsolicww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMCOD", GXutil.ltrim( localUtil.ntoc( AV39TFSMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV40TFSMCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSMEST_SELS", AV43TFSMEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSMEST_SELS", AV43TFSMEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMFCHCRE", localUtil.ttoc( AV45TFSMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMUSUCRE", GXutil.rtrim( AV55TFSMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMUSUCRE_SEL", GXutil.rtrim( AV56TFSMUsuCre_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMMAQCOD", GXutil.rtrim( AV47TFSMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMMAQCOD_SEL", GXutil.rtrim( AV48TFSMMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMPRI", GXutil.ltrim( localUtil.ntoc( AV51TFSMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMPRI_TO", GXutil.ltrim( localUtil.ntoc( AV52TFSMPri_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMDSC", GXutil.rtrim( AV41TFSMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMDSC_SEL", GXutil.rtrim( AV42TFSMDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMMAQDSC", GXutil.rtrim( AV49TFSMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMMAQDSC_SEL", GXutil.rtrim( AV50TFSMMaqDsc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSMCAL_SELS", AV37TFSMCal_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSMCAL_SELS", AV37TFSMCal_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMTXT", AV53TFSMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMTXT_SEL", AV54TFSMTxt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV30Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Modo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV31OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV33OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vINMODO", GXutil.rtrim( AV91InModo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91InModo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPBY", AV76GroupBy);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDS", AV81GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDS", AV81GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPKEY", AV78GroupKey);
      app.GxWebStd.gx_hidden_field( httpContext, "OMCOD", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMEST", GXutil.rtrim( A9445OMEst));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDSCHILDREN", AV80GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDSCHILDREN", AV80GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV23GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV23GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMEST_SELSJSON", AV44TFSMEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMCAL_SELSJSON", AV38TFSMCal_SelsJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vADDCHILDREN", AV85AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
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
         weLF2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtLF2( ) ;
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
      return formatLink("app.mantenimientomaquina.tmsolicww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV91InModo))}, new String[] {"InModo"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMSolicWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Solicitudes de Mantenimiento", "") ;
   }

   public void wbLF0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, bttBtninsert_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_LF2( true) ;
      }
      else
      {
         wb_table1_25_LF2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_LF2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0068"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0068"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0068"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV94Pgmname), GXutil.rtrim( localUtil.format( AV94Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolicWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV8ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_smfchcreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_smfchcreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_smfchcreauxdate_Internalname, localUtil.format(AV11DDO_SMFchCreAuxDate, "99/99/99"), localUtil.format( AV11DDO_SMFchCreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_smfchcreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_smfchcreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMSolicWW.htm");
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

   public void startLF2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Solicitudes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupLF0( ) ;
   }

   public void wsLF2( )
   {
      startLF2( ) ;
      evtLF2( ) ;
   }

   public void evtLF2( )
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
                           e11LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17LF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18LF2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "'DOGENERARORDENES'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV86Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV86Expand);
                           AV75Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
                           AV74DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV74DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV73GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9428SMCod = false ;
                           cmbSMEst.setName( cmbSMEst.getInternalname() );
                           cmbSMEst.setValue( httpContext.cgiGet( cmbSMEst.getInternalname()) );
                           A9522SMEst = httpContext.cgiGet( cmbSMEst.getInternalname()) ;
                           n9522SMEst = false ;
                           A9518SMFchCre = localUtil.ctot( httpContext.cgiGet( edtSMFchCre_Internalname), 0) ;
                           n9518SMFchCre = false ;
                           A9519SMUsuCre = GXutil.upper( httpContext.cgiGet( edtSMUsuCre_Internalname)) ;
                           n9519SMUsuCre = false ;
                           A9520SMMaqCod = httpContext.cgiGet( edtSMMaqCod_Internalname) ;
                           n9520SMMaqCod = false ;
                           A11534SMPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtSMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9517SMDsc = httpContext.cgiGet( edtSMDsc_Internalname) ;
                           n9517SMDsc = false ;
                           A9521SMMaqDsc = httpContext.cgiGet( edtSMMaqDsc_Internalname) ;
                           n9521SMMaqDsc = false ;
                           cmbavSmcal.setName( cmbavSmcal.getInternalname() );
                           cmbavSmcal.setValue( httpContext.cgiGet( cmbavSmcal.getInternalname()) );
                           AV5SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbavSmcal.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavSmcal.getInternalname(), GXutil.str( AV5SMCal, 1, 0));
                           cmbSMCal.setName( cmbSMCal.getInternalname() );
                           cmbSMCal.setValue( httpContext.cgiGet( cmbSMCal.getInternalname()) );
                           A9524SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbSMCal.getInternalname()))) ;
                           n9524SMCal = false ;
                           A9523SMTxt = httpContext.cgiGet( edtSMTxt_Internalname) ;
                           n9523SMTxt = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCOD");
                              GX_FocusControl = edtavOmcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV88OMCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavOmcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88OMCod), 8, 0));
                           }
                           else
                           {
                              AV88OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavOmcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88OMCod), 8, 0));
                           }
                           cmbavOmest.setName( cmbavOmest.getInternalname() );
                           cmbavOmest.setValue( httpContext.cgiGet( cmbavOmest.getInternalname()) );
                           AV89OMEst = httpContext.cgiGet( cmbavOmest.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavOmest.getInternalname(), AV89OMEst);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19LF2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20LF2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21LF2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22LF2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23LF2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOGENERARORDENES'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoGenerarOrdenes' */
                                 e24LF2 ();
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
                     if ( nCmpId == 68 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0068") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0068", "", sEvt);
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

   public void weLF2( )
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

   public void paLF2( )
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
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ,
                                 String AV19FilterFullText ,
                                 int AV39TFSMCod ,
                                 int AV40TFSMCod_To ,
                                 GXSimpleCollection<String> AV43TFSMEst_Sels ,
                                 java.util.Date AV45TFSMFchCre ,
                                 String AV55TFSMUsuCre ,
                                 String AV56TFSMUsuCre_Sel ,
                                 String AV47TFSMMaqCod ,
                                 String AV48TFSMMaqCod_Sel ,
                                 byte AV51TFSMPri ,
                                 byte AV52TFSMPri_To ,
                                 String AV41TFSMDsc ,
                                 String AV42TFSMDsc_Sel ,
                                 String AV49TFSMMaqDsc ,
                                 String AV50TFSMMaqDsc_Sel ,
                                 GXSimpleCollection<Byte> AV37TFSMCal_Sels ,
                                 String AV53TFSMTxt ,
                                 String AV54TFSMTxt_Sel ,
                                 String AV30Modo ,
                                 String AV94Pgmname ,
                                 short AV31OrderedBy ,
                                 boolean AV33OrderedDsc ,
                                 String AV91InModo ,
                                 String AV76GroupBy ,
                                 GXSimpleCollection<String> AV81GridCollapsedRecords ,
                                 String AV78GroupKey ,
                                 int A9425OMCod ,
                                 String A9445OMEst ,
                                 GXSimpleCollection<String> AV80GridCollapsedRecordsChildren ,
                                 String AV15EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20LF2 ();
      GRID_nCurrentRecord = 0 ;
      rfLF2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMSolicWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmsolicww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfLF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV94Pgmname = "MantenimientoMaquina.TMSolicWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavOmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavOmest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavOmest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavOmest.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ,
                                           Integer.valueOf(AV80GridCollapsedRecordsChildren.size()) ,
                                           A396EmprCod ,
                                           AV80GridCollapsedRecordsChildren } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor H00LF2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9428SMCod = H00LF2_A9428SMCod[0] ;
         n9428SMCod = H00LF2_n9428SMCod[0] ;
         A396EmprCod = H00LF2_A396EmprCod[0] ;
         A9523SMTxt = H00LF2_A9523SMTxt[0] ;
         n9523SMTxt = H00LF2_n9523SMTxt[0] ;
         A9524SMCal = H00LF2_A9524SMCal[0] ;
         n9524SMCal = H00LF2_n9524SMCal[0] ;
         A9521SMMaqDsc = H00LF2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = H00LF2_n9521SMMaqDsc[0] ;
         A9517SMDsc = H00LF2_A9517SMDsc[0] ;
         n9517SMDsc = H00LF2_n9517SMDsc[0] ;
         A11534SMPri = H00LF2_A11534SMPri[0] ;
         A9520SMMaqCod = H00LF2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = H00LF2_n9520SMMaqCod[0] ;
         A9519SMUsuCre = H00LF2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = H00LF2_n9519SMUsuCre[0] ;
         A9518SMFchCre = H00LF2_A9518SMFchCre[0] ;
         n9518SMFchCre = H00LF2_n9518SMFchCre[0] ;
         A9522SMEst = H00LF2_A9522SMEst[0] ;
         n9522SMEst = H00LF2_n9522SMEst[0] ;
         A407EmprNom = H00LF2_A407EmprNom[0] ;
         n407EmprNom = H00LF2_n407EmprNom[0] ;
         A407EmprNom = H00LF2_A407EmprNom[0] ;
         n407EmprNom = H00LF2_n407EmprNom[0] ;
         A9521SMMaqDsc = H00LF2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = H00LF2_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente generación", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "generada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "G") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "pendiente calificacion", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "terminada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "T") == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pesima", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( "mala", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( "aceptable", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( "satisfactorio", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( "excelente", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ( AV80GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9428SMCod, 8, 0)), AV80GridCollapsedRecordsChildren) ) )
            {
               if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
               {
                  GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfLF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20LF2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A9522SMEst ,
                                              AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                              Byte.valueOf(A9524SMCal) ,
                                              AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                              Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                              Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                              Integer.valueOf(AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                              AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                              AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                              AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                              AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                              AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                              Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                              Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                              AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                              AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                              AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                              AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                              Integer.valueOf(AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                              AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                              AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                              Integer.valueOf(A9428SMCod) ,
                                              A9518SMFchCre ,
                                              A9519SMUsuCre ,
                                              A9520SMMaqCod ,
                                              Byte.valueOf(A11534SMPri) ,
                                              A9517SMDsc ,
                                              A9521SMMaqDsc ,
                                              A9523SMTxt ,
                                              Short.valueOf(AV31OrderedBy) ,
                                              Boolean.valueOf(AV33OrderedDsc) ,
                                              AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ,
                                              Integer.valueOf(AV80GridCollapsedRecordsChildren.size()) ,
                                              A396EmprCod ,
                                              AV80GridCollapsedRecordsChildren } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING
                                              }
         });
         lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
         lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
         lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
         lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
         lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
         /* Using cursor H00LF3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9428SMCod = H00LF3_A9428SMCod[0] ;
            n9428SMCod = H00LF3_n9428SMCod[0] ;
            A396EmprCod = H00LF3_A396EmprCod[0] ;
            A9523SMTxt = H00LF3_A9523SMTxt[0] ;
            n9523SMTxt = H00LF3_n9523SMTxt[0] ;
            A9524SMCal = H00LF3_A9524SMCal[0] ;
            n9524SMCal = H00LF3_n9524SMCal[0] ;
            A9521SMMaqDsc = H00LF3_A9521SMMaqDsc[0] ;
            n9521SMMaqDsc = H00LF3_n9521SMMaqDsc[0] ;
            A9517SMDsc = H00LF3_A9517SMDsc[0] ;
            n9517SMDsc = H00LF3_n9517SMDsc[0] ;
            A11534SMPri = H00LF3_A11534SMPri[0] ;
            A9520SMMaqCod = H00LF3_A9520SMMaqCod[0] ;
            n9520SMMaqCod = H00LF3_n9520SMMaqCod[0] ;
            A9519SMUsuCre = H00LF3_A9519SMUsuCre[0] ;
            n9519SMUsuCre = H00LF3_n9519SMUsuCre[0] ;
            A9518SMFchCre = H00LF3_A9518SMFchCre[0] ;
            n9518SMFchCre = H00LF3_n9518SMFchCre[0] ;
            A9522SMEst = H00LF3_A9522SMEst[0] ;
            n9522SMEst = H00LF3_n9522SMEst[0] ;
            A407EmprNom = H00LF3_A407EmprNom[0] ;
            n407EmprNom = H00LF3_n407EmprNom[0] ;
            A407EmprNom = H00LF3_A407EmprNom[0] ;
            n407EmprNom = H00LF3_n407EmprNom[0] ;
            A9521SMMaqDsc = H00LF3_A9521SMMaqDsc[0] ;
            n9521SMMaqDsc = H00LF3_n9521SMMaqDsc[0] ;
            if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente generación", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "generada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "G") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "pendiente calificacion", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "terminada", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, "T") == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pesima", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( "mala", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( "aceptable", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( "satisfactorio", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( "excelente", "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ( AV80GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9428SMCod, 8, 0)), AV80GridCollapsedRecordsChildren) ) )
               {
                  if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
                  {
                     e21LF2 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wbLF0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesLF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV30Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Modo, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
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
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV94Pgmname = "MantenimientoMaquina.TMSolicWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavOmcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      cmbavOmest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavOmest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavOmest.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupLF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19LF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV8ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
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
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_smfchcreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_SMFCHCREAUXDATE");
            GX_FocusControl = edtavDdo_smfchcreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11DDO_SMFchCreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11DDO_SMFchCreAuxDate", localUtil.format(AV11DDO_SMFchCreAuxDate, "99/99/99"));
         }
         else
         {
            AV11DDO_SMFchCreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_smfchcreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11DDO_SMFchCreAuxDate", localUtil.format(AV11DDO_SMFchCreAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_43_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         if ( nGXsfl_43_idx > 0 )
         {
            AV86Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV86Expand);
            AV75Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
            AV74DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV74DetailWebComponent);
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV73GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActions), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9428SMCod = false ;
            cmbSMEst.setName( cmbSMEst.getInternalname() );
            cmbSMEst.setValue( httpContext.cgiGet( cmbSMEst.getInternalname()) );
            A9522SMEst = httpContext.cgiGet( cmbSMEst.getInternalname()) ;
            n9522SMEst = false ;
            A9518SMFchCre = localUtil.ctot( httpContext.cgiGet( edtSMFchCre_Internalname)) ;
            n9518SMFchCre = false ;
            A9519SMUsuCre = GXutil.upper( httpContext.cgiGet( edtSMUsuCre_Internalname)) ;
            n9519SMUsuCre = false ;
            A9520SMMaqCod = httpContext.cgiGet( edtSMMaqCod_Internalname) ;
            n9520SMMaqCod = false ;
            A11534SMPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtSMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9517SMDsc = httpContext.cgiGet( edtSMDsc_Internalname) ;
            n9517SMDsc = false ;
            A9521SMMaqDsc = httpContext.cgiGet( edtSMMaqDsc_Internalname) ;
            n9521SMMaqDsc = false ;
            cmbavSmcal.setName( cmbavSmcal.getInternalname() );
            cmbavSmcal.setValue( httpContext.cgiGet( cmbavSmcal.getInternalname()) );
            AV5SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbavSmcal.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavSmcal.getInternalname(), GXutil.str( AV5SMCal, 1, 0));
            cmbSMCal.setName( cmbSMCal.getInternalname() );
            cmbSMCal.setValue( httpContext.cgiGet( cmbSMCal.getInternalname()) );
            A9524SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbSMCal.getInternalname()))) ;
            n9524SMCal = false ;
            A9523SMTxt = httpContext.cgiGet( edtSMTxt_Internalname) ;
            n9523SMTxt = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOMCOD");
               GX_FocusControl = edtavOmcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV88OMCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavOmcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88OMCod), 8, 0));
            }
            else
            {
               AV88OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOmcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavOmcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88OMCod), 8, 0));
            }
            cmbavOmest.setName( cmbavOmest.getInternalname() );
            cmbavOmest.setValue( httpContext.cgiGet( cmbavOmest.getInternalname()) );
            AV89OMEst = httpContext.cgiGet( cmbavOmest.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavOmest.getInternalname(), AV89OMEst);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMSolicWW");
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Pgmname", AV94Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("mantenimientomaquina\\tmsolicww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e19LF2 ();
      if (returnInSub) return;
   }

   public void e19LF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV30Modo = GXutil.upper( AV91InModo) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Modo", AV30Modo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Modo, ""))));
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmsolicww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmsolicww_impl.this.AV15EmprCod = GXv_char2[0] ;
      tmsolicww_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmsolicww_impl.this.AV61UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
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
      if ( GXutil.strcmp(AV25HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Solicitudes de Mantenimiento", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV31OrderedBy < 1 )
      {
         AV31OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      if ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "ADM", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Ingresando a solicitudes en modo Administrador", "", "", "", "", "", "", "", "", ""));
      }
      else if ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Ingresando a solicitudes en modo Usuario", "", "", "", "", "", "", "", "", ""));
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "No esta definido el modo de ingreso a solicitudes", "", "", "", "", "", "", "", "", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void e20LF2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV62WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV62WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("MantenimientoMaquina.TMSolicWWColumnsSelector"), "") != 0 )
      {
         AV10ColumnsSelectorXML = AV35Session.getValue("MantenimientoMaquina.TMSolicWWColumnsSelector") ;
         AV8ColumnsSelector.fromxml(AV10ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtSMCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbSMEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbSMEst.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtSMFchCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMFchCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMFchCre_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtSMUsuCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMUsuCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMUsuCre_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtSMMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtSMPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMPri_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtSMDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtSMMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavSmcal.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSmcal.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSmcal.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      cmbSMCal.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Visible", GXutil.ltrimstr( cmbSMCal.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtSMTxt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMTxt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMTxt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavOmcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOmcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOmcod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavOmest.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavOmest.getInternalname(), "Visible", GXutil.ltrimstr( cmbavOmest.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      AV75Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23GridState", AV23GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81GridCollapsedRecords", AV81GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80GridCollapsedRecordsChildren", AV80GridCollapsedRecordsChildren);
   }

   public void e12LF2( )
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
         AV34PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV34PageToGo) ;
      }
   }

   public void e13LF2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14LF2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) )
      {
         if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) || ( GXutil.strcmp(GXutil.trim( GXutil.str( AV31OrderedBy, 4, 0)), Ddo_grid_Selectedvalue_get) != 0 ) )
         {
            AV76GroupBy = ((GXutil.strcmp(AV76GroupBy, Ddo_grid_Selectedtext_get)==0) ? "" : Ddo_grid_Selectedtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76GroupBy", AV76GroupBy);
         }
         AV31OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         AV33OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0)||(GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>")==0)&&(GXutil.strcmp("", AV76GroupBy)==0)&&AV33OrderedDsc ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMCod") == 0 )
         {
            AV39TFSMCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFSMCod), 8, 0));
            AV40TFSMCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFSMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMEst") == 0 )
         {
            AV44TFSMEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFSMEst_SelsJson", AV44TFSMEst_SelsJson);
            AV43TFSMEst_Sels.fromJSonString(AV44TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMFchCre") == 0 )
         {
            AV45TFSMFchCre = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFSMFchCre", localUtil.ttoc( AV45TFSMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMUsuCre") == 0 )
         {
            AV55TFSMUsuCre = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFSMUsuCre", AV55TFSMUsuCre);
            AV56TFSMUsuCre_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFSMUsuCre_Sel", AV56TFSMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMMaqCod") == 0 )
         {
            AV47TFSMMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFSMMaqCod", AV47TFSMMaqCod);
            AV48TFSMMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFSMMaqCod_Sel", AV48TFSMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMPri") == 0 )
         {
            AV51TFSMPri = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFSMPri", GXutil.str( AV51TFSMPri, 1, 0));
            AV52TFSMPri_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFSMPri_To", GXutil.str( AV52TFSMPri_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMDsc") == 0 )
         {
            AV41TFSMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFSMDsc", AV41TFSMDsc);
            AV42TFSMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFSMDsc_Sel", AV42TFSMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMMaqDsc") == 0 )
         {
            AV49TFSMMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFSMMaqDsc", AV49TFSMMaqDsc);
            AV50TFSMMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFSMMaqDsc_Sel", AV50TFSMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMCal") == 0 )
         {
            AV38TFSMCal_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFSMCal_SelsJson", AV38TFSMCal_SelsJson);
            AV37TFSMCal_Sels.fromJSonString(GXutil.strReplace( AV38TFSMCal_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMTxt") == 0 )
         {
            AV53TFSMTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSMTxt", AV53TFSMTxt);
            AV54TFSMTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFSMTxt_Sel", AV54TFSMTxt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37TFSMCal_Sels", AV37TFSMCal_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43TFSMEst_Sels", AV43TFSMEst_Sels);
   }

   private void e21LF2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         if ( GXutil.strcmp(AV76GroupBy, "SMMaqCod") == 0 )
         {
            AV75Grid_GroupCaption = A9520SMMaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
            AV75Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Cód. Máquina", ""), AV75Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
            AV78GroupKey = GXutil.trim( A9520SMMaqCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
         }
         else if ( GXutil.strcmp(AV76GroupBy, "SMMaqDsc") == 0 )
         {
            AV75Grid_GroupCaption = A9521SMMaqDsc ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
            AV75Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Descripción Máquina", ""), AV75Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV75Grid_GroupCaption);
            AV78GroupKey = GXutil.trim( A9521SMMaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
         }
         AV82Index = AV81GridCollapsedRecords.indexof(AV78GroupKey) ;
         AV86Expand = ((AV82Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV86Expand);
         edtavExpand_Columnclass = ((AV82Index>0) ? "WWPExpand" : "WWPCollapse") ;
         AV74DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV74DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) )
         {
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "ADM", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) )
         {
            cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Generar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "ADM", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Anular", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) )
         {
            cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Calificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         /* Using cursor H00LF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9425OMCod = H00LF4_A9425OMCod[0] ;
            AV88OMCod = A9425OMCod ;
            httpContext.ajax_rsp_assign_attri("", false, edtavOmcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88OMCod), 8, 0));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor H00LF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A9445OMEst = H00LF5_A9445OMEst[0] ;
            AV89OMEst = A9445OMEst ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavOmest.getInternalname(), AV89OMEst);
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV80GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         if ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) )
         {
            cmbavSmcal.setVisible( 1 );
         }
         else
         {
            cmbavSmcal.setVisible( 0 );
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV73GridActions, 4, 0)) );
      cmbavOmest.setValue( GXutil.rtrim( AV89OMEst) );
   }

   public void e15LF2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV10ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV8ColumnsSelector.fromJSonString(AV10ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMSolicWWColumnsSelector", ((GXutil.strcmp("", AV10ColumnsSelectorXML)==0) ? "" : AV8ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23GridState", AV23GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81GridCollapsedRecords", AV81GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80GridCollapsedRecordsChildren", AV80GridCollapsedRecordsChildren);
   }

   public void e11LF2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMSolicWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV94Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMSolicWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV29ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientoMaquina.TMSolicWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmsolicww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV29ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV29ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV29ManageFiltersXml) ;
            AV23GridState.fromxml(AV29ManageFiltersXml, null, null);
            AV31OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
            AV33OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            AV76GroupBy = AV23GridState.getgxTv_SdtWWPGridState_Groupby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76GroupBy", AV76GroupBy);
            AV81GridCollapsedRecords.fromJSonString(AV23GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV81GridCollapsedRecords.size() > 0 )
            {
               AV85AddChildren = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV85AddChildren", AV85AddChildren);
               AV115GXV1 = 1 ;
               while ( AV115GXV1 <= AV81GridCollapsedRecords.size() )
               {
                  AV78GroupKey = (String)AV81GridCollapsedRecords.elementAt(-1+AV115GXV1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S262 ();
                  if (returnInSub) return;
                  AV115GXV1 = (int)(AV115GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23GridState", AV23GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81GridCollapsedRecords", AV81GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV43TFSMEst_Sels", AV43TFSMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37TFSMCal_Sels", AV37TFSMCal_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80GridCollapsedRecordsChildren", AV80GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e22LF2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV73GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActions == 4 )
      {
         /* Execute user subroutine: 'DO GENERAR' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActions == 5 )
      {
         /* Execute user subroutine: 'DO ANULAR' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV73GridActions == 6 )
      {
         /* Execute user subroutine: 'DO CALIFICAR' */
         S252 ();
         if (returnInSub) return;
      }
      AV73GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV73GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      cmbavSmcal.setValue( GXutil.trim( GXutil.str( AV5SMCal, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSmcal.getInternalname(), "Values", cmbavSmcal.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23GridState", AV23GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81GridCollapsedRecords", AV81GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80GridCollapsedRecordsChildren", AV80GridCollapsedRecordsChildren);
   }

   public void e16LF2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e17LF2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV18ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.mantenimientomaquina.tmsolicwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmsolicww_impl.this.AV18ExcelFilename = GXv_char4[0] ;
      tmsolicww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e18LF2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmsolicwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e23LF2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV76GroupBy, "SMMaqCod") == 0 )
      {
         AV78GroupKey = GXutil.trim( A9520SMMaqCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
      }
      else if ( GXutil.strcmp(AV76GroupBy, "SMMaqDsc") == 0 )
      {
         AV78GroupKey = GXutil.trim( A9521SMMaqDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
      }
      AV82Index = AV81GridCollapsedRecords.indexof(AV78GroupKey) ;
      if ( AV82Index > 0 )
      {
         AV81GridCollapsedRecords.removeItem((int)(AV82Index));
      }
      else
      {
         AV81GridCollapsedRecords.add(AV78GroupKey, 0);
      }
      AV85AddChildren = (0==AV82Index) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AddChildren", AV85AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S262 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81GridCollapsedRecords", AV81GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV80GridCollapsedRecordsChildren", AV80GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23GridState", AV23GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV31OrderedBy, 4, 0))+":"+(AV33OrderedDsc ? "DSC" : "ASC")+((GXutil.strcmp("", AV76GroupBy)==0) ? "" : " GRP") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV8ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMCod", "", "Nro.", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMEst", "", "Estado", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMFchCre", "", "Fecha Creación", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMUsuCre", "", "Usuario Creación", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMMaqCod", "", "Cód. Máquina", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMPri", "", "Prioridad", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMDsc", "", "Descripción", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMMaqDsc", "", "Descripción Máquina", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&SMCal", "", "Calificación", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMCal", "", "Calificación", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "SMTxt", "", "Texto", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&OMCod", "", "Orden", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&OMEst", "", "Estado", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV60UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMSolicWWColumnsSelector", GXv_char4) ;
      tmsolicww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV60UserCustomValue)==0) ) )
      {
         AV9ColumnsSelectorAux.fromxml(AV60UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV9ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ( GXutil.strcmp(AV30Modo, httpContext.getMessage( "USR", "")) == 0 ) ) )
      {
         bttBtninsert_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtninsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtninsert_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientoMaquina.TMSolicWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
      AV39TFSMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFSMCod), 8, 0));
      AV40TFSMCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFSMCod_To), 8, 0));
      AV43TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV45TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFSMFchCre", localUtil.ttoc( AV45TFSMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV55TFSMUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFSMUsuCre", AV55TFSMUsuCre);
      AV56TFSMUsuCre_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFSMUsuCre_Sel", AV56TFSMUsuCre_Sel);
      AV47TFSMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFSMMaqCod", AV47TFSMMaqCod);
      AV48TFSMMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFSMMaqCod_Sel", AV48TFSMMaqCod_Sel);
      AV51TFSMPri = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFSMPri", GXutil.str( AV51TFSMPri, 1, 0));
      AV52TFSMPri_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFSMPri_To", GXutil.str( AV52TFSMPri_To, 1, 0));
      AV41TFSMDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFSMDsc", AV41TFSMDsc);
      AV42TFSMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFSMDsc_Sel", AV42TFSMDsc_Sel);
      AV49TFSMMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFSMMaqDsc", AV49TFSMMaqDsc);
      AV50TFSMMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFSMMaqDsc_Sel", AV50TFSMMaqDsc_Sel);
      AV37TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV53TFSMTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFSMTxt", AV53TFSMTxt);
      AV54TFSMTxt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFSMTxt_Sel", AV54TFSMTxt_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV81GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV80GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S202( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9428SMCod,8,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9428SMCod,8,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9428SMCod,8,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9428SMCod,8,0))}, new String[] {"Mode","EmprCod","SMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S232( )
   {
      /* 'DO GENERAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A9428SMCod ;
      new app.mantenimientomaquina.pmsolgen(remoteHandle, context).execute( GXv_char4, GXv_int12) ;
      tmsolicww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmsolicww_impl.this.A9428SMCod = GXv_int12[0] ;
      gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
   }

   public void S242( )
   {
      /* 'DO ANULAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A9428SMCod ;
      new app.mantenimientomaquina.pmsolanu(remoteHandle, context).execute( GXv_char4, GXv_int12) ;
      tmsolicww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmsolicww_impl.this.A9428SMCod = GXv_int12[0] ;
      gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
   }

   public void S252( )
   {
      /* 'DO CALIFICAR' Routine */
      returnInSub = false ;
      if ( ! (0==AV5SMCal) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A9428SMCod ;
         GXv_int13[0] = AV5SMCal ;
         new app.mantenimientomaquina.pmsolcal(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int13) ;
         tmsolicww_impl.this.A396EmprCod = GXv_char4[0] ;
         tmsolicww_impl.this.A9428SMCod = GXv_int12[0] ;
         tmsolicww_impl.this.AV5SMCal = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavSmcal.getInternalname(), GXutil.str( AV5SMCal, 1, 0));
         gxgrgrid_refresh( subGrid_Rows, AV28ManageFiltersExecutionStep, AV8ColumnsSelector, AV19FilterFullText, AV39TFSMCod, AV40TFSMCod_To, AV43TFSMEst_Sels, AV45TFSMFchCre, AV55TFSMUsuCre, AV56TFSMUsuCre_Sel, AV47TFSMMaqCod, AV48TFSMMaqCod_Sel, AV51TFSMPri, AV52TFSMPri_To, AV41TFSMDsc, AV42TFSMDsc_Sel, AV49TFSMMaqDsc, AV50TFSMMaqDsc_Sel, AV37TFSMCal_Sels, AV53TFSMTxt, AV54TFSMTxt_Sel, AV30Modo, AV94Pgmname, AV31OrderedBy, AV33OrderedDsc, AV91InModo, AV76GroupBy, AV81GridCollapsedRecords, AV78GroupKey, A9425OMCod, A9445OMEst, AV80GridCollapsedRecordsChildren, AV15EmprCod) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "no ha seleccionado valor para calificar", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV94Pgmname+"GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV94Pgmname+"GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV35Session.getValue(AV94Pgmname+"GridState"), null, null);
      }
      AV31OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
      AV76GroupBy = AV23GridState.getgxTv_SdtWWPGridState_Groupby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76GroupBy", AV76GroupBy);
      AV33OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV23GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV23GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV23GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
      AV81GridCollapsedRecords.fromJSonString(AV23GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV81GridCollapsedRecords.size() > 0 )
      {
         AV85AddChildren = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AddChildren", AV85AddChildren);
         AV116GXV2 = 1 ;
         while ( AV116GXV2 <= AV81GridCollapsedRecords.size() )
         {
            AV78GroupKey = (String)AV81GridCollapsedRecords.elementAt(-1+AV116GXV2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78GroupKey", AV78GroupKey);
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S262 ();
            if (returnInSub) return;
            AV116GXV2 = (int)(AV116GXV2+1) ;
         }
      }
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV117GXV3 = 1 ;
      while ( AV117GXV3 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV117GXV3));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV39TFSMCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFSMCod), 8, 0));
            AV40TFSMCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFSMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMEST_SEL") == 0 )
         {
            AV44TFSMEst_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFSMEst_SelsJson", AV44TFSMEst_SelsJson);
            AV43TFSMEst_Sels.fromJSonString(AV44TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMFCHCRE") == 0 )
         {
            AV45TFSMFchCre = localUtil.ctot( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFSMFchCre", localUtil.ttoc( AV45TFSMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV11DDO_SMFchCreAuxDate = GXutil.resetTime(AV45TFSMFchCre) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11DDO_SMFchCreAuxDate", localUtil.format(AV11DDO_SMFchCreAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE") == 0 )
         {
            AV55TFSMUsuCre = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFSMUsuCre", AV55TFSMUsuCre);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE_SEL") == 0 )
         {
            AV56TFSMUsuCre_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFSMUsuCre_Sel", AV56TFSMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD") == 0 )
         {
            AV47TFSMMaqCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFSMMaqCod", AV47TFSMMaqCod);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD_SEL") == 0 )
         {
            AV48TFSMMaqCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFSMMaqCod_Sel", AV48TFSMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMPRI") == 0 )
         {
            AV51TFSMPri = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFSMPri", GXutil.str( AV51TFSMPri, 1, 0));
            AV52TFSMPri_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFSMPri_To", GXutil.str( AV52TFSMPri_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC") == 0 )
         {
            AV41TFSMDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFSMDsc", AV41TFSMDsc);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC_SEL") == 0 )
         {
            AV42TFSMDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFSMDsc_Sel", AV42TFSMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC") == 0 )
         {
            AV49TFSMMaqDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFSMMaqDsc", AV49TFSMMaqDsc);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC_SEL") == 0 )
         {
            AV50TFSMMaqDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFSMMaqDsc_Sel", AV50TFSMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCAL_SEL") == 0 )
         {
            AV38TFSMCal_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFSMCal_SelsJson", AV38TFSMCal_SelsJson);
            AV37TFSMCal_Sels.fromJSonString(AV38TFSMCal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT") == 0 )
         {
            AV53TFSMTxt = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSMTxt", AV53TFSMTxt);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT_SEL") == 0 )
         {
            AV54TFSMTxt_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFSMTxt_Sel", AV54TFSMTxt_Sel);
         }
         AV117GXV3 = (int)(AV117GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV43TFSMEst_Sels.size()==0), AV44TFSMEst_SelsJson, GXv_char4) ;
      tmsolicww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFSMUsuCre_Sel)==0), AV56TFSMUsuCre_Sel, GXv_char3) ;
      tmsolicww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFSMMaqCod_Sel)==0), AV48TFSMMaqCod_Sel, GXv_char2) ;
      tmsolicww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFSMDsc_Sel)==0), AV42TFSMDsc_Sel, GXv_char17) ;
      tmsolicww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFSMMaqDsc_Sel)==0), AV50TFSMMaqDsc_Sel, GXv_char19) ;
      tmsolicww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFSMTxt_Sel)==0), AV54TFSMTxt_Sel, GXv_char21) ;
      tmsolicww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char14+"|"+GXt_char15+"||"+GXt_char16+"|"+GXt_char18+"||"+((AV37TFSMCal_Sels.size()==0) ? "" : AV38TFSMCal_SelsJson)+"|"+GXt_char20+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFSMUsuCre)==0), AV55TFSMUsuCre, GXv_char21) ;
      tmsolicww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFSMMaqCod)==0), AV47TFSMMaqCod, GXv_char19) ;
      tmsolicww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFSMDsc)==0), AV41TFSMDsc, GXv_char17) ;
      tmsolicww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFSMMaqDsc)==0), AV49TFSMMaqDsc, GXv_char4) ;
      tmsolicww_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFSMTxt)==0), AV53TFSMTxt, GXv_char3) ;
      tmsolicww_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV39TFSMCod) ? "" : GXutil.str( AV39TFSMCod, 8, 0))+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV45TFSMFchCre) ? "" : localUtil.dtoc( AV11DDO_SMFchCreAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char20+"|"+GXt_char18+"|"+((0==AV51TFSMPri) ? "" : GXutil.str( AV51TFSMPri, 1, 0))+"|"+GXt_char16+"|"+GXt_char15+"|||"+GXt_char14+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV40TFSMCod_To) ? "" : GXutil.str( AV40TFSMCod_To, 8, 0))+"|||||"+((0==AV52TFSMPri_To) ? "" : GXutil.str( AV52TFSMPri_To, 1, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV23GridState.fromxml(AV35Session.getValue(AV94Pgmname+"GridState"), null, null);
      AV83OldGridState.fromxml(AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV23GridState.setgxTv_SdtWWPGridState_Orderedby( AV31OrderedBy );
      AV23GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV33OrderedDsc );
      AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMCOD", "", !((0==AV39TFSMCod)&&(0==AV40TFSMCod_To)), (short)(0), GXutil.trim( GXutil.str( AV39TFSMCod, 8, 0)), GXutil.trim( GXutil.str( AV40TFSMCod_To, 8, 0))) ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMEST_SEL", "", !(AV43TFSMEst_Sels.size()==0), (short)(0), AV43TFSMEst_Sels.toJSonString(false), "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMFCHCRE", "", !GXutil.dateCompare(GXutil.nullDate(), AV45TFSMFchCre), (short)(0), GXutil.trim( localUtil.ttoc( AV45TFSMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMUSUCRE", "", !(GXutil.strcmp("", AV55TFSMUsuCre)==0), (short)(0), AV55TFSMUsuCre, "", !(GXutil.strcmp("", AV56TFSMUsuCre_Sel)==0), AV56TFSMUsuCre_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMMAQCOD", "", !(GXutil.strcmp("", AV47TFSMMaqCod)==0), (short)(0), AV47TFSMMaqCod, "", !(GXutil.strcmp("", AV48TFSMMaqCod_Sel)==0), AV48TFSMMaqCod_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMPRI", "", !((0==AV51TFSMPri)&&(0==AV52TFSMPri_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFSMPri, 1, 0)), GXutil.trim( GXutil.str( AV52TFSMPri_To, 1, 0))) ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMDSC", "", !(GXutil.strcmp("", AV41TFSMDsc)==0), (short)(0), AV41TFSMDsc, "", !(GXutil.strcmp("", AV42TFSMDsc_Sel)==0), AV42TFSMDsc_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMMAQDSC", "", !(GXutil.strcmp("", AV49TFSMMaqDsc)==0), (short)(0), AV49TFSMMaqDsc, "", !(GXutil.strcmp("", AV50TFSMMaqDsc_Sel)==0), AV50TFSMMaqDsc_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMCAL_SEL", "", !(AV37TFSMCal_Sels.size()==0), (short)(0), AV37TFSMCal_Sels.toJSonString(false), "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV23GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFSMTXT", "", !(GXutil.strcmp("", AV53TFSMTxt)==0), (short)(0), AV53TFSMTxt, "", !(GXutil.strcmp("", AV54TFSMTxt_Sel)==0), AV54TFSMTxt_Sel, "") ;
      AV23GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV91InModo)==0) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INMODO" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV91InModo );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      AV23GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV23GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      AV23GridState.setgxTv_SdtWWPGridState_Groupby( AV76GroupBy );
      if ( ! (GXutil.strcmp("", AV76GroupBy)==0) && ! ( ( ( AV31OrderedBy == 6 ) && ( GXutil.strcmp(AV76GroupBy, "SMMaqCod") == 0 ) ) || ( ( AV31OrderedBy == 8 ) && ( GXutil.strcmp(AV76GroupBy, "SMMaqDsc") == 0 ) ) ) )
      {
         AV76GroupBy = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76GroupBy", AV76GroupBy);
      }
      Grid_group_Columnindex = ((GXutil.strcmp("", AV76GroupBy)==0) ? -1 : 1) ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "ColumnIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid_group_Columnindex), 9, 0));
      if ( (GXutil.strcmp("", AV76GroupBy)==0) || new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV83OldGridState, AV23GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV81GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
         AV80GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV23GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV81GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV57TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV57TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV94Pgmname );
      AV57TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV57TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV25HTTPRequest.getScriptName()+"?"+AV25HTTPRequest.getQuerystring() );
      AV57TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoMaquina.TMSolic" );
      AV35Session.setValue("TrnContext", AV57TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S262( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV84DiscardFirst = true ;
      AV90GroupSMMaqCod = AV78GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90GroupSMMaqCod", AV90GroupSMMaqCod);
      AV87GroupSMMaqDsc = AV78GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87GroupSMMaqDsc", AV87GroupSMMaqDsc);
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV19FilterFullText ;
      AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV39TFSMCod ;
      AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV40TFSMCod_To ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV43TFSMEst_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV45TFSMFchCre ;
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV55TFSMUsuCre ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV56TFSMUsuCre_Sel ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV47TFSMMaqCod ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV48TFSMMaqCod_Sel ;
      AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV51TFSMPri ;
      AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV52TFSMPri_To ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV41TFSMDsc ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV42TFSMDsc_Sel ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV49TFSMMaqDsc ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV50TFSMMaqDsc_Sel ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV37TFSMCal_Sels ;
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV53TFSMTxt ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV54TFSMTxt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           AV76GroupBy ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           AV90GroupSMMaqCod ,
                                           AV87GroupSMMaqDsc ,
                                           AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor H00LF6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel, AV90GroupSMMaqCod, AV87GroupSMMaqDsc});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A9523SMTxt = H00LF6_A9523SMTxt[0] ;
         n9523SMTxt = H00LF6_n9523SMTxt[0] ;
         A9521SMMaqDsc = H00LF6_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = H00LF6_n9521SMMaqDsc[0] ;
         A9517SMDsc = H00LF6_A9517SMDsc[0] ;
         n9517SMDsc = H00LF6_n9517SMDsc[0] ;
         A11534SMPri = H00LF6_A11534SMPri[0] ;
         A9520SMMaqCod = H00LF6_A9520SMMaqCod[0] ;
         n9520SMMaqCod = H00LF6_n9520SMMaqCod[0] ;
         A9519SMUsuCre = H00LF6_A9519SMUsuCre[0] ;
         n9519SMUsuCre = H00LF6_n9519SMUsuCre[0] ;
         A9518SMFchCre = H00LF6_A9518SMFchCre[0] ;
         n9518SMFchCre = H00LF6_n9518SMFchCre[0] ;
         A9428SMCod = H00LF6_A9428SMCod[0] ;
         n9428SMCod = H00LF6_n9428SMCod[0] ;
         A9524SMCal = H00LF6_A9524SMCal[0] ;
         n9524SMCal = H00LF6_n9524SMCal[0] ;
         A9522SMEst = H00LF6_A9522SMEst[0] ;
         n9522SMEst = H00LF6_n9522SMEst[0] ;
         A396EmprCod = H00LF6_A396EmprCod[0] ;
         A9521SMMaqDsc = H00LF6_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = H00LF6_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV77RecordKey = A396EmprCod + ";" + GXutil.trim( GXutil.str( A9428SMCod, 8, 0)) ;
               AV82Index = AV80GridCollapsedRecordsChildren.indexof(AV77RecordKey) ;
               if ( AV85AddChildren && ( AV82Index == 0 ) )
               {
                  if ( ! AV84DiscardFirst )
                  {
                     AV80GridCollapsedRecordsChildren.add(AV77RecordKey, 0);
                  }
                  else
                  {
                     AV84DiscardFirst = false ;
                  }
               }
               else
               {
                  if ( ( ! AV85AddChildren ) && ( AV82Index > 0 ) )
                  {
                     AV80GridCollapsedRecordsChildren.removeItem((int)(AV82Index));
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void e24LF2( )
   {
      /* 'DoGenerarOrdenes' Routine */
      returnInSub = false ;
      new app.mantenimientomaquina.pmpregen(remoteHandle, context).execute( ) ;
   }

   public void wb_table1_25_LF2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_LF2( true) ;
      }
      else
      {
         wb_table2_30_LF2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_LF2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_LF2e( true) ;
      }
      else
      {
         wb_table1_25_LF2e( false) ;
      }
   }

   public void wb_table2_30_LF2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\TMSolicWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_LF2e( true) ;
      }
      else
      {
         wb_table2_30_LF2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV91InModo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91InModo", AV91InModo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINMODO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91InModo, ""))));
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
      paLF2( ) ;
      wsLF2( ) ;
      weLF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116122584", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmsolicww.js", "?202682116122585", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_43_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_43_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_43_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_43_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_43_idx ;
      cmbSMEst.setInternalname( "SMEST_"+sGXsfl_43_idx );
      edtSMFchCre_Internalname = "SMFCHCRE_"+sGXsfl_43_idx ;
      edtSMUsuCre_Internalname = "SMUSUCRE_"+sGXsfl_43_idx ;
      edtSMMaqCod_Internalname = "SMMAQCOD_"+sGXsfl_43_idx ;
      edtSMPri_Internalname = "SMPRI_"+sGXsfl_43_idx ;
      edtSMDsc_Internalname = "SMDSC_"+sGXsfl_43_idx ;
      edtSMMaqDsc_Internalname = "SMMAQDSC_"+sGXsfl_43_idx ;
      cmbavSmcal.setInternalname( "vSMCAL_"+sGXsfl_43_idx );
      cmbSMCal.setInternalname( "SMCAL_"+sGXsfl_43_idx );
      edtSMTxt_Internalname = "SMTXT_"+sGXsfl_43_idx ;
      edtavOmcod_Internalname = "vOMCOD_"+sGXsfl_43_idx ;
      cmbavOmest.setInternalname( "vOMEST_"+sGXsfl_43_idx );
   }

   public void subsflControlProps_fel_432( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_43_fel_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_43_fel_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_43_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_43_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_43_fel_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_43_fel_idx ;
      cmbSMEst.setInternalname( "SMEST_"+sGXsfl_43_fel_idx );
      edtSMFchCre_Internalname = "SMFCHCRE_"+sGXsfl_43_fel_idx ;
      edtSMUsuCre_Internalname = "SMUSUCRE_"+sGXsfl_43_fel_idx ;
      edtSMMaqCod_Internalname = "SMMAQCOD_"+sGXsfl_43_fel_idx ;
      edtSMPri_Internalname = "SMPRI_"+sGXsfl_43_fel_idx ;
      edtSMDsc_Internalname = "SMDSC_"+sGXsfl_43_fel_idx ;
      edtSMMaqDsc_Internalname = "SMMAQDSC_"+sGXsfl_43_fel_idx ;
      cmbavSmcal.setInternalname( "vSMCAL_"+sGXsfl_43_fel_idx );
      cmbSMCal.setInternalname( "SMCAL_"+sGXsfl_43_fel_idx );
      edtSMTxt_Internalname = "SMTXT_"+sGXsfl_43_fel_idx ;
      edtavOmcod_Internalname = "vOMCOD_"+sGXsfl_43_fel_idx ;
      cmbavOmest.setInternalname( "vOMEST_"+sGXsfl_43_fel_idx );
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wbLF0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV86Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVEXPAND.CLICK."+sGXsfl_43_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV75Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV74DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+"e25lf2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_43_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV73GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV73GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV73GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_43_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV73GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtSMCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbSMEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbSMEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SMEST_" + sGXsfl_43_idx ;
            cmbSMEst.setName( GXCCtl );
            cmbSMEst.setWebtags( "" );
            cmbSMEst.addItem("P", httpContext.getMessage( "Pendiente Generación", ""), (short)(0));
            cmbSMEst.addItem("G", httpContext.getMessage( "Generada", ""), (short)(0));
            cmbSMEst.addItem("A", httpContext.getMessage( "Anulada", ""), (short)(0));
            cmbSMEst.addItem("C", httpContext.getMessage( "Pendiente Calificacion", ""), (short)(0));
            cmbSMEst.addItem("T", httpContext.getMessage( "Terminada", ""), (short)(0));
            if ( cmbSMEst.getItemCount() > 0 )
            {
               A9522SMEst = cmbSMEst.getValidValue(A9522SMEst) ;
               n9522SMEst = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSMEst,cmbSMEst.getInternalname(),GXutil.rtrim( A9522SMEst),Integer.valueOf(1),cmbSMEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbSMEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSMEst.setValue( GXutil.rtrim( A9522SMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Values", cmbSMEst.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtSMFchCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMFchCre_Internalname,localUtil.ttoc( A9518SMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9518SMFchCre, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMFchCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMFchCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtSMUsuCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMUsuCre_Internalname,GXutil.rtrim( A9519SMUsuCre),GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMUsuCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMUsuCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtSMMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMMaqCod_Internalname,GXutil.rtrim( A9520SMMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtSMPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMPri_Internalname,GXutil.ltrim( localUtil.ntoc( A11534SMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11534SMPri), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtSMDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMDsc_Internalname,GXutil.rtrim( A9517SMDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtSMDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtSMMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMMaqDsc_Internalname,GXutil.rtrim( A9521SMMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavSmcal.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavSmcal.getEnabled()!=0)&&(cmbavSmcal.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavSmcal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vSMCAL_" + sGXsfl_43_idx ;
            cmbavSmcal.setName( GXCCtl );
            cmbavSmcal.setWebtags( "" );
            cmbavSmcal.addItem("1", httpContext.getMessage( "Pesima", ""), (short)(0));
            cmbavSmcal.addItem("2", httpContext.getMessage( "Mala", ""), (short)(0));
            cmbavSmcal.addItem("3", httpContext.getMessage( "Aceptable", ""), (short)(0));
            cmbavSmcal.addItem("4", httpContext.getMessage( "Satisfactorio", ""), (short)(0));
            cmbavSmcal.addItem("5", httpContext.getMessage( "Excelente", ""), (short)(0));
            if ( cmbavSmcal.getItemCount() > 0 )
            {
               AV5SMCal = (byte)(GXutil.lval( cmbavSmcal.getValidValue(GXutil.trim( GXutil.str( AV5SMCal, 1, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavSmcal.getInternalname(), GXutil.str( AV5SMCal, 1, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavSmcal,cmbavSmcal.getInternalname(),GXutil.trim( GXutil.str( AV5SMCal, 1, 0)),Integer.valueOf(1),cmbavSmcal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavSmcal.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavSmcal.getEnabled()!=0)&&(cmbavSmcal.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavSmcal.setValue( GXutil.trim( GXutil.str( AV5SMCal, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSmcal.getInternalname(), "Values", cmbavSmcal.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbSMCal.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbSMCal.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SMCAL_" + sGXsfl_43_idx ;
            cmbSMCal.setName( GXCCtl );
            cmbSMCal.setWebtags( "" );
            cmbSMCal.addItem("1", httpContext.getMessage( "Pesima", ""), (short)(0));
            cmbSMCal.addItem("2", httpContext.getMessage( "Mala", ""), (short)(0));
            cmbSMCal.addItem("3", httpContext.getMessage( "Aceptable", ""), (short)(0));
            cmbSMCal.addItem("4", httpContext.getMessage( "Satisfactorio", ""), (short)(0));
            cmbSMCal.addItem("5", httpContext.getMessage( "Excelente", ""), (short)(0));
            if ( cmbSMCal.getItemCount() > 0 )
            {
               A9524SMCal = (byte)(GXutil.lval( cmbSMCal.getValidValue(GXutil.trim( GXutil.str( A9524SMCal, 1, 0))))) ;
               n9524SMCal = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSMCal,cmbSMCal.getInternalname(),GXutil.trim( GXutil.str( A9524SMCal, 1, 0)),Integer.valueOf(1),cmbSMCal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbSMCal.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSMCal.setValue( GXutil.trim( GXutil.str( A9524SMCal, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Values", cmbSMCal.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtSMTxt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMTxt_Internalname,A9523SMTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMTxt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavOmcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOmcod_Enabled!=0)&&(edtavOmcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOmcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV88OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOmcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV88OMCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavOmcod_Enabled!=0)&&(edtavOmcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavOmcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavOmcod_Visible),Integer.valueOf(edtavOmcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavOmest.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavOmest.getEnabled()!=0)&&(cmbavOmest.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavOmest.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vOMEST_" + sGXsfl_43_idx ;
            cmbavOmest.setName( GXCCtl );
            cmbavOmest.setWebtags( "" );
            cmbavOmest.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbavOmest.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
            if ( cmbavOmest.getItemCount() > 0 )
            {
               AV89OMEst = cmbavOmest.getValidValue(AV89OMEst) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavOmest.getInternalname(), AV89OMEst);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavOmest,cmbavOmest.getInternalname(),GXutil.rtrim( AV89OMEst),Integer.valueOf(1),cmbavOmest.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavOmest.getVisible()),Integer.valueOf(cmbavOmest.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavOmest.getEnabled()!=0)&&(cmbavOmest.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavOmest.setValue( GXutil.rtrim( AV89OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOmest.getInternalname(), "Values", cmbavOmest.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         send_integrity_lvl_hashesLF2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nro.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbSMEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMFchCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMUsuCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prioridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavSmcal.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Calificación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbSMCal.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Calificación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMTxt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Texto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavOmcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavOmest.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV86Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV75Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV74DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9522SMEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbSMEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9518SMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMFchCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9519SMUsuCre));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMUsuCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9520SMMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11534SMPri, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9517SMDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9521SMMaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV5SMCal, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavSmcal.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9524SMCal, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbSMCal.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9523SMTxt);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMTxt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV88OMCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOmcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOmcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89OMEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavOmest.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavOmest.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtavExpand_Internalname = "vEXPAND" ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtSMCod_Internalname = "SMCOD" ;
      cmbSMEst.setInternalname( "SMEST" );
      edtSMFchCre_Internalname = "SMFCHCRE" ;
      edtSMUsuCre_Internalname = "SMUSUCRE" ;
      edtSMMaqCod_Internalname = "SMMAQCOD" ;
      edtSMPri_Internalname = "SMPRI" ;
      edtSMDsc_Internalname = "SMDSC" ;
      edtSMMaqDsc_Internalname = "SMMAQDSC" ;
      cmbavSmcal.setInternalname( "vSMCAL" );
      cmbSMCal.setInternalname( "SMCAL" );
      edtSMTxt_Internalname = "SMTXT" ;
      edtavOmcod_Internalname = "vOMCOD" ;
      cmbavOmest.setInternalname( "vOMEST" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_group_Internalname = "GRID_GROUP" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_smfchcreauxdate_Internalname = "vDDO_SMFCHCREAUXDATE" ;
      divDdo_smfchcreauxdates_Internalname = "DDO_SMFCHCREAUXDATES" ;
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
      cmbavOmest.setJsonclick( "" );
      cmbavOmest.setEnabled( 1 );
      edtavOmcod_Jsonclick = "" ;
      edtavOmcod_Enabled = 1 ;
      edtSMTxt_Jsonclick = "" ;
      cmbSMCal.setJsonclick( "" );
      cmbavSmcal.setJsonclick( "" );
      cmbavSmcal.setEnabled( 1 );
      edtSMMaqDsc_Jsonclick = "" ;
      edtSMDsc_Jsonclick = "" ;
      edtSMPri_Jsonclick = "" ;
      edtSMMaqCod_Jsonclick = "" ;
      edtSMUsuCre_Jsonclick = "" ;
      edtSMFchCre_Jsonclick = "" ;
      cmbSMEst.setJsonclick( "" );
      edtSMCod_Jsonclick = "" ;
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
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavOmest.setVisible( -1 );
      edtavOmcod_Visible = -1 ;
      edtSMTxt_Visible = -1 ;
      cmbSMCal.setVisible( -1 );
      cmbavSmcal.setVisible( -1 );
      edtSMMaqDsc_Visible = -1 ;
      edtSMDsc_Visible = -1 ;
      edtSMPri_Visible = -1 ;
      edtSMMaqCod_Visible = -1 ;
      edtSMUsuCre_Visible = -1 ;
      edtSMFchCre_Visible = -1 ;
      cmbSMEst.setVisible( -1 );
      edtSMCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_smfchcreauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      bttBtninsert_Visible = 1 ;
      Grid_empowerer_Fixedcolumns = ";;;L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_group_Columnindex = 1 ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "MantenimientoMaquina.TMSolicWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|P:Pendiente Generación,G:Generada,A:Anulada,C:Pendiente Calificacion,T:Terminada||||||||1:Pesima,2:Mala,3:Aceptable,4:Satisfactorio,5:Excelente|||" ;
      Ddo_grid_Allowmultipleselection = "|T||||||||T|||" ;
      Ddo_grid_Datalisttype = "|FixedValues||Dynamic|Dynamic||Dynamic|Dynamic||FixedValues|Dynamic||" ;
      Ddo_grid_Includedatalist = "|T||T|T||T|T||T|T||" ;
      Ddo_grid_Filterisrange = "T|||||T|||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Date|Character|Character|Numeric|Character|Character|||Character||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|||T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Allowgroup = "||||T|||T|||||" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T||T|T||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|1|8||9|10||" ;
      Ddo_grid_Columnids = "6:SMCod|7:SMEst|8:SMFchCre|9:SMUsuCre|10:SMMaqCod|11:SMPri|12:SMDsc|13:SMMaqDsc|14:SMCal|15:SMCal|16:SMTxt|17:OMCod|18:OMEst" ;
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
      Form.setCaption( httpContext.getMessage( " Solicitudes de Mantenimiento", "") );
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
         AV73GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV73GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridActions), 4, 0));
      }
      GXCCtl = "SMEST_" + sGXsfl_43_idx ;
      cmbSMEst.setName( GXCCtl );
      cmbSMEst.setWebtags( "" );
      cmbSMEst.addItem("P", httpContext.getMessage( "Pendiente Generación", ""), (short)(0));
      cmbSMEst.addItem("G", httpContext.getMessage( "Generada", ""), (short)(0));
      cmbSMEst.addItem("A", httpContext.getMessage( "Anulada", ""), (short)(0));
      cmbSMEst.addItem("C", httpContext.getMessage( "Pendiente Calificacion", ""), (short)(0));
      cmbSMEst.addItem("T", httpContext.getMessage( "Terminada", ""), (short)(0));
      if ( cmbSMEst.getItemCount() > 0 )
      {
         A9522SMEst = cmbSMEst.getValidValue(A9522SMEst) ;
         n9522SMEst = false ;
      }
      GXCCtl = "vSMCAL_" + sGXsfl_43_idx ;
      cmbavSmcal.setName( GXCCtl );
      cmbavSmcal.setWebtags( "" );
      cmbavSmcal.addItem("1", httpContext.getMessage( "Pesima", ""), (short)(0));
      cmbavSmcal.addItem("2", httpContext.getMessage( "Mala", ""), (short)(0));
      cmbavSmcal.addItem("3", httpContext.getMessage( "Aceptable", ""), (short)(0));
      cmbavSmcal.addItem("4", httpContext.getMessage( "Satisfactorio", ""), (short)(0));
      cmbavSmcal.addItem("5", httpContext.getMessage( "Excelente", ""), (short)(0));
      if ( cmbavSmcal.getItemCount() > 0 )
      {
         AV5SMCal = (byte)(GXutil.lval( cmbavSmcal.getValidValue(GXutil.trim( GXutil.str( AV5SMCal, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavSmcal.getInternalname(), GXutil.str( AV5SMCal, 1, 0));
      }
      GXCCtl = "SMCAL_" + sGXsfl_43_idx ;
      cmbSMCal.setName( GXCCtl );
      cmbSMCal.setWebtags( "" );
      cmbSMCal.addItem("1", httpContext.getMessage( "Pesima", ""), (short)(0));
      cmbSMCal.addItem("2", httpContext.getMessage( "Mala", ""), (short)(0));
      cmbSMCal.addItem("3", httpContext.getMessage( "Aceptable", ""), (short)(0));
      cmbSMCal.addItem("4", httpContext.getMessage( "Satisfactorio", ""), (short)(0));
      cmbSMCal.addItem("5", httpContext.getMessage( "Excelente", ""), (short)(0));
      if ( cmbSMCal.getItemCount() > 0 )
      {
         A9524SMCal = (byte)(GXutil.lval( cmbSMCal.getValidValue(GXutil.trim( GXutil.str( A9524SMCal, 1, 0))))) ;
         n9524SMCal = false ;
      }
      GXCCtl = "vOMEST_" + sGXsfl_43_idx ;
      cmbavOmest.setName( GXCCtl );
      cmbavOmest.setWebtags( "" );
      cmbavOmest.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbavOmest.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbavOmest.getItemCount() > 0 )
      {
         AV89OMEst = cmbavOmest.getValidValue(AV89OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavOmest.getInternalname(), AV89OMEst);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbSMEst'},{av:'edtSMFchCre_Visible',ctrl:'SMFCHCRE',prop:'Visible'},{av:'edtSMUsuCre_Visible',ctrl:'SMUSUCRE',prop:'Visible'},{av:'edtSMMaqCod_Visible',ctrl:'SMMAQCOD',prop:'Visible'},{av:'edtSMPri_Visible',ctrl:'SMPRI',prop:'Visible'},{av:'edtSMDsc_Visible',ctrl:'SMDSC',prop:'Visible'},{av:'edtSMMaqDsc_Visible',ctrl:'SMMAQDSC',prop:'Visible'},{av:'cmbavSmcal'},{av:'cmbSMCal'},{av:'edtSMTxt_Visible',ctrl:'SMTXT',prop:'Visible'},{av:'edtavOmcod_Visible',ctrl:'vOMCOD',prop:'Visible'},{av:'cmbavOmest'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedtext_get',ctrl:'DDO_GRID',prop:'SelectedText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV38TFSMCal_SelsJson',fld:'vTFSMCAL_SELSJSON',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV44TFSMEst_SelsJson',fld:'vTFSMEST_SELSJSON',pic:''},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21LF2',iparms:[{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'A9520SMMaqCod',fld:'SMMAQCOD',pic:''},{av:'A9521SMMaqDsc',fld:'SMMAQDSC',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'cmbSMEst'},{av:'A9522SMEst',fld:'SMEST',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV86Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'AV74DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV73GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV88OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavOmest'},{av:'AV89OMEst',fld:'vOMEST',pic:''},{av:'cmbavSmcal'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbSMEst'},{av:'edtSMFchCre_Visible',ctrl:'SMFCHCRE',prop:'Visible'},{av:'edtSMUsuCre_Visible',ctrl:'SMUSUCRE',prop:'Visible'},{av:'edtSMMaqCod_Visible',ctrl:'SMMAQCOD',prop:'Visible'},{av:'edtSMPri_Visible',ctrl:'SMPRI',prop:'Visible'},{av:'edtSMDsc_Visible',ctrl:'SMDSC',prop:'Visible'},{av:'edtSMMaqDsc_Visible',ctrl:'SMMAQDSC',prop:'Visible'},{av:'cmbavSmcal'},{av:'cmbSMCal'},{av:'edtSMTxt_Visible',ctrl:'SMTXT',prop:'Visible'},{av:'edtavOmcod_Visible',ctrl:'vOMCOD',prop:'Visible'},{av:'cmbavOmest'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFSMEst_SelsJson',fld:'vTFSMEST_SELSJSON',pic:''},{av:'AV38TFSMCal_SelsJson',fld:'vTFSMCAL_SELSJSON',pic:''},{av:'AV11DDO_SMFchCreAuxDate',fld:'vDDO_SMFCHCREAUXDATE',pic:''},{av:'cmbSMEst'},{av:'A9522SMEst',fld:'SMEST',pic:''},{av:'A9520SMMaqCod',fld:'SMMAQCOD',pic:''},{av:'A9521SMMaqDsc',fld:'SMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'AV85AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV85AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV38TFSMCal_SelsJson',fld:'vTFSMCAL_SELSJSON',pic:''},{av:'AV11DDO_SMFchCreAuxDate',fld:'vDDO_SMFCHCREAUXDATE',pic:''},{av:'AV44TFSMEst_SelsJson',fld:'vTFSMEST_SELSJSON',pic:''},{av:'AV90GroupSMMaqCod',fld:'vGROUPSMMAQCOD',pic:''},{av:'AV87GroupSMMaqDsc',fld:'vGROUPSMMAQDSC',pic:''},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbSMEst'},{av:'edtSMFchCre_Visible',ctrl:'SMFCHCRE',prop:'Visible'},{av:'edtSMUsuCre_Visible',ctrl:'SMUSUCRE',prop:'Visible'},{av:'edtSMMaqCod_Visible',ctrl:'SMMAQCOD',prop:'Visible'},{av:'edtSMPri_Visible',ctrl:'SMPRI',prop:'Visible'},{av:'edtSMDsc_Visible',ctrl:'SMDSC',prop:'Visible'},{av:'edtSMMaqDsc_Visible',ctrl:'SMMAQDSC',prop:'Visible'},{av:'cmbavSmcal'},{av:'cmbSMCal'},{av:'edtSMTxt_Visible',ctrl:'SMTXT',prop:'Visible'},{av:'edtavOmcod_Visible',ctrl:'vOMCOD',prop:'Visible'},{av:'cmbavOmest'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22LF2',iparms:[{av:'cmbavGridactions'},{av:'AV73GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'cmbavSmcal'},{av:'AV5SMCal',fld:'vSMCAL',pic:'9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV73GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavSmcal'},{av:'AV5SMCal',fld:'vSMCAL',pic:'9'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbSMEst'},{av:'edtSMFchCre_Visible',ctrl:'SMFCHCRE',prop:'Visible'},{av:'edtSMUsuCre_Visible',ctrl:'SMUSUCRE',prop:'Visible'},{av:'edtSMMaqCod_Visible',ctrl:'SMMAQCOD',prop:'Visible'},{av:'edtSMPri_Visible',ctrl:'SMPRI',prop:'Visible'},{av:'edtSMDsc_Visible',ctrl:'SMDSC',prop:'Visible'},{av:'edtSMMaqDsc_Visible',ctrl:'SMMAQDSC',prop:'Visible'},{av:'cmbSMCal'},{av:'edtSMTxt_Visible',ctrl:'SMTXT',prop:'Visible'},{av:'edtavOmcod_Visible',ctrl:'vOMCOD',prop:'Visible'},{av:'cmbavOmest'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16LF2',iparms:[{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17LF2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18LF2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e23LF2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV40TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFSMEst_Sels',fld:'vTFSMEST_SELS',pic:''},{av:'AV45TFSMFchCre',fld:'vTFSMFCHCRE',pic:'99/99/99 99:99'},{av:'AV55TFSMUsuCre',fld:'vTFSMUSUCRE',pic:'@!'},{av:'AV56TFSMUsuCre_Sel',fld:'vTFSMUSUCRE_SEL',pic:'@!'},{av:'AV47TFSMMaqCod',fld:'vTFSMMAQCOD',pic:''},{av:'AV48TFSMMaqCod_Sel',fld:'vTFSMMAQCOD_SEL',pic:''},{av:'AV51TFSMPri',fld:'vTFSMPRI',pic:'9'},{av:'AV52TFSMPri_To',fld:'vTFSMPRI_TO',pic:'9'},{av:'AV41TFSMDsc',fld:'vTFSMDSC',pic:''},{av:'AV42TFSMDsc_Sel',fld:'vTFSMDSC_SEL',pic:''},{av:'AV49TFSMMaqDsc',fld:'vTFSMMAQDSC',pic:''},{av:'AV50TFSMMaqDsc_Sel',fld:'vTFSMMAQDSC_SEL',pic:''},{av:'AV37TFSMCal_Sels',fld:'vTFSMCAL_SELS',pic:''},{av:'AV53TFSMTxt',fld:'vTFSMTXT',pic:''},{av:'AV54TFSMTxt_Sel',fld:'vTFSMTXT_SEL',pic:''},{av:'AV30Modo',fld:'vMODO',pic:'',hsh:true},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV91InModo',fld:'vINMODO',pic:'',hsh:true},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9520SMMaqCod',fld:'SMMAQCOD',pic:''},{av:'A9521SMMaqDsc',fld:'SMMAQDSC',pic:''},{av:'cmbSMEst'},{av:'A9522SMEst',fld:'SMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'},{av:'AV85AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV78GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV81GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV85AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV90GroupSMMaqCod',fld:'vGROUPSMMAQCOD',pic:''},{av:'AV87GroupSMMaqDsc',fld:'vGROUPSMMAQDSC',pic:''},{av:'AV80GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbSMEst'},{av:'edtSMFchCre_Visible',ctrl:'SMFCHCRE',prop:'Visible'},{av:'edtSMUsuCre_Visible',ctrl:'SMUSUCRE',prop:'Visible'},{av:'edtSMMaqCod_Visible',ctrl:'SMMAQCOD',prop:'Visible'},{av:'edtSMPri_Visible',ctrl:'SMPRI',prop:'Visible'},{av:'edtSMDsc_Visible',ctrl:'SMDSC',prop:'Visible'},{av:'edtSMMaqDsc_Visible',ctrl:'SMMAQDSC',prop:'Visible'},{av:'cmbavSmcal'},{av:'cmbSMCal'},{av:'edtSMTxt_Visible',ctrl:'SMTXT',prop:'Visible'},{av:'edtavOmcod_Visible',ctrl:'vOMCOD',prop:'Visible'},{av:'cmbavOmest'},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV75Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV23GridState',fld:'vGRIDSTATE',pic:''},{av:'AV76GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e25LF2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9428SMCod',fld:'SMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("'DOGENERARORDENES'","{handler:'e24LF2',iparms:[]");
      setEventMetadata("'DOGENERARORDENES'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[]");
      setEventMetadata("VALID_SMCOD",",oparms:[]}");
      setEventMetadata("VALID_SMEST","{handler:'valid_Smest',iparms:[]");
      setEventMetadata("VALID_SMEST",",oparms:[]}");
      setEventMetadata("VALID_SMUSUCRE","{handler:'valid_Smusucre',iparms:[]");
      setEventMetadata("VALID_SMUSUCRE",",oparms:[]}");
      setEventMetadata("VALID_SMMAQCOD","{handler:'valid_Smmaqcod',iparms:[]");
      setEventMetadata("VALID_SMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_SMPRI","{handler:'valid_Smpri',iparms:[]");
      setEventMetadata("VALID_SMPRI",",oparms:[]}");
      setEventMetadata("VALID_SMDSC","{handler:'valid_Smdsc',iparms:[]");
      setEventMetadata("VALID_SMDSC",",oparms:[]}");
      setEventMetadata("VALID_SMMAQDSC","{handler:'valid_Smmaqdsc',iparms:[]");
      setEventMetadata("VALID_SMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_SMCAL","{handler:'valid_Smcal',iparms:[]");
      setEventMetadata("VALID_SMCAL",",oparms:[]}");
      setEventMetadata("VALID_SMTXT","{handler:'valid_Smtxt',iparms:[]");
      setEventMetadata("VALID_SMTXT",",oparms:[]}");
      setEventMetadata("VALIDV_OMEST","{handler:'validv_Omest',iparms:[]");
      setEventMetadata("VALIDV_OMEST",",oparms:[]}");
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
      wcpOAV91InModo = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV91InModo = "" ;
      AV8ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19FilterFullText = "" ;
      AV43TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV55TFSMUsuCre = "" ;
      AV56TFSMUsuCre_Sel = "" ;
      AV47TFSMMaqCod = "" ;
      AV48TFSMMaqCod_Sel = "" ;
      AV41TFSMDsc = "" ;
      AV42TFSMDsc_Sel = "" ;
      AV49TFSMMaqDsc = "" ;
      AV50TFSMMaqDsc_Sel = "" ;
      AV37TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53TFSMTxt = "" ;
      AV54TFSMTxt_Sel = "" ;
      AV30Modo = "" ;
      AV94Pgmname = "" ;
      AV76GroupBy = "" ;
      AV81GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78GroupKey = "" ;
      A9445OMEst = "" ;
      AV80GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV15EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44TFSMEst_SelsJson = "" ;
      AV38TFSMCal_SelsJson = "" ;
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
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV11DDO_SMFchCreAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV86Expand = "" ;
      AV75Grid_GroupCaption = "" ;
      AV74DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A9522SMEst = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9519SMUsuCre = "" ;
      A9520SMMaqCod = "" ;
      A9517SMDsc = "" ;
      A9521SMMaqDsc = "" ;
      A9523SMTxt = "" ;
      AV89OMEst = "" ;
      AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = "" ;
      AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = "" ;
      AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = "" ;
      AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = "" ;
      AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = "" ;
      scmdbuf = "" ;
      lV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      H00LF2_A9428SMCod = new int[1] ;
      H00LF2_n9428SMCod = new boolean[] {false} ;
      H00LF2_A396EmprCod = new String[] {""} ;
      H00LF2_A9523SMTxt = new String[] {""} ;
      H00LF2_n9523SMTxt = new boolean[] {false} ;
      H00LF2_A9524SMCal = new byte[1] ;
      H00LF2_n9524SMCal = new boolean[] {false} ;
      H00LF2_A9521SMMaqDsc = new String[] {""} ;
      H00LF2_n9521SMMaqDsc = new boolean[] {false} ;
      H00LF2_A9517SMDsc = new String[] {""} ;
      H00LF2_n9517SMDsc = new boolean[] {false} ;
      H00LF2_A11534SMPri = new byte[1] ;
      H00LF2_A9520SMMaqCod = new String[] {""} ;
      H00LF2_n9520SMMaqCod = new boolean[] {false} ;
      H00LF2_A9519SMUsuCre = new String[] {""} ;
      H00LF2_n9519SMUsuCre = new boolean[] {false} ;
      H00LF2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00LF2_n9518SMFchCre = new boolean[] {false} ;
      H00LF2_A9522SMEst = new String[] {""} ;
      H00LF2_n9522SMEst = new boolean[] {false} ;
      H00LF2_A407EmprNom = new String[] {""} ;
      H00LF2_n407EmprNom = new boolean[] {false} ;
      H00LF3_A9428SMCod = new int[1] ;
      H00LF3_n9428SMCod = new boolean[] {false} ;
      H00LF3_A396EmprCod = new String[] {""} ;
      H00LF3_A9523SMTxt = new String[] {""} ;
      H00LF3_n9523SMTxt = new boolean[] {false} ;
      H00LF3_A9524SMCal = new byte[1] ;
      H00LF3_n9524SMCal = new boolean[] {false} ;
      H00LF3_A9521SMMaqDsc = new String[] {""} ;
      H00LF3_n9521SMMaqDsc = new boolean[] {false} ;
      H00LF3_A9517SMDsc = new String[] {""} ;
      H00LF3_n9517SMDsc = new boolean[] {false} ;
      H00LF3_A11534SMPri = new byte[1] ;
      H00LF3_A9520SMMaqCod = new String[] {""} ;
      H00LF3_n9520SMMaqCod = new boolean[] {false} ;
      H00LF3_A9519SMUsuCre = new String[] {""} ;
      H00LF3_n9519SMUsuCre = new boolean[] {false} ;
      H00LF3_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00LF3_n9518SMFchCre = new boolean[] {false} ;
      H00LF3_A9522SMEst = new String[] {""} ;
      H00LF3_n9522SMEst = new boolean[] {false} ;
      H00LF3_A407EmprNom = new String[] {""} ;
      H00LF3_n407EmprNom = new boolean[] {false} ;
      hsh = "" ;
      AV36Station = "" ;
      AV16EmprNom = "" ;
      AV61UsurCod = "" ;
      AV25HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV62WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV10ColumnsSelectorXML = "" ;
      H00LF4_A396EmprCod = new String[] {""} ;
      H00LF4_A9428SMCod = new int[1] ;
      H00LF4_n9428SMCod = new boolean[] {false} ;
      H00LF4_A9425OMCod = new int[1] ;
      H00LF5_A9425OMCod = new int[1] ;
      H00LF5_A396EmprCod = new String[] {""} ;
      H00LF5_A9428SMCod = new int[1] ;
      H00LF5_n9428SMCod = new boolean[] {false} ;
      H00LF5_A9445OMEst = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29ManageFiltersXml = "" ;
      AV18ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV60UserCustomValue = "" ;
      AV9ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new byte[1] ;
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      AV83OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV57TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV90GroupSMMaqCod = "" ;
      AV87GroupSMMaqDsc = "" ;
      H00LF6_A9523SMTxt = new String[] {""} ;
      H00LF6_n9523SMTxt = new boolean[] {false} ;
      H00LF6_A9521SMMaqDsc = new String[] {""} ;
      H00LF6_n9521SMMaqDsc = new boolean[] {false} ;
      H00LF6_A9517SMDsc = new String[] {""} ;
      H00LF6_n9517SMDsc = new boolean[] {false} ;
      H00LF6_A11534SMPri = new byte[1] ;
      H00LF6_A9520SMMaqCod = new String[] {""} ;
      H00LF6_n9520SMMaqCod = new boolean[] {false} ;
      H00LF6_A9519SMUsuCre = new String[] {""} ;
      H00LF6_n9519SMUsuCre = new boolean[] {false} ;
      H00LF6_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00LF6_n9518SMFchCre = new boolean[] {false} ;
      H00LF6_A9428SMCod = new int[1] ;
      H00LF6_n9428SMCod = new boolean[] {false} ;
      H00LF6_A9524SMCal = new byte[1] ;
      H00LF6_n9524SMCal = new boolean[] {false} ;
      H00LF6_A9522SMEst = new String[] {""} ;
      H00LF6_n9522SMEst = new boolean[] {false} ;
      H00LF6_A396EmprCod = new String[] {""} ;
      AV77RecordKey = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolicww__default(),
         new Object[] {
             new Object[] {
            H00LF2_A9428SMCod, H00LF2_A396EmprCod, H00LF2_A9523SMTxt, H00LF2_n9523SMTxt, H00LF2_A9524SMCal, H00LF2_n9524SMCal, H00LF2_A9521SMMaqDsc, H00LF2_n9521SMMaqDsc, H00LF2_A9517SMDsc, H00LF2_n9517SMDsc,
            H00LF2_A11534SMPri, H00LF2_A9520SMMaqCod, H00LF2_n9520SMMaqCod, H00LF2_A9519SMUsuCre, H00LF2_n9519SMUsuCre, H00LF2_A9518SMFchCre, H00LF2_n9518SMFchCre, H00LF2_A9522SMEst, H00LF2_n9522SMEst, H00LF2_A407EmprNom,
            H00LF2_n407EmprNom
            }
            , new Object[] {
            H00LF3_A9428SMCod, H00LF3_A396EmprCod, H00LF3_A9523SMTxt, H00LF3_n9523SMTxt, H00LF3_A9524SMCal, H00LF3_n9524SMCal, H00LF3_A9521SMMaqDsc, H00LF3_n9521SMMaqDsc, H00LF3_A9517SMDsc, H00LF3_n9517SMDsc,
            H00LF3_A11534SMPri, H00LF3_A9520SMMaqCod, H00LF3_n9520SMMaqCod, H00LF3_A9519SMUsuCre, H00LF3_n9519SMUsuCre, H00LF3_A9518SMFchCre, H00LF3_n9518SMFchCre, H00LF3_A9522SMEst, H00LF3_n9522SMEst, H00LF3_A407EmprNom,
            H00LF3_n407EmprNom
            }
            , new Object[] {
            H00LF4_A396EmprCod, H00LF4_A9428SMCod, H00LF4_n9428SMCod, H00LF4_A9425OMCod
            }
            , new Object[] {
            H00LF5_A9425OMCod, H00LF5_A396EmprCod, H00LF5_A9428SMCod, H00LF5_n9428SMCod, H00LF5_A9445OMEst
            }
            , new Object[] {
            H00LF6_A9523SMTxt, H00LF6_n9523SMTxt, H00LF6_A9521SMMaqDsc, H00LF6_n9521SMMaqDsc, H00LF6_A9517SMDsc, H00LF6_n9517SMDsc, H00LF6_A11534SMPri, H00LF6_A9520SMMaqCod, H00LF6_n9520SMMaqCod, H00LF6_A9519SMUsuCre,
            H00LF6_n9519SMUsuCre, H00LF6_A9518SMFchCre, H00LF6_n9518SMFchCre, H00LF6_A9428SMCod, H00LF6_A9524SMCal, H00LF6_n9524SMCal, H00LF6_A9522SMEst, H00LF6_n9522SMEst, H00LF6_A396EmprCod
            }
         }
      );
      AV94Pgmname = "MantenimientoMaquina.TMSolicWW" ;
      /* GeneXus formulas. */
      AV94Pgmname = "MantenimientoMaquina.TMSolicWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavOmcod_Enabled = 0 ;
      cmbavOmest.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV28ManageFiltersExecutionStep ;
   private byte AV51TFSMPri ;
   private byte AV52TFSMPri_To ;
   private byte gxajaxcallmode ;
   private byte A11534SMPri ;
   private byte AV5SMCal ;
   private byte A9524SMCal ;
   private byte nDonePA ;
   private byte AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri ;
   private byte AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int13[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV31OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV73GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV39TFSMCod ;
   private int AV40TFSMCod_To ;
   private int A9425OMCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int bttBtninsert_Visible ;
   private int edtavPgmname_Enabled ;
   private int A9428SMCod ;
   private int AV88OMCod ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavOmcod_Enabled ;
   private int AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod ;
   private int AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ;
   private int AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ;
   private int AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ;
   private int AV80GridCollapsedRecordsChildren_size ;
   private int edtSMCod_Visible ;
   private int edtSMFchCre_Visible ;
   private int edtSMUsuCre_Visible ;
   private int edtSMMaqCod_Visible ;
   private int edtSMPri_Visible ;
   private int edtSMDsc_Visible ;
   private int edtSMMaqDsc_Visible ;
   private int edtSMTxt_Visible ;
   private int edtavOmcod_Visible ;
   private int AV34PageToGo ;
   private int AV115GXV1 ;
   private int GXv_int12[] ;
   private int AV116GXV2 ;
   private int AV117GXV3 ;
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
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV82Index ;
   private String wcpOAV91InModo ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV91InModo ;
   private String sGXsfl_43_idx="0001" ;
   private String AV55TFSMUsuCre ;
   private String AV56TFSMUsuCre_Sel ;
   private String AV47TFSMMaqCod ;
   private String AV48TFSMMaqCod_Sel ;
   private String AV41TFSMDsc ;
   private String AV42TFSMDsc_Sel ;
   private String AV49TFSMMaqDsc ;
   private String AV50TFSMMaqDsc_Sel ;
   private String AV30Modo ;
   private String AV94Pgmname ;
   private String A9445OMEst ;
   private String AV15EmprCod ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_smfchcreauxdates_Internalname ;
   private String edtavDdo_smfchcreauxdate_Internalname ;
   private String edtavDdo_smfchcreauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV86Expand ;
   private String edtavExpand_Internalname ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV74DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtSMCod_Internalname ;
   private String A9522SMEst ;
   private String edtSMFchCre_Internalname ;
   private String A9519SMUsuCre ;
   private String edtSMUsuCre_Internalname ;
   private String A9520SMMaqCod ;
   private String edtSMMaqCod_Internalname ;
   private String edtSMPri_Internalname ;
   private String A9517SMDsc ;
   private String edtSMDsc_Internalname ;
   private String A9521SMMaqDsc ;
   private String edtSMMaqDsc_Internalname ;
   private String edtSMTxt_Internalname ;
   private String edtavOmcod_Internalname ;
   private String AV89OMEst ;
   private String edtavFilterfulltext_Internalname ;
   private String AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ;
   private String AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ;
   private String AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ;
   private String AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ;
   private String scmdbuf ;
   private String lV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String lV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String lV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String lV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String hsh ;
   private String AV36Station ;
   private String AV16EmprNom ;
   private String AV61UsurCod ;
   private String edtavExpand_Columnclass ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String AV90GroupSMMaqCod ;
   private String AV87GroupSMMaqDsc ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavExpand_Jsonclick ;
   private String edtavGrid_groupcaption_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtSMCod_Jsonclick ;
   private String edtSMFchCre_Jsonclick ;
   private String edtSMUsuCre_Jsonclick ;
   private String edtSMMaqCod_Jsonclick ;
   private String edtSMPri_Jsonclick ;
   private String edtSMDsc_Jsonclick ;
   private String edtSMMaqDsc_Jsonclick ;
   private String edtSMTxt_Jsonclick ;
   private String edtavOmcod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV45TFSMFchCre ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ;
   private java.util.Date AV11DDO_SMFchCreAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV33OrderedDsc ;
   private boolean AV85AddChildren ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9428SMCod ;
   private boolean n9522SMEst ;
   private boolean n9518SMFchCre ;
   private boolean n9519SMUsuCre ;
   private boolean n9520SMMaqCod ;
   private boolean n9517SMDsc ;
   private boolean n9521SMMaqDsc ;
   private boolean n9524SMCal ;
   private boolean n9523SMTxt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean AV84DiscardFirst ;
   private String AV44TFSMEst_SelsJson ;
   private String AV38TFSMCal_SelsJson ;
   private String AV10ColumnsSelectorXML ;
   private String AV29ManageFiltersXml ;
   private String AV60UserCustomValue ;
   private String AV19FilterFullText ;
   private String AV53TFSMTxt ;
   private String AV54TFSMTxt_Sel ;
   private String AV76GroupBy ;
   private String AV78GroupKey ;
   private String AV75Grid_GroupCaption ;
   private String A9523SMTxt ;
   private String AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ;
   private String lV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String lV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String AV18ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV77RecordKey ;
   private GXSimpleCollection<Byte> AV37TFSMCal_Sels ;
   private GXSimpleCollection<Byte> AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV25HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbSMEst ;
   private HTMLChoice cmbavSmcal ;
   private HTMLChoice cmbSMCal ;
   private HTMLChoice cmbavOmest ;
   private IDataStoreProvider pr_default ;
   private int[] H00LF2_A9428SMCod ;
   private boolean[] H00LF2_n9428SMCod ;
   private String[] H00LF2_A396EmprCod ;
   private String[] H00LF2_A9523SMTxt ;
   private boolean[] H00LF2_n9523SMTxt ;
   private byte[] H00LF2_A9524SMCal ;
   private boolean[] H00LF2_n9524SMCal ;
   private String[] H00LF2_A9521SMMaqDsc ;
   private boolean[] H00LF2_n9521SMMaqDsc ;
   private String[] H00LF2_A9517SMDsc ;
   private boolean[] H00LF2_n9517SMDsc ;
   private byte[] H00LF2_A11534SMPri ;
   private String[] H00LF2_A9520SMMaqCod ;
   private boolean[] H00LF2_n9520SMMaqCod ;
   private String[] H00LF2_A9519SMUsuCre ;
   private boolean[] H00LF2_n9519SMUsuCre ;
   private java.util.Date[] H00LF2_A9518SMFchCre ;
   private boolean[] H00LF2_n9518SMFchCre ;
   private String[] H00LF2_A9522SMEst ;
   private boolean[] H00LF2_n9522SMEst ;
   private String[] H00LF2_A407EmprNom ;
   private boolean[] H00LF2_n407EmprNom ;
   private int[] H00LF3_A9428SMCod ;
   private boolean[] H00LF3_n9428SMCod ;
   private String[] H00LF3_A396EmprCod ;
   private String[] H00LF3_A9523SMTxt ;
   private boolean[] H00LF3_n9523SMTxt ;
   private byte[] H00LF3_A9524SMCal ;
   private boolean[] H00LF3_n9524SMCal ;
   private String[] H00LF3_A9521SMMaqDsc ;
   private boolean[] H00LF3_n9521SMMaqDsc ;
   private String[] H00LF3_A9517SMDsc ;
   private boolean[] H00LF3_n9517SMDsc ;
   private byte[] H00LF3_A11534SMPri ;
   private String[] H00LF3_A9520SMMaqCod ;
   private boolean[] H00LF3_n9520SMMaqCod ;
   private String[] H00LF3_A9519SMUsuCre ;
   private boolean[] H00LF3_n9519SMUsuCre ;
   private java.util.Date[] H00LF3_A9518SMFchCre ;
   private boolean[] H00LF3_n9518SMFchCre ;
   private String[] H00LF3_A9522SMEst ;
   private boolean[] H00LF3_n9522SMEst ;
   private String[] H00LF3_A407EmprNom ;
   private boolean[] H00LF3_n407EmprNom ;
   private String[] H00LF4_A396EmprCod ;
   private int[] H00LF4_A9428SMCod ;
   private boolean[] H00LF4_n9428SMCod ;
   private int[] H00LF4_A9425OMCod ;
   private int[] H00LF5_A9425OMCod ;
   private String[] H00LF5_A396EmprCod ;
   private int[] H00LF5_A9428SMCod ;
   private boolean[] H00LF5_n9428SMCod ;
   private String[] H00LF5_A9445OMEst ;
   private String[] H00LF6_A9523SMTxt ;
   private boolean[] H00LF6_n9523SMTxt ;
   private String[] H00LF6_A9521SMMaqDsc ;
   private boolean[] H00LF6_n9521SMMaqDsc ;
   private String[] H00LF6_A9517SMDsc ;
   private boolean[] H00LF6_n9517SMDsc ;
   private byte[] H00LF6_A11534SMPri ;
   private String[] H00LF6_A9520SMMaqCod ;
   private boolean[] H00LF6_n9520SMMaqCod ;
   private String[] H00LF6_A9519SMUsuCre ;
   private boolean[] H00LF6_n9519SMUsuCre ;
   private java.util.Date[] H00LF6_A9518SMFchCre ;
   private boolean[] H00LF6_n9518SMFchCre ;
   private int[] H00LF6_A9428SMCod ;
   private boolean[] H00LF6_n9428SMCod ;
   private byte[] H00LF6_A9524SMCal ;
   private boolean[] H00LF6_n9524SMCal ;
   private String[] H00LF6_A9522SMEst ;
   private boolean[] H00LF6_n9522SMEst ;
   private String[] H00LF6_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV43TFSMEst_Sels ;
   private GXSimpleCollection<String> AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ;
   private GXSimpleCollection<String> AV81GridCollapsedRecords ;
   private GXSimpleCollection<String> AV80GridCollapsedRecordsChildren ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV83OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV57TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV62WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tmsolicww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00LF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ,
                                          int AV80GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV80GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[15];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.SMCod, T1.EmprCod, T1.SMTxt, T1.SMCal, T3.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMEst, T2.EmprNom" ;
      scmdbuf += " FROM ((TXPMSOLIC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (0==AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMDsc" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMEst" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMEst DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMFchCre" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMFchCre DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMPri" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMPri DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCal" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCal DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMTxt" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMTxt DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H00LF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext ,
                                          int AV80GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV80GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[15];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.SMCod, T1.EmprCod, T1.SMTxt, T1.SMCal, T3.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMEst, T2.EmprNom" ;
      scmdbuf += " FROM ((TXPMSOLIC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (0==AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (0==AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMDsc" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMEst" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMEst DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMFchCre" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMFchCre DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMPri" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMPri DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCal" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCal DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMTxt" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMTxt DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H00LF6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          String AV76GroupBy ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          String AV90GroupSMMaqCod ,
                                          String AV87GroupSMMaqDsc ,
                                          String AV95Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[17];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCod, T1.SMCal, T1.SMEst, T1.EmprCod FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV96Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV100Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (0==AV104Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (0==AV105Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV111Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV76GroupBy, "SMMaqCod") == 0 )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV76GroupBy, "SMMaqDsc") == 0 )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SMCod" ;
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
                  return conditional_H00LF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (GXSimpleCollection<String>)dynConstraints[34] );
            case 1 :
                  return conditional_H00LF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (GXSimpleCollection<String>)dynConstraints[34] );
            case 4 :
                  return conditional_H00LF6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00LF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00LF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00LF4", "SELECT EmprCod, SMCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00LF5", "SELECT OMCod, EmprCod, SMCod, OMEst FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00LF6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 2000);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               return;
      }
   }

}

