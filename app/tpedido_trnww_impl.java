package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedido_trnww_impl extends GXDataArea
{
   public tpedido_trnww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedido_trnww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedido_trnww_impl.class ));
   }

   public tpedido_trnww_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPedsit = new HTMLChoice();
      cmbavGrupodeacciones = new HTMLChoice();
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
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
      cmbavPedsit.fromJSonString( httpContext.GetNextPar( ));
      AV15PedSit = httpContext.GetPar( "PedSit") ;
      AV16FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV30TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV31TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV32TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV33TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV34TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV35TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV36TFPedFec = localUtil.parseDateParm( httpContext.GetPar( "TFPedFec")) ;
      AV37TFPedFec_To = localUtil.parseDateParm( httpContext.GetPar( "TFPedFec_To")) ;
      AV40TFPedFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFPedFecEnt")) ;
      AV56Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A669PedUni = CommonUtil.decimalVal( httpContext.GetPar( "PedUni"), ".") ;
      A657PedCanEnt = CommonUtil.decimalVal( httpContext.GetPar( "PedCanEnt"), ".") ;
      AV53Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
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
      pa1YR2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1YR2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tpedido_trnww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPEDIDO_TrnWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpedido_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPEDSIT", GXutil.rtrim( AV15PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV16FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV30TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV32TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV33TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM", GXutil.rtrim( AV34TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVNOM_SEL", GXutil.rtrim( AV35TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDFEC", localUtil.dtoc( AV36TFPedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDFEC_TO", localUtil.dtoc( AV37TFPedFec_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDFECENT", localUtil.dtoc( AV40TFPedFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANENT", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV53Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDTOT", GXutil.ltrim( localUtil.ntoc( A668PedTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         we1YR2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1YR2( ) ;
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
      return formatLink("app.tpedido_trnww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPEDIDO_TrnWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Orden de compra de Quimicos", "") ;
   }

   public void wb1YR0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1YR2( true) ;
      }
      else
      {
         wb_table1_25_1YR2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1YR2e( boolean wbgen )
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
         startgridcontrol47( ) ;
      }
      if ( wbEnd == 47 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_47 = (int)(nGXsfl_47_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_TrnWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_74_1YR2( true) ;
      }
      else
      {
         wb_table2_74_1YR2( false) ;
      }
      return  ;
   }

   public void wb_table2_74_1YR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pedfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pedfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pedfecauxdate_Internalname, localUtil.format(AV38DDO_PedFecAuxDate, "99/99/99"), localUtil.format( AV38DDO_PedFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pedfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pedfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDIDO_TrnWW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pedfecauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pedfecauxdateto_Internalname, localUtil.format(AV39DDO_PedFecAuxDateTo, "99/99/99"), localUtil.format( AV39DDO_PedFecAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pedfecauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pedfecauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDIDO_TrnWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pedfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pedfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pedfecentauxdate_Internalname, localUtil.format(AV42DDO_PedFecEntAuxDate, "99/99/99"), localUtil.format( AV42DDO_PedFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pedfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pedfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDIDO_TrnWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 47 )
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

   public void start1YR2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Orden de compra de Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1YR0( ) ;
   }

   public void ws1YR2( )
   {
      start1YR2( ) ;
      evt1YR2( ) ;
   }

   public void evt1YR2( )
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
                           e111YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e171YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e181YR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e191YR2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_47_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_472( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV49Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Grupodeacciones), 4, 0));
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A661PedFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPedFec_Internalname), 0)) ;
                           A662PedFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPedFecEnt_Internalname), 0)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedcant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCANT");
                              GX_FocusControl = edtavPedcant_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17PedCant = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPedcant_Internalname, GXutil.ltrimstr( AV17PedCant, 9, 2));
                           }
                           else
                           {
                              AV17PedCant = localUtil.ctond( httpContext.cgiGet( edtavPedcant_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPedcant_Internalname, GXutil.ltrimstr( AV17PedCant, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCANENT");
                              GX_FocusControl = edtavPedcanent_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18PedCanEnt = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV18PedCanEnt, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT"+"_"+sGXsfl_47_idx, getSecureSignedToken( sGXsfl_47_idx, localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
                           }
                           else
                           {
                              AV18PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV18PedCanEnt, 9, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT"+"_"+sGXsfl_47_idx, getSecureSignedToken( sGXsfl_47_idx, localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
                           }
                           AV19PedSitGrid = httpContext.cgiGet( edtavPedsitgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPedsitgrid_Internalname, AV19PedSitGrid);
                           A667PedSit = GXutil.upper( httpContext.cgiGet( edtPedSit_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201YR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211YR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221YR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231YR2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Pedsit Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPEDSIT"), AV15PedSit) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV16FilterFullText) != 0 )
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

   public void we1YR2( )
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

   public void pa1YR2( )
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
            GX_FocusControl = cmbavPedsit.getInternalname() ;
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
      subsflControlProps_472( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         sendrow_472( ) ;
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15PedSit ,
                                 String AV16FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 int AV30TFPedCod ,
                                 int AV31TFPedCod_To ,
                                 int AV32TFPrvNum ,
                                 int AV33TFPrvNum_To ,
                                 String AV34TFPrvNom ,
                                 String AV35TFPrvNom_Sel ,
                                 java.util.Date AV36TFPedFec ,
                                 java.util.Date AV37TFPedFec_To ,
                                 java.util.Date AV40TFPedFecEnt ,
                                 String AV56Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal A669PedUni ,
                                 java.math.BigDecimal A657PedCanEnt ,
                                 short AV53Moda21 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211YR2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YR2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPEDIDO_TrnWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpedido_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT", getSecureSignedToken( "", localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCANENT", GXutil.ltrim( localUtil.ntoc( AV18PedCanEnt, (byte)(9), (byte)(2), ".", "")));
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
      if ( cmbavPedsit.getItemCount() > 0 )
      {
         AV15PedSit = cmbavPedsit.getValidValue(AV15PedSit) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1YR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "TPEDIDO_TrnWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavPedcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcant_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedcanent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcanent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcanent_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedsitgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedsitgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedsitgrid_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(47) ;
      /* Execute user event: Refresh */
      e211YR2 ();
      nGXsfl_47_idx = 1 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
      bGXsfl_47_Refreshing = true ;
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
         subsflControlProps_472( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV58Tpedido_trnwwds_1_pedsit ,
                                              AV59Tpedido_trnwwds_2_filterfulltext ,
                                              Integer.valueOf(AV60Tpedido_trnwwds_3_tfpedcod) ,
                                              Integer.valueOf(AV61Tpedido_trnwwds_4_tfpedcod_to) ,
                                              Integer.valueOf(AV62Tpedido_trnwwds_5_tfprvnum) ,
                                              Integer.valueOf(AV63Tpedido_trnwwds_6_tfprvnum_to) ,
                                              AV65Tpedido_trnwwds_8_tfprvnom_sel ,
                                              AV64Tpedido_trnwwds_7_tfprvnom ,
                                              AV66Tpedido_trnwwds_9_tfpedfec ,
                                              AV67Tpedido_trnwwds_10_tfpedfec_to ,
                                              AV68Tpedido_trnwwds_11_tfpedfecent ,
                                              A667PedSit ,
                                              Integer.valueOf(A658PedCod) ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A661PedFec ,
                                              A662PedFecEnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING
                                              }
         });
         lV58Tpedido_trnwwds_1_pedsit = GXutil.padr( GXutil.rtrim( AV58Tpedido_trnwwds_1_pedsit), 1, "%") ;
         lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
         lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
         lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
         lV64Tpedido_trnwwds_7_tfprvnom = GXutil.padr( GXutil.rtrim( AV64Tpedido_trnwwds_7_tfprvnom), 30, "%") ;
         /* Using cursor H01YR3 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV58Tpedido_trnwwds_1_pedsit, lV59Tpedido_trnwwds_2_filterfulltext, lV59Tpedido_trnwwds_2_filterfulltext, lV59Tpedido_trnwwds_2_filterfulltext, Integer.valueOf(AV60Tpedido_trnwwds_3_tfpedcod), Integer.valueOf(AV61Tpedido_trnwwds_4_tfpedcod_to), Integer.valueOf(AV62Tpedido_trnwwds_5_tfprvnum), Integer.valueOf(AV63Tpedido_trnwwds_6_tfprvnum_to), lV64Tpedido_trnwwds_7_tfprvnom, AV65Tpedido_trnwwds_8_tfprvnom_sel, AV66Tpedido_trnwwds_9_tfpedfec, AV67Tpedido_trnwwds_10_tfpedfec_to, AV68Tpedido_trnwwds_11_tfpedfecent, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_47_idx = 1 ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A658PedCod = H01YR3_A658PedCod[0] ;
            A667PedSit = H01YR3_A667PedSit[0] ;
            A662PedFecEnt = H01YR3_A662PedFecEnt[0] ;
            A661PedFec = H01YR3_A661PedFec[0] ;
            A794PrvNom = H01YR3_A794PrvNom[0] ;
            n794PrvNom = H01YR3_n794PrvNom[0] ;
            A795PrvNum = H01YR3_A795PrvNum[0] ;
            A668PedTot = H01YR3_A668PedTot[0] ;
            n668PedTot = H01YR3_n668PedTot[0] ;
            A794PrvNom = H01YR3_A794PrvNom[0] ;
            n794PrvNom = H01YR3_n794PrvNom[0] ;
            A668PedTot = H01YR3_A668PedTot[0] ;
            n668PedTot = H01YR3_n668PedTot[0] ;
            e221YR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(47) ;
         wb1YR0( ) ;
      }
      bGXsfl_47_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YR2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT"+"_"+sGXsfl_47_idx, getSecureSignedToken( sGXsfl_47_idx, localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV53Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Moda21), "ZZZ9")));
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
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Tpedido_trnwwds_1_pedsit ,
                                           AV59Tpedido_trnwwds_2_filterfulltext ,
                                           Integer.valueOf(AV60Tpedido_trnwwds_3_tfpedcod) ,
                                           Integer.valueOf(AV61Tpedido_trnwwds_4_tfpedcod_to) ,
                                           Integer.valueOf(AV62Tpedido_trnwwds_5_tfprvnum) ,
                                           Integer.valueOf(AV63Tpedido_trnwwds_6_tfprvnum_to) ,
                                           AV65Tpedido_trnwwds_8_tfprvnom_sel ,
                                           AV64Tpedido_trnwwds_7_tfprvnom ,
                                           AV66Tpedido_trnwwds_9_tfpedfec ,
                                           AV67Tpedido_trnwwds_10_tfpedfec_to ,
                                           AV68Tpedido_trnwwds_11_tfpedfecent ,
                                           A667PedSit ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV58Tpedido_trnwwds_1_pedsit = GXutil.padr( GXutil.rtrim( AV58Tpedido_trnwwds_1_pedsit), 1, "%") ;
      lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV59Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV64Tpedido_trnwwds_7_tfprvnom = GXutil.padr( GXutil.rtrim( AV64Tpedido_trnwwds_7_tfprvnom), 30, "%") ;
      /* Using cursor H01YR5 */
      pr_default.execute(1, new Object[] {A396EmprCod, lV58Tpedido_trnwwds_1_pedsit, lV59Tpedido_trnwwds_2_filterfulltext, lV59Tpedido_trnwwds_2_filterfulltext, lV59Tpedido_trnwwds_2_filterfulltext, Integer.valueOf(AV60Tpedido_trnwwds_3_tfpedcod), Integer.valueOf(AV61Tpedido_trnwwds_4_tfpedcod_to), Integer.valueOf(AV62Tpedido_trnwwds_5_tfprvnum), Integer.valueOf(AV63Tpedido_trnwwds_6_tfprvnum_to), lV64Tpedido_trnwwds_7_tfprvnom, AV65Tpedido_trnwwds_8_tfprvnom_sel, AV66Tpedido_trnwwds_9_tfpedfec, AV67Tpedido_trnwwds_10_tfpedfec_to, AV68Tpedido_trnwwds_11_tfpedfecent});
      GRID_nRecordCount = H01YR5_AGRID_nRecordCount[0] ;
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
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15PedSit, AV16FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFPedCod, AV31TFPedCod_To, AV32TFPrvNum, AV33TFPrvNum_To, AV34TFPrvNom, AV35TFPrvNom_Sel, AV36TFPedFec, AV37TFPedFec_To, AV40TFPedFecEnt, AV56Pgmname, AV12OrderedBy, AV13OrderedDsc, A669PedUni, A657PedCanEnt, AV53Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "TPEDIDO_TrnWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavPedcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcant_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedcanent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcanent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcanent_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedsitgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedsitgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedsitgrid_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201YR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         cmbavPedsit.setName( cmbavPedsit.getInternalname() );
         cmbavPedsit.setValue( httpContext.cgiGet( cmbavPedsit.getInternalname()) );
         AV15PedSit = httpContext.cgiGet( cmbavPedsit.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
         AV16FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FilterFullText", AV16FilterFullText);
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pedfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PEDFECAUXDATE");
            GX_FocusControl = edtavDdo_pedfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_PedFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_PedFecAuxDate", localUtil.format(AV38DDO_PedFecAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_PedFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pedfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_PedFecAuxDate", localUtil.format(AV38DDO_PedFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pedfecauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PEDFECAUXDATETO");
            GX_FocusControl = edtavDdo_pedfecauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39DDO_PedFecAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DDO_PedFecAuxDateTo", localUtil.format(AV39DDO_PedFecAuxDateTo, "99/99/99"));
         }
         else
         {
            AV39DDO_PedFecAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_pedfecauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DDO_PedFecAuxDateTo", localUtil.format(AV39DDO_PedFecAuxDateTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pedfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PEDFECENTAUXDATE");
            GX_FocusControl = edtavDdo_pedfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DDO_PedFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_PedFecEntAuxDate", localUtil.format(AV42DDO_PedFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_PedFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pedfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_PedFecEntAuxDate", localUtil.format(AV42DDO_PedFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TPEDIDO_TrnWW");
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tpedido_trnww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPEDSIT"), AV15PedSit) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV16FilterFullText) != 0 )
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
      e201YR2 ();
      if (returnInSub) return;
   }

   public void e201YR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpedido_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char4[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedido_trnww_impl.this.A396EmprCod = GXv_char2[0] ;
      tpedido_trnww_impl.this.AV51EmprNom = GXv_char3[0] ;
      tpedido_trnww_impl.this.AV52UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXt_int5 = (byte)(AV53Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      tpedido_trnww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV53Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53Moda21), "ZZZ9")));
      GXt_char1 = AV50Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tpedido_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Station = GXt_char1 ;
      GXv_char4[0] = AV57Emprcod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char2[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char4, GXv_char3, GXv_char2) ;
      tpedido_trnww_impl.this.AV57Emprcod = GXv_char4[0] ;
      tpedido_trnww_impl.this.AV51EmprNom = GXv_char3[0] ;
      tpedido_trnww_impl.this.AV52UsurCod = GXv_char2[0] ;
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
      AV15PedSit = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Orden de compra de Quimicos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211YR2( )
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
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("TPEDIDO_TrnWWColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("TPEDIDO_TrnWWColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtPedFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtPedFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecEnt_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedcant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcant_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedcanent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedcanent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedcanent_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtavPedsitgrid_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPedsitgrid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPedsitgrid_Visible), 5, 0), !bGXsfl_47_Refreshing);
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV58Tpedido_trnwwds_1_pedsit = AV15PedSit ;
      AV59Tpedido_trnwwds_2_filterfulltext = AV16FilterFullText ;
      AV60Tpedido_trnwwds_3_tfpedcod = AV30TFPedCod ;
      AV61Tpedido_trnwwds_4_tfpedcod_to = AV31TFPedCod_To ;
      AV62Tpedido_trnwwds_5_tfprvnum = AV32TFPrvNum ;
      AV63Tpedido_trnwwds_6_tfprvnum_to = AV33TFPrvNum_To ;
      AV64Tpedido_trnwwds_7_tfprvnom = AV34TFPrvNom ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = AV35TFPrvNom_Sel ;
      AV66Tpedido_trnwwds_9_tfpedfec = AV36TFPedFec ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = AV37TFPedFec_To ;
      AV68Tpedido_trnwwds_11_tfpedfecent = AV40TFPedFecEnt ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121YR2( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e131YR2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141YR2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV30TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPedCod), 8, 0));
            AV31TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV32TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFPrvNum), 6, 0));
            AV33TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV34TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvNom", AV34TFPrvNom);
            AV35TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvNom_Sel", AV35TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedFec") == 0 )
         {
            AV36TFPedFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPedFec", localUtil.format(AV36TFPedFec, "99/99/99"));
            AV37TFPedFec_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPedFec_To", localUtil.format(AV37TFPedFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedFecEnt") == 0 )
         {
            AV40TFPedFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPedFecEnt", localUtil.format(AV40TFPedFecEnt, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221YR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Consulta", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      AV17PedCant = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPedcant_Internalname, GXutil.ltrimstr( AV17PedCant, 9, 2));
      AV18PedCanEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV18PedCanEnt, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT"+"_"+sGXsfl_47_idx, getSecureSignedToken( sGXsfl_47_idx, localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
      /* Optimized group. */
      /* Using cursor H01YR6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      c669PedUni = H01YR6_A669PedUni[0] ;
      c657PedCanEnt = H01YR6_A657PedCanEnt[0] ;
      pr_default.close(2);
      AV17PedCant = AV17PedCant.add(c669PedUni) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPedcant_Internalname, GXutil.ltrimstr( AV17PedCant, 9, 2));
      AV18PedCanEnt = AV18PedCanEnt.add(c657PedCanEnt) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV18PedCanEnt, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCANENT"+"_"+sGXsfl_47_idx, getSecureSignedToken( sGXsfl_47_idx, localUtil.format( AV18PedCanEnt, "ZZZZZ9.99")));
      /* End optimized group. */
      AV19PedSitGrid = ((GXutil.strcmp(A667PedSit, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "Cumplimentado", "") : httpContext.getMessage( "Pendiente", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPedsitgrid_Internalname, AV19PedSitGrid);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(47) ;
      }
      sendrow_472( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_47_Refreshing )
      {
         httpContext.doAjaxLoad(47, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0)) );
   }

   public void e151YR2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TPEDIDO_TrnWWColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111YR2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TPEDIDO_TrnWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV56Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TPEDIDO_TrnWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TPEDIDO_TrnWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tpedido_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV56Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV10GridState.fromxml(AV28ManageFiltersXml, null, null);
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
      cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e231YR2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV49Grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO CONSULTA' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV49Grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICAR2' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV49Grupodeacciones == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV49Grupodeacciones == 4 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV49Grupodeacciones == 5 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S232 ();
         if (returnInSub) return;
      }
      AV49Grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161YR2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S242 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171YR2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.tpedido_trnwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tpedido_trnww_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      tpedido_trnww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
   }

   public void e181YR2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tpedido_trnwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
   }

   public void e191YR2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tpedido_trnwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PedCod", "", "Nº Pedido", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrvNum", "", "Proveedor", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrvNom", "", "Nombre", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PedFec", "", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PedFecEnt", "", "Fecha Ent. Prev.", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&PedCant", "", "Cantidad", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&PedCanEnt", "", "Cant.Entreg", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&PedSitGrid", "", "Estado", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPEDIDO_TrnWWColumnsSelector", GXv_char4) ;
      tpedido_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TPEDIDO_TrnWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15PedSit = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
      AV16FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FilterFullText", AV16FilterFullText);
      AV30TFPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPedCod), 8, 0));
      AV31TFPedCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPedCod_To), 8, 0));
      AV32TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFPrvNum), 6, 0));
      AV33TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrvNum_To), 6, 0));
      AV34TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvNom", AV34TFPrvNom);
      AV35TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvNom_Sel", AV35TFPrvNom_Sel);
      AV36TFPedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFPedFec", localUtil.format(AV36TFPedFec, "99/99/99"));
      AV37TFPedFec_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFPedFec_To", localUtil.format(AV37TFPedFec_To, "99/99/99"));
      AV40TFPedFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPedFecEnt", localUtil.format(AV40TFPedFecEnt, "99/99/99"));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO CONSULTA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
   }

   public void S202( )
   {
      /* 'DO MODIFICAR2' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18PedCanEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Hay cantidad entregada", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "¿Desea eliminar el Nº Pedido ", "")+GXutil.trim( GXutil.str( A658PedCod, 8, 0))+"?" ;
         ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         AV70Emprcod_selected = A396EmprCod ;
         AV71Pedcod_selected = A658PedCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S242( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A658PedCod ;
      new app.peliped(remoteHandle, context).execute( GXv_char4, GXv_int14) ;
      tpedido_trnww_impl.this.A396EmprCod = GXv_char4[0] ;
      tpedido_trnww_impl.this.A658PedCod = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A658PedCod ;
      new app.peliped3(remoteHandle, context).execute( GXv_char4, GXv_int14) ;
      tpedido_trnww_impl.this.A396EmprCod = GXv_char4[0] ;
      tpedido_trnww_impl.this.A658PedCod = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_int14[0] = A658PedCod ;
      new app.peliped2(remoteHandle, context).execute( GXv_char4, GXv_int14) ;
      tpedido_trnww_impl.this.A396EmprCod = GXv_char4[0] ;
      tpedido_trnww_impl.this.A658PedCod = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      if ( AV53Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rmod001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(A668PedTot))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed"}) , new Object[] {"","A668PedTot"});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato NO definido", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV56Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV56Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV26Session.getValue(AV56Pgmname+"GridState"), null, null);
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
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PEDSIT") == 0 )
         {
            AV15PedSit = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FilterFullText", AV16FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV30TFPedCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFPedCod), 8, 0));
            AV31TFPedCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV32TFPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFPrvNum), 6, 0));
            AV33TFPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV34TFPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrvNom", AV34TFPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV35TFPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrvNom_Sel", AV35TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV36TFPedFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPedFec", localUtil.format(AV36TFPedFec, "99/99/99"));
            AV37TFPedFec_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPedFec_To", localUtil.format(AV37TFPedFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV40TFPedFecEnt = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPedFecEnt", localUtil.format(AV40TFPedFecEnt, "99/99/99"));
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrvNom_Sel)==0), AV35TFPrvNom_Sel, GXv_char4) ;
      tpedido_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrvNom)==0), AV34TFPrvNom, GXv_char4) ;
      tpedido_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV30TFPedCod) ? "" : GXutil.str( AV30TFPedCod, 8, 0))+"|"+((0==AV32TFPrvNum) ? "" : GXutil.str( AV32TFPrvNum, 6, 0))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFPedFec)) ? "" : localUtil.dtoc( AV36TFPedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFPedFecEnt)) ? "" : localUtil.dtoc( AV40TFPedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV31TFPedCod_To) ? "" : GXutil.str( AV31TFPedCod_To, 8, 0))+"|"+((0==AV33TFPrvNum_To) ? "" : GXutil.str( AV33TFPrvNum_To, 6, 0))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFPedFec_To)) ? "" : localUtil.dtoc( AV37TFPedFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV26Session.getValue(AV56Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "PEDSIT", "", true, (short)(0), AV15PedSit, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV16FilterFullText)==0), (short)(0), AV16FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPEDCOD", "", !((0==AV30TFPedCod)&&(0==AV31TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV31TFPedCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRVNUM", "", !((0==AV32TFPrvNum)&&(0==AV33TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV33TFPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRVNOM", "", !(GXutil.strcmp("", AV34TFPrvNom)==0), (short)(0), AV34TFPrvNom, "", !(GXutil.strcmp("", AV35TFPrvNom_Sel)==0), AV35TFPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPEDFEC", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFPedFec))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFPedFec_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV36TFPedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV37TFPedFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPEDFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFPedFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV40TFPedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV56Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV56Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPEDIDO_Trn" );
      AV26Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_74_1YR2( boolean wbgen )
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
         wb_table2_74_1YR2e( true) ;
      }
      else
      {
         wb_table2_74_1YR2e( false) ;
      }
   }

   public void wb_table1_25_1YR2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPedsit.getInternalname(), httpContext.getMessage( "Ped Sit", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_47_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPedsit, cmbavPedsit.getInternalname(), GXutil.rtrim( AV15PedSit), 1, cmbavPedsit.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPedsit.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "", true, (byte)(0), "HLP_TPEDIDO_TrnWW.htm");
         cmbavPedsit.setValue( GXutil.rtrim( AV15PedSit) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_34_1YR2( true) ;
      }
      else
      {
         wb_table3_34_1YR2( false) ;
      }
      return  ;
   }

   public void wb_table3_34_1YR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1YR2e( true) ;
      }
      else
      {
         wb_table1_25_1YR2e( false) ;
      }
   }

   public void wb_table3_34_1YR2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_47_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV16FilterFullText, GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TPEDIDO_TrnWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_34_1YR2e( true) ;
      }
      else
      {
         wb_table3_34_1YR2e( false) ;
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
      pa1YR2( ) ;
      ws1YR2( ) ;
      we1YR2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143052", true, true);
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
      httpContext.AddJavascriptSource("tpedido_trnww.js", "?202682116143053", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_472( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_47_idx );
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_47_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_47_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_47_idx ;
      edtPedFec_Internalname = "PEDFEC_"+sGXsfl_47_idx ;
      edtPedFecEnt_Internalname = "PEDFECENT_"+sGXsfl_47_idx ;
      edtavPedcant_Internalname = "vPEDCANT_"+sGXsfl_47_idx ;
      edtavPedcanent_Internalname = "vPEDCANENT_"+sGXsfl_47_idx ;
      edtavPedsitgrid_Internalname = "vPEDSITGRID_"+sGXsfl_47_idx ;
      edtPedSit_Internalname = "PEDSIT_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_472( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_47_fel_idx );
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_47_fel_idx ;
      edtPrvNum_Internalname = "PRVNUM_"+sGXsfl_47_fel_idx ;
      edtPrvNom_Internalname = "PRVNOM_"+sGXsfl_47_fel_idx ;
      edtPedFec_Internalname = "PEDFEC_"+sGXsfl_47_fel_idx ;
      edtPedFecEnt_Internalname = "PEDFECENT_"+sGXsfl_47_fel_idx ;
      edtavPedcant_Internalname = "vPEDCANT_"+sGXsfl_47_fel_idx ;
      edtavPedcanent_Internalname = "vPEDCANENT_"+sGXsfl_47_fel_idx ;
      edtavPedsitgrid_Internalname = "vPEDSITGRID_"+sGXsfl_47_fel_idx ;
      edtPedSit_Internalname = "PEDSIT_"+sGXsfl_47_fel_idx ;
   }

   public void sendrow_472( )
   {
      subsflControlProps_472( ) ;
      wb1YR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_47_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_47_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_47_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV49Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONES.CLICK."+sGXsfl_47_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_47_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedFec_Internalname,localUtil.format(A661PedFec, "99/99/99"),localUtil.format( A661PedFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedFecEnt_Internalname,localUtil.format(A662PedFecEnt, "99/99/99"),localUtil.format( A662PedFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPedcant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedcant_Enabled!=0)&&(edtavPedcant_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV17PedCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPedcant_Enabled!=0) ? localUtil.format( AV17PedCant, "ZZZZZ9.99") : localUtil.format( AV17PedCant, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPedcant_Enabled!=0)&&(edtavPedcant_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPedcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPedcant_Visible),Integer.valueOf(edtavPedcant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPedcanent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedcanent_Enabled!=0)&&(edtavPedcanent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedcanent_Internalname,GXutil.ltrim( localUtil.ntoc( AV18PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPedcanent_Enabled!=0) ? localUtil.format( AV18PedCanEnt, "ZZZZZ9.99") : localUtil.format( AV18PedCanEnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPedcanent_Enabled!=0)&&(edtavPedcanent_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPedcanent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPedcanent_Visible),Integer.valueOf(edtavPedcanent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPedsitgrid_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedsitgrid_Enabled!=0)&&(edtavPedsitgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedsitgrid_Internalname,GXutil.rtrim( AV19PedSitGrid),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPedsitgrid_Enabled!=0)&&(edtavPedsitgrid_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPedsitgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPedsitgrid_Visible),Integer.valueOf(edtavPedsitgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedSit_Internalname,GXutil.rtrim( A667PedSit),GXutil.rtrim( localUtil.format( A667PedSit, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1YR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      /* End function sendrow_472 */
   }

   public void startgridcontrol47( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"47\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ent. Prev.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPedcant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPedcanent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant.Entreg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPedsitgrid_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49Grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", localUtil.format(A661PedFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A662PedFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17PedCant, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18PedCanEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedcanent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedcanent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19PedSitGrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPedsitgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPedsitgrid_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A667PedSit));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      cmbavPedsit.setInternalname( "vPEDSIT" );
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      edtPedCod_Internalname = "PEDCOD" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPedFec_Internalname = "PEDFEC" ;
      edtPedFecEnt_Internalname = "PEDFECENT" ;
      edtavPedcant_Internalname = "vPEDCANT" ;
      edtavPedcanent_Internalname = "vPEDCANENT" ;
      edtavPedsitgrid_Internalname = "vPEDSITGRID" ;
      edtPedSit_Internalname = "PEDSIT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_pedfecauxdate_Internalname = "vDDO_PEDFECAUXDATE" ;
      edtavDdo_pedfecauxdateto_Internalname = "vDDO_PEDFECAUXDATETO" ;
      divDdo_pedfecauxdates_Internalname = "DDO_PEDFECAUXDATES" ;
      edtavDdo_pedfecentauxdate_Internalname = "vDDO_PEDFECENTAUXDATE" ;
      divDdo_pedfecentauxdates_Internalname = "DDO_PEDFECENTAUXDATES" ;
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
      edtPedSit_Jsonclick = "" ;
      edtavPedsitgrid_Jsonclick = "" ;
      edtavPedsitgrid_Enabled = 1 ;
      edtavPedcanent_Jsonclick = "" ;
      edtavPedcanent_Enabled = 1 ;
      edtavPedcant_Jsonclick = "" ;
      edtavPedcant_Enabled = 1 ;
      edtPedFecEnt_Jsonclick = "" ;
      edtPedFec_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavPedsit.setJsonclick( "" );
      cmbavPedsit.setEnabled( 1 );
      edtavPedsitgrid_Visible = -1 ;
      edtavPedcanent_Visible = -1 ;
      edtavPedcant_Visible = -1 ;
      edtPedFecEnt_Visible = -1 ;
      edtPedFec_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPedCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_pedfecentauxdate_Jsonclick = "" ;
      edtavDdo_pedfecauxdateto_Jsonclick = "" ;
      edtavDdo_pedfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar el Pedido Nº?" ;
      Dvelop_confirmpanel_eliminar_Title = httpContext.getMessage( "Eliminacion del Pedido", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TPEDIDO_TrnWWGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|||||" ;
      Ddo_grid_Includedatalist = "||T|||||" ;
      Ddo_grid_Filterisrange = "T|T||T||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Date|Date|||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|||" ;
      Ddo_grid_Columnids = "1:PedCod|2:PrvNum|3:PrvNom|4:PedFec|5:PedFecEnt|6:PedCant|7:PedCanEnt|8:PedSitGrid" ;
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
      Form.setCaption( httpContext.getMessage( " Orden de compra de Quimicos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPedsit.setName( "vPEDSIT" );
      cmbavPedsit.setWebtags( "" );
      cmbavPedsit.addItem("S", httpContext.getMessage( "Cumplimentado", ""), (short)(0));
      cmbavPedsit.addItem("N", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbavPedsit.addItem("", httpContext.getMessage( "Indistinto", ""), (short)(0));
      if ( cmbavPedsit.getItemCount() > 0 )
      {
         AV15PedSit = cmbavPedsit.getValidValue(AV15PedSit) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15PedSit", AV15PedSit);
      }
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_47_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         AV49Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV49Grupodeacciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Grupodeacciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtavPedcant_Visible',ctrl:'vPEDCANT',prop:'Visible'},{av:'edtavPedcanent_Visible',ctrl:'vPEDCANENT',prop:'Visible'},{av:'edtavPedsitgrid_Visible',ctrl:'vPEDSITGRID',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121YR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131YR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141YR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221YR2',iparms:[{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV49Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV17PedCant',fld:'vPEDCANT',pic:'ZZZZZ9.99'},{av:'AV18PedCanEnt',fld:'vPEDCANENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV19PedSitGrid',fld:'vPEDSITGRID',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151YR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtavPedcant_Visible',ctrl:'vPEDCANT',prop:'Visible'},{av:'edtavPedcanent_Visible',ctrl:'vPEDCANENT',prop:'Visible'},{av:'edtavPedsitgrid_Visible',ctrl:'vPEDSITGRID',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111YR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtavPedcant_Visible',ctrl:'vPEDCANT',prop:'Visible'},{av:'edtavPedcanent_Visible',ctrl:'vPEDCANENT',prop:'Visible'},{av:'edtavPedsitgrid_Visible',ctrl:'vPEDSITGRID',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e231YR2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV49Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV18PedCanEnt',fld:'vPEDCANENT',pic:'ZZZZZ9.99',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A668PedTot',fld:'PEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV49Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'A668PedTot',fld:'PEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtavPedcant_Visible',ctrl:'vPEDCANT',prop:'Visible'},{av:'edtavPedcanent_Visible',ctrl:'vPEDCANENT',prop:'Visible'},{av:'edtavPedsitgrid_Visible',ctrl:'vPEDSITGRID',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161YR2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPedFec_Visible',ctrl:'PEDFEC',prop:'Visible'},{av:'edtPedFecEnt_Visible',ctrl:'PEDFECENT',prop:'Visible'},{av:'edtavPedcant_Visible',ctrl:'vPEDCANT',prop:'Visible'},{av:'edtavPedcanent_Visible',ctrl:'vPEDCANENT',prop:'Visible'},{av:'edtavPedsitgrid_Visible',ctrl:'vPEDSITGRID',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171YR2',iparms:[{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181YR2',iparms:[{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191YR2',iparms:[{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'cmbavPedsit'},{av:'AV15PedSit',fld:'vPEDSIT',pic:'@!'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV31TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV32TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV33TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV35TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPedFec',fld:'vTFPEDFEC',pic:''},{av:'AV37TFPedFec_To',fld:'vTFPEDFEC_TO',pic:''},{av:'AV40TFPedFecEnt',fld:'vTFPEDFECENT',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'AV53Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALIDV_PEDSIT","{handler:'validv_Pedsit',iparms:[]");
      setEventMetadata("VALIDV_PEDSIT",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[]");
      setEventMetadata("VALID_PEDCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pedsit',iparms:[]");
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
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15PedSit = "" ;
      AV16FilterFullText = "" ;
      A396EmprCod = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV34TFPrvNom = "" ;
      AV35TFPrvNom_Sel = "" ;
      AV36TFPedFec = GXutil.nullDate() ;
      AV37TFPedFec_To = GXutil.nullDate() ;
      AV40TFPedFecEnt = GXutil.nullDate() ;
      AV56Pgmname = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A668PedTot = DecimalUtil.ZERO ;
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
      AV38DDO_PedFecAuxDate = GXutil.nullDate() ;
      AV39DDO_PedFecAuxDateTo = GXutil.nullDate() ;
      AV42DDO_PedFecEntAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A794PrvNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      AV17PedCant = DecimalUtil.ZERO ;
      AV18PedCanEnt = DecimalUtil.ZERO ;
      AV19PedSitGrid = "" ;
      A667PedSit = "" ;
      scmdbuf = "" ;
      lV58Tpedido_trnwwds_1_pedsit = "" ;
      lV59Tpedido_trnwwds_2_filterfulltext = "" ;
      lV64Tpedido_trnwwds_7_tfprvnom = "" ;
      AV58Tpedido_trnwwds_1_pedsit = "" ;
      AV59Tpedido_trnwwds_2_filterfulltext = "" ;
      AV65Tpedido_trnwwds_8_tfprvnom_sel = "" ;
      AV64Tpedido_trnwwds_7_tfprvnom = "" ;
      AV66Tpedido_trnwwds_9_tfpedfec = GXutil.nullDate() ;
      AV67Tpedido_trnwwds_10_tfpedfec_to = GXutil.nullDate() ;
      AV68Tpedido_trnwwds_11_tfpedfecent = GXutil.nullDate() ;
      H01YR3_A396EmprCod = new String[] {""} ;
      H01YR3_A658PedCod = new int[1] ;
      H01YR3_A667PedSit = new String[] {""} ;
      H01YR3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01YR3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YR3_A794PrvNom = new String[] {""} ;
      H01YR3_n794PrvNom = new boolean[] {false} ;
      H01YR3_A795PrvNum = new int[1] ;
      H01YR3_A668PedTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YR3_n668PedTot = new boolean[] {false} ;
      H01YR5_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV50Station = "" ;
      AV51EmprNom = "" ;
      AV52UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV57Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      c669PedUni = DecimalUtil.ZERO ;
      c657PedCanEnt = DecimalUtil.ZERO ;
      H01YR6_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YR6_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV70Emprcod_selected = "" ;
      GXv_int14 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedido_trnww__default(),
         new Object[] {
             new Object[] {
            H01YR3_A396EmprCod, H01YR3_A658PedCod, H01YR3_A667PedSit, H01YR3_A662PedFecEnt, H01YR3_A661PedFec, H01YR3_A794PrvNom, H01YR3_n794PrvNom, H01YR3_A795PrvNum, H01YR3_A668PedTot, H01YR3_n668PedTot
            }
            , new Object[] {
            H01YR5_AGRID_nRecordCount
            }
            , new Object[] {
            H01YR6_A669PedUni, H01YR6_A657PedCanEnt
            }
         }
      );
      AV56Pgmname = "TPEDIDO_TrnWW" ;
      /* GeneXus formulas. */
      AV56Pgmname = "TPEDIDO_TrnWW" ;
      Gx_err = (short)(0) ;
      edtavPedcant_Enabled = 0 ;
      edtavPedcanent_Enabled = 0 ;
      edtavPedsitgrid_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
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
   private short AV12OrderedBy ;
   private short AV53Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV49Grupodeacciones ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_47 ;
   private int nGXsfl_47_idx=1 ;
   private int AV30TFPedCod ;
   private int AV31TFPedCod_To ;
   private int AV32TFPrvNum ;
   private int AV33TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int edtavPedcant_Enabled ;
   private int edtavPedcanent_Enabled ;
   private int edtavPedsitgrid_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV60Tpedido_trnwwds_3_tfpedcod ;
   private int AV61Tpedido_trnwwds_4_tfpedcod_to ;
   private int AV62Tpedido_trnwwds_5_tfprvnum ;
   private int AV63Tpedido_trnwwds_6_tfprvnum_to ;
   private int edtPedCod_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPedFec_Visible ;
   private int edtPedFecEnt_Visible ;
   private int edtavPedcant_Visible ;
   private int edtavPedcanent_Visible ;
   private int edtavPedsitgrid_Visible ;
   private int AV45PageToGo ;
   private int AV71Pedcod_selected ;
   private int GXv_int14[] ;
   private int AV72GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A668PedTot ;
   private java.math.BigDecimal AV17PedCant ;
   private java.math.BigDecimal AV18PedCanEnt ;
   private java.math.BigDecimal c669PedUni ;
   private java.math.BigDecimal c657PedCanEnt ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_47_idx="0001" ;
   private String AV15PedSit ;
   private String A396EmprCod ;
   private String AV34TFPrvNom ;
   private String AV35TFPrvNom_Sel ;
   private String AV56Pgmname ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String divDdo_pedfecauxdates_Internalname ;
   private String edtavDdo_pedfecauxdate_Internalname ;
   private String edtavDdo_pedfecauxdate_Jsonclick ;
   private String edtavDdo_pedfecauxdateto_Internalname ;
   private String edtavDdo_pedfecauxdateto_Jsonclick ;
   private String divDdo_pedfecentauxdates_Internalname ;
   private String edtavDdo_pedfecentauxdate_Internalname ;
   private String edtavDdo_pedfecentauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtPedCod_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPedFec_Internalname ;
   private String edtPedFecEnt_Internalname ;
   private String edtavPedcant_Internalname ;
   private String edtavPedcanent_Internalname ;
   private String AV19PedSitGrid ;
   private String edtavPedsitgrid_Internalname ;
   private String A667PedSit ;
   private String edtPedSit_Internalname ;
   private String scmdbuf ;
   private String lV58Tpedido_trnwwds_1_pedsit ;
   private String lV64Tpedido_trnwwds_7_tfprvnom ;
   private String AV58Tpedido_trnwwds_1_pedsit ;
   private String AV65Tpedido_trnwwds_8_tfprvnom_sel ;
   private String AV64Tpedido_trnwwds_7_tfprvnom ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV50Station ;
   private String AV51EmprNom ;
   private String AV52UsurCod ;
   private String AV57Emprcod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV70Emprcod_selected ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPedCod_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPedFec_Jsonclick ;
   private String edtPedFecEnt_Jsonclick ;
   private String edtavPedcant_Jsonclick ;
   private String edtavPedcanent_Jsonclick ;
   private String edtavPedsitgrid_Jsonclick ;
   private String edtPedSit_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV36TFPedFec ;
   private java.util.Date AV37TFPedFec_To ;
   private java.util.Date AV40TFPedFecEnt ;
   private java.util.Date AV38DDO_PedFecAuxDate ;
   private java.util.Date AV39DDO_PedFecAuxDateTo ;
   private java.util.Date AV42DDO_PedFecEntAuxDate ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV66Tpedido_trnwwds_9_tfpedfec ;
   private java.util.Date AV67Tpedido_trnwwds_10_tfpedfec_to ;
   private java.util.Date AV68Tpedido_trnwwds_11_tfpedfecent ;
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
   private boolean n794PrvNom ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n668PedTot ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV16FilterFullText ;
   private String lV59Tpedido_trnwwds_2_filterfulltext ;
   private String AV59Tpedido_trnwwds_2_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavPedsit ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01YR3_A396EmprCod ;
   private int[] H01YR3_A658PedCod ;
   private String[] H01YR3_A667PedSit ;
   private java.util.Date[] H01YR3_A662PedFecEnt ;
   private java.util.Date[] H01YR3_A661PedFec ;
   private String[] H01YR3_A794PrvNom ;
   private boolean[] H01YR3_n794PrvNom ;
   private int[] H01YR3_A795PrvNum ;
   private java.math.BigDecimal[] H01YR3_A668PedTot ;
   private boolean[] H01YR3_n668PedTot ;
   private long[] H01YR5_AGRID_nRecordCount ;
   private java.math.BigDecimal[] H01YR6_A669PedUni ;
   private java.math.BigDecimal[] H01YR6_A657PedCanEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class tpedido_trnww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01YR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Tpedido_trnwwds_1_pedsit ,
                                          String AV59Tpedido_trnwwds_2_filterfulltext ,
                                          int AV60Tpedido_trnwwds_3_tfpedcod ,
                                          int AV61Tpedido_trnwwds_4_tfpedcod_to ,
                                          int AV62Tpedido_trnwwds_5_tfprvnum ,
                                          int AV63Tpedido_trnwwds_6_tfprvnum_to ,
                                          String AV65Tpedido_trnwwds_8_tfprvnom_sel ,
                                          String AV64Tpedido_trnwwds_7_tfprvnom ,
                                          java.util.Date AV66Tpedido_trnwwds_9_tfpedfec ,
                                          java.util.Date AV67Tpedido_trnwwds_10_tfpedfec_to ,
                                          java.util.Date AV68Tpedido_trnwwds_11_tfpedfecent ,
                                          String A667PedSit ,
                                          int A658PedCod ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.PedCod, T1.PedSit, T1.PedFecEnt, T1.PedFec, T2.PrvNom, T1.PrvNum, COALESCE( T3.PedTot, 0) AS PedTot" ;
      sFromString = " FROM ((TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) LEFT JOIN (SELECT SUM(PedVal) AS PedTot, EmprCod, PedCod FROM" ;
      sFromString += " TXPLPEDID GROUP BY EmprCod, PedCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV58Tpedido_trnwwds_1_pedsit)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedSit) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tpedido_trnwwds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV60Tpedido_trnwwds_3_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (0==AV61Tpedido_trnwwds_4_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (0==AV62Tpedido_trnwwds_5_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Tpedido_trnwwds_6_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tpedido_trnwwds_8_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tpedido_trnwwds_7_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tpedido_trnwwds_8_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Tpedido_trnwwds_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Tpedido_trnwwds_10_tfpedfec_to)) )
      {
         addWhere(sWhereString, "(T1.PedFec <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Tpedido_trnwwds_11_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PedCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedFec" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedFecEnt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedFecEnt DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PedCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01YR5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Tpedido_trnwwds_1_pedsit ,
                                          String AV59Tpedido_trnwwds_2_filterfulltext ,
                                          int AV60Tpedido_trnwwds_3_tfpedcod ,
                                          int AV61Tpedido_trnwwds_4_tfpedcod_to ,
                                          int AV62Tpedido_trnwwds_5_tfprvnum ,
                                          int AV63Tpedido_trnwwds_6_tfprvnum_to ,
                                          String AV65Tpedido_trnwwds_8_tfprvnom_sel ,
                                          String AV64Tpedido_trnwwds_7_tfprvnom ,
                                          java.util.Date AV66Tpedido_trnwwds_9_tfpedfec ,
                                          java.util.Date AV67Tpedido_trnwwds_10_tfpedfec_to ,
                                          java.util.Date AV68Tpedido_trnwwds_11_tfpedfecent ,
                                          String A667PedSit ,
                                          int A658PedCod ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[14];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) LEFT JOIN (SELECT SUM(PedVal) AS PedTot, EmprCod," ;
      scmdbuf += " PedCod FROM TXPLPEDID GROUP BY EmprCod, PedCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV58Tpedido_trnwwds_1_pedsit)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedSit) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tpedido_trnwwds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (0==AV60Tpedido_trnwwds_3_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (0==AV61Tpedido_trnwwds_4_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (0==AV62Tpedido_trnwwds_5_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Tpedido_trnwwds_6_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tpedido_trnwwds_8_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tpedido_trnwwds_7_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tpedido_trnwwds_8_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Tpedido_trnwwds_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Tpedido_trnwwds_10_tfpedfec_to)) )
      {
         addWhere(sWhereString, "(T1.PedFec <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Tpedido_trnwwds_11_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_H01YR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
            case 1 :
                  return conditional_H01YR5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YR5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YR6", "SELECT SUM(PedUni), SUM(PedCanEnt) FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

