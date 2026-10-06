package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbcomww_impl extends GXDataArea
{
   public talbcomww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbcomww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbcomww_impl.class ));
   }

   public talbcomww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbcompri = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbComEst = new HTMLChoice();
      cmbAlbComPri = new HTMLChoice();
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
      nRC_GXsfl_53 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_53"))) ;
      nGXsfl_53_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_53_idx"))) ;
      sGXsfl_53_idx = httpContext.GetPar( "sGXsfl_53_idx") ;
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
      AV133FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV125AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
      AV44ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ColumnsSelector);
      cmbavAlbcompri.fromJSonString( httpContext.GetNextPar( ));
      AV124AlbComPri = httpContext.GetPar( "AlbComPri") ;
      AV126AlbComFch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch_To")) ;
      AV46TFAlbComCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod"))) ;
      AV47TFAlbComCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod_To"))) ;
      AV49TFAlbComFch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbComFch")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV122TFAlbComPri_Sels);
      AV57TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV58TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV60TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV61TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV106TFAlbComFd = httpContext.GetPar( "TFAlbComFd") ;
      AV107TFAlbComFd_Sel = httpContext.GetPar( "TFAlbComFd_Sel") ;
      AV109TFAlbComFdD = httpContext.GetPar( "TFAlbComFdD") ;
      AV110TFAlbComFdD_Sel = httpContext.GetPar( "TFAlbComFdD_Sel") ;
      AV154Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
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
      paNG2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startNG2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbcomww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV133FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMFCH", localUtil.format(AV125AlbComFch, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_53", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_53, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV114GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV115GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMFCH", localUtil.dtoc( AV125AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMFCH_TO", localUtil.dtoc( AV126AlbComFch_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV112DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV112DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV44ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV46TFAlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFAlbComCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFCH", localUtil.dtoc( AV49TFAlbComFch, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMPRI_SELS", AV122TFAlbComPri_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMPRI_SELS", AV122TFAlbComPri_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV57TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV58TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV60TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV61TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFD", GXutil.rtrim( AV106TFAlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFD_SEL", GXutil.rtrim( AV107TFAlbComFd_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFDD", GXutil.rtrim( AV109TFAlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFDD_SEL", GXutil.rtrim( AV110TFAlbComFdD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV154Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEAT", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMPRI_SELSJSON", AV121TFAlbComPri_SelsJson);
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
         weNG2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtNG2( ) ;
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
      return formatLink("app.talbcomww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALBCOMWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Albaranes Comerciales v01", "") ;
   }

   public void wbNG0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_NG2( true) ;
      }
      else
      {
         wb_table1_27_NG2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_NG2e( boolean wbgen )
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
         startgridcontrol53( ) ;
      }
      if ( wbEnd == 53 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_53 = (int)(nGXsfl_53_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV114GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV115GridPageCount);
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
         ucAlbcomfch_rangepicker.setProperty("Start Date", AV125AlbComFch);
         ucAlbcomfch_rangepicker.setProperty("End Date", AV126AlbComFch_To);
         ucAlbcomfch_rangepicker.render(context, "wwp.daterangepicker", Albcomfch_rangepicker_Internalname, "ALBCOMFCH_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV112DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV112DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV39ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_53_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomfchauxdate_Internalname, localUtil.format(AV51DDO_AlbComFchAuxDate, "99/99/99"), localUtil.format( AV51DDO_AlbComFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBCOMWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 53 )
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

   public void startNG2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Albaranes Comerciales v01", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupNG0( ) ;
   }

   public void wsNG2( )
   {
      startNG2( ) ;
      evtNG2( ) ;
   }

   public void evtNG2( )
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
                           e11NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ALBCOMFCH_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e17NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e18NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e19NG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e20NG2 ();
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
                           nGXsfl_53_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_532( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV134GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
                           AV123Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavObservaciones_Internalname, AV123Observaciones);
                           A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A17AlbComFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbComFch_Internalname), 0)) ;
                           cmbAlbComEst.setName( cmbAlbComEst.getInternalname() );
                           cmbAlbComEst.setValue( httpContext.cgiGet( cmbAlbComEst.getInternalname()) );
                           A16AlbComEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEst.getInternalname()))) ;
                           cmbAlbComPri.setName( cmbAlbComPri.getInternalname() );
                           cmbAlbComPri.setValue( httpContext.cgiGet( cmbAlbComPri.getInternalname()) );
                           A22AlbComPri = httpContext.cgiGet( cmbAlbComPri.getInternalname()) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
                           A10015AlbComFdD = httpContext.cgiGet( edtAlbComFdD_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e21NG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e22NG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23NG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV133FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albcomfch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBCOMFCH"), 0), AV125AlbComFch) ) )
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

   public void weNG2( )
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

   public void paNG2( )
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
            GX_FocusControl = cmbavAlbcompri.getInternalname() ;
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
      subsflControlProps_532( ) ;
      while ( nGXsfl_53_idx <= nRC_GXsfl_53 )
      {
         sendrow_532( ) ;
         nGXsfl_53_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV133FilterFullText ,
                                 java.util.Date AV125AlbComFch ,
                                 byte AV44ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ,
                                 String AV124AlbComPri ,
                                 java.util.Date AV126AlbComFch_To ,
                                 int AV46TFAlbComCod ,
                                 int AV47TFAlbComCod_To ,
                                 java.util.Date AV49TFAlbComFch ,
                                 GXSimpleCollection<String> AV122TFAlbComPri_Sels ,
                                 int AV57TFCliCod ,
                                 int AV58TFCliCod_To ,
                                 String AV60TFCliNom ,
                                 String AV61TFCliNom_Sel ,
                                 String AV106TFAlbComFd ,
                                 String AV107TFAlbComFd_Sel ,
                                 String AV109TFAlbComFdD ,
                                 String AV110TFAlbComFdD_Sel ,
                                 String AV154Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e22NG2 ();
      GRID_nCurrentRecord = 0 ;
      rfNG2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")));
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
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV124AlbComPri = cmbavAlbcompri.getValidValue(AV124AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfNG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV154Pgmname = "TALBCOMWW" ;
      Gx_err = (short)(0) ;
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void rfNG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(53) ;
      /* Execute user event: Refresh */
      e22NG2 ();
      nGXsfl_53_idx = 1 ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_532( ) ;
      bGXsfl_53_Refreshing = true ;
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
         subsflControlProps_532( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A22AlbComPri ,
                                              AV145Talbcomwwds_8_tfalbcompri_sels ,
                                              AV139Talbcomwwds_2_albcomfch ,
                                              AV140Talbcomwwds_3_albcomfch_to ,
                                              AV141Talbcomwwds_4_filterfulltext ,
                                              Integer.valueOf(AV142Talbcomwwds_5_tfalbcomcod) ,
                                              Integer.valueOf(AV143Talbcomwwds_6_tfalbcomcod_to) ,
                                              AV144Talbcomwwds_7_tfalbcomfch ,
                                              Integer.valueOf(AV145Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                              Integer.valueOf(AV146Talbcomwwds_9_tfclicod) ,
                                              Integer.valueOf(AV147Talbcomwwds_10_tfclicod_to) ,
                                              AV149Talbcomwwds_12_tfclinom_sel ,
                                              AV148Talbcomwwds_11_tfclinom ,
                                              AV151Talbcomwwds_14_tfalbcomfd_sel ,
                                              AV150Talbcomwwds_13_tfalbcomfd ,
                                              AV153Talbcomwwds_16_tfalbcomfdd_sel ,
                                              AV152Talbcomwwds_15_tfalbcomfdd ,
                                              A17AlbComFch ,
                                              Integer.valueOf(A14AlbComCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A10014AlbComFd ,
                                              A10015AlbComFdD ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV138Talbcomwwds_1_albcompri } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
         lV148Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV148Talbcomwwds_11_tfclinom), 30, "%") ;
         lV150Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV150Talbcomwwds_13_tfalbcomfd), 200, "%") ;
         lV152Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV152Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
         /* Using cursor H00NG2 */
         pr_default.execute(0, new Object[] {AV138Talbcomwwds_1_albcompri, AV139Talbcomwwds_2_albcomfch, AV140Talbcomwwds_3_albcomfch_to, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, Integer.valueOf(AV142Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV143Talbcomwwds_6_tfalbcomcod_to), AV144Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV146Talbcomwwds_9_tfclicod), Integer.valueOf(AV147Talbcomwwds_10_tfclicod_to), lV148Talbcomwwds_11_tfclinom, AV149Talbcomwwds_12_tfclinom_sel, lV150Talbcomwwds_13_tfalbcomfd, AV151Talbcomwwds_14_tfalbcomfd_sel, lV152Talbcomwwds_15_tfalbcomfdd, AV153Talbcomwwds_16_tfalbcomfdd_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_53_idx = 1 ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10739AlbComEAT = H00NG2_A10739AlbComEAT[0] ;
            A396EmprCod = H00NG2_A396EmprCod[0] ;
            A10015AlbComFdD = H00NG2_A10015AlbComFdD[0] ;
            A10014AlbComFd = H00NG2_A10014AlbComFd[0] ;
            A279CliNom = H00NG2_A279CliNom[0] ;
            A252CliCod = H00NG2_A252CliCod[0] ;
            A22AlbComPri = H00NG2_A22AlbComPri[0] ;
            A16AlbComEst = H00NG2_A16AlbComEst[0] ;
            A17AlbComFch = H00NG2_A17AlbComFch[0] ;
            A14AlbComCod = H00NG2_A14AlbComCod[0] ;
            A279CliNom = H00NG2_A279CliNom[0] ;
            e23NG2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(53) ;
         wbNG0( ) ;
      }
      bGXsfl_53_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesNG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV154Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV154Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMCOD"+"_"+sGXsfl_53_idx, getSecureSignedToken( sGXsfl_53_idx, localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")));
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
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV145Talbcomwwds_8_tfalbcompri_sels ,
                                           AV139Talbcomwwds_2_albcomfch ,
                                           AV140Talbcomwwds_3_albcomfch_to ,
                                           AV141Talbcomwwds_4_filterfulltext ,
                                           Integer.valueOf(AV142Talbcomwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV143Talbcomwwds_6_tfalbcomcod_to) ,
                                           AV144Talbcomwwds_7_tfalbcomfch ,
                                           Integer.valueOf(AV145Talbcomwwds_8_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV146Talbcomwwds_9_tfclicod) ,
                                           Integer.valueOf(AV147Talbcomwwds_10_tfclicod_to) ,
                                           AV149Talbcomwwds_12_tfclinom_sel ,
                                           AV148Talbcomwwds_11_tfclinom ,
                                           AV151Talbcomwwds_14_tfalbcomfd_sel ,
                                           AV150Talbcomwwds_13_tfalbcomfd ,
                                           AV153Talbcomwwds_16_tfalbcomfdd_sel ,
                                           AV152Talbcomwwds_15_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV138Talbcomwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV141Talbcomwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Talbcomwwds_4_filterfulltext), "%", "") ;
      lV148Talbcomwwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV148Talbcomwwds_11_tfclinom), 30, "%") ;
      lV150Talbcomwwds_13_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV150Talbcomwwds_13_tfalbcomfd), 200, "%") ;
      lV152Talbcomwwds_15_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV152Talbcomwwds_15_tfalbcomfdd), 200, "%") ;
      /* Using cursor H00NG3 */
      pr_default.execute(1, new Object[] {AV138Talbcomwwds_1_albcompri, AV139Talbcomwwds_2_albcomfch, AV140Talbcomwwds_3_albcomfch_to, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, lV141Talbcomwwds_4_filterfulltext, Integer.valueOf(AV142Talbcomwwds_5_tfalbcomcod), Integer.valueOf(AV143Talbcomwwds_6_tfalbcomcod_to), AV144Talbcomwwds_7_tfalbcomfch, Integer.valueOf(AV146Talbcomwwds_9_tfclicod), Integer.valueOf(AV147Talbcomwwds_10_tfclicod_to), lV148Talbcomwwds_11_tfclinom, AV149Talbcomwwds_12_tfclinom_sel, lV150Talbcomwwds_13_tfalbcomfd, AV151Talbcomwwds_14_tfalbcomfd_sel, lV152Talbcomwwds_15_tfalbcomfdd, AV153Talbcomwwds_16_tfalbcomfdd_sel});
      GRID_nRecordCount = H00NG3_AGRID_nRecordCount[0] ;
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
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV154Pgmname = "TALBCOMWW" ;
      Gx_err = (short)(0) ;
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupNG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e21NG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV42ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV112DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV39ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_53 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_53"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV114GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV115GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV125AlbComFch = localUtil.ctod( httpContext.cgiGet( "vALBCOMFCH"), 0) ;
         AV126AlbComFch_To = localUtil.ctod( httpContext.cgiGet( "vALBCOMFCH_TO"), 0) ;
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
         cmbavAlbcompri.setName( cmbavAlbcompri.getInternalname() );
         cmbavAlbcompri.setValue( httpContext.cgiGet( cmbavAlbcompri.getInternalname()) );
         AV124AlbComPri = httpContext.cgiGet( cmbavAlbcompri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
         AV135AlbComFch_RangeText = httpContext.cgiGet( edtavAlbcomfch_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135AlbComFch_RangeText", AV135AlbComFch_RangeText);
         AV133FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMFCHAUXDATE");
            GX_FocusControl = edtavDdo_albcomfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51DDO_AlbComFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_AlbComFchAuxDate", localUtil.format(AV51DDO_AlbComFchAuxDate, "99/99/99"));
         }
         else
         {
            AV51DDO_AlbComFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_AlbComFchAuxDate", localUtil.format(AV51DDO_AlbComFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV133FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBCOMFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV125AlbComFch)) ) )
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
      e21NG2 ();
      if (returnInSub) return;
   }

   public void e21NG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV127Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbcomww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV127Station = GXt_char1 ;
      GXv_char2[0] = AV128EmprCod ;
      GXv_char3[0] = AV129EmprNom ;
      GXv_char4[0] = AV130UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV127Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbcomww_impl.this.AV128EmprCod = GXv_char2[0] ;
      talbcomww_impl.this.AV129EmprNom = GXv_char3[0] ;
      talbcomww_impl.this.AV130UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV131Tinamar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV128EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      talbcomww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV131Tinamar = GXt_int5 ;
      GXt_int5 = (byte)(AV132Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV128EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      talbcomww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV132Carvema = GXt_int5 ;
      AV124AlbComPri = ((AV131Tinamar==1)||(AV132Carvema==1) ? "0" : "1") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
      cmbavAlbcompri.setEnabled( (((AV131Tinamar==1)||(AV132Carvema==1) ? false : true) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbcompri.getEnabled(), 5, 0), true);
      GXt_char1 = AV127Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      talbcomww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV127Station = GXt_char1 ;
      GXv_char4[0] = AV128EmprCod ;
      GXv_char3[0] = AV129EmprNom ;
      GXv_char2[0] = AV130UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV127Station, GXv_char4, GXv_char3, GXv_char2) ;
      talbcomww_impl.this.AV128EmprCod = GXv_char4[0] ;
      talbcomww_impl.this.AV129EmprNom = GXv_char3[0] ;
      talbcomww_impl.this.AV130UsurCod = GXv_char2[0] ;
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
      this.executeUsercontrolMethod("", false, "ALBCOMFCH_RANGEPICKERContainer", "Attach", "", new Object[] {edtavAlbcomfch_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Albaranes Comerciales v01", "") );
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
         AV14OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV112DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV112DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e22NG2( )
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
      if ( AV44ManageFiltersExecutionStep == 1 )
      {
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV44ManageFiltersExecutionStep == 2 )
      {
         AV44ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("TALBCOMWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("TALBCOMWWColumnsSelector") ;
         AV39ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbComCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Visible), 5, 0), !bGXsfl_53_Refreshing);
      edtAlbComFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Visible), 5, 0), !bGXsfl_53_Refreshing);
      cmbAlbComPri.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbComPri.getVisible(), 5, 0), !bGXsfl_53_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_53_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_53_Refreshing);
      edtAlbComFd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFd_Visible), 5, 0), !bGXsfl_53_Refreshing);
      edtAlbComFdD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFdD_Visible), 5, 0), !bGXsfl_53_Refreshing);
      AV114GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridCurrentPage), 10, 0));
      AV115GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115GridPageCount), 10, 0));
      AV138Talbcomwwds_1_albcompri = AV124AlbComPri ;
      AV139Talbcomwwds_2_albcomfch = AV125AlbComFch ;
      AV140Talbcomwwds_3_albcomfch_to = AV126AlbComFch_To ;
      AV141Talbcomwwds_4_filterfulltext = AV133FilterFullText ;
      AV142Talbcomwwds_5_tfalbcomcod = AV46TFAlbComCod ;
      AV143Talbcomwwds_6_tfalbcomcod_to = AV47TFAlbComCod_To ;
      AV144Talbcomwwds_7_tfalbcomfch = AV49TFAlbComFch ;
      AV145Talbcomwwds_8_tfalbcompri_sels = AV122TFAlbComPri_Sels ;
      AV146Talbcomwwds_9_tfclicod = AV57TFCliCod ;
      AV147Talbcomwwds_10_tfclicod_to = AV58TFCliCod_To ;
      AV148Talbcomwwds_11_tfclinom = AV60TFCliNom ;
      AV149Talbcomwwds_12_tfclinom_sel = AV61TFCliNom_Sel ;
      AV150Talbcomwwds_13_tfalbcomfd = AV106TFAlbComFd ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = AV107TFAlbComFd_Sel ;
      AV152Talbcomwwds_15_tfalbcomfdd = AV109TFAlbComFdD ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = AV110TFAlbComFdD_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12NG2( )
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
         AV113PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV113PageToGo) ;
      }
   }

   public void e13NG2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15NG2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComCod") == 0 )
         {
            AV46TFAlbComCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbComCod), 8, 0));
            AV47TFAlbComCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFch") == 0 )
         {
            AV49TFAlbComFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbComFch", localUtil.format(AV49TFAlbComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComPri") == 0 )
         {
            AV121TFAlbComPri_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFAlbComPri_SelsJson", AV121TFAlbComPri_SelsJson);
            AV122TFAlbComPri_Sels.fromJSonString(AV121TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV57TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
            AV58TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV60TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliNom", AV60TFCliNom);
            AV61TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFd") == 0 )
         {
            AV106TFAlbComFd = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFAlbComFd", AV106TFAlbComFd);
            AV107TFAlbComFd_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbComFd_Sel", AV107TFAlbComFd_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFdD") == 0 )
         {
            AV109TFAlbComFdD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFAlbComFdD", AV109TFAlbComFdD);
            AV110TFAlbComFdD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFAlbComFdD_Sel", AV110TFAlbComFdD_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122TFAlbComPri_Sels", AV122TFAlbComPri_Sels);
   }

   private void e23NG2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV116Update = "<i class=\"fa fa-pen\"></i>" ;
      AV117Delete = "<i class=\"fa fa-times\"></i>" ;
      AV123Observaciones = httpContext.getMessage( "Observaciones", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavObservaciones_Internalname, AV123Observaciones);
      if ( A10739AlbComEAT == 0 )
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'TALBCOM'),28),t(',',7),t([ 68,'Update' ],44),t(',',7),t(396,2),t(',',7),t(14,2),t(',',7),t(22,2),t(')',4) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
      }
      else
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'TALBCOM'),28),t(',',7),t([ 68,'Display' ],44),t(',',7),t(396,2),t(',',7),t(14,2),t(',',7),t(22,2),t(')',4) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
      }
      edtavObservaciones_Link = formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"})  ;
      if ( 0 > 1 )
      {
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         AV123Observaciones = httpContext.getMessage( "Observaciones", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavObservaciones_Internalname, AV123Observaciones);
         edtavObservaciones_Link = formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(53) ;
      }
      sendrow_532( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_53_Refreshing )
      {
         httpContext.doAjaxLoad(53, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV134GridActions, 4, 0)) );
   }

   public void e16NG2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TALBCOMWWColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11NG2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBCOMWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV154Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBCOMWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TALBCOMWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         talbcomww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV43ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV43ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV154Pgmname+"GridState", AV43ManageFiltersXml) ;
            AV10GridState.fromxml(AV43ManageFiltersXml, null, null);
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
      cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122TFAlbComPri_Sels", AV122TFAlbComPri_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e17NG2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbcom", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV124AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e18NG2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV36ErrorMessage ;
      new app.talbcomwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      talbcomww_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      talbcomww_impl.this.AV36ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV35ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV35ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV36ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122TFAlbComPri_Sels", AV122TFAlbComPri_Sels);
      cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
   }

   public void e19NG2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.talbcomwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122TFAlbComPri_Sels", AV122TFAlbComPri_Sels);
      cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
   }

   public void e20NG2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.talbcomwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122TFAlbComPri_Sels", AV122TFAlbComPri_Sels);
      cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
   }

   public void e14NG2( )
   {
      /* Albcomfch_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125AlbComFch", localUtil.format(AV125AlbComFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV126AlbComFch_To", localUtil.format(AV126AlbComFch_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV133FilterFullText, AV125AlbComFch, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV124AlbComPri, AV126AlbComFch_To, AV46TFAlbComCod, AV47TFAlbComCod_To, AV49TFAlbComFch, AV122TFAlbComPri_Sels, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV106TFAlbComFd, AV107TFAlbComFd_Sel, AV109TFAlbComFdD, AV110TFAlbComFdD_Sel, AV154Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
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
      AV39ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbComCod", "", "Nº Documento", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbComFch", "", "Fecha", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbComPri", "", "", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbComFd", "", "Hash", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "AlbComFdD", "", "Hash Ctrl", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBCOMWWColumnsSelector", GXv_char4) ;
      talbcomww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV40ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV40ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV39ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV40ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV39ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV42ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TALBCOMWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV124AlbComPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
      AV125AlbComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125AlbComFch", localUtil.format(AV125AlbComFch, "99/99/99"));
      AV126AlbComFch_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126AlbComFch_To", localUtil.format(AV126AlbComFch_To, "99/99/99"));
      AV133FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
      AV46TFAlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbComCod), 8, 0));
      AV47TFAlbComCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbComCod_To), 8, 0));
      AV49TFAlbComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbComFch", localUtil.format(AV49TFAlbComFch, "99/99/99"));
      AV122TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV57TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
      AV58TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
      AV60TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliNom", AV60TFCliNom);
      AV61TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
      AV106TFAlbComFd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFAlbComFd", AV106TFAlbComFd);
      AV107TFAlbComFd_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbComFd_Sel", AV107TFAlbComFd_Sel);
      AV109TFAlbComFdD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109TFAlbComFdD", AV109TFAlbComFdD);
      AV110TFAlbComFdD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFAlbComFdD_Sel", AV110TFAlbComFdD_Sel);
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
      callWebObject(formatLink("app.talbcom", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV124AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbcom", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV124AlbComPri))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV154Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV154Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV154Pgmname+"GridState"), null, null);
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
      AV155GXV1 = 1 ;
      while ( AV155GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV155GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV124AlbComPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV125AlbComFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125AlbComFch", localUtil.format(AV125AlbComFch, "99/99/99"));
            AV126AlbComFch_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126AlbComFch_To", localUtil.format(AV126AlbComFch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV133FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV46TFAlbComCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbComCod), 8, 0));
            AV47TFAlbComCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV49TFAlbComFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbComFch", localUtil.format(AV49TFAlbComFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV121TFAlbComPri_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFAlbComPri_SelsJson", AV121TFAlbComPri_SelsJson);
            AV122TFAlbComPri_Sels.fromJSonString(AV121TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV57TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
            AV58TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV60TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCliNom", AV60TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV61TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV106TFAlbComFd = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFAlbComFd", AV106TFAlbComFd);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV107TFAlbComFd_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbComFd_Sel", AV107TFAlbComFd_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV109TFAlbComFdD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109TFAlbComFdD", AV109TFAlbComFdD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV110TFAlbComFdD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFAlbComFdD_Sel", AV110TFAlbComFdD_Sel);
         }
         AV155GXV1 = (int)(AV155GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV122TFAlbComPri_Sels.size()==0), AV121TFAlbComPri_SelsJson, GXv_char4) ;
      talbcomww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, GXv_char3) ;
      talbcomww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFAlbComFd_Sel)==0), AV107TFAlbComFd_Sel, GXv_char2) ;
      talbcomww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFAlbComFdD_Sel)==0), AV110TFAlbComFdD_Sel, GXv_char17) ;
      talbcomww_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"||"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFCliNom)==0), AV60TFCliNom, GXv_char17) ;
      talbcomww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV106TFAlbComFd)==0), AV106TFAlbComFd, GXv_char4) ;
      talbcomww_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFAlbComFdD)==0), AV109TFAlbComFdD, GXv_char3) ;
      talbcomww_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV46TFAlbComCod) ? "" : GXutil.str( AV46TFAlbComCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFAlbComFch)) ? "" : localUtil.dtoc( AV49TFAlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+((0==AV57TFCliCod) ? "" : GXutil.str( AV57TFCliCod, 6, 0))+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV47TFAlbComCod_To) ? "" : GXutil.str( AV47TFAlbComCod_To, 8, 0))+"|||"+((0==AV58TFCliCod_To) ? "" : GXutil.str( AV58TFCliCod_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV154Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "ALBCOMPRI", "", !(GXutil.strcmp("", AV124AlbComPri)==0), (short)(0), AV124AlbComPri, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "ALBCOMFCH", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125AlbComFch))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126AlbComFch_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV125AlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV126AlbComFch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV133FilterFullText)==0), (short)(0), AV133FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBCOMCOD", "", !((0==AV46TFAlbComCod)&&(0==AV47TFAlbComCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFAlbComCod, 8, 0)), GXutil.trim( GXutil.str( AV47TFAlbComCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBCOMFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFAlbComFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFAlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBCOMPRI_SEL", "", !(AV122TFAlbComPri_Sels.size()==0), (short)(0), AV122TFAlbComPri_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLICOD", "", !((0==AV57TFCliCod)&&(0==AV58TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV58TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCLINOM", "", !(GXutil.strcmp("", AV60TFCliNom)==0), (short)(0), AV60TFCliNom, "", !(GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBCOMFD", "", !(GXutil.strcmp("", AV106TFAlbComFd)==0), (short)(0), AV106TFAlbComFd, "", !(GXutil.strcmp("", AV107TFAlbComFd_Sel)==0), AV107TFAlbComFd_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFALBCOMFDD", "", !(GXutil.strcmp("", AV109TFAlbComFdD)==0), (short)(0), AV109TFAlbComFdD, "", !(GXutil.strcmp("", AV110TFAlbComFdD_Sel)==0), AV110TFAlbComFdD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV154Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV154Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBCOM" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_NG2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV42ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_NG2( true) ;
      }
      else
      {
         wb_table2_32_NG2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_NG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_NG2e( true) ;
      }
      else
      {
         wb_table1_27_NG2e( false) ;
      }
   }

   public void wb_table2_32_NG2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbcompri.getInternalname(), httpContext.getMessage( "Alb Com Pri", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_53_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbcompri, cmbavAlbcompri.getInternalname(), GXutil.rtrim( AV124AlbComPri), 1, cmbavAlbcompri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbcompri.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_TALBCOMWW.htm");
         cmbavAlbcompri.setValue( GXutil.rtrim( AV124AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomfch_rangetext_Internalname, httpContext.getMessage( "Alb Com Fch_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_53_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomfch_rangetext_Internalname, AV135AlbComFch_RangeText, GXutil.rtrim( localUtil.format( AV135AlbComFch_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavAlbcomfch_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbcomfch_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_53_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV133FilterFullText, GXutil.rtrim( localUtil.format( AV133FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TALBCOMWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_NG2e( true) ;
      }
      else
      {
         wb_table2_32_NG2e( false) ;
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
      paNG2( ) ;
      wsNG2( ) ;
      weNG2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116122881", true, true);
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
      httpContext.AddJavascriptSource("talbcomww.js", "?202682116122881", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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

   public void subsflControlProps_532( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_53_idx );
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_53_idx ;
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_53_idx ;
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_53_idx ;
      cmbAlbComEst.setInternalname( "ALBCOMEST_"+sGXsfl_53_idx );
      cmbAlbComPri.setInternalname( "ALBCOMPRI_"+sGXsfl_53_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_53_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_53_idx ;
      edtAlbComFd_Internalname = "ALBCOMFD_"+sGXsfl_53_idx ;
      edtAlbComFdD_Internalname = "ALBCOMFDD_"+sGXsfl_53_idx ;
   }

   public void subsflControlProps_fel_532( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_53_fel_idx );
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_53_fel_idx ;
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_53_fel_idx ;
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_53_fel_idx ;
      cmbAlbComEst.setInternalname( "ALBCOMEST_"+sGXsfl_53_fel_idx );
      cmbAlbComPri.setInternalname( "ALBCOMPRI_"+sGXsfl_53_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_53_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_53_fel_idx ;
      edtAlbComFd_Internalname = "ALBCOMFD_"+sGXsfl_53_fel_idx ;
      edtAlbComFdD_Internalname = "ALBCOMFDD_"+sGXsfl_53_fel_idx ;
   }

   public void sendrow_532( )
   {
      subsflControlProps_532( ) ;
      wbNG0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_53_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_53_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_53_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_53_idx+"',53)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_53_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV134GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV134GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV134GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e24ng2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV134GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_53_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObservaciones_Enabled!=0)&&(edtavObservaciones_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_53_idx+"',53)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_Internalname,GXutil.rtrim( AV123Observaciones),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObservaciones_Enabled!=0)&&(edtavObservaciones_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'",edtavObservaciones_Link,"","","",edtavObservaciones_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavObservaciones_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbComCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFch_Internalname,localUtil.format(A17AlbComFch, "99/99/99"),localUtil.format( A17AlbComFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbComEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMEST_" + sGXsfl_53_idx ;
            cmbAlbComEst.setName( GXCCtl );
            cmbAlbComEst.setWebtags( "" );
            cmbAlbComEst.addItem("0", httpContext.getMessage( "Generado", ""), (short)(0));
            cmbAlbComEst.addItem("1", httpContext.getMessage( "Impreso", ""), (short)(0));
            cmbAlbComEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
            if ( cmbAlbComEst.getItemCount() > 0 )
            {
               A16AlbComEst = (byte)(GXutil.lval( cmbAlbComEst.getValidValue(GXutil.trim( GXutil.str( A16AlbComEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComEst,cmbAlbComEst.getInternalname(),GXutil.trim( GXutil.str( A16AlbComEst, 1, 0)),Integer.valueOf(1),cmbAlbComEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComEst.setValue( GXutil.trim( GXutil.str( A16AlbComEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEst.getInternalname(), "Values", cmbAlbComEst.ToJavascriptSource(), !bGXsfl_53_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbComPri.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbComPri.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMPRI_" + sGXsfl_53_idx ;
            cmbAlbComPri.setName( GXCCtl );
            cmbAlbComPri.setWebtags( "" );
            cmbAlbComPri.addItem("1", httpContext.getMessage( "GR", ""), (short)(0));
            cmbAlbComPri.addItem("0", httpContext.getMessage( "GT", ""), (short)(0));
            if ( cmbAlbComPri.getItemCount() > 0 )
            {
               A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComPri,cmbAlbComPri.getInternalname(),GXutil.rtrim( A22AlbComPri),Integer.valueOf(1),cmbAlbComPri.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbComPri.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), !bGXsfl_53_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComFd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFd_Internalname,GXutil.rtrim( A10014AlbComFd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbComFd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComFdD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFdD_Internalname,GXutil.rtrim( A10015AlbComFdD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFdD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbComFdD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesNG2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_53_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
      }
      /* End function sendrow_532 */
   }

   public void startgridcontrol53( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"53\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbComPri.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComFd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComFdD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash Ctrl", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV134GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV123Observaciones));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavObservaciones_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A17AlbComFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A22AlbComPri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbComPri.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10014AlbComFd));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComFd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10015AlbComFdD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComFdD_Visible, (byte)(5), (byte)(0), ".", "")));
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
      cmbavAlbcompri.setInternalname( "vALBCOMPRI" );
      edtavAlbcomfch_rangetext_Internalname = "vALBCOMFCH_RANGETEXT" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      cmbAlbComEst.setInternalname( "ALBCOMEST" );
      cmbAlbComPri.setInternalname( "ALBCOMPRI" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbComFd_Internalname = "ALBCOMFD" ;
      edtAlbComFdD_Internalname = "ALBCOMFDD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Albcomfch_rangepicker_Internalname = "ALBCOMFCH_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albcomfchauxdate_Internalname = "vDDO_ALBCOMFCHAUXDATE" ;
      divDdo_albcomfchauxdates_Internalname = "DDO_ALBCOMFCHAUXDATES" ;
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
      edtAlbComFdD_Jsonclick = "" ;
      edtAlbComFd_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbAlbComPri.setJsonclick( "" );
      cmbAlbComEst.setJsonclick( "" );
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComCod_Jsonclick = "" ;
      edtavObservaciones_Jsonclick = "" ;
      edtavObservaciones_Visible = -1 ;
      edtavObservaciones_Link = "" ;
      edtavObservaciones_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavAlbcomfch_rangetext_Jsonclick = "" ;
      edtavAlbcomfch_rangetext_Enabled = 1 ;
      cmbavAlbcompri.setJsonclick( "" );
      edtAlbComFdD_Visible = -1 ;
      edtAlbComFd_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      cmbAlbComPri.setVisible( -1 );
      edtAlbComFch_Visible = -1 ;
      edtAlbComCod_Visible = -1 ;
      cmbavAlbcompri.setEnabled( 1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albcomfchauxdate_Jsonclick = "" ;
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
      Ddo_grid_Datalistproc = "TALBCOMWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||1:GR,0:GT||||" ;
      Ddo_grid_Allowmultipleselection = "||T||||" ;
      Ddo_grid_Datalisttype = "||FixedValues||Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T||T|T|T" ;
      Ddo_grid_Filterisrange = "T|||T|||" ;
      Ddo_grid_Filtertype = "Numeric|Date||Numeric|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T|T||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7" ;
      Ddo_grid_Columnids = "2:AlbComCod|3:AlbComFch|5:AlbComPri|6:CliCod|7:CliNom|8:AlbComFd|9:AlbComFdD" ;
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
      Form.setCaption( httpContext.getMessage( " Albaranes Comerciales v01", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbcompri.setName( "vALBCOMPRI" );
      cmbavAlbcompri.setWebtags( "" );
      cmbavAlbcompri.addItem("1", httpContext.getMessage( "GR", ""), (short)(0));
      cmbavAlbcompri.addItem("0", httpContext.getMessage( "GT", ""), (short)(0));
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV124AlbComPri = cmbavAlbcompri.getValidValue(AV124AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124AlbComPri", AV124AlbComPri);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_53_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV134GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV134GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134GridActions), 4, 0));
      }
      GXCCtl = "ALBCOMEST_" + sGXsfl_53_idx ;
      cmbAlbComEst.setName( GXCCtl );
      cmbAlbComEst.setWebtags( "" );
      cmbAlbComEst.addItem("0", httpContext.getMessage( "Generado", ""), (short)(0));
      cmbAlbComEst.addItem("1", httpContext.getMessage( "Impreso", ""), (short)(0));
      cmbAlbComEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
      if ( cmbAlbComEst.getItemCount() > 0 )
      {
         A16AlbComEst = (byte)(GXutil.lval( cmbAlbComEst.getValidValue(GXutil.trim( GXutil.str( A16AlbComEst, 1, 0))))) ;
      }
      GXCCtl = "ALBCOMPRI_" + sGXsfl_53_idx ;
      cmbAlbComPri.setName( GXCCtl );
      cmbAlbComPri.setWebtags( "" );
      cmbAlbComPri.addItem("1", httpContext.getMessage( "GR", ""), (short)(0));
      cmbAlbComPri.addItem("0", httpContext.getMessage( "GT", ""), (short)(0));
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbComCod_Visible',ctrl:'ALBCOMCOD',prop:'Visible'},{av:'edtAlbComFch_Visible',ctrl:'ALBCOMFCH',prop:'Visible'},{av:'cmbAlbComPri'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbComFd_Visible',ctrl:'ALBCOMFD',prop:'Visible'},{av:'edtAlbComFdD_Visible',ctrl:'ALBCOMFDD',prop:'Visible'},{av:'AV114GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV115GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      setEventMetadata("GRID.LOAD","{handler:'e23NG2',iparms:[{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbAlbComPri'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV123Observaciones',fld:'vOBSERVACIONES',pic:''},{ctrl:'vUPDATE',prop:'Link'},{av:'edtavObservaciones_Link',ctrl:'vOBSERVACIONES',prop:'Link'},{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbComCod_Visible',ctrl:'ALBCOMCOD',prop:'Visible'},{av:'edtAlbComFch_Visible',ctrl:'ALBCOMFCH',prop:'Visible'},{av:'cmbAlbComPri'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbComFd_Visible',ctrl:'ALBCOMFD',prop:'Visible'},{av:'edtAlbComFdD_Visible',ctrl:'ALBCOMFDD',prop:'Visible'},{av:'AV114GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV115GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbComCod_Visible',ctrl:'ALBCOMCOD',prop:'Visible'},{av:'edtAlbComFch_Visible',ctrl:'ALBCOMFCH',prop:'Visible'},{av:'cmbAlbComPri'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbComFd_Visible',ctrl:'ALBCOMFD',prop:'Visible'},{av:'edtAlbComFdD_Visible',ctrl:'ALBCOMFDD',prop:'Visible'},{av:'AV114GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV115GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e24NG2',iparms:[{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV134GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e17NG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e18NG2',iparms:[{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e19NG2',iparms:[{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e20NG2',iparms:[{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV121TFAlbComPri_SelsJson',fld:'vTFALBCOMPRI_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("ALBCOMFCH_RANGEPICKER.DATERANGECHANGED","{handler:'e14NG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbavAlbcompri'},{av:'AV124AlbComPri',fld:'vALBCOMPRI',pic:'9'},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV46TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbComFch',fld:'vTFALBCOMFCH',pic:''},{av:'AV122TFAlbComPri_Sels',fld:'vTFALBCOMPRI_SELS',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV106TFAlbComFd',fld:'vTFALBCOMFD',pic:''},{av:'AV107TFAlbComFd_Sel',fld:'vTFALBCOMFD_SEL',pic:''},{av:'AV109TFAlbComFdD',fld:'vTFALBCOMFDD',pic:''},{av:'AV110TFAlbComFdD_Sel',fld:'vTFALBCOMFDD_SEL',pic:''},{av:'AV154Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ALBCOMFCH_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV125AlbComFch',fld:'vALBCOMFCH',pic:''},{av:'AV126AlbComFch_To',fld:'vALBCOMFCH_TO',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbComCod_Visible',ctrl:'ALBCOMCOD',prop:'Visible'},{av:'edtAlbComFch_Visible',ctrl:'ALBCOMFCH',prop:'Visible'},{av:'cmbAlbComPri'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbComFd_Visible',ctrl:'ALBCOMFD',prop:'Visible'},{av:'edtAlbComFdD_Visible',ctrl:'ALBCOMFDD',prop:'Visible'},{av:'AV114GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV115GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_ALBCOMPRI","{handler:'validv_Albcompri',iparms:[]");
      setEventMetadata("VALIDV_ALBCOMPRI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcomfdd',iparms:[]");
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
      AV133FilterFullText = "" ;
      AV125AlbComFch = GXutil.nullDate() ;
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV124AlbComPri = "" ;
      AV126AlbComFch_To = GXutil.nullDate() ;
      AV49TFAlbComFch = GXutil.nullDate() ;
      AV122TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60TFCliNom = "" ;
      AV61TFCliNom_Sel = "" ;
      AV106TFAlbComFd = "" ;
      AV107TFAlbComFd_Sel = "" ;
      AV109TFAlbComFdD = "" ;
      AV110TFAlbComFdD_Sel = "" ;
      AV154Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV112DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV121TFAlbComPri_SelsJson = "" ;
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
      ucAlbcomfch_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV51DDO_AlbComFchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV123Observaciones = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A22AlbComPri = "" ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV145Talbcomwwds_8_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV141Talbcomwwds_4_filterfulltext = "" ;
      lV148Talbcomwwds_11_tfclinom = "" ;
      lV150Talbcomwwds_13_tfalbcomfd = "" ;
      lV152Talbcomwwds_15_tfalbcomfdd = "" ;
      AV139Talbcomwwds_2_albcomfch = GXutil.nullDate() ;
      AV140Talbcomwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV141Talbcomwwds_4_filterfulltext = "" ;
      AV144Talbcomwwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV149Talbcomwwds_12_tfclinom_sel = "" ;
      AV148Talbcomwwds_11_tfclinom = "" ;
      AV151Talbcomwwds_14_tfalbcomfd_sel = "" ;
      AV150Talbcomwwds_13_tfalbcomfd = "" ;
      AV153Talbcomwwds_16_tfalbcomfdd_sel = "" ;
      AV152Talbcomwwds_15_tfalbcomfdd = "" ;
      AV138Talbcomwwds_1_albcompri = "" ;
      H00NG2_A10739AlbComEAT = new byte[1] ;
      H00NG2_A396EmprCod = new String[] {""} ;
      H00NG2_A10015AlbComFdD = new String[] {""} ;
      H00NG2_A10014AlbComFd = new String[] {""} ;
      H00NG2_A279CliNom = new String[] {""} ;
      H00NG2_A252CliCod = new int[1] ;
      H00NG2_A22AlbComPri = new String[] {""} ;
      H00NG2_A16AlbComEst = new byte[1] ;
      H00NG2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00NG2_A14AlbComCod = new int[1] ;
      H00NG3_AGRID_nRecordCount = new long[1] ;
      AV135AlbComFch_RangeText = "" ;
      AV127Station = "" ;
      AV128EmprCod = "" ;
      AV129EmprNom = "" ;
      AV130UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV116Update = "" ;
      AV117Delete = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV43ManageFiltersXml = "" ;
      AV35ExcelFilename = "" ;
      AV36ErrorMessage = "" ;
      AV38UserCustomValue = "" ;
      AV40ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbcomww__default(),
         new Object[] {
             new Object[] {
            H00NG2_A10739AlbComEAT, H00NG2_A396EmprCod, H00NG2_A10015AlbComFdD, H00NG2_A10014AlbComFd, H00NG2_A279CliNom, H00NG2_A252CliCod, H00NG2_A22AlbComPri, H00NG2_A16AlbComEst, H00NG2_A17AlbComFch, H00NG2_A14AlbComCod
            }
            , new Object[] {
            H00NG3_AGRID_nRecordCount
            }
         }
      );
      AV154Pgmname = "TALBCOMWW" ;
      /* GeneXus formulas. */
      AV154Pgmname = "TALBCOMWW" ;
      Gx_err = (short)(0) ;
      edtavObservaciones_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A10739AlbComEAT ;
   private byte A16AlbComEst ;
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
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV134GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV131Tinamar ;
   private short AV132Carvema ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_53 ;
   private int nGXsfl_53_idx=1 ;
   private int AV46TFAlbComCod ;
   private int AV47TFAlbComCod_To ;
   private int AV57TFCliCod ;
   private int AV58TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavObservaciones_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV145Talbcomwwds_8_tfalbcompri_sels_size ;
   private int AV142Talbcomwwds_5_tfalbcomcod ;
   private int AV143Talbcomwwds_6_tfalbcomcod_to ;
   private int AV146Talbcomwwds_9_tfclicod ;
   private int AV147Talbcomwwds_10_tfclicod_to ;
   private int edtAlbComCod_Visible ;
   private int edtAlbComFch_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbComFd_Visible ;
   private int edtAlbComFdD_Visible ;
   private int AV113PageToGo ;
   private int AV155GXV1 ;
   private int edtavAlbcomfch_rangetext_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavObservaciones_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV114GridCurrentPage ;
   private long AV115GridPageCount ;
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
   private String sGXsfl_53_idx="0001" ;
   private String AV124AlbComPri ;
   private String AV60TFCliNom ;
   private String AV61TFCliNom_Sel ;
   private String AV106TFAlbComFd ;
   private String AV107TFAlbComFd_Sel ;
   private String AV109TFAlbComFdD ;
   private String AV110TFAlbComFdD_Sel ;
   private String AV154Pgmname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Albcomfch_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albcomfchauxdates_Internalname ;
   private String edtavDdo_albcomfchauxdate_Internalname ;
   private String edtavDdo_albcomfchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV123Observaciones ;
   private String edtavObservaciones_Internalname ;
   private String edtAlbComCod_Internalname ;
   private String edtAlbComFch_Internalname ;
   private String A22AlbComPri ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A10014AlbComFd ;
   private String edtAlbComFd_Internalname ;
   private String A10015AlbComFdD ;
   private String edtAlbComFdD_Internalname ;
   private String scmdbuf ;
   private String lV148Talbcomwwds_11_tfclinom ;
   private String lV150Talbcomwwds_13_tfalbcomfd ;
   private String lV152Talbcomwwds_15_tfalbcomfdd ;
   private String AV149Talbcomwwds_12_tfclinom_sel ;
   private String AV148Talbcomwwds_11_tfclinom ;
   private String AV151Talbcomwwds_14_tfalbcomfd_sel ;
   private String AV150Talbcomwwds_13_tfalbcomfd ;
   private String AV153Talbcomwwds_16_tfalbcomfdd_sel ;
   private String AV152Talbcomwwds_15_tfalbcomfdd ;
   private String AV138Talbcomwwds_1_albcompri ;
   private String edtavAlbcomfch_rangetext_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV127Station ;
   private String AV128EmprCod ;
   private String AV129EmprNom ;
   private String AV130UsurCod ;
   private String AV116Update ;
   private String AV117Delete ;
   private String edtavObservaciones_Link ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavAlbcomfch_rangetext_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_53_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavObservaciones_Jsonclick ;
   private String edtAlbComCod_Jsonclick ;
   private String edtAlbComFch_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbComFd_Jsonclick ;
   private String edtAlbComFdD_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV125AlbComFch ;
   private java.util.Date AV126AlbComFch_To ;
   private java.util.Date AV49TFAlbComFch ;
   private java.util.Date AV51DDO_AlbComFchAuxDate ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV139Talbcomwwds_2_albcomfch ;
   private java.util.Date AV140Talbcomwwds_3_albcomfch_to ;
   private java.util.Date AV144Talbcomwwds_7_tfalbcomfch ;
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
   private boolean bGXsfl_53_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV121TFAlbComPri_SelsJson ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV133FilterFullText ;
   private String lV141Talbcomwwds_4_filterfulltext ;
   private String AV141Talbcomwwds_4_filterfulltext ;
   private String AV135AlbComFch_RangeText ;
   private String AV35ExcelFilename ;
   private String AV36ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucAlbcomfch_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private GXSimpleCollection<String> AV145Talbcomwwds_8_tfalbcompri_sels ;
   private HTMLChoice cmbavAlbcompri ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbComEst ;
   private HTMLChoice cmbAlbComPri ;
   private IDataStoreProvider pr_default ;
   private byte[] H00NG2_A10739AlbComEAT ;
   private String[] H00NG2_A396EmprCod ;
   private String[] H00NG2_A10015AlbComFdD ;
   private String[] H00NG2_A10014AlbComFd ;
   private String[] H00NG2_A279CliNom ;
   private int[] H00NG2_A252CliCod ;
   private String[] H00NG2_A22AlbComPri ;
   private byte[] H00NG2_A16AlbComEst ;
   private java.util.Date[] H00NG2_A17AlbComFch ;
   private int[] H00NG2_A14AlbComCod ;
   private long[] H00NG3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV122TFAlbComPri_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV112DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class talbcomww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00NG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV145Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV139Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV140Talbcomwwds_3_albcomfch_to ,
                                          String AV141Talbcomwwds_4_filterfulltext ,
                                          int AV142Talbcomwwds_5_tfalbcomcod ,
                                          int AV143Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV144Talbcomwwds_7_tfalbcomfch ,
                                          int AV145Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV146Talbcomwwds_9_tfclicod ,
                                          int AV147Talbcomwwds_10_tfclicod_to ,
                                          String AV149Talbcomwwds_12_tfclinom_sel ,
                                          String AV148Talbcomwwds_11_tfclinom ,
                                          String AV151Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV150Talbcomwwds_13_tfalbcomfd ,
                                          String AV153Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV152Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV138Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[25];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbComEAT, T1.EmprCod, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComPri, T1.AlbComEst, T1.AlbComFch, T1.AlbComCod" ;
      sFromString = " FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV139Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( AV145Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV145Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV146Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV147Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV152Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComPri DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFdD DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H00NG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV145Talbcomwwds_8_tfalbcompri_sels ,
                                          java.util.Date AV139Talbcomwwds_2_albcomfch ,
                                          java.util.Date AV140Talbcomwwds_3_albcomfch_to ,
                                          String AV141Talbcomwwds_4_filterfulltext ,
                                          int AV142Talbcomwwds_5_tfalbcomcod ,
                                          int AV143Talbcomwwds_6_tfalbcomcod_to ,
                                          java.util.Date AV144Talbcomwwds_7_tfalbcomfch ,
                                          int AV145Talbcomwwds_8_tfalbcompri_sels_size ,
                                          int AV146Talbcomwwds_9_tfclicod ,
                                          int AV147Talbcomwwds_10_tfclicod_to ,
                                          String AV149Talbcomwwds_12_tfclinom_sel ,
                                          String AV148Talbcomwwds_11_tfclinom ,
                                          String AV151Talbcomwwds_14_tfalbcomfd_sel ,
                                          String AV150Talbcomwwds_13_tfalbcomfd ,
                                          String AV153Talbcomwwds_16_tfalbcomfdd_sel ,
                                          String AV152Talbcomwwds_15_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV138Talbcomwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[20];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV139Talbcomwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Talbcomwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Talbcomwwds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV142Talbcomwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (0==AV143Talbcomwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Talbcomwwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( AV145Talbcomwwds_8_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV145Talbcomwwds_8_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( ! (0==AV146Talbcomwwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV147Talbcomwwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbcomwwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbcomwwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbcomwwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbcomwwds_14_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbcomwwds_13_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbcomwwds_14_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Talbcomwwds_16_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV152Talbcomwwds_15_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Talbcomwwds_16_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H00NG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] );
            case 1 :
                  return conditional_H00NG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00NG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 200);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 200);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 200);
               }
               return;
      }
   }

}

