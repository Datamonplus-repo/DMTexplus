package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidoww_impl extends GXDataArea
{
   public nwdpalmacentejidoww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpalmacentejidoww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejidoww_impl.class ));
   }

   public nwdpalmacentejidoww_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
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
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV62FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV27TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV29TFDisCod = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod"))) ;
      AV30TFDisCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod_To"))) ;
      AV33TFDisDes_Sel = httpContext.GetPar( "TFDisDes_Sel") ;
      AV35TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV36TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV38TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV39TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV41TFDisTotRec = (int)(GXutil.lval( httpContext.GetPar( "TFDisTotRec"))) ;
      AV42TFDisTotRec_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisTotRec_To"))) ;
      AV44TFDisUniMed = httpContext.GetPar( "TFDisUniMed") ;
      AV45TFDisUniMed_Sel = httpContext.GetPar( "TFDisUniMed_Sel") ;
      AV47TFDisLoc = httpContext.GetPar( "TFDisLoc") ;
      AV48TFDisLoc_Sel = httpContext.GetPar( "TFDisLoc_Sel") ;
      AV50TFDisCliNum = httpContext.GetPar( "TFDisCliNum") ;
      AV51TFDisCliNum_Sel = httpContext.GetPar( "TFDisCliNum_Sel") ;
      AV53TFDisCanRec = (short)(GXutil.lval( httpContext.GetPar( "TFDisCanRec"))) ;
      AV54TFDisCanRec_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisCanRec_To"))) ;
      AV90Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      paK72( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startK72( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpalmacentejidoww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV90Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV58GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV59GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV26TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV27TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD", GXutil.ltrim( localUtil.ntoc( AV29TFDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD_TO", GXutil.ltrim( localUtil.ntoc( AV30TFDisCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISDES_SEL", GXutil.rtrim( AV33TFDisDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV35TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV36TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD", GXutil.rtrim( AV38TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD_SEL", GXutil.rtrim( AV39TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTOTREC", GXutil.ltrim( localUtil.ntoc( AV41TFDisTotRec, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTOTREC_TO", GXutil.ltrim( localUtil.ntoc( AV42TFDisTotRec_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED", GXutil.rtrim( AV44TFDisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED_SEL", GXutil.rtrim( AV45TFDisUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISLOC", GXutil.rtrim( AV47TFDisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISLOC_SEL", GXutil.rtrim( AV48TFDisLoc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM", GXutil.rtrim( AV50TFDisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM_SEL", GXutil.rtrim( AV51TFDisCliNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCANREC", GXutil.ltrim( localUtil.ntoc( AV53TFDisCanRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCANREC_TO", GXutil.ltrim( localUtil.ntoc( AV54TFDisCanRec_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV90Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV90Pgmname, ""))));
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
         weK72( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtK72( ) ;
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
      return formatLink("app.nwdpalmacentejidoww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "NwDPAlmacenTejidoWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Nw DPAlmacen Tejido", "") ;
   }

   public void wbK70( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_K72( true) ;
      }
      else
      {
         wb_table1_27_K72( false) ;
      }
      return  ;
   }

   public void wb_table1_27_K72e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV58GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV59GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
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

   public void startK72( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Nw DPAlmacen Tejido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupK70( ) ;
   }

   public void wsK72( )
   {
      startK72( ) ;
      evtK72( ) ;
   }

   public void evtK72( )
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
                           e11K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18K72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19K72 ();
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
                           AV63GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
                           A13733DisTotRec = (int)(localUtil.ctol( httpContext.cgiGet( edtDisTotRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13733DisTotRec = false ;
                           A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
                           A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
                           A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
                           A13732DisCanRec = (short)(localUtil.ctol( httpContext.cgiGet( edtDisCanRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13732DisCanRec = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20K72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21K72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22K72 ();
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

   public void weK72( )
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

   public void paK72( )
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
                                 byte AV24ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 String AV62FilterFullText ,
                                 String AV26TFEmprCod ,
                                 String AV27TFEmprCod_Sel ,
                                 int AV29TFDisCod ,
                                 int AV30TFDisCod_To ,
                                 String AV33TFDisDes_Sel ,
                                 int AV35TFCliCod ,
                                 int AV36TFCliCod_To ,
                                 String AV38TFDisArtCod ,
                                 String AV39TFDisArtCod_Sel ,
                                 int AV41TFDisTotRec ,
                                 int AV42TFDisTotRec_To ,
                                 String AV44TFDisUniMed ,
                                 String AV45TFDisUniMed_Sel ,
                                 String AV47TFDisLoc ,
                                 String AV48TFDisLoc_Sel ,
                                 String AV50TFDisCliNum ,
                                 String AV51TFDisCliNum_Sel ,
                                 short AV53TFDisCanRec ,
                                 short AV54TFDisCanRec_To ,
                                 String AV90Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21K72 ();
      GRID_nCurrentRecord = 0 ;
      rfK72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
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
      rfK72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV90Pgmname = "NwDPAlmacenTejidoWW" ;
      Gx_err = (short)(0) ;
   }

   public void rfK72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21K72 ();
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
                                              AV72Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                              AV71Nwdpalmacentejidowwds_2_tfemprcod ,
                                              Integer.valueOf(AV73Nwdpalmacentejidowwds_4_tfdiscod) ,
                                              Integer.valueOf(AV74Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                              AV75Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                              Integer.valueOf(AV76Nwdpalmacentejidowwds_7_tfclicod) ,
                                              Integer.valueOf(AV77Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                              AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                              AV78Nwdpalmacentejidowwds_9_tfdisartcod ,
                                              Integer.valueOf(AV80Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                              Integer.valueOf(AV81Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                              AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                              AV82Nwdpalmacentejidowwds_13_tfdisunimed ,
                                              AV85Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                              AV84Nwdpalmacentejidowwds_15_tfdisloc ,
                                              AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                              AV86Nwdpalmacentejidowwds_17_tfdisclinum ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) ,
                                              A365DisDes ,
                                              Integer.valueOf(A252CliCod) ,
                                              A335DisArtCod ,
                                              Integer.valueOf(A13733DisTotRec) ,
                                              A392DisUniMed ,
                                              A1430DisLoc ,
                                              A360DisCliNum ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV70Nwdpalmacentejidowwds_1_filterfulltext ,
                                              Short.valueOf(A13732DisCanRec) ,
                                              Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                              Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                              }
         });
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
         lV71Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV71Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
         lV78Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
         lV82Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV82Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
         lV84Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV84Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
         lV86Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
         /* Using cursor H00K74 */
         pr_default.execute(0, new Object[] {AV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV71Nwdpalmacentejidowwds_2_tfemprcod, AV72Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV73Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV74Nwdpalmacentejidowwds_5_tfdiscod_to), AV75Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV76Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV77Nwdpalmacentejidowwds_8_tfclicod_to), lV78Nwdpalmacentejidowwds_9_tfdisartcod, AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV80Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV81Nwdpalmacentejidowwds_12_tfdistotrec_to), lV82Nwdpalmacentejidowwds_13_tfdisunimed, AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV84Nwdpalmacentejidowwds_15_tfdisloc, AV85Nwdpalmacentejidowwds_16_tfdisloc_sel, lV86Nwdpalmacentejidowwds_17_tfdisclinum, AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A360DisCliNum = H00K74_A360DisCliNum[0] ;
            A1430DisLoc = H00K74_A1430DisLoc[0] ;
            A392DisUniMed = H00K74_A392DisUniMed[0] ;
            A335DisArtCod = H00K74_A335DisArtCod[0] ;
            A252CliCod = H00K74_A252CliCod[0] ;
            A365DisDes = H00K74_A365DisDes[0] ;
            A361DisCod = H00K74_A361DisCod[0] ;
            A396EmprCod = H00K74_A396EmprCod[0] ;
            A13732DisCanRec = H00K74_A13732DisCanRec[0] ;
            n13732DisCanRec = H00K74_n13732DisCanRec[0] ;
            A13733DisTotRec = H00K74_A13733DisTotRec[0] ;
            n13733DisTotRec = H00K74_n13733DisTotRec[0] ;
            A13732DisCanRec = H00K74_A13732DisCanRec[0] ;
            n13732DisCanRec = H00K74_n13732DisCanRec[0] ;
            A13733DisTotRec = H00K74_A13733DisTotRec[0] ;
            n13733DisTotRec = H00K74_n13733DisTotRec[0] ;
            e22K72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wbK70( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesK72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV90Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV90Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
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
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV72Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV71Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV73Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV74Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV75Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV76Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV77Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV78Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV80Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV81Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV82Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV85Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV84Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV86Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV70Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV71Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV71Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV78Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV78Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV82Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV82Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV84Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV84Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV86Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor H00K77 */
      pr_default.execute(1, new Object[] {AV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, lV70Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV88Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV71Nwdpalmacentejidowwds_2_tfemprcod, AV72Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV73Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV74Nwdpalmacentejidowwds_5_tfdiscod_to), AV75Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV76Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV77Nwdpalmacentejidowwds_8_tfclicod_to), lV78Nwdpalmacentejidowwds_9_tfdisartcod, AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV80Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV81Nwdpalmacentejidowwds_12_tfdistotrec_to), lV82Nwdpalmacentejidowwds_13_tfdisunimed, AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV84Nwdpalmacentejidowwds_15_tfdisloc, AV85Nwdpalmacentejidowwds_16_tfdisloc_sel, lV86Nwdpalmacentejidowwds_17_tfdisclinum, AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      GRID_nRecordCount = H00K77_AGRID_nRecordCount[0] ;
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
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV62FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV29TFDisCod, AV30TFDisCod_To, AV33TFDisDes_Sel, AV35TFCliCod, AV36TFCliCod_To, AV38TFDisArtCod, AV39TFDisArtCod_Sel, AV41TFDisTotRec, AV42TFDisTotRec_To, AV44TFDisUniMed, AV45TFDisUniMed_Sel, AV47TFDisLoc, AV48TFDisLoc_Sel, AV50TFDisCliNum, AV51TFDisCliNum_Sel, AV53TFDisCanRec, AV54TFDisCanRec_To, AV90Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV90Pgmname = "NwDPAlmacenTejidoWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupK70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20K72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV56DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV59GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV62FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62FilterFullText", AV62FilterFullText);
         /* Read subfile selected row values. */
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
      e20K72 ();
      if (returnInSub) return;
   }

   public void e20K72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV66Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpalmacentejidoww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Station = GXt_char1 ;
      GXv_char2[0] = AV67Emprcod ;
      GXv_char3[0] = AV68Emprnom ;
      GXv_char4[0] = AV69Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpalmacentejidoww_impl.this.AV67Emprcod = GXv_char2[0] ;
      nwdpalmacentejidoww_impl.this.AV68Emprnom = GXv_char3[0] ;
      nwdpalmacentejidoww_impl.this.AV69Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Nw DPAlmacen Tejido", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV56DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV56DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21K72( )
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
      if ( AV24ManageFiltersExecutionStep == 1 )
      {
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV24ManageFiltersExecutionStep == 2 )
      {
         AV24ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("NwDPAlmacenTejidoWWColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("NwDPAlmacenTejidoWWColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      chkDisDes.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Visible", GXutil.ltrimstr( chkDisDes.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisTotRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTotRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTotRec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisUniMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisLoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisLoc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisCliNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisCanRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCanRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCanRec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV58GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridCurrentPage), 10, 0));
      AV59GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridPageCount), 10, 0));
      AV70Nwdpalmacentejidowwds_1_filterfulltext = AV62FilterFullText ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = AV26TFEmprCod ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV73Nwdpalmacentejidowwds_4_tfdiscod = AV29TFDisCod ;
      AV74Nwdpalmacentejidowwds_5_tfdiscod_to = AV30TFDisCod_To ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = AV33TFDisDes_Sel ;
      AV76Nwdpalmacentejidowwds_7_tfclicod = AV35TFCliCod ;
      AV77Nwdpalmacentejidowwds_8_tfclicod_to = AV36TFCliCod_To ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = AV38TFDisArtCod ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV39TFDisArtCod_Sel ;
      AV80Nwdpalmacentejidowwds_11_tfdistotrec = AV41TFDisTotRec ;
      AV81Nwdpalmacentejidowwds_12_tfdistotrec_to = AV42TFDisTotRec_To ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = AV44TFDisUniMed ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV45TFDisUniMed_Sel ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = AV50TFDisCliNum ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV51TFDisCliNum_Sel ;
      AV88Nwdpalmacentejidowwds_19_tfdiscanrec = AV53TFDisCanRec ;
      AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV54TFDisCanRec_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12K72( )
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
         AV57PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV57PageToGo) ;
      }
   }

   public void e13K72( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14K72( )
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
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCod") == 0 )
         {
            AV29TFDisCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFDisCod), 8, 0));
            AV30TFDisCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisDes") == 0 )
         {
            AV33TFDisDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFDisDes_Sel", AV33TFDisDes_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV38TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisArtCod", AV38TFDisArtCod);
            AV39TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFDisArtCod_Sel", AV39TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisTotRec") == 0 )
         {
            AV41TFDisTotRec = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFDisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFDisTotRec), 8, 0));
            AV42TFDisTotRec_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisTotRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFDisTotRec_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUniMed") == 0 )
         {
            AV44TFDisUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisUniMed", AV44TFDisUniMed);
            AV45TFDisUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisUniMed_Sel", AV45TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisLoc") == 0 )
         {
            AV47TFDisLoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisLoc", AV47TFDisLoc);
            AV48TFDisLoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisLoc_Sel", AV48TFDisLoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCliNum") == 0 )
         {
            AV50TFDisCliNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCliNum", AV50TFDisCliNum);
            AV51TFDisCliNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCliNum_Sel", AV51TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCanRec") == 0 )
         {
            AV53TFDisCanRec = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisCanRec), 4, 0));
            AV54TFDisCanRec_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisCanRec_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22K72( )
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
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV63GridActions, 4, 0)) );
   }

   public void e15K72( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "NwDPAlmacenTejidoWWColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11K72( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("NwDPAlmacenTejidoWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV90Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("NwDPAlmacenTejidoWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "NwDPAlmacenTejidoWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         nwdpalmacentejidoww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV10GridState.fromxml(AV23ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e16K72( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.nwdpalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17K72( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV15ExcelFilename ;
      GXv_char3[0] = AV16ErrorMessage ;
      new app.nwdpalmacentejidowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      nwdpalmacentejidoww_impl.this.AV15ExcelFilename = GXv_char4[0] ;
      nwdpalmacentejidoww_impl.this.AV16ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18K72( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.nwdpalmacentejidowwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19K72( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.nwdpalmacentejidowwexportcsv", new String[] {}, new String[] {}) );
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
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Código Empresa", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisDes", "", "Desglose", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisArtCod", "", "Código Artículo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisTotRec", "", "Recepciones", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisUniMed", "", "Unidades Medida", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisLoc", "", "Localizacion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisCliNum", "", "Codigo Disposicion Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "NwDPAlmacenTejidoWWColumnsSelector", GXv_char4) ;
      nwdpalmacentejidoww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "NwDPAlmacenTejidoWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV62FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62FilterFullText", AV62FilterFullText);
      AV26TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
      AV27TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
      AV29TFDisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFDisCod), 8, 0));
      AV30TFDisCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFDisCod_To), 8, 0));
      AV33TFDisDes_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFDisDes_Sel", AV33TFDisDes_Sel);
      AV35TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
      AV36TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
      AV38TFDisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisArtCod", AV38TFDisArtCod);
      AV39TFDisArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFDisArtCod_Sel", AV39TFDisArtCod_Sel);
      AV41TFDisTotRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFDisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFDisTotRec), 8, 0));
      AV42TFDisTotRec_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisTotRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFDisTotRec_To), 8, 0));
      AV44TFDisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisUniMed", AV44TFDisUniMed);
      AV45TFDisUniMed_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisUniMed_Sel", AV45TFDisUniMed_Sel);
      AV47TFDisLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisLoc", AV47TFDisLoc);
      AV48TFDisLoc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisLoc_Sel", AV48TFDisLoc_Sel);
      AV50TFDisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCliNum", AV50TFDisCliNum);
      AV51TFDisCliNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCliNum_Sel", AV51TFDisCliNum_Sel);
      AV53TFDisCanRec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisCanRec), 4, 0));
      AV54TFDisCanRec_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisCanRec_To), 4, 0));
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
      callWebObject(formatLink("app.nwdpalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.nwdpalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV90Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV90Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV90Pgmname+"GridState"), null, null);
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
            AV62FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62FilterFullText", AV62FilterFullText);
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
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV29TFDisCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFDisCod), 8, 0));
            AV30TFDisCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDES_SEL") == 0 )
         {
            AV33TFDisDes_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFDisDes_Sel", AV33TFDisDes_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod), 6, 0));
            AV36TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV38TFDisArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFDisArtCod", AV38TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV39TFDisArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFDisArtCod_Sel", AV39TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTOTREC") == 0 )
         {
            AV41TFDisTotRec = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFDisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFDisTotRec), 8, 0));
            AV42TFDisTotRec_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFDisTotRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFDisTotRec_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV44TFDisUniMed = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFDisUniMed", AV44TFDisUniMed);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV45TFDisUniMed_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisUniMed_Sel", AV45TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC") == 0 )
         {
            AV47TFDisLoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisLoc", AV47TFDisLoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC_SEL") == 0 )
         {
            AV48TFDisLoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisLoc_Sel", AV48TFDisLoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV50TFDisCliNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCliNum", AV50TFDisCliNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV51TFDisCliNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCliNum_Sel", AV51TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV53TFDisCanRec = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisCanRec), 4, 0));
            AV54TFDisCanRec_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisCanRec_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisCanRec_To), 4, 0));
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, GXv_char4) ;
      nwdpalmacentejidoww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFDisDes_Sel)==0), AV33TFDisDes_Sel, GXv_char3) ;
      nwdpalmacentejidoww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFDisArtCod_Sel)==0), AV39TFDisArtCod_Sel, GXv_char2) ;
      nwdpalmacentejidoww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFDisUniMed_Sel)==0), AV45TFDisUniMed_Sel, GXv_char15) ;
      nwdpalmacentejidoww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFDisLoc_Sel)==0), AV48TFDisLoc_Sel, GXv_char17) ;
      nwdpalmacentejidoww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFDisCliNum_Sel)==0), AV51TFDisCliNum_Sel, GXv_char19) ;
      nwdpalmacentejidoww_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char12+"||"+GXt_char13+"||"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFEmprCod)==0), AV26TFEmprCod, GXv_char19) ;
      nwdpalmacentejidoww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFDisArtCod)==0), AV38TFDisArtCod, GXv_char17) ;
      nwdpalmacentejidoww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFDisUniMed)==0), AV44TFDisUniMed, GXv_char15) ;
      nwdpalmacentejidoww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFDisLoc)==0), AV47TFDisLoc, GXv_char4) ;
      nwdpalmacentejidoww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFDisCliNum)==0), AV50TFDisCliNum, GXv_char3) ;
      nwdpalmacentejidoww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char18+"|"+((0==AV29TFDisCod) ? "" : GXutil.str( AV29TFDisCod, 8, 0))+"||"+((0==AV35TFCliCod) ? "" : GXutil.str( AV35TFCliCod, 6, 0))+"|"+GXt_char16+"|"+((0==AV41TFDisTotRec) ? "" : GXutil.str( AV41TFDisTotRec, 8, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+((0==AV53TFDisCanRec) ? "" : GXutil.str( AV53TFDisCanRec, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV30TFDisCod_To) ? "" : GXutil.str( AV30TFDisCod_To, 8, 0))+"||"+((0==AV36TFCliCod_To) ? "" : GXutil.str( AV36TFCliCod_To, 6, 0))+"||"+((0==AV42TFDisTotRec_To) ? "" : GXutil.str( AV42TFDisTotRec_To, 8, 0))+"||||"+((0==AV54TFDisCanRec_To) ? "" : GXutil.str( AV54TFDisCanRec_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV90Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV62FilterFullText)==0), (short)(0), AV62FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFEMPRCOD", "", !(GXutil.strcmp("", AV26TFEmprCod)==0), (short)(0), AV26TFEmprCod, "", !(GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCOD", "", !((0==AV29TFDisCod)&&(0==AV30TFDisCod_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFDisCod, 8, 0)), GXutil.trim( GXutil.str( AV30TFDisCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISDES_SEL", "", !(GXutil.strcmp("", AV33TFDisDes_Sel)==0), (short)(0), AV33TFDisDes_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFCLICOD", "", !((0==AV35TFCliCod)&&(0==AV36TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV36TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISARTCOD", "", !(GXutil.strcmp("", AV38TFDisArtCod)==0), (short)(0), AV38TFDisArtCod, "", !(GXutil.strcmp("", AV39TFDisArtCod_Sel)==0), AV39TFDisArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISTOTREC", "", !((0==AV41TFDisTotRec)&&(0==AV42TFDisTotRec_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFDisTotRec, 8, 0)), GXutil.trim( GXutil.str( AV42TFDisTotRec_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISUNIMED", "", !(GXutil.strcmp("", AV44TFDisUniMed)==0), (short)(0), AV44TFDisUniMed, "", !(GXutil.strcmp("", AV45TFDisUniMed_Sel)==0), AV45TFDisUniMed_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISLOC", "", !(GXutil.strcmp("", AV47TFDisLoc)==0), (short)(0), AV47TFDisLoc, "", !(GXutil.strcmp("", AV48TFDisLoc_Sel)==0), AV48TFDisLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCLINUM", "", !(GXutil.strcmp("", AV50TFDisCliNum)==0), (short)(0), AV50TFDisCliNum, "", !(GXutil.strcmp("", AV51TFDisCliNum_Sel)==0), AV51TFDisCliNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFDISCANREC", "", !((0==AV53TFDisCanRec)&&(0==AV54TFDisCanRec_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFDisCanRec, 4, 0)), GXutil.trim( GXutil.str( AV54TFDisCanRec_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV90Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "NwDPAlmacenTejido" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_K72( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_K72( true) ;
      }
      else
      {
         wb_table2_32_K72( false) ;
      }
      return  ;
   }

   public void wb_table2_32_K72e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_K72e( true) ;
      }
      else
      {
         wb_table1_27_K72e( false) ;
      }
   }

   public void wb_table2_32_K72( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV62FilterFullText, GXutil.rtrim( localUtil.format( AV62FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_NwDPAlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_K72e( true) ;
      }
      else
      {
         wb_table2_32_K72e( false) ;
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
      paK72( ) ;
      wsK72( ) ;
      weK72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211612265", true, true);
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
      httpContext.AddJavascriptSource("nwdpalmacentejidoww.js", "?20268211612265", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_45_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_45_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_45_idx ;
      edtDisTotRec_Internalname = "DISTOTREC_"+sGXsfl_45_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_45_idx ;
      edtDisLoc_Internalname = "DISLOC_"+sGXsfl_45_idx ;
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_45_idx ;
      edtDisCanRec_Internalname = "DISCANREC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_45_fel_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_45_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_45_fel_idx ;
      edtDisTotRec_Internalname = "DISTOTREC_"+sGXsfl_45_fel_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_45_fel_idx ;
      edtDisLoc_Internalname = "DISLOC_"+sGXsfl_45_fel_idx ;
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_45_fel_idx ;
      edtDisCanRec_Internalname = "DISCANREC_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbK70( ) ;
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
               AV63GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV63GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV63GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23k72_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV63GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkDisDes.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "DISDES_" + sGXsfl_45_idx ;
         chkDisDes.setName( GXCCtl );
         chkDisDes.setWebtags( "" );
         chkDisDes.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_45_Refreshing);
         chkDisDes.setCheckedValue( "N" );
         A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisDes.getInternalname(),A365DisDes,"","",Integer.valueOf(chkDisDes.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisTotRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTotRec_Internalname,GXutil.ltrim( localUtil.ntoc( A13733DisTotRec, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13733DisTotRec), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTotRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisTotRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisUniMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisLoc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisLoc_Internalname,GXutil.rtrim( A1430DisLoc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisLoc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisCliNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCliNum_Internalname,GXutil.rtrim( A360DisCliNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCliNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCliNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCanRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCanRec_Internalname,GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCanRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCanRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesK72( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Disposicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkDisDes.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desglose", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisTotRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recepciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisLoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCliNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCanRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reclamaciones", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A365DisDes));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkDisDes.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A335DisArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13733DisTotRec, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisTotRec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1430DisLoc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisLoc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A360DisCliNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCliNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCanRec_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      chkDisDes.setInternalname( "DISDES" );
      edtCliCod_Internalname = "CLICOD" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtDisTotRec_Internalname = "DISTOTREC" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtDisLoc_Internalname = "DISLOC" ;
      edtDisCliNum_Internalname = "DISCLINUM" ;
      edtDisCanRec_Internalname = "DISCANREC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtDisCanRec_Jsonclick = "" ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisLoc_Jsonclick = "" ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisTotRec_Jsonclick = "" ;
      edtDisArtCod_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      chkDisDes.setCaption( "" );
      edtDisCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDisCanRec_Visible = -1 ;
      edtDisCliNum_Visible = -1 ;
      edtDisLoc_Visible = -1 ;
      edtDisUniMed_Visible = -1 ;
      edtDisTotRec_Visible = -1 ;
      edtDisArtCod_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      chkDisDes.setVisible( -1 );
      edtDisCod_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      Ddo_grid_Datalistproc = "NwDPAlmacenTejidoWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||S:WWP_TSChecked,N:WWP_TSUnChecked|||||||" ;
      Ddo_grid_Datalisttype = "Dynamic||FixedValues||Dynamic||Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T||T||T||T|T|T|" ;
      Ddo_grid_Filterisrange = "|T||T||T||||T" ;
      Ddo_grid_Filtertype = "Character|Numeric||Numeric|Character|Numeric|Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T|T||T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T|T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5||6|7|8|" ;
      Ddo_grid_Columnids = "1:EmprCod|2:DisCod|3:DisDes|4:CliCod|5:DisArtCod|6:DisTotRec|7:DisUniMed|8:DisLoc|9:DisCliNum|10:DisCanRec" ;
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
      Form.setCaption( httpContext.getMessage( " Nw DPAlmacen Tejido", "") );
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
         AV63GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV63GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GridActions), 4, 0));
      }
      GXCCtl = "DISDES_" + sGXsfl_45_idx ;
      chkDisDes.setName( GXCCtl );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_45_Refreshing);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'chkDisDes.getVisible()',ctrl:'DISDES',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisTotRec_Visible',ctrl:'DISTOTREC',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisLoc_Visible',ctrl:'DISLOC',prop:'Visible'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22K72',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'chkDisDes.getVisible()',ctrl:'DISDES',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisTotRec_Visible',ctrl:'DISTOTREC',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisLoc_Visible',ctrl:'DISLOC',prop:'Visible'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11K72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'chkDisDes.getVisible()',ctrl:'DISDES',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisTotRec_Visible',ctrl:'DISTOTREC',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisLoc_Visible',ctrl:'DISLOC',prop:'Visible'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisCanRec_Visible',ctrl:'DISCANREC',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23K72',iparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV63GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16K72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17K72',iparms:[{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18K72',iparms:[{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19K72',iparms:[{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV30TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFDisDes_Sel',fld:'vTFDISDES_SEL',pic:'@!'},{av:'AV35TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV36TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV38TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV39TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV41TFDisTotRec',fld:'vTFDISTOTREC',pic:'ZZZZZZZ9'},{av:'AV42TFDisTotRec_To',fld:'vTFDISTOTREC_TO',pic:'ZZZZZZZ9'},{av:'AV44TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV45TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV47TFDisLoc',fld:'vTFDISLOC',pic:''},{av:'AV48TFDisLoc_Sel',fld:'vTFDISLOC_SEL',pic:''},{av:'AV50TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV51TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV53TFDisCanRec',fld:'vTFDISCANREC',pic:'ZZZ9'},{av:'AV54TFDisCanRec_To',fld:'vTFDISCANREC_TO',pic:'ZZZ9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Discanrec',iparms:[]");
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
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV26TFEmprCod = "" ;
      AV27TFEmprCod_Sel = "" ;
      AV33TFDisDes_Sel = "" ;
      AV38TFDisArtCod = "" ;
      AV39TFDisArtCod_Sel = "" ;
      AV44TFDisUniMed = "" ;
      AV45TFDisUniMed_Sel = "" ;
      AV47TFDisLoc = "" ;
      AV48TFDisLoc_Sel = "" ;
      AV50TFDisCliNum = "" ;
      AV51TFDisCliNum_Sel = "" ;
      AV90Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV56DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      scmdbuf = "" ;
      lV70Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      lV71Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      lV78Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      lV82Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      lV84Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      lV86Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV72Nwdpalmacentejidowwds_3_tfemprcod_sel = "" ;
      AV71Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      AV75Nwdpalmacentejidowwds_6_tfdisdes_sel = "" ;
      AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel = "" ;
      AV78Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel = "" ;
      AV82Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      AV85Nwdpalmacentejidowwds_16_tfdisloc_sel = "" ;
      AV84Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel = "" ;
      AV86Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV70Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      H00K74_A360DisCliNum = new String[] {""} ;
      H00K74_A1430DisLoc = new String[] {""} ;
      H00K74_A392DisUniMed = new String[] {""} ;
      H00K74_A335DisArtCod = new String[] {""} ;
      H00K74_A252CliCod = new int[1] ;
      H00K74_A365DisDes = new String[] {""} ;
      H00K74_A361DisCod = new int[1] ;
      H00K74_A396EmprCod = new String[] {""} ;
      H00K74_A13732DisCanRec = new short[1] ;
      H00K74_n13732DisCanRec = new boolean[] {false} ;
      H00K74_A13733DisTotRec = new int[1] ;
      H00K74_n13733DisTotRec = new boolean[] {false} ;
      H00K77_AGRID_nRecordCount = new long[1] ;
      AV66Station = "" ;
      AV67Emprcod = "" ;
      AV68Emprnom = "" ;
      AV69Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidoww__default(),
         new Object[] {
             new Object[] {
            H00K74_A360DisCliNum, H00K74_A1430DisLoc, H00K74_A392DisUniMed, H00K74_A335DisArtCod, H00K74_A252CliCod, H00K74_A365DisDes, H00K74_A361DisCod, H00K74_A396EmprCod, H00K74_A13732DisCanRec, H00K74_n13732DisCanRec,
            H00K74_A13733DisTotRec, H00K74_n13733DisTotRec
            }
            , new Object[] {
            H00K77_AGRID_nRecordCount
            }
         }
      );
      AV90Pgmname = "NwDPAlmacenTejidoWW" ;
      /* GeneXus formulas. */
      AV90Pgmname = "NwDPAlmacenTejidoWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV24ManageFiltersExecutionStep ;
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
   private short AV53TFDisCanRec ;
   private short AV54TFDisCanRec_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV63GridActions ;
   private short A13732DisCanRec ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV88Nwdpalmacentejidowwds_19_tfdiscanrec ;
   private short AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV29TFDisCod ;
   private int AV30TFDisCod_To ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV41TFDisTotRec ;
   private int AV42TFDisTotRec_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A13733DisTotRec ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV73Nwdpalmacentejidowwds_4_tfdiscod ;
   private int AV74Nwdpalmacentejidowwds_5_tfdiscod_to ;
   private int AV76Nwdpalmacentejidowwds_7_tfclicod ;
   private int AV77Nwdpalmacentejidowwds_8_tfclicod_to ;
   private int AV80Nwdpalmacentejidowwds_11_tfdistotrec ;
   private int AV81Nwdpalmacentejidowwds_12_tfdistotrec_to ;
   private int edtEmprCod_Visible ;
   private int edtDisCod_Visible ;
   private int edtCliCod_Visible ;
   private int edtDisArtCod_Visible ;
   private int edtDisTotRec_Visible ;
   private int edtDisUniMed_Visible ;
   private int edtDisLoc_Visible ;
   private int edtDisCliNum_Visible ;
   private int edtDisCanRec_Visible ;
   private int AV57PageToGo ;
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
   private long AV58GridCurrentPage ;
   private long AV59GridPageCount ;
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
   private String AV33TFDisDes_Sel ;
   private String AV38TFDisArtCod ;
   private String AV39TFDisArtCod_Sel ;
   private String AV44TFDisUniMed ;
   private String AV45TFDisUniMed_Sel ;
   private String AV47TFDisLoc ;
   private String AV48TFDisLoc_Sel ;
   private String AV50TFDisCliNum ;
   private String AV51TFDisCliNum_Sel ;
   private String AV90Pgmname ;
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
   private String edtDisCod_Internalname ;
   private String A365DisDes ;
   private String edtCliCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Internalname ;
   private String edtDisTotRec_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Internalname ;
   private String edtDisCanRec_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV71Nwdpalmacentejidowwds_2_tfemprcod ;
   private String lV78Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String lV82Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String lV84Nwdpalmacentejidowwds_15_tfdisloc ;
   private String lV86Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV72Nwdpalmacentejidowwds_3_tfemprcod_sel ;
   private String AV71Nwdpalmacentejidowwds_2_tfemprcod ;
   private String AV75Nwdpalmacentejidowwds_6_tfdisdes_sel ;
   private String AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel ;
   private String AV78Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel ;
   private String AV82Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String AV85Nwdpalmacentejidowwds_16_tfdisloc_sel ;
   private String AV84Nwdpalmacentejidowwds_15_tfdisloc ;
   private String AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel ;
   private String AV86Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV66Station ;
   private String AV67Emprcod ;
   private String AV68Emprnom ;
   private String AV69Usurcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String edtDisCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisTotRec_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String edtDisLoc_Jsonclick ;
   private String edtDisCliNum_Jsonclick ;
   private String edtDisCanRec_Jsonclick ;
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
   private boolean n13733DisTotRec ;
   private boolean n13732DisCanRec ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV18UserCustomValue ;
   private String AV62FilterFullText ;
   private String lV70Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV70Nwdpalmacentejidowwds_1_filterfulltext ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkDisDes ;
   private IDataStoreProvider pr_default ;
   private String[] H00K74_A360DisCliNum ;
   private String[] H00K74_A1430DisLoc ;
   private String[] H00K74_A392DisUniMed ;
   private String[] H00K74_A335DisArtCod ;
   private int[] H00K74_A252CliCod ;
   private String[] H00K74_A365DisDes ;
   private int[] H00K74_A361DisCod ;
   private String[] H00K74_A396EmprCod ;
   private short[] H00K74_A13732DisCanRec ;
   private boolean[] H00K74_n13732DisCanRec ;
   private int[] H00K74_A13733DisTotRec ;
   private boolean[] H00K74_n13733DisTotRec ;
   private long[] H00K77_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV56DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class nwdpalmacentejidoww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00K74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV72Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV71Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV73Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV74Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV75Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV76Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV77Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV78Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV80Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV81Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV82Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV85Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV84Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV86Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV88Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[36];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      sSelectString += " 0) AS DisTotRec" ;
      sFromString = " FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod" ;
      sFromString += " = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT COUNT(*) AS" ;
      sFromString += " DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (0==AV74Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV77Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV84Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisDes" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisDes DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisLoc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisLoc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H00K77( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV72Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV71Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV73Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV74Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV75Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV76Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV77Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV78Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV80Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV81Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV82Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV85Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV84Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV86Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV88Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV89Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[31];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV74Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV77Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(T3.DisTotRec >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(T3.DisTotRec <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV82Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV84Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
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
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H00K74(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
            case 1 :
                  return conditional_H00K77(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00K74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K77", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               return;
      }
   }

}

