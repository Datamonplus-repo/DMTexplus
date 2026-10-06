package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclientww_impl extends GXDataArea
{
   public tclientww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclientww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclientww_impl.class ));
   }

   public tclientww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavCliact = UIFactory.getCheckbox(this);
      cmbavGridactions = new HTMLChoice();
      chkCliAct = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
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
      AV136CliAct = httpContext.GetPar( "CliAct") ;
      AV124FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV53ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV48ColumnsSelector);
      AV55TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV56TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV61TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV62TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV58TFCliNif = httpContext.GetPar( "TFCliNif") ;
      AV59TFCliNif_Sel = httpContext.GetPar( "TFCliNif_Sel") ;
      AV64TFCliDom = httpContext.GetPar( "TFCliDom") ;
      AV65TFCliDom_Sel = httpContext.GetPar( "TFCliDom_Sel") ;
      AV67TFCliPob = httpContext.GetPar( "TFCliPob") ;
      AV68TFCliPob_Sel = httpContext.GetPar( "TFCliPob_Sel") ;
      AV70TFCliCp = httpContext.GetPar( "TFCliCp") ;
      AV71TFCliCp_Sel = httpContext.GetPar( "TFCliCp_Sel") ;
      AV126TFCliCp2 = httpContext.GetPar( "TFCliCp2") ;
      AV127TFCliCp2_Sel = httpContext.GetPar( "TFCliCp2_Sel") ;
      AV76TFPrvDsc = httpContext.GetPar( "TFPrvDsc") ;
      AV77TFPrvDsc_Sel = httpContext.GetPar( "TFPrvDsc_Sel") ;
      AV140Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV129EmprCod = httpContext.GetPar( "EmprCod") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
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
      pa892( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start892( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tclientww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIENTWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclientww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLIACT", GXutil.rtrim( AV136CliAct));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV124FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_58, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV51ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV51ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV117GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV118GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV115DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV115DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV48ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV48ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV53ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV55TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV56TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV61TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV62TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINIF", GXutil.rtrim( AV58TFCliNif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINIF_SEL", GXutil.rtrim( AV59TFCliNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIDOM", GXutil.rtrim( AV64TFCliDom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIDOM_SEL", GXutil.rtrim( AV65TFCliDom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIPOB", GXutil.rtrim( AV67TFCliPob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIPOB_SEL", GXutil.rtrim( AV68TFCliPob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICP", GXutil.rtrim( AV70TFCliCp));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICP_SEL", GXutil.rtrim( AV71TFCliCp_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICP2", GXutil.rtrim( AV126TFCliCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICP2_SEL", GXutil.rtrim( AV127TFCliCp2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC", GXutil.rtrim( AV76TFPrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC_SEL", GXutil.rtrim( AV77TFPrvDsc_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV129EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129EmprCod, "@!"))));
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
         we892( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt892( ) ;
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
      return formatLink("app.tclientww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCLIENTWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " CLIENTES -", "") ;
   }

   public void wb890( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavCliact.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavCliact.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCliact.getInternalname(), AV136CliAct, "", httpContext.getMessage( "Activo?", ""), 1, chkavCliact.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(32, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,32);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table1_34_892( true) ;
      }
      else
      {
         wb_table1_34_892( false) ;
      }
      return  ;
   }

   public void wb_table1_34_892e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table2_40_892( true) ;
      }
      else
      {
         wb_table2_40_892( false) ;
      }
      return  ;
   }

   public void wb_table2_40_892e( boolean wbgen )
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
         startgridcontrol58( ) ;
      }
      if ( wbEnd == 58 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_58 = (int)(nGXsfl_58_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV117GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV118GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV140Pgmname), GXutil.rtrim( localUtil.format( AV140Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV115DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV115DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV48ColumnsSelector);
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
      if ( wbEnd == 58 )
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

   public void start892( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " CLIENTES -", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup890( ) ;
   }

   public void ws892( )
   {
      start892( ) ;
      evt892( ) ;
   }

   public void evt892( )
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
                           e11892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18892 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19892 ();
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
                           nGXsfl_58_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_582( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV128GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A278CliNif = GXutil.upper( httpContext.cgiGet( edtCliNif_Internalname)) ;
                           A260CliDom = httpContext.cgiGet( edtCliDom_Internalname) ;
                           A295CliPob = httpContext.cgiGet( edtCliPob_Internalname) ;
                           A256CliCp = httpContext.cgiGet( edtCliCp_Internalname) ;
                           A4828CliCp2 = httpContext.cgiGet( edtCliCp2_Internalname) ;
                           A787PrvDsc = GXutil.upper( httpContext.cgiGet( edtPrvDsc_Internalname)) ;
                           n787PrvDsc = false ;
                           A10045CliAct = ((GXutil.strcmp(httpContext.cgiGet( chkCliAct.getInternalname()), "S")==0) ? "S" : "N") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20892 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21892 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22892 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23892 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cliact Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLIACT"), AV136CliAct) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV124FilterFullText) != 0 )
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

   public void we892( )
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

   public void pa892( )
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
            GX_FocusControl = chkavCliact.getInternalname() ;
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
      subsflControlProps_582( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         sendrow_582( ) ;
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV136CliAct ,
                                 String AV124FilterFullText ,
                                 byte AV53ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV48ColumnsSelector ,
                                 int AV55TFCliCod ,
                                 int AV56TFCliCod_To ,
                                 String AV61TFCliNom ,
                                 String AV62TFCliNom_Sel ,
                                 String AV58TFCliNif ,
                                 String AV59TFCliNif_Sel ,
                                 String AV64TFCliDom ,
                                 String AV65TFCliDom_Sel ,
                                 String AV67TFCliPob ,
                                 String AV68TFCliPob_Sel ,
                                 String AV70TFCliCp ,
                                 String AV71TFCliCp_Sel ,
                                 String AV126TFCliCp2 ,
                                 String AV127TFCliCp2_Sel ,
                                 String AV76TFPrvDsc ,
                                 String AV77TFPrvDsc_Sel ,
                                 String AV140Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV129EmprCod ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21892 ();
      GRID_nCurrentRecord = 0 ;
      rf892( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIENTWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclientww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      AV136CliAct = ((GXutil.strcmp(GXutil.rtrim( AV136CliAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136CliAct", AV136CliAct);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf892( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV140Pgmname = "TCLIENTWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavTexto_fd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf892( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(58) ;
      /* Execute user event: Refresh */
      e21892 ();
      nGXsfl_58_idx = 1 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      bGXsfl_58_Refreshing = true ;
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
         subsflControlProps_582( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV141Tclientwwds_1_filterfulltext ,
                                              Integer.valueOf(AV142Tclientwwds_2_tfclicod) ,
                                              Integer.valueOf(AV143Tclientwwds_3_tfclicod_to) ,
                                              AV145Tclientwwds_5_tfclinom_sel ,
                                              AV144Tclientwwds_4_tfclinom ,
                                              AV147Tclientwwds_7_tfclinif_sel ,
                                              AV146Tclientwwds_6_tfclinif ,
                                              AV149Tclientwwds_9_tfclidom_sel ,
                                              AV148Tclientwwds_8_tfclidom ,
                                              AV151Tclientwwds_11_tfclipob_sel ,
                                              AV150Tclientwwds_10_tfclipob ,
                                              AV153Tclientwwds_13_tfclicp_sel ,
                                              AV152Tclientwwds_12_tfclicp ,
                                              AV155Tclientwwds_15_tfclicp2_sel ,
                                              AV154Tclientwwds_14_tfclicp2 ,
                                              AV157Tclientwwds_17_tfprvdsc_sel ,
                                              AV156Tclientwwds_16_tfprvdsc ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A278CliNif ,
                                              A260CliDom ,
                                              A295CliPob ,
                                              A256CliCp ,
                                              A4828CliCp2 ,
                                              A787PrvDsc ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A10045CliAct ,
                                              AV136CliAct } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
         lV144Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV144Tclientwwds_4_tfclinom), 30, "%") ;
         lV146Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV146Tclientwwds_6_tfclinif), 20, "%") ;
         lV148Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV148Tclientwwds_8_tfclidom), 34, "%") ;
         lV150Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV150Tclientwwds_10_tfclipob), 30, "%") ;
         lV152Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV152Tclientwwds_12_tfclicp), 6, "%") ;
         lV154Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV154Tclientwwds_14_tfclicp2), 6, "%") ;
         lV156Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV156Tclientwwds_16_tfprvdsc), 30, "%") ;
         /* Using cursor H00892 */
         pr_default.execute(0, new Object[] {AV136CliAct, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, Integer.valueOf(AV142Tclientwwds_2_tfclicod), Integer.valueOf(AV143Tclientwwds_3_tfclicod_to), lV144Tclientwwds_4_tfclinom, AV145Tclientwwds_5_tfclinom_sel, lV146Tclientwwds_6_tfclinif, AV147Tclientwwds_7_tfclinif_sel, lV148Tclientwwds_8_tfclidom, AV149Tclientwwds_9_tfclidom_sel, lV150Tclientwwds_10_tfclipob, AV151Tclientwwds_11_tfclipob_sel, lV152Tclientwwds_12_tfclicp, AV153Tclientwwds_13_tfclicp_sel, lV154Tclientwwds_14_tfclicp2, AV155Tclientwwds_15_tfclicp2_sel, lV156Tclientwwds_16_tfprvdsc, AV157Tclientwwds_17_tfprvdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_58_idx = 1 ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A781PrvCod = H00892_A781PrvCod[0] ;
            A396EmprCod = H00892_A396EmprCod[0] ;
            A10045CliAct = H00892_A10045CliAct[0] ;
            A787PrvDsc = H00892_A787PrvDsc[0] ;
            n787PrvDsc = H00892_n787PrvDsc[0] ;
            A4828CliCp2 = H00892_A4828CliCp2[0] ;
            A256CliCp = H00892_A256CliCp[0] ;
            A295CliPob = H00892_A295CliPob[0] ;
            A260CliDom = H00892_A260CliDom[0] ;
            A278CliNif = H00892_A278CliNif[0] ;
            A279CliNom = H00892_A279CliNom[0] ;
            A252CliCod = H00892_A252CliCod[0] ;
            A787PrvDsc = H00892_A787PrvDsc[0] ;
            n787PrvDsc = H00892_n787PrvDsc[0] ;
            e22892 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(58) ;
         wb890( ) ;
      }
      bGXsfl_58_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes892( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_58_idx, getSecureSignedToken( sGXsfl_58_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV129EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129EmprCod, "@!"))));
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
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV141Tclientwwds_1_filterfulltext ,
                                           Integer.valueOf(AV142Tclientwwds_2_tfclicod) ,
                                           Integer.valueOf(AV143Tclientwwds_3_tfclicod_to) ,
                                           AV145Tclientwwds_5_tfclinom_sel ,
                                           AV144Tclientwwds_4_tfclinom ,
                                           AV147Tclientwwds_7_tfclinif_sel ,
                                           AV146Tclientwwds_6_tfclinif ,
                                           AV149Tclientwwds_9_tfclidom_sel ,
                                           AV148Tclientwwds_8_tfclidom ,
                                           AV151Tclientwwds_11_tfclipob_sel ,
                                           AV150Tclientwwds_10_tfclipob ,
                                           AV153Tclientwwds_13_tfclicp_sel ,
                                           AV152Tclientwwds_12_tfclicp ,
                                           AV155Tclientwwds_15_tfclicp2_sel ,
                                           AV154Tclientwwds_14_tfclicp2 ,
                                           AV157Tclientwwds_17_tfprvdsc_sel ,
                                           AV156Tclientwwds_16_tfprvdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A278CliNif ,
                                           A260CliDom ,
                                           A295CliPob ,
                                           A256CliCp ,
                                           A4828CliCp2 ,
                                           A787PrvDsc ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A10045CliAct ,
                                           AV136CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV141Tclientwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Tclientwwds_1_filterfulltext), "%", "") ;
      lV144Tclientwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV144Tclientwwds_4_tfclinom), 30, "%") ;
      lV146Tclientwwds_6_tfclinif = GXutil.padr( GXutil.rtrim( AV146Tclientwwds_6_tfclinif), 20, "%") ;
      lV148Tclientwwds_8_tfclidom = GXutil.padr( GXutil.rtrim( AV148Tclientwwds_8_tfclidom), 34, "%") ;
      lV150Tclientwwds_10_tfclipob = GXutil.padr( GXutil.rtrim( AV150Tclientwwds_10_tfclipob), 30, "%") ;
      lV152Tclientwwds_12_tfclicp = GXutil.padr( GXutil.rtrim( AV152Tclientwwds_12_tfclicp), 6, "%") ;
      lV154Tclientwwds_14_tfclicp2 = GXutil.padr( GXutil.rtrim( AV154Tclientwwds_14_tfclicp2), 6, "%") ;
      lV156Tclientwwds_16_tfprvdsc = GXutil.padr( GXutil.rtrim( AV156Tclientwwds_16_tfprvdsc), 30, "%") ;
      /* Using cursor H00893 */
      pr_default.execute(1, new Object[] {AV136CliAct, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, lV141Tclientwwds_1_filterfulltext, Integer.valueOf(AV142Tclientwwds_2_tfclicod), Integer.valueOf(AV143Tclientwwds_3_tfclicod_to), lV144Tclientwwds_4_tfclinom, AV145Tclientwwds_5_tfclinom_sel, lV146Tclientwwds_6_tfclinif, AV147Tclientwwds_7_tfclinif_sel, lV148Tclientwwds_8_tfclidom, AV149Tclientwwds_9_tfclidom_sel, lV150Tclientwwds_10_tfclipob, AV151Tclientwwds_11_tfclipob_sel, lV152Tclientwwds_12_tfclicp, AV153Tclientwwds_13_tfclicp_sel, lV154Tclientwwds_14_tfclicp2, AV155Tclientwwds_15_tfclicp2_sel, lV156Tclientwwds_16_tfprvdsc, AV157Tclientwwds_17_tfprvdsc_sel});
      GRID_nRecordCount = H00893_AGRID_nRecordCount[0] ;
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
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV136CliAct, AV124FilterFullText, AV53ManageFiltersExecutionStep, AV48ColumnsSelector, AV55TFCliCod, AV56TFCliCod_To, AV61TFCliNom, AV62TFCliNom_Sel, AV58TFCliNif, AV59TFCliNif_Sel, AV64TFCliDom, AV65TFCliDom_Sel, AV67TFCliPob, AV68TFCliPob_Sel, AV70TFCliCp, AV71TFCliCp_Sel, AV126TFCliCp2, AV127TFCliCp2_Sel, AV76TFPrvDsc, AV77TFPrvDsc_Sel, AV140Pgmname, AV13OrderedBy, AV14OrderedDsc, AV129EmprCod, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV140Pgmname = "TCLIENTWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
      Gx_err = (short)(0) ;
      edtavTexto_fd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup890( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20892 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV51ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV115DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV48ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV117GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV118GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV136CliAct = ((GXutil.strcmp(httpContext.cgiGet( chkavCliact.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV136CliAct", AV136CliAct);
         AV135Texto_fd = httpContext.cgiGet( edtavTexto_fd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135Texto_fd", AV135Texto_fd);
         AV124FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TCLIENTWW");
         AV140Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140Pgmname", AV140Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV140Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tclientww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLIACT"), AV136CliAct) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV124FilterFullText) != 0 )
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
      e20892 ();
      if (returnInSub) return;
   }

   public void e20892( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV130Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclientww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV130Station = GXt_char1 ;
      GXv_char2[0] = AV129EmprCod ;
      GXv_char3[0] = AV131EmprNom ;
      GXv_char4[0] = AV132UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV130Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclientww_impl.this.AV129EmprCod = GXv_char2[0] ;
      tclientww_impl.this.AV131EmprNom = GXv_char3[0] ;
      tclientww_impl.this.AV132UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129EmprCod", AV129EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV129EmprCod, "@!"))));
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
      Form.setCaption( httpContext.getMessage( " CLIENTES -", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV115DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV115DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = AV134FirmaD ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV129EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int8) ;
      tclientww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV134FirmaD = GXt_int7 ;
      AV135Texto_fd = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135Texto_fd", AV135Texto_fd);
      if ( AV134FirmaD == 1 )
      {
         AV135Texto_fd = httpContext.getMessage( "Assinatura digital é ativada.", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135Texto_fd", AV135Texto_fd);
      }
      AV136CliAct = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136CliAct", AV136CliAct);
   }

   public void e21892( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV53ManageFiltersExecutionStep == 1 )
      {
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV53ManageFiltersExecutionStep == 2 )
      {
         AV53ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV50Session.getValue("TCLIENTWWColumnsSelector"), "") != 0 )
      {
         AV46ColumnsSelectorXML = AV50Session.getValue("TCLIENTWWColumnsSelector") ;
         AV48ColumnsSelector.fromxml(AV46ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNif_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliDom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDom_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliPob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPob_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliCp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCp_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtCliCp2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCp2_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtPrvDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDsc_Visible), 5, 0), !bGXsfl_58_Refreshing);
      chkCliAct.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV48ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "Visible", GXutil.ltrimstr( chkCliAct.getVisible(), 5, 0), !bGXsfl_58_Refreshing);
      AV117GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117GridCurrentPage), 10, 0));
      AV118GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_58_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliNif_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNif_Internalname, "Columnheaderclass", edtCliNif_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliDom_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDom_Internalname, "Columnheaderclass", edtCliDom_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliPob_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPob_Internalname, "Columnheaderclass", edtCliPob_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliCp_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp_Internalname, "Columnheaderclass", edtCliCp_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtCliCp2_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCp2_Internalname, "Columnheaderclass", edtCliCp2_Columnheaderclass, !bGXsfl_58_Refreshing);
      edtPrvDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDsc_Internalname, "Columnheaderclass", edtPrvDsc_Columnheaderclass, !bGXsfl_58_Refreshing);
      chkCliAct.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "Columnheaderclass", chkCliAct.getColumnHeaderClass(), !bGXsfl_58_Refreshing);
      AV141Tclientwwds_1_filterfulltext = AV124FilterFullText ;
      AV142Tclientwwds_2_tfclicod = AV55TFCliCod ;
      AV143Tclientwwds_3_tfclicod_to = AV56TFCliCod_To ;
      AV144Tclientwwds_4_tfclinom = AV61TFCliNom ;
      AV145Tclientwwds_5_tfclinom_sel = AV62TFCliNom_Sel ;
      AV146Tclientwwds_6_tfclinif = AV58TFCliNif ;
      AV147Tclientwwds_7_tfclinif_sel = AV59TFCliNif_Sel ;
      AV148Tclientwwds_8_tfclidom = AV64TFCliDom ;
      AV149Tclientwwds_9_tfclidom_sel = AV65TFCliDom_Sel ;
      AV150Tclientwwds_10_tfclipob = AV67TFCliPob ;
      AV151Tclientwwds_11_tfclipob_sel = AV68TFCliPob_Sel ;
      AV152Tclientwwds_12_tfclicp = AV70TFCliCp ;
      AV153Tclientwwds_13_tfclicp_sel = AV71TFCliCp_Sel ;
      AV154Tclientwwds_14_tfclicp2 = AV126TFCliCp2 ;
      AV155Tclientwwds_15_tfclicp2_sel = AV127TFCliCp2_Sel ;
      AV156Tclientwwds_16_tfprvdsc = AV76TFPrvDsc ;
      AV157Tclientwwds_17_tfprvdsc_sel = AV77TFPrvDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ColumnsSelector", AV48ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ManageFiltersData", AV51ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12892( )
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
         AV116PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV116PageToGo) ;
      }
   }

   public void e13892( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14892( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV55TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCliCod), 6, 0));
            AV56TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV61TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom", AV61TFCliNom);
            AV62TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom_Sel", AV62TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNif") == 0 )
         {
            AV58TFCliNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliNif", AV58TFCliNif);
            AV59TFCliNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliNif_Sel", AV59TFCliNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliDom") == 0 )
         {
            AV64TFCliDom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliDom", AV64TFCliDom);
            AV65TFCliDom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliDom_Sel", AV65TFCliDom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliPob") == 0 )
         {
            AV67TFCliPob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliPob", AV67TFCliPob);
            AV68TFCliPob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliPob_Sel", AV68TFCliPob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCp") == 0 )
         {
            AV70TFCliCp = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliCp", AV70TFCliCp);
            AV71TFCliCp_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliCp_Sel", AV71TFCliCp_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCp2") == 0 )
         {
            AV126TFCliCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFCliCp2", AV126TFCliCp2);
            AV127TFCliCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFCliCp2_Sel", AV127TFCliCp2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDsc") == 0 )
         {
            AV76TFPrvDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrvDsc", AV76TFPrvDsc);
            AV77TFPrvDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrvDsc_Sel", AV77TFPrvDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22892( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Formas de pago", ""), "fa fa-cash-register", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Domicilios Envio", ""), "fa fa-truck", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Domicilios Pago", ""), "fa fa-bank fas fa-file-invoice", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtCliCod_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtCliNom_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliNif_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliDom_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliPob_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliCp_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliCp2_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtPrvDsc_Columnclass = ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      chkCliAct.setColumnClass( ((GXutil.strcmp(A10045CliAct, "N")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(58) ;
      }
      sendrow_582( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_58_Refreshing )
      {
         httpContext.doAjaxLoad(58, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
   }

   public void e15892( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV46ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV48ColumnsSelector.fromJSonString(AV46ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TCLIENTWWColumnsSelector", ((GXutil.strcmp("", AV46ColumnsSelectorXML)==0) ? "" : AV48ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ColumnsSelector", AV48ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ManageFiltersData", AV51ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11892( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TCLIENTWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV140Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TCLIENTWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV53ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53ManageFiltersExecutionStep", GXutil.str( AV53ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV52ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TCLIENTWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tclientww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV52ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV52ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV140Pgmname+"GridState", AV52ManageFiltersXml) ;
            AV10GridState.fromxml(AV52ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ColumnsSelector", AV48ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ManageFiltersData", AV51ManageFiltersData);
   }

   public void e23892( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV128GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 4 )
      {
         /* Execute user subroutine: 'DO FORMASDEPAGO' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 5 )
      {
         /* Execute user subroutine: 'DO DOMICILIOSENVIO' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV128GridActions == 6 )
      {
         /* Execute user subroutine: 'DO DOMICILIOSPAGO' */
         S242 ();
         if (returnInSub) return;
      }
      AV128GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ColumnsSelector", AV48ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ManageFiltersData", AV51ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16892( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tclient", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV129EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","CliCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17892( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV137WebSession.setValue("&CliAct", AV136CliAct);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV44ExcelFilename ;
      GXv_char3[0] = AV45ErrorMessage ;
      new app.tclientwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tclientww_impl.this.AV44ExcelFilename = GXv_char4[0] ;
      tclientww_impl.this.AV45ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV44ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV44ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV45ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18892( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV137WebSession.setValue("&CliAct", AV136CliAct);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tclientwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19892( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV137WebSession.setValue("&CliAct", AV136CliAct);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tclientwwexportcsv", new String[] {}, new String[] {}) );
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
      AV48ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNif", "", "Nif", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliDom", "", "Domicilio ", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliPob", "", "Poblacion", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCp", "", "C. Postal", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCp2", "", "C. Postal(Cont)", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrvDsc", "", "Provincia", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV48ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliAct", "", "Activo?", true, "") ;
      AV48ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV47UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCLIENTWWColumnsSelector", GXv_char4) ;
      tclientww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV47UserCustomValue)==0) ) )
      {
         AV49ColumnsSelectorAux.fromxml(AV47UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV49ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV48ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV49ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV48ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV51ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TCLIENTWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV51ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV124FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
      AV55TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCliCod), 6, 0));
      AV56TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod_To), 6, 0));
      AV61TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom", AV61TFCliNom);
      AV62TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom_Sel", AV62TFCliNom_Sel);
      AV58TFCliNif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliNif", AV58TFCliNif);
      AV59TFCliNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliNif_Sel", AV59TFCliNif_Sel);
      AV64TFCliDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliDom", AV64TFCliDom);
      AV65TFCliDom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliDom_Sel", AV65TFCliDom_Sel);
      AV67TFCliPob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliPob", AV67TFCliPob);
      AV68TFCliPob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliPob_Sel", AV68TFCliPob_Sel);
      AV70TFCliCp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliCp", AV70TFCliCp);
      AV71TFCliCp_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliCp_Sel", AV71TFCliCp_Sel);
      AV126TFCliCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126TFCliCp2", AV126TFCliCp2);
      AV127TFCliCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127TFCliCp2_Sel", AV127TFCliCp2_Sel);
      AV76TFPrvDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrvDsc", AV76TFPrvDsc);
      AV77TFPrvDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrvDsc_Sel", AV77TFPrvDsc_Sel);
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
         callWebObject(formatLink("app.tclient", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.tclient", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tclient", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tclient", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO FORMASDEPAGO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclifpg", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO DOMICILIOSENVIO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclienv", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO DOMICILIOSPAGO' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclipag", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Mode","EmprCod","CliCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV50Session.getValue(AV140Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV140Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV50Session.getValue(AV140Pgmname+"GridState"), null, null);
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
      AV158GXV1 = 1 ;
      while ( AV158GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV158GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV124FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124FilterFullText", AV124FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV55TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCliCod), 6, 0));
            AV56TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV61TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom", AV61TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV62TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliNom_Sel", AV62TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF") == 0 )
         {
            AV58TFCliNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliNif", AV58TFCliNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINIF_SEL") == 0 )
         {
            AV59TFCliNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCliNif_Sel", AV59TFCliNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM") == 0 )
         {
            AV64TFCliDom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliDom", AV64TFCliDom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIDOM_SEL") == 0 )
         {
            AV65TFCliDom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliDom_Sel", AV65TFCliDom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB") == 0 )
         {
            AV67TFCliPob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFCliPob", AV67TFCliPob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIPOB_SEL") == 0 )
         {
            AV68TFCliPob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliPob_Sel", AV68TFCliPob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP") == 0 )
         {
            AV70TFCliCp = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFCliCp", AV70TFCliCp);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP_SEL") == 0 )
         {
            AV71TFCliCp_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliCp_Sel", AV71TFCliCp_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2") == 0 )
         {
            AV126TFCliCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFCliCp2", AV126TFCliCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICP2_SEL") == 0 )
         {
            AV127TFCliCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFCliCp2_Sel", AV127TFCliCp2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV76TFPrvDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrvDsc", AV76TFPrvDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV77TFPrvDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrvDsc_Sel", AV77TFPrvDsc_Sel);
         }
         AV158GXV1 = (int)(AV158GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCliNom_Sel)==0), AV62TFCliNom_Sel, GXv_char4) ;
      tclientww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFCliNif_Sel)==0), AV59TFCliNif_Sel, GXv_char3) ;
      tclientww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFCliDom_Sel)==0), AV65TFCliDom_Sel, GXv_char2) ;
      tclientww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFCliPob_Sel)==0), AV68TFCliPob_Sel, GXv_char17) ;
      tclientww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFCliCp_Sel)==0), AV71TFCliCp_Sel, GXv_char19) ;
      tclientww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV127TFCliCp2_Sel)==0), AV127TFCliCp2_Sel, GXv_char21) ;
      tclientww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFPrvDsc_Sel)==0), AV77TFPrvDsc_Sel, GXv_char23) ;
      tclientww_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCliNom)==0), AV61TFCliNom, GXv_char23) ;
      tclientww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFCliNif)==0), AV58TFCliNif, GXv_char21) ;
      tclientww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFCliDom)==0), AV64TFCliDom, GXv_char19) ;
      tclientww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFCliPob)==0), AV67TFCliPob, GXv_char17) ;
      tclientww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFCliCp)==0), AV70TFCliCp, GXv_char4) ;
      tclientww_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV126TFCliCp2)==0), AV126TFCliCp2, GXv_char3) ;
      tclientww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFPrvDsc)==0), AV76TFPrvDsc, GXv_char2) ;
      tclientww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV55TFCliCod) ? "" : GXutil.str( AV55TFCliCod, 6, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char1+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV56TFCliCod_To) ? "" : GXutil.str( AV56TFCliCod_To, 6, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV50Session.getValue(AV140Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV124FilterFullText)==0), (short)(0), AV124FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV55TFCliCod)&&(0==AV56TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV56TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV61TFCliNom)==0), (short)(0), AV61TFCliNom, "", !(GXutil.strcmp("", AV62TFCliNom_Sel)==0), AV62TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINIF", "", !(GXutil.strcmp("", AV58TFCliNif)==0), (short)(0), AV58TFCliNif, "", !(GXutil.strcmp("", AV59TFCliNif_Sel)==0), AV59TFCliNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLIDOM", "", !(GXutil.strcmp("", AV64TFCliDom)==0), (short)(0), AV64TFCliDom, "", !(GXutil.strcmp("", AV65TFCliDom_Sel)==0), AV65TFCliDom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLIPOB", "", !(GXutil.strcmp("", AV67TFCliPob)==0), (short)(0), AV67TFCliPob, "", !(GXutil.strcmp("", AV68TFCliPob_Sel)==0), AV68TFCliPob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICP", "", !(GXutil.strcmp("", AV70TFCliCp)==0), (short)(0), AV70TFCliCp, "", !(GXutil.strcmp("", AV71TFCliCp_Sel)==0), AV71TFCliCp_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICP2", "", !(GXutil.strcmp("", AV126TFCliCp2)==0), (short)(0), AV126TFCliCp2, "", !(GXutil.strcmp("", AV127TFCliCp2_Sel)==0), AV127TFCliCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFPRVDSC", "", !(GXutil.strcmp("", AV76TFPrvDsc)==0), (short)(0), AV76TFPrvDsc, "", !(GXutil.strcmp("", AV77TFPrvDsc_Sel)==0), AV77TFPrvDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV140Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV140Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCLIENT" );
      AV50Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_40_892( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV51ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_45_892( true) ;
      }
      else
      {
         wb_table3_45_892( false) ;
      }
      return  ;
   }

   public void wb_table3_45_892e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_40_892e( true) ;
      }
      else
      {
         wb_table2_40_892e( false) ;
      }
   }

   public void wb_table3_45_892( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV124FilterFullText, GXutil.rtrim( localUtil.format( AV124FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_45_892e( true) ;
      }
      else
      {
         wb_table3_45_892e( false) ;
      }
   }

   public void wb_table1_34_892( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefirmadigital_Internalname, tblTablefirmadigital_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTexto_fd_Internalname, httpContext.getMessage( "Texto_fd", ""), "gx-form-item WarningAttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_fd_Internalname, GXutil.rtrim( AV135Texto_fd), GXutil.rtrim( localUtil.format( AV135Texto_fd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_fd_Jsonclick, 0, "WarningAttribute", "", "", "", "", 1, edtavTexto_fd_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENTWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_34_892e( true) ;
      }
      else
      {
         wb_table1_34_892e( false) ;
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
      pa892( ) ;
      ws892( ) ;
      we892( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116112847", true, true);
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
      httpContext.AddJavascriptSource("tclientww.js", "?202682116112848", false, true);
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

   public void subsflControlProps_582( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_58_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_58_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_58_idx ;
      edtCliNif_Internalname = "CLINIF_"+sGXsfl_58_idx ;
      edtCliDom_Internalname = "CLIDOM_"+sGXsfl_58_idx ;
      edtCliPob_Internalname = "CLIPOB_"+sGXsfl_58_idx ;
      edtCliCp_Internalname = "CLICP_"+sGXsfl_58_idx ;
      edtCliCp2_Internalname = "CLICP2_"+sGXsfl_58_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_58_idx ;
      chkCliAct.setInternalname( "CLIACT_"+sGXsfl_58_idx );
   }

   public void subsflControlProps_fel_582( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_58_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_58_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_58_fel_idx ;
      edtCliNif_Internalname = "CLINIF_"+sGXsfl_58_fel_idx ;
      edtCliDom_Internalname = "CLIDOM_"+sGXsfl_58_fel_idx ;
      edtCliPob_Internalname = "CLIPOB_"+sGXsfl_58_fel_idx ;
      edtCliCp_Internalname = "CLICP_"+sGXsfl_58_fel_idx ;
      edtCliCp2_Internalname = "CLICP2_"+sGXsfl_58_fel_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_58_fel_idx ;
      chkCliAct.setInternalname( "CLIACT_"+sGXsfl_58_fel_idx );
   }

   public void sendrow_582( )
   {
      subsflControlProps_582( ) ;
      wb890( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_58_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_58_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_58_idx+"',58)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_58_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV128GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_58_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_58_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNif_Internalname,GXutil.rtrim( A278CliNif),GXutil.rtrim( localUtil.format( A278CliNif, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNif_Columnclass,edtCliNif_Columnheaderclass,Integer.valueOf(edtCliNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliDom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliDom_Internalname,GXutil.rtrim( A260CliDom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliDom_Columnclass,edtCliDom_Columnheaderclass,Integer.valueOf(edtCliDom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliPob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPob_Internalname,GXutil.rtrim( A295CliPob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliPob_Columnclass,edtCliPob_Columnheaderclass,Integer.valueOf(edtCliPob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliCp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCp_Internalname,GXutil.rtrim( A256CliCp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCp_Columnclass,edtCliCp_Columnheaderclass,Integer.valueOf(edtCliCp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliCp2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCp2_Internalname,GXutil.rtrim( A4828CliCp2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCp2_Columnclass,edtCliCp2_Columnheaderclass,Integer.valueOf(edtCliCp2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDsc_Internalname,GXutil.rtrim( A787PrvDsc),GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrvDsc_Columnclass,edtPrvDsc_Columnheaderclass,Integer.valueOf(edtPrvDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkCliAct.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIACT_" + sGXsfl_58_idx ;
         chkCliAct.setName( GXCCtl );
         chkCliAct.setWebtags( "" );
         chkCliAct.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "TitleCaption", chkCliAct.getCaption(), !bGXsfl_58_Refreshing);
         chkCliAct.setCheckedValue( "N" );
         A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliAct.getInternalname(),A10045CliAct,"","",Integer.valueOf(chkCliAct.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,chkCliAct.getColumnClass(),chkCliAct.getColumnHeaderClass(),""});
         send_integrity_lvl_hashes892( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      /* End function sendrow_582 */
   }

   public void startgridcontrol58( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"58\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliDom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliPob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Poblacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C. Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCp2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C. Postal(Cont)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Provincia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkCliAct.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activo?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV128GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A278CliNif));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNif_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNif_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A260CliDom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliDom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliDom_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliDom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A295CliPob));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliPob_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliPob_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliPob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A256CliCp));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCp_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCp_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4828CliCp2));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCp2_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCp2_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCp2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A787PrvDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrvDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrvDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10045CliAct));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkCliAct.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkCliAct.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkCliAct.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      chkavCliact.setInternalname( "vCLIACT" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavTexto_fd_Internalname = "vTEXTO_FD" ;
      tblTablefirmadigital_Internalname = "TABLEFIRMADIGITAL" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtCliNif_Internalname = "CLINIF" ;
      edtCliDom_Internalname = "CLIDOM" ;
      edtCliPob_Internalname = "CLIPOB" ;
      edtCliCp_Internalname = "CLICP" ;
      edtCliCp2_Internalname = "CLICP2" ;
      edtPrvDsc_Internalname = "PRVDSC" ;
      chkCliAct.setInternalname( "CLIACT" );
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
      chkCliAct.setCaption( "" );
      chkCliAct.setColumnClass( "WWColumn" );
      edtPrvDsc_Jsonclick = "" ;
      edtPrvDsc_Columnclass = "WWColumn hidden-xs" ;
      edtCliCp2_Jsonclick = "" ;
      edtCliCp2_Columnclass = "WWColumn" ;
      edtCliCp_Jsonclick = "" ;
      edtCliCp_Columnclass = "WWColumn hidden-xs" ;
      edtCliPob_Jsonclick = "" ;
      edtCliPob_Columnclass = "WWColumn hidden-xs" ;
      edtCliDom_Jsonclick = "" ;
      edtCliDom_Columnclass = "WWColumn hidden-xs" ;
      edtCliNif_Jsonclick = "" ;
      edtCliNif_Columnclass = "WWColumn hidden-xs" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn hidden-xs" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTexto_fd_Jsonclick = "" ;
      edtavTexto_fd_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkCliAct.setColumnHeaderClass( "" );
      edtPrvDsc_Columnheaderclass = "" ;
      edtCliCp2_Columnheaderclass = "" ;
      edtCliCp_Columnheaderclass = "" ;
      edtCliPob_Columnheaderclass = "" ;
      edtCliDom_Columnheaderclass = "" ;
      edtCliNif_Columnheaderclass = "" ;
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      chkCliAct.setVisible( -1 );
      edtPrvDsc_Visible = -1 ;
      edtCliCp2_Visible = -1 ;
      edtCliCp_Visible = -1 ;
      edtCliPob_Visible = -1 ;
      edtCliDom_Visible = -1 ;
      edtCliNif_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavCliact.setEnabled( 1 );
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TCLIENTWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T|T|T|" ;
      Ddo_grid_Filterisrange = "T||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Character|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:CliNif|4:CliDom|5:CliPob|6:CliCp|7:CliCp2|8:PrvDsc|9:CliAct" ;
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
      Form.setCaption( httpContext.getMessage( " CLIENTES -", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavCliact.setName( "vCLIACT" );
      chkavCliact.setWebtags( "" );
      chkavCliact.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCliact.getInternalname(), "TitleCaption", chkavCliact.getCaption(), true);
      chkavCliact.setCheckedValue( "N" );
      AV136CliAct = ((GXutil.strcmp(GXutil.rtrim( AV136CliAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136CliAct", AV136CliAct);
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_58_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
      }
      GXCCtl = "CLIACT_" + sGXsfl_58_idx ;
      chkCliAct.setName( GXCCtl );
      chkCliAct.setWebtags( "" );
      chkCliAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliAct.getInternalname(), "TitleCaption", chkCliAct.getCaption(), !bGXsfl_58_Refreshing);
      chkCliAct.setCheckedValue( "N" );
      A10045CliAct = ((GXutil.strcmp(GXutil.rtrim( A10045CliAct), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtCliNif_Visible',ctrl:'CLINIF',prop:'Visible'},{av:'edtCliDom_Visible',ctrl:'CLIDOM',prop:'Visible'},{av:'edtCliPob_Visible',ctrl:'CLIPOB',prop:'Visible'},{av:'edtCliCp_Visible',ctrl:'CLICP',prop:'Visible'},{av:'edtCliCp2_Visible',ctrl:'CLICP2',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'chkCliAct.getVisible()',ctrl:'CLIACT',prop:'Visible'},{av:'AV117GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV118GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtCliNif_Columnheaderclass',ctrl:'CLINIF',prop:'Columnheaderclass'},{av:'edtCliDom_Columnheaderclass',ctrl:'CLIDOM',prop:'Columnheaderclass'},{av:'edtCliPob_Columnheaderclass',ctrl:'CLIPOB',prop:'Columnheaderclass'},{av:'edtCliCp_Columnheaderclass',ctrl:'CLICP',prop:'Columnheaderclass'},{av:'edtCliCp2_Columnheaderclass',ctrl:'CLICP2',prop:'Columnheaderclass'},{av:'edtPrvDsc_Columnheaderclass',ctrl:'PRVDSC',prop:'Columnheaderclass'},{av:'chkCliAct.getColumnHeaderClass()',ctrl:'CLIACT',prop:'Columnheaderclass'},{av:'AV51ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12892',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13892',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14892',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22892',iparms:[{av:'A10045CliAct',fld:'CLIACT',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'edtCliNif_Columnclass',ctrl:'CLINIF',prop:'Columnclass'},{av:'edtCliDom_Columnclass',ctrl:'CLIDOM',prop:'Columnclass'},{av:'edtCliPob_Columnclass',ctrl:'CLIPOB',prop:'Columnclass'},{av:'edtCliCp_Columnclass',ctrl:'CLICP',prop:'Columnclass'},{av:'edtCliCp2_Columnclass',ctrl:'CLICP2',prop:'Columnclass'},{av:'edtPrvDsc_Columnclass',ctrl:'PRVDSC',prop:'Columnclass'},{av:'chkCliAct.getColumnClass()',ctrl:'CLIACT',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15892',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtCliNif_Visible',ctrl:'CLINIF',prop:'Visible'},{av:'edtCliDom_Visible',ctrl:'CLIDOM',prop:'Visible'},{av:'edtCliPob_Visible',ctrl:'CLIPOB',prop:'Visible'},{av:'edtCliCp_Visible',ctrl:'CLICP',prop:'Visible'},{av:'edtCliCp2_Visible',ctrl:'CLICP2',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'chkCliAct.getVisible()',ctrl:'CLIACT',prop:'Visible'},{av:'AV117GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV118GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtCliNif_Columnheaderclass',ctrl:'CLINIF',prop:'Columnheaderclass'},{av:'edtCliDom_Columnheaderclass',ctrl:'CLIDOM',prop:'Columnheaderclass'},{av:'edtCliPob_Columnheaderclass',ctrl:'CLIPOB',prop:'Columnheaderclass'},{av:'edtCliCp_Columnheaderclass',ctrl:'CLICP',prop:'Columnheaderclass'},{av:'edtCliCp2_Columnheaderclass',ctrl:'CLICP2',prop:'Columnheaderclass'},{av:'edtPrvDsc_Columnheaderclass',ctrl:'PRVDSC',prop:'Columnheaderclass'},{av:'chkCliAct.getColumnHeaderClass()',ctrl:'CLIACT',prop:'Columnheaderclass'},{av:'AV51ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11892',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtCliNif_Visible',ctrl:'CLINIF',prop:'Visible'},{av:'edtCliDom_Visible',ctrl:'CLIDOM',prop:'Visible'},{av:'edtCliPob_Visible',ctrl:'CLIPOB',prop:'Visible'},{av:'edtCliCp_Visible',ctrl:'CLICP',prop:'Visible'},{av:'edtCliCp2_Visible',ctrl:'CLICP2',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'chkCliAct.getVisible()',ctrl:'CLIACT',prop:'Visible'},{av:'AV117GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV118GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtCliNif_Columnheaderclass',ctrl:'CLINIF',prop:'Columnheaderclass'},{av:'edtCliDom_Columnheaderclass',ctrl:'CLIDOM',prop:'Columnheaderclass'},{av:'edtCliPob_Columnheaderclass',ctrl:'CLIPOB',prop:'Columnheaderclass'},{av:'edtCliCp_Columnheaderclass',ctrl:'CLICP',prop:'Columnheaderclass'},{av:'edtCliCp2_Columnheaderclass',ctrl:'CLICP2',prop:'Columnheaderclass'},{av:'edtPrvDsc_Columnheaderclass',ctrl:'PRVDSC',prop:'Columnheaderclass'},{av:'chkCliAct.getColumnHeaderClass()',ctrl:'CLIACT',prop:'Columnheaderclass'},{av:'AV51ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23892',iparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtCliNif_Visible',ctrl:'CLINIF',prop:'Visible'},{av:'edtCliDom_Visible',ctrl:'CLIDOM',prop:'Visible'},{av:'edtCliPob_Visible',ctrl:'CLIPOB',prop:'Visible'},{av:'edtCliCp_Visible',ctrl:'CLICP',prop:'Visible'},{av:'edtCliCp2_Visible',ctrl:'CLICP2',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'chkCliAct.getVisible()',ctrl:'CLIACT',prop:'Visible'},{av:'AV117GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV118GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'edtCliNif_Columnheaderclass',ctrl:'CLINIF',prop:'Columnheaderclass'},{av:'edtCliDom_Columnheaderclass',ctrl:'CLIDOM',prop:'Columnheaderclass'},{av:'edtCliPob_Columnheaderclass',ctrl:'CLIPOB',prop:'Columnheaderclass'},{av:'edtCliCp_Columnheaderclass',ctrl:'CLICP',prop:'Columnheaderclass'},{av:'edtCliCp2_Columnheaderclass',ctrl:'CLICP2',prop:'Columnheaderclass'},{av:'edtPrvDsc_Columnheaderclass',ctrl:'PRVDSC',prop:'Columnheaderclass'},{av:'chkCliAct.getColumnHeaderClass()',ctrl:'CLIACT',prop:'Columnheaderclass'},{av:'AV51ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16892',iparms:[{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17892',iparms:[{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18892',iparms:[{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19892',iparms:[{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV136CliAct',fld:'vCLIACT',pic:'@!'},{av:'AV124FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV53ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV48ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV56TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV61TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV62TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV58TFCliNif',fld:'vTFCLINIF',pic:'@!'},{av:'AV59TFCliNif_Sel',fld:'vTFCLINIF_SEL',pic:'@!'},{av:'AV64TFCliDom',fld:'vTFCLIDOM',pic:''},{av:'AV65TFCliDom_Sel',fld:'vTFCLIDOM_SEL',pic:''},{av:'AV67TFCliPob',fld:'vTFCLIPOB',pic:''},{av:'AV68TFCliPob_Sel',fld:'vTFCLIPOB_SEL',pic:''},{av:'AV70TFCliCp',fld:'vTFCLICP',pic:''},{av:'AV71TFCliCp_Sel',fld:'vTFCLICP_SEL',pic:''},{av:'AV126TFCliCp2',fld:'vTFCLICP2',pic:''},{av:'AV127TFCliCp2_Sel',fld:'vTFCLICP2_SEL',pic:''},{av:'AV76TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV77TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV140Pgmname',fld:'vPGMNAME',pic:''},{av:'AV129EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALIDV_CLIACT","{handler:'validv_Cliact',iparms:[]");
      setEventMetadata("VALIDV_CLIACT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cliact',iparms:[]");
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
      AV136CliAct = "" ;
      AV124FilterFullText = "" ;
      AV48ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV61TFCliNom = "" ;
      AV62TFCliNom_Sel = "" ;
      AV58TFCliNif = "" ;
      AV59TFCliNif_Sel = "" ;
      AV64TFCliDom = "" ;
      AV65TFCliDom_Sel = "" ;
      AV67TFCliPob = "" ;
      AV68TFCliPob_Sel = "" ;
      AV70TFCliCp = "" ;
      AV71TFCliCp_Sel = "" ;
      AV126TFCliCp2 = "" ;
      AV127TFCliCp2_Sel = "" ;
      AV76TFPrvDsc = "" ;
      AV77TFPrvDsc_Sel = "" ;
      AV140Pgmname = "" ;
      AV129EmprCod = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV51ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV115DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      A279CliNom = "" ;
      A278CliNif = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A4828CliCp2 = "" ;
      A787PrvDsc = "" ;
      A10045CliAct = "" ;
      scmdbuf = "" ;
      lV141Tclientwwds_1_filterfulltext = "" ;
      lV144Tclientwwds_4_tfclinom = "" ;
      lV146Tclientwwds_6_tfclinif = "" ;
      lV148Tclientwwds_8_tfclidom = "" ;
      lV150Tclientwwds_10_tfclipob = "" ;
      lV152Tclientwwds_12_tfclicp = "" ;
      lV154Tclientwwds_14_tfclicp2 = "" ;
      lV156Tclientwwds_16_tfprvdsc = "" ;
      AV141Tclientwwds_1_filterfulltext = "" ;
      AV145Tclientwwds_5_tfclinom_sel = "" ;
      AV144Tclientwwds_4_tfclinom = "" ;
      AV147Tclientwwds_7_tfclinif_sel = "" ;
      AV146Tclientwwds_6_tfclinif = "" ;
      AV149Tclientwwds_9_tfclidom_sel = "" ;
      AV148Tclientwwds_8_tfclidom = "" ;
      AV151Tclientwwds_11_tfclipob_sel = "" ;
      AV150Tclientwwds_10_tfclipob = "" ;
      AV153Tclientwwds_13_tfclicp_sel = "" ;
      AV152Tclientwwds_12_tfclicp = "" ;
      AV155Tclientwwds_15_tfclicp2_sel = "" ;
      AV154Tclientwwds_14_tfclicp2 = "" ;
      AV157Tclientwwds_17_tfprvdsc_sel = "" ;
      AV156Tclientwwds_16_tfprvdsc = "" ;
      H00892_A781PrvCod = new short[1] ;
      H00892_A396EmprCod = new String[] {""} ;
      H00892_A10045CliAct = new String[] {""} ;
      H00892_A787PrvDsc = new String[] {""} ;
      H00892_n787PrvDsc = new boolean[] {false} ;
      H00892_A4828CliCp2 = new String[] {""} ;
      H00892_A256CliCp = new String[] {""} ;
      H00892_A295CliPob = new String[] {""} ;
      H00892_A260CliDom = new String[] {""} ;
      H00892_A278CliNif = new String[] {""} ;
      H00892_A279CliNom = new String[] {""} ;
      H00892_A252CliCod = new int[1] ;
      H00893_AGRID_nRecordCount = new long[1] ;
      AV135Texto_fd = "" ;
      hsh = "" ;
      AV130Station = "" ;
      AV131EmprNom = "" ;
      AV132UsurCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV50Session = httpContext.getWebSession();
      AV46ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV52ManageFiltersXml = "" ;
      AV137WebSession = httpContext.getWebSession();
      AV44ExcelFilename = "" ;
      AV45ErrorMessage = "" ;
      AV47UserCustomValue = "" ;
      AV49ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclientww__default(),
         new Object[] {
             new Object[] {
            H00892_A781PrvCod, H00892_A396EmprCod, H00892_A10045CliAct, H00892_A787PrvDsc, H00892_n787PrvDsc, H00892_A4828CliCp2, H00892_A256CliCp, H00892_A295CliPob, H00892_A260CliDom, H00892_A278CliNif,
            H00892_A279CliNom, H00892_A252CliCod
            }
            , new Object[] {
            H00893_AGRID_nRecordCount
            }
         }
      );
      AV140Pgmname = "TCLIENTWW" ;
      /* GeneXus formulas. */
      AV140Pgmname = "TCLIENTWW" ;
      Gx_err = (short)(0) ;
      edtavTexto_fd_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV53ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV134FirmaD ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
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
   private short AV128GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A781PrvCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_58 ;
   private int nGXsfl_58_idx=1 ;
   private int AV55TFCliCod ;
   private int AV56TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavTexto_fd_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV142Tclientwwds_2_tfclicod ;
   private int AV143Tclientwwds_3_tfclicod_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtCliNif_Visible ;
   private int edtCliDom_Visible ;
   private int edtCliPob_Visible ;
   private int edtCliCp_Visible ;
   private int edtCliCp2_Visible ;
   private int edtPrvDsc_Visible ;
   private int AV116PageToGo ;
   private int AV158GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV117GridCurrentPage ;
   private long AV118GridPageCount ;
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
   private String sGXsfl_58_idx="0001" ;
   private String AV136CliAct ;
   private String AV61TFCliNom ;
   private String AV62TFCliNom_Sel ;
   private String AV58TFCliNif ;
   private String AV59TFCliNif_Sel ;
   private String AV64TFCliDom ;
   private String AV65TFCliDom_Sel ;
   private String AV67TFCliPob ;
   private String AV68TFCliPob_Sel ;
   private String AV70TFCliCp ;
   private String AV71TFCliCp_Sel ;
   private String AV126TFCliCp2 ;
   private String AV127TFCliCp2_Sel ;
   private String AV76TFPrvDsc ;
   private String AV77TFPrvDsc_Sel ;
   private String AV140Pgmname ;
   private String AV129EmprCod ;
   private String A396EmprCod ;
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
   private String divUnnamedtable1_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A278CliNif ;
   private String edtCliNif_Internalname ;
   private String A260CliDom ;
   private String edtCliDom_Internalname ;
   private String A295CliPob ;
   private String edtCliPob_Internalname ;
   private String A256CliCp ;
   private String edtCliCp_Internalname ;
   private String A4828CliCp2 ;
   private String edtCliCp2_Internalname ;
   private String A787PrvDsc ;
   private String edtPrvDsc_Internalname ;
   private String A10045CliAct ;
   private String edtavTexto_fd_Internalname ;
   private String scmdbuf ;
   private String lV144Tclientwwds_4_tfclinom ;
   private String lV146Tclientwwds_6_tfclinif ;
   private String lV148Tclientwwds_8_tfclidom ;
   private String lV150Tclientwwds_10_tfclipob ;
   private String lV152Tclientwwds_12_tfclicp ;
   private String lV154Tclientwwds_14_tfclicp2 ;
   private String lV156Tclientwwds_16_tfprvdsc ;
   private String AV145Tclientwwds_5_tfclinom_sel ;
   private String AV144Tclientwwds_4_tfclinom ;
   private String AV147Tclientwwds_7_tfclinif_sel ;
   private String AV146Tclientwwds_6_tfclinif ;
   private String AV149Tclientwwds_9_tfclidom_sel ;
   private String AV148Tclientwwds_8_tfclidom ;
   private String AV151Tclientwwds_11_tfclipob_sel ;
   private String AV150Tclientwwds_10_tfclipob ;
   private String AV153Tclientwwds_13_tfclicp_sel ;
   private String AV152Tclientwwds_12_tfclicp ;
   private String AV155Tclientwwds_15_tfclicp2_sel ;
   private String AV154Tclientwwds_14_tfclicp2 ;
   private String AV157Tclientwwds_17_tfprvdsc_sel ;
   private String AV156Tclientwwds_16_tfprvdsc ;
   private String AV135Texto_fd ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV130Station ;
   private String AV131EmprNom ;
   private String AV132UsurCod ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtCliNif_Columnheaderclass ;
   private String edtCliDom_Columnheaderclass ;
   private String edtCliPob_Columnheaderclass ;
   private String edtCliCp_Columnheaderclass ;
   private String edtCliCp2_Columnheaderclass ;
   private String edtPrvDsc_Columnheaderclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtCliNif_Columnclass ;
   private String edtCliDom_Columnclass ;
   private String edtCliPob_Columnclass ;
   private String edtCliCp_Columnclass ;
   private String edtCliCp2_Columnclass ;
   private String edtPrvDsc_Columnclass ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String tblTablefirmadigital_Internalname ;
   private String edtavTexto_fd_Jsonclick ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtCliNif_Jsonclick ;
   private String edtCliDom_Jsonclick ;
   private String edtCliPob_Jsonclick ;
   private String edtCliCp_Jsonclick ;
   private String edtCliCp2_Jsonclick ;
   private String edtPrvDsc_Jsonclick ;
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
   private boolean n787PrvDsc ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV46ColumnsSelectorXML ;
   private String AV52ManageFiltersXml ;
   private String AV47UserCustomValue ;
   private String AV124FilterFullText ;
   private String lV141Tclientwwds_1_filterfulltext ;
   private String AV141Tclientwwds_1_filterfulltext ;
   private String AV44ExcelFilename ;
   private String AV45ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV50Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavCliact ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkCliAct ;
   private IDataStoreProvider pr_default ;
   private short[] H00892_A781PrvCod ;
   private String[] H00892_A396EmprCod ;
   private String[] H00892_A10045CliAct ;
   private String[] H00892_A787PrvDsc ;
   private boolean[] H00892_n787PrvDsc ;
   private String[] H00892_A4828CliCp2 ;
   private String[] H00892_A256CliCp ;
   private String[] H00892_A295CliPob ;
   private String[] H00892_A260CliDom ;
   private String[] H00892_A278CliNif ;
   private String[] H00892_A279CliNom ;
   private int[] H00892_A252CliCod ;
   private long[] H00893_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV137WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV51ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV48ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV49ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV115DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class tclientww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00892( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV141Tclientwwds_1_filterfulltext ,
                                          int AV142Tclientwwds_2_tfclicod ,
                                          int AV143Tclientwwds_3_tfclicod_to ,
                                          String AV145Tclientwwds_5_tfclinom_sel ,
                                          String AV144Tclientwwds_4_tfclinom ,
                                          String AV147Tclientwwds_7_tfclinif_sel ,
                                          String AV146Tclientwwds_6_tfclinif ,
                                          String AV149Tclientwwds_9_tfclidom_sel ,
                                          String AV148Tclientwwds_8_tfclidom ,
                                          String AV151Tclientwwds_11_tfclipob_sel ,
                                          String AV150Tclientwwds_10_tfclipob ,
                                          String AV153Tclientwwds_13_tfclicp_sel ,
                                          String AV152Tclientwwds_12_tfclicp ,
                                          String AV155Tclientwwds_15_tfclicp2_sel ,
                                          String AV154Tclientwwds_14_tfclicp2 ,
                                          String AV157Tclientwwds_17_tfprvdsc_sel ,
                                          String AV156Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A10045CliAct ,
                                          String AV136CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[30];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.PrvCod, T1.EmprCod, T1.CliAct, T2.PrvDsc, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliDom, T1.CliNif, T1.CliNom, T1.CliCod" ;
      sFromString = " FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV141Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
         GXv_int25[2] = (byte)(1) ;
         GXv_int25[3] = (byte)(1) ;
         GXv_int25[4] = (byte)(1) ;
         GXv_int25[5] = (byte)(1) ;
         GXv_int25[6] = (byte)(1) ;
         GXv_int25[7] = (byte)(1) ;
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV144Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV146Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV148Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV150Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV152Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV154Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliNif" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliNif DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliDom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliDom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliPob" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliPob DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCp" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCp DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCp2" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCp2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliAct" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliAct DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H00893( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV141Tclientwwds_1_filterfulltext ,
                                          int AV142Tclientwwds_2_tfclicod ,
                                          int AV143Tclientwwds_3_tfclicod_to ,
                                          String AV145Tclientwwds_5_tfclinom_sel ,
                                          String AV144Tclientwwds_4_tfclinom ,
                                          String AV147Tclientwwds_7_tfclinif_sel ,
                                          String AV146Tclientwwds_6_tfclinif ,
                                          String AV149Tclientwwds_9_tfclidom_sel ,
                                          String AV148Tclientwwds_8_tfclidom ,
                                          String AV151Tclientwwds_11_tfclipob_sel ,
                                          String AV150Tclientwwds_10_tfclipob ,
                                          String AV153Tclientwwds_13_tfclicp_sel ,
                                          String AV152Tclientwwds_12_tfclicp ,
                                          String AV155Tclientwwds_15_tfclicp2_sel ,
                                          String AV154Tclientwwds_14_tfclicp2 ,
                                          String AV157Tclientwwds_17_tfprvdsc_sel ,
                                          String AV156Tclientwwds_16_tfprvdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A278CliNif ,
                                          String A260CliDom ,
                                          String A295CliPob ,
                                          String A256CliCp ,
                                          String A4828CliCp2 ,
                                          String A787PrvDsc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A10045CliAct ,
                                          String AV136CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[25];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.CliAct = ?)");
      if ( ! (GXutil.strcmp("", AV141Tclientwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.CliNif) like '%' || UPPER(?)) or ( UPPER(T1.CliDom) like '%' || UPPER(?)) or ( UPPER(T1.CliPob) like '%' || UPPER(?)) or ( UPPER(T1.CliCp) like '%' || UPPER(?)) or ( UPPER(T1.CliCp2) like '%' || UPPER(?)) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
         GXv_int27[2] = (byte)(1) ;
         GXv_int27[3] = (byte)(1) ;
         GXv_int27[4] = (byte)(1) ;
         GXv_int27[5] = (byte)(1) ;
         GXv_int27[6] = (byte)(1) ;
         GXv_int27[7] = (byte)(1) ;
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Tclientwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Tclientwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tclientwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV144Tclientwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tclientwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNom = ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Tclientwwds_7_tfclinif_sel)==0) && ( ! (GXutil.strcmp("", AV146Tclientwwds_6_tfclinif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Tclientwwds_7_tfclinif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliNif = ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Tclientwwds_9_tfclidom_sel)==0) && ( ! (GXutil.strcmp("", AV148Tclientwwds_8_tfclidom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Tclientwwds_9_tfclidom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliDom = ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Tclientwwds_11_tfclipob_sel)==0) && ( ! (GXutil.strcmp("", AV150Tclientwwds_10_tfclipob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Tclientwwds_11_tfclipob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliPob = ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Tclientwwds_13_tfclicp_sel)==0) && ( ! (GXutil.strcmp("", AV152Tclientwwds_12_tfclicp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Tclientwwds_13_tfclicp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp = ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Tclientwwds_15_tfclicp2_sel)==0) && ( ! (GXutil.strcmp("", AV154Tclientwwds_14_tfclicp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CliCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Tclientwwds_15_tfclicp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CliCp2 = ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Tclientwwds_17_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Tclientwwds_16_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Tclientwwds_17_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00892(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 1 :
                  return conditional_H00893(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00892", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00893", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 34);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
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
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 34);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               return;
      }
   }

}

