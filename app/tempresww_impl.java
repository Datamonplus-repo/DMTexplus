package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tempresww_impl extends GXDataArea
{
   public tempresww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tempresww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempresww_impl.class ));
   }

   public tempresww_impl( int remoteHandle ,
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
      AV125FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV43TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV44TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV46TFEmprNom = httpContext.GetPar( "TFEmprNom") ;
      AV47TFEmprNom_Sel = httpContext.GetPar( "TFEmprNom_Sel") ;
      AV49TFEmprDir = httpContext.GetPar( "TFEmprDir") ;
      AV50TFEmprDir_Sel = httpContext.GetPar( "TFEmprDir_Sel") ;
      AV52TFEmprCpo = httpContext.GetPar( "TFEmprCpo") ;
      AV53TFEmprCpo_Sel = httpContext.GetPar( "TFEmprCpo_Sel") ;
      AV55TFEmprPob = httpContext.GetPar( "TFEmprPob") ;
      AV56TFEmprPob_Sel = httpContext.GetPar( "TFEmprPob_Sel") ;
      AV58TFEmprCif = httpContext.GetPar( "TFEmprCif") ;
      AV59TFEmprCif_Sel = httpContext.GetPar( "TFEmprCif_Sel") ;
      AV61TFEmprTel = httpContext.GetPar( "TFEmprTel") ;
      AV62TFEmprTel_Sel = httpContext.GetPar( "TFEmprTel_Sel") ;
      AV64TFEmprFax = httpContext.GetPar( "TFEmprFax") ;
      AV65TFEmprFax_Sel = httpContext.GetPar( "TFEmprFax_Sel") ;
      AV67TFIvaCod = httpContext.GetPar( "TFIvaCod") ;
      AV68TFIvaCod_Sel = httpContext.GetPar( "TFIvaCod_Sel") ;
      AV70TFIvaDsc = httpContext.GetPar( "TFIvaDsc") ;
      AV71TFIvaDsc_Sel = httpContext.GetPar( "TFIvaDsc_Sel") ;
      AV73TFIvaPor = (byte)(GXutil.lval( httpContext.GetPar( "TFIvaPor"))) ;
      AV74TFIvaPor_To = (byte)(GXutil.lval( httpContext.GetPar( "TFIvaPor_To"))) ;
      AV129Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paWS2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startWS2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tempresww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TEMPRESWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tempresww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV125FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV120GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV121GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV118DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV118DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV43TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV44TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRNOM", GXutil.rtrim( AV46TFEmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRNOM_SEL", GXutil.rtrim( AV47TFEmprNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRDIR", GXutil.rtrim( AV49TFEmprDir));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRDIR_SEL", GXutil.rtrim( AV50TFEmprDir_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCPO", GXutil.rtrim( AV52TFEmprCpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCPO_SEL", GXutil.rtrim( AV53TFEmprCpo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRPOB", GXutil.rtrim( AV55TFEmprPob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRPOB_SEL", GXutil.rtrim( AV56TFEmprPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCIF", GXutil.rtrim( AV58TFEmprCif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCIF_SEL", GXutil.rtrim( AV59TFEmprCif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRTEL", GXutil.rtrim( AV61TFEmprTel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRTEL_SEL", GXutil.rtrim( AV62TFEmprTel_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRFAX", GXutil.rtrim( AV64TFEmprFax));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRFAX_SEL", GXutil.rtrim( AV65TFEmprFax_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVACOD", GXutil.rtrim( AV67TFIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVACOD_SEL", GXutil.rtrim( AV68TFIvaCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVADSC", GXutil.rtrim( AV70TFIvaDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVADSC_SEL", GXutil.rtrim( AV71TFIvaDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVAPOR", GXutil.ltrim( localUtil.ntoc( AV73TFIvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIVAPOR_TO", GXutil.ltrim( localUtil.ntoc( AV74TFIvaPor_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         weWS2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtWS2( ) ;
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
      return formatLink("app.tempresww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TEMPRESWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " EMPRESAS", "") ;
   }

   public void wbWS0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_WS2( true) ;
      }
      else
      {
         wb_table1_27_WS2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_WS2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV120GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV121GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV129Pgmname), GXutil.rtrim( localUtil.format( AV129Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPRESWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV118DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV118DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
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

   public void startWS2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " EMPRESAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupWS0( ) ;
   }

   public void wsWS2( )
   {
      startWS2( ) ;
      evtWS2( ) ;
   }

   public void evtWS2( )
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
                           e11WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18WS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19WS2 ();
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
                           AV126GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A404EmprDir = httpContext.cgiGet( edtEmprDir_Internalname) ;
                           n404EmprDir = false ;
                           A403EmprCpo = httpContext.cgiGet( edtEmprCpo_Internalname) ;
                           n403EmprCpo = false ;
                           A408EmprPob = httpContext.cgiGet( edtEmprPob_Internalname) ;
                           n408EmprPob = false ;
                           A395EmprCif = httpContext.cgiGet( edtEmprCif_Internalname) ;
                           n395EmprCif = false ;
                           A409EmprTel = httpContext.cgiGet( edtEmprTel_Internalname) ;
                           n409EmprTel = false ;
                           A405EmprFax = httpContext.cgiGet( edtEmprFax_Internalname) ;
                           n405EmprFax = false ;
                           A953IvaCod = GXutil.upper( httpContext.cgiGet( edtIvaCod_Internalname)) ;
                           n953IvaCod = false ;
                           A954IvaDsc = httpContext.cgiGet( edtIvaDsc_Internalname) ;
                           n954IvaDsc = false ;
                           A588IvaPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtIvaPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n588IvaPor = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20WS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21WS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22WS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23WS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV125FilterFullText) != 0 )
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

   public void weWS2( )
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

   public void paWS2( )
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
                                 String AV125FilterFullText ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 String AV43TFEmprCod ,
                                 String AV44TFEmprCod_Sel ,
                                 String AV46TFEmprNom ,
                                 String AV47TFEmprNom_Sel ,
                                 String AV49TFEmprDir ,
                                 String AV50TFEmprDir_Sel ,
                                 String AV52TFEmprCpo ,
                                 String AV53TFEmprCpo_Sel ,
                                 String AV55TFEmprPob ,
                                 String AV56TFEmprPob_Sel ,
                                 String AV58TFEmprCif ,
                                 String AV59TFEmprCif_Sel ,
                                 String AV61TFEmprTel ,
                                 String AV62TFEmprTel_Sel ,
                                 String AV64TFEmprFax ,
                                 String AV65TFEmprFax_Sel ,
                                 String AV67TFIvaCod ,
                                 String AV68TFIvaCod_Sel ,
                                 String AV70TFIvaDsc ,
                                 String AV71TFIvaDsc_Sel ,
                                 byte AV73TFIvaPor ,
                                 byte AV74TFIvaPor_To ,
                                 String AV129Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21WS2 ();
      GRID_nCurrentRecord = 0 ;
      rfWS2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TEMPRESWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tempresww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A407EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      rfWS2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV129Pgmname = "TEMPRESWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfWS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21WS2 ();
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
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV134Tempreswwds_1_filterfulltext ,
                                              AV136Tempreswwds_3_tfemprcod_sel ,
                                              AV135Tempreswwds_2_tfemprcod ,
                                              AV138Tempreswwds_5_tfemprnom_sel ,
                                              AV137Tempreswwds_4_tfemprnom ,
                                              AV140Tempreswwds_7_tfemprdir_sel ,
                                              AV139Tempreswwds_6_tfemprdir ,
                                              AV142Tempreswwds_9_tfemprcpo_sel ,
                                              AV141Tempreswwds_8_tfemprcpo ,
                                              AV144Tempreswwds_11_tfemprpob_sel ,
                                              AV143Tempreswwds_10_tfemprpob ,
                                              AV146Tempreswwds_13_tfemprcif_sel ,
                                              AV145Tempreswwds_12_tfemprcif ,
                                              AV148Tempreswwds_15_tfemprtel_sel ,
                                              AV147Tempreswwds_14_tfemprtel ,
                                              AV150Tempreswwds_17_tfemprfax_sel ,
                                              AV149Tempreswwds_16_tfemprfax ,
                                              AV152Tempreswwds_19_tfivacod_sel ,
                                              AV151Tempreswwds_18_tfivacod ,
                                              AV154Tempreswwds_21_tfivadsc_sel ,
                                              AV153Tempreswwds_20_tfivadsc ,
                                              Byte.valueOf(AV155Tempreswwds_22_tfivapor) ,
                                              Byte.valueOf(AV156Tempreswwds_23_tfivapor_to) ,
                                              A396EmprCod ,
                                              A407EmprNom ,
                                              A404EmprDir ,
                                              A403EmprCpo ,
                                              A408EmprPob ,
                                              A395EmprCif ,
                                              A409EmprTel ,
                                              A405EmprFax ,
                                              A953IvaCod ,
                                              A954IvaDsc ,
                                              Byte.valueOf(A588IvaPor) ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
         lV135Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV135Tempreswwds_2_tfemprcod), 3, "%") ;
         lV137Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV137Tempreswwds_4_tfemprnom), 30, "%") ;
         lV139Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV139Tempreswwds_6_tfemprdir), 35, "%") ;
         lV141Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV141Tempreswwds_8_tfemprcpo), 7, "%") ;
         lV143Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV143Tempreswwds_10_tfemprpob), 35, "%") ;
         lV145Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV145Tempreswwds_12_tfemprcif), 15, "%") ;
         lV147Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV147Tempreswwds_14_tfemprtel), 15, "%") ;
         lV149Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV149Tempreswwds_16_tfemprfax), 15, "%") ;
         lV151Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV151Tempreswwds_18_tfivacod), 3, "%") ;
         lV153Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV153Tempreswwds_20_tfivadsc), 25, "%") ;
         /* Using cursor H00WS2 */
         pr_default.execute(0, new Object[] {lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV135Tempreswwds_2_tfemprcod, AV136Tempreswwds_3_tfemprcod_sel, lV137Tempreswwds_4_tfemprnom, AV138Tempreswwds_5_tfemprnom_sel, lV139Tempreswwds_6_tfemprdir, AV140Tempreswwds_7_tfemprdir_sel, lV141Tempreswwds_8_tfemprcpo, AV142Tempreswwds_9_tfemprcpo_sel, lV143Tempreswwds_10_tfemprpob, AV144Tempreswwds_11_tfemprpob_sel, lV145Tempreswwds_12_tfemprcif, AV146Tempreswwds_13_tfemprcif_sel, lV147Tempreswwds_14_tfemprtel, AV148Tempreswwds_15_tfemprtel_sel, lV149Tempreswwds_16_tfemprfax, AV150Tempreswwds_17_tfemprfax_sel, lV151Tempreswwds_18_tfivacod, AV152Tempreswwds_19_tfivacod_sel, lV153Tempreswwds_20_tfivadsc, AV154Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV155Tempreswwds_22_tfivapor), Byte.valueOf(AV156Tempreswwds_23_tfivapor_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A588IvaPor = H00WS2_A588IvaPor[0] ;
            n588IvaPor = H00WS2_n588IvaPor[0] ;
            A954IvaDsc = H00WS2_A954IvaDsc[0] ;
            n954IvaDsc = H00WS2_n954IvaDsc[0] ;
            A953IvaCod = H00WS2_A953IvaCod[0] ;
            n953IvaCod = H00WS2_n953IvaCod[0] ;
            A405EmprFax = H00WS2_A405EmprFax[0] ;
            n405EmprFax = H00WS2_n405EmprFax[0] ;
            A409EmprTel = H00WS2_A409EmprTel[0] ;
            n409EmprTel = H00WS2_n409EmprTel[0] ;
            A395EmprCif = H00WS2_A395EmprCif[0] ;
            n395EmprCif = H00WS2_n395EmprCif[0] ;
            A408EmprPob = H00WS2_A408EmprPob[0] ;
            n408EmprPob = H00WS2_n408EmprPob[0] ;
            A403EmprCpo = H00WS2_A403EmprCpo[0] ;
            n403EmprCpo = H00WS2_n403EmprCpo[0] ;
            A404EmprDir = H00WS2_A404EmprDir[0] ;
            n404EmprDir = H00WS2_n404EmprDir[0] ;
            A407EmprNom = H00WS2_A407EmprNom[0] ;
            n407EmprNom = H00WS2_n407EmprNom[0] ;
            A396EmprCod = H00WS2_A396EmprCod[0] ;
            A588IvaPor = H00WS2_A588IvaPor[0] ;
            n588IvaPor = H00WS2_n588IvaPor[0] ;
            A954IvaDsc = H00WS2_A954IvaDsc[0] ;
            n954IvaDsc = H00WS2_n954IvaDsc[0] ;
            e22WS2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wbWS0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesWS2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRNOM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A407EmprNom, ""))));
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
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV134Tempreswwds_1_filterfulltext ,
                                           AV136Tempreswwds_3_tfemprcod_sel ,
                                           AV135Tempreswwds_2_tfemprcod ,
                                           AV138Tempreswwds_5_tfemprnom_sel ,
                                           AV137Tempreswwds_4_tfemprnom ,
                                           AV140Tempreswwds_7_tfemprdir_sel ,
                                           AV139Tempreswwds_6_tfemprdir ,
                                           AV142Tempreswwds_9_tfemprcpo_sel ,
                                           AV141Tempreswwds_8_tfemprcpo ,
                                           AV144Tempreswwds_11_tfemprpob_sel ,
                                           AV143Tempreswwds_10_tfemprpob ,
                                           AV146Tempreswwds_13_tfemprcif_sel ,
                                           AV145Tempreswwds_12_tfemprcif ,
                                           AV148Tempreswwds_15_tfemprtel_sel ,
                                           AV147Tempreswwds_14_tfemprtel ,
                                           AV150Tempreswwds_17_tfemprfax_sel ,
                                           AV149Tempreswwds_16_tfemprfax ,
                                           AV152Tempreswwds_19_tfivacod_sel ,
                                           AV151Tempreswwds_18_tfivacod ,
                                           AV154Tempreswwds_21_tfivadsc_sel ,
                                           AV153Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV155Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV156Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV134Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tempreswwds_1_filterfulltext), "%", "") ;
      lV135Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV135Tempreswwds_2_tfemprcod), 3, "%") ;
      lV137Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV137Tempreswwds_4_tfemprnom), 30, "%") ;
      lV139Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV139Tempreswwds_6_tfemprdir), 35, "%") ;
      lV141Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV141Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV143Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV143Tempreswwds_10_tfemprpob), 35, "%") ;
      lV145Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV145Tempreswwds_12_tfemprcif), 15, "%") ;
      lV147Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV147Tempreswwds_14_tfemprtel), 15, "%") ;
      lV149Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV149Tempreswwds_16_tfemprfax), 15, "%") ;
      lV151Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV151Tempreswwds_18_tfivacod), 3, "%") ;
      lV153Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV153Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor H00WS3 */
      pr_default.execute(1, new Object[] {lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV134Tempreswwds_1_filterfulltext, lV135Tempreswwds_2_tfemprcod, AV136Tempreswwds_3_tfemprcod_sel, lV137Tempreswwds_4_tfemprnom, AV138Tempreswwds_5_tfemprnom_sel, lV139Tempreswwds_6_tfemprdir, AV140Tempreswwds_7_tfemprdir_sel, lV141Tempreswwds_8_tfemprcpo, AV142Tempreswwds_9_tfemprcpo_sel, lV143Tempreswwds_10_tfemprpob, AV144Tempreswwds_11_tfemprpob_sel, lV145Tempreswwds_12_tfemprcif, AV146Tempreswwds_13_tfemprcif_sel, lV147Tempreswwds_14_tfemprtel, AV148Tempreswwds_15_tfemprtel_sel, lV149Tempreswwds_16_tfemprfax, AV150Tempreswwds_17_tfemprfax_sel, lV151Tempreswwds_18_tfivacod, AV152Tempreswwds_19_tfivacod_sel, lV153Tempreswwds_20_tfivadsc, AV154Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV155Tempreswwds_22_tfivapor), Byte.valueOf(AV156Tempreswwds_23_tfivapor_to)});
      GRID_nRecordCount = H00WS3_AGRID_nRecordCount[0] ;
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
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV125FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFEmprCod, AV44TFEmprCod_Sel, AV46TFEmprNom, AV47TFEmprNom_Sel, AV49TFEmprDir, AV50TFEmprDir_Sel, AV52TFEmprCpo, AV53TFEmprCpo_Sel, AV55TFEmprPob, AV56TFEmprPob_Sel, AV58TFEmprCif, AV59TFEmprCif_Sel, AV61TFEmprTel, AV62TFEmprTel_Sel, AV64TFEmprFax, AV65TFEmprFax_Sel, AV67TFIvaCod, AV68TFIvaCod_Sel, AV70TFIvaDsc, AV71TFIvaDsc_Sel, AV73TFIvaPor, AV74TFIvaPor_To, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV129Pgmname = "TEMPRESWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupWS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20WS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV118DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV120GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV121GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV125FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
         AV129Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TEMPRESWW");
         AV129Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tempresww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV125FilterFullText) != 0 )
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
      e20WS2 ();
      if (returnInSub) return;
   }

   public void e20WS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV130Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tempresww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV130Station = GXt_char1 ;
      GXv_char2[0] = AV131Emprcod ;
      GXv_char3[0] = AV132Emprnom ;
      GXv_char4[0] = AV133Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV130Station, GXv_char2, GXv_char3, GXv_char4) ;
      tempresww_impl.this.AV131Emprcod = GXv_char2[0] ;
      tempresww_impl.this.AV132Emprnom = GXv_char3[0] ;
      tempresww_impl.this.AV133Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " EMPRESAS", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV118DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV118DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21WS2( )
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
      if ( GXutil.strcmp(AV38Session.getValue("TEMPRESWWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("TEMPRESWWColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprDir_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprDir_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprDir_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprCpo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCpo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCpo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprPob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprPob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprPob_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprCif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCif_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprTel_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprTel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprTel_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprFax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprFax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprFax_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtIvaCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtIvaDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtIvaPor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaPor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaPor_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV120GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120GridCurrentPage), 10, 0));
      AV121GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121GridPageCount), 10, 0));
      AV134Tempreswwds_1_filterfulltext = AV125FilterFullText ;
      AV135Tempreswwds_2_tfemprcod = AV43TFEmprCod ;
      AV136Tempreswwds_3_tfemprcod_sel = AV44TFEmprCod_Sel ;
      AV137Tempreswwds_4_tfemprnom = AV46TFEmprNom ;
      AV138Tempreswwds_5_tfemprnom_sel = AV47TFEmprNom_Sel ;
      AV139Tempreswwds_6_tfemprdir = AV49TFEmprDir ;
      AV140Tempreswwds_7_tfemprdir_sel = AV50TFEmprDir_Sel ;
      AV141Tempreswwds_8_tfemprcpo = AV52TFEmprCpo ;
      AV142Tempreswwds_9_tfemprcpo_sel = AV53TFEmprCpo_Sel ;
      AV143Tempreswwds_10_tfemprpob = AV55TFEmprPob ;
      AV144Tempreswwds_11_tfemprpob_sel = AV56TFEmprPob_Sel ;
      AV145Tempreswwds_12_tfemprcif = AV58TFEmprCif ;
      AV146Tempreswwds_13_tfemprcif_sel = AV59TFEmprCif_Sel ;
      AV147Tempreswwds_14_tfemprtel = AV61TFEmprTel ;
      AV148Tempreswwds_15_tfemprtel_sel = AV62TFEmprTel_Sel ;
      AV149Tempreswwds_16_tfemprfax = AV64TFEmprFax ;
      AV150Tempreswwds_17_tfemprfax_sel = AV65TFEmprFax_Sel ;
      AV151Tempreswwds_18_tfivacod = AV67TFIvaCod ;
      AV152Tempreswwds_19_tfivacod_sel = AV68TFIvaCod_Sel ;
      AV153Tempreswwds_20_tfivadsc = AV70TFIvaDsc ;
      AV154Tempreswwds_21_tfivadsc_sel = AV71TFIvaDsc_Sel ;
      AV155Tempreswwds_22_tfivapor = AV73TFIvaPor ;
      AV156Tempreswwds_23_tfivapor_to = AV74TFIvaPor_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12WS2( )
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
         AV119PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV119PageToGo) ;
      }
   }

   public void e13WS2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14WS2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV43TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFEmprCod", AV43TFEmprCod);
            AV44TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprCod_Sel", AV44TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprNom") == 0 )
         {
            AV46TFEmprNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFEmprNom", AV46TFEmprNom);
            AV47TFEmprNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFEmprNom_Sel", AV47TFEmprNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprDir") == 0 )
         {
            AV49TFEmprDir = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFEmprDir", AV49TFEmprDir);
            AV50TFEmprDir_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFEmprDir_Sel", AV50TFEmprDir_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCpo") == 0 )
         {
            AV52TFEmprCpo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFEmprCpo", AV52TFEmprCpo);
            AV53TFEmprCpo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFEmprCpo_Sel", AV53TFEmprCpo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprPob") == 0 )
         {
            AV55TFEmprPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFEmprPob", AV55TFEmprPob);
            AV56TFEmprPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFEmprPob_Sel", AV56TFEmprPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCif") == 0 )
         {
            AV58TFEmprCif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFEmprCif", AV58TFEmprCif);
            AV59TFEmprCif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFEmprCif_Sel", AV59TFEmprCif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprTel") == 0 )
         {
            AV61TFEmprTel = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFEmprTel", AV61TFEmprTel);
            AV62TFEmprTel_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFEmprTel_Sel", AV62TFEmprTel_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprFax") == 0 )
         {
            AV64TFEmprFax = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFEmprFax", AV64TFEmprFax);
            AV65TFEmprFax_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFEmprFax_Sel", AV65TFEmprFax_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IvaCod") == 0 )
         {
            AV67TFIvaCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFIvaCod", AV67TFIvaCod);
            AV68TFIvaCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFIvaCod_Sel", AV68TFIvaCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IvaDsc") == 0 )
         {
            AV70TFIvaDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFIvaDsc", AV70TFIvaDsc);
            AV71TFIvaDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFIvaDsc_Sel", AV71TFIvaDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IvaPor") == 0 )
         {
            AV73TFIvaPor = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFIvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFIvaPor), 2, 0));
            AV74TFIvaPor_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFIvaPor_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFIvaPor_To), 2, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22WS2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", httpContext.getMessage( "Imprimir Parametros", ""), (short)(0));
      cmbavGridactions.addItem("5", httpContext.getMessage( "Parametros", ""), (short)(0));
      edtEmprNom_Link = formatLink("app.tempparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(45) ;
      }
      sendrow_452( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV126GridActions, 4, 0)) );
   }

   public void e15WS2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TEMPRESWWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11WS2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TEMPRESWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV129Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TEMPRESWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TEMPRESWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tempresww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV40ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV40ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV129Pgmname+"GridState", AV40ManageFiltersXml) ;
            AV10GridState.fromxml(AV40ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e23WS2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV126GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV126GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV126GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV126GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIRPARAMETROS' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV126GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S232 ();
         if (returnInSub) return;
      }
      AV126GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV126GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16WS2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17WS2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tempreswwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tempresww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tempresww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV32ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV32ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18WS2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( 0 > 1 )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         Innewwindow1_Target = formatLink("app.tempreswwexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /* Window Datatype Object Property */
      AV124window.setUrl( formatLink("app.rlempre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"PEmpCod","UEmpCod","ImpCod"})  );
      AV124window.setReturnParms(new Object[] {"A396EmprCod","A396EmprCod","",});
      httpContext.newWindow(AV124window);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19WS2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tempreswwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
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
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Empresa", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprNom", "", "Nombre", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprDir", "", "Dirección", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCpo", "", "Código Postal", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprPob", "", "Población", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCif", "", "CIF", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprTel", "", "Teléfono", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprFax", "", "Fax", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IvaCod", "", "Codigo IVA", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IvaDsc", "", "Descripcion IVA", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "IvaPor", "", "IVA General", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TEMPRESWWColumnsSelector", GXv_char4) ;
      tempresww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TEMPRESWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV125FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
      AV43TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFEmprCod", AV43TFEmprCod);
      AV44TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprCod_Sel", AV44TFEmprCod_Sel);
      AV46TFEmprNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFEmprNom", AV46TFEmprNom);
      AV47TFEmprNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFEmprNom_Sel", AV47TFEmprNom_Sel);
      AV49TFEmprDir = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFEmprDir", AV49TFEmprDir);
      AV50TFEmprDir_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFEmprDir_Sel", AV50TFEmprDir_Sel);
      AV52TFEmprCpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFEmprCpo", AV52TFEmprCpo);
      AV53TFEmprCpo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFEmprCpo_Sel", AV53TFEmprCpo_Sel);
      AV55TFEmprPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFEmprPob", AV55TFEmprPob);
      AV56TFEmprPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFEmprPob_Sel", AV56TFEmprPob_Sel);
      AV58TFEmprCif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFEmprCif", AV58TFEmprCif);
      AV59TFEmprCif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFEmprCif_Sel", AV59TFEmprCif_Sel);
      AV61TFEmprTel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFEmprTel", AV61TFEmprTel);
      AV62TFEmprTel_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFEmprTel_Sel", AV62TFEmprTel_Sel);
      AV64TFEmprFax = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFEmprFax", AV64TFEmprFax);
      AV65TFEmprFax_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFEmprFax_Sel", AV65TFEmprFax_Sel);
      AV67TFIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFIvaCod", AV67TFIvaCod);
      AV68TFIvaCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFIvaCod_Sel", AV68TFIvaCod_Sel);
      AV70TFIvaDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFIvaDsc", AV70TFIvaDsc);
      AV71TFIvaDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFIvaDsc_Sel", AV71TFIvaDsc_Sel);
      AV73TFIvaPor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFIvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFIvaPor), 2, 0));
      AV74TFIvaPor_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFIvaPor_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFIvaPor_To), 2, 0));
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
      callWebObject(formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"Mode","EmprCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"Mode","EmprCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tempres", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod))}, new String[] {"Mode","EmprCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO IMPRIMIRPARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rlempre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"PEmpCod","UEmpCod","ImpCod"}) , new Object[] {"A396EmprCod","A396EmprCod",""});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A407EmprNom))}, new String[] {"Mode","EmprCod","EmprNom"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV129Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV129Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV129Pgmname+"GridState"), null, null);
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
      AV157GXV1 = 1 ;
      while ( AV157GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV157GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV125FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV43TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFEmprCod", AV43TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV44TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprCod_Sel", AV44TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV46TFEmprNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFEmprNom", AV46TFEmprNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV47TFEmprNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFEmprNom_Sel", AV47TFEmprNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR") == 0 )
         {
            AV49TFEmprDir = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFEmprDir", AV49TFEmprDir);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR_SEL") == 0 )
         {
            AV50TFEmprDir_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFEmprDir_Sel", AV50TFEmprDir_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO") == 0 )
         {
            AV52TFEmprCpo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFEmprCpo", AV52TFEmprCpo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO_SEL") == 0 )
         {
            AV53TFEmprCpo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFEmprCpo_Sel", AV53TFEmprCpo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB") == 0 )
         {
            AV55TFEmprPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFEmprPob", AV55TFEmprPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB_SEL") == 0 )
         {
            AV56TFEmprPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFEmprPob_Sel", AV56TFEmprPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF") == 0 )
         {
            AV58TFEmprCif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFEmprCif", AV58TFEmprCif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF_SEL") == 0 )
         {
            AV59TFEmprCif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFEmprCif_Sel", AV59TFEmprCif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL") == 0 )
         {
            AV61TFEmprTel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFEmprTel", AV61TFEmprTel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL_SEL") == 0 )
         {
            AV62TFEmprTel_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFEmprTel_Sel", AV62TFEmprTel_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX") == 0 )
         {
            AV64TFEmprFax = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFEmprFax", AV64TFEmprFax);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX_SEL") == 0 )
         {
            AV65TFEmprFax_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFEmprFax_Sel", AV65TFEmprFax_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD") == 0 )
         {
            AV67TFIvaCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFIvaCod", AV67TFIvaCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD_SEL") == 0 )
         {
            AV68TFIvaCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFIvaCod_Sel", AV68TFIvaCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC") == 0 )
         {
            AV70TFIvaDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFIvaDsc", AV70TFIvaDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC_SEL") == 0 )
         {
            AV71TFIvaDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFIvaDsc_Sel", AV71TFIvaDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVAPOR") == 0 )
         {
            AV73TFIvaPor = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFIvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFIvaPor), 2, 0));
            AV74TFIvaPor_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFIvaPor_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFIvaPor_To), 2, 0));
         }
         AV157GXV1 = (int)(AV157GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFEmprCod_Sel)==0), AV44TFEmprCod_Sel, GXv_char4) ;
      tempresww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFEmprNom_Sel)==0), AV47TFEmprNom_Sel, GXv_char3) ;
      tempresww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFEmprDir_Sel)==0), AV50TFEmprDir_Sel, GXv_char2) ;
      tempresww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFEmprCpo_Sel)==0), AV53TFEmprCpo_Sel, GXv_char15) ;
      tempresww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFEmprPob_Sel)==0), AV56TFEmprPob_Sel, GXv_char17) ;
      tempresww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFEmprCif_Sel)==0), AV59TFEmprCif_Sel, GXv_char19) ;
      tempresww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFEmprTel_Sel)==0), AV62TFEmprTel_Sel, GXv_char21) ;
      tempresww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFEmprFax_Sel)==0), AV65TFEmprFax_Sel, GXv_char23) ;
      tempresww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFIvaCod_Sel)==0), AV68TFIvaCod_Sel, GXv_char25) ;
      tempresww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFIvaDsc_Sel)==0), AV71TFIvaDsc_Sel, GXv_char27) ;
      tempresww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFEmprCod)==0), AV43TFEmprCod, GXv_char27) ;
      tempresww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFEmprNom)==0), AV46TFEmprNom, GXv_char25) ;
      tempresww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFEmprDir)==0), AV49TFEmprDir, GXv_char23) ;
      tempresww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFEmprCpo)==0), AV52TFEmprCpo, GXv_char21) ;
      tempresww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFEmprPob)==0), AV55TFEmprPob, GXv_char19) ;
      tempresww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFEmprCif)==0), AV58TFEmprCif, GXv_char17) ;
      tempresww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFEmprTel)==0), AV61TFEmprTel, GXv_char15) ;
      tempresww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFEmprFax)==0), AV64TFEmprFax, GXv_char4) ;
      tempresww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFIvaCod)==0), AV67TFIvaCod, GXv_char3) ;
      tempresww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFIvaDsc)==0), AV70TFIvaDsc, GXv_char2) ;
      tempresww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV73TFIvaPor) ? "" : GXutil.str( AV73TFIvaPor, 2, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||||"+((0==AV74TFIvaPor_To) ? "" : GXutil.str( AV74TFIvaPor_To, 2, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV129Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV125FilterFullText)==0), (short)(0), AV125FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRCOD", "", !(GXutil.strcmp("", AV43TFEmprCod)==0), (short)(0), AV43TFEmprCod, "", !(GXutil.strcmp("", AV44TFEmprCod_Sel)==0), AV44TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRNOM", "", !(GXutil.strcmp("", AV46TFEmprNom)==0), (short)(0), AV46TFEmprNom, "", !(GXutil.strcmp("", AV47TFEmprNom_Sel)==0), AV47TFEmprNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRDIR", "", !(GXutil.strcmp("", AV49TFEmprDir)==0), (short)(0), AV49TFEmprDir, "", !(GXutil.strcmp("", AV50TFEmprDir_Sel)==0), AV50TFEmprDir_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRCPO", "", !(GXutil.strcmp("", AV52TFEmprCpo)==0), (short)(0), AV52TFEmprCpo, "", !(GXutil.strcmp("", AV53TFEmprCpo_Sel)==0), AV53TFEmprCpo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRPOB", "", !(GXutil.strcmp("", AV55TFEmprPob)==0), (short)(0), AV55TFEmprPob, "", !(GXutil.strcmp("", AV56TFEmprPob_Sel)==0), AV56TFEmprPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRCIF", "", !(GXutil.strcmp("", AV58TFEmprCif)==0), (short)(0), AV58TFEmprCif, "", !(GXutil.strcmp("", AV59TFEmprCif_Sel)==0), AV59TFEmprCif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRTEL", "", !(GXutil.strcmp("", AV61TFEmprTel)==0), (short)(0), AV61TFEmprTel, "", !(GXutil.strcmp("", AV62TFEmprTel_Sel)==0), AV62TFEmprTel_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRFAX", "", !(GXutil.strcmp("", AV64TFEmprFax)==0), (short)(0), AV64TFEmprFax, "", !(GXutil.strcmp("", AV65TFEmprFax_Sel)==0), AV65TFEmprFax_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFIVACOD", "", !(GXutil.strcmp("", AV67TFIvaCod)==0), (short)(0), AV67TFIvaCod, "", !(GXutil.strcmp("", AV68TFIvaCod_Sel)==0), AV68TFIvaCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFIVADSC", "", !(GXutil.strcmp("", AV70TFIvaDsc)==0), (short)(0), AV70TFIvaDsc, "", !(GXutil.strcmp("", AV71TFIvaDsc_Sel)==0), AV71TFIvaDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFIVAPOR", "", !((0==AV73TFIvaPor)&&(0==AV74TFIvaPor_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFIvaPor, 2, 0)), GXutil.trim( GXutil.str( AV74TFIvaPor_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV129Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV129Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TEMPRES" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_WS2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_WS2( true) ;
      }
      else
      {
         wb_table2_32_WS2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_WS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_WS2e( true) ;
      }
      else
      {
         wb_table1_27_WS2e( false) ;
      }
   }

   public void wb_table2_32_WS2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV125FilterFullText, GXutil.rtrim( localUtil.format( AV125FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TEMPRESWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_WS2e( true) ;
      }
      else
      {
         wb_table2_32_WS2e( false) ;
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
      paWS2( ) ;
      wsWS2( ) ;
      weWS2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513946", true, true);
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
      httpContext.AddJavascriptSource("tempresww.js", "?20268241513946", false, true);
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
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtEmprDir_Internalname = "EMPRDIR_"+sGXsfl_45_idx ;
      edtEmprCpo_Internalname = "EMPRCPO_"+sGXsfl_45_idx ;
      edtEmprPob_Internalname = "EMPRPOB_"+sGXsfl_45_idx ;
      edtEmprCif_Internalname = "EMPRCIF_"+sGXsfl_45_idx ;
      edtEmprTel_Internalname = "EMPRTEL_"+sGXsfl_45_idx ;
      edtEmprFax_Internalname = "EMPRFAX_"+sGXsfl_45_idx ;
      edtIvaCod_Internalname = "IVACOD_"+sGXsfl_45_idx ;
      edtIvaDsc_Internalname = "IVADSC_"+sGXsfl_45_idx ;
      edtIvaPor_Internalname = "IVAPOR_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtEmprDir_Internalname = "EMPRDIR_"+sGXsfl_45_fel_idx ;
      edtEmprCpo_Internalname = "EMPRCPO_"+sGXsfl_45_fel_idx ;
      edtEmprPob_Internalname = "EMPRPOB_"+sGXsfl_45_fel_idx ;
      edtEmprCif_Internalname = "EMPRCIF_"+sGXsfl_45_fel_idx ;
      edtEmprTel_Internalname = "EMPRTEL_"+sGXsfl_45_fel_idx ;
      edtEmprFax_Internalname = "EMPRFAX_"+sGXsfl_45_fel_idx ;
      edtIvaCod_Internalname = "IVACOD_"+sGXsfl_45_fel_idx ;
      edtIvaDsc_Internalname = "IVADSC_"+sGXsfl_45_fel_idx ;
      edtIvaPor_Internalname = "IVAPOR_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbWS0( ) ;
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
               AV126GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV126GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV126GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV126GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'",edtEmprNom_Link,"","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEmprNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprDir_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprDir_Internalname,GXutil.rtrim( A404EmprDir),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprDir_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprDir_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCpo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCpo_Internalname,GXutil.rtrim( A403EmprCpo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCpo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprPob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprPob_Internalname,GXutil.rtrim( A408EmprPob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprPob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCif_Internalname,GXutil.rtrim( A395EmprCif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprTel_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprTel_Internalname,GXutil.rtrim( A409EmprTel),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprTel_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprTel_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprFax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprFax_Internalname,GXutil.rtrim( A405EmprFax),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprFax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprFax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtIvaCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIvaCod_Internalname,GXutil.rtrim( A953IvaCod),GXutil.rtrim( localUtil.format( A953IvaCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIvaCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIvaCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtIvaDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIvaDsc_Internalname,GXutil.rtrim( A954IvaDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIvaDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIvaDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtIvaPor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIvaPor_Internalname,GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIvaPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIvaPor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesWS2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprDir_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dirección", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCpo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprPob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Población", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CIF", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprTel_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teléfono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprFax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fax", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIvaCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIvaDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIvaPor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "IVA General", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV126GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtEmprNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A404EmprDir));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprDir_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A403EmprCpo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCpo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A408EmprPob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprPob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A395EmprCif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A409EmprTel));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprTel_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A405EmprFax));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprFax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A953IvaCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIvaCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A954IvaDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIvaDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIvaPor_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprDir_Internalname = "EMPRDIR" ;
      edtEmprCpo_Internalname = "EMPRCPO" ;
      edtEmprPob_Internalname = "EMPRPOB" ;
      edtEmprCif_Internalname = "EMPRCIF" ;
      edtEmprTel_Internalname = "EMPRTEL" ;
      edtEmprFax_Internalname = "EMPRFAX" ;
      edtIvaCod_Internalname = "IVACOD" ;
      edtIvaDsc_Internalname = "IVADSC" ;
      edtIvaPor_Internalname = "IVAPOR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
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
      edtIvaPor_Jsonclick = "" ;
      edtIvaDsc_Jsonclick = "" ;
      edtIvaCod_Jsonclick = "" ;
      edtEmprFax_Jsonclick = "" ;
      edtEmprTel_Jsonclick = "" ;
      edtEmprCif_Jsonclick = "" ;
      edtEmprPob_Jsonclick = "" ;
      edtEmprCpo_Jsonclick = "" ;
      edtEmprDir_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Link = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtIvaPor_Visible = -1 ;
      edtIvaDsc_Visible = -1 ;
      edtIvaCod_Visible = -1 ;
      edtEmprFax_Visible = -1 ;
      edtEmprTel_Visible = -1 ;
      edtEmprCif_Visible = -1 ;
      edtEmprPob_Visible = -1 ;
      edtEmprCpo_Visible = -1 ;
      edtEmprDir_Visible = -1 ;
      edtEmprNom_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TEMPRESWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Filterisrange = "||||||||||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Character|Character|Character|Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:EmprCod|2:EmprNom|3:EmprDir|4:EmprCpo|5:EmprPob|6:EmprCif|7:EmprTel|8:EmprFax|9:IvaCod|10:IvaDsc|11:IvaPor" ;
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
      Form.setCaption( httpContext.getMessage( " EMPRESAS", "") );
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
         AV126GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV126GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'edtEmprDir_Visible',ctrl:'EMPRDIR',prop:'Visible'},{av:'edtEmprCpo_Visible',ctrl:'EMPRCPO',prop:'Visible'},{av:'edtEmprPob_Visible',ctrl:'EMPRPOB',prop:'Visible'},{av:'edtEmprCif_Visible',ctrl:'EMPRCIF',prop:'Visible'},{av:'edtEmprTel_Visible',ctrl:'EMPRTEL',prop:'Visible'},{av:'edtEmprFax_Visible',ctrl:'EMPRFAX',prop:'Visible'},{av:'edtIvaCod_Visible',ctrl:'IVACOD',prop:'Visible'},{av:'edtIvaDsc_Visible',ctrl:'IVADSC',prop:'Visible'},{av:'edtIvaPor_Visible',ctrl:'IVAPOR',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12WS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13WS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14WS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22WS2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV126GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtEmprNom_Link',ctrl:'EMPRNOM',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15WS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'edtEmprDir_Visible',ctrl:'EMPRDIR',prop:'Visible'},{av:'edtEmprCpo_Visible',ctrl:'EMPRCPO',prop:'Visible'},{av:'edtEmprPob_Visible',ctrl:'EMPRPOB',prop:'Visible'},{av:'edtEmprCif_Visible',ctrl:'EMPRCIF',prop:'Visible'},{av:'edtEmprTel_Visible',ctrl:'EMPRTEL',prop:'Visible'},{av:'edtEmprFax_Visible',ctrl:'EMPRFAX',prop:'Visible'},{av:'edtIvaCod_Visible',ctrl:'IVACOD',prop:'Visible'},{av:'edtIvaDsc_Visible',ctrl:'IVADSC',prop:'Visible'},{av:'edtIvaPor_Visible',ctrl:'IVAPOR',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11WS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'edtEmprDir_Visible',ctrl:'EMPRDIR',prop:'Visible'},{av:'edtEmprCpo_Visible',ctrl:'EMPRCPO',prop:'Visible'},{av:'edtEmprPob_Visible',ctrl:'EMPRPOB',prop:'Visible'},{av:'edtEmprCif_Visible',ctrl:'EMPRCIF',prop:'Visible'},{av:'edtEmprTel_Visible',ctrl:'EMPRTEL',prop:'Visible'},{av:'edtEmprFax_Visible',ctrl:'EMPRFAX',prop:'Visible'},{av:'edtIvaCod_Visible',ctrl:'IVACOD',prop:'Visible'},{av:'edtIvaDsc_Visible',ctrl:'IVADSC',prop:'Visible'},{av:'edtIvaPor_Visible',ctrl:'IVAPOR',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23WS2',iparms:[{av:'cmbavGridactions'},{av:'AV126GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV126GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'edtEmprDir_Visible',ctrl:'EMPRDIR',prop:'Visible'},{av:'edtEmprCpo_Visible',ctrl:'EMPRCPO',prop:'Visible'},{av:'edtEmprPob_Visible',ctrl:'EMPRPOB',prop:'Visible'},{av:'edtEmprCif_Visible',ctrl:'EMPRCIF',prop:'Visible'},{av:'edtEmprTel_Visible',ctrl:'EMPRTEL',prop:'Visible'},{av:'edtEmprFax_Visible',ctrl:'EMPRFAX',prop:'Visible'},{av:'edtIvaCod_Visible',ctrl:'IVACOD',prop:'Visible'},{av:'edtIvaDsc_Visible',ctrl:'IVADSC',prop:'Visible'},{av:'edtIvaPor_Visible',ctrl:'IVAPOR',prop:'Visible'},{av:'AV120GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV121GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16WS2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17WS2',iparms:[{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18WS2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19WS2',iparms:[{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV44TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV46TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV47TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV49TFEmprDir',fld:'vTFEMPRDIR',pic:''},{av:'AV50TFEmprDir_Sel',fld:'vTFEMPRDIR_SEL',pic:''},{av:'AV52TFEmprCpo',fld:'vTFEMPRCPO',pic:''},{av:'AV53TFEmprCpo_Sel',fld:'vTFEMPRCPO_SEL',pic:''},{av:'AV55TFEmprPob',fld:'vTFEMPRPOB',pic:''},{av:'AV56TFEmprPob_Sel',fld:'vTFEMPRPOB_SEL',pic:''},{av:'AV58TFEmprCif',fld:'vTFEMPRCIF',pic:''},{av:'AV59TFEmprCif_Sel',fld:'vTFEMPRCIF_SEL',pic:''},{av:'AV61TFEmprTel',fld:'vTFEMPRTEL',pic:''},{av:'AV62TFEmprTel_Sel',fld:'vTFEMPRTEL_SEL',pic:''},{av:'AV64TFEmprFax',fld:'vTFEMPRFAX',pic:''},{av:'AV65TFEmprFax_Sel',fld:'vTFEMPRFAX_SEL',pic:''},{av:'AV67TFIvaCod',fld:'vTFIVACOD',pic:'@!'},{av:'AV68TFIvaCod_Sel',fld:'vTFIVACOD_SEL',pic:'@!'},{av:'AV70TFIvaDsc',fld:'vTFIVADSC',pic:''},{av:'AV71TFIvaDsc_Sel',fld:'vTFIVADSC_SEL',pic:''},{av:'AV73TFIvaPor',fld:'vTFIVAPOR',pic:'Z9'},{av:'AV74TFIvaPor_To',fld:'vTFIVAPOR_TO',pic:'Z9'},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_IVACOD","{handler:'valid_Ivacod',iparms:[]");
      setEventMetadata("VALID_IVACOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ivapor',iparms:[]");
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
      AV125FilterFullText = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43TFEmprCod = "" ;
      AV44TFEmprCod_Sel = "" ;
      AV46TFEmprNom = "" ;
      AV47TFEmprNom_Sel = "" ;
      AV49TFEmprDir = "" ;
      AV50TFEmprDir_Sel = "" ;
      AV52TFEmprCpo = "" ;
      AV53TFEmprCpo_Sel = "" ;
      AV55TFEmprPob = "" ;
      AV56TFEmprPob_Sel = "" ;
      AV58TFEmprCif = "" ;
      AV59TFEmprCif_Sel = "" ;
      AV61TFEmprTel = "" ;
      AV62TFEmprTel_Sel = "" ;
      AV64TFEmprFax = "" ;
      AV65TFEmprFax_Sel = "" ;
      AV67TFIvaCod = "" ;
      AV68TFIvaCod_Sel = "" ;
      AV70TFIvaDsc = "" ;
      AV71TFIvaDsc_Sel = "" ;
      AV129Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV118DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A953IvaCod = "" ;
      A954IvaDsc = "" ;
      scmdbuf = "" ;
      lV134Tempreswwds_1_filterfulltext = "" ;
      lV135Tempreswwds_2_tfemprcod = "" ;
      lV137Tempreswwds_4_tfemprnom = "" ;
      lV139Tempreswwds_6_tfemprdir = "" ;
      lV141Tempreswwds_8_tfemprcpo = "" ;
      lV143Tempreswwds_10_tfemprpob = "" ;
      lV145Tempreswwds_12_tfemprcif = "" ;
      lV147Tempreswwds_14_tfemprtel = "" ;
      lV149Tempreswwds_16_tfemprfax = "" ;
      lV151Tempreswwds_18_tfivacod = "" ;
      lV153Tempreswwds_20_tfivadsc = "" ;
      AV134Tempreswwds_1_filterfulltext = "" ;
      AV136Tempreswwds_3_tfemprcod_sel = "" ;
      AV135Tempreswwds_2_tfemprcod = "" ;
      AV138Tempreswwds_5_tfemprnom_sel = "" ;
      AV137Tempreswwds_4_tfemprnom = "" ;
      AV140Tempreswwds_7_tfemprdir_sel = "" ;
      AV139Tempreswwds_6_tfemprdir = "" ;
      AV142Tempreswwds_9_tfemprcpo_sel = "" ;
      AV141Tempreswwds_8_tfemprcpo = "" ;
      AV144Tempreswwds_11_tfemprpob_sel = "" ;
      AV143Tempreswwds_10_tfemprpob = "" ;
      AV146Tempreswwds_13_tfemprcif_sel = "" ;
      AV145Tempreswwds_12_tfemprcif = "" ;
      AV148Tempreswwds_15_tfemprtel_sel = "" ;
      AV147Tempreswwds_14_tfemprtel = "" ;
      AV150Tempreswwds_17_tfemprfax_sel = "" ;
      AV149Tempreswwds_16_tfemprfax = "" ;
      AV152Tempreswwds_19_tfivacod_sel = "" ;
      AV151Tempreswwds_18_tfivacod = "" ;
      AV154Tempreswwds_21_tfivadsc_sel = "" ;
      AV153Tempreswwds_20_tfivadsc = "" ;
      H00WS2_A588IvaPor = new byte[1] ;
      H00WS2_n588IvaPor = new boolean[] {false} ;
      H00WS2_A954IvaDsc = new String[] {""} ;
      H00WS2_n954IvaDsc = new boolean[] {false} ;
      H00WS2_A953IvaCod = new String[] {""} ;
      H00WS2_n953IvaCod = new boolean[] {false} ;
      H00WS2_A405EmprFax = new String[] {""} ;
      H00WS2_n405EmprFax = new boolean[] {false} ;
      H00WS2_A409EmprTel = new String[] {""} ;
      H00WS2_n409EmprTel = new boolean[] {false} ;
      H00WS2_A395EmprCif = new String[] {""} ;
      H00WS2_n395EmprCif = new boolean[] {false} ;
      H00WS2_A408EmprPob = new String[] {""} ;
      H00WS2_n408EmprPob = new boolean[] {false} ;
      H00WS2_A403EmprCpo = new String[] {""} ;
      H00WS2_n403EmprCpo = new boolean[] {false} ;
      H00WS2_A404EmprDir = new String[] {""} ;
      H00WS2_n404EmprDir = new boolean[] {false} ;
      H00WS2_A407EmprNom = new String[] {""} ;
      H00WS2_n407EmprNom = new boolean[] {false} ;
      H00WS2_A396EmprCod = new String[] {""} ;
      H00WS3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV130Station = "" ;
      AV131Emprcod = "" ;
      AV132Emprnom = "" ;
      AV133Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV40ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV124window = new com.genexus.webpanels.GXWindow();
      AV35UserCustomValue = "" ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
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
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempresww__default(),
         new Object[] {
             new Object[] {
            H00WS2_A588IvaPor, H00WS2_n588IvaPor, H00WS2_A954IvaDsc, H00WS2_n954IvaDsc, H00WS2_A953IvaCod, H00WS2_n953IvaCod, H00WS2_A405EmprFax, H00WS2_n405EmprFax, H00WS2_A409EmprTel, H00WS2_n409EmprTel,
            H00WS2_A395EmprCif, H00WS2_n395EmprCif, H00WS2_A408EmprPob, H00WS2_n408EmprPob, H00WS2_A403EmprCpo, H00WS2_n403EmprCpo, H00WS2_A404EmprDir, H00WS2_n404EmprDir, H00WS2_A407EmprNom, H00WS2_n407EmprNom,
            H00WS2_A396EmprCod
            }
            , new Object[] {
            H00WS3_AGRID_nRecordCount
            }
         }
      );
      AV129Pgmname = "TEMPRESWW" ;
      /* GeneXus formulas. */
      AV129Pgmname = "TEMPRESWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte AV73TFIvaPor ;
   private byte AV74TFIvaPor_To ;
   private byte gxajaxcallmode ;
   private byte A588IvaPor ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV155Tempreswwds_22_tfivapor ;
   private byte AV156Tempreswwds_23_tfivapor_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV126GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int edtEmprDir_Visible ;
   private int edtEmprCpo_Visible ;
   private int edtEmprPob_Visible ;
   private int edtEmprCif_Visible ;
   private int edtEmprTel_Visible ;
   private int edtEmprFax_Visible ;
   private int edtIvaCod_Visible ;
   private int edtIvaDsc_Visible ;
   private int edtIvaPor_Visible ;
   private int AV119PageToGo ;
   private int AV157GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV120GridCurrentPage ;
   private long AV121GridPageCount ;
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
   private String AV43TFEmprCod ;
   private String AV44TFEmprCod_Sel ;
   private String AV46TFEmprNom ;
   private String AV47TFEmprNom_Sel ;
   private String AV49TFEmprDir ;
   private String AV50TFEmprDir_Sel ;
   private String AV52TFEmprCpo ;
   private String AV53TFEmprCpo_Sel ;
   private String AV55TFEmprPob ;
   private String AV56TFEmprPob_Sel ;
   private String AV58TFEmprCif ;
   private String AV59TFEmprCif_Sel ;
   private String AV61TFEmprTel ;
   private String AV62TFEmprTel_Sel ;
   private String AV64TFEmprFax ;
   private String AV65TFEmprFax_Sel ;
   private String AV67TFIvaCod ;
   private String AV68TFIvaCod_Sel ;
   private String AV70TFIvaDsc ;
   private String AV71TFIvaDsc_Sel ;
   private String AV129Pgmname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String A404EmprDir ;
   private String edtEmprDir_Internalname ;
   private String A403EmprCpo ;
   private String edtEmprCpo_Internalname ;
   private String A408EmprPob ;
   private String edtEmprPob_Internalname ;
   private String A395EmprCif ;
   private String edtEmprCif_Internalname ;
   private String A409EmprTel ;
   private String edtEmprTel_Internalname ;
   private String A405EmprFax ;
   private String edtEmprFax_Internalname ;
   private String A953IvaCod ;
   private String edtIvaCod_Internalname ;
   private String A954IvaDsc ;
   private String edtIvaDsc_Internalname ;
   private String edtIvaPor_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV135Tempreswwds_2_tfemprcod ;
   private String lV137Tempreswwds_4_tfemprnom ;
   private String lV139Tempreswwds_6_tfemprdir ;
   private String lV141Tempreswwds_8_tfemprcpo ;
   private String lV143Tempreswwds_10_tfemprpob ;
   private String lV145Tempreswwds_12_tfemprcif ;
   private String lV147Tempreswwds_14_tfemprtel ;
   private String lV149Tempreswwds_16_tfemprfax ;
   private String lV151Tempreswwds_18_tfivacod ;
   private String lV153Tempreswwds_20_tfivadsc ;
   private String AV136Tempreswwds_3_tfemprcod_sel ;
   private String AV135Tempreswwds_2_tfemprcod ;
   private String AV138Tempreswwds_5_tfemprnom_sel ;
   private String AV137Tempreswwds_4_tfemprnom ;
   private String AV140Tempreswwds_7_tfemprdir_sel ;
   private String AV139Tempreswwds_6_tfemprdir ;
   private String AV142Tempreswwds_9_tfemprcpo_sel ;
   private String AV141Tempreswwds_8_tfemprcpo ;
   private String AV144Tempreswwds_11_tfemprpob_sel ;
   private String AV143Tempreswwds_10_tfemprpob ;
   private String AV146Tempreswwds_13_tfemprcif_sel ;
   private String AV145Tempreswwds_12_tfemprcif ;
   private String AV148Tempreswwds_15_tfemprtel_sel ;
   private String AV147Tempreswwds_14_tfemprtel ;
   private String AV150Tempreswwds_17_tfemprfax_sel ;
   private String AV149Tempreswwds_16_tfemprfax ;
   private String AV152Tempreswwds_19_tfivacod_sel ;
   private String AV151Tempreswwds_18_tfivacod ;
   private String AV154Tempreswwds_21_tfivadsc_sel ;
   private String AV153Tempreswwds_20_tfivadsc ;
   private String hsh ;
   private String AV130Station ;
   private String AV131Emprcod ;
   private String AV132Emprnom ;
   private String AV133Usurcod ;
   private String edtEmprNom_Link ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
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
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmprDir_Jsonclick ;
   private String edtEmprCpo_Jsonclick ;
   private String edtEmprPob_Jsonclick ;
   private String edtEmprCif_Jsonclick ;
   private String edtEmprTel_Jsonclick ;
   private String edtEmprFax_Jsonclick ;
   private String edtIvaCod_Jsonclick ;
   private String edtIvaDsc_Jsonclick ;
   private String edtIvaPor_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n404EmprDir ;
   private boolean n403EmprCpo ;
   private boolean n408EmprPob ;
   private boolean n395EmprCif ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n953IvaCod ;
   private boolean n954IvaDsc ;
   private boolean n588IvaPor ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV125FilterFullText ;
   private String lV134Tempreswwds_1_filterfulltext ;
   private String AV134Tempreswwds_1_filterfulltext ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV124window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
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
   private IDataStoreProvider pr_default ;
   private byte[] H00WS2_A588IvaPor ;
   private boolean[] H00WS2_n588IvaPor ;
   private String[] H00WS2_A954IvaDsc ;
   private boolean[] H00WS2_n954IvaDsc ;
   private String[] H00WS2_A953IvaCod ;
   private boolean[] H00WS2_n953IvaCod ;
   private String[] H00WS2_A405EmprFax ;
   private boolean[] H00WS2_n405EmprFax ;
   private String[] H00WS2_A409EmprTel ;
   private boolean[] H00WS2_n409EmprTel ;
   private String[] H00WS2_A395EmprCif ;
   private boolean[] H00WS2_n395EmprCif ;
   private String[] H00WS2_A408EmprPob ;
   private boolean[] H00WS2_n408EmprPob ;
   private String[] H00WS2_A403EmprCpo ;
   private boolean[] H00WS2_n403EmprCpo ;
   private String[] H00WS2_A404EmprDir ;
   private boolean[] H00WS2_n404EmprDir ;
   private String[] H00WS2_A407EmprNom ;
   private boolean[] H00WS2_n407EmprNom ;
   private String[] H00WS2_A396EmprCod ;
   private long[] H00WS3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV118DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tempresww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00WS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV134Tempreswwds_1_filterfulltext ,
                                          String AV136Tempreswwds_3_tfemprcod_sel ,
                                          String AV135Tempreswwds_2_tfemprcod ,
                                          String AV138Tempreswwds_5_tfemprnom_sel ,
                                          String AV137Tempreswwds_4_tfemprnom ,
                                          String AV140Tempreswwds_7_tfemprdir_sel ,
                                          String AV139Tempreswwds_6_tfemprdir ,
                                          String AV142Tempreswwds_9_tfemprcpo_sel ,
                                          String AV141Tempreswwds_8_tfemprcpo ,
                                          String AV144Tempreswwds_11_tfemprpob_sel ,
                                          String AV143Tempreswwds_10_tfemprpob ,
                                          String AV146Tempreswwds_13_tfemprcif_sel ,
                                          String AV145Tempreswwds_12_tfemprcif ,
                                          String AV148Tempreswwds_15_tfemprtel_sel ,
                                          String AV147Tempreswwds_14_tfemprtel ,
                                          String AV150Tempreswwds_17_tfemprfax_sel ,
                                          String AV149Tempreswwds_16_tfemprfax ,
                                          String AV152Tempreswwds_19_tfivacod_sel ,
                                          String AV151Tempreswwds_18_tfivacod ,
                                          String AV154Tempreswwds_21_tfivadsc_sel ,
                                          String AV153Tempreswwds_20_tfivadsc ,
                                          byte AV155Tempreswwds_22_tfivapor ,
                                          byte AV156Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[38];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod" ;
      sFromString = " FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV134Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV136Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV135Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV139Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV141Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV143Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV145Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV147Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV149Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV151Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV155Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV156Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprNom" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprDir" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprDir DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCpo" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCpo DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprPob" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprPob DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCif" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCif DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprTel" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprTel DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprFax" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprFax DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.IvaCod" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.IvaCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.IvaDsc" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.IvaDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.IvaPor" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.IvaPor DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H00WS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV134Tempreswwds_1_filterfulltext ,
                                          String AV136Tempreswwds_3_tfemprcod_sel ,
                                          String AV135Tempreswwds_2_tfemprcod ,
                                          String AV138Tempreswwds_5_tfemprnom_sel ,
                                          String AV137Tempreswwds_4_tfemprnom ,
                                          String AV140Tempreswwds_7_tfemprdir_sel ,
                                          String AV139Tempreswwds_6_tfemprdir ,
                                          String AV142Tempreswwds_9_tfemprcpo_sel ,
                                          String AV141Tempreswwds_8_tfemprcpo ,
                                          String AV144Tempreswwds_11_tfemprpob_sel ,
                                          String AV143Tempreswwds_10_tfemprpob ,
                                          String AV146Tempreswwds_13_tfemprcif_sel ,
                                          String AV145Tempreswwds_12_tfemprcif ,
                                          String AV148Tempreswwds_15_tfemprtel_sel ,
                                          String AV147Tempreswwds_14_tfemprtel ,
                                          String AV150Tempreswwds_17_tfemprfax_sel ,
                                          String AV149Tempreswwds_16_tfemprfax ,
                                          String AV152Tempreswwds_19_tfivacod_sel ,
                                          String AV151Tempreswwds_18_tfivacod ,
                                          String AV154Tempreswwds_21_tfivadsc_sel ,
                                          String AV153Tempreswwds_20_tfivadsc ,
                                          byte AV155Tempreswwds_22_tfivapor ,
                                          byte AV156Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[33];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV134Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
         GXv_int31[1] = (byte)(1) ;
         GXv_int31[2] = (byte)(1) ;
         GXv_int31[3] = (byte)(1) ;
         GXv_int31[4] = (byte)(1) ;
         GXv_int31[5] = (byte)(1) ;
         GXv_int31[6] = (byte)(1) ;
         GXv_int31[7] = (byte)(1) ;
         GXv_int31[8] = (byte)(1) ;
         GXv_int31[9] = (byte)(1) ;
         GXv_int31[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV135Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV139Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV141Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV143Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV145Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV147Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV149Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV151Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV153Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV155Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (0==AV156Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00WS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
            case 1 :
                  return conditional_H00WS3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00WS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00WS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 25);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

