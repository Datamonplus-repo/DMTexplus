package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lector__ww_impl extends GXDataArea
{
   public lector__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lector__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lector__ww_impl.class ));
   }

   public lector__ww_impl( int remoteHandle ,
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFLecMaqCod = httpContext.GetPar( "TFLecMaqCod") ;
      AV28TFLecBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFLecBarCod"))) ;
      AV30TFLecBarReo = (byte)(GXutil.lval( httpContext.GetPar( "TFLecBarReo"))) ;
      AV32TFLecBarPar = httpContext.GetPar( "TFLecBarPar") ;
      AV34TFLecOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFLecOpeCod"))) ;
      AV36TFlecOpeNom = httpContext.GetPar( "TFlecOpeNom") ;
      AV38TFLecFasCod = httpContext.GetPar( "TFLecFasCod") ;
      AV40TFLecFasDsc = httpContext.GetPar( "TFLecFasDsc") ;
      AV42TFLecFasOrd = (short)(GXutil.lval( httpContext.GetPar( "TFLecFasOrd"))) ;
      AV44TFLecParCod = (short)(GXutil.lval( httpContext.GetPar( "TFLecParCod"))) ;
      AV46TFLecParNom = httpContext.GetPar( "TFLecParNom") ;
      AV57TFLecHor = httpContext.GetPar( "TFLecHor") ;
      AV59TFLecFec = localUtil.parseDateParm( httpContext.GetPar( "TFLecFec")) ;
      AV60TFLecFec_To = localUtil.parseDateParm( httpContext.GetPar( "TFLecFec_To")) ;
      AV63TFLecTipEnt = httpContext.GetPar( "TFLecTipEnt") ;
      AV70TFLecEstado_Sel = httpContext.GetPar( "TFLecEstado_Sel") ;
      AV73Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa22Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start22Y2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lectoroptico.lector__ww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Lector__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lectoroptico\\lector__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECMAQCOD", GXutil.rtrim( AV26TFLecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECBARCOD", GXutil.ltrim( localUtil.ntoc( AV28TFLecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECBARREO", GXutil.ltrim( localUtil.ntoc( AV30TFLecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECBARPAR", GXutil.rtrim( AV32TFLecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPECOD", GXutil.ltrim( localUtil.ntoc( AV34TFLecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECOPENOM", GXutil.rtrim( AV36TFlecOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASCOD", GXutil.rtrim( AV38TFLecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASDSC", GXutil.rtrim( AV40TFLecFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFASORD", GXutil.ltrim( localUtil.ntoc( AV42TFLecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARCOD", GXutil.ltrim( localUtil.ntoc( AV44TFLecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECPARNOM", GXutil.rtrim( AV46TFLecParNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECHOR", GXutil.rtrim( AV57TFLecHor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFEC", localUtil.dtoc( AV59TFLecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECFEC_TO", localUtil.dtoc( AV60TFLecFec_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECTIPENT", GXutil.rtrim( AV63TFLecTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLECESTADO_SEL", GXutil.rtrim( AV70TFLecEstado_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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
         we22Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt22Y2( ) ;
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
      return formatLink("app.lectoroptico.lector__ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LectorOptico.Lector__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Tabla LECTOR", "") ;
   }

   public void wb22Y0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_22Y2( true) ;
      }
      else
      {
         wb_table1_27_22Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_22Y2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV73Pgmname), GXutil.rtrim( localUtil.format( AV73Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LectorOptico\\Lector__WW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lecfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lecfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lecfecauxdate_Internalname, localUtil.format(AV61DDO_LecFecAuxDate, "99/99/99"), localUtil.format( AV61DDO_LecFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lecfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lecfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\Lector__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lecfecauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lecfecauxdateto_Internalname, localUtil.format(AV62DDO_LecFecAuxDateTo, "99/99/99"), localUtil.format( AV62DDO_LecFecAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lecfecauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lecfecauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LectorOptico\\Lector__WW.htm");
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

   public void start22Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Tabla LECTOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup22Y0( ) ;
   }

   public void ws22Y2( )
   {
      start22Y2( ) ;
      evt22Y2( ) ;
   }

   public void evt22Y2( )
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
                           e1122Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1222Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1322Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1422Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1522Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1622Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1722Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e1822Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1922Y2 ();
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
                           AV52GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridActions), 4, 0));
                           A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
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
                                 e2022Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2122Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2222Y2 ();
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

   public void we22Y2( )
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

   public void pa22Y2( )
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
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFLecMaqCod ,
                                 int AV28TFLecBarCod ,
                                 byte AV30TFLecBarReo ,
                                 String AV32TFLecBarPar ,
                                 int AV34TFLecOpeCod ,
                                 String AV36TFlecOpeNom ,
                                 String AV38TFLecFasCod ,
                                 String AV40TFLecFasDsc ,
                                 short AV42TFLecFasOrd ,
                                 short AV44TFLecParCod ,
                                 String AV46TFLecParNom ,
                                 String AV57TFLecHor ,
                                 java.util.Date AV59TFLecFec ,
                                 java.util.Date AV60TFLecFec_To ,
                                 String AV63TFLecTipEnt ,
                                 String AV70TFLecEstado_Sel ,
                                 String AV73Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2122Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf22Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Lector__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lectoroptico\\lector__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf22Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV73Pgmname = "LectorOptico.Lector__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV76Lectoroptico_lector__wwds_3_tflecbarcod) ,
                                           Byte.valueOf(AV77Lectoroptico_lector__wwds_4_tflecbarreo) ,
                                           AV78Lectoroptico_lector__wwds_5_tflecbarpar ,
                                           Integer.valueOf(AV79Lectoroptico_lector__wwds_6_tflecopecod) ,
                                           AV81Lectoroptico_lector__wwds_8_tflecfascod ,
                                           Short.valueOf(AV83Lectoroptico_lector__wwds_10_tflecfasord) ,
                                           Short.valueOf(AV84Lectoroptico_lector__wwds_11_tflecparcod) ,
                                           AV86Lectoroptico_lector__wwds_13_tflechor ,
                                           AV87Lectoroptico_lector__wwds_14_tflecfec ,
                                           AV88Lectoroptico_lector__wwds_15_tflecfec_to ,
                                           AV89Lectoroptico_lector__wwds_16_tflectipent ,
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
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV74Lectoroptico_lector__wwds_1_filterfulltext ,
                                           A1166LecMaqCod ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           A13722LecEstado ,
                                           AV75Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                           AV80Lectoroptico_lector__wwds_7_tflecopenom ,
                                           AV82Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                           AV85Lectoroptico_lector__wwds_12_tflecparnom ,
                                           AV90Lectoroptico_lector__wwds_17_tflecestado_sel ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75Lectoroptico_lector__wwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV75Lectoroptico_lector__wwds_2_tflecmaqcod), 6, "%") ;
      lV78Lectoroptico_lector__wwds_5_tflecbarpar = GXutil.padr( GXutil.rtrim( AV78Lectoroptico_lector__wwds_5_tflecbarpar), 1, "%") ;
      lV81Lectoroptico_lector__wwds_8_tflecfascod = GXutil.padr( GXutil.rtrim( AV81Lectoroptico_lector__wwds_8_tflecfascod), 8, "%") ;
      lV86Lectoroptico_lector__wwds_13_tflechor = GXutil.padr( GXutil.rtrim( AV86Lectoroptico_lector__wwds_13_tflechor), 8, "%") ;
      lV89Lectoroptico_lector__wwds_16_tflectipent = GXutil.padr( GXutil.rtrim( AV89Lectoroptico_lector__wwds_16_tflectipent), 1, "%") ;
      /* Using cursor H022Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV75Lectoroptico_lector__wwds_2_tflecmaqcod, Integer.valueOf(AV76Lectoroptico_lector__wwds_3_tflecbarcod), Byte.valueOf(AV77Lectoroptico_lector__wwds_4_tflecbarreo), lV78Lectoroptico_lector__wwds_5_tflecbarpar, Integer.valueOf(AV79Lectoroptico_lector__wwds_6_tflecopecod), lV81Lectoroptico_lector__wwds_8_tflecfascod, Short.valueOf(AV83Lectoroptico_lector__wwds_10_tflecfasord), Short.valueOf(AV84Lectoroptico_lector__wwds_11_tflecparcod), lV86Lectoroptico_lector__wwds_13_tflechor, AV87Lectoroptico_lector__wwds_14_tflecfec, AV88Lectoroptico_lector__wwds_15_tflecfec_to, lV89Lectoroptico_lector__wwds_16_tflectipent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = H022Y2_A1796LecTipEnt[0] ;
         n1796LecTipEnt = H022Y2_n1796LecTipEnt[0] ;
         A1174LecFec = H022Y2_A1174LecFec[0] ;
         n1174LecFec = H022Y2_n1174LecFec[0] ;
         A1173LecHor = H022Y2_A1173LecHor[0] ;
         n1173LecHor = H022Y2_n1173LecHor[0] ;
         A1166LecMaqCod = H022Y2_A1166LecMaqCod[0] ;
         A1170LecOpeCod = H022Y2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H022Y2_n1170LecOpeCod[0] ;
         A1171LecFasCod = H022Y2_A1171LecFasCod[0] ;
         n1171LecFasCod = H022Y2_n1171LecFasCod[0] ;
         A1172LecParCod = H022Y2_A1172LecParCod[0] ;
         n1172LecParCod = H022Y2_n1172LecParCod[0] ;
         A1188LecFasOrd = H022Y2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H022Y2_n1188LecFasOrd[0] ;
         A1169LecBarPar = H022Y2_A1169LecBarPar[0] ;
         n1169LecBarPar = H022Y2_n1169LecBarPar[0] ;
         A1168LecBarReo = H022Y2_A1168LecBarReo[0] ;
         n1168LecBarReo = H022Y2_n1168LecBarReo[0] ;
         A1167LecBarCod = H022Y2_A1167LecBarCod[0] ;
         n1167LecBarCod = H022Y2_n1167LecBarCod[0] ;
         GXt_char1 = A14259lecOpeNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
         lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
         A14259lecOpeNom = GXt_char1 ;
         if ( (GXutil.strcmp("", AV80Lectoroptico_lector__wwds_7_tflecopenom)==0) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV80Lectoroptico_lector__wwds_7_tflecopenom) , 255 , "%"),  ' ' ) ) )
         {
            GXt_char1 = A14260LecFasDsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
            lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
            A14260LecFasDsc = GXt_char1 ;
            if ( (GXutil.strcmp("", AV82Lectoroptico_lector__wwds_9_tflecfasdsc)==0) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV82Lectoroptico_lector__wwds_9_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char1 = A14261LecParNom ;
               GXv_char2[0] = GXt_char1 ;
               new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
               lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
               A14261LecParNom = GXt_char1 ;
               if ( (GXutil.strcmp("", AV85Lectoroptico_lector__wwds_12_tflecparnom)==0) || ( GXutil.like( GXutil.trim( GXutil.upper( A14261LecParNom)) , GXutil.padr( "%" + GXutil.trim( GXutil.upper( AV85Lectoroptico_lector__wwds_12_tflecparnom)) , 1 , "%"),  ' ' ) ) )
               {
                  GXt_char1 = A13722LecEstado ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
                  lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
                  A13722LecEstado = GXt_char1 ;
                  if ( (GXutil.strcmp("", AV74Lectoroptico_lector__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1167LecBarCod, 8, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1168LecBarReo, 1, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1169LecBarPar) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "proceso", "") , GXutil.padr( "%" + GXutil.lower( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "finalizadas", "") , GXutil.padr( "%" + GXutil.lower( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "F") == 0 ) ) ) )
                  {
                     if ( (GXutil.strcmp("", AV90Lectoroptico_lector__wwds_17_tflecestado_sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV90Lectoroptico_lector__wwds_17_tflecestado_sel) == 0 ) ) )
                     {
                        GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
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

   public void rf22Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e2122Y2 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
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
         subsflControlProps_452( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV76Lectoroptico_lector__wwds_3_tflecbarcod) ,
                                              Byte.valueOf(AV77Lectoroptico_lector__wwds_4_tflecbarreo) ,
                                              AV78Lectoroptico_lector__wwds_5_tflecbarpar ,
                                              Integer.valueOf(AV79Lectoroptico_lector__wwds_6_tflecopecod) ,
                                              AV81Lectoroptico_lector__wwds_8_tflecfascod ,
                                              Short.valueOf(AV83Lectoroptico_lector__wwds_10_tflecfasord) ,
                                              Short.valueOf(AV84Lectoroptico_lector__wwds_11_tflecparcod) ,
                                              AV86Lectoroptico_lector__wwds_13_tflechor ,
                                              AV87Lectoroptico_lector__wwds_14_tflecfec ,
                                              AV88Lectoroptico_lector__wwds_15_tflecfec_to ,
                                              AV89Lectoroptico_lector__wwds_16_tflectipent ,
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
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV74Lectoroptico_lector__wwds_1_filterfulltext ,
                                              A1166LecMaqCod ,
                                              A14259lecOpeNom ,
                                              A14260LecFasDsc ,
                                              A14261LecParNom ,
                                              A13722LecEstado ,
                                              AV75Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                              AV80Lectoroptico_lector__wwds_7_tflecopenom ,
                                              AV82Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                              AV85Lectoroptico_lector__wwds_12_tflecparnom ,
                                              AV90Lectoroptico_lector__wwds_17_tflecestado_sel ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV75Lectoroptico_lector__wwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV75Lectoroptico_lector__wwds_2_tflecmaqcod), 6, "%") ;
         lV78Lectoroptico_lector__wwds_5_tflecbarpar = GXutil.padr( GXutil.rtrim( AV78Lectoroptico_lector__wwds_5_tflecbarpar), 1, "%") ;
         lV81Lectoroptico_lector__wwds_8_tflecfascod = GXutil.padr( GXutil.rtrim( AV81Lectoroptico_lector__wwds_8_tflecfascod), 8, "%") ;
         lV86Lectoroptico_lector__wwds_13_tflechor = GXutil.padr( GXutil.rtrim( AV86Lectoroptico_lector__wwds_13_tflechor), 8, "%") ;
         lV89Lectoroptico_lector__wwds_16_tflectipent = GXutil.padr( GXutil.rtrim( AV89Lectoroptico_lector__wwds_16_tflectipent), 1, "%") ;
         /* Using cursor H022Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV75Lectoroptico_lector__wwds_2_tflecmaqcod, Integer.valueOf(AV76Lectoroptico_lector__wwds_3_tflecbarcod), Byte.valueOf(AV77Lectoroptico_lector__wwds_4_tflecbarreo), lV78Lectoroptico_lector__wwds_5_tflecbarpar, Integer.valueOf(AV79Lectoroptico_lector__wwds_6_tflecopecod), lV81Lectoroptico_lector__wwds_8_tflecfascod, Short.valueOf(AV83Lectoroptico_lector__wwds_10_tflecfasord), Short.valueOf(AV84Lectoroptico_lector__wwds_11_tflecparcod), lV86Lectoroptico_lector__wwds_13_tflechor, AV87Lectoroptico_lector__wwds_14_tflecfec, AV88Lectoroptico_lector__wwds_15_tflecfec_to, lV89Lectoroptico_lector__wwds_16_tflectipent});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1796LecTipEnt = H022Y3_A1796LecTipEnt[0] ;
            n1796LecTipEnt = H022Y3_n1796LecTipEnt[0] ;
            A1174LecFec = H022Y3_A1174LecFec[0] ;
            n1174LecFec = H022Y3_n1174LecFec[0] ;
            A1173LecHor = H022Y3_A1173LecHor[0] ;
            n1173LecHor = H022Y3_n1173LecHor[0] ;
            A1166LecMaqCod = H022Y3_A1166LecMaqCod[0] ;
            A1170LecOpeCod = H022Y3_A1170LecOpeCod[0] ;
            n1170LecOpeCod = H022Y3_n1170LecOpeCod[0] ;
            A1171LecFasCod = H022Y3_A1171LecFasCod[0] ;
            n1171LecFasCod = H022Y3_n1171LecFasCod[0] ;
            A1172LecParCod = H022Y3_A1172LecParCod[0] ;
            n1172LecParCod = H022Y3_n1172LecParCod[0] ;
            A1188LecFasOrd = H022Y3_A1188LecFasOrd[0] ;
            n1188LecFasOrd = H022Y3_n1188LecFasOrd[0] ;
            A1169LecBarPar = H022Y3_A1169LecBarPar[0] ;
            n1169LecBarPar = H022Y3_n1169LecBarPar[0] ;
            A1168LecBarReo = H022Y3_A1168LecBarReo[0] ;
            n1168LecBarReo = H022Y3_n1168LecBarReo[0] ;
            A1167LecBarCod = H022Y3_A1167LecBarCod[0] ;
            n1167LecBarCod = H022Y3_n1167LecBarCod[0] ;
            GXt_char1 = A14259lecOpeNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char2) ;
            lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
            A14259lecOpeNom = GXt_char1 ;
            if ( (GXutil.strcmp("", AV80Lectoroptico_lector__wwds_7_tflecopenom)==0) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV80Lectoroptico_lector__wwds_7_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char1 = A14260LecFasDsc ;
               GXv_char2[0] = GXt_char1 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char2) ;
               lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
               A14260LecFasDsc = GXt_char1 ;
               if ( (GXutil.strcmp("", AV82Lectoroptico_lector__wwds_9_tflecfasdsc)==0) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV82Lectoroptico_lector__wwds_9_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
               {
                  GXt_char1 = A14261LecParNom ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char2) ;
                  lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
                  A14261LecParNom = GXt_char1 ;
                  if ( (GXutil.strcmp("", AV85Lectoroptico_lector__wwds_12_tflecparnom)==0) || ( GXutil.like( GXutil.trim( GXutil.upper( A14261LecParNom)) , GXutil.padr( "%" + GXutil.trim( GXutil.upper( AV85Lectoroptico_lector__wwds_12_tflecparnom)) , 1 , "%"),  ' ' ) ) )
                  {
                     GXt_char1 = A13722LecEstado ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char2) ;
                     lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
                     A13722LecEstado = GXt_char1 ;
                     if ( (GXutil.strcmp("", AV74Lectoroptico_lector__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1167LecBarCod, 8, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1168LecBarReo, 1, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1169LecBarPar) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV74Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "proceso", "") , GXutil.padr( "%" + GXutil.lower( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "finalizadas", "") , GXutil.padr( "%" + GXutil.lower( AV74Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, "F") == 0 ) ) ) )
                     {
                        if ( (GXutil.strcmp("", AV90Lectoroptico_lector__wwds_17_tflecestado_sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV90Lectoroptico_lector__wwds_17_tflecestado_sel) == 0 ) ) )
                        {
                           e2222Y2 ();
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
         wb22Y0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22Y2( )
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
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFLecMaqCod, AV28TFLecBarCod, AV30TFLecBarReo, AV32TFLecBarPar, AV34TFLecOpeCod, AV36TFlecOpeNom, AV38TFLecFasCod, AV40TFLecFasDsc, AV42TFLecFasOrd, AV44TFLecParCod, AV46TFLecParNom, AV57TFLecHor, AV59TFLecFec, AV60TFLecFec_To, AV63TFLecTipEnt, AV70TFLecEstado_Sel, AV73Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV73Pgmname = "LectorOptico.Lector__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2022Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LECFECAUXDATE");
            GX_FocusControl = edtavDdo_lecfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61DDO_LecFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61DDO_LecFecAuxDate", localUtil.format(AV61DDO_LecFecAuxDate, "99/99/99"));
         }
         else
         {
            AV61DDO_LecFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lecfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61DDO_LecFecAuxDate", localUtil.format(AV61DDO_LecFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lecfecauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LECFECAUXDATETO");
            GX_FocusControl = edtavDdo_lecfecauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62DDO_LecFecAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_LecFecAuxDateTo", localUtil.format(AV62DDO_LecFecAuxDateTo, "99/99/99"));
         }
         else
         {
            AV62DDO_LecFecAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_lecfecauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_LecFecAuxDateTo", localUtil.format(AV62DDO_LecFecAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_45_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         if ( nGXsfl_45_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV52GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridActions), 4, 0));
            A1166LecMaqCod = httpContext.cgiGet( edtLecMaqCod_Internalname) ;
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
            A1174LecFec = localUtil.ctod( httpContext.cgiGet( edtLecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n1174LecFec = false ;
            A1796LecTipEnt = httpContext.cgiGet( edtLecTipEnt_Internalname) ;
            n1796LecTipEnt = false ;
            cmbLecEstado.setName( cmbLecEstado.getInternalname() );
            cmbLecEstado.setValue( httpContext.cgiGet( cmbLecEstado.getInternalname()) );
            A13722LecEstado = httpContext.cgiGet( cmbLecEstado.getInternalname()) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Lector__WW");
         AV73Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Pgmname", AV73Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV73Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("lectoroptico\\lector__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2022Y2 ();
      if (returnInSub) return;
   }

   public void e2022Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      lector__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      lector__ww_impl.this.A396EmprCod = GXv_char2[0] ;
      lector__ww_impl.this.AV55EmprNom = GXv_char3[0] ;
      lector__ww_impl.this.AV56UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_char1 = AV54Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      lector__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54Station = GXt_char1 ;
      GXv_char4[0] = AV67EmprCod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char2[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char4, GXv_char3, GXv_char2) ;
      lector__ww_impl.this.AV67EmprCod = GXv_char4[0] ;
      lector__ww_impl.this.AV55EmprNom = GXv_char3[0] ;
      lector__ww_impl.this.AV56UsurCod = GXv_char2[0] ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Tabla LECTOR", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2122Y2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("LectorOptico.Lector__WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("LectorOptico.Lector__WWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtLecMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecBarReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarReo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecBarPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecBarPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecBarPar_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecOpeCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtlecOpeNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtlecOpeNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlecOpeNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFasOrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFasOrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFasOrd_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecParCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecParNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecParNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecParNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecHor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecHor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecHor_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtLecTipEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLecTipEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLecTipEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbLecEstado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLecEstado.getInternalname(), "Visible", GXutil.ltrimstr( cmbLecEstado.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      AV74Lectoroptico_lector__wwds_1_filterfulltext = AV15FilterFullText ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = AV26TFLecMaqCod ;
      AV76Lectoroptico_lector__wwds_3_tflecbarcod = AV28TFLecBarCod ;
      AV77Lectoroptico_lector__wwds_4_tflecbarreo = AV30TFLecBarReo ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = AV32TFLecBarPar ;
      AV79Lectoroptico_lector__wwds_6_tflecopecod = AV34TFLecOpeCod ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = AV36TFlecOpeNom ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = AV38TFLecFasCod ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = AV40TFLecFasDsc ;
      AV83Lectoroptico_lector__wwds_10_tflecfasord = AV42TFLecFasOrd ;
      AV84Lectoroptico_lector__wwds_11_tflecparcod = AV44TFLecParCod ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = AV46TFLecParNom ;
      AV86Lectoroptico_lector__wwds_13_tflechor = AV57TFLecHor ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = AV59TFLecFec ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = AV60TFLecFec_To ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = AV63TFLecTipEnt ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = AV70TFLecEstado_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1222Y2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e1322Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1422Y2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecMaqCod") == 0 )
         {
            AV26TFLecMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLecMaqCod", AV26TFLecMaqCod);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecBarCod") == 0 )
         {
            AV28TFLecBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLecBarCod), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecBarReo") == 0 )
         {
            AV30TFLecBarReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFLecBarReo", GXutil.str( AV30TFLecBarReo, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecBarPar") == 0 )
         {
            AV32TFLecBarPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLecBarPar", AV32TFLecBarPar);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecOpeCod") == 0 )
         {
            AV34TFLecOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFLecOpeCod), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "lecOpeNom") == 0 )
         {
            AV36TFlecOpeNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFlecOpeNom", AV36TFlecOpeNom);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasCod") == 0 )
         {
            AV38TFLecFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLecFasCod", AV38TFLecFasCod);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasDsc") == 0 )
         {
            AV40TFLecFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecFasDsc", AV40TFLecFasDsc);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFasOrd") == 0 )
         {
            AV42TFLecFasOrd = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLecFasOrd), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParCod") == 0 )
         {
            AV44TFLecParCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLecParCod), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecParNom") == 0 )
         {
            AV46TFLecParNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFLecParNom", AV46TFLecParNom);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecHor") == 0 )
         {
            AV57TFLecHor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFLecHor", AV57TFLecHor);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecFec") == 0 )
         {
            AV59TFLecFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFLecFec", localUtil.format(AV59TFLecFec, "99/99/99"));
            AV60TFLecFec_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFLecFec_To", localUtil.format(AV60TFLecFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecTipEnt") == 0 )
         {
            AV63TFLecTipEnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFLecTipEnt", AV63TFLecTipEnt);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LecEstado") == 0 )
         {
            AV70TFLecEstado_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecEstado_Sel", AV70TFLecEstado_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2222Y2( )
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV52GridActions, 4, 0)) );
   }

   public void e1522Y2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.Lector__WWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1122Y2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("LectorOptico.Lector__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV73Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("LectorOptico.Lector__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "LectorOptico.Lector__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         lector__ww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e1622Y2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e1722Y2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.lectoroptico.lector__wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      lector__ww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      lector__ww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e1822Y2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.lectoroptico.lector__wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1922Y2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.lectoroptico.lector__wwexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecMaqCod", "", "Maquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecBarCod", "", "Nº Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecBarReo", "", "R", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecBarPar", "", "P", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecOpeCod", "", "Operario", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "lecOpeNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasCod", "", "Cod.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasDsc", "", "Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFasOrd", "", "Orden", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecParCod", "", "Paro", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecParNom", "", "Descrip.Paro", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecHor", "", "Hora", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecFec", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecTipEnt", "", "Tipo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LecEstado", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.Lector__WWColumnsSelector", GXv_char4) ;
      lector__ww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "LectorOptico.Lector__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFLecMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFLecMaqCod", AV26TFLecMaqCod);
      AV28TFLecBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFLecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLecBarCod), 8, 0));
      AV30TFLecBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFLecBarReo", GXutil.str( AV30TFLecBarReo, 1, 0));
      AV32TFLecBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFLecBarPar", AV32TFLecBarPar);
      AV34TFLecOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFLecOpeCod), 6, 0));
      AV36TFlecOpeNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFlecOpeNom", AV36TFlecOpeNom);
      AV38TFLecFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFLecFasCod", AV38TFLecFasCod);
      AV40TFLecFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecFasDsc", AV40TFLecFasDsc);
      AV42TFLecFasOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLecFasOrd), 4, 0));
      AV44TFLecParCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLecParCod), 4, 0));
      AV46TFLecParNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFLecParNom", AV46TFLecParNom);
      AV57TFLecHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFLecHor", AV57TFLecHor);
      AV59TFLecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFLecFec", localUtil.format(AV59TFLecFec, "99/99/99"));
      AV60TFLecFec_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFLecFec_To", localUtil.format(AV60TFLecFec_To, "99/99/99"));
      AV63TFLecTipEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFLecTipEnt", AV63TFLecTipEnt);
      AV70TFLecEstado_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecEstado_Sel", AV70TFLecEstado_Sel);
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
      callWebObject(formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.lectoroptico.lector__", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A1166LecMaqCod))}, new String[] {"Mode","EmprCod","LecMaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV73Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV73Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV73Pgmname+"GridState"), null, null);
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
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV26TFLecMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFLecMaqCod", AV26TFLecMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARCOD") == 0 )
         {
            AV28TFLecBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFLecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLecBarCod), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARREO") == 0 )
         {
            AV30TFLecBarReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFLecBarReo", GXutil.str( AV30TFLecBarReo, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARPAR") == 0 )
         {
            AV32TFLecBarPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFLecBarPar", AV32TFLecBarPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV34TFLecOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLecOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFLecOpeCod), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV36TFlecOpeNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFlecOpeNom", AV36TFlecOpeNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV38TFLecFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLecFasCod", AV38TFLecFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV40TFLecFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLecFasDsc", AV40TFLecFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV42TFLecFasOrd = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLecFasOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLecFasOrd), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV44TFLecParCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLecParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLecParCod), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV46TFLecParNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFLecParNom", AV46TFLecParNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV57TFLecHor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFLecHor", AV57TFLecHor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV59TFLecFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFLecFec", localUtil.format(AV59TFLecFec, "99/99/99"));
            AV60TFLecFec_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFLecFec_To", localUtil.format(AV60TFLecFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV63TFLecTipEnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFLecTipEnt", AV63TFLecTipEnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV70TFLecEstado_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFLecEstado_Sel", AV70TFLecEstado_Sel);
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFLecEstado_Sel)==0), AV70TFLecEstado_Sel, GXv_char4) ;
      lector__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "||||||||||||||"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFLecMaqCod)==0), AV26TFLecMaqCod, GXv_char4) ;
      lector__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFLecBarPar)==0), AV32TFLecBarPar, GXv_char3) ;
      lector__ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFlecOpeNom)==0), AV36TFlecOpeNom, GXv_char2) ;
      lector__ww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFLecFasCod)==0), AV38TFLecFasCod, GXv_char15) ;
      lector__ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLecFasDsc)==0), AV40TFLecFasDsc, GXv_char17) ;
      lector__ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFLecParNom)==0), AV46TFLecParNom, GXv_char19) ;
      lector__ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFLecHor)==0), AV57TFLecHor, GXv_char21) ;
      lector__ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFLecTipEnt)==0), AV63TFLecTipEnt, GXv_char23) ;
      lector__ww_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+((0==AV28TFLecBarCod) ? "" : GXutil.str( AV28TFLecBarCod, 8, 0))+"|"+((0==AV30TFLecBarReo) ? "" : GXutil.str( AV30TFLecBarReo, 1, 0))+"|"+GXt_char12+"|"+((0==AV34TFLecOpeCod) ? "" : GXutil.str( AV34TFLecOpeCod, 6, 0))+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+((0==AV42TFLecFasOrd) ? "" : GXutil.str( AV42TFLecFasOrd, 4, 0))+"|"+((0==AV44TFLecParCod) ? "" : GXutil.str( AV44TFLecParCod, 4, 0))+"|"+GXt_char18+"|"+GXt_char20+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFLecFec)) ? "" : localUtil.dtoc( AV59TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char22+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLecFec_To)) ? "" : localUtil.dtoc( AV60TFLecFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV73Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECMAQCOD", "", !(GXutil.strcmp("", AV26TFLecMaqCod)==0), (short)(0), AV26TFLecMaqCod, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECBARCOD", "", !(0==AV28TFLecBarCod), (short)(0), GXutil.trim( GXutil.str( AV28TFLecBarCod, 8, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECBARREO", "", !(0==AV30TFLecBarReo), (short)(0), GXutil.trim( GXutil.str( AV30TFLecBarReo, 1, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECBARPAR", "", !(GXutil.strcmp("", AV32TFLecBarPar)==0), (short)(0), AV32TFLecBarPar, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECOPECOD", "", !(0==AV34TFLecOpeCod), (short)(0), GXutil.trim( GXutil.str( AV34TFLecOpeCod, 6, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECOPENOM", "", !(GXutil.strcmp("", AV36TFlecOpeNom)==0), (short)(0), AV36TFlecOpeNom, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECFASCOD", "", !(GXutil.strcmp("", AV38TFLecFasCod)==0), (short)(0), AV38TFLecFasCod, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECFASDSC", "", !(GXutil.strcmp("", AV40TFLecFasDsc)==0), (short)(0), AV40TFLecFasDsc, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECFASORD", "", !(0==AV42TFLecFasOrd), (short)(0), GXutil.trim( GXutil.str( AV42TFLecFasOrd, 4, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECPARCOD", "", !(0==AV44TFLecParCod), (short)(0), GXutil.trim( GXutil.str( AV44TFLecParCod, 4, 0)), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECPARNOM", "", !(GXutil.strcmp("", AV46TFLecParNom)==0), (short)(0), AV46TFLecParNom, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECHOR", "", !(GXutil.strcmp("", AV57TFLecHor)==0), (short)(0), AV57TFLecHor, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECFEC", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFLecFec))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFLecFec_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV59TFLecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV60TFLecFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECTIPENT", "", !(GXutil.strcmp("", AV63TFLecTipEnt)==0), (short)(0), AV63TFLecTipEnt, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFLECESTADO_SEL", "", !(GXutil.strcmp("", AV70TFLecEstado_Sel)==0), (short)(0), AV70TFLecEstado_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV73Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV73Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LectorOptico.Lector__" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_22Y2( boolean wbgen )
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
         wb_table2_32_22Y2( true) ;
      }
      else
      {
         wb_table2_32_22Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_22Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_22Y2e( true) ;
      }
      else
      {
         wb_table1_27_22Y2e( false) ;
      }
   }

   public void wb_table2_32_22Y2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_LectorOptico\\Lector__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_22Y2e( true) ;
      }
      else
      {
         wb_table2_32_22Y2e( false) ;
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
      pa22Y2( ) ;
      ws22Y2( ) ;
      we22Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144323", true, true);
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
      httpContext.AddJavascriptSource("lectoroptico/lector__ww.js", "?202682116144323", false, true);
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
      wb22Y0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
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
               AV52GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV52GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV52GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e2322y2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV52GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1167LecBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLecBarReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1168LecBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecBarReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLecBarPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLecBarPar_Internalname,GXutil.rtrim( A1169LecBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLecBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLecBarPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
         send_integrity_lvl_hashes22Y2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecBarReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecBarPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtlecOpeNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecFasOrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLecParNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrip.Paro", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1166LecMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecBarReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1169LecBarPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLecBarPar_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavDdo_lecfecauxdateto_Internalname = "vDDO_LECFECAUXDATETO" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
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
      edtLecMaqCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
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
      edtLecBarPar_Visible = -1 ;
      edtLecBarReo_Visible = -1 ;
      edtLecBarCod_Visible = -1 ;
      edtLecMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lecfecauxdateto_Jsonclick = "" ;
      edtavDdo_lecfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistfixedvalues = "||||||||||||||P:Proceso,F:Finalizadas" ;
      Ddo_grid_Datalisttype = "||||||||||||||FixedValues" ;
      Ddo_grid_Includedatalist = "||||||||||||||T" ;
      Ddo_grid_Filterisrange = "||||||||||||T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Date|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T||T|T||T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6||7||8|9||10|11|12|" ;
      Ddo_grid_Columnids = "1:LecMaqCod|2:LecBarCod|3:LecBarReo|4:LecBarPar|5:LecOpeCod|6:lecOpeNom|7:LecFasCod|8:LecFasDsc|9:LecFasOrd|10:LecParCod|11:LecParNom|12:LecHor|13:LecFec|14:LecTipEnt|15:LecEstado" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Tabla LECTOR", "") );
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
         AV52GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV52GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecBarCod_Visible',ctrl:'LECBARCOD',prop:'Visible'},{av:'edtLecBarReo_Visible',ctrl:'LECBARREO',prop:'Visible'},{av:'edtLecBarPar_Visible',ctrl:'LECBARPAR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1222Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1322Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1422Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2222Y2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV52GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1522Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecBarCod_Visible',ctrl:'LECBARCOD',prop:'Visible'},{av:'edtLecBarReo_Visible',ctrl:'LECBARREO',prop:'Visible'},{av:'edtLecBarPar_Visible',ctrl:'LECBARPAR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1122Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLecMaqCod_Visible',ctrl:'LECMAQCOD',prop:'Visible'},{av:'edtLecBarCod_Visible',ctrl:'LECBARCOD',prop:'Visible'},{av:'edtLecBarReo_Visible',ctrl:'LECBARREO',prop:'Visible'},{av:'edtLecBarPar_Visible',ctrl:'LECBARPAR',prop:'Visible'},{av:'edtLecOpeCod_Visible',ctrl:'LECOPECOD',prop:'Visible'},{av:'edtlecOpeNom_Visible',ctrl:'LECOPENOM',prop:'Visible'},{av:'edtLecFasCod_Visible',ctrl:'LECFASCOD',prop:'Visible'},{av:'edtLecFasDsc_Visible',ctrl:'LECFASDSC',prop:'Visible'},{av:'edtLecFasOrd_Visible',ctrl:'LECFASORD',prop:'Visible'},{av:'edtLecParCod_Visible',ctrl:'LECPARCOD',prop:'Visible'},{av:'edtLecParNom_Visible',ctrl:'LECPARNOM',prop:'Visible'},{av:'edtLecHor_Visible',ctrl:'LECHOR',prop:'Visible'},{av:'edtLecFec_Visible',ctrl:'LECFEC',prop:'Visible'},{av:'edtLecTipEnt_Visible',ctrl:'LECTIPENT',prop:'Visible'},{av:'cmbLecEstado'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2322Y2',iparms:[{av:'cmbavGridactions'},{av:'AV52GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV52GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1622Y2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1722Y2',iparms:[{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1822Y2',iparms:[{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1922Y2',iparms:[{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFLecMaqCod',fld:'vTFLECMAQCOD',pic:''},{av:'AV28TFLecBarCod',fld:'vTFLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV30TFLecBarReo',fld:'vTFLECBARREO',pic:'9'},{av:'AV32TFLecBarPar',fld:'vTFLECBARPAR',pic:''},{av:'AV34TFLecOpeCod',fld:'vTFLECOPECOD',pic:'ZZZZZ9'},{av:'AV36TFlecOpeNom',fld:'vTFLECOPENOM',pic:''},{av:'AV38TFLecFasCod',fld:'vTFLECFASCOD',pic:''},{av:'AV40TFLecFasDsc',fld:'vTFLECFASDSC',pic:''},{av:'AV42TFLecFasOrd',fld:'vTFLECFASORD',pic:'ZZZ9'},{av:'AV44TFLecParCod',fld:'vTFLECPARCOD',pic:'ZZZ9'},{av:'AV46TFLecParNom',fld:'vTFLECPARNOM',pic:''},{av:'AV57TFLecHor',fld:'vTFLECHOR',pic:''},{av:'AV59TFLecFec',fld:'vTFLECFEC',pic:''},{av:'AV60TFLecFec_To',fld:'vTFLECFEC_TO',pic:''},{av:'AV63TFLecTipEnt',fld:'vTFLECTIPENT',pic:''},{av:'AV70TFLecEstado_Sel',fld:'vTFLECESTADO_SEL',pic:''},{av:'AV73Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_LECMAQCOD","{handler:'valid_Lecmaqcod',iparms:[]");
      setEventMetadata("VALID_LECMAQCOD",",oparms:[]}");
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
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFLecMaqCod = "" ;
      AV32TFLecBarPar = "" ;
      AV36TFlecOpeNom = "" ;
      AV38TFLecFasCod = "" ;
      AV40TFLecFasDsc = "" ;
      AV46TFLecParNom = "" ;
      AV57TFLecHor = "" ;
      AV59TFLecFec = GXutil.nullDate() ;
      AV60TFLecFec_To = GXutil.nullDate() ;
      AV63TFLecTipEnt = "" ;
      AV70TFLecEstado_Sel = "" ;
      AV73Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      AV61DDO_LecFecAuxDate = GXutil.nullDate() ;
      AV62DDO_LecFecAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV74Lectoroptico_lector__wwds_1_filterfulltext = "" ;
      AV75Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      AV78Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      AV80Lectoroptico_lector__wwds_7_tflecopenom = "" ;
      AV81Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      AV82Lectoroptico_lector__wwds_9_tflecfasdsc = "" ;
      AV85Lectoroptico_lector__wwds_12_tflecparnom = "" ;
      AV86Lectoroptico_lector__wwds_13_tflechor = "" ;
      AV87Lectoroptico_lector__wwds_14_tflecfec = GXutil.nullDate() ;
      AV88Lectoroptico_lector__wwds_15_tflecfec_to = GXutil.nullDate() ;
      AV89Lectoroptico_lector__wwds_16_tflectipent = "" ;
      AV90Lectoroptico_lector__wwds_17_tflecestado_sel = "" ;
      scmdbuf = "" ;
      lV75Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      lV78Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      lV81Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      lV86Lectoroptico_lector__wwds_13_tflechor = "" ;
      lV89Lectoroptico_lector__wwds_16_tflectipent = "" ;
      H022Y2_A1796LecTipEnt = new String[] {""} ;
      H022Y2_n1796LecTipEnt = new boolean[] {false} ;
      H022Y2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H022Y2_n1174LecFec = new boolean[] {false} ;
      H022Y2_A1173LecHor = new String[] {""} ;
      H022Y2_n1173LecHor = new boolean[] {false} ;
      H022Y2_A1166LecMaqCod = new String[] {""} ;
      H022Y2_A396EmprCod = new String[] {""} ;
      H022Y2_A1170LecOpeCod = new int[1] ;
      H022Y2_n1170LecOpeCod = new boolean[] {false} ;
      H022Y2_A1171LecFasCod = new String[] {""} ;
      H022Y2_n1171LecFasCod = new boolean[] {false} ;
      H022Y2_A1172LecParCod = new short[1] ;
      H022Y2_n1172LecParCod = new boolean[] {false} ;
      H022Y2_A1188LecFasOrd = new short[1] ;
      H022Y2_n1188LecFasOrd = new boolean[] {false} ;
      H022Y2_A1169LecBarPar = new String[] {""} ;
      H022Y2_n1169LecBarPar = new boolean[] {false} ;
      H022Y2_A1168LecBarReo = new byte[1] ;
      H022Y2_n1168LecBarReo = new boolean[] {false} ;
      H022Y2_A1167LecBarCod = new int[1] ;
      H022Y2_n1167LecBarCod = new boolean[] {false} ;
      H022Y3_A1796LecTipEnt = new String[] {""} ;
      H022Y3_n1796LecTipEnt = new boolean[] {false} ;
      H022Y3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H022Y3_n1174LecFec = new boolean[] {false} ;
      H022Y3_A1173LecHor = new String[] {""} ;
      H022Y3_n1173LecHor = new boolean[] {false} ;
      H022Y3_A1166LecMaqCod = new String[] {""} ;
      H022Y3_A396EmprCod = new String[] {""} ;
      H022Y3_A1170LecOpeCod = new int[1] ;
      H022Y3_n1170LecOpeCod = new boolean[] {false} ;
      H022Y3_A1171LecFasCod = new String[] {""} ;
      H022Y3_n1171LecFasCod = new boolean[] {false} ;
      H022Y3_A1172LecParCod = new short[1] ;
      H022Y3_n1172LecParCod = new boolean[] {false} ;
      H022Y3_A1188LecFasOrd = new short[1] ;
      H022Y3_n1188LecFasOrd = new boolean[] {false} ;
      H022Y3_A1169LecBarPar = new String[] {""} ;
      H022Y3_n1169LecBarPar = new boolean[] {false} ;
      H022Y3_A1168LecBarReo = new byte[1] ;
      H022Y3_n1168LecBarReo = new boolean[] {false} ;
      H022Y3_A1167LecBarCod = new int[1] ;
      H022Y3_n1167LecBarCod = new boolean[] {false} ;
      hsh = "" ;
      AV54Station = "" ;
      AV55EmprNom = "" ;
      AV56UsurCod = "" ;
      AV67EmprCod = "" ;
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
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector__ww__default(),
         new Object[] {
             new Object[] {
            H022Y2_A1796LecTipEnt, H022Y2_n1796LecTipEnt, H022Y2_A1174LecFec, H022Y2_n1174LecFec, H022Y2_A1173LecHor, H022Y2_n1173LecHor, H022Y2_A1166LecMaqCod, H022Y2_A396EmprCod, H022Y2_A1170LecOpeCod, H022Y2_n1170LecOpeCod,
            H022Y2_A1171LecFasCod, H022Y2_n1171LecFasCod, H022Y2_A1172LecParCod, H022Y2_n1172LecParCod, H022Y2_A1188LecFasOrd, H022Y2_n1188LecFasOrd, H022Y2_A1169LecBarPar, H022Y2_n1169LecBarPar, H022Y2_A1168LecBarReo, H022Y2_n1168LecBarReo,
            H022Y2_A1167LecBarCod, H022Y2_n1167LecBarCod
            }
            , new Object[] {
            H022Y3_A1796LecTipEnt, H022Y3_n1796LecTipEnt, H022Y3_A1174LecFec, H022Y3_n1174LecFec, H022Y3_A1173LecHor, H022Y3_n1173LecHor, H022Y3_A1166LecMaqCod, H022Y3_A396EmprCod, H022Y3_A1170LecOpeCod, H022Y3_n1170LecOpeCod,
            H022Y3_A1171LecFasCod, H022Y3_n1171LecFasCod, H022Y3_A1172LecParCod, H022Y3_n1172LecParCod, H022Y3_A1188LecFasOrd, H022Y3_n1188LecFasOrd, H022Y3_A1169LecBarPar, H022Y3_n1169LecBarPar, H022Y3_A1168LecBarReo, H022Y3_n1168LecBarReo,
            H022Y3_A1167LecBarCod, H022Y3_n1167LecBarCod
            }
         }
      );
      AV73Pgmname = "LectorOptico.Lector__WW" ;
      /* GeneXus formulas. */
      AV73Pgmname = "LectorOptico.Lector__WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV30TFLecBarReo ;
   private byte gxajaxcallmode ;
   private byte A1168LecBarReo ;
   private byte nDonePA ;
   private byte AV77Lectoroptico_lector__wwds_4_tflecbarreo ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV42TFLecFasOrd ;
   private short AV44TFLecParCod ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV52GridActions ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV83Lectoroptico_lector__wwds_10_tflecfasord ;
   private short AV84Lectoroptico_lector__wwds_11_tflecparcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV28TFLecBarCod ;
   private int AV34TFLecOpeCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int subGrid_Islastpage ;
   private int AV76Lectoroptico_lector__wwds_3_tflecbarcod ;
   private int AV79Lectoroptico_lector__wwds_6_tflecopecod ;
   private int edtLecMaqCod_Visible ;
   private int edtLecBarCod_Visible ;
   private int edtLecBarReo_Visible ;
   private int edtLecBarPar_Visible ;
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
   private int AV49PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
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
   private String AV26TFLecMaqCod ;
   private String AV32TFLecBarPar ;
   private String AV36TFlecOpeNom ;
   private String AV38TFLecFasCod ;
   private String AV40TFLecFasDsc ;
   private String AV46TFLecParNom ;
   private String AV57TFLecHor ;
   private String AV63TFLecTipEnt ;
   private String AV70TFLecEstado_Sel ;
   private String AV73Pgmname ;
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
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String edtavDdo_lecfecauxdateto_Internalname ;
   private String edtavDdo_lecfecauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A1166LecMaqCod ;
   private String edtLecMaqCod_Internalname ;
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
   private String AV75Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String AV78Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String AV80Lectoroptico_lector__wwds_7_tflecopenom ;
   private String AV81Lectoroptico_lector__wwds_8_tflecfascod ;
   private String AV82Lectoroptico_lector__wwds_9_tflecfasdsc ;
   private String AV85Lectoroptico_lector__wwds_12_tflecparnom ;
   private String AV86Lectoroptico_lector__wwds_13_tflechor ;
   private String AV89Lectoroptico_lector__wwds_16_tflectipent ;
   private String AV90Lectoroptico_lector__wwds_17_tflecestado_sel ;
   private String scmdbuf ;
   private String lV75Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String lV78Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String lV81Lectoroptico_lector__wwds_8_tflecfascod ;
   private String lV86Lectoroptico_lector__wwds_13_tflechor ;
   private String lV89Lectoroptico_lector__wwds_16_tflectipent ;
   private String hsh ;
   private String AV54Station ;
   private String AV55EmprNom ;
   private String AV56UsurCod ;
   private String AV67EmprCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char13 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
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
   private java.util.Date AV59TFLecFec ;
   private java.util.Date AV60TFLecFec_To ;
   private java.util.Date AV61DDO_LecFecAuxDate ;
   private java.util.Date AV62DDO_LecFecAuxDateTo ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV87Lectoroptico_lector__wwds_14_tflecfec ;
   private java.util.Date AV88Lectoroptico_lector__wwds_15_tflecfec_to ;
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
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV74Lectoroptico_lector__wwds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbLecEstado ;
   private IDataStoreProvider pr_default ;
   private String[] H022Y2_A1796LecTipEnt ;
   private boolean[] H022Y2_n1796LecTipEnt ;
   private java.util.Date[] H022Y2_A1174LecFec ;
   private boolean[] H022Y2_n1174LecFec ;
   private String[] H022Y2_A1173LecHor ;
   private boolean[] H022Y2_n1173LecHor ;
   private String[] H022Y2_A1166LecMaqCod ;
   private String[] H022Y2_A396EmprCod ;
   private int[] H022Y2_A1170LecOpeCod ;
   private boolean[] H022Y2_n1170LecOpeCod ;
   private String[] H022Y2_A1171LecFasCod ;
   private boolean[] H022Y2_n1171LecFasCod ;
   private short[] H022Y2_A1172LecParCod ;
   private boolean[] H022Y2_n1172LecParCod ;
   private short[] H022Y2_A1188LecFasOrd ;
   private boolean[] H022Y2_n1188LecFasOrd ;
   private String[] H022Y2_A1169LecBarPar ;
   private boolean[] H022Y2_n1169LecBarPar ;
   private byte[] H022Y2_A1168LecBarReo ;
   private boolean[] H022Y2_n1168LecBarReo ;
   private int[] H022Y2_A1167LecBarCod ;
   private boolean[] H022Y2_n1167LecBarCod ;
   private String[] H022Y3_A1796LecTipEnt ;
   private boolean[] H022Y3_n1796LecTipEnt ;
   private java.util.Date[] H022Y3_A1174LecFec ;
   private boolean[] H022Y3_n1174LecFec ;
   private String[] H022Y3_A1173LecHor ;
   private boolean[] H022Y3_n1173LecHor ;
   private String[] H022Y3_A1166LecMaqCod ;
   private String[] H022Y3_A396EmprCod ;
   private int[] H022Y3_A1170LecOpeCod ;
   private boolean[] H022Y3_n1170LecOpeCod ;
   private String[] H022Y3_A1171LecFasCod ;
   private boolean[] H022Y3_n1171LecFasCod ;
   private short[] H022Y3_A1172LecParCod ;
   private boolean[] H022Y3_n1172LecParCod ;
   private short[] H022Y3_A1188LecFasOrd ;
   private boolean[] H022Y3_n1188LecFasOrd ;
   private String[] H022Y3_A1169LecBarPar ;
   private boolean[] H022Y3_n1169LecBarPar ;
   private byte[] H022Y3_A1168LecBarReo ;
   private boolean[] H022Y3_n1168LecBarReo ;
   private int[] H022Y3_A1167LecBarCod ;
   private boolean[] H022Y3_n1167LecBarCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class lector__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H022Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV76Lectoroptico_lector__wwds_3_tflecbarcod ,
                                          byte AV77Lectoroptico_lector__wwds_4_tflecbarreo ,
                                          String AV78Lectoroptico_lector__wwds_5_tflecbarpar ,
                                          int AV79Lectoroptico_lector__wwds_6_tflecopecod ,
                                          String AV81Lectoroptico_lector__wwds_8_tflecfascod ,
                                          short AV83Lectoroptico_lector__wwds_10_tflecfasord ,
                                          short AV84Lectoroptico_lector__wwds_11_tflecparcod ,
                                          String AV86Lectoroptico_lector__wwds_13_tflechor ,
                                          java.util.Date AV87Lectoroptico_lector__wwds_14_tflecfec ,
                                          java.util.Date AV88Lectoroptico_lector__wwds_15_tflecfec_to ,
                                          String AV89Lectoroptico_lector__wwds_16_tflectipent ,
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
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV74Lectoroptico_lector__wwds_1_filterfulltext ,
                                          String A1166LecMaqCod ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String A13722LecEstado ,
                                          String AV75Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                          String AV80Lectoroptico_lector__wwds_7_tflecopenom ,
                                          String AV82Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                          String AV85Lectoroptico_lector__wwds_12_tflecparnom ,
                                          String AV90Lectoroptico_lector__wwds_17_tflecestado_sel ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[13];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, LecMaqCod, EmprCod, LecOpeCod, LecFasCod, LecParCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(RTRIM(LTRIM(LOWER(LecMaqCod))) like '%' || RTRIM(LTRIM(LOWER(?))))");
      if ( ! (0==AV76Lectoroptico_lector__wwds_3_tflecbarcod) )
      {
         addWhere(sWhereString, "(LecBarCod = ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Lectoroptico_lector__wwds_4_tflecbarreo) )
      {
         addWhere(sWhereString, "(LecBarReo = ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lectoroptico_lector__wwds_5_tflecbarpar)==0) )
      {
         addWhere(sWhereString, "(LecBarPar like '%' || RTRIM(LTRIM(LOWER(?))))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_lector__wwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Lectoroptico_lector__wwds_8_tflecfascod)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(UPPER(LecFasCod))) like '%' || RTRIM(LTRIM(UPPER(?))))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV83Lectoroptico_lector__wwds_10_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (0==AV84Lectoroptico_lector__wwds_11_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Lectoroptico_lector__wwds_13_tflechor)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Lectoroptico_lector__wwds_14_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Lectoroptico_lector__wwds_15_tflecfec_to)) )
      {
         addWhere(sWhereString, "(LecFec <= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_lector__wwds_16_tflectipent)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecMaqCod, EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarReo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarPar" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H022Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV76Lectoroptico_lector__wwds_3_tflecbarcod ,
                                          byte AV77Lectoroptico_lector__wwds_4_tflecbarreo ,
                                          String AV78Lectoroptico_lector__wwds_5_tflecbarpar ,
                                          int AV79Lectoroptico_lector__wwds_6_tflecopecod ,
                                          String AV81Lectoroptico_lector__wwds_8_tflecfascod ,
                                          short AV83Lectoroptico_lector__wwds_10_tflecfasord ,
                                          short AV84Lectoroptico_lector__wwds_11_tflecparcod ,
                                          String AV86Lectoroptico_lector__wwds_13_tflechor ,
                                          java.util.Date AV87Lectoroptico_lector__wwds_14_tflecfec ,
                                          java.util.Date AV88Lectoroptico_lector__wwds_15_tflecfec_to ,
                                          String AV89Lectoroptico_lector__wwds_16_tflectipent ,
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
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV74Lectoroptico_lector__wwds_1_filterfulltext ,
                                          String A1166LecMaqCod ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String A13722LecEstado ,
                                          String AV75Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                          String AV80Lectoroptico_lector__wwds_7_tflecopenom ,
                                          String AV82Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                          String AV85Lectoroptico_lector__wwds_12_tflecparnom ,
                                          String AV90Lectoroptico_lector__wwds_17_tflecestado_sel ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[13];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, LecMaqCod, EmprCod, LecOpeCod, LecFasCod, LecParCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(RTRIM(LTRIM(LOWER(LecMaqCod))) like '%' || RTRIM(LTRIM(LOWER(?))))");
      if ( ! (0==AV76Lectoroptico_lector__wwds_3_tflecbarcod) )
      {
         addWhere(sWhereString, "(LecBarCod = ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Lectoroptico_lector__wwds_4_tflecbarreo) )
      {
         addWhere(sWhereString, "(LecBarReo = ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Lectoroptico_lector__wwds_5_tflecbarpar)==0) )
      {
         addWhere(sWhereString, "(LecBarPar like '%' || RTRIM(LTRIM(LOWER(?))))");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_lector__wwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod = ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Lectoroptico_lector__wwds_8_tflecfascod)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(UPPER(LecFasCod))) like '%' || RTRIM(LTRIM(UPPER(?))))");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV83Lectoroptico_lector__wwds_10_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd = ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (0==AV84Lectoroptico_lector__wwds_11_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod = ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Lectoroptico_lector__wwds_13_tflechor)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Lectoroptico_lector__wwds_14_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Lectoroptico_lector__wwds_15_tflecfec_to)) )
      {
         addWhere(sWhereString, "(LecFec <= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_lector__wwds_16_tflectipent)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecMaqCod, EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarReo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarPar" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_H022Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H022Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H022Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H022Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
      }
   }

}

