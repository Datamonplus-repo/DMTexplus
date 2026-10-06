package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calprd_trnww_impl extends GXDataArea
{
   public calprd_trnww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public calprd_trnww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_trnww_impl.class ));
   }

   public calprd_trnww_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbpropri = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
      cmbAlbMarca = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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
      AV28TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV29TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV30TFAlbProPri = httpContext.GetPar( "TFAlbProPri") ;
      AV31TFAlbProPri_Sel = httpContext.GetPar( "TFAlbProPri_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV90TFAlbProEst_Sels);
      AV34TFAlbProfch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProfch")) ;
      AV38TFAlbFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFAlbFecSal")) ;
      AV42TFAlbHorSal = httpContext.GetPar( "TFAlbHorSal") ;
      AV43TFAlbHorSal_Sel = httpContext.GetPar( "TFAlbHorSal_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV96TFAlbMarca_Sels);
      AV64TFAlbLic = httpContext.GetPar( "TFAlbLic") ;
      AV65TFAlbLic_Sel = httpContext.GetPar( "TFAlbLic_Sel") ;
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa19F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start19F2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.calprd_trnww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_50, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV84GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV85GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV28TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI", GXutil.rtrim( AV30TFAlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI_SEL", GXutil.rtrim( AV31TFAlbProPri_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROEST_SELS", AV90TFAlbProEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROEST_SELS", AV90TFAlbProEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFCH", localUtil.dtoc( AV34TFAlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBFECSAL", localUtil.dtoc( AV38TFAlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHORSAL", GXutil.rtrim( AV42TFAlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHORSAL_SEL", GXutil.rtrim( AV43TFAlbHorSal_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBMARCA_SELS", AV96TFAlbMarca_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBMARCA_SELS", AV96TFAlbMarca_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC", GXutil.rtrim( AV64TFAlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC_SEL", GXutil.rtrim( AV65TFAlbLic_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROEST_SELSJSON", AV89TFAlbProEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBMARCA_SELSJSON", AV95TFAlbMarca_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV94ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV88AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93Emprcod));
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
         we19F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt19F2( ) ;
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
      return formatLink("app.calprd_trnww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Calprd_TRNWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Albaran de Produccion", "") ;
   }

   public void wb19F0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregarbc_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar BC", ""), bttBtnagregarbc_Jsonclick, 5, httpContext.getMessage( "Agregar BC", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOAGREGARBC\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_19F2( true) ;
      }
      else
      {
         wb_table1_27_19F2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_19F2e( boolean wbgen )
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
         startgridcontrol50( ) ;
      }
      if ( wbEnd == 50 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_50 = (int)(nGXsfl_50_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV84GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV85GridPageCount);
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprofchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprofchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprofchauxdate_Internalname, localUtil.format(AV36DDO_AlbProfchAuxDate, "99/99/99"), localUtil.format( AV36DDO_AlbProfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprofchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprofchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albfecsalauxdate_Internalname, localUtil.format(AV40DDO_AlbFecSalAuxDate, "99/99/99"), localUtil.format( AV40DDO_AlbFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 50 )
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

   public void start19F2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Albaran de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup19F0( ) ;
   }

   public void ws19F2( )
   {
      start19F2( ) ;
      evt19F2( ) ;
   }

   public void evt19F2( )
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
                           e1119F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1219F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1319F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1419F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1519F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAGREGARBC'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAgregarBC' */
                           e1619F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1719F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1819F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1919F2 ();
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
                           nGXsfl_50_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_502( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV86GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GridActions), 4, 0));
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
                           cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
                           cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
                           A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
                           A4023AlbFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbFecSal_Internalname), 0)) ;
                           A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
                           cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
                           cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
                           A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
                           cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
                           cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
                           A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2019F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2119F2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2219F2 ();
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

   public void we19F2( )
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

   public void pa19F2( )
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
            GX_FocusControl = cmbavAlbpropri.getInternalname() ;
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
      subsflControlProps_502( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         sendrow_502( ) ;
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 long AV28TFAlbProCod ,
                                 long AV29TFAlbProCod_To ,
                                 String AV30TFAlbProPri ,
                                 String AV31TFAlbProPri_Sel ,
                                 GXSimpleCollection<Byte> AV90TFAlbProEst_Sels ,
                                 java.util.Date AV34TFAlbProfch ,
                                 java.util.Date AV38TFAlbFecSal ,
                                 String AV42TFAlbHorSal ,
                                 String AV43TFAlbHorSal_Sel ,
                                 GXSimpleCollection<String> AV96TFAlbMarca_Sels ,
                                 String AV64TFAlbLic ,
                                 String AV65TFAlbLic_Sel ,
                                 String AV115Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2119F2 ();
      GRID_nCurrentRecord = 0 ;
      rf19F2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV87AlbProPri = cmbavAlbpropri.getValidValue(AV87AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProPri", AV87AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbpropri.setValue( GXutil.rtrim( AV87AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf19F2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "Calprd_TRNWW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV107Calprd_trnwwds_6_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV112Calprd_trnwwds_11_tfalbmarca_sels ,
                                           Long.valueOf(AV103Calprd_trnwwds_2_tfalbprocod) ,
                                           Long.valueOf(AV104Calprd_trnwwds_3_tfalbprocod_to) ,
                                           AV106Calprd_trnwwds_5_tfalbpropri_sel ,
                                           AV105Calprd_trnwwds_4_tfalbpropri ,
                                           Integer.valueOf(AV107Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                           AV108Calprd_trnwwds_7_tfalbprofch ,
                                           AV109Calprd_trnwwds_8_tfalbfecsal ,
                                           AV111Calprd_trnwwds_10_tfalbhorsal_sel ,
                                           AV110Calprd_trnwwds_9_tfalbhorsal ,
                                           Integer.valueOf(AV112Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                           AV114Calprd_trnwwds_13_tfalblic_sel ,
                                           AV113Calprd_trnwwds_12_tfalblic ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           A34AlbProfch ,
                                           A4023AlbFecSal ,
                                           A3865AlbHorSal ,
                                           A7101AlbLic ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV102Calprd_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV105Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV105Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
      lV110Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV110Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
      lV113Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV113Calprd_trnwwds_12_tfalblic), 20, "%") ;
      /* Using cursor H019F2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV103Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV104Calprd_trnwwds_3_tfalbprocod_to), lV105Calprd_trnwwds_4_tfalbpropri, AV106Calprd_trnwwds_5_tfalbpropri_sel, AV108Calprd_trnwwds_7_tfalbprofch, AV109Calprd_trnwwds_8_tfalbfecsal, lV110Calprd_trnwwds_9_tfalbhorsal, AV111Calprd_trnwwds_10_tfalbhorsal_sel, lV113Calprd_trnwwds_12_tfalblic, AV114Calprd_trnwwds_13_tfalblic_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H019F2_A396EmprCod[0] ;
         A7101AlbLic = H019F2_A7101AlbLic[0] ;
         A5805AlbEnvFtp = H019F2_A5805AlbEnvFtp[0] ;
         A5140AlbMarca = H019F2_A5140AlbMarca[0] ;
         A3865AlbHorSal = H019F2_A3865AlbHorSal[0] ;
         A4023AlbFecSal = H019F2_A4023AlbFecSal[0] ;
         A2242AlbSec = H019F2_A2242AlbSec[0] ;
         A34AlbProfch = H019F2_A34AlbProfch[0] ;
         A33AlbProEst = H019F2_A33AlbProEst[0] ;
         A39AlbProPri = H019F2_A39AlbProPri[0] ;
         A30AlbProCod = H019F2_A30AlbProCod[0] ;
         if ( (GXutil.strcmp("", AV102Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV102Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV102Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf19F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(50) ;
      /* Execute user event: Refresh */
      e2119F2 ();
      nGXsfl_50_idx = 1 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_502( ) ;
      bGXsfl_50_Refreshing = true ;
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
         subsflControlProps_502( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A33AlbProEst) ,
                                              AV107Calprd_trnwwds_6_tfalbproest_sels ,
                                              A5140AlbMarca ,
                                              AV112Calprd_trnwwds_11_tfalbmarca_sels ,
                                              Long.valueOf(AV103Calprd_trnwwds_2_tfalbprocod) ,
                                              Long.valueOf(AV104Calprd_trnwwds_3_tfalbprocod_to) ,
                                              AV106Calprd_trnwwds_5_tfalbpropri_sel ,
                                              AV105Calprd_trnwwds_4_tfalbpropri ,
                                              Integer.valueOf(AV107Calprd_trnwwds_6_tfalbproest_sels.size()) ,
                                              AV108Calprd_trnwwds_7_tfalbprofch ,
                                              AV109Calprd_trnwwds_8_tfalbfecsal ,
                                              AV111Calprd_trnwwds_10_tfalbhorsal_sel ,
                                              AV110Calprd_trnwwds_9_tfalbhorsal ,
                                              Integer.valueOf(AV112Calprd_trnwwds_11_tfalbmarca_sels.size()) ,
                                              AV114Calprd_trnwwds_13_tfalblic_sel ,
                                              AV113Calprd_trnwwds_12_tfalblic ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A39AlbProPri ,
                                              A34AlbProfch ,
                                              A4023AlbFecSal ,
                                              A3865AlbHorSal ,
                                              A7101AlbLic ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV102Calprd_trnwwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV105Calprd_trnwwds_4_tfalbpropri = GXutil.padr( GXutil.rtrim( AV105Calprd_trnwwds_4_tfalbpropri), 1, "%") ;
         lV110Calprd_trnwwds_9_tfalbhorsal = GXutil.padr( GXutil.rtrim( AV110Calprd_trnwwds_9_tfalbhorsal), 8, "%") ;
         lV113Calprd_trnwwds_12_tfalblic = GXutil.padr( GXutil.rtrim( AV113Calprd_trnwwds_12_tfalblic), 20, "%") ;
         /* Using cursor H019F3 */
         pr_default.execute(1, new Object[] {Long.valueOf(AV103Calprd_trnwwds_2_tfalbprocod), Long.valueOf(AV104Calprd_trnwwds_3_tfalbprocod_to), lV105Calprd_trnwwds_4_tfalbpropri, AV106Calprd_trnwwds_5_tfalbpropri_sel, AV108Calprd_trnwwds_7_tfalbprofch, AV109Calprd_trnwwds_8_tfalbfecsal, lV110Calprd_trnwwds_9_tfalbhorsal, AV111Calprd_trnwwds_10_tfalbhorsal_sel, lV113Calprd_trnwwds_12_tfalblic, AV114Calprd_trnwwds_13_tfalblic_sel});
         nGXsfl_50_idx = 1 ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H019F3_A396EmprCod[0] ;
            A7101AlbLic = H019F3_A7101AlbLic[0] ;
            A5805AlbEnvFtp = H019F3_A5805AlbEnvFtp[0] ;
            A5140AlbMarca = H019F3_A5140AlbMarca[0] ;
            A3865AlbHorSal = H019F3_A3865AlbHorSal[0] ;
            A4023AlbFecSal = H019F3_A4023AlbFecSal[0] ;
            A2242AlbSec = H019F3_A2242AlbSec[0] ;
            A34AlbProfch = H019F3_A34AlbProfch[0] ;
            A33AlbProEst = H019F3_A33AlbProEst[0] ;
            A39AlbProPri = H019F3_A39AlbProPri[0] ;
            A30AlbProCod = H019F3_A30AlbProCod[0] ;
            if ( (GXutil.strcmp("", AV102Calprd_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV102Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV102Calprd_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3865AlbHorSal) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV102Calprd_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e2219F2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(50) ;
         wb19F0( ) ;
      }
      bGXsfl_50_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV115Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Pgmname, ""))));
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
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFAlbProCod, AV29TFAlbProCod_To, AV30TFAlbProPri, AV31TFAlbProPri_Sel, AV90TFAlbProEst_Sels, AV34TFAlbProfch, AV38TFAlbFecSal, AV42TFAlbHorSal, AV43TFAlbHorSal_Sel, AV96TFAlbMarca_Sels, AV64TFAlbLic, AV65TFAlbLic_Sel, AV115Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "Calprd_TRNWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup19F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2019F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV82DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV85GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV94ContCod = httpContext.cgiGet( "vCONTCOD") ;
         AV88AlbSec = httpContext.cgiGet( "vALBSEC") ;
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
         cmbavAlbpropri.setName( cmbavAlbpropri.getInternalname() );
         cmbavAlbpropri.setValue( httpContext.cgiGet( cmbavAlbpropri.getInternalname()) );
         AV87AlbProPri = httpContext.cgiGet( cmbavAlbpropri.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProPri", AV87AlbProPri);
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROFCHAUXDATE");
            GX_FocusControl = edtavDdo_albprofchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36DDO_AlbProfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36DDO_AlbProfchAuxDate", localUtil.format(AV36DDO_AlbProfchAuxDate, "99/99/99"));
         }
         else
         {
            AV36DDO_AlbProfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36DDO_AlbProfchAuxDate", localUtil.format(AV36DDO_AlbProfchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBFECSALAUXDATE");
            GX_FocusControl = edtavDdo_albfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_AlbFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_AlbFecSalAuxDate", localUtil.format(AV40DDO_AlbFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_AlbFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_AlbFecSalAuxDate", localUtil.format(AV40DDO_AlbFecSalAuxDate, "99/99/99"));
         }
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
      e2019F2 ();
      if (returnInSub) return;
   }

   public void e2019F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV88AlbSec = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbSec", AV88AlbSec);
      AV94ContCod = "666666" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94ContCod", AV94ContCod);
      GXt_char1 = AV99Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      calprd_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV99Station = GXt_char1 ;
      GXv_char2[0] = AV93Emprcod ;
      GXv_char3[0] = AV100Emprnom ;
      GXv_char4[0] = AV101Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV99Station, GXv_char2, GXv_char3, GXv_char4) ;
      calprd_trnww_impl.this.AV93Emprcod = GXv_char2[0] ;
      calprd_trnww_impl.this.AV100Emprnom = GXv_char3[0] ;
      calprd_trnww_impl.this.AV101Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Emprcod", AV93Emprcod);
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
      Form.setCaption( httpContext.getMessage( " Albaran de Produccion", "") );
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
         AV13OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV82DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV82DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2119F2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("Calprd_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Calprd_TRNWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbProPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Visible), 5, 0), !bGXsfl_50_Refreshing);
      cmbAlbProEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProEst.getVisible(), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbProfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Visible), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbHorSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Visible), 5, 0), !bGXsfl_50_Refreshing);
      cmbAlbMarca.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbMarca.getVisible(), 5, 0), !bGXsfl_50_Refreshing);
      edtAlbLic_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Visible), 5, 0), !bGXsfl_50_Refreshing);
      AV84GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridCurrentPage), 10, 0));
      AV85GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridPageCount), 10, 0));
      AV102Calprd_trnwwds_1_filterfulltext = AV15FilterFullText ;
      AV103Calprd_trnwwds_2_tfalbprocod = AV28TFAlbProCod ;
      AV104Calprd_trnwwds_3_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV105Calprd_trnwwds_4_tfalbpropri = AV30TFAlbProPri ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = AV31TFAlbProPri_Sel ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = AV90TFAlbProEst_Sels ;
      AV108Calprd_trnwwds_7_tfalbprofch = AV34TFAlbProfch ;
      AV109Calprd_trnwwds_8_tfalbfecsal = AV38TFAlbFecSal ;
      AV110Calprd_trnwwds_9_tfalbhorsal = AV42TFAlbHorSal ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = AV43TFAlbHorSal_Sel ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = AV96TFAlbMarca_Sels ;
      AV113Calprd_trnwwds_12_tfalblic = AV64TFAlbLic ;
      AV114Calprd_trnwwds_13_tfalblic_sel = AV65TFAlbLic_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1219F2( )
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
         AV83PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV83PageToGo) ;
      }
   }

   public void e1319F2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1419F2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPri") == 0 )
         {
            AV30TFAlbProPri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProPri", AV30TFAlbProPri);
            AV31TFAlbProPri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProPri_Sel", AV31TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProEst") == 0 )
         {
            AV89TFAlbProEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFAlbProEst_SelsJson", AV89TFAlbProEst_SelsJson);
            AV90TFAlbProEst_Sels.fromJSonString(GXutil.strReplace( AV89TFAlbProEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProfch") == 0 )
         {
            AV34TFAlbProfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProfch", localUtil.format(AV34TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbFecSal") == 0 )
         {
            AV38TFAlbFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFAlbFecSal", localUtil.format(AV38TFAlbFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHorSal") == 0 )
         {
            AV42TFAlbHorSal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbHorSal", AV42TFAlbHorSal);
            AV43TFAlbHorSal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFAlbHorSal_Sel", AV43TFAlbHorSal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbMarca") == 0 )
         {
            AV95TFAlbMarca_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFAlbMarca_SelsJson", AV95TFAlbMarca_SelsJson);
            AV96TFAlbMarca_Sels.fromJSonString(AV95TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbLic") == 0 )
         {
            AV64TFAlbLic = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbLic", AV64TFAlbLic);
            AV65TFAlbLic_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbLic_Sel", AV65TFAlbLic_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV96TFAlbMarca_Sels", AV96TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90TFAlbProEst_Sels", AV90TFAlbProEst_Sels);
   }

   private void e2219F2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", httpContext.getMessage( "Modificar BC", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtAlbProPri_Link = formatLink("app.ttrn06view", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbProCod","TabCode"})  ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(50) ;
         }
         sendrow_502( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_50_Refreshing )
      {
         httpContext.doAjaxLoad(50, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV86GridActions, 4, 0)) );
   }

   public void e1519F2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Calprd_TRNWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1119F2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Calprd_TRNWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV115Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Calprd_TRNWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Calprd_TRNWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         calprd_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV24ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90TFAlbProEst_Sels", AV90TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV96TFAlbMarca_Sels", AV96TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e1619F2( )
   {
      /* 'DoAgregarBC' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.calprd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV93Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV87AlbProPri)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV94ContCod))}, new String[] {"Mode","EmprCod","AlbProcod","AlbProPri","AlbSec","ContCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
      cmbavAlbpropri.setValue( GXutil.rtrim( AV87AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
   }

   public void e1719F2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.calprd_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV87AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV88AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV94ContCod))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec","ContCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1819F2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.calprd_trnwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      calprd_trnww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      calprd_trnww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV96TFAlbMarca_Sels", AV96TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90TFAlbProEst_Sels", AV90TFAlbProEst_Sels);
   }

   public void e1919F2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.calprd_trnwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV96TFAlbMarca_Sels", AV96TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90TFAlbProEst_Sels", AV90TFAlbProEst_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProPri", "", "P", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProEst", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbProfch", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbFecSal", "", "Fecha Salida", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbHorSal", "", "Hora Salida", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbMarca", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbLic", "", "Codigo AT", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Calprd_TRNWWColumnsSelector", GXv_char4) ;
      calprd_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Calprd_TRNWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFAlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
      AV29TFAlbProCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
      AV30TFAlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProPri", AV30TFAlbProPri);
      AV31TFAlbProPri_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProPri_Sel", AV31TFAlbProPri_Sel);
      AV90TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV34TFAlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProfch", localUtil.format(AV34TFAlbProfch, "99/99/99"));
      AV38TFAlbFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFAlbFecSal", localUtil.format(AV38TFAlbFecSal, "99/99/99"));
      AV42TFAlbHorSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbHorSal", AV42TFAlbHorSal);
      AV43TFAlbHorSal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFAlbHorSal_Sel", AV43TFAlbHorSal_Sel);
      AV96TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64TFAlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbLic", AV64TFAlbLic);
      AV65TFAlbLic_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbLic_Sel", AV65TFAlbLic_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO MODIFICARBC' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.calprd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV94ContCod))}, new String[] {"Mode","EmprCod","AlbProcod","AlbProPri","AlbSec","ContCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.calprd_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV87AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV88AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV94ContCod))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec","ContCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.calprd_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV87AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV88AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV94ContCod))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec","ContCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV115Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV115Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV115Pgmname+"GridState"), null, null);
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
      AV116GXV1 = 1 ;
      while ( AV116GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV30TFAlbProPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbProPri", AV30TFAlbProPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV31TFAlbProPri_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbProPri_Sel", AV31TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV89TFAlbProEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFAlbProEst_SelsJson", AV89TFAlbProEst_SelsJson);
            AV90TFAlbProEst_Sels.fromJSonString(AV89TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV34TFAlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbProfch", localUtil.format(AV34TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBFECSAL") == 0 )
         {
            AV38TFAlbFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFAlbFecSal", localUtil.format(AV38TFAlbFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL") == 0 )
         {
            AV42TFAlbHorSal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFAlbHorSal", AV42TFAlbHorSal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHORSAL_SEL") == 0 )
         {
            AV43TFAlbHorSal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFAlbHorSal_Sel", AV43TFAlbHorSal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV95TFAlbMarca_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFAlbMarca_SelsJson", AV95TFAlbMarca_SelsJson);
            AV96TFAlbMarca_Sels.fromJSonString(AV95TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV64TFAlbLic = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbLic", AV64TFAlbLic);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV65TFAlbLic_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbLic_Sel", AV65TFAlbLic_Sel);
         }
         AV116GXV1 = (int)(AV116GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFAlbProPri_Sel)==0), AV31TFAlbProPri_Sel, GXv_char4) ;
      calprd_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFAlbHorSal_Sel)==0), AV43TFAlbHorSal_Sel, GXv_char3) ;
      calprd_trnww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV96TFAlbMarca_Sels.size()==0), AV95TFAlbMarca_SelsJson, GXv_char2) ;
      calprd_trnww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFAlbLic_Sel)==0), AV65TFAlbLic_Sel, GXv_char15) ;
      calprd_trnww_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+((AV90TFAlbProEst_Sels.size()==0) ? "" : AV89TFAlbProEst_SelsJson)+"|||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFAlbProPri)==0), AV30TFAlbProPri, GXv_char15) ;
      calprd_trnww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFAlbHorSal)==0), AV42TFAlbHorSal, GXv_char4) ;
      calprd_trnww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFAlbLic)==0), AV64TFAlbLic, GXv_char3) ;
      calprd_trnww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFAlbProCod) ? "" : GXutil.str( AV28TFAlbProCod, 10, 0))+"|"+GXt_char14+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFAlbProfch)) ? "" : localUtil.dtoc( AV34TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFAlbFecSal)) ? "" : localUtil.dtoc( AV38TFAlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char13+"||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFAlbProCod_To) ? "" : GXutil.str( AV29TFAlbProCod_To, 10, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV115Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBPROCOD", "", !((0==AV28TFAlbProCod)&&(0==AV29TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV29TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBPROPRI", "", !(GXutil.strcmp("", AV30TFAlbProPri)==0), (short)(0), AV30TFAlbProPri, "", !(GXutil.strcmp("", AV31TFAlbProPri_Sel)==0), AV31TFAlbProPri_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBPROEST_SEL", "", !(AV90TFAlbProEst_Sels.size()==0), (short)(0), AV90TFAlbProEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBPROFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFAlbProfch)), (short)(0), GXutil.trim( localUtil.dtoc( AV34TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFAlbFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV38TFAlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBHORSAL", "", !(GXutil.strcmp("", AV42TFAlbHorSal)==0), (short)(0), AV42TFAlbHorSal, "", !(GXutil.strcmp("", AV43TFAlbHorSal_Sel)==0), AV43TFAlbHorSal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBMARCA_SEL", "", !(AV96TFAlbMarca_Sels.size()==0), (short)(0), AV96TFAlbMarca_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFALBLIC", "", !(GXutil.strcmp("", AV64TFAlbLic)==0), (short)(0), AV64TFAlbLic, "", !(GXutil.strcmp("", AV65TFAlbLic_Sel)==0), AV65TFAlbLic_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV115Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Calprd_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_19F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_19F2( true) ;
      }
      else
      {
         wb_table2_30_19F2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_19F2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_19F2e( true) ;
      }
      else
      {
         wb_table1_27_19F2e( false) ;
      }
   }

   public void wb_table2_30_19F2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbpropri.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbpropri, cmbavAlbpropri.getInternalname(), GXutil.rtrim( AV87AlbProPri), 1, cmbavAlbpropri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbpropri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_Calprd_TRNWW.htm");
         cmbavAlbpropri.setValue( GXutil.rtrim( AV87AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Calprd_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_19F2e( true) ;
      }
      else
      {
         wb_table2_30_19F2e( false) ;
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
      pa19F2( ) ;
      ws19F2( ) ;
      we19F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613230", true, true);
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
      httpContext.AddJavascriptSource("calprd_trnww.js", "?20268211613231", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_502( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_50_idx );
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_50_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_50_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_50_idx );
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_50_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_50_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_50_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_50_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_50_idx );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_50_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_502( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_50_fel_idx );
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_50_fel_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_50_fel_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_50_fel_idx );
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_50_fel_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_50_fel_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_50_fel_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_50_fel_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_50_fel_idx );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_50_fel_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_50_fel_idx ;
   }

   public void sendrow_502( )
   {
      subsflControlProps_502( ) ;
      wb19F0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_50_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_50_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_50_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV86GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV86GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV86GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e2319f2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV86GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_50_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPri_Internalname,GXutil.rtrim( A39AlbProPri),GXutil.rtrim( localUtil.format( A39AlbProPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'",edtAlbProPri_Link,"","","",edtAlbProPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbProPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROEST_" + sGXsfl_50_idx ;
            cmbAlbProEst.setName( GXCCtl );
            cmbAlbProEst.setWebtags( "" );
            cmbAlbProEst.addItem("0", httpContext.getMessage( "Pdte Imprimir", ""), (short)(0));
            cmbAlbProEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
            cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
            if ( cmbAlbProEst.getItemCount() > 0 )
            {
               A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProEst,cmbAlbProEst.getInternalname(),GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)),Integer.valueOf(1),cmbAlbProEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbProEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), !bGXsfl_50_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProfch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSec_Internalname,GXutil.rtrim( A2242AlbSec),GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFecSal_Internalname,localUtil.format(A4023AlbFecSal, "99/99/99"),localUtil.format( A4023AlbFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbHorSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHorSal_Internalname,GXutil.rtrim( A3865AlbHorSal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHorSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbHorSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbMarca.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBMARCA_" + sGXsfl_50_idx ;
            cmbAlbMarca.setName( GXCCtl );
            cmbAlbMarca.setWebtags( "" );
            cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
            cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbMarca.getItemCount() > 0 )
            {
               A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbMarca,cmbAlbMarca.getInternalname(),GXutil.rtrim( A5140AlbMarca),Integer.valueOf(1),cmbAlbMarca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbMarca.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbMarca.setValue( GXutil.rtrim( A5140AlbMarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Values", cmbAlbMarca.ToJavascriptSource(), !bGXsfl_50_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbEnvFtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBENVFTP_" + sGXsfl_50_idx ;
            cmbAlbEnvFtp.setName( GXCCtl );
            cmbAlbEnvFtp.setWebtags( "" );
            cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
            cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
            if ( cmbAlbEnvFtp.getItemCount() > 0 )
            {
               A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbEnvFtp,cmbAlbEnvFtp.getInternalname(),GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)),Integer.valueOf(1),cmbAlbEnvFtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), !bGXsfl_50_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbLic_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19F2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      /* End function sendrow_502 */
   }

   public void startgridcontrol50( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"50\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Albaran Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbHorSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV86GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A39AlbProPri));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtAlbProPri_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4023AlbFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3865AlbHorSal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbHorSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5140AlbMarca));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbMarca.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbLic_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnagregarbc_Internalname = "BTNAGREGARBC" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      cmbavAlbpropri.setInternalname( "vALBPROPRI" );
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbSec_Internalname = "ALBSEC" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      cmbAlbMarca.setInternalname( "ALBMARCA" );
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprofchauxdate_Internalname = "vDDO_ALBPROFCHAUXDATE" ;
      divDdo_albprofchauxdates_Internalname = "DDO_ALBPROFCHAUXDATES" ;
      edtavDdo_albfecsalauxdate_Internalname = "vDDO_ALBFECSALAUXDATE" ;
      divDdo_albfecsalauxdates_Internalname = "DDO_ALBFECSALAUXDATES" ;
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
      edtAlbLic_Jsonclick = "" ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbMarca.setJsonclick( "" );
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbSec_Jsonclick = "" ;
      edtAlbProfch_Jsonclick = "" ;
      cmbAlbProEst.setJsonclick( "" );
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProPri_Link = "" ;
      edtAlbProCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavAlbpropri.setJsonclick( "" );
      cmbavAlbpropri.setEnabled( 1 );
      edtAlbLic_Visible = -1 ;
      cmbAlbMarca.setVisible( -1 );
      edtAlbHorSal_Visible = -1 ;
      edtAlbFecSal_Visible = -1 ;
      edtAlbProfch_Visible = -1 ;
      cmbAlbProEst.setVisible( -1 );
      edtAlbProPri_Visible = -1 ;
      edtAlbProCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albfecsalauxdate_Jsonclick = "" ;
      edtavDdo_albprofchauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Calprd_TRNWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||0:Pdte Imprimir,1:Imprimido,2:Facturado||||:Activo,A:Anulado|" ;
      Ddo_grid_Allowmultipleselection = "||T||||T|" ;
      Ddo_grid_Datalisttype = "|Dynamic|FixedValues|||Dynamic|FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character||Date|Date|Character||Character" ;
      Ddo_grid_Includefilter = "T|T||T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|1|5|6|7|8" ;
      Ddo_grid_Columnids = "1:AlbProCod|2:AlbProPri|3:AlbProEst|4:AlbProfch|6:AlbFecSal|7:AlbHorSal|8:AlbMarca|10:AlbLic" ;
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
      Form.setCaption( httpContext.getMessage( " Albaran de Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbpropri.setName( "vALBPROPRI" );
      cmbavAlbpropri.setWebtags( "" );
      cmbavAlbpropri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbpropri.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV87AlbProPri = cmbavAlbpropri.getValidValue(AV87AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87AlbProPri", AV87AlbProPri);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_50_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV86GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV86GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GridActions), 4, 0));
      }
      GXCCtl = "ALBPROEST_" + sGXsfl_50_idx ;
      cmbAlbProEst.setName( GXCCtl );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Pdte Imprimir", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
      }
      GXCCtl = "ALBMARCA_" + sGXsfl_50_idx ;
      cmbAlbMarca.setName( GXCCtl );
      cmbAlbMarca.setWebtags( "" );
      cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbMarca.getItemCount() > 0 )
      {
         A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
      }
      GXCCtl = "ALBENVFTP_" + sGXsfl_50_idx ;
      cmbAlbEnvFtp.setName( GXCCtl );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'cmbAlbProEst'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtAlbFecSal_Visible',ctrl:'ALBFECSAL',prop:'Visible'},{av:'edtAlbHorSal_Visible',ctrl:'ALBHORSAL',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1219F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1319F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1419F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2219F2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV86GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbProPri_Link',ctrl:'ALBPROPRI',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1519F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'cmbAlbProEst'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtAlbFecSal_Visible',ctrl:'ALBFECSAL',prop:'Visible'},{av:'edtAlbHorSal_Visible',ctrl:'ALBHORSAL',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1119F2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'cmbAlbProEst'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtAlbFecSal_Visible',ctrl:'ALBFECSAL',prop:'Visible'},{av:'edtAlbHorSal_Visible',ctrl:'ALBHORSAL',prop:'Visible'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2319F2',iparms:[{av:'cmbavGridactions'},{av:'AV86GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'AV94ContCod',fld:'vCONTCOD',pic:'@!'},{av:'cmbavAlbpropri'},{av:'AV87AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV88AlbSec',fld:'vALBSEC',pic:'@!'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV86GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV94ContCod',fld:'vCONTCOD',pic:'@!'},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOAGREGARBC'","{handler:'e1619F2',iparms:[{av:'AV93Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbpropri'},{av:'AV87AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV94ContCod',fld:'vCONTCOD',pic:'@!'}]");
      setEventMetadata("'DOAGREGARBC'",",oparms:[{av:'AV94ContCod',fld:'vCONTCOD',pic:'@!'},{av:'cmbavAlbpropri'},{av:'AV87AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV93Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1719F2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbpropri'},{av:'AV87AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV88AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV94ContCod',fld:'vCONTCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1819F2',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1919F2',iparms:[{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV30TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV31TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV90TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV34TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV38TFAlbFecSal',fld:'vTFALBFECSAL',pic:''},{av:'AV42TFAlbHorSal',fld:'vTFALBHORSAL',pic:''},{av:'AV43TFAlbHorSal_Sel',fld:'vTFALBHORSAL_SEL',pic:''},{av:'AV96TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV64TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV65TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV115Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV95TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV89TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALIDV_ALBPROPRI","{handler:'validv_Albpropri',iparms:[]");
      setEventMetadata("VALIDV_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBHORSAL","{handler:'valid_Albhorsal',iparms:[]");
      setEventMetadata("VALID_ALBHORSAL",",oparms:[]}");
      setEventMetadata("VALID_ALBMARCA","{handler:'valid_Albmarca',iparms:[]");
      setEventMetadata("VALID_ALBMARCA",",oparms:[]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
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
      AV30TFAlbProPri = "" ;
      AV31TFAlbProPri_Sel = "" ;
      AV90TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV34TFAlbProfch = GXutil.nullDate() ;
      AV38TFAlbFecSal = GXutil.nullDate() ;
      AV42TFAlbHorSal = "" ;
      AV43TFAlbHorSal_Sel = "" ;
      AV96TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFAlbLic = "" ;
      AV65TFAlbLic_Sel = "" ;
      AV115Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV82DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV89TFAlbProEst_SelsJson = "" ;
      AV95TFAlbMarca_SelsJson = "" ;
      AV94ContCod = "" ;
      AV88AlbSec = "" ;
      AV93Emprcod = "" ;
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
      bttBtnagregarbc_Jsonclick = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV36DDO_AlbProfchAuxDate = GXutil.nullDate() ;
      AV40DDO_AlbFecSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A2242AlbSec = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      AV87AlbProPri = "" ;
      AV102Calprd_trnwwds_1_filterfulltext = "" ;
      AV105Calprd_trnwwds_4_tfalbpropri = "" ;
      AV106Calprd_trnwwds_5_tfalbpropri_sel = "" ;
      AV107Calprd_trnwwds_6_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV108Calprd_trnwwds_7_tfalbprofch = GXutil.nullDate() ;
      AV109Calprd_trnwwds_8_tfalbfecsal = GXutil.nullDate() ;
      AV110Calprd_trnwwds_9_tfalbhorsal = "" ;
      AV111Calprd_trnwwds_10_tfalbhorsal_sel = "" ;
      AV112Calprd_trnwwds_11_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV113Calprd_trnwwds_12_tfalblic = "" ;
      AV114Calprd_trnwwds_13_tfalblic_sel = "" ;
      scmdbuf = "" ;
      lV102Calprd_trnwwds_1_filterfulltext = "" ;
      lV105Calprd_trnwwds_4_tfalbpropri = "" ;
      lV110Calprd_trnwwds_9_tfalbhorsal = "" ;
      lV113Calprd_trnwwds_12_tfalblic = "" ;
      H019F2_A396EmprCod = new String[] {""} ;
      H019F2_A7101AlbLic = new String[] {""} ;
      H019F2_A5805AlbEnvFtp = new byte[1] ;
      H019F2_A5140AlbMarca = new String[] {""} ;
      H019F2_A3865AlbHorSal = new String[] {""} ;
      H019F2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H019F2_A2242AlbSec = new String[] {""} ;
      H019F2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H019F2_A33AlbProEst = new byte[1] ;
      H019F2_A39AlbProPri = new String[] {""} ;
      H019F2_A30AlbProCod = new long[1] ;
      H019F3_A396EmprCod = new String[] {""} ;
      H019F3_A7101AlbLic = new String[] {""} ;
      H019F3_A5805AlbEnvFtp = new byte[1] ;
      H019F3_A5140AlbMarca = new String[] {""} ;
      H019F3_A3865AlbHorSal = new String[] {""} ;
      H019F3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H019F3_A2242AlbSec = new String[] {""} ;
      H019F3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H019F3_A33AlbProEst = new byte[1] ;
      H019F3_A39AlbProPri = new String[] {""} ;
      H019F3_A30AlbProCod = new long[1] ;
      AV99Station = "" ;
      AV100Emprnom = "" ;
      AV101Usurcod = "" ;
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trnww__default(),
         new Object[] {
             new Object[] {
            H019F2_A396EmprCod, H019F2_A7101AlbLic, H019F2_A5805AlbEnvFtp, H019F2_A5140AlbMarca, H019F2_A3865AlbHorSal, H019F2_A4023AlbFecSal, H019F2_A2242AlbSec, H019F2_A34AlbProfch, H019F2_A33AlbProEst, H019F2_A39AlbProPri,
            H019F2_A30AlbProCod
            }
            , new Object[] {
            H019F3_A396EmprCod, H019F3_A7101AlbLic, H019F3_A5805AlbEnvFtp, H019F3_A5140AlbMarca, H019F3_A3865AlbHorSal, H019F3_A4023AlbFecSal, H019F3_A2242AlbSec, H019F3_A34AlbProfch, H019F3_A33AlbProEst, H019F3_A39AlbProPri,
            H019F3_A30AlbProCod
            }
         }
      );
      AV115Pgmname = "Calprd_TRNWW" ;
      /* GeneXus formulas. */
      AV115Pgmname = "Calprd_TRNWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV86GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int AV107Calprd_trnwwds_6_tfalbproest_sels_size ;
   private int AV112Calprd_trnwwds_11_tfalbmarca_sels_size ;
   private int edtAlbProCod_Visible ;
   private int edtAlbProPri_Visible ;
   private int edtAlbProfch_Visible ;
   private int edtAlbFecSal_Visible ;
   private int edtAlbHorSal_Visible ;
   private int edtAlbLic_Visible ;
   private int AV83PageToGo ;
   private int AV116GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28TFAlbProCod ;
   private long AV29TFAlbProCod_To ;
   private long AV84GridCurrentPage ;
   private long AV85GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV103Calprd_trnwwds_2_tfalbprocod ;
   private long AV104Calprd_trnwwds_3_tfalbprocod_to ;
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
   private String sGXsfl_50_idx="0001" ;
   private String AV30TFAlbProPri ;
   private String AV31TFAlbProPri_Sel ;
   private String AV42TFAlbHorSal ;
   private String AV43TFAlbHorSal_Sel ;
   private String AV64TFAlbLic ;
   private String AV65TFAlbLic_Sel ;
   private String AV115Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV94ContCod ;
   private String AV88AlbSec ;
   private String AV93Emprcod ;
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
   private String bttBtnagregarbc_Internalname ;
   private String bttBtnagregarbc_Jsonclick ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
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
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprofchauxdates_Internalname ;
   private String edtavDdo_albprofchauxdate_Internalname ;
   private String edtavDdo_albprofchauxdate_Jsonclick ;
   private String divDdo_albfecsalauxdates_Internalname ;
   private String edtavDdo_albfecsalauxdate_Internalname ;
   private String edtavDdo_albfecsalauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProCod_Internalname ;
   private String A39AlbProPri ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Internalname ;
   private String edtAlbFecSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Internalname ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String AV87AlbProPri ;
   private String AV105Calprd_trnwwds_4_tfalbpropri ;
   private String AV106Calprd_trnwwds_5_tfalbpropri_sel ;
   private String AV110Calprd_trnwwds_9_tfalbhorsal ;
   private String AV111Calprd_trnwwds_10_tfalbhorsal_sel ;
   private String AV113Calprd_trnwwds_12_tfalblic ;
   private String AV114Calprd_trnwwds_13_tfalblic_sel ;
   private String scmdbuf ;
   private String lV105Calprd_trnwwds_4_tfalbpropri ;
   private String lV110Calprd_trnwwds_9_tfalbhorsal ;
   private String lV113Calprd_trnwwds_12_tfalblic ;
   private String edtavFilterfulltext_Internalname ;
   private String AV99Station ;
   private String AV100Emprnom ;
   private String AV101Usurcod ;
   private String edtAlbProPri_Link ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbSec_Jsonclick ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbLic_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV34TFAlbProfch ;
   private java.util.Date AV38TFAlbFecSal ;
   private java.util.Date AV36DDO_AlbProfchAuxDate ;
   private java.util.Date AV40DDO_AlbFecSalAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV108Calprd_trnwwds_7_tfalbprofch ;
   private java.util.Date AV109Calprd_trnwwds_8_tfalbfecsal ;
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
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV89TFAlbProEst_SelsJson ;
   private String AV95TFAlbMarca_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV102Calprd_trnwwds_1_filterfulltext ;
   private String lV102Calprd_trnwwds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private GXSimpleCollection<Byte> AV90TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV107Calprd_trnwwds_6_tfalbproest_sels ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAlbpropri ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbMarca ;
   private HTMLChoice cmbAlbEnvFtp ;
   private IDataStoreProvider pr_default ;
   private String[] H019F2_A396EmprCod ;
   private String[] H019F2_A7101AlbLic ;
   private byte[] H019F2_A5805AlbEnvFtp ;
   private String[] H019F2_A5140AlbMarca ;
   private String[] H019F2_A3865AlbHorSal ;
   private java.util.Date[] H019F2_A4023AlbFecSal ;
   private String[] H019F2_A2242AlbSec ;
   private java.util.Date[] H019F2_A34AlbProfch ;
   private byte[] H019F2_A33AlbProEst ;
   private String[] H019F2_A39AlbProPri ;
   private long[] H019F2_A30AlbProCod ;
   private String[] H019F3_A396EmprCod ;
   private String[] H019F3_A7101AlbLic ;
   private byte[] H019F3_A5805AlbEnvFtp ;
   private String[] H019F3_A5140AlbMarca ;
   private String[] H019F3_A3865AlbHorSal ;
   private java.util.Date[] H019F3_A4023AlbFecSal ;
   private String[] H019F3_A2242AlbSec ;
   private java.util.Date[] H019F3_A34AlbProfch ;
   private byte[] H019F3_A33AlbProEst ;
   private String[] H019F3_A39AlbProPri ;
   private long[] H019F3_A30AlbProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV96TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV112Calprd_trnwwds_11_tfalbmarca_sels ;
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
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV82DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class calprd_trnww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H019F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV107Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV112Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV103Calprd_trnwwds_2_tfalbprocod ,
                                          long AV104Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV106Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV105Calprd_trnwwds_4_tfalbpropri ,
                                          int AV107Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV108Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV109Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV111Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV110Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV112Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV114Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV113Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV102Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[10];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbLic, AlbEnvFtp, AlbMarca, AlbHorSal, AlbFecSal, AlbSec, AlbProfch, AlbProEst, AlbProPri, AlbProCod FROM TXPCALPRD" ;
      if ( ! (0==AV103Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV104Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV105Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( AV107Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV109Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV110Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( AV112Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV112Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV114Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV113Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProPri" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProEst" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbFecSal" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbHorSal" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbHorSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbMarca" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbMarca DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbLic" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbLic DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H019F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV107Calprd_trnwwds_6_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV112Calprd_trnwwds_11_tfalbmarca_sels ,
                                          long AV103Calprd_trnwwds_2_tfalbprocod ,
                                          long AV104Calprd_trnwwds_3_tfalbprocod_to ,
                                          String AV106Calprd_trnwwds_5_tfalbpropri_sel ,
                                          String AV105Calprd_trnwwds_4_tfalbpropri ,
                                          int AV107Calprd_trnwwds_6_tfalbproest_sels_size ,
                                          java.util.Date AV108Calprd_trnwwds_7_tfalbprofch ,
                                          java.util.Date AV109Calprd_trnwwds_8_tfalbfecsal ,
                                          String AV111Calprd_trnwwds_10_tfalbhorsal_sel ,
                                          String AV110Calprd_trnwwds_9_tfalbhorsal ,
                                          int AV112Calprd_trnwwds_11_tfalbmarca_sels_size ,
                                          String AV114Calprd_trnwwds_13_tfalblic_sel ,
                                          String AV113Calprd_trnwwds_12_tfalblic ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          java.util.Date A4023AlbFecSal ,
                                          String A3865AlbHorSal ,
                                          String A7101AlbLic ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV102Calprd_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[10];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbLic, AlbEnvFtp, AlbMarca, AlbHorSal, AlbFecSal, AlbSec, AlbProfch, AlbProEst, AlbProPri, AlbProCod FROM TXPCALPRD" ;
      if ( ! (0==AV103Calprd_trnwwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV104Calprd_trnwwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Calprd_trnwwds_5_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV105Calprd_trnwwds_4_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Calprd_trnwwds_5_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProPri = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( AV107Calprd_trnwwds_6_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Calprd_trnwwds_6_tfalbproest_sels, "AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Calprd_trnwwds_7_tfalbprofch)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV109Calprd_trnwwds_8_tfalbfecsal)) )
      {
         addWhere(sWhereString, "(AlbFecSal >= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Calprd_trnwwds_10_tfalbhorsal_sel)==0) && ( ! (GXutil.strcmp("", AV110Calprd_trnwwds_9_tfalbhorsal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHorSal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Calprd_trnwwds_10_tfalbhorsal_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHorSal = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( AV112Calprd_trnwwds_11_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV112Calprd_trnwwds_11_tfalbmarca_sels, "AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV114Calprd_trnwwds_13_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV113Calprd_trnwwds_12_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Calprd_trnwwds_13_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(AlbLic = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProPri" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbProEst" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbProEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbFecSal" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbHorSal" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbHorSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbMarca" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbMarca DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbLic" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbLic DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_H019F2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H019F3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((long[]) buf[10])[0] = rslt.getLong(11);
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               return;
      }
   }

}

