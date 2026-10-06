package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacdivww_impl extends GXDataArea
{
   public tfacdivww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfacdivww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacdivww_impl.class ));
   }

   public tfacdivww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbFacDivTCod = new HTMLChoice();
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
      AV26TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV27TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV28TFFacCod = (int)(GXutil.lval( httpContext.GetPar( "TFFacCod"))) ;
      AV29TFFacCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFFacCod_To"))) ;
      AV30TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV31TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV32TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV33TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV35TFFacDivTCod_Sels);
      AV36TFFacDivCod = (byte)(GXutil.lval( httpContext.GetPar( "TFFacDivCod"))) ;
      AV37TFFacDivCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFFacDivCod_To"))) ;
      AV38TFFacDivAbr = httpContext.GetPar( "TFFacDivAbr") ;
      AV39TFFacDivAbr_Sel = httpContext.GetPar( "TFFacDivAbr_Sel") ;
      AV40TFFacRepCod = httpContext.GetPar( "TFFacRepCod") ;
      AV41TFFacRepCod_Sel = httpContext.GetPar( "TFFacRepCod_Sel") ;
      AV42TFFacRepNom = httpContext.GetPar( "TFFacRepNom") ;
      AV43TFFacRepNom_Sel = httpContext.GetPar( "TFFacRepNom_Sel") ;
      AV44TFEmprNom = httpContext.GetPar( "TFEmprNom") ;
      AV45TFEmprNom_Sel = httpContext.GetPar( "TFEmprNom_Sel") ;
      AV53Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa2EE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2EE2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tfacdivww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFACDIVWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tfacdivww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV26TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV27TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOD", GXutil.ltrim( localUtil.ntoc( AV28TFFacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFFacCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV30TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV32TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV33TFCliNom_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFACDIVTCOD_SELS", AV35TFFacDivTCod_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFACDIVTCOD_SELS", AV35TFFacDivTCod_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDIVCOD", GXutil.ltrim( localUtil.ntoc( AV36TFFacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDIVCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFFacDivCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDIVABR", GXutil.rtrim( AV38TFFacDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDIVABR_SEL", GXutil.rtrim( AV39TFFacDivAbr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACREPCOD", GXutil.rtrim( AV40TFFacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACREPCOD_SEL", GXutil.rtrim( AV41TFFacRepCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACREPNOM", GXutil.rtrim( AV42TFFacRepNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACREPNOM_SEL", GXutil.rtrim( AV43TFFacRepNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRNOM", GXutil.rtrim( AV44TFEmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRNOM_SEL", GXutil.rtrim( AV45TFEmprNom_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACDIVTCOD_SELSJSON", AV34TFFacDivTCod_SelsJson);
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
         we2EE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2EE2( ) ;
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
      return formatLink("app.facturacion.tfacdivww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TFACDIVWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " DIVISAS/REPRESENTANTES", "") ;
   }

   public void wb2EE0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_2EE2( true) ;
      }
      else
      {
         wb_table1_27_2EE2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_2EE2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV53Pgmname), GXutil.rtrim( localUtil.format( AV53Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIVWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
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

   public void start2EE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " DIVISAS/REPRESENTANTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2EE0( ) ;
   }

   public void ws2EE2( )
   {
      start2EE2( ) ;
      evt2EE2( ) ;
   }

   public void evt2EE2( )
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
                           e112EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e162EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e172EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e182EE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e192EE2 ();
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
                           AV50GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           cmbFacDivTCod.setName( cmbFacDivTCod.getInternalname() );
                           cmbFacDivTCod.setValue( httpContext.cgiGet( cmbFacDivTCod.getInternalname()) );
                           A3096FacDivTCod = httpContext.cgiGet( cmbFacDivTCod.getInternalname()) ;
                           n3096FacDivTCod = false ;
                           A3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3115FacDivCod = false ;
                           A3116FacDivAbr = httpContext.cgiGet( edtFacDivAbr_Internalname) ;
                           n3116FacDivAbr = false ;
                           A3119FacRepCod = httpContext.cgiGet( edtFacRepCod_Internalname) ;
                           n3119FacRepCod = false ;
                           A3120FacRepNom = httpContext.cgiGet( edtFacRepNom_Internalname) ;
                           n3120FacRepNom = false ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202EE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212EE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222EE2 ();
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

   public void we2EE2( )
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

   public void pa2EE2( )
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
                                 String AV26TFEmprCod ,
                                 String AV27TFEmprCod_Sel ,
                                 int AV28TFFacCod ,
                                 int AV29TFFacCod_To ,
                                 int AV30TFCliCod ,
                                 int AV31TFCliCod_To ,
                                 String AV32TFCliNom ,
                                 String AV33TFCliNom_Sel ,
                                 GXSimpleCollection<String> AV35TFFacDivTCod_Sels ,
                                 byte AV36TFFacDivCod ,
                                 byte AV37TFFacDivCod_To ,
                                 String AV38TFFacDivAbr ,
                                 String AV39TFFacDivAbr_Sel ,
                                 String AV40TFFacRepCod ,
                                 String AV41TFFacRepCod_Sel ,
                                 String AV42TFFacRepNom ,
                                 String AV43TFFacRepNom_Sel ,
                                 String AV44TFEmprNom ,
                                 String AV45TFEmprNom_Sel ,
                                 String AV53Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212EE2 ();
      GRID_nCurrentRecord = 0 ;
      rf2EE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TFACDIVWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tfacdivww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")));
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
      rf2EE2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV53Pgmname = "Facturacion.TFACDIVWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A3096FacDivTCod ,
                                           AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                           AV60Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                           AV59Facturacion_tfacdivwwds_2_tfemprcod ,
                                           Integer.valueOf(AV61Facturacion_tfacdivwwds_4_tffaccod) ,
                                           Integer.valueOf(AV62Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                           Integer.valueOf(AV63Facturacion_tfacdivwwds_6_tfclicod) ,
                                           Integer.valueOf(AV64Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                           AV66Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                           AV65Facturacion_tfacdivwwds_8_tfclinom ,
                                           Integer.valueOf(AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                           Byte.valueOf(AV68Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                           Byte.valueOf(AV69Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                           AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                           AV70Facturacion_tfacdivwwds_13_tffacdivabr ,
                                           AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                           AV72Facturacion_tfacdivwwds_15_tffacrepcod ,
                                           AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                           AV74Facturacion_tfacdivwwds_17_tffacrepnom ,
                                           AV77Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                           AV76Facturacion_tfacdivwwds_19_tfemprnom ,
                                           A396EmprCod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A3115FacDivCod) ,
                                           A3116FacDivAbr ,
                                           A3119FacRepCod ,
                                           A3120FacRepNom ,
                                           A407EmprNom ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV58Facturacion_tfacdivwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV59Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV59Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
      lV65Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
      lV70Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV70Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
      lV72Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV72Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
      lV74Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV74Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
      lV76Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV76Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
      /* Using cursor H02EE2 */
      pr_default.execute(0, new Object[] {lV59Facturacion_tfacdivwwds_2_tfemprcod, AV60Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV61Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV62Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV63Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV64Facturacion_tfacdivwwds_7_tfclicod_to), lV65Facturacion_tfacdivwwds_8_tfclinom, AV66Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV68Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV69Facturacion_tfacdivwwds_12_tffacdivcod_to), lV70Facturacion_tfacdivwwds_13_tffacdivabr, AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV72Facturacion_tfacdivwwds_15_tffacrepcod, AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV74Facturacion_tfacdivwwds_17_tffacrepnom, AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV76Facturacion_tfacdivwwds_19_tfemprnom, AV77Facturacion_tfacdivwwds_20_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = H02EE2_A407EmprNom[0] ;
         n407EmprNom = H02EE2_n407EmprNom[0] ;
         A3120FacRepNom = H02EE2_A3120FacRepNom[0] ;
         n3120FacRepNom = H02EE2_n3120FacRepNom[0] ;
         A3119FacRepCod = H02EE2_A3119FacRepCod[0] ;
         n3119FacRepCod = H02EE2_n3119FacRepCod[0] ;
         A3116FacDivAbr = H02EE2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = H02EE2_n3116FacDivAbr[0] ;
         A3115FacDivCod = H02EE2_A3115FacDivCod[0] ;
         n3115FacDivCod = H02EE2_n3115FacDivCod[0] ;
         A3096FacDivTCod = H02EE2_A3096FacDivTCod[0] ;
         n3096FacDivTCod = H02EE2_n3096FacDivTCod[0] ;
         A279CliNom = H02EE2_A279CliNom[0] ;
         A252CliCod = H02EE2_A252CliCod[0] ;
         A430FacCod = H02EE2_A430FacCod[0] ;
         A396EmprCod = H02EE2_A396EmprCod[0] ;
         A3116FacDivAbr = H02EE2_A3116FacDivAbr[0] ;
         n3116FacDivAbr = H02EE2_n3116FacDivAbr[0] ;
         A407EmprNom = H02EE2_A407EmprNom[0] ;
         n407EmprNom = H02EE2_n407EmprNom[0] ;
         A3120FacRepNom = H02EE2_A3120FacRepNom[0] ;
         n3120FacRepNom = H02EE2_n3120FacRepNom[0] ;
         A279CliNom = H02EE2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV58Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "peseta", "") , GXutil.padr( "%" + GXutil.lower( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "euro", "") , GXutil.padr( "%" + GXutil.lower( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, "E") == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf2EE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e212EE2 ();
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
                                              A3096FacDivTCod ,
                                              AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                              AV60Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                              AV59Facturacion_tfacdivwwds_2_tfemprcod ,
                                              Integer.valueOf(AV61Facturacion_tfacdivwwds_4_tffaccod) ,
                                              Integer.valueOf(AV62Facturacion_tfacdivwwds_5_tffaccod_to) ,
                                              Integer.valueOf(AV63Facturacion_tfacdivwwds_6_tfclicod) ,
                                              Integer.valueOf(AV64Facturacion_tfacdivwwds_7_tfclicod_to) ,
                                              AV66Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                              AV65Facturacion_tfacdivwwds_8_tfclinom ,
                                              Integer.valueOf(AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels.size()) ,
                                              Byte.valueOf(AV68Facturacion_tfacdivwwds_11_tffacdivcod) ,
                                              Byte.valueOf(AV69Facturacion_tfacdivwwds_12_tffacdivcod_to) ,
                                              AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                              AV70Facturacion_tfacdivwwds_13_tffacdivabr ,
                                              AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                              AV72Facturacion_tfacdivwwds_15_tffacrepcod ,
                                              AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                              AV74Facturacion_tfacdivwwds_17_tffacrepnom ,
                                              AV77Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                              AV76Facturacion_tfacdivwwds_19_tfemprnom ,
                                              A396EmprCod ,
                                              Integer.valueOf(A430FacCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Byte.valueOf(A3115FacDivCod) ,
                                              A3116FacDivAbr ,
                                              A3119FacRepCod ,
                                              A3120FacRepNom ,
                                              A407EmprNom ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV58Facturacion_tfacdivwwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV59Facturacion_tfacdivwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV59Facturacion_tfacdivwwds_2_tfemprcod), 3, "%") ;
         lV65Facturacion_tfacdivwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV65Facturacion_tfacdivwwds_8_tfclinom), 30, "%") ;
         lV70Facturacion_tfacdivwwds_13_tffacdivabr = GXutil.padr( GXutil.rtrim( AV70Facturacion_tfacdivwwds_13_tffacdivabr), 6, "%") ;
         lV72Facturacion_tfacdivwwds_15_tffacrepcod = GXutil.padr( GXutil.rtrim( AV72Facturacion_tfacdivwwds_15_tffacrepcod), 6, "%") ;
         lV74Facturacion_tfacdivwwds_17_tffacrepnom = GXutil.padr( GXutil.rtrim( AV74Facturacion_tfacdivwwds_17_tffacrepnom), 34, "%") ;
         lV76Facturacion_tfacdivwwds_19_tfemprnom = GXutil.padr( GXutil.rtrim( AV76Facturacion_tfacdivwwds_19_tfemprnom), 30, "%") ;
         /* Using cursor H02EE3 */
         pr_default.execute(1, new Object[] {lV59Facturacion_tfacdivwwds_2_tfemprcod, AV60Facturacion_tfacdivwwds_3_tfemprcod_sel, Integer.valueOf(AV61Facturacion_tfacdivwwds_4_tffaccod), Integer.valueOf(AV62Facturacion_tfacdivwwds_5_tffaccod_to), Integer.valueOf(AV63Facturacion_tfacdivwwds_6_tfclicod), Integer.valueOf(AV64Facturacion_tfacdivwwds_7_tfclicod_to), lV65Facturacion_tfacdivwwds_8_tfclinom, AV66Facturacion_tfacdivwwds_9_tfclinom_sel, Byte.valueOf(AV68Facturacion_tfacdivwwds_11_tffacdivcod), Byte.valueOf(AV69Facturacion_tfacdivwwds_12_tffacdivcod_to), lV70Facturacion_tfacdivwwds_13_tffacdivabr, AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel, lV72Facturacion_tfacdivwwds_15_tffacrepcod, AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel, lV74Facturacion_tfacdivwwds_17_tffacrepnom, AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel, lV76Facturacion_tfacdivwwds_19_tfemprnom, AV77Facturacion_tfacdivwwds_20_tfemprnom_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A407EmprNom = H02EE3_A407EmprNom[0] ;
            n407EmprNom = H02EE3_n407EmprNom[0] ;
            A3120FacRepNom = H02EE3_A3120FacRepNom[0] ;
            n3120FacRepNom = H02EE3_n3120FacRepNom[0] ;
            A3119FacRepCod = H02EE3_A3119FacRepCod[0] ;
            n3119FacRepCod = H02EE3_n3119FacRepCod[0] ;
            A3116FacDivAbr = H02EE3_A3116FacDivAbr[0] ;
            n3116FacDivAbr = H02EE3_n3116FacDivAbr[0] ;
            A3115FacDivCod = H02EE3_A3115FacDivCod[0] ;
            n3115FacDivCod = H02EE3_n3115FacDivCod[0] ;
            A3096FacDivTCod = H02EE3_A3096FacDivTCod[0] ;
            n3096FacDivTCod = H02EE3_n3096FacDivTCod[0] ;
            A279CliNom = H02EE3_A279CliNom[0] ;
            A252CliCod = H02EE3_A252CliCod[0] ;
            A430FacCod = H02EE3_A430FacCod[0] ;
            A396EmprCod = H02EE3_A396EmprCod[0] ;
            A3116FacDivAbr = H02EE3_A3116FacDivAbr[0] ;
            n3116FacDivAbr = H02EE3_n3116FacDivAbr[0] ;
            A407EmprNom = H02EE3_A407EmprNom[0] ;
            n407EmprNom = H02EE3_n407EmprNom[0] ;
            A3120FacRepNom = H02EE3_A3120FacRepNom[0] ;
            n3120FacRepNom = H02EE3_n3120FacRepNom[0] ;
            A279CliNom = H02EE3_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV58Facturacion_tfacdivwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "peseta", "") , GXutil.padr( "%" + GXutil.lower( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "euro", "") , GXutil.padr( "%" + GXutil.lower( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3096FacDivTCod, "E") == 0 ) ) || ( GXutil.like( GXutil.str( A3115FacDivCod, 2, 0) , GXutil.padr( "%" + AV58Facturacion_tfacdivwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3116FacDivAbr) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3119FacRepCod) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3120FacRepNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV58Facturacion_tfacdivwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e222EE2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb2EE0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2EE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")));
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
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFFacCod, AV29TFFacCod_To, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV35TFFacDivTCod_Sels, AV36TFFacDivCod, AV37TFFacDivCod_To, AV38TFFacDivAbr, AV39TFFacDivAbr_Sel, AV40TFFacRepCod, AV41TFFacRepCod_Sel, AV42TFFacRepNom, AV43TFFacRepNom_Sel, AV44TFEmprNom, AV45TFEmprNom_Sel, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV53Pgmname = "Facturacion.TFACDIVWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2EE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202EE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TFACDIVWW");
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\tfacdivww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e202EE2 ();
      if (returnInSub) return;
   }

   public void e202EE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfacdivww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = AV55Emprcod ;
      GXv_char3[0] = AV56Emprnom ;
      GXv_char4[0] = AV57Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfacdivww_impl.this.AV55Emprcod = GXv_char2[0] ;
      tfacdivww_impl.this.AV56Emprnom = GXv_char3[0] ;
      tfacdivww_impl.this.AV57Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " DIVISAS/REPRESENTANTES", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e212EE2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("Facturacion.TFACDIVWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Facturacion.TFACDIVWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFacCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbFacDivTCod.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacDivTCod.getInternalname(), "Visible", GXutil.ltrimstr( cmbFacDivTCod.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtFacDivCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFacDivAbr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivAbr_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFacRepCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRepCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtFacRepNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRepNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEmprNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      AV58Facturacion_tfacdivwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Facturacion_tfacdivwwds_4_tffaccod = AV28TFFacCod ;
      AV62Facturacion_tfacdivwwds_5_tffaccod_to = AV29TFFacCod_To ;
      AV63Facturacion_tfacdivwwds_6_tfclicod = AV30TFCliCod ;
      AV64Facturacion_tfacdivwwds_7_tfclicod_to = AV31TFCliCod_To ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = AV32TFCliNom ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = AV33TFCliNom_Sel ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = AV35TFFacDivTCod_Sels ;
      AV68Facturacion_tfacdivwwds_11_tffacdivcod = AV36TFFacDivCod ;
      AV69Facturacion_tfacdivwwds_12_tffacdivcod_to = AV37TFFacDivCod_To ;
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = AV38TFFacDivAbr ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = AV39TFFacDivAbr_Sel ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = AV40TFFacRepCod ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = AV41TFFacRepCod_Sel ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = AV42TFFacRepNom ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = AV43TFFacRepNom_Sel ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = AV44TFEmprNom ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = AV45TFEmprNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122EE2( )
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

   public void e132EE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142EE2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV26TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
            AV27TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCod") == 0 )
         {
            AV28TFFacCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFFacCod), 8, 0));
            AV29TFFacCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFFacCod_To), 8, 0));
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
            AV32TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
            AV33TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacDivTCod") == 0 )
         {
            AV34TFFacDivTCod_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFacDivTCod_SelsJson", AV34TFFacDivTCod_SelsJson);
            AV35TFFacDivTCod_Sels.fromJSonString(AV34TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacDivCod") == 0 )
         {
            AV36TFFacDivCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFFacDivCod), 2, 0));
            AV37TFFacDivCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFFacDivCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFFacDivCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacDivAbr") == 0 )
         {
            AV38TFFacDivAbr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFacDivAbr", AV38TFFacDivAbr);
            AV39TFFacDivAbr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFacDivAbr_Sel", AV39TFFacDivAbr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacRepCod") == 0 )
         {
            AV40TFFacRepCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFacRepCod", AV40TFFacRepCod);
            AV41TFFacRepCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFacRepCod_Sel", AV41TFFacRepCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacRepNom") == 0 )
         {
            AV42TFFacRepNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFacRepNom", AV42TFFacRepNom);
            AV43TFFacRepNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFacRepNom_Sel", AV43TFFacRepNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprNom") == 0 )
         {
            AV44TFEmprNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprNom", AV44TFEmprNom);
            AV45TFEmprNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFEmprNom_Sel", AV45TFEmprNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35TFFacDivTCod_Sels", AV35TFFacDivTCod_Sels);
   }

   private void e222EE2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtEmprNom_Link = formatLink("app.tempparview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
   }

   public void e152EE2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.TFACDIVWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e112EE2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.TFACDIVWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV53Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.TFACDIVWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Facturacion.TFACDIVWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tfacdivww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV53Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35TFFacDivTCod_Sels", AV35TFFacDivTCod_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e162EE2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.facturacion.tfacdiv", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e172EE2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.facturacion.tfacdivwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tfacdivww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tfacdivww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35TFFacDivTCod_Sels", AV35TFFacDivTCod_Sels);
   }

   public void e182EE2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.facturacion.tfacdivwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35TFFacDivTCod_Sels", AV35TFFacDivTCod_Sels);
   }

   public void e192EE2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.facturacion.tfacdivwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35TFFacDivTCod_Sels", AV35TFFacDivTCod_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Empresa", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacCod", "", "Numero Factura", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacDivTCod", "", "Divisa Traspaso Contable", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacDivCod", "", "Divisa", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacDivAbr", "", "Abreviatura", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacRepCod", "", "Representante", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacRepNom", "", "Nombre Representante", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.TFACDIVWWColumnsSelector", GXv_char4) ;
      tfacdivww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Facturacion.TFACDIVWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
      AV27TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
      AV28TFFacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFFacCod), 8, 0));
      AV29TFFacCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFFacCod_To), 8, 0));
      AV30TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
      AV31TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
      AV32TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
      AV33TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
      AV35TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36TFFacDivCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFFacDivCod), 2, 0));
      AV37TFFacDivCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFFacDivCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFFacDivCod_To), 2, 0));
      AV38TFFacDivAbr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFFacDivAbr", AV38TFFacDivAbr);
      AV39TFFacDivAbr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFFacDivAbr_Sel", AV39TFFacDivAbr_Sel);
      AV40TFFacRepCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFFacRepCod", AV40TFFacRepCod);
      AV41TFFacRepCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFFacRepCod_Sel", AV41TFFacRepCod_Sel);
      AV42TFFacRepNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFFacRepNom", AV42TFFacRepNom);
      AV43TFFacRepNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFFacRepNom_Sel", AV43TFFacRepNom_Sel);
      AV44TFEmprNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprNom", AV44TFEmprNom);
      AV45TFEmprNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFEmprNom_Sel", AV45TFEmprNom_Sel);
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
      callWebObject(formatLink("app.facturacion.tfacdiv", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.facturacion.tfacdiv", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV53Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV53Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV53Pgmname+"GridState"), null, null);
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
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV26TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV27TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV28TFFacCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFFacCod), 8, 0));
            AV29TFFacCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFFacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFFacCod_To), 8, 0));
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
            AV32TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV33TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVTCOD_SEL") == 0 )
         {
            AV34TFFacDivTCod_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFacDivTCod_SelsJson", AV34TFFacDivTCod_SelsJson);
            AV35TFFacDivTCod_Sels.fromJSonString(AV34TFFacDivTCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVCOD") == 0 )
         {
            AV36TFFacDivCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFFacDivCod), 2, 0));
            AV37TFFacDivCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFFacDivCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFFacDivCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR") == 0 )
         {
            AV38TFFacDivAbr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFFacDivAbr", AV38TFFacDivAbr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDIVABR_SEL") == 0 )
         {
            AV39TFFacDivAbr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFFacDivAbr_Sel", AV39TFFacDivAbr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD") == 0 )
         {
            AV40TFFacRepCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFFacRepCod", AV40TFFacRepCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPCOD_SEL") == 0 )
         {
            AV41TFFacRepCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFFacRepCod_Sel", AV41TFFacRepCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM") == 0 )
         {
            AV42TFFacRepNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFacRepNom", AV42TFFacRepNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACREPNOM_SEL") == 0 )
         {
            AV43TFFacRepNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFacRepNom_Sel", AV43TFFacRepNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV44TFEmprNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEmprNom", AV44TFEmprNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV45TFEmprNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFEmprNom_Sel", AV45TFEmprNom_Sel);
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, GXv_char4) ;
      tfacdivww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, GXv_char3) ;
      tfacdivww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV35TFFacDivTCod_Sels.size()==0), AV34TFFacDivTCod_SelsJson, GXv_char2) ;
      tfacdivww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFFacDivAbr_Sel)==0), AV39TFFacDivAbr_Sel, GXv_char15) ;
      tfacdivww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFFacRepCod_Sel)==0), AV41TFFacRepCod_Sel, GXv_char17) ;
      tfacdivww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFFacRepNom_Sel)==0), AV43TFFacRepNom_Sel, GXv_char19) ;
      tfacdivww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFEmprNom_Sel)==0), AV45TFEmprNom_Sel, GXv_char21) ;
      tfacdivww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFEmprCod)==0), AV26TFEmprCod, GXv_char21) ;
      tfacdivww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliNom)==0), AV32TFCliNom, GXv_char19) ;
      tfacdivww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFFacDivAbr)==0), AV38TFFacDivAbr, GXv_char17) ;
      tfacdivww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFFacRepCod)==0), AV40TFFacRepCod, GXv_char15) ;
      tfacdivww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFFacRepNom)==0), AV42TFFacRepNom, GXv_char4) ;
      tfacdivww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFEmprNom)==0), AV44TFEmprNom, GXv_char3) ;
      tfacdivww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char20+"|"+((0==AV28TFFacCod) ? "" : GXutil.str( AV28TFFacCod, 8, 0))+"|"+((0==AV30TFCliCod) ? "" : GXutil.str( AV30TFCliCod, 6, 0))+"|"+GXt_char18+"||"+((0==AV36TFFacDivCod) ? "" : GXutil.str( AV36TFFacDivCod, 2, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFFacCod_To) ? "" : GXutil.str( AV29TFFacCod_To, 8, 0))+"|"+((0==AV31TFCliCod_To) ? "" : GXutil.str( AV31TFCliCod_To, 6, 0))+"|||"+((0==AV37TFFacDivCod_To) ? "" : GXutil.str( AV37TFFacDivCod_To, 2, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV53Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFEMPRCOD", "", !(GXutil.strcmp("", AV26TFEmprCod)==0), (short)(0), AV26TFEmprCod, "", !(GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACCOD", "", !((0==AV28TFFacCod)&&(0==AV29TFFacCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFFacCod, 8, 0)), GXutil.trim( GXutil.str( AV29TFFacCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV30TFCliCod)&&(0==AV31TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV31TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV32TFCliNom)==0), (short)(0), AV32TFCliNom, "", !(GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACDIVTCOD_SEL", "", !(AV35TFFacDivTCod_Sels.size()==0), (short)(0), AV35TFFacDivTCod_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACDIVCOD", "", !((0==AV36TFFacDivCod)&&(0==AV37TFFacDivCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFFacDivCod, 2, 0)), GXutil.trim( GXutil.str( AV37TFFacDivCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACDIVABR", "", !(GXutil.strcmp("", AV38TFFacDivAbr)==0), (short)(0), AV38TFFacDivAbr, "", !(GXutil.strcmp("", AV39TFFacDivAbr_Sel)==0), AV39TFFacDivAbr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACREPCOD", "", !(GXutil.strcmp("", AV40TFFacRepCod)==0), (short)(0), AV40TFFacRepCod, "", !(GXutil.strcmp("", AV41TFFacRepCod_Sel)==0), AV41TFFacRepCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFACREPNOM", "", !(GXutil.strcmp("", AV42TFFacRepNom)==0), (short)(0), AV42TFFacRepNom, "", !(GXutil.strcmp("", AV43TFFacRepNom_Sel)==0), AV43TFFacRepNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFEMPRNOM", "", !(GXutil.strcmp("", AV44TFEmprNom)==0), (short)(0), AV44TFEmprNom, "", !(GXutil.strcmp("", AV45TFEmprNom_Sel)==0), AV45TFEmprNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV53Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV53Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.TFACDIV" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_2EE2( boolean wbgen )
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
         wb_table2_32_2EE2( true) ;
      }
      else
      {
         wb_table2_32_2EE2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_2EE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_2EE2e( true) ;
      }
      else
      {
         wb_table1_27_2EE2e( false) ;
      }
   }

   public void wb_table2_32_2EE2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Facturacion\\TFACDIVWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_2EE2e( true) ;
      }
      else
      {
         wb_table2_32_2EE2e( false) ;
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
      pa2EE2( ) ;
      ws2EE2( ) ;
      we2EE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269210535649", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tfacdivww.js", "?20269210535649", false, true);
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
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_45_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      cmbFacDivTCod.setInternalname( "FACDIVTCOD_"+sGXsfl_45_idx );
      edtFacDivCod_Internalname = "FACDIVCOD_"+sGXsfl_45_idx ;
      edtFacDivAbr_Internalname = "FACDIVABR_"+sGXsfl_45_idx ;
      edtFacRepCod_Internalname = "FACREPCOD_"+sGXsfl_45_idx ;
      edtFacRepNom_Internalname = "FACREPNOM_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      cmbFacDivTCod.setInternalname( "FACDIVTCOD_"+sGXsfl_45_fel_idx );
      edtFacDivCod_Internalname = "FACDIVCOD_"+sGXsfl_45_fel_idx ;
      edtFacDivAbr_Internalname = "FACDIVABR_"+sGXsfl_45_fel_idx ;
      edtFacRepCod_Internalname = "FACREPCOD_"+sGXsfl_45_fel_idx ;
      edtFacRepNom_Internalname = "FACREPNOM_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb2EE0( ) ;
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
               AV50GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV50GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV50GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e232ee2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbFacDivTCod.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbFacDivTCod.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FACDIVTCOD_" + sGXsfl_45_idx ;
            cmbFacDivTCod.setName( GXCCtl );
            cmbFacDivTCod.setWebtags( "" );
            cmbFacDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
            cmbFacDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
            if ( cmbFacDivTCod.getItemCount() > 0 )
            {
               A3096FacDivTCod = cmbFacDivTCod.getValidValue(A3096FacDivTCod) ;
               n3096FacDivTCod = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFacDivTCod,cmbFacDivTCod.getInternalname(),GXutil.rtrim( A3096FacDivTCod),Integer.valueOf(1),cmbFacDivTCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbFacDivTCod.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFacDivTCod.setValue( GXutil.rtrim( A3096FacDivTCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacDivTCod.getInternalname(), "Values", cmbFacDivTCod.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacDivCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacDivCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3115FacDivCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacDivCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacDivCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFacDivAbr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacDivAbr_Internalname,GXutil.rtrim( A3116FacDivAbr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacDivAbr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacDivAbr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFacRepCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacRepCod_Internalname,GXutil.rtrim( A3119FacRepCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacRepCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFacRepNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacRepNom_Internalname,GXutil.rtrim( A3120FacRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacRepNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'",edtEmprNom_Link,"","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEmprNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2EE2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbFacDivTCod.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Traspaso Contable", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacDivCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacDivAbr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Abreviatura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacRepCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Representante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacRepNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Representante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3096FacDivTCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbFacDivTCod.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacDivCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3116FacDivAbr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacDivAbr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3119FacRepCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacRepCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3120FacRepNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacRepNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtEmprNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtFacCod_Internalname = "FACCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      cmbFacDivTCod.setInternalname( "FACDIVTCOD" );
      edtFacDivCod_Internalname = "FACDIVCOD" ;
      edtFacDivAbr_Internalname = "FACDIVABR" ;
      edtFacRepCod_Internalname = "FACREPCOD" ;
      edtFacRepNom_Internalname = "FACREPNOM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Link = "" ;
      edtFacRepNom_Jsonclick = "" ;
      edtFacRepCod_Jsonclick = "" ;
      edtFacDivAbr_Jsonclick = "" ;
      edtFacDivCod_Jsonclick = "" ;
      cmbFacDivTCod.setJsonclick( "" );
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtFacCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtEmprNom_Visible = -1 ;
      edtFacRepNom_Visible = -1 ;
      edtFacRepCod_Visible = -1 ;
      edtFacDivAbr_Visible = -1 ;
      edtFacDivCod_Visible = -1 ;
      cmbFacDivTCod.setVisible( -1 );
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtFacCod_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "Facturacion.TFACDIVWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||P:PESETA,E:EURO|||||" ;
      Ddo_grid_Allowmultipleselection = "||||T|||||" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|FixedValues||Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|||T|T||T|T|T|T" ;
      Ddo_grid_Filterisrange = "|T|T|||T||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character||Numeric|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T||T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|1|6|7|8|9|10" ;
      Ddo_grid_Columnids = "1:EmprCod|2:FacCod|3:CliCod|4:CliNom|5:FacDivTCod|6:FacDivCod|7:FacDivAbr|8:FacRepCod|9:FacRepNom|10:EmprNom" ;
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
      Form.setCaption( httpContext.getMessage( " DIVISAS/REPRESENTANTES", "") );
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
         AV50GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV50GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
      }
      GXCCtl = "FACDIVTCOD_" + sGXsfl_45_idx ;
      cmbFacDivTCod.setName( GXCCtl );
      cmbFacDivTCod.setWebtags( "" );
      cmbFacDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      cmbFacDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      if ( cmbFacDivTCod.getItemCount() > 0 )
      {
         A3096FacDivTCod = cmbFacDivTCod.getValidValue(A3096FacDivTCod) ;
         n3096FacDivTCod = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'cmbFacDivTCod'},{av:'edtFacDivCod_Visible',ctrl:'FACDIVCOD',prop:'Visible'},{av:'edtFacDivAbr_Visible',ctrl:'FACDIVABR',prop:'Visible'},{av:'edtFacRepCod_Visible',ctrl:'FACREPCOD',prop:'Visible'},{av:'edtFacRepNom_Visible',ctrl:'FACREPNOM',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122EE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132EE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142EE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222EE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtEmprNom_Link',ctrl:'EMPRNOM',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152EE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'cmbFacDivTCod'},{av:'edtFacDivCod_Visible',ctrl:'FACDIVCOD',prop:'Visible'},{av:'edtFacDivAbr_Visible',ctrl:'FACDIVABR',prop:'Visible'},{av:'edtFacRepCod_Visible',ctrl:'FACREPCOD',prop:'Visible'},{av:'edtFacRepNom_Visible',ctrl:'FACREPNOM',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112EE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtFacCod_Visible',ctrl:'FACCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'cmbFacDivTCod'},{av:'edtFacDivCod_Visible',ctrl:'FACDIVCOD',prop:'Visible'},{av:'edtFacDivAbr_Visible',ctrl:'FACDIVABR',prop:'Visible'},{av:'edtFacRepCod_Visible',ctrl:'FACREPCOD',prop:'Visible'},{av:'edtFacRepNom_Visible',ctrl:'FACREPNOM',prop:'Visible'},{av:'edtEmprNom_Visible',ctrl:'EMPRNOM',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232EE2',iparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e162EE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e172EE2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e182EE2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192EE2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFFacCod',fld:'vTFFACCOD',pic:'ZZZZZZZ9'},{av:'AV29TFFacCod_To',fld:'vTFFACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFFacDivTCod_Sels',fld:'vTFFACDIVTCOD_SELS',pic:''},{av:'AV36TFFacDivCod',fld:'vTFFACDIVCOD',pic:'Z9'},{av:'AV37TFFacDivCod_To',fld:'vTFFACDIVCOD_TO',pic:'Z9'},{av:'AV38TFFacDivAbr',fld:'vTFFACDIVABR',pic:''},{av:'AV39TFFacDivAbr_Sel',fld:'vTFFACDIVABR_SEL',pic:''},{av:'AV40TFFacRepCod',fld:'vTFFACREPCOD',pic:''},{av:'AV41TFFacRepCod_Sel',fld:'vTFFACREPCOD_SEL',pic:''},{av:'AV42TFFacRepNom',fld:'vTFFACREPNOM',pic:''},{av:'AV43TFFacRepNom_Sel',fld:'vTFFACREPNOM_SEL',pic:''},{av:'AV44TFEmprNom',fld:'vTFEMPRNOM',pic:''},{av:'AV45TFEmprNom_Sel',fld:'vTFEMPRNOM_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV34TFFacDivTCod_SelsJson',fld:'vTFFACDIVTCOD_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_FACDIVTCOD","{handler:'valid_Facdivtcod',iparms:[]");
      setEventMetadata("VALID_FACDIVTCOD",",oparms:[]}");
      setEventMetadata("VALID_FACDIVCOD","{handler:'valid_Facdivcod',iparms:[]");
      setEventMetadata("VALID_FACDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_FACDIVABR","{handler:'valid_Facdivabr',iparms:[]");
      setEventMetadata("VALID_FACDIVABR",",oparms:[]}");
      setEventMetadata("VALID_FACREPCOD","{handler:'valid_Facrepcod',iparms:[]");
      setEventMetadata("VALID_FACREPCOD",",oparms:[]}");
      setEventMetadata("VALID_FACREPNOM","{handler:'valid_Facrepnom',iparms:[]");
      setEventMetadata("VALID_FACREPNOM",",oparms:[]}");
      setEventMetadata("VALID_EMPRNOM","{handler:'valid_Emprnom',iparms:[]");
      setEventMetadata("VALID_EMPRNOM",",oparms:[]}");
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
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFEmprCod = "" ;
      AV27TFEmprCod_Sel = "" ;
      AV32TFCliNom = "" ;
      AV33TFCliNom_Sel = "" ;
      AV35TFFacDivTCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38TFFacDivAbr = "" ;
      AV39TFFacDivAbr_Sel = "" ;
      AV40TFFacRepCod = "" ;
      AV41TFFacRepCod_Sel = "" ;
      AV42TFFacRepNom = "" ;
      AV43TFFacRepNom_Sel = "" ;
      AV44TFEmprNom = "" ;
      AV45TFEmprNom_Sel = "" ;
      AV53Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34TFFacDivTCod_SelsJson = "" ;
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
      A279CliNom = "" ;
      A3096FacDivTCod = "" ;
      A3116FacDivAbr = "" ;
      A3119FacRepCod = "" ;
      A3120FacRepNom = "" ;
      A407EmprNom = "" ;
      AV58Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      AV59Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      AV60Facturacion_tfacdivwwds_3_tfemprcod_sel = "" ;
      AV65Facturacion_tfacdivwwds_8_tfclinom = "" ;
      AV66Facturacion_tfacdivwwds_9_tfclinom_sel = "" ;
      AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel = "" ;
      AV72Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel = "" ;
      AV74Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel = "" ;
      AV76Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      AV77Facturacion_tfacdivwwds_20_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV58Facturacion_tfacdivwwds_1_filterfulltext = "" ;
      lV59Facturacion_tfacdivwwds_2_tfemprcod = "" ;
      lV65Facturacion_tfacdivwwds_8_tfclinom = "" ;
      lV70Facturacion_tfacdivwwds_13_tffacdivabr = "" ;
      lV72Facturacion_tfacdivwwds_15_tffacrepcod = "" ;
      lV74Facturacion_tfacdivwwds_17_tffacrepnom = "" ;
      lV76Facturacion_tfacdivwwds_19_tfemprnom = "" ;
      H02EE2_A407EmprNom = new String[] {""} ;
      H02EE2_n407EmprNom = new boolean[] {false} ;
      H02EE2_A3120FacRepNom = new String[] {""} ;
      H02EE2_n3120FacRepNom = new boolean[] {false} ;
      H02EE2_A3119FacRepCod = new String[] {""} ;
      H02EE2_n3119FacRepCod = new boolean[] {false} ;
      H02EE2_A3116FacDivAbr = new String[] {""} ;
      H02EE2_n3116FacDivAbr = new boolean[] {false} ;
      H02EE2_A3115FacDivCod = new byte[1] ;
      H02EE2_n3115FacDivCod = new boolean[] {false} ;
      H02EE2_A3096FacDivTCod = new String[] {""} ;
      H02EE2_n3096FacDivTCod = new boolean[] {false} ;
      H02EE2_A279CliNom = new String[] {""} ;
      H02EE2_A252CliCod = new int[1] ;
      H02EE2_A430FacCod = new int[1] ;
      H02EE2_A396EmprCod = new String[] {""} ;
      H02EE3_A407EmprNom = new String[] {""} ;
      H02EE3_n407EmprNom = new boolean[] {false} ;
      H02EE3_A3120FacRepNom = new String[] {""} ;
      H02EE3_n3120FacRepNom = new boolean[] {false} ;
      H02EE3_A3119FacRepCod = new String[] {""} ;
      H02EE3_n3119FacRepCod = new boolean[] {false} ;
      H02EE3_A3116FacDivAbr = new String[] {""} ;
      H02EE3_n3116FacDivAbr = new boolean[] {false} ;
      H02EE3_A3115FacDivCod = new byte[1] ;
      H02EE3_n3115FacDivCod = new boolean[] {false} ;
      H02EE3_A3096FacDivTCod = new String[] {""} ;
      H02EE3_n3096FacDivTCod = new boolean[] {false} ;
      H02EE3_A279CliNom = new String[] {""} ;
      H02EE3_A252CliCod = new int[1] ;
      H02EE3_A430FacCod = new int[1] ;
      H02EE3_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV54Station = "" ;
      AV55Emprcod = "" ;
      AV56Emprnom = "" ;
      AV57Usurcod = "" ;
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
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdivww__default(),
         new Object[] {
             new Object[] {
            H02EE2_A407EmprNom, H02EE2_n407EmprNom, H02EE2_A3120FacRepNom, H02EE2_n3120FacRepNom, H02EE2_A3119FacRepCod, H02EE2_n3119FacRepCod, H02EE2_A3116FacDivAbr, H02EE2_n3116FacDivAbr, H02EE2_A3115FacDivCod, H02EE2_n3115FacDivCod,
            H02EE2_A3096FacDivTCod, H02EE2_n3096FacDivTCod, H02EE2_A279CliNom, H02EE2_A252CliCod, H02EE2_A430FacCod, H02EE2_A396EmprCod
            }
            , new Object[] {
            H02EE3_A407EmprNom, H02EE3_n407EmprNom, H02EE3_A3120FacRepNom, H02EE3_n3120FacRepNom, H02EE3_A3119FacRepCod, H02EE3_n3119FacRepCod, H02EE3_A3116FacDivAbr, H02EE3_n3116FacDivAbr, H02EE3_A3115FacDivCod, H02EE3_n3115FacDivCod,
            H02EE3_A3096FacDivTCod, H02EE3_n3096FacDivTCod, H02EE3_A279CliNom, H02EE3_A252CliCod, H02EE3_A430FacCod, H02EE3_A396EmprCod
            }
         }
      );
      AV53Pgmname = "Facturacion.TFACDIVWW" ;
      /* GeneXus formulas. */
      AV53Pgmname = "Facturacion.TFACDIVWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV36TFFacDivCod ;
   private byte AV37TFFacDivCod_To ;
   private byte gxajaxcallmode ;
   private byte A3115FacDivCod ;
   private byte nDonePA ;
   private byte AV68Facturacion_tfacdivwwds_11_tffacdivcod ;
   private byte AV69Facturacion_tfacdivwwds_12_tffacdivcod_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
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
   private short AV50GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV28TFFacCod ;
   private int AV29TFFacCod_To ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int AV61Facturacion_tfacdivwwds_4_tffaccod ;
   private int AV62Facturacion_tfacdivwwds_5_tffaccod_to ;
   private int AV63Facturacion_tfacdivwwds_6_tfclicod ;
   private int AV64Facturacion_tfacdivwwds_7_tfclicod_to ;
   private int AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ;
   private int edtEmprCod_Visible ;
   private int edtFacCod_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtFacDivCod_Visible ;
   private int edtFacDivAbr_Visible ;
   private int edtFacRepCod_Visible ;
   private int edtFacRepNom_Visible ;
   private int edtEmprNom_Visible ;
   private int AV47PageToGo ;
   private int AV78GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
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
   private String AV26TFEmprCod ;
   private String AV27TFEmprCod_Sel ;
   private String AV32TFCliNom ;
   private String AV33TFCliNom_Sel ;
   private String AV38TFFacDivAbr ;
   private String AV39TFFacDivAbr_Sel ;
   private String AV40TFFacRepCod ;
   private String AV41TFFacRepCod_Sel ;
   private String AV42TFFacRepNom ;
   private String AV43TFFacRepNom_Sel ;
   private String AV44TFEmprNom ;
   private String AV45TFEmprNom_Sel ;
   private String AV53Pgmname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtFacCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A3096FacDivTCod ;
   private String edtFacDivCod_Internalname ;
   private String A3116FacDivAbr ;
   private String edtFacDivAbr_Internalname ;
   private String A3119FacRepCod ;
   private String edtFacRepCod_Internalname ;
   private String A3120FacRepNom ;
   private String edtFacRepNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV59Facturacion_tfacdivwwds_2_tfemprcod ;
   private String AV60Facturacion_tfacdivwwds_3_tfemprcod_sel ;
   private String AV65Facturacion_tfacdivwwds_8_tfclinom ;
   private String AV66Facturacion_tfacdivwwds_9_tfclinom_sel ;
   private String AV70Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel ;
   private String AV72Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel ;
   private String AV74Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel ;
   private String AV76Facturacion_tfacdivwwds_19_tfemprnom ;
   private String AV77Facturacion_tfacdivwwds_20_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV59Facturacion_tfacdivwwds_2_tfemprcod ;
   private String lV65Facturacion_tfacdivwwds_8_tfclinom ;
   private String lV70Facturacion_tfacdivwwds_13_tffacdivabr ;
   private String lV72Facturacion_tfacdivwwds_15_tffacrepcod ;
   private String lV74Facturacion_tfacdivwwds_17_tffacrepnom ;
   private String lV76Facturacion_tfacdivwwds_19_tfemprnom ;
   private String hsh ;
   private String AV54Station ;
   private String AV55Emprcod ;
   private String AV56Emprnom ;
   private String AV57Usurcod ;
   private String edtEmprNom_Link ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtFacCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtFacDivCod_Jsonclick ;
   private String edtFacDivAbr_Jsonclick ;
   private String edtFacRepCod_Jsonclick ;
   private String edtFacRepNom_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n3096FacDivTCod ;
   private boolean n3115FacDivCod ;
   private boolean n3116FacDivAbr ;
   private boolean n3119FacRepCod ;
   private boolean n3120FacRepNom ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34TFFacDivTCod_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV58Facturacion_tfacdivwwds_1_filterfulltext ;
   private String lV58Facturacion_tfacdivwwds_1_filterfulltext ;
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
   private HTMLChoice cmbFacDivTCod ;
   private IDataStoreProvider pr_default ;
   private String[] H02EE2_A407EmprNom ;
   private boolean[] H02EE2_n407EmprNom ;
   private String[] H02EE2_A3120FacRepNom ;
   private boolean[] H02EE2_n3120FacRepNom ;
   private String[] H02EE2_A3119FacRepCod ;
   private boolean[] H02EE2_n3119FacRepCod ;
   private String[] H02EE2_A3116FacDivAbr ;
   private boolean[] H02EE2_n3116FacDivAbr ;
   private byte[] H02EE2_A3115FacDivCod ;
   private boolean[] H02EE2_n3115FacDivCod ;
   private String[] H02EE2_A3096FacDivTCod ;
   private boolean[] H02EE2_n3096FacDivTCod ;
   private String[] H02EE2_A279CliNom ;
   private int[] H02EE2_A252CliCod ;
   private int[] H02EE2_A430FacCod ;
   private String[] H02EE2_A396EmprCod ;
   private String[] H02EE3_A407EmprNom ;
   private boolean[] H02EE3_n407EmprNom ;
   private String[] H02EE3_A3120FacRepNom ;
   private boolean[] H02EE3_n3120FacRepNom ;
   private String[] H02EE3_A3119FacRepCod ;
   private boolean[] H02EE3_n3119FacRepCod ;
   private String[] H02EE3_A3116FacDivAbr ;
   private boolean[] H02EE3_n3116FacDivAbr ;
   private byte[] H02EE3_A3115FacDivCod ;
   private boolean[] H02EE3_n3115FacDivCod ;
   private String[] H02EE3_A3096FacDivTCod ;
   private boolean[] H02EE3_n3096FacDivTCod ;
   private String[] H02EE3_A279CliNom ;
   private int[] H02EE3_A252CliCod ;
   private int[] H02EE3_A430FacCod ;
   private String[] H02EE3_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV35TFFacDivTCod_Sels ;
   private GXSimpleCollection<String> AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tfacdivww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02EE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV60Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV59Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV61Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV62Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV63Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV64Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV66Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV65Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV68Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV69Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV70Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV72Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV74Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV77Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV76Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV58Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[18];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T1.FacDivTCod, T5.CliNom, T1.CliCod, T1.FacCod," ;
      scmdbuf += " T1.EmprCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES T4" ;
      scmdbuf += " ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (0==AV62Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV68Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivAbr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivAbr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacRepCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacRepCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RepNom" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RepNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.EmprNom" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.EmprNom DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H02EE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A3096FacDivTCod ,
                                          GXSimpleCollection<String> AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels ,
                                          String AV60Facturacion_tfacdivwwds_3_tfemprcod_sel ,
                                          String AV59Facturacion_tfacdivwwds_2_tfemprcod ,
                                          int AV61Facturacion_tfacdivwwds_4_tffaccod ,
                                          int AV62Facturacion_tfacdivwwds_5_tffaccod_to ,
                                          int AV63Facturacion_tfacdivwwds_6_tfclicod ,
                                          int AV64Facturacion_tfacdivwwds_7_tfclicod_to ,
                                          String AV66Facturacion_tfacdivwwds_9_tfclinom_sel ,
                                          String AV65Facturacion_tfacdivwwds_8_tfclinom ,
                                          int AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size ,
                                          byte AV68Facturacion_tfacdivwwds_11_tffacdivcod ,
                                          byte AV69Facturacion_tfacdivwwds_12_tffacdivcod_to ,
                                          String AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel ,
                                          String AV70Facturacion_tfacdivwwds_13_tffacdivabr ,
                                          String AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel ,
                                          String AV72Facturacion_tfacdivwwds_15_tffacrepcod ,
                                          String AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel ,
                                          String AV74Facturacion_tfacdivwwds_17_tffacrepnom ,
                                          String AV77Facturacion_tfacdivwwds_20_tfemprnom_sel ,
                                          String AV76Facturacion_tfacdivwwds_19_tfemprnom ,
                                          String A396EmprCod ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A3115FacDivCod ,
                                          String A3116FacDivAbr ,
                                          String A3119FacRepCod ,
                                          String A3120FacRepNom ,
                                          String A407EmprNom ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV58Facturacion_tfacdivwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[18];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T3.EmprNom, T4.RepNom AS FacRepNom, T1.FacRepCod AS FacRepCod, T2.DivAbr AS FacDivAbr, T1.FacDivCod AS FacDivCod, T1.FacDivTCod, T5.CliNom, T1.CliCod, T1.FacCod," ;
      scmdbuf += " T1.EmprCod FROM ((((TXPCFAVEN T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.FacDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPREPRES T4" ;
      scmdbuf += " ON T4.EmprCod = T1.EmprCod AND T4.RepCod = T1.FacRepCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_tfacdivwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_tfacdivwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! (0==AV61Facturacion_tfacdivwwds_4_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV62Facturacion_tfacdivwwds_5_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (0==AV63Facturacion_tfacdivwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tfacdivwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tfacdivwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tfacdivwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV67Facturacion_tfacdivwwds_10_tffacdivtcod_sels, "T1.FacDivTCod IN (", ")")+")");
      }
      if ( ! (0==AV68Facturacion_tfacdivwwds_11_tffacdivcod) )
      {
         addWhere(sWhereString, "(T1.FacDivCod >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_tfacdivwwds_12_tffacdivcod_to) )
      {
         addWhere(sWhereString, "(T1.FacDivCod <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV70Facturacion_tfacdivwwds_13_tffacdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Facturacion_tfacdivwwds_14_tffacdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivAbr = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Facturacion_tfacdivwwds_15_tffacrepcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacRepCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Facturacion_tfacdivwwds_16_tffacrepcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacRepCod = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Facturacion_tfacdivwwds_17_tffacrepnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.RepNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Facturacion_tfacdivwwds_18_tffacrepnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.RepNom = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Facturacion_tfacdivwwds_19_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Facturacion_tfacdivwwds_20_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.EmprNom = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivTCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacDivCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacDivCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.DivAbr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.DivAbr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacRepCod" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacRepCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RepNom" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RepNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.EmprNom" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.EmprNom DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H02EE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
            case 1 :
                  return conditional_H02EE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02EE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02EE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 30);
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 30);
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 34);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 34);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               return;
      }
   }

}

