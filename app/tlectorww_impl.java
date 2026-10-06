package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlectorww_impl extends GXDataArea
{
   public tlectorww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlectorww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlectorww_impl.class ));
   }

   public tlectorww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbLecEstado = new HTMLChoice();
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV96FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV40TFLecMaqCod = httpContext.GetPar( "TFLecMaqCod") ;
      AV41TFLecMaqCod_Sel = httpContext.GetPar( "TFLecMaqCod_Sel") ;
      AV97TFLecHdr = httpContext.GetPar( "TFLecHdr") ;
      AV98TFLecHdr_Sel = httpContext.GetPar( "TFLecHdr_Sel") ;
      AV55TFLecOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFLecOpeCod"))) ;
      AV56TFLecOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFLecOpeCod_To"))) ;
      AV100TFlecOpeNom = httpContext.GetPar( "TFlecOpeNom") ;
      AV101TFlecOpeNom_Sel = httpContext.GetPar( "TFlecOpeNom_Sel") ;
      AV61TFLecFasCod = httpContext.GetPar( "TFLecFasCod") ;
      AV62TFLecFasCod_Sel = httpContext.GetPar( "TFLecFasCod_Sel") ;
      AV102TFLecFasDsc = httpContext.GetPar( "TFLecFasDsc") ;
      AV103TFLecFasDsc_Sel = httpContext.GetPar( "TFLecFasDsc_Sel") ;
      AV67TFLecFasOrd = (short)(GXutil.lval( httpContext.GetPar( "TFLecFasOrd"))) ;
      AV68TFLecFasOrd_To = (short)(GXutil.lval( httpContext.GetPar( "TFLecFasOrd_To"))) ;
      AV70TFLecParCod = (short)(GXutil.lval( httpContext.GetPar( "TFLecParCod"))) ;
      AV71TFLecParCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFLecParCod_To"))) ;
      AV104TFLecParNom = httpContext.GetPar( "TFLecParNom") ;
      AV105TFLecParNom_Sel = httpContext.GetPar( "TFLecParNom_Sel") ;
      AV76TFLecHor = httpContext.GetPar( "TFLecHor") ;
      AV77TFLecHor_Sel = httpContext.GetPar( "TFLecHor_Sel") ;
      AV79TFLecFec = localUtil.parseDateParm( httpContext.GetPar( "TFLecFec")) ;
      AV84TFLecTipEnt = httpContext.GetPar( "TFLecTipEnt") ;
      AV85TFLecTipEnt_Sel = httpContext.GetPar( "TFLecTipEnt_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV95TFLecEstado_Sels);
      AV111Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paHJ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startHJ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tlectorww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TLECTORWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tlectorww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV89GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV90GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV87DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV87DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECMAQCOD", GXutil.rtrim( AV40TFLecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECMAQCOD_SEL", GXutil.rtrim( AV41TFLecMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHDR", GXutil.rtrim( AV97TFLecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHDR_SEL", GXutil.rtrim( AV98TFLecHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPECOD", GXutil.ltrim( localUtil.ntoc( AV55TFLecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV56TFLecOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPENOM", GXutil.rtrim( AV100TFlecOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPENOM_SEL", GXutil.rtrim( AV101TFlecOpeNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASCOD", GXutil.rtrim( AV61TFLecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASCOD_SEL", GXutil.rtrim( AV62TFLecFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASDSC", GXutil.rtrim( AV102TFLecFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASDSC_SEL", GXutil.rtrim( AV103TFLecFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASORD", GXutil.ltrim( localUtil.ntoc( AV67TFLecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASORD_TO", GXutil.ltrim( localUtil.ntoc( AV68TFLecFasOrd_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARCOD", GXutil.ltrim( localUtil.ntoc( AV70TFLecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV71TFLecParCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARNOM", GXutil.rtrim( AV104TFLecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARNOM_SEL", GXutil.rtrim( AV105TFLecParNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHOR", GXutil.rtrim( AV76TFLecHor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHOR_SEL", GXutil.rtrim( AV77TFLecHor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFEC", localUtil.dtoc( AV79TFLecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECTIPENT", GXutil.rtrim( AV84TFLecTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECTIPENT_SEL", GXutil.rtrim( AV85TFLecTipEnt_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFLECESTADO_SELS", AV95TFLecEstado_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFLECESTADO_SELS", AV95TFLecEstado_Sels);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECESTADO_SELSJSON", AV94TFLecEstado_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
         weHJ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtHJ2( ) ;
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
      return formatLink("app.tlectorww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLECTORWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento tabla LECTOR", "") ;
   }

   public void wbHJ0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_HJ2( true) ;
      }
      else
      {
         wb_table1_27_HJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_HJ2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV89GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV90GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLECTORWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV87DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV87DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lecfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lecfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lecfecauxdate_Internalname, localUtil.format(AV81DDO_LecFecAuxDate, "99/99/99"), localUtil.format( AV81DDO_LecFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lecfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lecfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLECTORWW.htm");
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

   public void startHJ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento tabla LECTOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupHJ0( ) ;
   }

   public void wsHJ2( )
   {
      startHJ2( ) ;
      evtHJ2( ) ;
   }

   public void evtHJ2( )
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
                           e11HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18HJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19HJ2 ();
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
                           AV99GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GridActions), 4, 0));
                           A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
                           A13721LecHdr = httpContext.cgiGet( edtLecHdr_Internalname) ;
                           A1167LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1167LecBarCod = false ;
                           A1168LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtLecBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1168LecBarReo = false ;
                           A1169LecBarPar = httpContext.cgiGet( edtLecBarPar_Internalname) ;
                           n1169LecBarPar = false ;
                           A1170LecOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtLecOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1170LecOpeCod = false ;
                           A14259lecOpeNom = httpContext.cgiGet( edtlecOpeNom_Internalname) ;
                           A1171LecFasCod = httpContext.cgiGet( edtLecFasCod_Internalname) ;
                           n1171LecFasCod = false ;
                           A14260LecFasDsc = httpContext.cgiGet( edtLecFasDsc_Internalname) ;
                           A1188LecFasOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtLecFasOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1188LecFasOrd = false ;
                           A1172LecParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtLecParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1172LecParCod = false ;
                           A14261LecParNom = httpContext.cgiGet( edtLecParNom_Internalname) ;
                           A1173LecHor = httpContext.cgiGet( edtLecHor_Internalname) ;
                           n1173LecHor = false ;
                           A1174LecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLecFec_Internalname), 0)) ;
                           n1174LecFec = false ;
                           A1796LecTipEnt = httpContext.cgiGet( edtLecTipEnt_Internalname) ;
                           n1796LecTipEnt = false ;
                           cmbLecEstado.setName( cmbLecEstado.getInternalname() );
                           cmbLecEstado.setValue( httpContext.cgiGet( cmbLecEstado.getInternalname()) );
                           A13722LecEstado = httpContext.cgiGet( cmbLecEstado.getInternalname()) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20HJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21HJ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22HJ2 ();
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

   public void weHJ2( )
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

   public void paHJ2( )
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
                                 String A396EmprCod ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 String AV96FilterFullText ,
                                 String AV40TFLecMaqCod ,
                                 String AV41TFLecMaqCod_Sel ,
                                 String AV97TFLecHdr ,
                                 String AV98TFLecHdr_Sel ,
                                 int AV55TFLecOpeCod ,
                                 int AV56TFLecOpeCod_To ,
                                 String AV100TFlecOpeNom ,
                                 String AV101TFlecOpeNom_Sel ,
                                 String AV61TFLecFasCod ,
                                 String AV62TFLecFasCod_Sel ,
                                 String AV102TFLecFasDsc ,
                                 String AV103TFLecFasDsc_Sel ,
                                 short AV67TFLecFasOrd ,
                                 short AV68TFLecFasOrd_To ,
                                 short AV70TFLecParCod ,
                                 short AV71TFLecParCod_To ,
                                 String AV104TFLecParNom ,
                                 String AV105TFLecParNom_Sel ,
                                 String AV76TFLecHor ,
                                 String AV77TFLecHor_Sel ,
                                 java.util.Date AV79TFLecFec ,
                                 String AV84TFLecTipEnt ,
                                 String AV85TFLecTipEnt_Sel ,
                                 GXSimpleCollection<String> AV95TFLecEstado_Sels ,
                                 String AV111Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21HJ2 ();
      GRID_nCurrentRecord = 0 ;
      rfHJ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TLECTORWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tlectorww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1166LecMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "LECMAQCOD", GXutil.rtrim( A1166LecMaqCod));
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
      rfHJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV111Pgmname = "TLECTORWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV137Tlectorwwds_25_tflecestado_sels ,
                                           AV115Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV114Tlectorwwds_2_tflecmaqcod ,
                                           AV117Tlectorwwds_5_tflechdr_sel ,
                                           AV116Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV118Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV119Tlectorwwds_7_tflecopecod_to) ,
                                           AV123Tlectorwwds_11_tflecfascod_sel ,
                                           AV122Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV126Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV127Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV128Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV129Tlectorwwds_17_tflecparcod_to) ,
                                           AV133Tlectorwwds_21_tflechor_sel ,
                                           AV132Tlectorwwds_20_tflechor ,
                                           AV134Tlectorwwds_22_tflecfec ,
                                           AV136Tlectorwwds_24_tflectipent_sel ,
                                           AV135Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV113Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV121Tlectorwwds_9_tflecopenom_sel ,
                                           AV120Tlectorwwds_8_tflecopenom ,
                                           AV125Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV124Tlectorwwds_12_tflecfasdsc ,
                                           AV131Tlectorwwds_19_tflecparnom_sel ,
                                           AV130Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV137Tlectorwwds_25_tflecestado_sels.size()) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV114Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV114Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV116Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV116Tlectorwwds_4_tflechdr), 11, "%") ;
      lV122Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV122Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV132Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV132Tlectorwwds_20_tflechor), 8, "%") ;
      lV135Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV135Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor H00HJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV137Tlectorwwds_25_tflecestado_sels.size()), lV114Tlectorwwds_2_tflecmaqcod, AV115Tlectorwwds_3_tflecmaqcod_sel, lV116Tlectorwwds_4_tflechdr, AV117Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV118Tlectorwwds_6_tflecopecod), Integer.valueOf(AV119Tlectorwwds_7_tflecopecod_to), lV122Tlectorwwds_10_tflecfascod, AV123Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV126Tlectorwwds_14_tflecfasord), Short.valueOf(AV127Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV128Tlectorwwds_16_tflecparcod), Short.valueOf(AV129Tlectorwwds_17_tflecparcod_to), lV132Tlectorwwds_20_tflechor, AV133Tlectorwwds_21_tflechor_sel, AV134Tlectorwwds_22_tflecfec, lV135Tlectorwwds_23_tflectipent, AV136Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = H00HJ2_A1796LecTipEnt[0] ;
         n1796LecTipEnt = H00HJ2_n1796LecTipEnt[0] ;
         A1174LecFec = H00HJ2_A1174LecFec[0] ;
         n1174LecFec = H00HJ2_n1174LecFec[0] ;
         A1173LecHor = H00HJ2_A1173LecHor[0] ;
         n1173LecHor = H00HJ2_n1173LecHor[0] ;
         A13721LecHdr = H00HJ2_A13721LecHdr[0] ;
         A1166LecMaqCod = H00HJ2_A1166LecMaqCod[0] ;
         A1170LecOpeCod = H00HJ2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H00HJ2_n1170LecOpeCod[0] ;
         A1171LecFasCod = H00HJ2_A1171LecFasCod[0] ;
         n1171LecFasCod = H00HJ2_n1171LecFasCod[0] ;
         A1172LecParCod = H00HJ2_A1172LecParCod[0] ;
         n1172LecParCod = H00HJ2_n1172LecParCod[0] ;
         A1188LecFasOrd = H00HJ2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H00HJ2_n1188LecFasOrd[0] ;
         A1169LecBarPar = H00HJ2_A1169LecBarPar[0] ;
         n1169LecBarPar = H00HJ2_n1169LecBarPar[0] ;
         A1168LecBarReo = H00HJ2_A1168LecBarReo[0] ;
         n1168LecBarReo = H00HJ2_n1168LecBarReo[0] ;
         A1167LecBarCod = H00HJ2_A1167LecBarCod[0] ;
         n1167LecBarCod = H00HJ2_n1167LecBarCod[0] ;
         GXt_char1 = A14259lecOpeNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
         tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
         A14259lecOpeNom = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV121Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV120Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV120Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV121Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV121Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
            {
               GXt_char1 = A14260LecFasDsc ;
               GXv_char2[0] = GXt_char1 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
               tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
               A14260LecFasDsc = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV125Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV124Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV125Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV125Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                  {
                     GXt_char1 = A14261LecParNom ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
                     tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
                     A14261LecParNom = GXt_char1 ;
                     if ( ! ( (GXutil.strcmp("", AV131Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV130Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV131Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV131Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                        {
                           GXt_char1 = A13722LecEstado ;
                           GXv_char2[0] = GXt_char1 ;
                           new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
                           tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
                           A13722LecEstado = GXt_char1 ;
                           if ( (GXutil.strcmp("", AV113Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "proceso", "") , GXutil.padr( "%" + GXutil.lower( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "finalizadas", "") , GXutil.padr( "%" + GXutil.lower( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "F") == 0 ) ) ) )
                           {
                              if ( ( AV137Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV137Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
                              {
                                 GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                              }
                           }
                        }
                     }
                  }
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

   public void rfHJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21HJ2 ();
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
                                              A13722LecEstado ,
                                              AV137Tlectorwwds_25_tflecestado_sels ,
                                              AV115Tlectorwwds_3_tflecmaqcod_sel ,
                                              AV114Tlectorwwds_2_tflecmaqcod ,
                                              AV117Tlectorwwds_5_tflechdr_sel ,
                                              AV116Tlectorwwds_4_tflechdr ,
                                              Integer.valueOf(AV118Tlectorwwds_6_tflecopecod) ,
                                              Integer.valueOf(AV119Tlectorwwds_7_tflecopecod_to) ,
                                              AV123Tlectorwwds_11_tflecfascod_sel ,
                                              AV122Tlectorwwds_10_tflecfascod ,
                                              Short.valueOf(AV126Tlectorwwds_14_tflecfasord) ,
                                              Short.valueOf(AV127Tlectorwwds_15_tflecfasord_to) ,
                                              Short.valueOf(AV128Tlectorwwds_16_tflecparcod) ,
                                              Short.valueOf(AV129Tlectorwwds_17_tflecparcod_to) ,
                                              AV133Tlectorwwds_21_tflechor_sel ,
                                              AV132Tlectorwwds_20_tflechor ,
                                              AV134Tlectorwwds_22_tflecfec ,
                                              AV136Tlectorwwds_24_tflectipent_sel ,
                                              AV135Tlectorwwds_23_tflectipent ,
                                              A1166LecMaqCod ,
                                              Integer.valueOf(A1167LecBarCod) ,
                                              Byte.valueOf(A1168LecBarReo) ,
                                              A1169LecBarPar ,
                                              Integer.valueOf(A1170LecOpeCod) ,
                                              A1171LecFasCod ,
                                              Short.valueOf(A1188LecFasOrd) ,
                                              Short.valueOf(A1172LecParCod) ,
                                              A1173LecHor ,
                                              A1174LecFec ,
                                              A1796LecTipEnt ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV113Tlectorwwds_1_filterfulltext ,
                                              A13721LecHdr ,
                                              A14259lecOpeNom ,
                                              A14260LecFasDsc ,
                                              A14261LecParNom ,
                                              AV121Tlectorwwds_9_tflecopenom_sel ,
                                              AV120Tlectorwwds_8_tflecopenom ,
                                              AV125Tlectorwwds_13_tflecfasdsc_sel ,
                                              AV124Tlectorwwds_12_tflecfasdsc ,
                                              AV131Tlectorwwds_19_tflecparnom_sel ,
                                              AV130Tlectorwwds_18_tflecparnom ,
                                              Integer.valueOf(AV137Tlectorwwds_25_tflecestado_sels.size()) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV114Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV114Tlectorwwds_2_tflecmaqcod), 6, "%") ;
         lV116Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV116Tlectorwwds_4_tflechdr), 11, "%") ;
         lV122Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV122Tlectorwwds_10_tflecfascod), 8, "%") ;
         lV132Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV132Tlectorwwds_20_tflechor), 8, "%") ;
         lV135Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV135Tlectorwwds_23_tflectipent), 1, "%") ;
         /* Using cursor H00HJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV137Tlectorwwds_25_tflecestado_sels.size()), lV114Tlectorwwds_2_tflecmaqcod, AV115Tlectorwwds_3_tflecmaqcod_sel, lV116Tlectorwwds_4_tflechdr, AV117Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV118Tlectorwwds_6_tflecopecod), Integer.valueOf(AV119Tlectorwwds_7_tflecopecod_to), lV122Tlectorwwds_10_tflecfascod, AV123Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV126Tlectorwwds_14_tflecfasord), Short.valueOf(AV127Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV128Tlectorwwds_16_tflecparcod), Short.valueOf(AV129Tlectorwwds_17_tflecparcod_to), lV132Tlectorwwds_20_tflechor, AV133Tlectorwwds_21_tflechor_sel, AV134Tlectorwwds_22_tflecfec, lV135Tlectorwwds_23_tflectipent, AV136Tlectorwwds_24_tflectipent_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1796LecTipEnt = H00HJ3_A1796LecTipEnt[0] ;
            n1796LecTipEnt = H00HJ3_n1796LecTipEnt[0] ;
            A1174LecFec = H00HJ3_A1174LecFec[0] ;
            n1174LecFec = H00HJ3_n1174LecFec[0] ;
            A1173LecHor = H00HJ3_A1173LecHor[0] ;
            n1173LecHor = H00HJ3_n1173LecHor[0] ;
            A13721LecHdr = H00HJ3_A13721LecHdr[0] ;
            A1166LecMaqCod = H00HJ3_A1166LecMaqCod[0] ;
            A1170LecOpeCod = H00HJ3_A1170LecOpeCod[0] ;
            n1170LecOpeCod = H00HJ3_n1170LecOpeCod[0] ;
            A1171LecFasCod = H00HJ3_A1171LecFasCod[0] ;
            n1171LecFasCod = H00HJ3_n1171LecFasCod[0] ;
            A1172LecParCod = H00HJ3_A1172LecParCod[0] ;
            n1172LecParCod = H00HJ3_n1172LecParCod[0] ;
            A1188LecFasOrd = H00HJ3_A1188LecFasOrd[0] ;
            n1188LecFasOrd = H00HJ3_n1188LecFasOrd[0] ;
            A1169LecBarPar = H00HJ3_A1169LecBarPar[0] ;
            n1169LecBarPar = H00HJ3_n1169LecBarPar[0] ;
            A1168LecBarReo = H00HJ3_A1168LecBarReo[0] ;
            n1168LecBarReo = H00HJ3_n1168LecBarReo[0] ;
            A1167LecBarCod = H00HJ3_A1167LecBarCod[0] ;
            n1167LecBarCod = H00HJ3_n1167LecBarCod[0] ;
            GXt_char1 = A14259lecOpeNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
            tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
            A14259lecOpeNom = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV121Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV120Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV120Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV121Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV121Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char1 = A14260LecFasDsc ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
                  tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
                  A14260LecFasDsc = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV125Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV124Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV125Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV125Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char1 = A14261LecParNom ;
                        GXv_char2[0] = GXt_char1 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
                        tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
                        A14261LecParNom = GXt_char1 ;
                        if ( ! ( (GXutil.strcmp("", AV131Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV130Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV131Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV131Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                           {
                              GXt_char1 = A13722LecEstado ;
                              GXv_char2[0] = GXt_char1 ;
                              new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
                              tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
                              A13722LecEstado = GXt_char1 ;
                              if ( (GXutil.strcmp("", AV113Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV113Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "proceso", "") , GXutil.padr( "%" + GXutil.lower( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "finalizadas", "") , GXutil.padr( "%" + GXutil.lower( AV113Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "F") == 0 ) ) ) )
                              {
                                 if ( ( AV137Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV137Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
                                 {
                                    e22HJ2 ();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wbHJ0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesHJ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_LECMAQCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A1166LecMaqCod, ""))));
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
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV96FilterFullText, AV40TFLecMaqCod, AV41TFLecMaqCod_Sel, AV97TFLecHdr, AV98TFLecHdr_Sel, AV55TFLecOpeCod, AV56TFLecOpeCod_To, AV100TFlecOpeNom, AV101TFlecOpeNom_Sel, AV61TFLecFasCod, AV62TFLecFasCod_Sel, AV102TFLecFasDsc, AV103TFLecFasDsc_Sel, AV67TFLecFasOrd, AV68TFLecFasOrd_To, AV70TFLecParCod, AV71TFLecParCod_To, AV104TFLecParNom, AV105TFLecParNom_Sel, AV76TFLecHor, AV77TFLecHor_Sel, AV79TFLecFec, AV84TFLecTipEnt, AV85TFLecTipEnt_Sel, AV95TFLecEstado_Sels, AV111Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV111Pgmname = "TLECTORWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupHJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20HJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV87DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV89GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV90GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV96FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96FilterFullText", AV96FilterFullText);
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LECFECAUXDATE");
            GX_FocusControl = edtavDdo_lecfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81DDO_LecFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81DDO_LecFecAuxDate", localUtil.format(AV81DDO_LecFecAuxDate, "99/99/99"));
         }
         else
         {
            AV81DDO_LecFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81DDO_LecFecAuxDate", localUtil.format(AV81DDO_LecFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TLECTORWW");
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111Pgmname", AV111Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tlectorww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e20HJ2 ();
      if (returnInSub) return;
   }

   public void e20HJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV107Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tlectorww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV107Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV106EmprNom ;
      GXv_char4[0] = AV108UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV107Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlectorww_impl.this.A396EmprCod = GXv_char2[0] ;
      tlectorww_impl.this.AV106EmprNom = GXv_char3[0] ;
      tlectorww_impl.this.AV108UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_char1 = AV107Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tlectorww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV107Station = GXt_char1 ;
      GXv_char4[0] = AV112Emprcod ;
      GXv_char3[0] = AV106EmprNom ;
      GXv_char2[0] = AV108UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV107Station, GXv_char4, GXv_char3, GXv_char2) ;
      tlectorww_impl.this.AV112Emprcod = GXv_char4[0] ;
      tlectorww_impl.this.AV106EmprNom = GXv_char3[0] ;
      tlectorww_impl.this.AV108UsurCod = GXv_char2[0] ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento tabla LECTOR", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV87DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV87DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21HJ2( )
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
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("TLECTORWWColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("TLECTORWWColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtLecMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecHdr_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtlecOpeNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtlecOpeNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlecOpeNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasOrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasOrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasOrd_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecParNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecHor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecHor_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecTipEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecTipEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecTipEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbLecEstado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLecEstado.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV89GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GridCurrentPage), 10, 0));
      AV90GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GridPageCount), 10, 0));
      AV113Tlectorwwds_1_filterfulltext = AV96FilterFullText ;
      AV114Tlectorwwds_2_tflecmaqcod = AV40TFLecMaqCod ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = AV41TFLecMaqCod_Sel ;
      AV116Tlectorwwds_4_tflechdr = AV97TFLecHdr ;
      AV117Tlectorwwds_5_tflechdr_sel = AV98TFLecHdr_Sel ;
      AV118Tlectorwwds_6_tflecopecod = AV55TFLecOpeCod ;
      AV119Tlectorwwds_7_tflecopecod_to = AV56TFLecOpeCod_To ;
      AV120Tlectorwwds_8_tflecopenom = AV100TFlecOpeNom ;
      AV121Tlectorwwds_9_tflecopenom_sel = AV101TFlecOpeNom_Sel ;
      AV122Tlectorwwds_10_tflecfascod = AV61TFLecFasCod ;
      AV123Tlectorwwds_11_tflecfascod_sel = AV62TFLecFasCod_Sel ;
      AV124Tlectorwwds_12_tflecfasdsc = AV102TFLecFasDsc ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = AV103TFLecFasDsc_Sel ;
      AV126Tlectorwwds_14_tflecfasord = AV67TFLecFasOrd ;
      AV127Tlectorwwds_15_tflecfasord_to = AV68TFLecFasOrd_To ;
      AV128Tlectorwwds_16_tflecparcod = AV70TFLecParCod ;
      AV129Tlectorwwds_17_tflecparcod_to = AV71TFLecParCod_To ;
      AV130Tlectorwwds_18_tflecparnom = AV104TFLecParNom ;
      AV131Tlectorwwds_19_tflecparnom_sel = AV105TFLecParNom_Sel ;
      AV132Tlectorwwds_20_tflechor = AV76TFLecHor ;
      AV133Tlectorwwds_21_tflechor_sel = AV77TFLecHor_Sel ;
      AV134Tlectorwwds_22_tflecfec = AV79TFLecFec ;
      AV135Tlectorwwds_23_tflectipent = AV84TFLecTipEnt ;
      AV136Tlectorwwds_24_tflectipent_sel = AV85TFLecTipEnt_Sel ;
      AV137Tlectorwwds_25_tflecestado_sels = AV95TFLecEstado_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12HJ2( )
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
         AV88PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV88PageToGo) ;
      }
   }

   public void e13HJ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14HJ2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecMaqCod") == 0 )
         {
            AV40TFLecMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecMaqCod", AV40TFLecMaqCod);
            AV41TFLecMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLecMaqCod_Sel", AV41TFLecMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecHdr") == 0 )
         {
            AV97TFLecHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFLecHdr", AV97TFLecHdr);
            AV98TFLecHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFLecHdr_Sel", AV98TFLecHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecOpeCod") == 0 )
         {
            AV55TFLecOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLecOpeCod), 6, 0));
            AV56TFLecOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFLecOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLecOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "lecOpeNom") == 0 )
         {
            AV100TFlecOpeNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFlecOpeNom", AV100TFlecOpeNom);
            AV101TFlecOpeNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFlecOpeNom_Sel", AV101TFlecOpeNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasCod") == 0 )
         {
            AV61TFLecFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFLecFasCod", AV61TFLecFasCod);
            AV62TFLecFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFLecFasCod_Sel", AV62TFLecFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasDsc") == 0 )
         {
            AV102TFLecFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFLecFasDsc", AV102TFLecFasDsc);
            AV103TFLecFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFLecFasDsc_Sel", AV103TFLecFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasOrd") == 0 )
         {
            AV67TFLecFasOrd = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFLecFasOrd), 4, 0));
            AV68TFLecFasOrd_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFLecFasOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLecFasOrd_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParCod") == 0 )
         {
            AV70TFLecParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLecParCod), 4, 0));
            AV71TFLecParCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFLecParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLecParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParNom") == 0 )
         {
            AV104TFLecParNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFLecParNom", AV104TFLecParNom);
            AV105TFLecParNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFLecParNom_Sel", AV105TFLecParNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecHor") == 0 )
         {
            AV76TFLecHor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFLecHor", AV76TFLecHor);
            AV77TFLecHor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFLecHor_Sel", AV77TFLecHor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFec") == 0 )
         {
            AV79TFLecFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFLecFec", localUtil.format(AV79TFLecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecTipEnt") == 0 )
         {
            AV84TFLecTipEnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFLecTipEnt", AV84TFLecTipEnt);
            AV85TFLecTipEnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFLecTipEnt_Sel", AV85TFLecTipEnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecEstado") == 0 )
         {
            AV94TFLecEstado_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFLecEstado_SelsJson", AV94TFLecEstado_SelsJson);
            AV95TFLecEstado_Sels.fromJSonString(AV94TFLecEstado_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFLecEstado_Sels", AV95TFLecEstado_Sels);
   }

   private void e22HJ2( )
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV99GridActions, 4, 0)) );
   }

   public void e15HJ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TLECTORWWColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11HJ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TLECTORWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV111Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TLECTORWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV37ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TLECTORWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tlectorww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV37ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV37ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV37ManageFiltersXml) ;
            AV10GridState.fromxml(AV37ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFLecEstado_Sels", AV95TFLecEstado_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e16HJ2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17HJ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV29ExcelFilename ;
      GXv_char3[0] = AV30ErrorMessage ;
      new app.tlectorwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tlectorww_impl.this.AV29ExcelFilename = GXv_char4[0] ;
      tlectorww_impl.this.AV30ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFLecEstado_Sels", AV95TFLecEstado_Sels);
   }

   public void e18HJ2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tlectorwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFLecEstado_Sels", AV95TFLecEstado_Sels);
   }

   public void e19HJ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tlectorwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFLecEstado_Sels", AV95TFLecEstado_Sels);
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
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecMaqCod", "", "Maquina", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecHdr", "", "Hdr", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecOpeCod", "", "Operario", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "lecOpeNom", "", "Nombre", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasCod", "", "Fase", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasDsc", "", "Descripcion", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasOrd", "", "Orden", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecParCod", "", "Paro", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecParNom", "", "Descripcion", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecHor", "", "Hora", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFec", "", "Fecha", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecTipEnt", "", "Tipo", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecEstado", "", "Estado", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TLECTORWWColumnsSelector", GXv_char4) ;
      tlectorww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TLECTORWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV96FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96FilterFullText", AV96FilterFullText);
      AV40TFLecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecMaqCod", AV40TFLecMaqCod);
      AV41TFLecMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFLecMaqCod_Sel", AV41TFLecMaqCod_Sel);
      AV97TFLecHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFLecHdr", AV97TFLecHdr);
      AV98TFLecHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFLecHdr_Sel", AV98TFLecHdr_Sel);
      AV55TFLecOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLecOpeCod), 6, 0));
      AV56TFLecOpeCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFLecOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLecOpeCod_To), 6, 0));
      AV100TFlecOpeNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFlecOpeNom", AV100TFlecOpeNom);
      AV101TFlecOpeNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFlecOpeNom_Sel", AV101TFlecOpeNom_Sel);
      AV61TFLecFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFLecFasCod", AV61TFLecFasCod);
      AV62TFLecFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFLecFasCod_Sel", AV62TFLecFasCod_Sel);
      AV102TFLecFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFLecFasDsc", AV102TFLecFasDsc);
      AV103TFLecFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFLecFasDsc_Sel", AV103TFLecFasDsc_Sel);
      AV67TFLecFasOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFLecFasOrd), 4, 0));
      AV68TFLecFasOrd_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFLecFasOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLecFasOrd_To), 4, 0));
      AV70TFLecParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLecParCod), 4, 0));
      AV71TFLecParCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFLecParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLecParCod_To), 4, 0));
      AV104TFLecParNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFLecParNom", AV104TFLecParNom);
      AV105TFLecParNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFLecParNom_Sel", AV105TFLecParNom_Sel);
      AV76TFLecHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFLecHor", AV76TFLecHor);
      AV77TFLecHor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFLecHor_Sel", AV77TFLecHor_Sel);
      AV79TFLecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFLecFec", localUtil.format(AV79TFLecFec, "99/99/99"));
      AV84TFLecTipEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFLecTipEnt", AV84TFLecTipEnt);
      AV85TFLecTipEnt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFLecTipEnt_Sel", AV85TFLecTipEnt_Sel);
      AV95TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
         callWebObject(formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tlector", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV111Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV111Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV35Session.getValue(AV111Pgmname+"GridState"), null, null);
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
      AV138GXV1 = 1 ;
      while ( AV138GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV138GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV96FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96FilterFullText", AV96FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV40TFLecMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecMaqCod", AV40TFLecMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV41TFLecMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLecMaqCod_Sel", AV41TFLecMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV97TFLecHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFLecHdr", AV97TFLecHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV98TFLecHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFLecHdr_Sel", AV98TFLecHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV55TFLecOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFLecOpeCod), 6, 0));
            AV56TFLecOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFLecOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFLecOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV100TFlecOpeNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFlecOpeNom", AV100TFlecOpeNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV101TFlecOpeNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFlecOpeNom_Sel", AV101TFlecOpeNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV61TFLecFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFLecFasCod", AV61TFLecFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD_SEL") == 0 )
         {
            AV62TFLecFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFLecFasCod_Sel", AV62TFLecFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV102TFLecFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFLecFasDsc", AV102TFLecFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV103TFLecFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFLecFasDsc_Sel", AV103TFLecFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV67TFLecFasOrd = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFLecFasOrd), 4, 0));
            AV68TFLecFasOrd_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFLecFasOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFLecFasOrd_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV70TFLecParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFLecParCod), 4, 0));
            AV71TFLecParCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFLecParCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFLecParCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV104TFLecParNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFLecParNom", AV104TFLecParNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV105TFLecParNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFLecParNom_Sel", AV105TFLecParNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV76TFLecHor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFLecHor", AV76TFLecHor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR_SEL") == 0 )
         {
            AV77TFLecHor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFLecHor_Sel", AV77TFLecHor_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV79TFLecFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFLecFec", localUtil.format(AV79TFLecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV84TFLecTipEnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFLecTipEnt", AV84TFLecTipEnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT_SEL") == 0 )
         {
            AV85TFLecTipEnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFLecTipEnt_Sel", AV85TFLecTipEnt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV94TFLecEstado_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFLecEstado_SelsJson", AV94TFLecEstado_SelsJson);
            AV95TFLecEstado_Sels.fromJSonString(AV94TFLecEstado_SelsJson, null);
         }
         AV138GXV1 = (int)(AV138GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLecMaqCod_Sel)==0), AV41TFLecMaqCod_Sel, GXv_char4) ;
      tlectorww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFLecHdr_Sel)==0), AV98TFLecHdr_Sel, GXv_char3) ;
      tlectorww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFlecOpeNom_Sel)==0), AV101TFlecOpeNom_Sel, GXv_char2) ;
      tlectorww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFLecFasCod_Sel)==0), AV62TFLecFasCod_Sel, GXv_char15) ;
      tlectorww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFLecFasDsc_Sel)==0), AV103TFLecFasDsc_Sel, GXv_char17) ;
      tlectorww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFLecParNom_Sel)==0), AV105TFLecParNom_Sel, GXv_char19) ;
      tlectorww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFLecHor_Sel)==0), AV77TFLecHor_Sel, GXv_char21) ;
      tlectorww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFLecTipEnt_Sel)==0), AV85TFLecTipEnt_Sel, GXv_char23) ;
      tlectorww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV95TFLecEstado_Sels.size()==0), AV94TFLecEstado_SelsJson, GXv_char25) ;
      tlectorww_impl.this.GXt_char24 = GXv_char25[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|||"+GXt_char18+"|"+GXt_char20+"||"+GXt_char22+"|"+GXt_char24 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLecMaqCod)==0), AV40TFLecMaqCod, GXv_char25) ;
      tlectorww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFLecHdr)==0), AV97TFLecHdr, GXv_char23) ;
      tlectorww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFlecOpeNom)==0), AV100TFlecOpeNom, GXv_char21) ;
      tlectorww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFLecFasCod)==0), AV61TFLecFasCod, GXv_char19) ;
      tlectorww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFLecFasDsc)==0), AV102TFLecFasDsc, GXv_char17) ;
      tlectorww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFLecParNom)==0), AV104TFLecParNom, GXv_char15) ;
      tlectorww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFLecHor)==0), AV76TFLecHor, GXv_char4) ;
      tlectorww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFLecTipEnt)==0), AV84TFLecTipEnt, GXv_char3) ;
      tlectorww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char24+"|"+GXt_char22+"|"+((0==AV55TFLecOpeCod) ? "" : GXutil.str( AV55TFLecOpeCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV67TFLecFasOrd) ? "" : GXutil.str( AV67TFLecFasOrd, 4, 0))+"|"+((0==AV70TFLecParCod) ? "" : GXutil.str( AV70TFLecParCod, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFLecFec)) ? "" : localUtil.dtoc( AV79TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char12+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV56TFLecOpeCod_To) ? "" : GXutil.str( AV56TFLecOpeCod_To, 6, 0))+"||||"+((0==AV68TFLecFasOrd_To) ? "" : GXutil.str( AV68TFLecFasOrd_To, 4, 0))+"|"+((0==AV71TFLecParCod_To) ? "" : GXutil.str( AV71TFLecParCod_To, 4, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV35Session.getValue(AV111Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV96FilterFullText)==0), (short)(0), AV96FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECMAQCOD", "", !(GXutil.strcmp("", AV40TFLecMaqCod)==0), (short)(0), AV40TFLecMaqCod, "", !(GXutil.strcmp("", AV41TFLecMaqCod_Sel)==0), AV41TFLecMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECHDR", "", !(GXutil.strcmp("", AV97TFLecHdr)==0), (short)(0), AV97TFLecHdr, "", !(GXutil.strcmp("", AV98TFLecHdr_Sel)==0), AV98TFLecHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECOPECOD", "", !((0==AV55TFLecOpeCod)&&(0==AV56TFLecOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFLecOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV56TFLecOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECOPENOM", "", !(GXutil.strcmp("", AV100TFlecOpeNom)==0), (short)(0), AV100TFlecOpeNom, "", !(GXutil.strcmp("", AV101TFlecOpeNom_Sel)==0), AV101TFlecOpeNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECFASCOD", "", !(GXutil.strcmp("", AV61TFLecFasCod)==0), (short)(0), AV61TFLecFasCod, "", !(GXutil.strcmp("", AV62TFLecFasCod_Sel)==0), AV62TFLecFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECFASDSC", "", !(GXutil.strcmp("", AV102TFLecFasDsc)==0), (short)(0), AV102TFLecFasDsc, "", !(GXutil.strcmp("", AV103TFLecFasDsc_Sel)==0), AV103TFLecFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECFASORD", "", !((0==AV67TFLecFasOrd)&&(0==AV68TFLecFasOrd_To)), (short)(0), GXutil.trim( GXutil.str( AV67TFLecFasOrd, 4, 0)), GXutil.trim( GXutil.str( AV68TFLecFasOrd_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECPARCOD", "", !((0==AV70TFLecParCod)&&(0==AV71TFLecParCod_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFLecParCod, 4, 0)), GXutil.trim( GXutil.str( AV71TFLecParCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECPARNOM", "", !(GXutil.strcmp("", AV104TFLecParNom)==0), (short)(0), AV104TFLecParNom, "", !(GXutil.strcmp("", AV105TFLecParNom_Sel)==0), AV105TFLecParNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECHOR", "", !(GXutil.strcmp("", AV76TFLecHor)==0), (short)(0), AV76TFLecHor, "", !(GXutil.strcmp("", AV77TFLecHor_Sel)==0), AV77TFLecHor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFLecFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV79TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECTIPENT", "", !(GXutil.strcmp("", AV84TFLecTipEnt)==0), (short)(0), AV84TFLecTipEnt, "", !(GXutil.strcmp("", AV85TFLecTipEnt_Sel)==0), AV85TFLecTipEnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      GXv_SdtWWPGridState26[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState26, "TFLECESTADO_SEL", "", !(AV95TFLecEstado_Sels.size()==0), (short)(0), AV95TFLecEstado_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState26[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV111Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TLECTOR" );
      AV35Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_HJ2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_HJ2( true) ;
      }
      else
      {
         wb_table2_32_HJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_HJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_HJ2e( true) ;
      }
      else
      {
         wb_table1_27_HJ2e( false) ;
      }
   }

   public void wb_table2_32_HJ2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV96FilterFullText, GXutil.rtrim( localUtil.format( AV96FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TLECTORWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_HJ2e( true) ;
      }
      else
      {
         wb_table2_32_HJ2e( false) ;
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
      paHJ2( ) ;
      wsHJ2( ) ;
      weHJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211612934", true, true);
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
      httpContext.AddJavascriptSource("tlectorww.js", "?20268211612935", false, true);
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
      edtLecMaqCod_Internalname = "LECMAQCOD_"+sGXsfl_45_idx ;
      edtLecHdr_Internalname = "LECHDR_"+sGXsfl_45_idx ;
      edtLecBarCod_Internalname = "LECBARCOD_"+sGXsfl_45_idx ;
      edtLecBarReo_Internalname = "LECBARREO_"+sGXsfl_45_idx ;
      edtLecBarPar_Internalname = "LECBARPAR_"+sGXsfl_45_idx ;
      edtLecOpeCod_Internalname = "LECOPECOD_"+sGXsfl_45_idx ;
      edtlecOpeNom_Internalname = "LECOPENOM_"+sGXsfl_45_idx ;
      edtLecFasCod_Internalname = "LECFASCOD_"+sGXsfl_45_idx ;
      edtLecFasDsc_Internalname = "LECFASDSC_"+sGXsfl_45_idx ;
      edtLecFasOrd_Internalname = "LECFASORD_"+sGXsfl_45_idx ;
      edtLecParCod_Internalname = "LECPARCOD_"+sGXsfl_45_idx ;
      edtLecParNom_Internalname = "LECPARNOM_"+sGXsfl_45_idx ;
      edtLecHor_Internalname = "LECHOR_"+sGXsfl_45_idx ;
      edtLecFec_Internalname = "LECFEC_"+sGXsfl_45_idx ;
      edtLecTipEnt_Internalname = "LECTIPENT_"+sGXsfl_45_idx ;
      cmbLecEstado.setInternalname( "LECESTADO_"+sGXsfl_45_idx );
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtLecMaqCod_Internalname = "LECMAQCOD_"+sGXsfl_45_fel_idx ;
      edtLecHdr_Internalname = "LECHDR_"+sGXsfl_45_fel_idx ;
      edtLecBarCod_Internalname = "LECBARCOD_"+sGXsfl_45_fel_idx ;
      edtLecBarReo_Internalname = "LECBARREO_"+sGXsfl_45_fel_idx ;
      edtLecBarPar_Internalname = "LECBARPAR_"+sGXsfl_45_fel_idx ;
      edtLecOpeCod_Internalname = "LECOPECOD_"+sGXsfl_45_fel_idx ;
      edtlecOpeNom_Internalname = "LECOPENOM_"+sGXsfl_45_fel_idx ;
      edtLecFasCod_Internalname = "LECFASCOD_"+sGXsfl_45_fel_idx ;
      edtLecFasDsc_Internalname = "LECFASDSC_"+sGXsfl_45_fel_idx ;
      edtLecFasOrd_Internalname = "LECFASORD_"+sGXsfl_45_fel_idx ;
      edtLecParCod_Internalname = "LECPARCOD_"+sGXsfl_45_fel_idx ;
      edtLecParNom_Internalname = "LECPARNOM_"+sGXsfl_45_fel_idx ;
      edtLecHor_Internalname = "LECHOR_"+sGXsfl_45_fel_idx ;
      edtLecFec_Internalname = "LECFEC_"+sGXsfl_45_fel_idx ;
      edtLecTipEnt_Internalname = "LECTIPENT_"+sGXsfl_45_fel_idx ;
      cmbLecEstado.setInternalname( "LECESTADO_"+sGXsfl_45_fel_idx );
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbHJ0( ) ;
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
               AV99GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV99GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV99GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23hj2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV99GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecMaqCod_Internalname,GXutil.rtrim( A1166LecMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecHdr_Internalname,GXutil.rtrim( A13721LecHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarPar_Internalname,GXutil.rtrim( A1169LecBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1170LecOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtlecOpeNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtlecOpeNom_Internalname,GXutil.rtrim( A14259lecOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtlecOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtlecOpeNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFasCod_Internalname,GXutil.rtrim( A1171LecFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFasDsc_Internalname,GXutil.rtrim( A14260LecFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecFasOrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFasOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1188LecFasOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFasOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecFasOrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecParCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecParCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1172LecParCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecParCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecParCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecParNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecParNom_Internalname,GXutil.rtrim( A14261LecParNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecParNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecParNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecHor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecHor_Internalname,GXutil.rtrim( A1173LecHor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecHor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecFec_Internalname,localUtil.format(A1174LecFec, "99/99/99"),localUtil.format( A1174LecFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecTipEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecTipEnt_Internalname,GXutil.rtrim( A1796LecTipEnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecTipEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecTipEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbLecEstado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "LECESTADO_" + sGXsfl_45_idx ;
         cmbLecEstado.setName( GXCCtl );
         cmbLecEstado.setWebtags( "" );
         cmbLecEstado.addItem("P", httpContext.getMessage( "Proceso", ""), (short)(0));
         cmbLecEstado.addItem("F", httpContext.getMessage( "Finalizadas", ""), (short)(0));
         if ( cmbLecEstado.getItemCount() > 0 )
         {
            A13722LecEstado = cmbLecEstado.getValidValue(A13722LecEstado) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLecEstado,cmbLecEstado.getInternalname(),GXutil.rtrim( A13722LecEstado),Integer.valueOf(1),cmbLecEstado.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbLecEstado.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbLecEstado.setValue( GXutil.rtrim( A13722LecEstado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Values", cmbLecEstado.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         send_integrity_lvl_hashesHJ2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtlecOpeNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasOrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecHor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecTipEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbLecEstado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV99GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1166LecMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13721LecHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1169LecBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14259lecOpeNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtlecOpeNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1171LecFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14260LecFasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFasOrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecParCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14261LecParNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecParNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1173LecHor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecHor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A1174LecFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1796LecTipEnt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecTipEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13722LecEstado));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbLecEstado.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtLecMaqCod_Internalname = "LECMAQCOD" ;
      edtLecHdr_Internalname = "LECHDR" ;
      edtLecBarCod_Internalname = "LECBARCOD" ;
      edtLecBarReo_Internalname = "LECBARREO" ;
      edtLecBarPar_Internalname = "LECBARPAR" ;
      edtLecOpeCod_Internalname = "LECOPECOD" ;
      edtlecOpeNom_Internalname = "LECOPENOM" ;
      edtLecFasCod_Internalname = "LECFASCOD" ;
      edtLecFasDsc_Internalname = "LECFASDSC" ;
      edtLecFasOrd_Internalname = "LECFASORD" ;
      edtLecParCod_Internalname = "LECPARCOD" ;
      edtLecParNom_Internalname = "LECPARNOM" ;
      edtLecHor_Internalname = "LECHOR" ;
      edtLecFec_Internalname = "LECFEC" ;
      edtLecTipEnt_Internalname = "LECTIPENT" ;
      cmbLecEstado.setInternalname( "LECESTADO" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lecfecauxdate_Internalname = "vDDO_LECFECAUXDATE" ;
      divDdo_lecfecauxdates_Internalname = "DDO_LECFECAUXDATES" ;
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
      cmbLecEstado.setJsonclick( "" );
      edtLecTipEnt_Jsonclick = "" ;
      edtLecFec_Jsonclick = "" ;
      edtLecHor_Jsonclick = "" ;
      edtLecParNom_Jsonclick = "" ;
      edtLecParCod_Jsonclick = "" ;
      edtLecFasOrd_Jsonclick = "" ;
      edtLecFasDsc_Jsonclick = "" ;
      edtLecFasCod_Jsonclick = "" ;
      edtlecOpeNom_Jsonclick = "" ;
      edtLecOpeCod_Jsonclick = "" ;
      edtLecBarPar_Jsonclick = "" ;
      edtLecBarReo_Jsonclick = "" ;
      edtLecBarCod_Jsonclick = "" ;
      edtLecHdr_Jsonclick = "" ;
      edtLecMaqCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbLecEstado.setVisible( -1 );
      edtLecTipEnt_Visible = -1 ;
      edtLecFec_Visible = -1 ;
      edtLecHor_Visible = -1 ;
      edtLecParNom_Visible = -1 ;
      edtLecParCod_Visible = -1 ;
      edtLecFasOrd_Visible = -1 ;
      edtLecFasDsc_Visible = -1 ;
      edtLecFasCod_Visible = -1 ;
      edtlecOpeNom_Visible = -1 ;
      edtLecOpeCod_Visible = -1 ;
      edtLecHdr_Visible = -1 ;
      edtLecMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lecfecauxdate_Jsonclick = "" ;
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
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TLECTORWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||P:Proceso,F:Finalizadas" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||T" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "T|T||T|T|T|||T|T||T|T" ;
      Ddo_grid_Filterisrange = "||T||||T|T|||||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Date|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T||T||T||T|T||T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2||3||4||5|6||7|8|9|" ;
      Ddo_grid_Columnids = "1:LecMaqCod|2:LecHdr|6:LecOpeCod|7:lecOpeNom|8:LecFasCod|9:LecFasDsc|10:LecFasOrd|11:LecParCod|12:LecParNom|13:LecHor|14:LecFec|15:LecTipEnt|16:LecEstado" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento tabla LECTOR", "") );
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
         AV99GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV99GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GridActions), 4, 0));
      }
      GXCCtl = "LECESTADO_" + sGXsfl_45_idx ;
      cmbLecEstado.setName( GXCCtl );
      cmbLecEstado.setWebtags( "" );
      cmbLecEstado.addItem("P", httpContext.getMessage( "Proceso", ""), (short)(0));
      cmbLecEstado.addItem("F", httpContext.getMessage( "Finalizadas", ""), (short)(0));
      if ( cmbLecEstado.getItemCount() > 0 )
      {
         A13722LecEstado = cmbLecEstado.getValidValue(A13722LecEstado) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV89GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV90GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22HJ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV99GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV89GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV90GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11HJ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecHdr_Visible',ctrl:'LECHDR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV89GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV90GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23HJ2',iparms:[{av:'cmbavGridactions'},{av:'AV99GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV99GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16HJ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17HJ2',iparms:[{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18HJ2',iparms:[{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19HJ2',iparms:[{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV96FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV41TFLecMaqCod_Sel',fld:'vTFLECMAQCOD_SEL',pic:''},{av:'AV97TFLecHdr',fld:'vTFLECHDR',pic:''},{av:'AV98TFLecHdr_Sel',fld:'vTFLECHDR_SEL',pic:''},{av:'AV55TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV56TFLecOpeCod_To',fld:'vTFLECOPECOD_TO',pic:'ZZZZZ9'},{av:'AV100TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV101TFlecOpeNom_Sel',fld:'vTFLECOPENOM_SEL',pic:''},{av:'AV61TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV62TFLecFasCod_Sel',fld:'vTFLECFASCOD_SEL',pic:''},{av:'AV102TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV103TFLecFasDsc_Sel',fld:'vTFLECFASDSC_SEL',pic:''},{av:'AV67TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV68TFLecFasOrd_To',fld:'vTFLECFASORD_TO',pic:'ZZZ9'},{av:'AV70TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV71TFLecParCod_To',fld:'vTFLECPARCOD_TO',pic:'ZZZ9'},{av:'AV104TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV105TFLecParNom_Sel',fld:'vTFLECPARNOM_SEL',pic:''},{av:'AV76TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV77TFLecHor_Sel',fld:'vTFLECHOR_SEL',pic:''},{av:'AV79TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV84TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV85TFLecTipEnt_Sel',fld:'vTFLECTIPENT_SEL',pic:''},{av:'AV95TFLecEstado_Sels',fld:'vTFLECESTADO_SELS',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV94TFLecEstado_SelsJson',fld:'vTFLECESTADO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_LECMAQCOD","{handler:'valid_Lecmaqcod',iparms:[]");
      setEventMetadata("VALID_LECMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_LECHDR","{handler:'valid_Lechdr',iparms:[]");
      setEventMetadata("VALID_LECHDR",",oparms:[]}");
      setEventMetadata("VALID_LECBARCOD","{handler:'valid_Lecbarcod',iparms:[]");
      setEventMetadata("VALID_LECBARCOD",",oparms:[]}");
      setEventMetadata("VALID_LECBARREO","{handler:'valid_Lecbarreo',iparms:[]");
      setEventMetadata("VALID_LECBARREO",",oparms:[]}");
      setEventMetadata("VALID_LECBARPAR","{handler:'valid_Lecbarpar',iparms:[]");
      setEventMetadata("VALID_LECBARPAR",",oparms:[]}");
      setEventMetadata("VALID_LECOPECOD","{handler:'valid_Lecopecod',iparms:[]");
      setEventMetadata("VALID_LECOPECOD",",oparms:[]}");
      setEventMetadata("VALID_LECOPENOM","{handler:'valid_Lecopenom',iparms:[]");
      setEventMetadata("VALID_LECOPENOM",",oparms:[]}");
      setEventMetadata("VALID_LECFASCOD","{handler:'valid_Lecfascod',iparms:[]");
      setEventMetadata("VALID_LECFASCOD",",oparms:[]}");
      setEventMetadata("VALID_LECFASDSC","{handler:'valid_Lecfasdsc',iparms:[]");
      setEventMetadata("VALID_LECFASDSC",",oparms:[]}");
      setEventMetadata("VALID_LECFASORD","{handler:'valid_Lecfasord',iparms:[]");
      setEventMetadata("VALID_LECFASORD",",oparms:[]}");
      setEventMetadata("VALID_LECPARCOD","{handler:'valid_Lecparcod',iparms:[]");
      setEventMetadata("VALID_LECPARCOD",",oparms:[]}");
      setEventMetadata("VALID_LECPARNOM","{handler:'valid_Lecparnom',iparms:[]");
      setEventMetadata("VALID_LECPARNOM",",oparms:[]}");
      setEventMetadata("VALID_LECHOR","{handler:'valid_Lechor',iparms:[]");
      setEventMetadata("VALID_LECHOR",",oparms:[]}");
      setEventMetadata("VALID_LECTIPENT","{handler:'valid_Lectipent',iparms:[]");
      setEventMetadata("VALID_LECTIPENT",",oparms:[]}");
      setEventMetadata("VALID_LECESTADO","{handler:'valid_Lecestado',iparms:[]");
      setEventMetadata("VALID_LECESTADO",",oparms:[]}");
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
      A396EmprCod = "" ;
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV96FilterFullText = "" ;
      AV40TFLecMaqCod = "" ;
      AV41TFLecMaqCod_Sel = "" ;
      AV97TFLecHdr = "" ;
      AV98TFLecHdr_Sel = "" ;
      AV100TFlecOpeNom = "" ;
      AV101TFlecOpeNom_Sel = "" ;
      AV61TFLecFasCod = "" ;
      AV62TFLecFasCod_Sel = "" ;
      AV102TFLecFasDsc = "" ;
      AV103TFLecFasDsc_Sel = "" ;
      AV104TFLecParNom = "" ;
      AV105TFLecParNom_Sel = "" ;
      AV76TFLecHor = "" ;
      AV77TFLecHor_Sel = "" ;
      AV79TFLecFec = GXutil.nullDate() ;
      AV84TFLecTipEnt = "" ;
      AV85TFLecTipEnt_Sel = "" ;
      AV95TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV87DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV94TFLecEstado_SelsJson = "" ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV81DDO_LecFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1166LecMaqCod = "" ;
      A13721LecHdr = "" ;
      A1169LecBarPar = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV113Tlectorwwds_1_filterfulltext = "" ;
      AV114Tlectorwwds_2_tflecmaqcod = "" ;
      AV115Tlectorwwds_3_tflecmaqcod_sel = "" ;
      AV116Tlectorwwds_4_tflechdr = "" ;
      AV117Tlectorwwds_5_tflechdr_sel = "" ;
      AV120Tlectorwwds_8_tflecopenom = "" ;
      AV121Tlectorwwds_9_tflecopenom_sel = "" ;
      AV122Tlectorwwds_10_tflecfascod = "" ;
      AV123Tlectorwwds_11_tflecfascod_sel = "" ;
      AV124Tlectorwwds_12_tflecfasdsc = "" ;
      AV125Tlectorwwds_13_tflecfasdsc_sel = "" ;
      AV130Tlectorwwds_18_tflecparnom = "" ;
      AV131Tlectorwwds_19_tflecparnom_sel = "" ;
      AV132Tlectorwwds_20_tflechor = "" ;
      AV133Tlectorwwds_21_tflechor_sel = "" ;
      AV134Tlectorwwds_22_tflecfec = GXutil.nullDate() ;
      AV135Tlectorwwds_23_tflectipent = "" ;
      AV136Tlectorwwds_24_tflectipent_sel = "" ;
      AV137Tlectorwwds_25_tflecestado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV114Tlectorwwds_2_tflecmaqcod = "" ;
      lV116Tlectorwwds_4_tflechdr = "" ;
      lV122Tlectorwwds_10_tflecfascod = "" ;
      lV132Tlectorwwds_20_tflechor = "" ;
      lV135Tlectorwwds_23_tflectipent = "" ;
      H00HJ2_A1796LecTipEnt = new String[] {""} ;
      H00HJ2_n1796LecTipEnt = new boolean[] {false} ;
      H00HJ2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00HJ2_n1174LecFec = new boolean[] {false} ;
      H00HJ2_A1173LecHor = new String[] {""} ;
      H00HJ2_n1173LecHor = new boolean[] {false} ;
      H00HJ2_A13721LecHdr = new String[] {""} ;
      H00HJ2_A1166LecMaqCod = new String[] {""} ;
      H00HJ2_A396EmprCod = new String[] {""} ;
      H00HJ2_A1170LecOpeCod = new int[1] ;
      H00HJ2_n1170LecOpeCod = new boolean[] {false} ;
      H00HJ2_A1171LecFasCod = new String[] {""} ;
      H00HJ2_n1171LecFasCod = new boolean[] {false} ;
      H00HJ2_A1172LecParCod = new short[1] ;
      H00HJ2_n1172LecParCod = new boolean[] {false} ;
      H00HJ2_A1188LecFasOrd = new short[1] ;
      H00HJ2_n1188LecFasOrd = new boolean[] {false} ;
      H00HJ2_A1169LecBarPar = new String[] {""} ;
      H00HJ2_n1169LecBarPar = new boolean[] {false} ;
      H00HJ2_A1168LecBarReo = new byte[1] ;
      H00HJ2_n1168LecBarReo = new boolean[] {false} ;
      H00HJ2_A1167LecBarCod = new int[1] ;
      H00HJ2_n1167LecBarCod = new boolean[] {false} ;
      H00HJ3_A1796LecTipEnt = new String[] {""} ;
      H00HJ3_n1796LecTipEnt = new boolean[] {false} ;
      H00HJ3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00HJ3_n1174LecFec = new boolean[] {false} ;
      H00HJ3_A1173LecHor = new String[] {""} ;
      H00HJ3_n1173LecHor = new boolean[] {false} ;
      H00HJ3_A13721LecHdr = new String[] {""} ;
      H00HJ3_A1166LecMaqCod = new String[] {""} ;
      H00HJ3_A396EmprCod = new String[] {""} ;
      H00HJ3_A1170LecOpeCod = new int[1] ;
      H00HJ3_n1170LecOpeCod = new boolean[] {false} ;
      H00HJ3_A1171LecFasCod = new String[] {""} ;
      H00HJ3_n1171LecFasCod = new boolean[] {false} ;
      H00HJ3_A1172LecParCod = new short[1] ;
      H00HJ3_n1172LecParCod = new boolean[] {false} ;
      H00HJ3_A1188LecFasOrd = new short[1] ;
      H00HJ3_n1188LecFasOrd = new boolean[] {false} ;
      H00HJ3_A1169LecBarPar = new String[] {""} ;
      H00HJ3_n1169LecBarPar = new boolean[] {false} ;
      H00HJ3_A1168LecBarReo = new byte[1] ;
      H00HJ3_n1168LecBarReo = new boolean[] {false} ;
      H00HJ3_A1167LecBarCod = new int[1] ;
      H00HJ3_n1167LecBarCod = new boolean[] {false} ;
      hsh = "" ;
      AV107Station = "" ;
      AV106EmprNom = "" ;
      AV108UsurCod = "" ;
      AV112Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ManageFiltersXml = "" ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      AV32UserCustomValue = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorww__default(),
         new Object[] {
             new Object[] {
            H00HJ2_A1796LecTipEnt, H00HJ2_n1796LecTipEnt, H00HJ2_A1174LecFec, H00HJ2_n1174LecFec, H00HJ2_A1173LecHor, H00HJ2_n1173LecHor, H00HJ2_A13721LecHdr, H00HJ2_A1166LecMaqCod, H00HJ2_A396EmprCod, H00HJ2_A1170LecOpeCod,
            H00HJ2_n1170LecOpeCod, H00HJ2_A1171LecFasCod, H00HJ2_n1171LecFasCod, H00HJ2_A1172LecParCod, H00HJ2_n1172LecParCod, H00HJ2_A1188LecFasOrd, H00HJ2_n1188LecFasOrd, H00HJ2_A1169LecBarPar, H00HJ2_n1169LecBarPar, H00HJ2_A1168LecBarReo,
            H00HJ2_n1168LecBarReo, H00HJ2_A1167LecBarCod, H00HJ2_n1167LecBarCod
            }
            , new Object[] {
            H00HJ3_A1796LecTipEnt, H00HJ3_n1796LecTipEnt, H00HJ3_A1174LecFec, H00HJ3_n1174LecFec, H00HJ3_A1173LecHor, H00HJ3_n1173LecHor, H00HJ3_A13721LecHdr, H00HJ3_A1166LecMaqCod, H00HJ3_A396EmprCod, H00HJ3_A1170LecOpeCod,
            H00HJ3_n1170LecOpeCod, H00HJ3_A1171LecFasCod, H00HJ3_n1171LecFasCod, H00HJ3_A1172LecParCod, H00HJ3_n1172LecParCod, H00HJ3_A1188LecFasOrd, H00HJ3_n1188LecFasOrd, H00HJ3_A1169LecBarPar, H00HJ3_n1169LecBarPar, H00HJ3_A1168LecBarReo,
            H00HJ3_n1168LecBarReo, H00HJ3_A1167LecBarCod, H00HJ3_n1167LecBarCod
            }
         }
      );
      AV111Pgmname = "TLECTORWW" ;
      /* GeneXus formulas. */
      AV111Pgmname = "TLECTORWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A1168LecBarReo ;
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
   private short AV67TFLecFasOrd ;
   private short AV68TFLecFasOrd_To ;
   private short AV70TFLecParCod ;
   private short AV71TFLecParCod_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV99GridActions ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV126Tlectorwwds_14_tflecfasord ;
   private short AV127Tlectorwwds_15_tflecfasord_to ;
   private short AV128Tlectorwwds_16_tflecparcod ;
   private short AV129Tlectorwwds_17_tflecparcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV55TFLecOpeCod ;
   private int AV56TFLecOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int subGrid_Islastpage ;
   private int AV118Tlectorwwds_6_tflecopecod ;
   private int AV119Tlectorwwds_7_tflecopecod_to ;
   private int AV137Tlectorwwds_25_tflecestado_sels_size ;
   private int edtLecMaqCod_Visible ;
   private int edtLecHdr_Visible ;
   private int edtLecOpeCod_Visible ;
   private int edtlecOpeNom_Visible ;
   private int edtLecFasCod_Visible ;
   private int edtLecFasDsc_Visible ;
   private int edtLecFasOrd_Visible ;
   private int edtLecParCod_Visible ;
   private int edtLecParNom_Visible ;
   private int edtLecHor_Visible ;
   private int edtLecFec_Visible ;
   private int edtLecTipEnt_Visible ;
   private int AV88PageToGo ;
   private int AV138GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV89GridCurrentPage ;
   private long AV90GridPageCount ;
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
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String A396EmprCod ;
   private String AV40TFLecMaqCod ;
   private String AV41TFLecMaqCod_Sel ;
   private String AV97TFLecHdr ;
   private String AV98TFLecHdr_Sel ;
   private String AV100TFlecOpeNom ;
   private String AV101TFlecOpeNom_Sel ;
   private String AV61TFLecFasCod ;
   private String AV62TFLecFasCod_Sel ;
   private String AV102TFLecFasDsc ;
   private String AV103TFLecFasDsc_Sel ;
   private String AV104TFLecParNom ;
   private String AV105TFLecParNom_Sel ;
   private String AV76TFLecHor ;
   private String AV77TFLecHor_Sel ;
   private String AV84TFLecTipEnt ;
   private String AV85TFLecTipEnt_Sel ;
   private String AV111Pgmname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lecfecauxdates_Internalname ;
   private String edtavDdo_lecfecauxdate_Internalname ;
   private String edtavDdo_lecfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A1166LecMaqCod ;
   private String edtLecMaqCod_Internalname ;
   private String A13721LecHdr ;
   private String edtLecHdr_Internalname ;
   private String edtLecBarCod_Internalname ;
   private String edtLecBarReo_Internalname ;
   private String A1169LecBarPar ;
   private String edtLecBarPar_Internalname ;
   private String edtLecOpeCod_Internalname ;
   private String A14259lecOpeNom ;
   private String edtlecOpeNom_Internalname ;
   private String A1171LecFasCod ;
   private String edtLecFasCod_Internalname ;
   private String A14260LecFasDsc ;
   private String edtLecFasDsc_Internalname ;
   private String edtLecFasOrd_Internalname ;
   private String edtLecParCod_Internalname ;
   private String A14261LecParNom ;
   private String edtLecParNom_Internalname ;
   private String A1173LecHor ;
   private String edtLecHor_Internalname ;
   private String edtLecFec_Internalname ;
   private String A1796LecTipEnt ;
   private String edtLecTipEnt_Internalname ;
   private String A13722LecEstado ;
   private String edtavFilterfulltext_Internalname ;
   private String AV114Tlectorwwds_2_tflecmaqcod ;
   private String AV115Tlectorwwds_3_tflecmaqcod_sel ;
   private String AV116Tlectorwwds_4_tflechdr ;
   private String AV117Tlectorwwds_5_tflechdr_sel ;
   private String AV120Tlectorwwds_8_tflecopenom ;
   private String AV121Tlectorwwds_9_tflecopenom_sel ;
   private String AV122Tlectorwwds_10_tflecfascod ;
   private String AV123Tlectorwwds_11_tflecfascod_sel ;
   private String AV124Tlectorwwds_12_tflecfasdsc ;
   private String AV125Tlectorwwds_13_tflecfasdsc_sel ;
   private String AV130Tlectorwwds_18_tflecparnom ;
   private String AV131Tlectorwwds_19_tflecparnom_sel ;
   private String AV132Tlectorwwds_20_tflechor ;
   private String AV133Tlectorwwds_21_tflechor_sel ;
   private String AV135Tlectorwwds_23_tflectipent ;
   private String AV136Tlectorwwds_24_tflectipent_sel ;
   private String scmdbuf ;
   private String lV114Tlectorwwds_2_tflecmaqcod ;
   private String lV116Tlectorwwds_4_tflechdr ;
   private String lV122Tlectorwwds_10_tflecfascod ;
   private String lV132Tlectorwwds_20_tflechor ;
   private String lV135Tlectorwwds_23_tflectipent ;
   private String hsh ;
   private String AV107Station ;
   private String AV106EmprNom ;
   private String AV108UsurCod ;
   private String AV112Emprcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String edtLecMaqCod_Jsonclick ;
   private String edtLecHdr_Jsonclick ;
   private String edtLecBarCod_Jsonclick ;
   private String edtLecBarReo_Jsonclick ;
   private String edtLecBarPar_Jsonclick ;
   private String edtLecOpeCod_Jsonclick ;
   private String edtlecOpeNom_Jsonclick ;
   private String edtLecFasCod_Jsonclick ;
   private String edtLecFasDsc_Jsonclick ;
   private String edtLecFasOrd_Jsonclick ;
   private String edtLecParCod_Jsonclick ;
   private String edtLecParNom_Jsonclick ;
   private String edtLecHor_Jsonclick ;
   private String edtLecFec_Jsonclick ;
   private String edtLecTipEnt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV79TFLecFec ;
   private java.util.Date AV81DDO_LecFecAuxDate ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV134Tlectorwwds_22_tflecfec ;
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
   private boolean n1167LecBarCod ;
   private boolean n1168LecBarReo ;
   private boolean n1169LecBarPar ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1188LecFasOrd ;
   private boolean n1172LecParCod ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n1796LecTipEnt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV94TFLecEstado_SelsJson ;
   private String AV31ColumnsSelectorXML ;
   private String AV37ManageFiltersXml ;
   private String AV32UserCustomValue ;
   private String AV96FilterFullText ;
   private String AV113Tlectorwwds_1_filterfulltext ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbLecEstado ;
   private IDataStoreProvider pr_default ;
   private String[] H00HJ2_A1796LecTipEnt ;
   private boolean[] H00HJ2_n1796LecTipEnt ;
   private java.util.Date[] H00HJ2_A1174LecFec ;
   private boolean[] H00HJ2_n1174LecFec ;
   private String[] H00HJ2_A1173LecHor ;
   private boolean[] H00HJ2_n1173LecHor ;
   private String[] H00HJ2_A13721LecHdr ;
   private String[] H00HJ2_A1166LecMaqCod ;
   private String[] H00HJ2_A396EmprCod ;
   private int[] H00HJ2_A1170LecOpeCod ;
   private boolean[] H00HJ2_n1170LecOpeCod ;
   private String[] H00HJ2_A1171LecFasCod ;
   private boolean[] H00HJ2_n1171LecFasCod ;
   private short[] H00HJ2_A1172LecParCod ;
   private boolean[] H00HJ2_n1172LecParCod ;
   private short[] H00HJ2_A1188LecFasOrd ;
   private boolean[] H00HJ2_n1188LecFasOrd ;
   private String[] H00HJ2_A1169LecBarPar ;
   private boolean[] H00HJ2_n1169LecBarPar ;
   private byte[] H00HJ2_A1168LecBarReo ;
   private boolean[] H00HJ2_n1168LecBarReo ;
   private int[] H00HJ2_A1167LecBarCod ;
   private boolean[] H00HJ2_n1167LecBarCod ;
   private String[] H00HJ3_A1796LecTipEnt ;
   private boolean[] H00HJ3_n1796LecTipEnt ;
   private java.util.Date[] H00HJ3_A1174LecFec ;
   private boolean[] H00HJ3_n1174LecFec ;
   private String[] H00HJ3_A1173LecHor ;
   private boolean[] H00HJ3_n1173LecHor ;
   private String[] H00HJ3_A13721LecHdr ;
   private String[] H00HJ3_A1166LecMaqCod ;
   private String[] H00HJ3_A396EmprCod ;
   private int[] H00HJ3_A1170LecOpeCod ;
   private boolean[] H00HJ3_n1170LecOpeCod ;
   private String[] H00HJ3_A1171LecFasCod ;
   private boolean[] H00HJ3_n1171LecFasCod ;
   private short[] H00HJ3_A1172LecParCod ;
   private boolean[] H00HJ3_n1172LecParCod ;
   private short[] H00HJ3_A1188LecFasOrd ;
   private boolean[] H00HJ3_n1188LecFasOrd ;
   private String[] H00HJ3_A1169LecBarPar ;
   private boolean[] H00HJ3_n1169LecBarPar ;
   private byte[] H00HJ3_A1168LecBarReo ;
   private boolean[] H00HJ3_n1168LecBarReo ;
   private int[] H00HJ3_A1167LecBarCod ;
   private boolean[] H00HJ3_n1167LecBarCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV95TFLecEstado_Sels ;
   private GXSimpleCollection<String> AV137Tlectorwwds_25_tflecestado_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState26[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV87DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tlectorww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00HJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV137Tlectorwwds_25_tflecestado_sels ,
                                          String AV115Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV114Tlectorwwds_2_tflecmaqcod ,
                                          String AV117Tlectorwwds_5_tflechdr_sel ,
                                          String AV116Tlectorwwds_4_tflechdr ,
                                          int AV118Tlectorwwds_6_tflecopecod ,
                                          int AV119Tlectorwwds_7_tflecopecod_to ,
                                          String AV123Tlectorwwds_11_tflecfascod_sel ,
                                          String AV122Tlectorwwds_10_tflecfascod ,
                                          short AV126Tlectorwwds_14_tflecfasord ,
                                          short AV127Tlectorwwds_15_tflecfasord_to ,
                                          short AV128Tlectorwwds_16_tflecparcod ,
                                          short AV129Tlectorwwds_17_tflecparcod_to ,
                                          String AV133Tlectorwwds_21_tflechor_sel ,
                                          String AV132Tlectorwwds_20_tflechor ,
                                          java.util.Date AV134Tlectorwwds_22_tflecfec ,
                                          String AV136Tlectorwwds_24_tflectipent_sel ,
                                          String AV135Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV113Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV121Tlectorwwds_9_tflecopenom_sel ,
                                          String AV120Tlectorwwds_8_tflecopenom ,
                                          String AV125Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV124Tlectorwwds_12_tflecfasdsc ,
                                          String AV131Tlectorwwds_19_tflecparnom_sel ,
                                          String AV130Tlectorwwds_18_tflecparnom ,
                                          int AV137Tlectorwwds_25_tflecestado_sels_size ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[19];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, EmprCod, LecOpeCod, LecFasCod, LecParCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV115Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV116Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV119Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV126Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (0==AV127Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (0==AV128Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV129Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV132Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV135Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H00HJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV137Tlectorwwds_25_tflecestado_sels ,
                                          String AV115Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV114Tlectorwwds_2_tflecmaqcod ,
                                          String AV117Tlectorwwds_5_tflechdr_sel ,
                                          String AV116Tlectorwwds_4_tflechdr ,
                                          int AV118Tlectorwwds_6_tflecopecod ,
                                          int AV119Tlectorwwds_7_tflecopecod_to ,
                                          String AV123Tlectorwwds_11_tflecfascod_sel ,
                                          String AV122Tlectorwwds_10_tflecfascod ,
                                          short AV126Tlectorwwds_14_tflecfasord ,
                                          short AV127Tlectorwwds_15_tflecfasord_to ,
                                          short AV128Tlectorwwds_16_tflecparcod ,
                                          short AV129Tlectorwwds_17_tflecparcod_to ,
                                          String AV133Tlectorwwds_21_tflechor_sel ,
                                          String AV132Tlectorwwds_20_tflechor ,
                                          java.util.Date AV134Tlectorwwds_22_tflecfec ,
                                          String AV136Tlectorwwds_24_tflectipent_sel ,
                                          String AV135Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV113Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV121Tlectorwwds_9_tflecopenom_sel ,
                                          String AV120Tlectorwwds_8_tflecopenom ,
                                          String AV125Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV124Tlectorwwds_12_tflecfasdsc ,
                                          String AV131Tlectorwwds_19_tflecparnom_sel ,
                                          String AV130Tlectorwwds_18_tflecparnom ,
                                          int AV137Tlectorwwds_25_tflecestado_sels_size ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[19];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, EmprCod, LecOpeCod, LecFasCod, LecParCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV115Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV116Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV119Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (0==AV126Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (0==AV127Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV128Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV129Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV132Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV135Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_H00HJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] );
            case 1 :
                  return conditional_H00HJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               return;
      }
   }

}

