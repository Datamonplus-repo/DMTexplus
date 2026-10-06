package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testcatww_impl extends GXDataArea
{
   public testcatww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testcatww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testcatww_impl.class ));
   }

   public testcatww_impl( int remoteHandle ,
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV26TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV27TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV28TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV29TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV30TFArtCod = httpContext.GetPar( "TFArtCod") ;
      AV31TFArtCod_Sel = httpContext.GetPar( "TFArtCod_Sel") ;
      AV32TFEstCatAny = (short)(GXutil.lval( httpContext.GetPar( "TFEstCatAny"))) ;
      AV33TFEstCatAny_To = (short)(GXutil.lval( httpContext.GetPar( "TFEstCatAny_To"))) ;
      AV34TFEstCatSer = httpContext.GetPar( "TFEstCatSer") ;
      AV35TFEstCatSer_Sel = httpContext.GetPar( "TFEstCatSer_Sel") ;
      AV36TFEstCatTip = (short)(GXutil.lval( httpContext.GetPar( "TFEstCatTip"))) ;
      AV37TFEstCatTip_To = (short)(GXutil.lval( httpContext.GetPar( "TFEstCatTip_To"))) ;
      AV38TFEstCatDsc = httpContext.GetPar( "TFEstCatDsc") ;
      AV39TFEstCatDsc_Sel = httpContext.GetPar( "TFEstCatDsc_Sel") ;
      AV40TFEstCatAIm0 = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatAIm0"), ".") ;
      AV41TFEstCatAIm0_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatAIm0_To"), ".") ;
      AV42TFEstCatAIm1 = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatAIm1"), ".") ;
      AV43TFEstCatAIm1_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatAIm1_To"), ".") ;
      AV44TFEstCatOrd0 = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatOrd0"), ".") ;
      AV45TFEstCatOrd0_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEstCatOrd0_To"), ".") ;
      AV53Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa2AU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AU2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.testcatww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TESTCATWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("testcatww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD", GXutil.rtrim( AV30TFArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD_SEL", GXutil.rtrim( AV31TFArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATANY", GXutil.ltrim( localUtil.ntoc( AV32TFEstCatAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATANY_TO", GXutil.ltrim( localUtil.ntoc( AV33TFEstCatAny_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATSER", GXutil.rtrim( AV34TFEstCatSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATSER_SEL", GXutil.rtrim( AV35TFEstCatSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATTIP", GXutil.ltrim( localUtil.ntoc( AV36TFEstCatTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATTIP_TO", GXutil.ltrim( localUtil.ntoc( AV37TFEstCatTip_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATDSC", GXutil.rtrim( AV38TFEstCatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATDSC_SEL", GXutil.rtrim( AV39TFEstCatDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATAIM0", GXutil.ltrim( localUtil.ntoc( AV40TFEstCatAIm0, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATAIM0_TO", GXutil.ltrim( localUtil.ntoc( AV41TFEstCatAIm0_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATAIM1", GXutil.ltrim( localUtil.ntoc( AV42TFEstCatAIm1, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATAIM1_TO", GXutil.ltrim( localUtil.ntoc( AV43TFEstCatAIm1_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATORD0", GXutil.ltrim( localUtil.ntoc( AV44TFEstCatOrd0, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFESTCATORD0_TO", GXutil.ltrim( localUtil.ntoc( AV45TFEstCatOrd0_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we2AU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AU2( ) ;
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
      return formatLink("app.testcatww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TESTCATWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Estad.Cliente/Serie/T.Articulo", "") ;
   }

   public void wb2AU0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_2AU2( true) ;
      }
      else
      {
         wb_table1_27_2AU2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_2AU2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV53Pgmname), GXutil.rtrim( localUtil.format( AV53Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESTCATWW.htm");
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

   public void start2AU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Estad.Cliente/Serie/T.Articulo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2AU0( ) ;
   }

   public void ws2AU2( )
   {
      start2AU2( ) ;
      evt2AU2( ) ;
   }

   public void evt2AU2( )
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
                           e112AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e162AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e172AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e182AU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e192AU2 ();
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
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
                           A5382EstCatAny = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCatAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5383EstCatSer = httpContext.cgiGet( edtEstCatSer_Internalname) ;
                           A5384EstCatTip = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCatTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5385EstCatDsc = httpContext.cgiGet( edtEstCatDsc_Internalname) ;
                           n5385EstCatDsc = false ;
                           A5386EstCatAIm0 = localUtil.ctond( httpContext.cgiGet( edtEstCatAIm0_Internalname)) ;
                           A5387EstCatAIm1 = localUtil.ctond( httpContext.cgiGet( edtEstCatAIm1_Internalname)) ;
                           A5388EstCatOrd0 = localUtil.ctond( httpContext.cgiGet( edtEstCatOrd0_Internalname)) ;
                           n5388EstCatOrd0 = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we2AU2( )
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

   public void pa2AU2( )
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
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV26TFEmprCod ,
                                 String AV27TFEmprCod_Sel ,
                                 int AV28TFCliCod ,
                                 int AV29TFCliCod_To ,
                                 String AV30TFArtCod ,
                                 String AV31TFArtCod_Sel ,
                                 short AV32TFEstCatAny ,
                                 short AV33TFEstCatAny_To ,
                                 String AV34TFEstCatSer ,
                                 String AV35TFEstCatSer_Sel ,
                                 short AV36TFEstCatTip ,
                                 short AV37TFEstCatTip_To ,
                                 String AV38TFEstCatDsc ,
                                 String AV39TFEstCatDsc_Sel ,
                                 java.math.BigDecimal AV40TFEstCatAIm0 ,
                                 java.math.BigDecimal AV41TFEstCatAIm0_To ,
                                 java.math.BigDecimal AV42TFEstCatAIm1 ,
                                 java.math.BigDecimal AV43TFEstCatAIm1_To ,
                                 java.math.BigDecimal AV44TFEstCatOrd0 ,
                                 java.math.BigDecimal AV45TFEstCatOrd0_To ,
                                 String AV53Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212AU2 ();
      GRID_nCurrentRecord = 0 ;
      rf2AU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TESTCATWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("testcatww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATANY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5382EstCatAny), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCATANY", GXutil.ltrim( localUtil.ntoc( A5382EstCatAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A5383EstCatSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCATSER", GXutil.rtrim( A5383EstCatSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATTIP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5384EstCatTip), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCATTIP", GXutil.ltrim( localUtil.ntoc( A5384EstCatTip, (byte)(4), (byte)(0), ".", "")));
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
      rf2AU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV53Pgmname = "TESTCATWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e212AU2 ();
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
                                              AV58Testcatwwds_1_filterfulltext ,
                                              AV60Testcatwwds_3_tfemprcod_sel ,
                                              AV59Testcatwwds_2_tfemprcod ,
                                              Integer.valueOf(AV61Testcatwwds_4_tfclicod) ,
                                              Integer.valueOf(AV62Testcatwwds_5_tfclicod_to) ,
                                              AV64Testcatwwds_7_tfartcod_sel ,
                                              AV63Testcatwwds_6_tfartcod ,
                                              Short.valueOf(AV65Testcatwwds_8_tfestcatany) ,
                                              Short.valueOf(AV66Testcatwwds_9_tfestcatany_to) ,
                                              AV68Testcatwwds_11_tfestcatser_sel ,
                                              AV67Testcatwwds_10_tfestcatser ,
                                              Short.valueOf(AV69Testcatwwds_12_tfestcattip) ,
                                              Short.valueOf(AV70Testcatwwds_13_tfestcattip_to) ,
                                              AV72Testcatwwds_15_tfestcatdsc_sel ,
                                              AV71Testcatwwds_14_tfestcatdsc ,
                                              AV73Testcatwwds_16_tfestcataim0 ,
                                              AV74Testcatwwds_17_tfestcataim0_to ,
                                              AV75Testcatwwds_18_tfestcataim1 ,
                                              AV76Testcatwwds_19_tfestcataim1_to ,
                                              AV77Testcatwwds_20_tfestcatord0 ,
                                              AV78Testcatwwds_21_tfestcatord0_to ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A65ArtCod ,
                                              Short.valueOf(A5382EstCatAny) ,
                                              A5383EstCatSer ,
                                              Short.valueOf(A5384EstCatTip) ,
                                              A5385EstCatDsc ,
                                              A5386EstCatAIm0 ,
                                              A5387EstCatAIm1 ,
                                              A5388EstCatOrd0 ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
         lV59Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV59Testcatwwds_2_tfemprcod), 3, "%") ;
         lV63Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV63Testcatwwds_6_tfartcod), 16, "%") ;
         lV67Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV67Testcatwwds_10_tfestcatser), 3, "%") ;
         lV71Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV71Testcatwwds_14_tfestcatdsc), 30, "%") ;
         /* Using cursor H02AU3 */
         pr_default.execute(0, new Object[] {lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV59Testcatwwds_2_tfemprcod, AV60Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV61Testcatwwds_4_tfclicod), Integer.valueOf(AV62Testcatwwds_5_tfclicod_to), lV63Testcatwwds_6_tfartcod, AV64Testcatwwds_7_tfartcod_sel, Short.valueOf(AV65Testcatwwds_8_tfestcatany), Short.valueOf(AV66Testcatwwds_9_tfestcatany_to), lV67Testcatwwds_10_tfestcatser, AV68Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV69Testcatwwds_12_tfestcattip), Short.valueOf(AV70Testcatwwds_13_tfestcattip_to), lV71Testcatwwds_14_tfestcatdsc, AV72Testcatwwds_15_tfestcatdsc_sel, AV73Testcatwwds_16_tfestcataim0, AV74Testcatwwds_17_tfestcataim0_to, AV75Testcatwwds_18_tfestcataim1, AV76Testcatwwds_19_tfestcataim1_to, AV77Testcatwwds_20_tfestcatord0, AV78Testcatwwds_21_tfestcatord0_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5388EstCatOrd0 = H02AU3_A5388EstCatOrd0[0] ;
            n5388EstCatOrd0 = H02AU3_n5388EstCatOrd0[0] ;
            A5385EstCatDsc = H02AU3_A5385EstCatDsc[0] ;
            n5385EstCatDsc = H02AU3_n5385EstCatDsc[0] ;
            A5384EstCatTip = H02AU3_A5384EstCatTip[0] ;
            A5383EstCatSer = H02AU3_A5383EstCatSer[0] ;
            A5382EstCatAny = H02AU3_A5382EstCatAny[0] ;
            A65ArtCod = H02AU3_A65ArtCod[0] ;
            A252CliCod = H02AU3_A252CliCod[0] ;
            A396EmprCod = H02AU3_A396EmprCod[0] ;
            A5387EstCatAIm1 = H02AU3_A5387EstCatAIm1[0] ;
            A5386EstCatAIm0 = H02AU3_A5386EstCatAIm0[0] ;
            A5387EstCatAIm1 = H02AU3_A5387EstCatAIm1[0] ;
            A5386EstCatAIm0 = H02AU3_A5386EstCatAIm0[0] ;
            e222AU2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb2AU0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2AU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATANY"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A5382EstCatAny), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATSER"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A5383EstCatSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ESTCATTIP"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A5384EstCatTip), "ZZZ9")));
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
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Testcatwwds_1_filterfulltext ,
                                           AV60Testcatwwds_3_tfemprcod_sel ,
                                           AV59Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV61Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV62Testcatwwds_5_tfclicod_to) ,
                                           AV64Testcatwwds_7_tfartcod_sel ,
                                           AV63Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV65Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV66Testcatwwds_9_tfestcatany_to) ,
                                           AV68Testcatwwds_11_tfestcatser_sel ,
                                           AV67Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV69Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV70Testcatwwds_13_tfestcattip_to) ,
                                           AV72Testcatwwds_15_tfestcatdsc_sel ,
                                           AV71Testcatwwds_14_tfestcatdsc ,
                                           AV73Testcatwwds_16_tfestcataim0 ,
                                           AV74Testcatwwds_17_tfestcataim0_to ,
                                           AV75Testcatwwds_18_tfestcataim1 ,
                                           AV76Testcatwwds_19_tfestcataim1_to ,
                                           AV77Testcatwwds_20_tfestcatord0 ,
                                           AV78Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Testcatwwds_1_filterfulltext), "%", "") ;
      lV59Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV59Testcatwwds_2_tfemprcod), 3, "%") ;
      lV63Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV63Testcatwwds_6_tfartcod), 16, "%") ;
      lV67Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV67Testcatwwds_10_tfestcatser), 3, "%") ;
      lV71Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV71Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor H02AU5 */
      pr_default.execute(1, new Object[] {lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV58Testcatwwds_1_filterfulltext, lV59Testcatwwds_2_tfemprcod, AV60Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV61Testcatwwds_4_tfclicod), Integer.valueOf(AV62Testcatwwds_5_tfclicod_to), lV63Testcatwwds_6_tfartcod, AV64Testcatwwds_7_tfartcod_sel, Short.valueOf(AV65Testcatwwds_8_tfestcatany), Short.valueOf(AV66Testcatwwds_9_tfestcatany_to), lV67Testcatwwds_10_tfestcatser, AV68Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV69Testcatwwds_12_tfestcattip), Short.valueOf(AV70Testcatwwds_13_tfestcattip_to), lV71Testcatwwds_14_tfestcatdsc, AV72Testcatwwds_15_tfestcatdsc_sel, AV73Testcatwwds_16_tfestcataim0, AV74Testcatwwds_17_tfestcataim0_to, AV75Testcatwwds_18_tfestcataim1, AV76Testcatwwds_19_tfestcataim1_to, AV77Testcatwwds_20_tfestcatord0, AV78Testcatwwds_21_tfestcatord0_to});
      GRID_nRecordCount = H02AU5_AGRID_nRecordCount[0] ;
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
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFCliCod, AV29TFCliCod_To, AV30TFArtCod, AV31TFArtCod_Sel, AV32TFEstCatAny, AV33TFEstCatAny_To, AV34TFEstCatSer, AV35TFEstCatSer_Sel, AV36TFEstCatTip, AV37TFEstCatTip_To, AV38TFEstCatDsc, AV39TFEstCatDsc_Sel, AV40TFEstCatAIm0, AV41TFEstCatAIm0_To, AV42TFEstCatAIm1, AV43TFEstCatAIm1_To, AV44TFEstCatOrd0, AV45TFEstCatOrd0_To, AV53Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV53Pgmname = "TESTCATWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202AU2 ();
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
         forbiddenHiddens.add("hshsalt", "hsh"+"TESTCATWW");
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("testcatww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e202AU2 ();
      if (returnInSub) return;
   }

   public void e202AU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      testcatww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = AV55Emprcod ;
      GXv_char3[0] = AV56Emprnom ;
      GXv_char4[0] = AV57Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      testcatww_impl.this.AV55Emprcod = GXv_char2[0] ;
      testcatww_impl.this.AV56Emprnom = GXv_char3[0] ;
      testcatww_impl.this.AV57Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Estad.Cliente/Serie/T.Articulo", "") );
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

   public void e212AU2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("TESTCATWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("TESTCATWWColumnsSelector") ;
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
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatAny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatAny_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatSer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatTip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatTip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatTip_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatAIm0_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatAIm0_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatAIm0_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatAIm1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatAIm1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatAIm1_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtEstCatOrd0_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCatOrd0_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCatOrd0_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      AV58Testcatwwds_1_filterfulltext = AV15FilterFullText ;
      AV59Testcatwwds_2_tfemprcod = AV26TFEmprCod ;
      AV60Testcatwwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV61Testcatwwds_4_tfclicod = AV28TFCliCod ;
      AV62Testcatwwds_5_tfclicod_to = AV29TFCliCod_To ;
      AV63Testcatwwds_6_tfartcod = AV30TFArtCod ;
      AV64Testcatwwds_7_tfartcod_sel = AV31TFArtCod_Sel ;
      AV65Testcatwwds_8_tfestcatany = AV32TFEstCatAny ;
      AV66Testcatwwds_9_tfestcatany_to = AV33TFEstCatAny_To ;
      AV67Testcatwwds_10_tfestcatser = AV34TFEstCatSer ;
      AV68Testcatwwds_11_tfestcatser_sel = AV35TFEstCatSer_Sel ;
      AV69Testcatwwds_12_tfestcattip = AV36TFEstCatTip ;
      AV70Testcatwwds_13_tfestcattip_to = AV37TFEstCatTip_To ;
      AV71Testcatwwds_14_tfestcatdsc = AV38TFEstCatDsc ;
      AV72Testcatwwds_15_tfestcatdsc_sel = AV39TFEstCatDsc_Sel ;
      AV73Testcatwwds_16_tfestcataim0 = AV40TFEstCatAIm0 ;
      AV74Testcatwwds_17_tfestcataim0_to = AV41TFEstCatAIm0_To ;
      AV75Testcatwwds_18_tfestcataim1 = AV42TFEstCatAIm1 ;
      AV76Testcatwwds_19_tfestcataim1_to = AV43TFEstCatAIm1_To ;
      AV77Testcatwwds_20_tfestcatord0 = AV44TFEstCatOrd0 ;
      AV78Testcatwwds_21_tfestcatord0_to = AV45TFEstCatOrd0_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122AU2( )
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

   public void e132AU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142AU2( )
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
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtCod") == 0 )
         {
            AV30TFArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFArtCod", AV30TFArtCod);
            AV31TFArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFArtCod_Sel", AV31TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatAny") == 0 )
         {
            AV32TFEstCatAny = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFEstCatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFEstCatAny), 4, 0));
            AV33TFEstCatAny_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFEstCatAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFEstCatAny_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatSer") == 0 )
         {
            AV34TFEstCatSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFEstCatSer", AV34TFEstCatSer);
            AV35TFEstCatSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFEstCatSer_Sel", AV35TFEstCatSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatTip") == 0 )
         {
            AV36TFEstCatTip = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFEstCatTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEstCatTip), 4, 0));
            AV37TFEstCatTip_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFEstCatTip_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFEstCatTip_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatDsc") == 0 )
         {
            AV38TFEstCatDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFEstCatDsc", AV38TFEstCatDsc);
            AV39TFEstCatDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFEstCatDsc_Sel", AV39TFEstCatDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatAIm0") == 0 )
         {
            AV40TFEstCatAIm0 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFEstCatAIm0", GXutil.ltrimstr( AV40TFEstCatAIm0, 12, 2));
            AV41TFEstCatAIm0_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFEstCatAIm0_To", GXutil.ltrimstr( AV41TFEstCatAIm0_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatAIm1") == 0 )
         {
            AV42TFEstCatAIm1 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFEstCatAIm1", GXutil.ltrimstr( AV42TFEstCatAIm1, 12, 2));
            AV43TFEstCatAIm1_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFEstCatAIm1_To", GXutil.ltrimstr( AV43TFEstCatAIm1_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstCatOrd0") == 0 )
         {
            AV44TFEstCatOrd0 = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEstCatOrd0", GXutil.ltrimstr( AV44TFEstCatOrd0, 12, 2));
            AV45TFEstCatOrd0_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFEstCatOrd0_To", GXutil.ltrimstr( AV45TFEstCatOrd0_To, 12, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e222AU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtEstCatDsc_Link = formatLink("app.testcatview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A5382EstCatAny,4,0)),GXutil.URLEncode(GXutil.rtrim(A5383EstCatSer)),GXutil.URLEncode(GXutil.ltrimstr(A5384EstCatTip,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","CliCod","ArtCod","EstCatAny","EstCatSer","EstCatTip","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
   }

   public void e152AU2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TESTCATWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e112AU2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TESTCATWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV53Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TESTCATWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TESTCATWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         testcatww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e162AU2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.testcat", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","CliCod","ArtCod","EstCatAny","EstCatSer","EstCatTip"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e172AU2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.testcatwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      testcatww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      testcatww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e182AU2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.testcatwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e192AU2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.testcatwwexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Código Empresa", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ArtCod", "", "Código Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatAny", "", "EstCatAny", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatSer", "", "N.Serie Fac (Est.Cl/art/t.art)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatTip", "", "Tipo Articulo (E.Cl./Art./T.A)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatDsc", "", "Desc.T.Art (E.Cl./Art./T.A)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatAIm0", "", "Acum.Imp0 (Est.Cl/Ar/T.Art)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatAIm1", "", "Acum.Imp.1 (Est.Cl/Ar/T.Art)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstCatOrd0", "", "Orden (Est.Cli/Art/T.Art)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TESTCATWWColumnsSelector", GXv_char4) ;
      testcatww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TESTCATWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
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
      AV28TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
      AV29TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
      AV30TFArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFArtCod", AV30TFArtCod);
      AV31TFArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFArtCod_Sel", AV31TFArtCod_Sel);
      AV32TFEstCatAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFEstCatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFEstCatAny), 4, 0));
      AV33TFEstCatAny_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFEstCatAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFEstCatAny_To), 4, 0));
      AV34TFEstCatSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFEstCatSer", AV34TFEstCatSer);
      AV35TFEstCatSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFEstCatSer_Sel", AV35TFEstCatSer_Sel);
      AV36TFEstCatTip = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFEstCatTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEstCatTip), 4, 0));
      AV37TFEstCatTip_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFEstCatTip_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFEstCatTip_To), 4, 0));
      AV38TFEstCatDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFEstCatDsc", AV38TFEstCatDsc);
      AV39TFEstCatDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFEstCatDsc_Sel", AV39TFEstCatDsc_Sel);
      AV40TFEstCatAIm0 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFEstCatAIm0", GXutil.ltrimstr( AV40TFEstCatAIm0, 12, 2));
      AV41TFEstCatAIm0_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFEstCatAIm0_To", GXutil.ltrimstr( AV41TFEstCatAIm0_To, 12, 2));
      AV42TFEstCatAIm1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFEstCatAIm1", GXutil.ltrimstr( AV42TFEstCatAIm1, 12, 2));
      AV43TFEstCatAIm1_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFEstCatAIm1_To", GXutil.ltrimstr( AV43TFEstCatAIm1_To, 12, 2));
      AV44TFEstCatOrd0 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFEstCatOrd0", GXutil.ltrimstr( AV44TFEstCatOrd0, 12, 2));
      AV45TFEstCatOrd0_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFEstCatOrd0_To", GXutil.ltrimstr( AV45TFEstCatOrd0_To, 12, 2));
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
      callWebObject(formatLink("app.testcat", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A5382EstCatAny,4,0)),GXutil.URLEncode(GXutil.rtrim(A5383EstCatSer)),GXutil.URLEncode(GXutil.ltrimstr(A5384EstCatTip,4,0))}, new String[] {"Mode","EmprCod","CliCod","ArtCod","EstCatAny","EstCatSer","EstCatTip"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.testcat", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A5382EstCatAny,4,0)),GXutil.URLEncode(GXutil.rtrim(A5383EstCatSer)),GXutil.URLEncode(GXutil.ltrimstr(A5384EstCatTip,4,0))}, new String[] {"Mode","EmprCod","CliCod","ArtCod","EstCatAny","EstCatSer","EstCatTip"}) );
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
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
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
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV30TFArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFArtCod", AV30TFArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV31TFArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFArtCod_Sel", AV31TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATANY") == 0 )
         {
            AV32TFEstCatAny = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFEstCatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFEstCatAny), 4, 0));
            AV33TFEstCatAny_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFEstCatAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFEstCatAny_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER") == 0 )
         {
            AV34TFEstCatSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFEstCatSer", AV34TFEstCatSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER_SEL") == 0 )
         {
            AV35TFEstCatSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFEstCatSer_Sel", AV35TFEstCatSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATTIP") == 0 )
         {
            AV36TFEstCatTip = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFEstCatTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEstCatTip), 4, 0));
            AV37TFEstCatTip_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFEstCatTip_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFEstCatTip_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC") == 0 )
         {
            AV38TFEstCatDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFEstCatDsc", AV38TFEstCatDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC_SEL") == 0 )
         {
            AV39TFEstCatDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFEstCatDsc_Sel", AV39TFEstCatDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM0") == 0 )
         {
            AV40TFEstCatAIm0 = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFEstCatAIm0", GXutil.ltrimstr( AV40TFEstCatAIm0, 12, 2));
            AV41TFEstCatAIm0_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFEstCatAIm0_To", GXutil.ltrimstr( AV41TFEstCatAIm0_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM1") == 0 )
         {
            AV42TFEstCatAIm1 = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFEstCatAIm1", GXutil.ltrimstr( AV42TFEstCatAIm1, 12, 2));
            AV43TFEstCatAIm1_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFEstCatAIm1_To", GXutil.ltrimstr( AV43TFEstCatAIm1_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATORD0") == 0 )
         {
            AV44TFEstCatOrd0 = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFEstCatOrd0", GXutil.ltrimstr( AV44TFEstCatOrd0, 12, 2));
            AV45TFEstCatOrd0_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFEstCatOrd0_To", GXutil.ltrimstr( AV45TFEstCatOrd0_To, 12, 2));
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, GXv_char4) ;
      testcatww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFArtCod_Sel)==0), AV31TFArtCod_Sel, GXv_char3) ;
      testcatww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFEstCatSer_Sel)==0), AV35TFEstCatSer_Sel, GXv_char2) ;
      testcatww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFEstCatDsc_Sel)==0), AV39TFEstCatDsc_Sel, GXv_char15) ;
      testcatww_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char12+"||"+GXt_char13+"||"+GXt_char14+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFEmprCod)==0), AV26TFEmprCod, GXv_char15) ;
      testcatww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFArtCod)==0), AV30TFArtCod, GXv_char4) ;
      testcatww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFEstCatSer)==0), AV34TFEstCatSer, GXv_char3) ;
      testcatww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFEstCatDsc)==0), AV38TFEstCatDsc, GXv_char2) ;
      testcatww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+((0==AV28TFCliCod) ? "" : GXutil.str( AV28TFCliCod, 6, 0))+"|"+GXt_char13+"|"+((0==AV32TFEstCatAny) ? "" : GXutil.str( AV32TFEstCatAny, 4, 0))+"|"+GXt_char12+"|"+((0==AV36TFEstCatTip) ? "" : GXutil.str( AV36TFEstCatTip, 4, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFEstCatAIm0)==0) ? "" : GXutil.str( AV40TFEstCatAIm0, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFEstCatAIm1)==0) ? "" : GXutil.str( AV42TFEstCatAIm1, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEstCatOrd0)==0) ? "" : GXutil.str( AV44TFEstCatOrd0, 12, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFCliCod_To) ? "" : GXutil.str( AV29TFCliCod_To, 6, 0))+"||"+((0==AV33TFEstCatAny_To) ? "" : GXutil.str( AV33TFEstCatAny_To, 4, 0))+"||"+((0==AV37TFEstCatTip_To) ? "" : GXutil.str( AV37TFEstCatTip_To, 4, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEstCatAIm0_To)==0) ? "" : GXutil.str( AV41TFEstCatAIm0_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFEstCatAIm1_To)==0) ? "" : GXutil.str( AV43TFEstCatAIm1_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFEstCatOrd0_To)==0) ? "" : GXutil.str( AV45TFEstCatOrd0_To, 12, 2)) ;
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
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFEMPRCOD", "", !(GXutil.strcmp("", AV26TFEmprCod)==0), (short)(0), AV26TFEmprCod, "", !(GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLICOD", "", !((0==AV28TFCliCod)&&(0==AV29TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFARTCOD", "", !(GXutil.strcmp("", AV30TFArtCod)==0), (short)(0), AV30TFArtCod, "", !(GXutil.strcmp("", AV31TFArtCod_Sel)==0), AV31TFArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATANY", "", !((0==AV32TFEstCatAny)&&(0==AV33TFEstCatAny_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFEstCatAny, 4, 0)), GXutil.trim( GXutil.str( AV33TFEstCatAny_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATSER", "", !(GXutil.strcmp("", AV34TFEstCatSer)==0), (short)(0), AV34TFEstCatSer, "", !(GXutil.strcmp("", AV35TFEstCatSer_Sel)==0), AV35TFEstCatSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATTIP", "", !((0==AV36TFEstCatTip)&&(0==AV37TFEstCatTip_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFEstCatTip, 4, 0)), GXutil.trim( GXutil.str( AV37TFEstCatTip_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATDSC", "", !(GXutil.strcmp("", AV38TFEstCatDsc)==0), (short)(0), AV38TFEstCatDsc, "", !(GXutil.strcmp("", AV39TFEstCatDsc_Sel)==0), AV39TFEstCatDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATAIM0", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFEstCatAIm0)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEstCatAIm0_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFEstCatAIm0, 12, 2)), GXutil.trim( GXutil.str( AV41TFEstCatAIm0_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATAIM1", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFEstCatAIm1)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFEstCatAIm1_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFEstCatAIm1, 12, 2)), GXutil.trim( GXutil.str( AV43TFEstCatAIm1_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFESTCATORD0", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEstCatOrd0)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFEstCatOrd0_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFEstCatOrd0, 12, 2)), GXutil.trim( GXutil.str( AV45TFEstCatOrd0_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
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
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TESTCAT" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_2AU2( boolean wbgen )
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
         wb_table2_32_2AU2( true) ;
      }
      else
      {
         wb_table2_32_2AU2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_2AU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_2AU2e( true) ;
      }
      else
      {
         wb_table1_27_2AU2e( false) ;
      }
   }

   public void wb_table2_32_2AU2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TESTCATWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_2AU2e( true) ;
      }
      else
      {
         wb_table2_32_2AU2e( false) ;
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
      pa2AU2( ) ;
      ws2AU2( ) ;
      we2AU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615182", true, true);
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
      httpContext.AddJavascriptSource("testcatww.js", "?20268211615183", false, true);
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
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_idx ;
      edtEstCatAny_Internalname = "ESTCATANY_"+sGXsfl_45_idx ;
      edtEstCatSer_Internalname = "ESTCATSER_"+sGXsfl_45_idx ;
      edtEstCatTip_Internalname = "ESTCATTIP_"+sGXsfl_45_idx ;
      edtEstCatDsc_Internalname = "ESTCATDSC_"+sGXsfl_45_idx ;
      edtEstCatAIm0_Internalname = "ESTCATAIM0_"+sGXsfl_45_idx ;
      edtEstCatAIm1_Internalname = "ESTCATAIM1_"+sGXsfl_45_idx ;
      edtEstCatOrd0_Internalname = "ESTCATORD0_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_fel_idx ;
      edtEstCatAny_Internalname = "ESTCATANY_"+sGXsfl_45_fel_idx ;
      edtEstCatSer_Internalname = "ESTCATSER_"+sGXsfl_45_fel_idx ;
      edtEstCatTip_Internalname = "ESTCATTIP_"+sGXsfl_45_fel_idx ;
      edtEstCatDsc_Internalname = "ESTCATDSC_"+sGXsfl_45_fel_idx ;
      edtEstCatAIm0_Internalname = "ESTCATAIM0_"+sGXsfl_45_fel_idx ;
      edtEstCatAIm1_Internalname = "ESTCATAIM1_"+sGXsfl_45_fel_idx ;
      edtEstCatOrd0_Internalname = "ESTCATORD0_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb2AU0( ) ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV50GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e232au2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstCatAny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatAny_Internalname,GXutil.ltrim( localUtil.ntoc( A5382EstCatAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5382EstCatAny), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatAny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEstCatSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatSer_Internalname,GXutil.rtrim( A5383EstCatSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstCatTip_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatTip_Internalname,GXutil.ltrim( localUtil.ntoc( A5384EstCatTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5384EstCatTip), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatTip_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEstCatDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatDsc_Internalname,GXutil.rtrim( A5385EstCatDsc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtEstCatDsc_Link,"","","",edtEstCatDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstCatAIm0_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatAIm0_Internalname,GXutil.ltrim( localUtil.ntoc( A5386EstCatAIm0, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5386EstCatAIm0, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatAIm0_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatAIm0_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstCatAIm1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatAIm1_Internalname,GXutil.ltrim( localUtil.ntoc( A5387EstCatAIm1, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5387EstCatAIm1, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatAIm1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatAIm1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstCatOrd0_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstCatOrd0_Internalname,GXutil.ltrim( localUtil.ntoc( A5388EstCatOrd0, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5388EstCatOrd0, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstCatOrd0_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstCatOrd0_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2AU2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatAny_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "EstCatAny", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatTip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatAIm0_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatAIm1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstCatOrd0_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5382EstCatAny, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatAny_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5383EstCatSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5384EstCatTip, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatTip_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5385EstCatDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtEstCatDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5386EstCatAIm0, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatAIm0_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5387EstCatAIm1, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatAIm1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5388EstCatOrd0, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstCatOrd0_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtEstCatAny_Internalname = "ESTCATANY" ;
      edtEstCatSer_Internalname = "ESTCATSER" ;
      edtEstCatTip_Internalname = "ESTCATTIP" ;
      edtEstCatDsc_Internalname = "ESTCATDSC" ;
      edtEstCatAIm0_Internalname = "ESTCATAIM0" ;
      edtEstCatAIm1_Internalname = "ESTCATAIM1" ;
      edtEstCatOrd0_Internalname = "ESTCATORD0" ;
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
      edtEstCatOrd0_Jsonclick = "" ;
      edtEstCatAIm1_Jsonclick = "" ;
      edtEstCatAIm0_Jsonclick = "" ;
      edtEstCatDsc_Jsonclick = "" ;
      edtEstCatDsc_Link = "" ;
      edtEstCatTip_Jsonclick = "" ;
      edtEstCatSer_Jsonclick = "" ;
      edtEstCatAny_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtEstCatOrd0_Visible = -1 ;
      edtEstCatAIm1_Visible = -1 ;
      edtEstCatAIm0_Visible = -1 ;
      edtEstCatDsc_Visible = -1 ;
      edtEstCatTip_Visible = -1 ;
      edtEstCatSer_Visible = -1 ;
      edtEstCatAny_Visible = -1 ;
      edtArtCod_Visible = -1 ;
      edtCliCod_Visible = -1 ;
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
      Ddo_grid_Datalistproc = "TESTCATWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic||Dynamic||Dynamic|||" ;
      Ddo_grid_Includedatalist = "T||T||T||T|||" ;
      Ddo_grid_Filterisrange = "|T||T||T||T|T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Numeric|Character|Numeric|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|1|||8" ;
      Ddo_grid_Columnids = "1:EmprCod|2:CliCod|3:ArtCod|4:EstCatAny|5:EstCatSer|6:EstCatTip|7:EstCatDsc|8:EstCatAIm0|9:EstCatAIm1|10:EstCatOrd0" ;
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
      Form.setCaption( httpContext.getMessage( " Estad.Cliente/Serie/T.Articulo", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtEstCatAny_Visible',ctrl:'ESTCATANY',prop:'Visible'},{av:'edtEstCatSer_Visible',ctrl:'ESTCATSER',prop:'Visible'},{av:'edtEstCatTip_Visible',ctrl:'ESTCATTIP',prop:'Visible'},{av:'edtEstCatDsc_Visible',ctrl:'ESTCATDSC',prop:'Visible'},{av:'edtEstCatAIm0_Visible',ctrl:'ESTCATAIM0',prop:'Visible'},{av:'edtEstCatAIm1_Visible',ctrl:'ESTCATAIM1',prop:'Visible'},{av:'edtEstCatOrd0_Visible',ctrl:'ESTCATORD0',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122AU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132AU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142AU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222AU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A5382EstCatAny',fld:'ESTCATANY',pic:'ZZZ9',hsh:true},{av:'A5383EstCatSer',fld:'ESTCATSER',pic:'',hsh:true},{av:'A5384EstCatTip',fld:'ESTCATTIP',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtEstCatDsc_Link',ctrl:'ESTCATDSC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152AU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtEstCatAny_Visible',ctrl:'ESTCATANY',prop:'Visible'},{av:'edtEstCatSer_Visible',ctrl:'ESTCATSER',prop:'Visible'},{av:'edtEstCatTip_Visible',ctrl:'ESTCATTIP',prop:'Visible'},{av:'edtEstCatDsc_Visible',ctrl:'ESTCATDSC',prop:'Visible'},{av:'edtEstCatAIm0_Visible',ctrl:'ESTCATAIM0',prop:'Visible'},{av:'edtEstCatAIm1_Visible',ctrl:'ESTCATAIM1',prop:'Visible'},{av:'edtEstCatOrd0_Visible',ctrl:'ESTCATORD0',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112AU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtEstCatAny_Visible',ctrl:'ESTCATANY',prop:'Visible'},{av:'edtEstCatSer_Visible',ctrl:'ESTCATSER',prop:'Visible'},{av:'edtEstCatTip_Visible',ctrl:'ESTCATTIP',prop:'Visible'},{av:'edtEstCatDsc_Visible',ctrl:'ESTCATDSC',prop:'Visible'},{av:'edtEstCatAIm0_Visible',ctrl:'ESTCATAIM0',prop:'Visible'},{av:'edtEstCatAIm1_Visible',ctrl:'ESTCATAIM1',prop:'Visible'},{av:'edtEstCatOrd0_Visible',ctrl:'ESTCATORD0',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232AU2',iparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A5382EstCatAny',fld:'ESTCATANY',pic:'ZZZ9',hsh:true},{av:'A5383EstCatSer',fld:'ESTCATSER',pic:'',hsh:true},{av:'A5384EstCatTip',fld:'ESTCATTIP',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e162AU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'A5382EstCatAny',fld:'ESTCATANY',pic:'ZZZ9',hsh:true},{av:'A5383EstCatSer',fld:'ESTCATSER',pic:'',hsh:true},{av:'A5384EstCatTip',fld:'ESTCATTIP',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e172AU2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e182AU2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192AU2',iparms:[{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV31TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFEstCatAny',fld:'vTFESTCATANY',pic:'ZZZ9'},{av:'AV33TFEstCatAny_To',fld:'vTFESTCATANY_TO',pic:'ZZZ9'},{av:'AV34TFEstCatSer',fld:'vTFESTCATSER',pic:''},{av:'AV35TFEstCatSer_Sel',fld:'vTFESTCATSER_SEL',pic:''},{av:'AV36TFEstCatTip',fld:'vTFESTCATTIP',pic:'ZZZ9'},{av:'AV37TFEstCatTip_To',fld:'vTFESTCATTIP_TO',pic:'ZZZ9'},{av:'AV38TFEstCatDsc',fld:'vTFESTCATDSC',pic:''},{av:'AV39TFEstCatDsc_Sel',fld:'vTFESTCATDSC_SEL',pic:''},{av:'AV40TFEstCatAIm0',fld:'vTFESTCATAIM0',pic:'ZZZZZZZZ9.99'},{av:'AV41TFEstCatAIm0_To',fld:'vTFESTCATAIM0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV42TFEstCatAIm1',fld:'vTFESTCATAIM1',pic:'ZZZZZZZZ9.99'},{av:'AV43TFEstCatAIm1_To',fld:'vTFESTCATAIM1_TO',pic:'ZZZZZZZZ9.99'},{av:'AV44TFEstCatOrd0',fld:'vTFESTCATORD0',pic:'ZZZZZZZZ9.99'},{av:'AV45TFEstCatOrd0_To',fld:'vTFESTCATORD0_TO',pic:'ZZZZZZZZ9.99'},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTCATANY","{handler:'valid_Estcatany',iparms:[]");
      setEventMetadata("VALID_ESTCATANY",",oparms:[]}");
      setEventMetadata("VALID_ESTCATSER","{handler:'valid_Estcatser',iparms:[]");
      setEventMetadata("VALID_ESTCATSER",",oparms:[]}");
      setEventMetadata("VALID_ESTCATTIP","{handler:'valid_Estcattip',iparms:[]");
      setEventMetadata("VALID_ESTCATTIP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estcatord0',iparms:[]");
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
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFEmprCod = "" ;
      AV27TFEmprCod_Sel = "" ;
      AV30TFArtCod = "" ;
      AV31TFArtCod_Sel = "" ;
      AV34TFEstCatSer = "" ;
      AV35TFEstCatSer_Sel = "" ;
      AV38TFEstCatDsc = "" ;
      AV39TFEstCatDsc_Sel = "" ;
      AV40TFEstCatAIm0 = DecimalUtil.ZERO ;
      AV41TFEstCatAIm0_To = DecimalUtil.ZERO ;
      AV42TFEstCatAIm1 = DecimalUtil.ZERO ;
      AV43TFEstCatAIm1_To = DecimalUtil.ZERO ;
      AV44TFEstCatOrd0 = DecimalUtil.ZERO ;
      AV45TFEstCatOrd0_To = DecimalUtil.ZERO ;
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
      A65ArtCod = "" ;
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      A5386EstCatAIm0 = DecimalUtil.ZERO ;
      A5387EstCatAIm1 = DecimalUtil.ZERO ;
      A5388EstCatOrd0 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV58Testcatwwds_1_filterfulltext = "" ;
      lV59Testcatwwds_2_tfemprcod = "" ;
      lV63Testcatwwds_6_tfartcod = "" ;
      lV67Testcatwwds_10_tfestcatser = "" ;
      lV71Testcatwwds_14_tfestcatdsc = "" ;
      AV58Testcatwwds_1_filterfulltext = "" ;
      AV60Testcatwwds_3_tfemprcod_sel = "" ;
      AV59Testcatwwds_2_tfemprcod = "" ;
      AV64Testcatwwds_7_tfartcod_sel = "" ;
      AV63Testcatwwds_6_tfartcod = "" ;
      AV68Testcatwwds_11_tfestcatser_sel = "" ;
      AV67Testcatwwds_10_tfestcatser = "" ;
      AV72Testcatwwds_15_tfestcatdsc_sel = "" ;
      AV71Testcatwwds_14_tfestcatdsc = "" ;
      AV73Testcatwwds_16_tfestcataim0 = DecimalUtil.ZERO ;
      AV74Testcatwwds_17_tfestcataim0_to = DecimalUtil.ZERO ;
      AV75Testcatwwds_18_tfestcataim1 = DecimalUtil.ZERO ;
      AV76Testcatwwds_19_tfestcataim1_to = DecimalUtil.ZERO ;
      AV77Testcatwwds_20_tfestcatord0 = DecimalUtil.ZERO ;
      AV78Testcatwwds_21_tfestcatord0_to = DecimalUtil.ZERO ;
      H02AU3_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AU3_n5388EstCatOrd0 = new boolean[] {false} ;
      H02AU3_A5385EstCatDsc = new String[] {""} ;
      H02AU3_n5385EstCatDsc = new boolean[] {false} ;
      H02AU3_A5384EstCatTip = new short[1] ;
      H02AU3_A5383EstCatSer = new String[] {""} ;
      H02AU3_A5382EstCatAny = new short[1] ;
      H02AU3_A65ArtCod = new String[] {""} ;
      H02AU3_A252CliCod = new int[1] ;
      H02AU3_A396EmprCod = new String[] {""} ;
      H02AU3_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AU3_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AU5_AGRID_nRecordCount = new long[1] ;
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcatww__default(),
         new Object[] {
             new Object[] {
            H02AU3_A5388EstCatOrd0, H02AU3_n5388EstCatOrd0, H02AU3_A5385EstCatDsc, H02AU3_n5385EstCatDsc, H02AU3_A5384EstCatTip, H02AU3_A5383EstCatSer, H02AU3_A5382EstCatAny, H02AU3_A65ArtCod, H02AU3_A252CliCod, H02AU3_A396EmprCod,
            H02AU3_A5387EstCatAIm1, H02AU3_A5386EstCatAIm0
            }
            , new Object[] {
            H02AU5_AGRID_nRecordCount
            }
         }
      );
      AV53Pgmname = "TESTCATWW" ;
      /* GeneXus formulas. */
      AV53Pgmname = "TESTCATWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short AV32TFEstCatAny ;
   private short AV33TFEstCatAny_To ;
   private short AV36TFEstCatTip ;
   private short AV37TFEstCatTip_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV50GridActions ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65Testcatwwds_8_tfestcatany ;
   private short AV66Testcatwwds_9_tfestcatany_to ;
   private short AV69Testcatwwds_12_tfestcattip ;
   private short AV70Testcatwwds_13_tfestcattip_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV28TFCliCod ;
   private int AV29TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV61Testcatwwds_4_tfclicod ;
   private int AV62Testcatwwds_5_tfclicod_to ;
   private int edtEmprCod_Visible ;
   private int edtCliCod_Visible ;
   private int edtArtCod_Visible ;
   private int edtEstCatAny_Visible ;
   private int edtEstCatSer_Visible ;
   private int edtEstCatTip_Visible ;
   private int edtEstCatDsc_Visible ;
   private int edtEstCatAIm0_Visible ;
   private int edtEstCatAIm1_Visible ;
   private int edtEstCatOrd0_Visible ;
   private int AV47PageToGo ;
   private int AV79GXV1 ;
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
   private java.math.BigDecimal AV40TFEstCatAIm0 ;
   private java.math.BigDecimal AV41TFEstCatAIm0_To ;
   private java.math.BigDecimal AV42TFEstCatAIm1 ;
   private java.math.BigDecimal AV43TFEstCatAIm1_To ;
   private java.math.BigDecimal AV44TFEstCatOrd0 ;
   private java.math.BigDecimal AV45TFEstCatOrd0_To ;
   private java.math.BigDecimal A5386EstCatAIm0 ;
   private java.math.BigDecimal A5387EstCatAIm1 ;
   private java.math.BigDecimal A5388EstCatOrd0 ;
   private java.math.BigDecimal AV73Testcatwwds_16_tfestcataim0 ;
   private java.math.BigDecimal AV74Testcatwwds_17_tfestcataim0_to ;
   private java.math.BigDecimal AV75Testcatwwds_18_tfestcataim1 ;
   private java.math.BigDecimal AV76Testcatwwds_19_tfestcataim1_to ;
   private java.math.BigDecimal AV77Testcatwwds_20_tfestcatord0 ;
   private java.math.BigDecimal AV78Testcatwwds_21_tfestcatord0_to ;
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
   private String AV30TFArtCod ;
   private String AV31TFArtCod_Sel ;
   private String AV34TFEstCatSer ;
   private String AV35TFEstCatSer_Sel ;
   private String AV38TFEstCatDsc ;
   private String AV39TFEstCatDsc_Sel ;
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
   private String edtCliCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Internalname ;
   private String edtEstCatAny_Internalname ;
   private String A5383EstCatSer ;
   private String edtEstCatSer_Internalname ;
   private String edtEstCatTip_Internalname ;
   private String A5385EstCatDsc ;
   private String edtEstCatDsc_Internalname ;
   private String edtEstCatAIm0_Internalname ;
   private String edtEstCatAIm1_Internalname ;
   private String edtEstCatOrd0_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV59Testcatwwds_2_tfemprcod ;
   private String lV63Testcatwwds_6_tfartcod ;
   private String lV67Testcatwwds_10_tfestcatser ;
   private String lV71Testcatwwds_14_tfestcatdsc ;
   private String AV60Testcatwwds_3_tfemprcod_sel ;
   private String AV59Testcatwwds_2_tfemprcod ;
   private String AV64Testcatwwds_7_tfartcod_sel ;
   private String AV63Testcatwwds_6_tfartcod ;
   private String AV68Testcatwwds_11_tfestcatser_sel ;
   private String AV67Testcatwwds_10_tfestcatser ;
   private String AV72Testcatwwds_15_tfestcatdsc_sel ;
   private String AV71Testcatwwds_14_tfestcatdsc ;
   private String hsh ;
   private String AV54Station ;
   private String AV55Emprcod ;
   private String AV56Emprnom ;
   private String AV57Usurcod ;
   private String edtEstCatDsc_Link ;
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
   private String edtCliCod_Jsonclick ;
   private String edtArtCod_Jsonclick ;
   private String edtEstCatAny_Jsonclick ;
   private String edtEstCatSer_Jsonclick ;
   private String edtEstCatTip_Jsonclick ;
   private String edtEstCatDsc_Jsonclick ;
   private String edtEstCatAIm0_Jsonclick ;
   private String edtEstCatAIm1_Jsonclick ;
   private String edtEstCatOrd0_Jsonclick ;
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
   private boolean n5385EstCatDsc ;
   private boolean n5388EstCatOrd0 ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV58Testcatwwds_1_filterfulltext ;
   private String AV58Testcatwwds_1_filterfulltext ;
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
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H02AU3_A5388EstCatOrd0 ;
   private boolean[] H02AU3_n5388EstCatOrd0 ;
   private String[] H02AU3_A5385EstCatDsc ;
   private boolean[] H02AU3_n5385EstCatDsc ;
   private short[] H02AU3_A5384EstCatTip ;
   private String[] H02AU3_A5383EstCatSer ;
   private short[] H02AU3_A5382EstCatAny ;
   private String[] H02AU3_A65ArtCod ;
   private int[] H02AU3_A252CliCod ;
   private String[] H02AU3_A396EmprCod ;
   private java.math.BigDecimal[] H02AU3_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] H02AU3_A5386EstCatAIm0 ;
   private long[] H02AU5_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class testcatww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02AU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Testcatwwds_1_filterfulltext ,
                                          String AV60Testcatwwds_3_tfemprcod_sel ,
                                          String AV59Testcatwwds_2_tfemprcod ,
                                          int AV61Testcatwwds_4_tfclicod ,
                                          int AV62Testcatwwds_5_tfclicod_to ,
                                          String AV64Testcatwwds_7_tfartcod_sel ,
                                          String AV63Testcatwwds_6_tfartcod ,
                                          short AV65Testcatwwds_8_tfestcatany ,
                                          short AV66Testcatwwds_9_tfestcatany_to ,
                                          String AV68Testcatwwds_11_tfestcatser_sel ,
                                          String AV67Testcatwwds_10_tfestcatser ,
                                          short AV69Testcatwwds_12_tfestcattip ,
                                          short AV70Testcatwwds_13_tfestcattip_to ,
                                          String AV72Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV71Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV73Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV74Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV75Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV76Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV77Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV78Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[35];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE( T2.EstCatAIm0," ;
      sSelectString += " 0) AS EstCatAIm0" ;
      sFromString = " FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0) AS EstCatAIm0 FROM" ;
      sFromString += " TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod" ;
      sFromString += " AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV58Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV59Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV67Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV69Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV70Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstCatDsc" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstCatDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstCatAny" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstCatAny DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstCatSer" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstCatSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstCatTip" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstCatTip DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstCatOrd0" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstCatOrd0 DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.EstCatAny, T1.EstCatSer, T1.EstCatTip" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H02AU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Testcatwwds_1_filterfulltext ,
                                          String AV60Testcatwwds_3_tfemprcod_sel ,
                                          String AV59Testcatwwds_2_tfemprcod ,
                                          int AV61Testcatwwds_4_tfclicod ,
                                          int AV62Testcatwwds_5_tfclicod_to ,
                                          String AV64Testcatwwds_7_tfartcod_sel ,
                                          String AV63Testcatwwds_6_tfartcod ,
                                          short AV65Testcatwwds_8_tfestcatany ,
                                          short AV66Testcatwwds_9_tfestcatany_to ,
                                          String AV68Testcatwwds_11_tfestcatser_sel ,
                                          String AV67Testcatwwds_10_tfestcatser ,
                                          short AV69Testcatwwds_12_tfestcattip ,
                                          short AV70Testcatwwds_13_tfestcattip_to ,
                                          String AV72Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV71Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV73Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV74Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV75Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV76Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV77Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV78Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[30];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0) AS" ;
      scmdbuf += " EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( (GXutil.strcmp("", AV60Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV59Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV62Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV66Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV67Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV69Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV70Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H02AU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
            case 1 :
                  return conditional_H02AU5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
      }
   }

}

