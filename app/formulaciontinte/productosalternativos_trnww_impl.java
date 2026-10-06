package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosalternativos_trnww_impl extends GXDataArea
{
   public productosalternativos_trnww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public productosalternativos_trnww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_trnww_impl.class ));
   }

   public productosalternativos_trnww_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
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
      AV26TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV27TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV28TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV29TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV30TFPrdAltNum = httpContext.GetPar( "TFPrdAltNum") ;
      AV31TFPrdAltNum_Sel = httpContext.GetPar( "TFPrdAltNum_Sel") ;
      AV32TFPrdAltNom = httpContext.GetPar( "TFPrdAltNom") ;
      AV33TFPrdAltNom_Sel = httpContext.GetPar( "TFPrdAltNom_Sel") ;
      AV34TFPrvAltNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvAltNum"))) ;
      AV35TFPrvAltNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvAltNum_To"))) ;
      AV36TFPrvAltNom = httpContext.GetPar( "TFPrvAltNom") ;
      AV37TFPrvAltNom_Sel = httpContext.GetPar( "TFPrvAltNom_Sel") ;
      AV38TFPrdAltFac = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAltFac"), ".") ;
      AV39TFPrdAltFac_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdAltFac_To"), ".") ;
      AV55TFValDsc = httpContext.GetPar( "TFValDsc") ;
      AV56TFValDsc_Sel = httpContext.GetPar( "TFValDsc_Sel") ;
      AV60Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa1L22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1L22( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.productosalternativos_trnww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProductosAlternativos_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\productosalternativos_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV42GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV43GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV26TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV27TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV28TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV29TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTNUM", GXutil.rtrim( AV30TFPrdAltNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTNUM_SEL", GXutil.rtrim( AV31TFPrdAltNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTNOM", GXutil.rtrim( AV32TFPrdAltNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTNOM_SEL", GXutil.rtrim( AV33TFPrdAltNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVALTNUM", GXutil.ltrim( localUtil.ntoc( AV34TFPrvAltNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVALTNUM_TO", GXutil.ltrim( localUtil.ntoc( AV35TFPrvAltNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVALTNOM", GXutil.rtrim( AV36TFPrvAltNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVALTNOM_SEL", GXutil.rtrim( AV37TFPrvAltNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTFAC", GXutil.ltrim( localUtil.ntoc( AV38TFPrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDALTFAC_TO", GXutil.ltrim( localUtil.ntoc( AV39TFPrdAltFac_To, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC", GXutil.rtrim( AV55TFValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALDSC_SEL", GXutil.rtrim( AV56TFValDsc_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV79Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM_SELECTED", GXutil.rtrim( AV80Prdnum_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1L22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1L22( ) ;
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
      return formatLink("app.formulaciontinte.productosalternativos_trnww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProductosAlternativos_TRNWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Productos Alternativos", "") ;
   }

   public void wb1L20( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1L22( true) ;
      }
      else
      {
         wb_table1_27_1L22( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1L22e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV42GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV43GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_68_1L22( true) ;
      }
      else
      {
         wb_table2_68_1L22( false) ;
      }
      return  ;
   }

   public void wb_table2_68_1L22e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
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

   public void start1L22( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Productos Alternativos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1L20( ) ;
   }

   public void ws1L22( )
   {
      start1L22( ) ;
      evt1L22( ) ;
   }

   public void evt1L22( )
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
                           e111L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e171L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e181L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e191L22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e201L22 ();
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
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV57GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridActionGroup1), 4, 0));
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A680PrdAltNum = httpContext.cgiGet( edtPrdAltNum_Internalname) ;
                           A679PrdAltNom = httpContext.cgiGet( edtPrdAltNom_Internalname) ;
                           n679PrdAltNom = false ;
                           A778PrvAltNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvAltNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n778PrvAltNum = false ;
                           A777PrvAltNom = httpContext.cgiGet( edtPrvAltNom_Internalname) ;
                           A678PrdAltFac = localUtil.ctond( httpContext.cgiGet( edtPrdAltFac_Internalname)) ;
                           A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
                           n857ValDsc = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e211L22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e221L22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231L22 ();
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

   public void we1L22( )
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

   public void pa1L22( )
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
                                 String AV26TFPrdNum ,
                                 String AV27TFPrdNum_Sel ,
                                 String AV28TFPrdNom ,
                                 String AV29TFPrdNom_Sel ,
                                 String AV30TFPrdAltNum ,
                                 String AV31TFPrdAltNum_Sel ,
                                 String AV32TFPrdAltNom ,
                                 String AV33TFPrdAltNom_Sel ,
                                 int AV34TFPrvAltNum ,
                                 int AV35TFPrvAltNum_To ,
                                 String AV36TFPrvAltNom ,
                                 String AV37TFPrvAltNom_Sel ,
                                 java.math.BigDecimal AV38TFPrdAltFac ,
                                 java.math.BigDecimal AV39TFPrdAltFac_To ,
                                 String AV55TFValDsc ,
                                 String AV56TFValDsc_Sel ,
                                 String AV60Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221L22 ();
      GRID_nCurrentRecord = 0 ;
      rf1L22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProductosAlternativos_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\productosalternativos_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rf1L22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV60Pgmname = "FormulacionTinte.ProductosAlternativos_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor H01L22 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = H01L22_A856ValCod[0] ;
         A857ValDsc = H01L22_A857ValDsc[0] ;
         n857ValDsc = H01L22_n857ValDsc[0] ;
         A678PrdAltFac = H01L22_A678PrdAltFac[0] ;
         A680PrdAltNum = H01L22_A680PrdAltNum[0] ;
         A718PrdNom = H01L22_A718PrdNom[0] ;
         A719PrdNum = H01L22_A719PrdNum[0] ;
         A679PrdAltNom = H01L22_A679PrdAltNom[0] ;
         n679PrdAltNom = H01L22_n679PrdAltNom[0] ;
         A778PrvAltNum = H01L22_A778PrvAltNum[0] ;
         n778PrvAltNum = H01L22_n778PrvAltNum[0] ;
         A856ValCod = H01L22_A856ValCod[0] ;
         A718PrdNom = H01L22_A718PrdNom[0] ;
         A857ValDsc = H01L22_A857ValDsc[0] ;
         n857ValDsc = H01L22_n857ValDsc[0] ;
         A679PrdAltNom = H01L22_A679PrdAltNom[0] ;
         n679PrdAltNom = H01L22_n679PrdAltNom[0] ;
         A778PrvAltNum = H01L22_A778PrvAltNum[0] ;
         n778PrvAltNum = H01L22_n778PrvAltNum[0] ;
         GXt_char1 = A777PrvAltNom ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A778PrvAltNum ;
         GXv_char4[0] = GXt_char1 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         productosalternativos_trnww_impl.this.A396EmprCod = GXv_char2[0] ;
         productosalternativos_trnww_impl.this.A778PrvAltNum = GXv_int3[0] ;
         productosalternativos_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A777PrvAltNom = GXt_char1 ;
         if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
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

   public void rf1L22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e221L22 ();
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
                                              AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                              AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                              AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                              AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                              AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                              AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                              AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                              AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                              AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                              AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A680PrdAltNum ,
                                              A678PrdAltFac ,
                                              A857ValDsc ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                              A679PrdAltNom ,
                                              Integer.valueOf(A778PrvAltNum) ,
                                              A777PrvAltNom ,
                                              AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                              AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                              Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                              Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                              AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                              AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         });
         lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
         lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
         lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
         lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
         lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
         /* Using cursor H01L23 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A856ValCod = H01L23_A856ValCod[0] ;
            A857ValDsc = H01L23_A857ValDsc[0] ;
            n857ValDsc = H01L23_n857ValDsc[0] ;
            A678PrdAltFac = H01L23_A678PrdAltFac[0] ;
            A680PrdAltNum = H01L23_A680PrdAltNum[0] ;
            A718PrdNom = H01L23_A718PrdNom[0] ;
            A719PrdNum = H01L23_A719PrdNum[0] ;
            A679PrdAltNom = H01L23_A679PrdAltNom[0] ;
            n679PrdAltNom = H01L23_n679PrdAltNom[0] ;
            A778PrvAltNum = H01L23_A778PrvAltNum[0] ;
            n778PrvAltNum = H01L23_n778PrvAltNum[0] ;
            A856ValCod = H01L23_A856ValCod[0] ;
            A718PrdNom = H01L23_A718PrdNom[0] ;
            A857ValDsc = H01L23_A857ValDsc[0] ;
            n857ValDsc = H01L23_n857ValDsc[0] ;
            A679PrdAltNom = H01L23_A679PrdAltNom[0] ;
            n679PrdAltNom = H01L23_n679PrdAltNom[0] ;
            A778PrvAltNum = H01L23_A778PrvAltNum[0] ;
            n778PrvAltNum = H01L23_n778PrvAltNum[0] ;
            GXt_char1 = A777PrvAltNom ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A778PrvAltNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
            productosalternativos_trnww_impl.this.A396EmprCod = GXv_char4[0] ;
            productosalternativos_trnww_impl.this.A778PrvAltNum = GXv_int3[0] ;
            productosalternativos_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A777PrvAltNom = GXt_char1 ;
            if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
                  {
                     e231L22 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb1L20( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1L22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFPrdNum, AV27TFPrdNum_Sel, AV28TFPrdNom, AV29TFPrdNom_Sel, AV30TFPrdAltNum, AV31TFPrdAltNum_Sel, AV32TFPrdAltNom, AV33TFPrdAltNom_Sel, AV34TFPrvAltNum, AV35TFPrvAltNum_To, AV36TFPrvAltNom, AV37TFPrvAltNom_Sel, AV38TFPrdAltFac, AV39TFPrdAltFac_To, AV55TFValDsc, AV56TFValDsc_Sel, AV60Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV60Pgmname = "FormulacionTinte.ProductosAlternativos_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1L20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211L22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV40DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV43GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV79Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         AV80Prdnum_selected = httpContext.cgiGet( "vPRDNUM_SELECTED") ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_45_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         if ( nGXsfl_45_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV57GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridActionGroup1), 4, 0));
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A680PrdAltNum = httpContext.cgiGet( edtPrdAltNum_Internalname) ;
            A679PrdAltNom = httpContext.cgiGet( edtPrdAltNom_Internalname) ;
            n679PrdAltNom = false ;
            A778PrvAltNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvAltNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n778PrvAltNum = false ;
            A777PrvAltNom = httpContext.cgiGet( edtPrvAltNom_Internalname) ;
            A678PrdAltFac = localUtil.ctond( httpContext.cgiGet( edtPrdAltFac_Internalname)) ;
            A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
            n857ValDsc = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ProductosAlternativos_TRNWW");
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\productosalternativos_trnww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e211L22 ();
      if (returnInSub) return;
   }

   public void e211L22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV46Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      productosalternativos_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46Station = GXt_char1 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char2[0] = AV47EmprNom ;
      GXv_char5[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char4, GXv_char2, GXv_char5) ;
      productosalternativos_trnww_impl.this.A396EmprCod = GXv_char4[0] ;
      productosalternativos_trnww_impl.this.AV47EmprNom = GXv_char2[0] ;
      productosalternativos_trnww_impl.this.AV48UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV54ValCod = (byte)(1) ;
      GXt_char1 = AV46Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      productosalternativos_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV46Station = GXt_char1 ;
      GXv_char5[0] = AV61Emprcod ;
      GXv_char4[0] = AV47EmprNom ;
      GXv_char2[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char5, GXv_char4, GXv_char2) ;
      productosalternativos_trnww_impl.this.AV61Emprcod = GXv_char5[0] ;
      productosalternativos_trnww_impl.this.AV47EmprNom = GXv_char4[0] ;
      productosalternativos_trnww_impl.this.AV48UsurCod = GXv_char2[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Productos Alternativos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV40DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV40DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e221L22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV6WWPContext = GXv_SdtWWPContext8[0] ;
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
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdAltNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdAltNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvAltNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvAltNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdAltFac_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltFac_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltFac_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV42GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridCurrentPage), 10, 0));
      AV43GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridPageCount), 10, 0));
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV26TFPrdNum ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV27TFPrdNum_Sel ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV28TFPrdNom ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV29TFPrdNom_Sel ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV30TFPrdAltNum ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV31TFPrdAltNum_Sel ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV32TFPrdAltNom ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV33TFPrdAltNom_Sel ;
      AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV34TFPrvAltNum ;
      AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV35TFPrvAltNum_To ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV36TFPrvAltNom ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV37TFPrvAltNom_Sel ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV38TFPrdAltFac ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV39TFPrdAltFac_To ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV55TFValDsc ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV56TFValDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121L22( )
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
         AV41PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV41PageToGo) ;
      }
   }

   public void e131L22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141L22( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV26TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
            AV27TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV28TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
            AV29TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAltNum") == 0 )
         {
            AV30TFPrdAltNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdAltNum", AV30TFPrdAltNum);
            AV31TFPrdAltNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdAltNum_Sel", AV31TFPrdAltNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAltNom") == 0 )
         {
            AV32TFPrdAltNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdAltNom", AV32TFPrdAltNom);
            AV33TFPrdAltNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdAltNom_Sel", AV33TFPrdAltNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvAltNum") == 0 )
         {
            AV34TFPrvAltNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvAltNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrvAltNum), 6, 0));
            AV35TFPrvAltNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvAltNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrvAltNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvAltNom") == 0 )
         {
            AV36TFPrvAltNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvAltNom", AV36TFPrvAltNom);
            AV37TFPrvAltNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvAltNom_Sel", AV37TFPrvAltNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdAltFac") == 0 )
         {
            AV38TFPrdAltFac = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdAltFac", GXutil.ltrimstr( AV38TFPrdAltFac, 7, 4));
            AV39TFPrdAltFac_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAltFac_To", GXutil.ltrimstr( AV39TFPrdAltFac_To, 7, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValDsc") == 0 )
         {
            AV55TFValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFValDsc", AV55TFValDsc);
            AV56TFValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFValDsc_Sel", AV56TFValDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e231L22( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV57GridActionGroup1, 4, 0)) );
   }

   public void e151L22( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111L22( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ProductosAlternativos_TRNWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV60Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ProductosAlternativos_TRNWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_TRNWWFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         productosalternativos_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e161L22( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171L22( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.productoalternativo_1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"Emprcod","PrdNum"}) , new Object[] {""});
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.formulaciontinte.productosalternativos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrdNum"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e181L22( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char5[0] = AV16ExcelFilename ;
      GXv_char4[0] = AV17ErrorMessage ;
      new app.formulaciontinte.productosalternativos_trnwwexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      productosalternativos_trnww_impl.this.AV16ExcelFilename = GXv_char5[0] ;
      productosalternativos_trnww_impl.this.AV17ErrorMessage = GXv_char4[0] ;
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

   public void e191L22( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.formulaciontinte.productosalternativos_trnwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e201L22( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.formulaciontinte.productosalternativos_trnwwexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdAltNum", "Alternativo", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdAltNom", "Alternativo", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrvAltNum", "", "Proveedor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrvAltNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdAltFac", "", "Factor", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ValDsc", "", "Validez", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_TRNWWColumnsSelector", GXv_char5) ;
      productosalternativos_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.ProductosAlternativos_TRNWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
      AV27TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
      AV28TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
      AV29TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
      AV30TFPrdAltNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdAltNum", AV30TFPrdAltNum);
      AV31TFPrdAltNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdAltNum_Sel", AV31TFPrdAltNum_Sel);
      AV32TFPrdAltNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdAltNom", AV32TFPrdAltNom);
      AV33TFPrdAltNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdAltNom_Sel", AV33TFPrdAltNom_Sel);
      AV34TFPrvAltNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvAltNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrvAltNum), 6, 0));
      AV35TFPrvAltNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvAltNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrvAltNum_To), 6, 0));
      AV36TFPrvAltNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvAltNom", AV36TFPrvAltNom);
      AV37TFPrvAltNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvAltNom_Sel", AV37TFPrvAltNom_Sel);
      AV38TFPrdAltFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdAltFac", GXutil.ltrimstr( AV38TFPrdAltFac, 7, 4));
      AV39TFPrdAltFac_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAltFac_To", GXutil.ltrimstr( AV39TFPrdAltFac_To, 7, 4));
      AV55TFValDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFValDsc", AV55TFValDsc);
      AV56TFValDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFValDsc_Sel", AV56TFValDsc_Sel);
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
      callWebObject(formatLink("app.formulaciontinte.productosalternativos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.productosalternativos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV79Emprcod_selected = A396EmprCod ;
      AV80Prdnum_selected = A719PrdNum ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = A680PrdAltNum ;
      new app.formulaciontinte.pboralt(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      productosalternativos_trnww_impl.this.A396EmprCod = GXv_char5[0] ;
      productosalternativos_trnww_impl.this.A680PrdAltNum = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV60Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV60Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV60Pgmname+"GridState"), null, null);
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
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV26TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum", AV26TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV27TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNum_Sel", AV27TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV28TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom", AV28TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV29TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNom_Sel", AV29TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV30TFPrdAltNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPrdAltNum", AV30TFPrdAltNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV31TFPrdAltNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPrdAltNum_Sel", AV31TFPrdAltNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV32TFPrdAltNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrdAltNom", AV32TFPrdAltNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV33TFPrdAltNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrdAltNom_Sel", AV33TFPrdAltNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV34TFPrvAltNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvAltNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFPrvAltNum), 6, 0));
            AV35TFPrvAltNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvAltNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFPrvAltNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV36TFPrvAltNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrvAltNom", AV36TFPrvAltNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV37TFPrvAltNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrvAltNom_Sel", AV37TFPrvAltNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV38TFPrdAltFac = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdAltFac", GXutil.ltrimstr( AV38TFPrdAltFac, 7, 4));
            AV39TFPrdAltFac_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdAltFac_To", GXutil.ltrimstr( AV39TFPrdAltFac_To, 7, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV55TFValDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFValDsc", AV55TFValDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV56TFValDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFValDsc_Sel", AV56TFValDsc_Sel);
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, GXv_char5) ;
      productosalternativos_trnww_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, GXv_char4) ;
      productosalternativos_trnww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrdAltNum_Sel)==0), AV31TFPrdAltNum_Sel, GXv_char2) ;
      productosalternativos_trnww_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdAltNom_Sel)==0), AV33TFPrdAltNom_Sel, GXv_char16) ;
      productosalternativos_trnww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFPrvAltNom_Sel)==0), AV37TFPrvAltNom_Sel, GXv_char18) ;
      productosalternativos_trnww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFValDsc_Sel)==0), AV56TFValDsc_Sel, GXv_char20) ;
      productosalternativos_trnww_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char15+"||"+GXt_char17+"||"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum)==0), AV26TFPrdNum, GXv_char20) ;
      productosalternativos_trnww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNom)==0), AV28TFPrdNom, GXv_char18) ;
      productosalternativos_trnww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdAltNum)==0), AV30TFPrdAltNum, GXv_char16) ;
      productosalternativos_trnww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char5[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdAltNom)==0), AV32TFPrdAltNom, GXv_char5) ;
      productosalternativos_trnww_impl.this.GXt_char14 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPrvAltNom)==0), AV36TFPrvAltNom, GXv_char4) ;
      productosalternativos_trnww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFValDsc)==0), AV55TFValDsc, GXv_char2) ;
      productosalternativos_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+GXt_char14+"|"+((0==AV34TFPrvAltNum) ? "" : GXutil.str( AV34TFPrvAltNum, 6, 0))+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdAltFac)==0) ? "" : GXutil.str( AV38TFPrdAltFac, 7, 4))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV35TFPrvAltNum_To) ? "" : GXutil.str( AV35TFPrvAltNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAltFac_To)==0) ? "" : GXutil.str( AV39TFPrdAltFac_To, 7, 4))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV60Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDNUM", "", !(GXutil.strcmp("", AV26TFPrdNum)==0), (short)(0), AV26TFPrdNum, "", !(GXutil.strcmp("", AV27TFPrdNum_Sel)==0), AV27TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDNOM", "", !(GXutil.strcmp("", AV28TFPrdNom)==0), (short)(0), AV28TFPrdNom, "", !(GXutil.strcmp("", AV29TFPrdNom_Sel)==0), AV29TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDALTNUM", "", !(GXutil.strcmp("", AV30TFPrdAltNum)==0), (short)(0), AV30TFPrdAltNum, "", !(GXutil.strcmp("", AV31TFPrdAltNum_Sel)==0), AV31TFPrdAltNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDALTNOM", "", !(GXutil.strcmp("", AV32TFPrdAltNom)==0), (short)(0), AV32TFPrdAltNom, "", !(GXutil.strcmp("", AV33TFPrdAltNom_Sel)==0), AV33TFPrdAltNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRVALTNUM", "", !((0==AV34TFPrvAltNum)&&(0==AV35TFPrvAltNum_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFPrvAltNum, 6, 0)), GXutil.trim( GXutil.str( AV35TFPrvAltNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRVALTNOM", "", !(GXutil.strcmp("", AV36TFPrvAltNom)==0), (short)(0), AV36TFPrvAltNom, "", !(GXutil.strcmp("", AV37TFPrvAltNom_Sel)==0), AV37TFPrvAltNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDALTFAC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdAltFac)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdAltFac_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFPrdAltFac, 7, 4)), GXutil.trim( GXutil.str( AV39TFPrdAltFac_To, 7, 4))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFVALDSC", "", !(GXutil.strcmp("", AV55TFValDsc)==0), (short)(0), AV55TFValDsc, "", !(GXutil.strcmp("", AV56TFValDsc_Sel)==0), AV56TFValDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV60Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.ProductosAlternativos_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_68_1L22( boolean wbgen )
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
         wb_table2_68_1L22e( true) ;
      }
      else
      {
         wb_table2_68_1L22e( false) ;
      }
   }

   public void wb_table1_27_1L22( boolean wbgen )
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
         wb_table3_32_1L22( true) ;
      }
      else
      {
         wb_table3_32_1L22( false) ;
      }
      return  ;
   }

   public void wb_table3_32_1L22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1L22e( true) ;
      }
      else
      {
         wb_table1_27_1L22e( false) ;
      }
   }

   public void wb_table3_32_1L22( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\ProductosAlternativos_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_1L22e( true) ;
      }
      else
      {
         wb_table3_32_1L22e( false) ;
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
      pa1L22( ) ;
      ws1L22( ) ;
      we1L22( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134310", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/productosalternativos_trnww.js", "?202682116134310", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_45_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_idx ;
      edtPrdAltNum_Internalname = "PRDALTNUM_"+sGXsfl_45_idx ;
      edtPrdAltNom_Internalname = "PRDALTNOM_"+sGXsfl_45_idx ;
      edtPrvAltNum_Internalname = "PRVALTNUM_"+sGXsfl_45_idx ;
      edtPrvAltNom_Internalname = "PRVALTNOM_"+sGXsfl_45_idx ;
      edtPrdAltFac_Internalname = "PRDALTFAC_"+sGXsfl_45_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_45_fel_idx );
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_45_fel_idx ;
      edtPrdAltNum_Internalname = "PRDALTNUM_"+sGXsfl_45_fel_idx ;
      edtPrdAltNom_Internalname = "PRDALTNOM_"+sGXsfl_45_fel_idx ;
      edtPrvAltNum_Internalname = "PRVALTNUM_"+sGXsfl_45_fel_idx ;
      edtPrvAltNom_Internalname = "PRVALTNOM_"+sGXsfl_45_fel_idx ;
      edtPrdAltFac_Internalname = "PRDALTFAC_"+sGXsfl_45_fel_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1L20( ) ;
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
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_45_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV57GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV57GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV57GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e241l22_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV57GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdAltNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAltNum_Internalname,GXutil.rtrim( A680PrdAltNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAltNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAltNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdAltNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAltNom_Internalname,GXutil.rtrim( A679PrdAltNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAltNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAltNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvAltNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvAltNum_Internalname,GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A778PrvAltNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvAltNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvAltNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvAltNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvAltNom_Internalname,GXutil.rtrim( A777PrvAltNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvAltNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrvAltNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdAltFac_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAltFac_Internalname,GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A678PrdAltFac, "Z9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAltFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdAltFac_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtValDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1L22( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAltNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAltNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvAltNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvAltNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdAltFac_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A680PrdAltNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAltNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A679PrdAltNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAltNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvAltNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A777PrvAltNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvAltNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdAltFac_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdAltNum_Internalname = "PRDALTNUM" ;
      edtPrdAltNom_Internalname = "PRDALTNOM" ;
      edtPrvAltNum_Internalname = "PRVALTNUM" ;
      edtPrvAltNom_Internalname = "PRVALTNOM" ;
      edtPrdAltFac_Internalname = "PRDALTFAC" ;
      edtValDsc_Internalname = "VALDSC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      edtValDsc_Jsonclick = "" ;
      edtPrdAltFac_Jsonclick = "" ;
      edtPrvAltNom_Jsonclick = "" ;
      edtPrvAltNum_Jsonclick = "" ;
      edtPrdAltNom_Jsonclick = "" ;
      edtPrdAltNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtValDsc_Visible = -1 ;
      edtPrdAltFac_Visible = -1 ;
      edtPrvAltNom_Visible = -1 ;
      edtPrvAltNum_Visible = -1 ;
      edtPrdAltNom_Visible = -1 ;
      edtPrdAltNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Alternativo;Alternativo;;;;" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Realmente desea eliminar estos datos?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ProductosAlternativos_TRNWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|T||T||T" ;
      Ddo_grid_Filterisrange = "||||T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T||||T|T" ;
      Ddo_grid_Columnssortvalues = "2|1|3||||4|5" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:PrdAltNum|4:PrdAltNom|5:PrvAltNum|6:PrvAltNom|7:PrdAltFac|8:ValDsc" ;
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
      Form.setCaption( httpContext.getMessage( " Productos Alternativos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_45_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV57GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV57GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231L22',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV57GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e241L22',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV57GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV57GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161L22',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A680PrdAltNum',fld:'PRDALTNUM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A680PrdAltNum',fld:'PRDALTNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e171L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e181L22',iparms:[{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e191L22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdAltNum_Visible',ctrl:'PRDALTNUM',prop:'Visible'},{av:'edtPrdAltNom_Visible',ctrl:'PRDALTNOM',prop:'Visible'},{av:'edtPrvAltNum_Visible',ctrl:'PRVALTNUM',prop:'Visible'},{av:'edtPrvAltNom_Visible',ctrl:'PRVALTNOM',prop:'Visible'},{av:'edtPrdAltFac_Visible',ctrl:'PRDALTFAC',prop:'Visible'},{av:'edtValDsc_Visible',ctrl:'VALDSC',prop:'Visible'},{av:'AV42GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV43GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e201L22',iparms:[{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV27TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV28TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV29TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV30TFPrdAltNum',fld:'vTFPRDALTNUM',pic:''},{av:'AV31TFPrdAltNum_Sel',fld:'vTFPRDALTNUM_SEL',pic:''},{av:'AV32TFPrdAltNom',fld:'vTFPRDALTNOM',pic:''},{av:'AV33TFPrdAltNom_Sel',fld:'vTFPRDALTNOM_SEL',pic:''},{av:'AV34TFPrvAltNum',fld:'vTFPRVALTNUM',pic:'ZZZZZ9'},{av:'AV35TFPrvAltNum_To',fld:'vTFPRVALTNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFPrvAltNom',fld:'vTFPRVALTNOM',pic:''},{av:'AV37TFPrvAltNom_Sel',fld:'vTFPRVALTNOM_SEL',pic:''},{av:'AV38TFPrdAltFac',fld:'vTFPRDALTFAC',pic:'Z9.9999'},{av:'AV39TFPrdAltFac_To',fld:'vTFPRDALTFAC_TO',pic:'Z9.9999'},{av:'AV55TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV56TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDALTNUM","{handler:'valid_Prdaltnum',iparms:[]");
      setEventMetadata("VALID_PRDALTNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDALTNOM","{handler:'valid_Prdaltnom',iparms:[]");
      setEventMetadata("VALID_PRDALTNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVALTNUM","{handler:'valid_Prvaltnum',iparms:[]");
      setEventMetadata("VALID_PRVALTNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVALTNOM","{handler:'valid_Prvaltnom',iparms:[]");
      setEventMetadata("VALID_PRVALTNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDALTFAC","{handler:'valid_Prdaltfac',iparms:[]");
      setEventMetadata("VALID_PRDALTFAC",",oparms:[]}");
      setEventMetadata("VALID_VALDSC","{handler:'valid_Valdsc',iparms:[]");
      setEventMetadata("VALID_VALDSC",",oparms:[]}");
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
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFPrdNum = "" ;
      AV27TFPrdNum_Sel = "" ;
      AV28TFPrdNom = "" ;
      AV29TFPrdNom_Sel = "" ;
      AV30TFPrdAltNum = "" ;
      AV31TFPrdAltNum_Sel = "" ;
      AV32TFPrdAltNom = "" ;
      AV33TFPrdAltNom_Sel = "" ;
      AV36TFPrvAltNom = "" ;
      AV37TFPrvAltNom_Sel = "" ;
      AV38TFPrdAltFac = DecimalUtil.ZERO ;
      AV39TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV55TFValDsc = "" ;
      AV56TFValDsc_Sel = "" ;
      AV60Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV40DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV79Emprcod_selected = "" ;
      AV80Prdnum_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = "" ;
      AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = "" ;
      AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = "" ;
      AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = "" ;
      AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = "" ;
      AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = "" ;
      AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      H01L22_A856ValCod = new byte[1] ;
      H01L22_A857ValDsc = new String[] {""} ;
      H01L22_n857ValDsc = new boolean[] {false} ;
      H01L22_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01L22_A680PrdAltNum = new String[] {""} ;
      H01L22_A718PrdNom = new String[] {""} ;
      H01L22_A719PrdNum = new String[] {""} ;
      H01L22_A396EmprCod = new String[] {""} ;
      H01L22_A679PrdAltNom = new String[] {""} ;
      H01L22_n679PrdAltNom = new boolean[] {false} ;
      H01L22_A778PrvAltNum = new int[1] ;
      H01L22_n778PrvAltNum = new boolean[] {false} ;
      H01L23_A856ValCod = new byte[1] ;
      H01L23_A857ValDsc = new String[] {""} ;
      H01L23_n857ValDsc = new boolean[] {false} ;
      H01L23_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01L23_A680PrdAltNum = new String[] {""} ;
      H01L23_A718PrdNom = new String[] {""} ;
      H01L23_A719PrdNum = new String[] {""} ;
      H01L23_A396EmprCod = new String[] {""} ;
      H01L23_A679PrdAltNom = new String[] {""} ;
      H01L23_n679PrdAltNom = new boolean[] {false} ;
      H01L23_A778PrvAltNum = new int[1] ;
      H01L23_n778PrvAltNum = new boolean[] {false} ;
      GXv_int3 = new int[1] ;
      hsh = "" ;
      AV46Station = "" ;
      AV47EmprNom = "" ;
      AV48UsurCod = "" ;
      AV61Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trnww__default(),
         new Object[] {
             new Object[] {
            H01L22_A856ValCod, H01L22_A857ValDsc, H01L22_n857ValDsc, H01L22_A678PrdAltFac, H01L22_A680PrdAltNum, H01L22_A718PrdNom, H01L22_A719PrdNum, H01L22_A396EmprCod, H01L22_A679PrdAltNom, H01L22_n679PrdAltNom,
            H01L22_A778PrvAltNum, H01L22_n778PrvAltNum
            }
            , new Object[] {
            H01L23_A856ValCod, H01L23_A857ValDsc, H01L23_n857ValDsc, H01L23_A678PrdAltFac, H01L23_A680PrdAltNum, H01L23_A718PrdNom, H01L23_A719PrdNum, H01L23_A396EmprCod, H01L23_A679PrdAltNom, H01L23_n679PrdAltNom,
            H01L23_A778PrvAltNum, H01L23_n778PrvAltNum
            }
         }
      );
      AV60Pgmname = "FormulacionTinte.ProductosAlternativos_TRNWW" ;
      /* GeneXus formulas. */
      AV60Pgmname = "FormulacionTinte.ProductosAlternativos_TRNWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte A856ValCod ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV54ValCod ;
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
   private short AV57GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV34TFPrvAltNum ;
   private int AV35TFPrvAltNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A778PrvAltNum ;
   private int subGrid_Islastpage ;
   private int AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ;
   private int AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ;
   private int GXv_int3[] ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrdAltNum_Visible ;
   private int edtPrdAltNom_Visible ;
   private int edtPrvAltNum_Visible ;
   private int edtPrvAltNom_Visible ;
   private int edtPrdAltFac_Visible ;
   private int edtValDsc_Visible ;
   private int AV41PageToGo ;
   private int AV81GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV42GridCurrentPage ;
   private long AV43GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFPrdAltFac ;
   private java.math.BigDecimal AV39TFPrdAltFac_To ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ;
   private java.math.BigDecimal AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String A396EmprCod ;
   private String AV26TFPrdNum ;
   private String AV27TFPrdNum_Sel ;
   private String AV28TFPrdNom ;
   private String AV29TFPrdNom_Sel ;
   private String AV30TFPrdAltNum ;
   private String AV31TFPrdAltNum_Sel ;
   private String AV32TFPrdAltNom ;
   private String AV33TFPrdAltNom_Sel ;
   private String AV36TFPrvAltNom ;
   private String AV37TFPrvAltNom_Sel ;
   private String AV55TFValDsc ;
   private String AV56TFValDsc_Sel ;
   private String AV60Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV79Emprcod_selected ;
   private String AV80Prdnum_selected ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String A680PrdAltNum ;
   private String edtPrdAltNum_Internalname ;
   private String A679PrdAltNom ;
   private String edtPrdAltNom_Internalname ;
   private String edtPrvAltNum_Internalname ;
   private String A777PrvAltNom ;
   private String edtPrvAltNom_Internalname ;
   private String edtPrdAltFac_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ;
   private String AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ;
   private String AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ;
   private String AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ;
   private String AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ;
   private String AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ;
   private String AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String lV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String lV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String lV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String lV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String hsh ;
   private String AV46Station ;
   private String AV47EmprNom ;
   private String AV48UsurCod ;
   private String AV61Emprcod ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char5[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
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
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdAltNum_Jsonclick ;
   private String edtPrdAltNom_Jsonclick ;
   private String edtPrvAltNum_Jsonclick ;
   private String edtPrvAltNom_Jsonclick ;
   private String edtPrdAltFac_Jsonclick ;
   private String edtValDsc_Jsonclick ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private boolean n857ValDsc ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String lV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private byte[] H01L22_A856ValCod ;
   private String[] H01L22_A857ValDsc ;
   private boolean[] H01L22_n857ValDsc ;
   private java.math.BigDecimal[] H01L22_A678PrdAltFac ;
   private String[] H01L22_A680PrdAltNum ;
   private String[] H01L22_A718PrdNom ;
   private String[] H01L22_A719PrdNum ;
   private String[] H01L22_A396EmprCod ;
   private String[] H01L22_A679PrdAltNom ;
   private boolean[] H01L22_n679PrdAltNom ;
   private int[] H01L22_A778PrvAltNum ;
   private boolean[] H01L22_n778PrvAltNum ;
   private byte[] H01L23_A856ValCod ;
   private String[] H01L23_A857ValDsc ;
   private boolean[] H01L23_n857ValDsc ;
   private java.math.BigDecimal[] H01L23_A678PrdAltFac ;
   private String[] H01L23_A680PrdAltNum ;
   private String[] H01L23_A718PrdNom ;
   private String[] H01L23_A719PrdNum ;
   private String[] H01L23_A396EmprCod ;
   private String[] H01L23_A679PrdAltNom ;
   private boolean[] H01L23_n679PrdAltNom ;
   private int[] H01L23_A778PrvAltNum ;
   private boolean[] H01L23_n778PrvAltNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV40DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class productosalternativos_trnww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01L22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[20];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, T1.EmprCod, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ValDsc DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H01L23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV70Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV69Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV71Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV72Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV74Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV73Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[20];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, T1.EmprCod, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdAltFac DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ValDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ValDsc DESC" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H01L22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_H01L23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01L22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01L23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
      }
   }

}

