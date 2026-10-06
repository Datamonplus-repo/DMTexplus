package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwuti118_sdt_2_impl extends GXWebComponent
{
   public wwuti118_sdt_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwuti118_sdt_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwuti118_sdt_2_impl.class ));
   }

   public wwuti118_sdt_2_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavPrdzdhc = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV42Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Emprcod", AV42Emprcod);
               AV39Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Fec1", localUtil.format(AV39Fec1, "99/99/99"));
               AV40Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Fec2", localUtil.format(AV40Fec2, "99/99/99"));
               AV5InformeInditex = httpContext.GetPar( "InformeInditex") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5InformeInditex", AV5InformeInditex);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV42Emprcod,AV39Fec1,AV40Fec2,AV5InformeInditex});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavStockinicial_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_36_Refreshing);
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
      AV33ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28ColumnsSelector);
      AV68Pgmname = httpContext.GetPar( "Pgmname") ;
      edtavStockinicial_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_36_Refreshing);
      AV5InformeInditex = httpContext.GetPar( "InformeInditex") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa14P2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Informe Compras, Consumos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wwuti118_sdt_2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV42Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV39Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV40Fec2)),GXutil.URLEncode(GXutil.rtrim(AV5InformeInditex))}, new String[] {"Emprcod","Fec1","Fec2","InformeInditex"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV68Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV34DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42Emprcod", GXutil.rtrim( wcpOAV42Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Fec1", localUtil.dtoc( wcpOAV39Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40Fec2", localUtil.dtoc( wcpOAV40Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5InformeInditex", wcpOAV5InformeInditex);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV33ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV68Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV68Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMEINDITEX", AV5InformeInditex);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV42Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV39Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV40Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTOCKINICIAL_Title", GXutil.rtrim( edtavStockinicial_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm14P2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "WWUti118_SDT_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Compras, Consumos", "") ;
   }

   public void wb14P0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wwuti118_sdt_2");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWUti118_SDT_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWUti118_SDT_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWUti118_SDT_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_14P2( true) ;
      }
      else
      {
         wb_table1_23_14P2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_14P2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0055"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0055"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_36_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0055"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV34DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV28ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 36 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start14P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Compras, Consumos", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup14P0( ) ;
         }
      }
   }

   public void ws14P2( )
   {
      start14P2( ) ;
      evt14P2( ) ;
   }

   public void evt14P2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1114P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1214P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportar' */
                                 e1314P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1414P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14P0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           AV41DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV41DetailWebComponent);
                           AV17PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV17PrdNum);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV17PrdNum, ""))));
                           AV18PrdNom = httpContext.cgiGet( edtavPrdnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnom_Internalname, AV18PrdNom);
                           AV60Categoria = httpContext.cgiGet( edtavCategoria_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCategoria_Internalname, AV60Categoria);
                           AV55PrdFuncion = httpContext.cgiGet( edtavPrdfuncion_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfuncion_Internalname, AV55PrdFuncion);
                           AV56PrdNroCAS = httpContext.cgiGet( edtavPrdnrocas_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnrocas_Internalname, AV56PrdNroCAS);
                           AV57PrdEINECS = httpContext.cgiGet( edtavPrdeinecs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdeinecs_Internalname, AV57PrdEINECS);
                           AV58PrdNmQu = httpContext.cgiGet( edtavPrdnmqu_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnmqu_Internalname, AV58PrdNmQu);
                           cmbavPrdzdhc.setName( cmbavPrdzdhc.getInternalname() );
                           cmbavPrdzdhc.setValue( httpContext.cgiGet( cmbavPrdzdhc.getInternalname()) );
                           AV59PrdZDHC = httpContext.cgiGet( cmbavPrdzdhc.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPrdzdhc.getInternalname(), AV59PrdZDHC);
                           AV19Lote = httpContext.cgiGet( edtavLote_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV19Lote);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19Lote, ""))));
                           AV20PrdFabNm = httpContext.cgiGet( edtavPrdfabnm_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV20PrdFabNm);
                           AV21PrvNom = httpContext.cgiGet( edtavPrvnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV21PrvNom);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTC");
                              GX_FocusControl = edtavCantc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22CantC = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV22CantC, 11, 3));
                           }
                           else
                           {
                              AV22CantC = localUtil.ctond( httpContext.cgiGet( edtavCantc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV22CantC, 11, 3));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTCM");
                              GX_FocusControl = edtavCantcm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23CantCm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV23CantCm, 11, 2));
                           }
                           else
                           {
                              AV23CantCm = localUtil.ctond( httpContext.cgiGet( edtavCantcm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV23CantCm, 11, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKINICIAL");
                              GX_FocusControl = edtavStockinicial_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24StockInicial = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV24StockInicial, 12, 4));
                           }
                           else
                           {
                              AV24StockInicial = localUtil.ctond( httpContext.cgiGet( edtavStockinicial_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV24StockInicial, 12, 4));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSTOCKFINAL");
                              GX_FocusControl = edtavStockfinal_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25Stockfinal = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV25Stockfinal, 12, 4));
                           }
                           else
                           {
                              AV25Stockfinal = localUtil.ctond( httpContext.cgiGet( edtavStockfinal_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV25Stockfinal, 12, 4));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1514P2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1614P2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1714P2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup14P0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 55 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0055") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0055", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we14P2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm14P2( ) ;
         }
      }
   }

   public void pa14P2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV33ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ,
                                 String AV68Pgmname ,
                                 String AV5InformeInditex ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1614P2 ();
      GRID_nCurrentRecord = 0 ;
      rf14P2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV17PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV17PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV19Lote, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTE", GXutil.rtrim( AV19Lote));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf14P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "WWUti118_SDT_2" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCategoria_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCategoria_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCategoria_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfuncion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfuncion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfuncion_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnrocas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnrocas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnrocas_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdeinecs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdeinecs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdeinecs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnmqu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnmqu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnmqu_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      cmbavPrdzdhc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrdzdhc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrdzdhc.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
      edtavLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfabnm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockfinal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Enabled), 5, 0), !bGXsfl_36_Refreshing);
   }

   public void rf14P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e1614P2 ();
      nGXsfl_36_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_362( ) ;
         e1714P2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1714P2 ();
         }
         wbEnd = (short)(36) ;
         wb14P0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes14P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV68Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV68Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV17PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19Lote, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV68Pgmname, AV5InformeInditex, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "WWUti118_SDT_2" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCategoria_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCategoria_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCategoria_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfuncion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfuncion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfuncion_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnrocas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnrocas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnrocas_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdeinecs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdeinecs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdeinecs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnmqu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnmqu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnmqu_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      cmbavPrdzdhc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrdzdhc.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrdzdhc.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
      edtavLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfabnm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockfinal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup14P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1514P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV31ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV34DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV28ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV42Emprcod") ;
         wcpOAV39Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39Fec1"), 0) ;
         wcpOAV40Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40Fec2"), 0) ;
         wcpOAV5InformeInditex = httpContext.cgiGet( sPrefix+"wcpOAV5InformeInditex") ;
         AV40Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFEC2"), 0) ;
         AV39Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"vFEC1"), 0) ;
         AV42Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
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
      e1514P2 ();
      if (returnInSub) return;
   }

   public void e1514P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV6SdtInformeInditexCollection.clear();
      AV44Mes = (byte)(GXutil.month( AV39Fec1)) ;
      AV45Anyo = (short)(GXutil.year( AV39Fec1)) ;
      AV46MesAnt = (byte)(AV44Mes-1) ;
      AV47AnyoANt = (short)(((AV46MesAnt==0) ? AV45Anyo-1 : AV45Anyo)) ;
      AV46MesAnt = (byte)(((AV46MesAnt==0) ? 12 : AV46MesAnt)) ;
      AV48Dia = localUtil.dtoc( GXutil.dadd(AV39Fec1,-(1)), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV49DiaActual = localUtil.dtoc( AV39Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      AV43DiaFinMes = GXutil.dadd(AV39Fec1,-(1)) ;
      AV50DiaIniMesActual = localUtil.ctod( AV49DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV51DiaFinMesActual = GXutil.eomdate( localUtil.ctod( AV49DiaActual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      edtavStockinicial_Title = httpContext.getMessage( "Stock Inicial ", "")+localUtil.dtoc( AV43DiaFinMes, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Title", edtavStockinicial_Title, !bGXsfl_36_Refreshing);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = AV34DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] ;
      AV34DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e1614P2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext3[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV8WWPContext = GXv_SdtWWPContext3[0] ;
      if ( AV33ManageFiltersExecutionStep == 1 )
      {
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV33ManageFiltersExecutionStep == 2 )
      {
         AV33ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV30Session.getValue("WWUti118_SDT_2ColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV30Session.getValue("WWUti118_SDT_2ColumnsSelector") ;
         AV28ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavPrdnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavCategoria_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCategoria_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCategoria_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfuncion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfuncion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfuncion_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnrocas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnrocas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnrocas_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdeinecs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdeinecs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdeinecs_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdnmqu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdnmqu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnmqu_Visible), 5, 0), !bGXsfl_36_Refreshing);
      cmbavPrdzdhc.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrdzdhc.getInternalname(), "Visible", GXutil.ltrimstr( cmbavPrdzdhc.getVisible(), 5, 0), !bGXsfl_36_Refreshing);
      edtavLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLote_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrdfabnm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdfabnm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdfabnm_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavPrvnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavCantcm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantcm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantcm_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockinicial_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockinicial_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockinicial_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavStockfinal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavStockfinal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavStockfinal_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   private void e1714P2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV41DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV41DetailWebComponent);
      AV6SdtInformeInditexCollection.fromJSonString(AV5InformeInditex, null);
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV6SdtInformeInditexCollection.size() )
      {
         AV38sdtInformeInditex = (app.SdtSDTInformeInditex)((app.SdtSDTInformeInditex)AV6SdtInformeInditexCollection.elementAt(-1+AV67GXV1));
         AV17PrdNum = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Producto() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnum_Internalname, AV17PrdNum);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRDNUM"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV17PrdNum, ""))));
         AV18PrdNom = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Descripcion() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnom_Internalname, AV18PrdNom);
         AV60Categoria = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Categoria() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCategoria_Internalname, AV60Categoria);
         AV55PrdFuncion = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfuncion() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfuncion_Internalname, AV55PrdFuncion);
         AV56PrdNroCAS = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnrocas() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnrocas_Internalname, AV56PrdNroCAS);
         AV57PrdEINECS = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdeinecs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdeinecs_Internalname, AV57PrdEINECS);
         AV58PrdNmQu = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdnmqu() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdnmqu_Internalname, AV58PrdNmQu);
         AV59PrdZDHC = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdzdhc() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPrdzdhc.getInternalname(), AV59PrdZDHC);
         AV19Lote = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Lote() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavLote_Internalname, AV19Lote);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTE"+"_"+sGXsfl_36_idx, getSecureSignedToken( sPrefix+sGXsfl_36_idx, GXutil.rtrim( localUtil.format( AV19Lote, ""))));
         AV20PrdFabNm = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Fabricante() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdfabnm_Internalname, AV20PrdFabNm);
         AV21PrvNom = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Proveedor() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV21PrvNom);
         AV22CantC = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantc() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantc_Internalname, GXutil.ltrimstr( AV22CantC, 11, 3));
         AV23CantCm = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Cantcm() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantcm_Internalname, GXutil.ltrimstr( AV23CantCm, 11, 2));
         AV25Stockfinal = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockfinal() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockfinal_Internalname, GXutil.ltrimstr( AV25Stockfinal, 12, 4));
         AV24StockInicial = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Stockinicial() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavStockinicial_Internalname, GXutil.ltrimstr( AV24StockInicial, 12, 4));
         AV63PrdFHS = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Prdfhs() ;
         AV64LocUtiDc = AV38sdtInformeInditex.getgxTv_SdtSDTInformeInditex_Locutidc() ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavPrdzdhc.setValue( GXutil.rtrim( AV59PrdZDHC) );
   }

   public void e1214P2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV26ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV28ColumnsSelector.fromJSonString(AV26ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WWUti118_SDT_2ColumnsSelector", ((GXutil.strcmp("", AV26ColumnsSelectorXML)==0) ? "" : AV28ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   public void e1114P2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WWUti118_SDT_2Filters")),GXutil.URLEncode(GXutil.rtrim(AV68Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WWUti118_SDT_2Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char4 = AV32ManageFiltersXml ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WWUti118_SDT_2Filters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         wwuti118_sdt_2_impl.this.GXt_char4 = GXv_char5[0] ;
         AV32ManageFiltersXml = GXt_char4 ;
         if ( (GXutil.strcmp("", AV32ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S152 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV32ManageFiltersXml) ;
            AV12GridState.fromxml(AV32ManageFiltersXml, null, null);
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   public void e1314P2( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      AV54WebSession.setValue(httpContext.getMessage( "InformeInditex", ""), AV5InformeInditex);
      GXv_char5[0] = AV61ExcelFilename ;
      GXv_char6[0] = AV62ErrorMessage ;
      new app.core.uti118_sdt_2export(remoteHandle, context).execute( GXv_char5, GXv_char6) ;
      wwuti118_sdt_2_impl.this.AV61ExcelFilename = GXv_char5[0] ;
      wwuti118_sdt_2_impl.this.AV62ErrorMessage = GXv_char6[0] ;
      if ( GXutil.strcmp(AV61ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV61ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV62ErrorMessage);
      }
   }

   public void e1414P2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S122 ();
         if (returnInSub) return;
         callWebObject(formatLink("app.wwuti118_sdt_2exportcsv", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      AV54WebSession.setValue(httpContext.getMessage( "InformeInditex", ""), AV5InformeInditex);
      callWebObject(formatLink("app.uti118_sdt_2exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV28ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdNum", "", "Codigo Producto", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdNom", "", "Descripcion Producto", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Categoria", "", "Categoria", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdFuncion", "", "Funcion", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdNroCAS", "", "CAS", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdEINECS", "", "Nº EINECS", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdNmQu", "", "Nombre Substancia Quimica", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdZDHC", "", "ZDHC", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lote", "", "Lote", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdFabNm", "", "Fabricante", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrvNom", "", "Distribuidor", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CantC", "", "Consumos", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&CantCm", "", "Compras", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&StockInicial", "", "Stock Inicial", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Stockfinal", "", "Stock Final", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char6[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WWUti118_SDT_2ColumnsSelector", GXv_char6) ;
      wwuti118_sdt_2_impl.this.GXt_char4 = GXv_char6[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV29ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV29ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV28ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV29ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV28ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = AV31ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WWUti118_SDT_2Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[0] ;
      AV31ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
   }

   public void S152( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue(AV68Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV68Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV30Session.getValue(AV68Pgmname+"GridState"), null, null);
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV30Session.getValue(AV68Pgmname+"GridState"), null, null);
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_23_14P2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV31ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_14P2e( true) ;
      }
      else
      {
         wb_table1_23_14P2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV42Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Emprcod", AV42Emprcod);
      AV39Fec1 = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Fec1", localUtil.format(AV39Fec1, "99/99/99"));
      AV40Fec2 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Fec2", localUtil.format(AV40Fec2, "99/99/99"));
      AV5InformeInditex = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5InformeInditex", AV5InformeInditex);
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
      pa14P2( ) ;
      ws14P2( ) ;
      we14P2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV42Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV39Fec1 = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV40Fec2 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV5InformeInditex = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa14P2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wwuti118_sdt_2", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa14P2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV42Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Emprcod", AV42Emprcod);
         AV39Fec1 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Fec1", localUtil.format(AV39Fec1, "99/99/99"));
         AV40Fec2 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Fec2", localUtil.format(AV40Fec2, "99/99/99"));
         AV5InformeInditex = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5InformeInditex", AV5InformeInditex);
      }
      wcpOAV42Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV42Emprcod") ;
      wcpOAV39Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39Fec1"), 0) ;
      wcpOAV40Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV40Fec2"), 0) ;
      wcpOAV5InformeInditex = httpContext.cgiGet( sPrefix+"wcpOAV5InformeInditex") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV42Emprcod, wcpOAV42Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV39Fec1), GXutil.resetTime(wcpOAV39Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV40Fec2), GXutil.resetTime(wcpOAV40Fec2)) ) || ( GXutil.strcmp(AV5InformeInditex, wcpOAV5InformeInditex) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV42Emprcod = AV42Emprcod ;
      wcpOAV39Fec1 = AV39Fec1 ;
      wcpOAV40Fec2 = AV40Fec2 ;
      wcpOAV5InformeInditex = AV5InformeInditex ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV42Emprcod = httpContext.cgiGet( sPrefix+"AV42Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV42Emprcod) > 0 )
      {
         AV42Emprcod = httpContext.cgiGet( sCtrlAV42Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Emprcod", AV42Emprcod);
      }
      else
      {
         AV42Emprcod = httpContext.cgiGet( sPrefix+"AV42Emprcod_PARM") ;
      }
      sCtrlAV39Fec1 = httpContext.cgiGet( sPrefix+"AV39Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV39Fec1) > 0 )
      {
         AV39Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV39Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Fec1", localUtil.format(AV39Fec1, "99/99/99"));
      }
      else
      {
         AV39Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV39Fec1_PARM"), 0) ;
      }
      sCtrlAV40Fec2 = httpContext.cgiGet( sPrefix+"AV40Fec2_CTRL") ;
      if ( GXutil.len( sCtrlAV40Fec2) > 0 )
      {
         AV40Fec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV40Fec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Fec2", localUtil.format(AV40Fec2, "99/99/99"));
      }
      else
      {
         AV40Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV40Fec2_PARM"), 0) ;
      }
      sCtrlAV5InformeInditex = httpContext.cgiGet( sPrefix+"AV5InformeInditex_CTRL") ;
      if ( GXutil.len( sCtrlAV5InformeInditex) > 0 )
      {
         AV5InformeInditex = httpContext.cgiGet( sCtrlAV5InformeInditex) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5InformeInditex", AV5InformeInditex);
      }
      else
      {
         AV5InformeInditex = httpContext.cgiGet( sPrefix+"AV5InformeInditex_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa14P2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws14P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws14P2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Emprcod_PARM", GXutil.rtrim( AV42Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42Emprcod_CTRL", GXutil.rtrim( sCtrlAV42Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Fec1_PARM", localUtil.dtoc( AV39Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Fec1_CTRL", GXutil.rtrim( sCtrlAV39Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Fec2_PARM", localUtil.dtoc( AV40Fec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40Fec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40Fec2_CTRL", GXutil.rtrim( sCtrlAV40Fec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5InformeInditex_PARM", AV5InformeInditex);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5InformeInditex)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5InformeInditex_CTRL", GXutil.rtrim( sCtrlAV5InformeInditex));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we14P2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556250", true, true);
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
      httpContext.AddJavascriptSource("wwuti118_sdt_2.js", "?20268211556251", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_362( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_36_idx ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM_"+sGXsfl_36_idx ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM_"+sGXsfl_36_idx ;
      edtavCategoria_Internalname = sPrefix+"vCATEGORIA_"+sGXsfl_36_idx ;
      edtavPrdfuncion_Internalname = sPrefix+"vPRDFUNCION_"+sGXsfl_36_idx ;
      edtavPrdnrocas_Internalname = sPrefix+"vPRDNROCAS_"+sGXsfl_36_idx ;
      edtavPrdeinecs_Internalname = sPrefix+"vPRDEINECS_"+sGXsfl_36_idx ;
      edtavPrdnmqu_Internalname = sPrefix+"vPRDNMQU_"+sGXsfl_36_idx ;
      cmbavPrdzdhc.setInternalname( sPrefix+"vPRDZDHC_"+sGXsfl_36_idx );
      edtavLote_Internalname = sPrefix+"vLOTE_"+sGXsfl_36_idx ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM_"+sGXsfl_36_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_36_idx ;
      edtavCantc_Internalname = sPrefix+"vCANTC_"+sGXsfl_36_idx ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM_"+sGXsfl_36_idx ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL_"+sGXsfl_36_idx ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_36_fel_idx ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM_"+sGXsfl_36_fel_idx ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM_"+sGXsfl_36_fel_idx ;
      edtavCategoria_Internalname = sPrefix+"vCATEGORIA_"+sGXsfl_36_fel_idx ;
      edtavPrdfuncion_Internalname = sPrefix+"vPRDFUNCION_"+sGXsfl_36_fel_idx ;
      edtavPrdnrocas_Internalname = sPrefix+"vPRDNROCAS_"+sGXsfl_36_fel_idx ;
      edtavPrdeinecs_Internalname = sPrefix+"vPRDEINECS_"+sGXsfl_36_fel_idx ;
      edtavPrdnmqu_Internalname = sPrefix+"vPRDNMQU_"+sGXsfl_36_fel_idx ;
      cmbavPrdzdhc.setInternalname( sPrefix+"vPRDZDHC_"+sGXsfl_36_fel_idx );
      edtavLote_Internalname = sPrefix+"vLOTE_"+sGXsfl_36_fel_idx ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM_"+sGXsfl_36_fel_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_36_fel_idx ;
      edtavCantc_Internalname = sPrefix+"vCANTC_"+sGXsfl_36_fel_idx ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM_"+sGXsfl_36_fel_idx ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL_"+sGXsfl_36_fel_idx ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb14P0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV41DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,37);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e1814p2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnum_Internalname,GXutil.rtrim( AV17PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnum_Enabled!=0)&&(edtavPrdnum_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnum_Visible),Integer.valueOf(edtavPrdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnom_Internalname,GXutil.rtrim( AV18PrdNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnom_Enabled!=0)&&(edtavPrdnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnom_Visible),Integer.valueOf(edtavPrdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCategoria_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCategoria_Enabled!=0)&&(edtavCategoria_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCategoria_Internalname,GXutil.rtrim( AV60Categoria),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCategoria_Enabled!=0)&&(edtavCategoria_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCategoria_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCategoria_Visible),Integer.valueOf(edtavCategoria_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdfuncion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdfuncion_Enabled!=0)&&(edtavPrdfuncion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdfuncion_Internalname,GXutil.rtrim( AV55PrdFuncion),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdfuncion_Enabled!=0)&&(edtavPrdfuncion_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdfuncion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdfuncion_Visible),Integer.valueOf(edtavPrdfuncion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnrocas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnrocas_Enabled!=0)&&(edtavPrdnrocas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnrocas_Internalname,GXutil.rtrim( AV56PrdNroCAS),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnrocas_Enabled!=0)&&(edtavPrdnrocas_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnrocas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnrocas_Visible),Integer.valueOf(edtavPrdnrocas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdeinecs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdeinecs_Enabled!=0)&&(edtavPrdeinecs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdeinecs_Internalname,GXutil.rtrim( AV57PrdEINECS),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdeinecs_Enabled!=0)&&(edtavPrdeinecs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdeinecs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdeinecs_Visible),Integer.valueOf(edtavPrdeinecs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdnmqu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdnmqu_Enabled!=0)&&(edtavPrdnmqu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdnmqu_Internalname,AV58PrdNmQu,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdnmqu_Enabled!=0)&&(edtavPrdnmqu_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdnmqu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdnmqu_Visible),Integer.valueOf(edtavPrdnmqu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavPrdzdhc.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavPrdzdhc.getEnabled()!=0)&&(cmbavPrdzdhc.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         if ( ( cmbavPrdzdhc.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vPRDZDHC_" + sGXsfl_36_idx ;
            cmbavPrdzdhc.setName( GXCCtl );
            cmbavPrdzdhc.setWebtags( "" );
            cmbavPrdzdhc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbavPrdzdhc.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
            cmbavPrdzdhc.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
            cmbavPrdzdhc.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
            if ( cmbavPrdzdhc.getItemCount() > 0 )
            {
               AV59PrdZDHC = cmbavPrdzdhc.getValidValue(AV59PrdZDHC) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPrdzdhc.getInternalname(), AV59PrdZDHC);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavPrdzdhc,cmbavPrdzdhc.getInternalname(),GXutil.rtrim( AV59PrdZDHC),Integer.valueOf(1),cmbavPrdzdhc.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavPrdzdhc.getVisible()),Integer.valueOf(cmbavPrdzdhc.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavPrdzdhc.getEnabled()!=0)&&(cmbavPrdzdhc.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavPrdzdhc.setValue( GXutil.rtrim( AV59PrdZDHC) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPrdzdhc.getInternalname(), "Values", cmbavPrdzdhc.ToJavascriptSource(), !bGXsfl_36_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavLote_Enabled!=0)&&(edtavLote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLote_Internalname,GXutil.rtrim( AV19Lote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavLote_Enabled!=0)&&(edtavLote_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavLote_Visible),Integer.valueOf(edtavLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrdfabnm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdfabnm_Enabled!=0)&&(edtavPrdfabnm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdfabnm_Internalname,GXutil.rtrim( AV20PrdFabNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrdfabnm_Enabled!=0)&&(edtavPrdfabnm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdfabnm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdfabnm_Visible),Integer.valueOf(edtavPrdfabnm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrvnom_Enabled!=0)&&(edtavPrvnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrvnom_Internalname,GXutil.rtrim( AV21PrvNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrvnom_Enabled!=0)&&(edtavPrvnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrvnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrvnom_Visible),Integer.valueOf(edtavPrvnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantc_Enabled!=0)&&(edtavCantc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantc_Internalname,GXutil.ltrim( localUtil.ntoc( AV22CantC, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantc_Enabled!=0) ? localUtil.format( AV22CantC, "ZZZZZZ9.999") : localUtil.format( AV22CantC, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavCantc_Enabled!=0)&&(edtavCantc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantc_Visible),Integer.valueOf(edtavCantc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantcm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantcm_Enabled!=0)&&(edtavCantcm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantcm_Internalname,GXutil.ltrim( localUtil.ntoc( AV23CantCm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantcm_Enabled!=0) ? localUtil.format( AV23CantCm, "ZZZZZZZ9.99") : localUtil.format( AV23CantCm, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCantcm_Enabled!=0)&&(edtavCantcm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantcm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantcm_Visible),Integer.valueOf(edtavCantcm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStockinicial_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStockinicial_Enabled!=0)&&(edtavStockinicial_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStockinicial_Internalname,GXutil.ltrim( localUtil.ntoc( AV24StockInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStockinicial_Enabled!=0) ? localUtil.format( AV24StockInicial, "ZZZZZZ9.9999") : localUtil.format( AV24StockInicial, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavStockinicial_Enabled!=0)&&(edtavStockinicial_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStockinicial_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStockinicial_Visible),Integer.valueOf(edtavStockinicial_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavStockfinal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavStockfinal_Enabled!=0)&&(edtavStockfinal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_36_idx+"',36)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavStockfinal_Internalname,GXutil.ltrim( localUtil.ntoc( AV25Stockfinal, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavStockfinal_Enabled!=0) ? localUtil.format( AV25Stockfinal, "ZZZZZZ9.9999") : localUtil.format( AV25Stockfinal, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavStockfinal_Enabled!=0)&&(edtavStockfinal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavStockfinal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavStockfinal_Visible),Integer.valueOf(edtavStockfinal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes14P2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCategoria_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Categoria", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdfuncion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Funcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnrocas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CAS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdeinecs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº EINECS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdnmqu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Substancia Quimica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavPrdzdhc.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ZDHC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdfabnm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fabricante", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Distribuidor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Consumos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantcm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Compras", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStockinicial_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( edtavStockinicial_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavStockfinal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV41DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17PrdNum));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18PrdNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60Categoria));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCategoria_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCategoria_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV55PrdFuncion));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdfuncion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdfuncion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV56PrdNroCAS));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnrocas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnrocas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV57PrdEINECS));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdeinecs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdeinecs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV58PrdNmQu);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdnmqu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdnmqu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV59PrdZDHC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavPrdzdhc.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavPrdzdhc.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19Lote));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV20PrdFabNm));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdfabnm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdfabnm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21PrvNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22CantC, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23CantCm, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantcm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantcm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24StockInicial, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavStockinicial_Title));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStockinicial_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStockinicial_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25Stockfinal, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavStockfinal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavStockfinal_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportar_Internalname = sPrefix+"BTNEXPORTAR" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavPrdnum_Internalname = sPrefix+"vPRDNUM" ;
      edtavPrdnom_Internalname = sPrefix+"vPRDNOM" ;
      edtavCategoria_Internalname = sPrefix+"vCATEGORIA" ;
      edtavPrdfuncion_Internalname = sPrefix+"vPRDFUNCION" ;
      edtavPrdnrocas_Internalname = sPrefix+"vPRDNROCAS" ;
      edtavPrdeinecs_Internalname = sPrefix+"vPRDEINECS" ;
      edtavPrdnmqu_Internalname = sPrefix+"vPRDNMQU" ;
      cmbavPrdzdhc.setInternalname( sPrefix+"vPRDZDHC" );
      edtavLote_Internalname = sPrefix+"vLOTE" ;
      edtavPrdfabnm_Internalname = sPrefix+"vPRDFABNM" ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM" ;
      edtavCantc_Internalname = sPrefix+"vCANTC" ;
      edtavCantcm_Internalname = sPrefix+"vCANTCM" ;
      edtavStockinicial_Internalname = sPrefix+"vSTOCKINICIAL" ;
      edtavStockfinal_Internalname = sPrefix+"vSTOCKFINAL" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavStockfinal_Jsonclick = "" ;
      edtavStockfinal_Enabled = 1 ;
      edtavStockinicial_Jsonclick = "" ;
      edtavStockinicial_Enabled = 1 ;
      edtavCantcm_Jsonclick = "" ;
      edtavCantcm_Enabled = 1 ;
      edtavCantc_Jsonclick = "" ;
      edtavCantc_Enabled = 1 ;
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 1 ;
      edtavPrdfabnm_Jsonclick = "" ;
      edtavPrdfabnm_Enabled = 1 ;
      edtavLote_Jsonclick = "" ;
      edtavLote_Enabled = 1 ;
      cmbavPrdzdhc.setJsonclick( "" );
      cmbavPrdzdhc.setEnabled( 1 );
      edtavPrdnmqu_Jsonclick = "" ;
      edtavPrdnmqu_Enabled = 1 ;
      edtavPrdeinecs_Jsonclick = "" ;
      edtavPrdeinecs_Enabled = 1 ;
      edtavPrdnrocas_Jsonclick = "" ;
      edtavPrdnrocas_Enabled = 1 ;
      edtavPrdfuncion_Jsonclick = "" ;
      edtavPrdfuncion_Enabled = 1 ;
      edtavCategoria_Jsonclick = "" ;
      edtavCategoria_Enabled = 1 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Enabled = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavStockfinal_Visible = -1 ;
      edtavStockinicial_Visible = -1 ;
      edtavCantcm_Visible = -1 ;
      edtavCantc_Visible = -1 ;
      edtavPrvnom_Visible = -1 ;
      edtavPrdfabnm_Visible = -1 ;
      edtavLote_Visible = -1 ;
      cmbavPrdzdhc.setVisible( -1 );
      edtavPrdnmqu_Visible = -1 ;
      edtavPrdeinecs_Visible = -1 ;
      edtavPrdnrocas_Visible = -1 ;
      edtavPrdfuncion_Visible = -1 ;
      edtavCategoria_Visible = -1 ;
      edtavPrdnom_Visible = -1 ;
      edtavPrdnum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:Categoria|4:PrdFuncion|5:PrdNroCAS|6:PrdEINECS|7:PrdNmQu|8:PrdZDHC|9:Lote|10:PrdFabNm|11:PrvNom|12:CantC|13:CantCm|14:StockInicial|15:Stockfinal" ;
      Ddo_grid_Gridinternalname = "" ;
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
      edtavStockinicial_Title = httpContext.getMessage( "Stock Inicial", "") ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vPRDZDHC_" + sGXsfl_36_idx ;
      cmbavPrdzdhc.setName( GXCCtl );
      cmbavPrdzdhc.setWebtags( "" );
      cmbavPrdzdhc.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavPrdzdhc.addItem("1", httpContext.getMessage( "Nivel 1", ""), (short)(0));
      cmbavPrdzdhc.addItem("2", httpContext.getMessage( "Nivel 2", ""), (short)(0));
      cmbavPrdzdhc.addItem("3", httpContext.getMessage( "Nivel 3", ""), (short)(0));
      if ( cmbavPrdzdhc.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1714P2',iparms:[{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV41DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV17PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV18PrdNom',fld:'vPRDNOM',pic:''},{av:'AV60Categoria',fld:'vCATEGORIA',pic:''},{av:'AV55PrdFuncion',fld:'vPRDFUNCION',pic:''},{av:'AV56PrdNroCAS',fld:'vPRDNROCAS',pic:''},{av:'AV57PrdEINECS',fld:'vPRDEINECS',pic:''},{av:'AV58PrdNmQu',fld:'vPRDNMQU',pic:''},{av:'cmbavPrdzdhc'},{av:'AV59PrdZDHC',fld:'vPRDZDHC',pic:'@!'},{av:'AV19Lote',fld:'vLOTE',pic:'',hsh:true},{av:'AV20PrdFabNm',fld:'vPRDFABNM',pic:''},{av:'AV21PrvNom',fld:'vPRVNOM',pic:''},{av:'AV22CantC',fld:'vCANTC',pic:'ZZZZZZ9.999'},{av:'AV23CantCm',fld:'vCANTCM',pic:'ZZZZZZZ9.99'},{av:'AV25Stockfinal',fld:'vSTOCKFINAL',pic:'ZZZZZZ9.9999'},{av:'AV24StockInicial',fld:'vSTOCKINICIAL',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1214P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1114P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e1314P2',iparms:[{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1414P2',iparms:[{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e1814P2',iparms:[{av:'AV42Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV19Lote',fld:'vLOTE',pic:'',hsh:true},{av:'AV39Fec1',fld:'vFEC1',pic:''},{av:'AV40Fec2',fld:'vFEC2',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavStockinicial_Title',ctrl:'vSTOCKINICIAL',prop:'Title'},{av:'AV5InformeInditex',fld:'vINFORMEINDITEX',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavPrdnum_Visible',ctrl:'vPRDNUM',prop:'Visible'},{av:'edtavPrdnom_Visible',ctrl:'vPRDNOM',prop:'Visible'},{av:'edtavCategoria_Visible',ctrl:'vCATEGORIA',prop:'Visible'},{av:'edtavPrdfuncion_Visible',ctrl:'vPRDFUNCION',prop:'Visible'},{av:'edtavPrdnrocas_Visible',ctrl:'vPRDNROCAS',prop:'Visible'},{av:'edtavPrdeinecs_Visible',ctrl:'vPRDEINECS',prop:'Visible'},{av:'edtavPrdnmqu_Visible',ctrl:'vPRDNMQU',prop:'Visible'},{av:'cmbavPrdzdhc'},{av:'edtavLote_Visible',ctrl:'vLOTE',prop:'Visible'},{av:'edtavPrdfabnm_Visible',ctrl:'vPRDFABNM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtavCantc_Visible',ctrl:'vCANTC',prop:'Visible'},{av:'edtavCantcm_Visible',ctrl:'vCANTCM',prop:'Visible'},{av:'edtavStockinicial_Visible',ctrl:'vSTOCKINICIAL',prop:'Visible'},{av:'edtavStockfinal_Visible',ctrl:'vSTOCKFINAL',prop:'Visible'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Stockfinal',iparms:[]");
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
      wcpOAV42Emprcod = "" ;
      wcpOAV39Fec1 = GXutil.nullDate() ;
      wcpOAV40Fec2 = GXutil.nullDate() ;
      wcpOAV5InformeInditex = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV42Emprcod = "" ;
      AV39Fec1 = GXutil.nullDate() ;
      AV40Fec2 = GXutil.nullDate() ;
      AV5InformeInditex = "" ;
      AV28ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV68Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV31ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV34DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportar_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV41DetailWebComponent = "" ;
      AV17PrdNum = "" ;
      AV18PrdNom = "" ;
      AV60Categoria = "" ;
      AV55PrdFuncion = "" ;
      AV56PrdNroCAS = "" ;
      AV57PrdEINECS = "" ;
      AV58PrdNmQu = "" ;
      AV59PrdZDHC = "" ;
      AV19Lote = "" ;
      AV20PrdFabNm = "" ;
      AV21PrvNom = "" ;
      AV22CantC = DecimalUtil.ZERO ;
      AV23CantCm = DecimalUtil.ZERO ;
      AV24StockInicial = DecimalUtil.ZERO ;
      AV25Stockfinal = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      AV6SdtInformeInditexCollection = new GXBaseCollection<app.SdtSDTInformeInditex>(app.SdtSDTInformeInditex.class, "SDTInformeInditex", "TexplusNET", remoteHandle);
      AV48Dia = "" ;
      AV49DiaActual = "" ;
      AV43DiaFinMes = GXutil.nullDate() ;
      AV50DiaIniMesActual = GXutil.nullDate() ;
      AV51DiaFinMesActual = GXutil.nullDate() ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV38sdtInformeInditex = new app.SdtSDTInformeInditex(remoteHandle, context);
      AV63PrdFHS = GXutil.nullDate() ;
      AV64LocUtiDc = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV32ManageFiltersXml = "" ;
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54WebSession = httpContext.getWebSession();
      AV61ExcelFilename = "" ;
      GXv_char5 = new String[1] ;
      AV62ErrorMessage = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char6 = new String[1] ;
      AV29ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV42Emprcod = "" ;
      sCtrlAV39Fec1 = "" ;
      sCtrlAV40Fec2 = "" ;
      sCtrlAV5InformeInditex = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV68Pgmname = "WWUti118_SDT_2" ;
      /* GeneXus formulas. */
      AV68Pgmname = "WWUti118_SDT_2" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavPrdnum_Enabled = 0 ;
      edtavPrdnom_Enabled = 0 ;
      edtavCategoria_Enabled = 0 ;
      edtavPrdfuncion_Enabled = 0 ;
      edtavPrdnrocas_Enabled = 0 ;
      edtavPrdeinecs_Enabled = 0 ;
      edtavPrdnmqu_Enabled = 0 ;
      cmbavPrdzdhc.setEnabled( 0 );
      edtavLote_Enabled = 0 ;
      edtavPrdfabnm_Enabled = 0 ;
      edtavPrvnom_Enabled = 0 ;
      edtavCantc_Enabled = 0 ;
      edtavCantcm_Enabled = 0 ;
      edtavStockinicial_Enabled = 0 ;
      edtavStockfinal_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV33ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV44Mes ;
   private byte AV46MesAnt ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV45Anyo ;
   private short AV47AnyoANt ;
   private int nRC_GXsfl_36 ;
   private int subGrid_Rows ;
   private int nGXsfl_36_idx=1 ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavCategoria_Enabled ;
   private int edtavPrdfuncion_Enabled ;
   private int edtavPrdnrocas_Enabled ;
   private int edtavPrdeinecs_Enabled ;
   private int edtavPrdnmqu_Enabled ;
   private int edtavLote_Enabled ;
   private int edtavPrdfabnm_Enabled ;
   private int edtavPrvnom_Enabled ;
   private int edtavCantc_Enabled ;
   private int edtavCantcm_Enabled ;
   private int edtavStockinicial_Enabled ;
   private int edtavStockfinal_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavPrdnum_Visible ;
   private int edtavPrdnom_Visible ;
   private int edtavCategoria_Visible ;
   private int edtavPrdfuncion_Visible ;
   private int edtavPrdnrocas_Visible ;
   private int edtavPrdeinecs_Visible ;
   private int edtavPrdnmqu_Visible ;
   private int edtavLote_Visible ;
   private int edtavPrdfabnm_Visible ;
   private int edtavPrvnom_Visible ;
   private int edtavCantc_Visible ;
   private int edtavCantcm_Visible ;
   private int edtavStockinicial_Visible ;
   private int edtavStockfinal_Visible ;
   private int AV67GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal AV22CantC ;
   private java.math.BigDecimal AV23CantCm ;
   private java.math.BigDecimal AV24StockInicial ;
   private java.math.BigDecimal AV25Stockfinal ;
   private String wcpOAV42Emprcod ;
   private String edtavStockinicial_Title ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV42Emprcod ;
   private String sGXsfl_36_idx="0001" ;
   private String edtavStockinicial_Internalname ;
   private String AV68Pgmname ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV41DetailWebComponent ;
   private String AV17PrdNum ;
   private String edtavPrdnum_Internalname ;
   private String AV18PrdNom ;
   private String edtavPrdnom_Internalname ;
   private String AV60Categoria ;
   private String edtavCategoria_Internalname ;
   private String AV55PrdFuncion ;
   private String edtavPrdfuncion_Internalname ;
   private String AV56PrdNroCAS ;
   private String edtavPrdnrocas_Internalname ;
   private String AV57PrdEINECS ;
   private String edtavPrdeinecs_Internalname ;
   private String edtavPrdnmqu_Internalname ;
   private String AV59PrdZDHC ;
   private String AV19Lote ;
   private String edtavLote_Internalname ;
   private String AV20PrdFabNm ;
   private String edtavPrdfabnm_Internalname ;
   private String AV21PrvNom ;
   private String edtavPrvnom_Internalname ;
   private String edtavCantc_Internalname ;
   private String edtavCantcm_Internalname ;
   private String edtavStockfinal_Internalname ;
   private String GXCCtl ;
   private String AV48Dia ;
   private String AV49DiaActual ;
   private String AV64LocUtiDc ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char6[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String sCtrlAV42Emprcod ;
   private String sCtrlAV39Fec1 ;
   private String sCtrlAV40Fec2 ;
   private String sCtrlAV5InformeInditex ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnom_Jsonclick ;
   private String edtavCategoria_Jsonclick ;
   private String edtavPrdfuncion_Jsonclick ;
   private String edtavPrdnrocas_Jsonclick ;
   private String edtavPrdeinecs_Jsonclick ;
   private String edtavPrdnmqu_Jsonclick ;
   private String edtavLote_Jsonclick ;
   private String edtavPrdfabnm_Jsonclick ;
   private String edtavPrvnom_Jsonclick ;
   private String edtavCantc_Jsonclick ;
   private String edtavCantcm_Jsonclick ;
   private String edtavStockinicial_Jsonclick ;
   private String edtavStockfinal_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV39Fec1 ;
   private java.util.Date wcpOAV40Fec2 ;
   private java.util.Date AV39Fec1 ;
   private java.util.Date AV40Fec2 ;
   private java.util.Date AV43DiaFinMes ;
   private java.util.Date AV50DiaIniMesActual ;
   private java.util.Date AV51DiaFinMesActual ;
   private java.util.Date AV63PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV26ColumnsSelectorXML ;
   private String AV32ManageFiltersXml ;
   private String AV27UserCustomValue ;
   private String wcpOAV5InformeInditex ;
   private String AV5InformeInditex ;
   private String AV58PrdNmQu ;
   private String AV61ExcelFilename ;
   private String AV62ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavPrdzdhc ;
   private com.genexus.webpanels.WebSession AV54WebSession ;
   private GXBaseCollection<app.SdtSDTInformeInditex> AV6SdtInformeInditexCollection ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV31ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item10[] ;
   private app.SdtSDTInformeInditex AV38sdtInformeInditex ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV34DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[] ;
}

