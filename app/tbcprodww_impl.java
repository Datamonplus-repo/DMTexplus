package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbcprodww_impl extends GXDataArea
{
   public tbcprodww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbcprodww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbcprodww_impl.class ));
   }

   public tbcprodww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbBCUndComp = new HTMLChoice();
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
      AV55ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV46ColumnsSelector);
      AV95FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV57TFBCProducto = httpContext.GetPar( "TFBCProducto") ;
      AV58TFBCProducto_Sel = httpContext.GetPar( "TFBCProducto_Sel") ;
      AV60TFBCDescripcion = httpContext.GetPar( "TFBCDescripcion") ;
      AV61TFBCDescripcion_Sel = httpContext.GetPar( "TFBCDescripcion_Sel") ;
      AV63TFBCPrecio = CommonUtil.decimalVal( httpContext.GetPar( "TFBCPrecio"), ".") ;
      AV64TFBCPrecio_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBCPrecio_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV67TFBCUndComp_Sels);
      AV69TFBCProveedor = httpContext.GetPar( "TFBCProveedor") ;
      AV70TFBCProveedor_Sel = httpContext.GetPar( "TFBCProveedor_Sel") ;
      AV72TFBCProcesado = (short)(GXutil.lval( httpContext.GetPar( "TFBCProcesado"))) ;
      AV73TFBCProcesado_To = (short)(GXutil.lval( httpContext.GetPar( "TFBCProcesado_To"))) ;
      AV75TFBCError = (short)(GXutil.lval( httpContext.GetPar( "TFBCError"))) ;
      AV76TFBCError_To = (short)(GXutil.lval( httpContext.GetPar( "TFBCError_To"))) ;
      AV78TFBCDescError = httpContext.GetPar( "TFBCDescError") ;
      AV79TFBCDescError_Sel = httpContext.GetPar( "TFBCDescError_Sel") ;
      AV81TFBCFechError = localUtil.parseDTimeParm( httpContext.GetPar( "TFBCFechError")) ;
      AV86TFBCPilaError = httpContext.GetPar( "TFBCPilaError") ;
      AV87TFBCPilaError_Sel = httpContext.GetPar( "TFBCPilaError_Sel") ;
      AV122Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      pa4Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start4Y2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tbcprodww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV53ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV53ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV91GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV92GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV89DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV89DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV46ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV46ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV55ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPRODUCTO", GXutil.rtrim( AV57TFBCProducto));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPRODUCTO_SEL", GXutil.rtrim( AV58TFBCProducto_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCDESCRIPCION", GXutil.rtrim( AV60TFBCDescripcion));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCDESCRIPCION_SEL", GXutil.rtrim( AV61TFBCDescripcion_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPRECIO", GXutil.ltrim( localUtil.ntoc( AV63TFBCPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPRECIO_TO", GXutil.ltrim( localUtil.ntoc( AV64TFBCPrecio_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFBCUNDCOMP_SELS", AV67TFBCUndComp_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFBCUNDCOMP_SELS", AV67TFBCUndComp_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPROVEEDOR", GXutil.rtrim( AV69TFBCProveedor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPROVEEDOR_SEL", GXutil.rtrim( AV70TFBCProveedor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPROCESADO", GXutil.ltrim( localUtil.ntoc( AV72TFBCProcesado, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPROCESADO_TO", GXutil.ltrim( localUtil.ntoc( AV73TFBCProcesado_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCERROR", GXutil.ltrim( localUtil.ntoc( AV75TFBCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCERROR_TO", GXutil.ltrim( localUtil.ntoc( AV76TFBCError_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCDESCERROR", AV78TFBCDescError);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCDESCERROR_SEL", AV79TFBCDescError_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCFECHERROR", localUtil.ttoc( AV81TFBCFechError, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPILAERROR", AV86TFBCPilaError);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCPILAERROR_SEL", AV87TFBCPilaError_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBCUNDCOMP_SELSJSON", AV66TFBCUndComp_SelsJson);
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
         we4Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt4Y2( ) ;
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
      return formatLink("app.tbcprodww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBCPRODWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Productos", "") ;
   }

   public void wb4Y0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_4Y2( true) ;
      }
      else
      {
         wb_table1_27_4Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_4Y2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV91GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV92GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV89DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV89DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV46ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_bcfecherrorauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_bcfecherrorauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_bcfecherrorauxdate_Internalname, localUtil.format(AV83DDO_BCFechErrorAuxDate, "99/99/99"), localUtil.format( AV83DDO_BCFechErrorAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_bcfecherrorauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_bcfecherrorauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBCPRODWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start4Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup4Y0( ) ;
   }

   public void ws4Y2( )
   {
      start4Y2( ) ;
      evt4Y2( ) ;
   }

   public void evt4Y2( )
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
                           e114Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e124Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e134Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e144Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e154Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e164Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e174Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e184Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e194Y2 ();
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
                           AV96GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A13478BCProducto = httpContext.cgiGet( edtBCProducto_Internalname) ;
                           A13479BCDescripc = httpContext.cgiGet( edtBCDescripc_Internalname) ;
                           n13479BCDescripc = false ;
                           A13480BCPrecio = localUtil.ctond( httpContext.cgiGet( edtBCPrecio_Internalname)) ;
                           n13480BCPrecio = false ;
                           cmbBCUndComp.setName( cmbBCUndComp.getInternalname() );
                           cmbBCUndComp.setValue( httpContext.cgiGet( cmbBCUndComp.getInternalname()) );
                           A13481BCUndComp = (short)(GXutil.lval( httpContext.cgiGet( cmbBCUndComp.getInternalname()))) ;
                           n13481BCUndComp = false ;
                           A13482BCProveedo = httpContext.cgiGet( edtBCProveedo_Internalname) ;
                           n13482BCProveedo = false ;
                           A13483BCProcesad = (short)(localUtil.ctol( httpContext.cgiGet( edtBCProcesad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13483BCProcesad = false ;
                           A13484BCError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13484BCError = false ;
                           A13485BCDescErro = httpContext.cgiGet( edtBCDescErro_Internalname) ;
                           n13485BCDescErro = false ;
                           A13486BCFechErro = localUtil.ctot( httpContext.cgiGet( edtBCFechErro_Internalname), 0) ;
                           n13486BCFechErro = false ;
                           A13487BCPilaErro = httpContext.cgiGet( edtBCPilaErro_Internalname) ;
                           n13487BCPilaErro = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e204Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e214Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e224Y2 ();
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

   public void we4Y2( )
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

   public void pa4Y2( )
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
                                 byte AV55ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV46ColumnsSelector ,
                                 String AV95FilterFullText ,
                                 String AV57TFBCProducto ,
                                 String AV58TFBCProducto_Sel ,
                                 String AV60TFBCDescripcion ,
                                 String AV61TFBCDescripcion_Sel ,
                                 java.math.BigDecimal AV63TFBCPrecio ,
                                 java.math.BigDecimal AV64TFBCPrecio_To ,
                                 GXSimpleCollection<Short> AV67TFBCUndComp_Sels ,
                                 String AV69TFBCProveedor ,
                                 String AV70TFBCProveedor_Sel ,
                                 short AV72TFBCProcesado ,
                                 short AV73TFBCProcesado_To ,
                                 short AV75TFBCError ,
                                 short AV76TFBCError_To ,
                                 String AV78TFBCDescError ,
                                 String AV79TFBCDescError_Sel ,
                                 java.util.Date AV81TFBCFechError ,
                                 String AV86TFBCPilaError ,
                                 String AV87TFBCPilaError_Sel ,
                                 String AV122Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e214Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf4Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BCPRODUCTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13478BCProducto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BCPRODUCTO", GXutil.rtrim( A13478BCProducto));
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
      rf4Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV122Pgmname = "TBCPRODWW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
      GRID_nRecordCount = 0 ;
      pr_ekamat.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV110Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV105Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV104Tbcprodwwds_2_tfbcproducto ,
                                           AV107Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV106Tbcprodwwds_4_tfbcdescripcion ,
                                           AV108Tbcprodwwds_6_tfbcprecio ,
                                           AV109Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV110Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV112Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV111Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV113Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV114Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV115Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV116Tbcprodwwds_14_tfbcerror_to) ,
                                           AV118Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV117Tbcprodwwds_15_tfbcdescerror ,
                                           AV119Tbcprodwwds_17_tfbcfecherror ,
                                           AV121Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV120Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV103Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV104Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV104Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV106Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV106Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV111Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV111Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV117Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV117Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV120Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV120Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor H004Y2 */
      pr_ekamat.execute(0, new Object[] {lV104Tbcprodwwds_2_tfbcproducto, AV105Tbcprodwwds_3_tfbcproducto_sel, lV106Tbcprodwwds_4_tfbcdescripcion, AV107Tbcprodwwds_5_tfbcdescripcion_sel, AV108Tbcprodwwds_6_tfbcprecio, AV109Tbcprodwwds_7_tfbcprecio_to, lV111Tbcprodwwds_9_tfbcproveedor, AV112Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV113Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV114Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV115Tbcprodwwds_13_tfbcerror), Short.valueOf(AV116Tbcprodwwds_14_tfbcerror_to), lV117Tbcprodwwds_15_tfbcdescerror, AV118Tbcprodwwds_16_tfbcdescerror_sel, AV119Tbcprodwwds_17_tfbcfecherror, lV120Tbcprodwwds_18_tfbcpilaerror, AV121Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(0) != 101) )
      {
         A13487BCPilaErro = H004Y2_A13487BCPilaErro[0] ;
         n13487BCPilaErro = H004Y2_n13487BCPilaErro[0] ;
         A13486BCFechErro = H004Y2_A13486BCFechErro[0] ;
         n13486BCFechErro = H004Y2_n13486BCFechErro[0] ;
         A13485BCDescErro = H004Y2_A13485BCDescErro[0] ;
         n13485BCDescErro = H004Y2_n13485BCDescErro[0] ;
         A13484BCError = H004Y2_A13484BCError[0] ;
         n13484BCError = H004Y2_n13484BCError[0] ;
         A13483BCProcesad = H004Y2_A13483BCProcesad[0] ;
         n13483BCProcesad = H004Y2_n13483BCProcesad[0] ;
         A13482BCProveedo = H004Y2_A13482BCProveedo[0] ;
         n13482BCProveedo = H004Y2_n13482BCProveedo[0] ;
         A13481BCUndComp = H004Y2_A13481BCUndComp[0] ;
         n13481BCUndComp = H004Y2_n13481BCUndComp[0] ;
         A13480BCPrecio = H004Y2_A13480BCPrecio[0] ;
         n13480BCPrecio = H004Y2_n13480BCPrecio[0] ;
         A13479BCDescripc = H004Y2_A13479BCDescripc[0] ;
         n13479BCDescripc = H004Y2_n13479BCDescripc[0] ;
         A13478BCProducto = H004Y2_A13478BCProducto[0] ;
         A396EmprCod = H004Y2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV103Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "kilos", "") , GXutil.padr( "%" + GXutil.lower( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( "litros", "") , GXutil.padr( "%" + GXutil.lower( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            /* Using cursor H004Y3 */
            pr_default.execute(0, new Object[] {A396EmprCod});
            A407EmprNom = H004Y3_A407EmprNom[0] ;
            n407EmprNom = H004Y3_n407EmprNom[0] ;
            pr_default.close(0);
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_ekamat.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_ekamat.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_ekamat.close(0);
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf4Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e214Y2 ();
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
         pr_ekamat.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(A13481BCUndComp) ,
                                              AV110Tbcprodwwds_8_tfbcundcomp_sels ,
                                              AV105Tbcprodwwds_3_tfbcproducto_sel ,
                                              AV104Tbcprodwwds_2_tfbcproducto ,
                                              AV107Tbcprodwwds_5_tfbcdescripcion_sel ,
                                              AV106Tbcprodwwds_4_tfbcdescripcion ,
                                              AV108Tbcprodwwds_6_tfbcprecio ,
                                              AV109Tbcprodwwds_7_tfbcprecio_to ,
                                              Integer.valueOf(AV110Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                              AV112Tbcprodwwds_10_tfbcproveedor_sel ,
                                              AV111Tbcprodwwds_9_tfbcproveedor ,
                                              Short.valueOf(AV113Tbcprodwwds_11_tfbcprocesado) ,
                                              Short.valueOf(AV114Tbcprodwwds_12_tfbcprocesado_to) ,
                                              Short.valueOf(AV115Tbcprodwwds_13_tfbcerror) ,
                                              Short.valueOf(AV116Tbcprodwwds_14_tfbcerror_to) ,
                                              AV118Tbcprodwwds_16_tfbcdescerror_sel ,
                                              AV117Tbcprodwwds_15_tfbcdescerror ,
                                              AV119Tbcprodwwds_17_tfbcfecherror ,
                                              AV121Tbcprodwwds_19_tfbcpilaerror_sel ,
                                              AV120Tbcprodwwds_18_tfbcpilaerror ,
                                              A13478BCProducto ,
                                              A13479BCDescripc ,
                                              A13480BCPrecio ,
                                              A13482BCProveedo ,
                                              Short.valueOf(A13483BCProcesad) ,
                                              Short.valueOf(A13484BCError) ,
                                              A13485BCDescErro ,
                                              A13486BCFechErro ,
                                              A13487BCPilaErro ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV103Tbcprodwwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV104Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV104Tbcprodwwds_2_tfbcproducto), 6, "%") ;
         lV106Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV106Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
         lV111Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV111Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
         lV117Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV117Tbcprodwwds_15_tfbcdescerror), "%", "") ;
         lV120Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV120Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
         /* Using cursor H004Y4 */
         pr_ekamat.execute(1, new Object[] {lV104Tbcprodwwds_2_tfbcproducto, AV105Tbcprodwwds_3_tfbcproducto_sel, lV106Tbcprodwwds_4_tfbcdescripcion, AV107Tbcprodwwds_5_tfbcdescripcion_sel, AV108Tbcprodwwds_6_tfbcprecio, AV109Tbcprodwwds_7_tfbcprecio_to, lV111Tbcprodwwds_9_tfbcproveedor, AV112Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV113Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV114Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV115Tbcprodwwds_13_tfbcerror), Short.valueOf(AV116Tbcprodwwds_14_tfbcerror_to), lV117Tbcprodwwds_15_tfbcdescerror, AV118Tbcprodwwds_16_tfbcdescerror_sel, AV119Tbcprodwwds_17_tfbcfecherror, lV120Tbcprodwwds_18_tfbcpilaerror, AV121Tbcprodwwds_19_tfbcpilaerror_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_ekamat.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13487BCPilaErro = H004Y4_A13487BCPilaErro[0] ;
            n13487BCPilaErro = H004Y4_n13487BCPilaErro[0] ;
            A13486BCFechErro = H004Y4_A13486BCFechErro[0] ;
            n13486BCFechErro = H004Y4_n13486BCFechErro[0] ;
            A13485BCDescErro = H004Y4_A13485BCDescErro[0] ;
            n13485BCDescErro = H004Y4_n13485BCDescErro[0] ;
            A13484BCError = H004Y4_A13484BCError[0] ;
            n13484BCError = H004Y4_n13484BCError[0] ;
            A13483BCProcesad = H004Y4_A13483BCProcesad[0] ;
            n13483BCProcesad = H004Y4_n13483BCProcesad[0] ;
            A13482BCProveedo = H004Y4_A13482BCProveedo[0] ;
            n13482BCProveedo = H004Y4_n13482BCProveedo[0] ;
            A13481BCUndComp = H004Y4_A13481BCUndComp[0] ;
            n13481BCUndComp = H004Y4_n13481BCUndComp[0] ;
            A13480BCPrecio = H004Y4_A13480BCPrecio[0] ;
            n13480BCPrecio = H004Y4_n13480BCPrecio[0] ;
            A13479BCDescripc = H004Y4_A13479BCDescripc[0] ;
            n13479BCDescripc = H004Y4_n13479BCDescripc[0] ;
            A13478BCProducto = H004Y4_A13478BCProducto[0] ;
            A396EmprCod = H004Y4_A396EmprCod[0] ;
            if ( (GXutil.strcmp("", AV103Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "kilos", "") , GXutil.padr( "%" + GXutil.lower( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( "litros", "") , GXutil.padr( "%" + GXutil.lower( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV103Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV103Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               /* Using cursor H004Y5 */
               pr_default.execute(1, new Object[] {A396EmprCod});
               A407EmprNom = H004Y5_A407EmprNom[0] ;
               n407EmprNom = H004Y5_n407EmprNom[0] ;
               pr_default.close(1);
               e224Y2 ();
            }
            pr_ekamat.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_ekamat.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_ekamat.close(1);
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb4Y0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes4Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV122Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV122Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BCPRODUCTO"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A13478BCProducto, ""))));
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
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV55ManageFiltersExecutionStep, AV46ColumnsSelector, AV95FilterFullText, AV57TFBCProducto, AV58TFBCProducto_Sel, AV60TFBCDescripcion, AV61TFBCDescripcion_Sel, AV63TFBCPrecio, AV64TFBCPrecio_To, AV67TFBCUndComp_Sels, AV69TFBCProveedor, AV70TFBCProveedor_Sel, AV72TFBCProcesado, AV73TFBCProcesado_To, AV75TFBCError, AV76TFBCError_To, AV78TFBCDescError, AV79TFBCDescError_Sel, AV81TFBCFechError, AV86TFBCPilaError, AV87TFBCPilaError_Sel, AV122Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV122Pgmname = "TBCPRODWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup4Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e204Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV53ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV89DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV46ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV91GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV92GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV95FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95FilterFullText", AV95FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_bcfecherrorauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BCFECHERRORAUXDATE");
            GX_FocusControl = edtavDdo_bcfecherrorauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83DDO_BCFechErrorAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83DDO_BCFechErrorAuxDate", localUtil.format(AV83DDO_BCFechErrorAuxDate, "99/99/99"));
         }
         else
         {
            AV83DDO_BCFechErrorAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_bcfecherrorauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83DDO_BCFechErrorAuxDate", localUtil.format(AV83DDO_BCFechErrorAuxDate, "99/99/99"));
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
      e204Y2 ();
      if (returnInSub) return;
   }

   public void e204Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV99Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tbcprodww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV99Station = GXt_char1 ;
      GXv_char2[0] = AV100Emprcod ;
      GXv_char3[0] = AV101Emprnom ;
      GXv_char4[0] = AV102Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV99Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbcprodww_impl.this.AV100Emprcod = GXv_char2[0] ;
      tbcprodww_impl.this.AV101Emprnom = GXv_char3[0] ;
      tbcprodww_impl.this.AV102Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Productos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV89DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV89DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e214Y2( )
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
      if ( AV55ManageFiltersExecutionStep == 1 )
      {
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV55ManageFiltersExecutionStep == 2 )
      {
         AV55ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV52Session.getValue("TBCPRODWWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV52Session.getValue("TBCPRODWWColumnsSelector") ;
         AV46ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBCProducto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCDescripc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCDescripc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCDescripc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCPrecio_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPrecio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPrecio_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbBCUndComp.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBCUndComp.getInternalname(), "Visible", GXutil.ltrimstr( cmbBCUndComp.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtBCProveedo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProveedo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProveedo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCProcesad_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProcesad_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProcesad_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCError_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCError_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCError_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCDescErro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCDescErro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCDescErro_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCFechErro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCFechErro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCFechErro_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBCPilaErro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPilaErro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPilaErro_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV91GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91GridCurrentPage), 10, 0));
      AV92GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92GridPageCount), 10, 0));
      AV103Tbcprodwwds_1_filterfulltext = AV95FilterFullText ;
      AV104Tbcprodwwds_2_tfbcproducto = AV57TFBCProducto ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = AV58TFBCProducto_Sel ;
      AV106Tbcprodwwds_4_tfbcdescripcion = AV60TFBCDescripcion ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = AV61TFBCDescripcion_Sel ;
      AV108Tbcprodwwds_6_tfbcprecio = AV63TFBCPrecio ;
      AV109Tbcprodwwds_7_tfbcprecio_to = AV64TFBCPrecio_To ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = AV67TFBCUndComp_Sels ;
      AV111Tbcprodwwds_9_tfbcproveedor = AV69TFBCProveedor ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = AV70TFBCProveedor_Sel ;
      AV113Tbcprodwwds_11_tfbcprocesado = AV72TFBCProcesado ;
      AV114Tbcprodwwds_12_tfbcprocesado_to = AV73TFBCProcesado_To ;
      AV115Tbcprodwwds_13_tfbcerror = AV75TFBCError ;
      AV116Tbcprodwwds_14_tfbcerror_to = AV76TFBCError_To ;
      AV117Tbcprodwwds_15_tfbcdescerror = AV78TFBCDescError ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = AV79TFBCDescError_Sel ;
      AV119Tbcprodwwds_17_tfbcfecherror = AV81TFBCFechError ;
      AV120Tbcprodwwds_18_tfbcpilaerror = AV86TFBCPilaError ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = AV87TFBCPilaError_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ColumnsSelector", AV46ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e124Y2( )
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
         AV90PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV90PageToGo) ;
      }
   }

   public void e134Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e144Y2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCProducto") == 0 )
         {
            AV57TFBCProducto = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBCProducto", AV57TFBCProducto);
            AV58TFBCProducto_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBCProducto_Sel", AV58TFBCProducto_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCDescripcion") == 0 )
         {
            AV60TFBCDescripcion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBCDescripcion", AV60TFBCDescripcion);
            AV61TFBCDescripcion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBCDescripcion_Sel", AV61TFBCDescripcion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCPrecio") == 0 )
         {
            AV63TFBCPrecio = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBCPrecio", GXutil.ltrimstr( AV63TFBCPrecio, 13, 5));
            AV64TFBCPrecio_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBCPrecio_To", GXutil.ltrimstr( AV64TFBCPrecio_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCUndComp") == 0 )
         {
            AV66TFBCUndComp_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBCUndComp_SelsJson", AV66TFBCUndComp_SelsJson);
            AV67TFBCUndComp_Sels.fromJSonString(GXutil.strReplace( AV66TFBCUndComp_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCProveedor") == 0 )
         {
            AV69TFBCProveedor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBCProveedor", AV69TFBCProveedor);
            AV70TFBCProveedor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFBCProveedor_Sel", AV70TFBCProveedor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCProcesado") == 0 )
         {
            AV72TFBCProcesado = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBCProcesado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBCProcesado), 4, 0));
            AV73TFBCProcesado_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBCProcesado_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBCProcesado_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCError") == 0 )
         {
            AV75TFBCError = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFBCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFBCError), 4, 0));
            AV76TFBCError_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBCError_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFBCError_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCDescError") == 0 )
         {
            AV78TFBCDescError = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBCDescError", AV78TFBCDescError);
            AV79TFBCDescError_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBCDescError_Sel", AV79TFBCDescError_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCFechError") == 0 )
         {
            AV81TFBCFechError = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBCFechError", localUtil.ttoc( AV81TFBCFechError, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BCPilaError") == 0 )
         {
            AV86TFBCPilaError = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBCPilaError", AV86TFBCPilaError);
            AV87TFBCPilaError_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBCPilaError_Sel", AV87TFBCPilaError_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67TFBCUndComp_Sels", AV67TFBCUndComp_Sels);
   }

   private void e224Y2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtBCDescripc_Link = formatLink("app.tbcprodview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A13478BCProducto)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BCProducto","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV96GridActions, 4, 0)) );
   }

   public void e154Y2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV46ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TBCPRODWWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV46ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ColumnsSelector", AV46ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e114Y2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TBCPRODWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV122Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TBCPRODWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV55ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ManageFiltersExecutionStep", GXutil.str( AV55ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV54ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TBCPRODWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tbcprodww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV54ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV54ManageFiltersXml) ;
            AV10GridState.fromxml(AV54ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67TFBCUndComp_Sels", AV67TFBCUndComp_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46ColumnsSelector", AV46ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53ManageFiltersData", AV53ManageFiltersData);
   }

   public void e164Y2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tbcprod", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","BCProducto"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e174Y2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tbcprodwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tbcprodww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tbcprodww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67TFBCUndComp_Sels", AV67TFBCUndComp_Sels);
   }

   public void e184Y2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tbcprodwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67TFBCUndComp_Sels", AV67TFBCUndComp_Sels);
   }

   public void e194Y2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tbcprodwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67TFBCUndComp_Sels", AV67TFBCUndComp_Sels);
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
      AV46ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCProducto", "", "Producto", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCDescripcion", "", "Descripcion", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCPrecio", "", "Precio", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCUndComp", "", "Unidad Compra", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCProveedor", "", "Proveedor", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCProcesado", "", "Procesado", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCError", "", "Error", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCDescError", "", "Descripción error", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCFechError", "", "Fecha y hora error", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BCPilaError", "", "Pila error", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV41UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TBCPRODWWColumnsSelector", GXv_char4) ;
      tbcprodww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV47ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV47ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV47ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV53ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TBCPRODWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV53ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV95FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95FilterFullText", AV95FilterFullText);
      AV57TFBCProducto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFBCProducto", AV57TFBCProducto);
      AV58TFBCProducto_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFBCProducto_Sel", AV58TFBCProducto_Sel);
      AV60TFBCDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFBCDescripcion", AV60TFBCDescripcion);
      AV61TFBCDescripcion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFBCDescripcion_Sel", AV61TFBCDescripcion_Sel);
      AV63TFBCPrecio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFBCPrecio", GXutil.ltrimstr( AV63TFBCPrecio, 13, 5));
      AV64TFBCPrecio_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFBCPrecio_To", GXutil.ltrimstr( AV64TFBCPrecio_To, 13, 5));
      AV67TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "") ;
      AV69TFBCProveedor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFBCProveedor", AV69TFBCProveedor);
      AV70TFBCProveedor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFBCProveedor_Sel", AV70TFBCProveedor_Sel);
      AV72TFBCProcesado = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFBCProcesado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBCProcesado), 4, 0));
      AV73TFBCProcesado_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFBCProcesado_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBCProcesado_To), 4, 0));
      AV75TFBCError = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFBCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFBCError), 4, 0));
      AV76TFBCError_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFBCError_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFBCError_To), 4, 0));
      AV78TFBCDescError = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFBCDescError", AV78TFBCDescError);
      AV79TFBCDescError_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFBCDescError_Sel", AV79TFBCDescError_Sel);
      AV81TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFBCFechError", localUtil.ttoc( AV81TFBCFechError, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV86TFBCPilaError = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFBCPilaError", AV86TFBCPilaError);
      AV87TFBCPilaError_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFBCPilaError_Sel", AV87TFBCPilaError_Sel);
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
      callWebObject(formatLink("app.tbcprod", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A13478BCProducto))}, new String[] {"Mode","EmprCod","BCProducto"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tbcprod", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A13478BCProducto))}, new String[] {"Mode","EmprCod","BCProducto"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV52Session.getValue(AV122Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV122Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV52Session.getValue(AV122Pgmname+"GridState"), null, null);
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
      AV123GXV1 = 1 ;
      while ( AV123GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV123GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV95FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95FilterFullText", AV95FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO") == 0 )
         {
            AV57TFBCProducto = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBCProducto", AV57TFBCProducto);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO_SEL") == 0 )
         {
            AV58TFBCProducto_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBCProducto_Sel", AV58TFBCProducto_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION") == 0 )
         {
            AV60TFBCDescripcion = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBCDescripcion", AV60TFBCDescripcion);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION_SEL") == 0 )
         {
            AV61TFBCDescripcion_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFBCDescripcion_Sel", AV61TFBCDescripcion_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRECIO") == 0 )
         {
            AV63TFBCPrecio = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBCPrecio", GXutil.ltrimstr( AV63TFBCPrecio, 13, 5));
            AV64TFBCPrecio_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBCPrecio_To", GXutil.ltrimstr( AV64TFBCPrecio_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCUNDCOMP_SEL") == 0 )
         {
            AV66TFBCUndComp_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFBCUndComp_SelsJson", AV66TFBCUndComp_SelsJson);
            AV67TFBCUndComp_Sels.fromJSonString(AV66TFBCUndComp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR") == 0 )
         {
            AV69TFBCProveedor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFBCProveedor", AV69TFBCProveedor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR_SEL") == 0 )
         {
            AV70TFBCProveedor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFBCProveedor_Sel", AV70TFBCProveedor_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROCESADO") == 0 )
         {
            AV72TFBCProcesado = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFBCProcesado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBCProcesado), 4, 0));
            AV73TFBCProcesado_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFBCProcesado_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBCProcesado_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCERROR") == 0 )
         {
            AV75TFBCError = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFBCError", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFBCError), 4, 0));
            AV76TFBCError_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFBCError_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFBCError_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR") == 0 )
         {
            AV78TFBCDescError = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFBCDescError", AV78TFBCDescError);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR_SEL") == 0 )
         {
            AV79TFBCDescError_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFBCDescError_Sel", AV79TFBCDescError_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCFECHERROR") == 0 )
         {
            AV81TFBCFechError = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFBCFechError", localUtil.ttoc( AV81TFBCFechError, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV83DDO_BCFechErrorAuxDate = GXutil.resetTime(AV81TFBCFechError) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83DDO_BCFechErrorAuxDate", localUtil.format(AV83DDO_BCFechErrorAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR") == 0 )
         {
            AV86TFBCPilaError = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBCPilaError", AV86TFBCPilaError);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR_SEL") == 0 )
         {
            AV87TFBCPilaError_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBCPilaError_Sel", AV87TFBCPilaError_Sel);
         }
         AV123GXV1 = (int)(AV123GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBCProducto_Sel)==0), AV58TFBCProducto_Sel, GXv_char4) ;
      tbcprodww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBCDescripcion_Sel)==0), AV61TFBCDescripcion_Sel, GXv_char3) ;
      tbcprodww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFBCProveedor_Sel)==0), AV70TFBCProveedor_Sel, GXv_char2) ;
      tbcprodww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFBCDescError_Sel)==0), AV79TFBCDescError_Sel, GXv_char15) ;
      tbcprodww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFBCPilaError_Sel)==0), AV87TFBCPilaError_Sel, GXv_char17) ;
      tbcprodww_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||"+((AV67TFBCUndComp_Sels.size()==0) ? "" : AV66TFBCUndComp_SelsJson)+"|"+GXt_char13+"|||"+GXt_char14+"||"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBCProducto)==0), AV57TFBCProducto, GXv_char17) ;
      tbcprodww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBCDescripcion)==0), AV60TFBCDescripcion, GXv_char15) ;
      tbcprodww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFBCProveedor)==0), AV69TFBCProveedor, GXv_char4) ;
      tbcprodww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFBCDescError)==0), AV78TFBCDescError, GXv_char3) ;
      tbcprodww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFBCPilaError)==0), AV86TFBCPilaError, GXv_char2) ;
      tbcprodww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFBCPrecio)==0) ? "" : GXutil.str( AV63TFBCPrecio, 13, 5))+"||"+GXt_char13+"|"+((0==AV72TFBCProcesado) ? "" : GXutil.str( AV72TFBCProcesado, 4, 0))+"|"+((0==AV75TFBCError) ? "" : GXutil.str( AV75TFBCError, 4, 0))+"|"+GXt_char12+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV81TFBCFechError) ? "" : localUtil.dtoc( AV83DDO_BCFechErrorAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBCPrecio_To)==0) ? "" : GXutil.str( AV64TFBCPrecio_To, 13, 5))+"|||"+((0==AV73TFBCProcesado_To) ? "" : GXutil.str( AV73TFBCProcesado_To, 4, 0))+"|"+((0==AV76TFBCError_To) ? "" : GXutil.str( AV76TFBCError_To, 4, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV52Session.getValue(AV122Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV95FilterFullText)==0), (short)(0), AV95FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCPRODUCTO", "", !(GXutil.strcmp("", AV57TFBCProducto)==0), (short)(0), AV57TFBCProducto, "", !(GXutil.strcmp("", AV58TFBCProducto_Sel)==0), AV58TFBCProducto_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCDESCRIPCION", "", !(GXutil.strcmp("", AV60TFBCDescripcion)==0), (short)(0), AV60TFBCDescripcion, "", !(GXutil.strcmp("", AV61TFBCDescripcion_Sel)==0), AV61TFBCDescripcion_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCPRECIO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFBCPrecio)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBCPrecio_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV63TFBCPrecio, 13, 5)), GXutil.trim( GXutil.str( AV64TFBCPrecio_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCUNDCOMP_SEL", "", !(AV67TFBCUndComp_Sels.size()==0), (short)(0), AV67TFBCUndComp_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCPROVEEDOR", "", !(GXutil.strcmp("", AV69TFBCProveedor)==0), (short)(0), AV69TFBCProveedor, "", !(GXutil.strcmp("", AV70TFBCProveedor_Sel)==0), AV70TFBCProveedor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCPROCESADO", "", !((0==AV72TFBCProcesado)&&(0==AV73TFBCProcesado_To)), (short)(0), GXutil.trim( GXutil.str( AV72TFBCProcesado, 4, 0)), GXutil.trim( GXutil.str( AV73TFBCProcesado_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCERROR", "", !((0==AV75TFBCError)&&(0==AV76TFBCError_To)), (short)(0), GXutil.trim( GXutil.str( AV75TFBCError, 4, 0)), GXutil.trim( GXutil.str( AV76TFBCError_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCDESCERROR", "", !(GXutil.strcmp("", AV78TFBCDescError)==0), (short)(0), AV78TFBCDescError, "", !(GXutil.strcmp("", AV79TFBCDescError_Sel)==0), AV79TFBCDescError_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCFECHERROR", "", !GXutil.dateCompare(GXutil.nullDate(), AV81TFBCFechError), (short)(0), GXutil.trim( localUtil.ttoc( AV81TFBCFechError, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBCPILAERROR", "", !(GXutil.strcmp("", AV86TFBCPilaError)==0), (short)(0), AV86TFBCPilaError, "", !(GXutil.strcmp("", AV87TFBCPilaError_Sel)==0), AV87TFBCPilaError_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV122Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV122Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TBCPROD" );
      AV52Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_4Y2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV53ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_4Y2( true) ;
      }
      else
      {
         wb_table2_32_4Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_4Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_4Y2e( true) ;
      }
      else
      {
         wb_table1_27_4Y2e( false) ;
      }
   }

   public void wb_table2_32_4Y2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV95FilterFullText, GXutil.rtrim( localUtil.format( AV95FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TBCPRODWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_4Y2e( true) ;
      }
      else
      {
         wb_table2_32_4Y2e( false) ;
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
      pa4Y2( ) ;
      ws4Y2( ) ;
      we4Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116111346", true, true);
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
      httpContext.AddJavascriptSource("tbcprodww.js", "?202682116111346", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtBCProducto_Internalname = "BCPRODUCTO_"+sGXsfl_45_idx ;
      edtBCDescripc_Internalname = "BCDESCRIPC_"+sGXsfl_45_idx ;
      edtBCPrecio_Internalname = "BCPRECIO_"+sGXsfl_45_idx ;
      cmbBCUndComp.setInternalname( "BCUNDCOMP_"+sGXsfl_45_idx );
      edtBCProveedo_Internalname = "BCPROVEEDO_"+sGXsfl_45_idx ;
      edtBCProcesad_Internalname = "BCPROCESAD_"+sGXsfl_45_idx ;
      edtBCError_Internalname = "BCERROR_"+sGXsfl_45_idx ;
      edtBCDescErro_Internalname = "BCDESCERRO_"+sGXsfl_45_idx ;
      edtBCFechErro_Internalname = "BCFECHERRO_"+sGXsfl_45_idx ;
      edtBCPilaErro_Internalname = "BCPILAERRO_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtBCProducto_Internalname = "BCPRODUCTO_"+sGXsfl_45_fel_idx ;
      edtBCDescripc_Internalname = "BCDESCRIPC_"+sGXsfl_45_fel_idx ;
      edtBCPrecio_Internalname = "BCPRECIO_"+sGXsfl_45_fel_idx ;
      cmbBCUndComp.setInternalname( "BCUNDCOMP_"+sGXsfl_45_fel_idx );
      edtBCProveedo_Internalname = "BCPROVEEDO_"+sGXsfl_45_fel_idx ;
      edtBCProcesad_Internalname = "BCPROCESAD_"+sGXsfl_45_fel_idx ;
      edtBCError_Internalname = "BCERROR_"+sGXsfl_45_fel_idx ;
      edtBCDescErro_Internalname = "BCDESCERRO_"+sGXsfl_45_fel_idx ;
      edtBCFechErro_Internalname = "BCFECHERRO_"+sGXsfl_45_fel_idx ;
      edtBCPilaErro_Internalname = "BCPILAERRO_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb4Y0( ) ;
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
               AV96GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV96GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV96GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e234y2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV96GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBCProducto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCProducto_Internalname,GXutil.rtrim( A13478BCProducto),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCProducto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCProducto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBCDescripc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCDescripc_Internalname,GXutil.rtrim( A13479BCDescripc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtBCDescripc_Link,"","","",edtBCDescripc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBCDescripc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBCPrecio_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCPrecio_Internalname,GXutil.ltrim( localUtil.ntoc( A13480BCPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13480BCPrecio, "ZZZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCPrecio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCPrecio_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbBCUndComp.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbBCUndComp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BCUNDCOMP_" + sGXsfl_45_idx ;
            cmbBCUndComp.setName( GXCCtl );
            cmbBCUndComp.setWebtags( "" );
            cmbBCUndComp.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
            cmbBCUndComp.addItem("2", httpContext.getMessage( "Litros", ""), (short)(0));
            if ( cmbBCUndComp.getItemCount() > 0 )
            {
               A13481BCUndComp = (short)(GXutil.lval( cmbBCUndComp.getValidValue(GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0))))) ;
               n13481BCUndComp = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBCUndComp,cmbBCUndComp.getInternalname(),GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0)),Integer.valueOf(1),cmbBCUndComp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbBCUndComp.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBCUndComp.setValue( GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBCUndComp.getInternalname(), "Values", cmbBCUndComp.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBCProveedo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCProveedo_Internalname,GXutil.rtrim( A13482BCProveedo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCProveedo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCProveedo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBCProcesad_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCProcesad_Internalname,GXutil.ltrim( localUtil.ntoc( A13483BCProcesad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13483BCProcesad), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCProcesad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCProcesad_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBCError_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCError_Internalname,GXutil.ltrim( localUtil.ntoc( A13484BCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13484BCError), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCError_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCError_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBCDescErro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCDescErro_Internalname,A13485BCDescErro,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCDescErro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCDescErro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBCFechErro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCFechErro_Internalname,localUtil.ttoc( A13486BCFechErro, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13486BCFechErro, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCFechErro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCFechErro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBCPilaErro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCPilaErro_Internalname,A13487BCPilaErro,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCPilaErro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBCPilaErro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes4Y2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCProducto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCDescripc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCPrecio_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbBCUndComp.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Compra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCProveedo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCProcesad_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procesado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCError_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCDescErro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCFechErro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha y hora error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBCPilaErro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pila error", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV96GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13478BCProducto));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCProducto_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13479BCDescripc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtBCDescripc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCDescripc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13480BCPrecio, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCPrecio_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13481BCUndComp, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbBCUndComp.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13482BCProveedo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCProveedo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13483BCProcesad, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCProcesad_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13484BCError, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCError_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13485BCDescErro);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCDescErro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13486BCFechErro, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCFechErro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13487BCPilaErro);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBCPilaErro_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtBCProducto_Internalname = "BCPRODUCTO" ;
      edtBCDescripc_Internalname = "BCDESCRIPC" ;
      edtBCPrecio_Internalname = "BCPRECIO" ;
      cmbBCUndComp.setInternalname( "BCUNDCOMP" );
      edtBCProveedo_Internalname = "BCPROVEEDO" ;
      edtBCProcesad_Internalname = "BCPROCESAD" ;
      edtBCError_Internalname = "BCERROR" ;
      edtBCDescErro_Internalname = "BCDESCERRO" ;
      edtBCFechErro_Internalname = "BCFECHERRO" ;
      edtBCPilaErro_Internalname = "BCPILAERRO" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_bcfecherrorauxdate_Internalname = "vDDO_BCFECHERRORAUXDATE" ;
      divDdo_bcfecherrorauxdates_Internalname = "DDO_BCFECHERRORAUXDATES" ;
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
      edtBCPilaErro_Jsonclick = "" ;
      edtBCFechErro_Jsonclick = "" ;
      edtBCDescErro_Jsonclick = "" ;
      edtBCError_Jsonclick = "" ;
      edtBCProcesad_Jsonclick = "" ;
      edtBCProveedo_Jsonclick = "" ;
      cmbBCUndComp.setJsonclick( "" );
      edtBCPrecio_Jsonclick = "" ;
      edtBCDescripc_Jsonclick = "" ;
      edtBCDescripc_Link = "" ;
      edtBCProducto_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBCPilaErro_Visible = -1 ;
      edtBCFechErro_Visible = -1 ;
      edtBCDescErro_Visible = -1 ;
      edtBCError_Visible = -1 ;
      edtBCProcesad_Visible = -1 ;
      edtBCProveedo_Visible = -1 ;
      cmbBCUndComp.setVisible( -1 );
      edtBCPrecio_Visible = -1 ;
      edtBCDescripc_Visible = -1 ;
      edtBCProducto_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_bcfecherrorauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TBCPRODWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||1:Kilos,2:Litros||||||" ;
      Ddo_grid_Allowmultipleselection = "|||T||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||FixedValues|Dynamic|||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||T|T|||T||T" ;
      Ddo_grid_Filterisrange = "||T|||T|T|||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric||Character|Numeric|Numeric|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "3:BCProducto|4:BCDescripcion|5:BCPrecio|6:BCUndComp|7:BCProveedor|8:BCProcesado|9:BCError|10:BCDescError|11:BCFechError|12:BCPilaError" ;
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
      Form.setCaption( httpContext.getMessage( " Productos", "") );
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
         AV96GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV96GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridActions), 4, 0));
      }
      GXCCtl = "BCUNDCOMP_" + sGXsfl_45_idx ;
      cmbBCUndComp.setName( GXCCtl );
      cmbBCUndComp.setWebtags( "" );
      cmbBCUndComp.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbBCUndComp.addItem("2", httpContext.getMessage( "Litros", ""), (short)(0));
      if ( cmbBCUndComp.getItemCount() > 0 )
      {
         A13481BCUndComp = (short)(GXutil.lval( cmbBCUndComp.getValidValue(GXutil.trim( GXutil.str( A13481BCUndComp, 4, 0))))) ;
         n13481BCUndComp = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBCProducto_Visible',ctrl:'BCPRODUCTO',prop:'Visible'},{av:'edtBCDescripc_Visible',ctrl:'BCDESCRIPC',prop:'Visible'},{av:'edtBCPrecio_Visible',ctrl:'BCPRECIO',prop:'Visible'},{av:'cmbBCUndComp'},{av:'edtBCProveedo_Visible',ctrl:'BCPROVEEDO',prop:'Visible'},{av:'edtBCProcesad_Visible',ctrl:'BCPROCESAD',prop:'Visible'},{av:'edtBCError_Visible',ctrl:'BCERROR',prop:'Visible'},{av:'edtBCDescErro_Visible',ctrl:'BCDESCERRO',prop:'Visible'},{av:'edtBCFechErro_Visible',ctrl:'BCFECHERRO',prop:'Visible'},{av:'edtBCPilaErro_Visible',ctrl:'BCPILAERRO',prop:'Visible'},{av:'AV91GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV92GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e124Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e134Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e144Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e224Y2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13478BCProducto',fld:'BCPRODUCTO',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtBCDescripc_Link',ctrl:'BCDESCRIPC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e154Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBCProducto_Visible',ctrl:'BCPRODUCTO',prop:'Visible'},{av:'edtBCDescripc_Visible',ctrl:'BCDESCRIPC',prop:'Visible'},{av:'edtBCPrecio_Visible',ctrl:'BCPRECIO',prop:'Visible'},{av:'cmbBCUndComp'},{av:'edtBCProveedo_Visible',ctrl:'BCPROVEEDO',prop:'Visible'},{av:'edtBCProcesad_Visible',ctrl:'BCPROCESAD',prop:'Visible'},{av:'edtBCError_Visible',ctrl:'BCERROR',prop:'Visible'},{av:'edtBCDescErro_Visible',ctrl:'BCDESCERRO',prop:'Visible'},{av:'edtBCFechErro_Visible',ctrl:'BCFECHERRO',prop:'Visible'},{av:'edtBCPilaErro_Visible',ctrl:'BCPILAERRO',prop:'Visible'},{av:'AV91GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV92GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e114Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBCProducto_Visible',ctrl:'BCPRODUCTO',prop:'Visible'},{av:'edtBCDescripc_Visible',ctrl:'BCDESCRIPC',prop:'Visible'},{av:'edtBCPrecio_Visible',ctrl:'BCPRECIO',prop:'Visible'},{av:'cmbBCUndComp'},{av:'edtBCProveedo_Visible',ctrl:'BCPROVEEDO',prop:'Visible'},{av:'edtBCProcesad_Visible',ctrl:'BCPROCESAD',prop:'Visible'},{av:'edtBCError_Visible',ctrl:'BCERROR',prop:'Visible'},{av:'edtBCDescErro_Visible',ctrl:'BCDESCERRO',prop:'Visible'},{av:'edtBCFechErro_Visible',ctrl:'BCFECHERRO',prop:'Visible'},{av:'edtBCPilaErro_Visible',ctrl:'BCPILAERRO',prop:'Visible'},{av:'AV91GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV92GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV53ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e234Y2',iparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13478BCProducto',fld:'BCPRODUCTO',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e164Y2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13478BCProducto',fld:'BCPRODUCTO',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e174Y2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e184Y2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e194Y2',iparms:[{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV55ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV46ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV95FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFBCProducto',fld:'vTFBCPRODUCTO',pic:''},{av:'AV58TFBCProducto_Sel',fld:'vTFBCPRODUCTO_SEL',pic:''},{av:'AV60TFBCDescripcion',fld:'vTFBCDESCRIPCION',pic:''},{av:'AV61TFBCDescripcion_Sel',fld:'vTFBCDESCRIPCION_SEL',pic:''},{av:'AV63TFBCPrecio',fld:'vTFBCPRECIO',pic:'ZZZZZZ9.99999'},{av:'AV64TFBCPrecio_To',fld:'vTFBCPRECIO_TO',pic:'ZZZZZZ9.99999'},{av:'AV67TFBCUndComp_Sels',fld:'vTFBCUNDCOMP_SELS',pic:''},{av:'AV69TFBCProveedor',fld:'vTFBCPROVEEDOR',pic:''},{av:'AV70TFBCProveedor_Sel',fld:'vTFBCPROVEEDOR_SEL',pic:''},{av:'AV72TFBCProcesado',fld:'vTFBCPROCESADO',pic:'ZZZ9'},{av:'AV73TFBCProcesado_To',fld:'vTFBCPROCESADO_TO',pic:'ZZZ9'},{av:'AV75TFBCError',fld:'vTFBCERROR',pic:'ZZZ9'},{av:'AV76TFBCError_To',fld:'vTFBCERROR_TO',pic:'ZZZ9'},{av:'AV78TFBCDescError',fld:'vTFBCDESCERROR',pic:''},{av:'AV79TFBCDescError_Sel',fld:'vTFBCDESCERROR_SEL',pic:''},{av:'AV81TFBCFechError',fld:'vTFBCFECHERROR',pic:'99/99/99 99:99'},{av:'AV86TFBCPilaError',fld:'vTFBCPILAERROR',pic:''},{av:'AV87TFBCPilaError_Sel',fld:'vTFBCPILAERROR_SEL',pic:''},{av:'AV122Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV83DDO_BCFechErrorAuxDate',fld:'vDDO_BCFECHERRORAUXDATE',pic:''},{av:'AV66TFBCUndComp_SelsJson',fld:'vTFBCUNDCOMP_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALIDV_DDO_BCFECHERRORAUXDATE","{handler:'validv_Ddo_bcfecherrorauxdate',iparms:[]");
      setEventMetadata("VALIDV_DDO_BCFECHERRORAUXDATE",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BCPRODUCTO","{handler:'valid_Bcproducto',iparms:[]");
      setEventMetadata("VALID_BCPRODUCTO",",oparms:[]}");
      setEventMetadata("VALID_BCDESCRIPC","{handler:'valid_Bcdescripc',iparms:[]");
      setEventMetadata("VALID_BCDESCRIPC",",oparms:[]}");
      setEventMetadata("VALID_BCPRECIO","{handler:'valid_Bcprecio',iparms:[]");
      setEventMetadata("VALID_BCPRECIO",",oparms:[]}");
      setEventMetadata("VALID_BCUNDCOMP","{handler:'valid_Bcundcomp',iparms:[]");
      setEventMetadata("VALID_BCUNDCOMP",",oparms:[]}");
      setEventMetadata("VALID_BCPROVEEDO","{handler:'valid_Bcproveedo',iparms:[]");
      setEventMetadata("VALID_BCPROVEEDO",",oparms:[]}");
      setEventMetadata("VALID_BCPROCESAD","{handler:'valid_Bcprocesad',iparms:[]");
      setEventMetadata("VALID_BCPROCESAD",",oparms:[]}");
      setEventMetadata("VALID_BCERROR","{handler:'valid_Bcerror',iparms:[]");
      setEventMetadata("VALID_BCERROR",",oparms:[]}");
      setEventMetadata("VALID_BCDESCERRO","{handler:'valid_Bcdescerro',iparms:[]");
      setEventMetadata("VALID_BCDESCERRO",",oparms:[]}");
      setEventMetadata("VALID_BCPILAERRO","{handler:'valid_Bcpilaerro',iparms:[]");
      setEventMetadata("VALID_BCPILAERRO",",oparms:[]}");
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
      AV46ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV95FilterFullText = "" ;
      AV57TFBCProducto = "" ;
      AV58TFBCProducto_Sel = "" ;
      AV60TFBCDescripcion = "" ;
      AV61TFBCDescripcion_Sel = "" ;
      AV63TFBCPrecio = DecimalUtil.ZERO ;
      AV64TFBCPrecio_To = DecimalUtil.ZERO ;
      AV67TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV69TFBCProveedor = "" ;
      AV70TFBCProveedor_Sel = "" ;
      AV78TFBCDescError = "" ;
      AV79TFBCDescError_Sel = "" ;
      AV81TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      AV86TFBCPilaError = "" ;
      AV87TFBCPilaError_Sel = "" ;
      AV122Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV53ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV89DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66TFBCUndComp_SelsJson = "" ;
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
      AV83DDO_BCFechErrorAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      AV103Tbcprodwwds_1_filterfulltext = "" ;
      AV104Tbcprodwwds_2_tfbcproducto = "" ;
      AV105Tbcprodwwds_3_tfbcproducto_sel = "" ;
      AV106Tbcprodwwds_4_tfbcdescripcion = "" ;
      AV107Tbcprodwwds_5_tfbcdescripcion_sel = "" ;
      AV108Tbcprodwwds_6_tfbcprecio = DecimalUtil.ZERO ;
      AV109Tbcprodwwds_7_tfbcprecio_to = DecimalUtil.ZERO ;
      AV110Tbcprodwwds_8_tfbcundcomp_sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV111Tbcprodwwds_9_tfbcproveedor = "" ;
      AV112Tbcprodwwds_10_tfbcproveedor_sel = "" ;
      AV117Tbcprodwwds_15_tfbcdescerror = "" ;
      AV118Tbcprodwwds_16_tfbcdescerror_sel = "" ;
      AV119Tbcprodwwds_17_tfbcfecherror = GXutil.resetTime( GXutil.nullDate() );
      AV120Tbcprodwwds_18_tfbcpilaerror = "" ;
      AV121Tbcprodwwds_19_tfbcpilaerror_sel = "" ;
      scmdbuf = "" ;
      lV103Tbcprodwwds_1_filterfulltext = "" ;
      lV104Tbcprodwwds_2_tfbcproducto = "" ;
      lV106Tbcprodwwds_4_tfbcdescripcion = "" ;
      lV111Tbcprodwwds_9_tfbcproveedor = "" ;
      lV117Tbcprodwwds_15_tfbcdescerror = "" ;
      lV120Tbcprodwwds_18_tfbcpilaerror = "" ;
      H004Y2_A13487BCPilaErro = new String[] {""} ;
      H004Y2_n13487BCPilaErro = new boolean[] {false} ;
      H004Y2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      H004Y2_n13486BCFechErro = new boolean[] {false} ;
      H004Y2_A13485BCDescErro = new String[] {""} ;
      H004Y2_n13485BCDescErro = new boolean[] {false} ;
      H004Y2_A13484BCError = new short[1] ;
      H004Y2_n13484BCError = new boolean[] {false} ;
      H004Y2_A13483BCProcesad = new short[1] ;
      H004Y2_n13483BCProcesad = new boolean[] {false} ;
      H004Y2_A13482BCProveedo = new String[] {""} ;
      H004Y2_n13482BCProveedo = new boolean[] {false} ;
      H004Y2_A13481BCUndComp = new short[1] ;
      H004Y2_n13481BCUndComp = new boolean[] {false} ;
      H004Y2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004Y2_n13480BCPrecio = new boolean[] {false} ;
      H004Y2_A13479BCDescripc = new String[] {""} ;
      H004Y2_n13479BCDescripc = new boolean[] {false} ;
      H004Y2_A13478BCProducto = new String[] {""} ;
      H004Y2_A396EmprCod = new String[] {""} ;
      H004Y3_A407EmprNom = new String[] {""} ;
      H004Y3_n407EmprNom = new boolean[] {false} ;
      H004Y4_A13487BCPilaErro = new String[] {""} ;
      H004Y4_n13487BCPilaErro = new boolean[] {false} ;
      H004Y4_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      H004Y4_n13486BCFechErro = new boolean[] {false} ;
      H004Y4_A13485BCDescErro = new String[] {""} ;
      H004Y4_n13485BCDescErro = new boolean[] {false} ;
      H004Y4_A13484BCError = new short[1] ;
      H004Y4_n13484BCError = new boolean[] {false} ;
      H004Y4_A13483BCProcesad = new short[1] ;
      H004Y4_n13483BCProcesad = new boolean[] {false} ;
      H004Y4_A13482BCProveedo = new String[] {""} ;
      H004Y4_n13482BCProveedo = new boolean[] {false} ;
      H004Y4_A13481BCUndComp = new short[1] ;
      H004Y4_n13481BCUndComp = new boolean[] {false} ;
      H004Y4_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H004Y4_n13480BCPrecio = new boolean[] {false} ;
      H004Y4_A13479BCDescripc = new String[] {""} ;
      H004Y4_n13479BCDescripc = new boolean[] {false} ;
      H004Y4_A13478BCProducto = new String[] {""} ;
      H004Y4_A396EmprCod = new String[] {""} ;
      H004Y5_A407EmprNom = new String[] {""} ;
      H004Y5_n407EmprNom = new boolean[] {false} ;
      AV99Station = "" ;
      AV100Emprcod = "" ;
      AV101Emprnom = "" ;
      AV102Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV52Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV54ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV41UserCustomValue = "" ;
      AV47ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbcprodww__default(),
         new Object[] {
             new Object[] {
            H004Y3_A407EmprNom, H004Y3_n407EmprNom
            }
            , new Object[] {
            H004Y5_A407EmprNom, H004Y5_n407EmprNom
            }
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprodww__ekamat(),
         new Object[] {
             new Object[] {
            H004Y2_A13487BCPilaErro, H004Y2_n13487BCPilaErro, H004Y2_A13486BCFechErro, H004Y2_n13486BCFechErro, H004Y2_A13485BCDescErro, H004Y2_n13485BCDescErro, H004Y2_A13484BCError, H004Y2_n13484BCError, H004Y2_A13483BCProcesad, H004Y2_n13483BCProcesad,
            H004Y2_A13482BCProveedo, H004Y2_n13482BCProveedo, H004Y2_A13481BCUndComp, H004Y2_n13481BCUndComp, H004Y2_A13480BCPrecio, H004Y2_n13480BCPrecio, H004Y2_A13479BCDescripc, H004Y2_n13479BCDescripc, H004Y2_A13478BCProducto, H004Y2_A396EmprCod
            }
            , new Object[] {
            H004Y4_A13487BCPilaErro, H004Y4_n13487BCPilaErro, H004Y4_A13486BCFechErro, H004Y4_n13486BCFechErro, H004Y4_A13485BCDescErro, H004Y4_n13485BCDescErro, H004Y4_A13484BCError, H004Y4_n13484BCError, H004Y4_A13483BCProcesad, H004Y4_n13483BCProcesad,
            H004Y4_A13482BCProveedo, H004Y4_n13482BCProveedo, H004Y4_A13481BCUndComp, H004Y4_n13481BCUndComp, H004Y4_A13480BCPrecio, H004Y4_n13480BCPrecio, H004Y4_A13479BCDescripc, H004Y4_n13479BCDescripc, H004Y4_A13478BCProducto, H004Y4_A396EmprCod
            }
         }
      );
      AV122Pgmname = "TBCPRODWW" ;
      /* GeneXus formulas. */
      AV122Pgmname = "TBCPRODWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV55ManageFiltersExecutionStep ;
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
   private short AV72TFBCProcesado ;
   private short AV73TFBCProcesado_To ;
   private short AV75TFBCError ;
   private short AV76TFBCError_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV96GridActions ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV113Tbcprodwwds_11_tfbcprocesado ;
   private short AV114Tbcprodwwds_12_tfbcprocesado_to ;
   private short AV115Tbcprodwwds_13_tfbcerror ;
   private short AV116Tbcprodwwds_14_tfbcerror_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int AV110Tbcprodwwds_8_tfbcundcomp_sels_size ;
   private int edtBCProducto_Visible ;
   private int edtBCDescripc_Visible ;
   private int edtBCPrecio_Visible ;
   private int edtBCProveedo_Visible ;
   private int edtBCProcesad_Visible ;
   private int edtBCError_Visible ;
   private int edtBCDescErro_Visible ;
   private int edtBCFechErro_Visible ;
   private int edtBCPilaErro_Visible ;
   private int AV90PageToGo ;
   private int AV123GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV91GridCurrentPage ;
   private long AV92GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV63TFBCPrecio ;
   private java.math.BigDecimal AV64TFBCPrecio_To ;
   private java.math.BigDecimal A13480BCPrecio ;
   private java.math.BigDecimal AV108Tbcprodwwds_6_tfbcprecio ;
   private java.math.BigDecimal AV109Tbcprodwwds_7_tfbcprecio_to ;
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
   private String AV57TFBCProducto ;
   private String AV58TFBCProducto_Sel ;
   private String AV60TFBCDescripcion ;
   private String AV61TFBCDescripcion_Sel ;
   private String AV69TFBCProveedor ;
   private String AV70TFBCProveedor_Sel ;
   private String AV122Pgmname ;
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
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_bcfecherrorauxdates_Internalname ;
   private String edtavDdo_bcfecherrorauxdate_Internalname ;
   private String edtavDdo_bcfecherrorauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String A13478BCProducto ;
   private String edtBCProducto_Internalname ;
   private String A13479BCDescripc ;
   private String edtBCDescripc_Internalname ;
   private String edtBCPrecio_Internalname ;
   private String A13482BCProveedo ;
   private String edtBCProveedo_Internalname ;
   private String edtBCProcesad_Internalname ;
   private String edtBCError_Internalname ;
   private String edtBCDescErro_Internalname ;
   private String edtBCFechErro_Internalname ;
   private String edtBCPilaErro_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV104Tbcprodwwds_2_tfbcproducto ;
   private String AV105Tbcprodwwds_3_tfbcproducto_sel ;
   private String AV106Tbcprodwwds_4_tfbcdescripcion ;
   private String AV107Tbcprodwwds_5_tfbcdescripcion_sel ;
   private String AV111Tbcprodwwds_9_tfbcproveedor ;
   private String AV112Tbcprodwwds_10_tfbcproveedor_sel ;
   private String scmdbuf ;
   private String lV104Tbcprodwwds_2_tfbcproducto ;
   private String lV106Tbcprodwwds_4_tfbcdescripcion ;
   private String lV111Tbcprodwwds_9_tfbcproveedor ;
   private String AV99Station ;
   private String AV100Emprcod ;
   private String AV101Emprnom ;
   private String AV102Usurcod ;
   private String edtBCDescripc_Link ;
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
   private String edtBCProducto_Jsonclick ;
   private String edtBCDescripc_Jsonclick ;
   private String edtBCPrecio_Jsonclick ;
   private String edtBCProveedo_Jsonclick ;
   private String edtBCProcesad_Jsonclick ;
   private String edtBCError_Jsonclick ;
   private String edtBCDescErro_Jsonclick ;
   private String edtBCFechErro_Jsonclick ;
   private String edtBCPilaErro_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV81TFBCFechError ;
   private java.util.Date A13486BCFechErro ;
   private java.util.Date AV119Tbcprodwwds_17_tfbcfecherror ;
   private java.util.Date AV83DDO_BCFechErrorAuxDate ;
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
   private boolean n13479BCDescripc ;
   private boolean n13480BCPrecio ;
   private boolean n13481BCUndComp ;
   private boolean n13482BCProveedo ;
   private boolean n13483BCProcesad ;
   private boolean n13484BCError ;
   private boolean n13485BCDescErro ;
   private boolean n13486BCFechErro ;
   private boolean n13487BCPilaErro ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV66TFBCUndComp_SelsJson ;
   private String AV34ColumnsSelectorXML ;
   private String AV54ManageFiltersXml ;
   private String AV41UserCustomValue ;
   private String AV95FilterFullText ;
   private String AV78TFBCDescError ;
   private String AV79TFBCDescError_Sel ;
   private String AV86TFBCPilaError ;
   private String AV87TFBCPilaError_Sel ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String AV103Tbcprodwwds_1_filterfulltext ;
   private String AV117Tbcprodwwds_15_tfbcdescerror ;
   private String AV118Tbcprodwwds_16_tfbcdescerror_sel ;
   private String AV120Tbcprodwwds_18_tfbcpilaerror ;
   private String AV121Tbcprodwwds_19_tfbcpilaerror_sel ;
   private String lV103Tbcprodwwds_1_filterfulltext ;
   private String lV117Tbcprodwwds_15_tfbcdescerror ;
   private String lV120Tbcprodwwds_18_tfbcpilaerror ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private GXSimpleCollection<Short> AV67TFBCUndComp_Sels ;
   private GXSimpleCollection<Short> AV110Tbcprodwwds_8_tfbcundcomp_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV52Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbBCUndComp ;
   private IDataStoreProvider pr_ekamat ;
   private String[] H004Y2_A13487BCPilaErro ;
   private boolean[] H004Y2_n13487BCPilaErro ;
   private java.util.Date[] H004Y2_A13486BCFechErro ;
   private boolean[] H004Y2_n13486BCFechErro ;
   private String[] H004Y2_A13485BCDescErro ;
   private boolean[] H004Y2_n13485BCDescErro ;
   private short[] H004Y2_A13484BCError ;
   private boolean[] H004Y2_n13484BCError ;
   private short[] H004Y2_A13483BCProcesad ;
   private boolean[] H004Y2_n13483BCProcesad ;
   private String[] H004Y2_A13482BCProveedo ;
   private boolean[] H004Y2_n13482BCProveedo ;
   private short[] H004Y2_A13481BCUndComp ;
   private boolean[] H004Y2_n13481BCUndComp ;
   private java.math.BigDecimal[] H004Y2_A13480BCPrecio ;
   private boolean[] H004Y2_n13480BCPrecio ;
   private String[] H004Y2_A13479BCDescripc ;
   private boolean[] H004Y2_n13479BCDescripc ;
   private String[] H004Y2_A13478BCProducto ;
   private String[] H004Y2_A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] H004Y3_A407EmprNom ;
   private boolean[] H004Y3_n407EmprNom ;
   private String[] H004Y4_A13487BCPilaErro ;
   private boolean[] H004Y4_n13487BCPilaErro ;
   private java.util.Date[] H004Y4_A13486BCFechErro ;
   private boolean[] H004Y4_n13486BCFechErro ;
   private String[] H004Y4_A13485BCDescErro ;
   private boolean[] H004Y4_n13485BCDescErro ;
   private short[] H004Y4_A13484BCError ;
   private boolean[] H004Y4_n13484BCError ;
   private short[] H004Y4_A13483BCProcesad ;
   private boolean[] H004Y4_n13483BCProcesad ;
   private String[] H004Y4_A13482BCProveedo ;
   private boolean[] H004Y4_n13482BCProveedo ;
   private short[] H004Y4_A13481BCUndComp ;
   private boolean[] H004Y4_n13481BCUndComp ;
   private java.math.BigDecimal[] H004Y4_A13480BCPrecio ;
   private boolean[] H004Y4_n13480BCPrecio ;
   private String[] H004Y4_A13479BCDescripc ;
   private boolean[] H004Y4_n13479BCDescripc ;
   private String[] H004Y4_A13478BCProducto ;
   private String[] H004Y4_A396EmprCod ;
   private String[] H004Y5_A407EmprNom ;
   private boolean[] H004Y5_n407EmprNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV53ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV46ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV47ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV89DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tbcprodww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004Y3", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H004Y5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

final  class tbcprodww__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H004Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV110Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV105Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV104Tbcprodwwds_2_tfbcproducto ,
                                          String AV107Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV106Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV108Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV109Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV110Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV112Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV111Tbcprodwwds_9_tfbcproveedor ,
                                          short AV113Tbcprodwwds_11_tfbcprocesado ,
                                          short AV114Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV115Tbcprodwwds_13_tfbcerror ,
                                          short AV116Tbcprodwwds_14_tfbcerror_to ,
                                          String AV118Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV117Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV119Tbcprodwwds_17_tfbcfecherror ,
                                          String AV121Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV120Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV103Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[17];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Unidad Compra], [Precio], [Descripción], [Producto], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV105Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV104Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( AV110Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV110Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV111Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV113Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV114Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV115Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV116Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV117Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV119Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV120Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción]" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción] DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Producto]" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Producto] DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Precio]" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Precio] DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Unidad Compra]" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Unidad Compra] DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Proveedor]" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Proveedor] DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Procesado]" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Procesado] DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Error]" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción error]" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Fecha y hora error]" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Fecha y hora error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Pila error]" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Pila error] DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H004Y4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV110Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV105Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV104Tbcprodwwds_2_tfbcproducto ,
                                          String AV107Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV106Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV108Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV109Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV110Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV112Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV111Tbcprodwwds_9_tfbcproveedor ,
                                          short AV113Tbcprodwwds_11_tfbcprocesado ,
                                          short AV114Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV115Tbcprodwwds_13_tfbcerror ,
                                          short AV116Tbcprodwwds_14_tfbcerror_to ,
                                          String AV118Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV117Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV119Tbcprodwwds_17_tfbcfecherror ,
                                          String AV121Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV120Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV103Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[17];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Unidad Compra], [Precio], [Descripción], [Producto], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV105Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV104Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int22[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV106Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( AV110Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV110Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV111Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV113Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV114Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (0==AV115Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (0==AV116Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV117Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV119Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV120Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción]" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción] DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Producto]" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Producto] DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Precio]" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Precio] DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Unidad Compra]" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Unidad Compra] DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Proveedor]" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Proveedor] DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Procesado]" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Procesado] DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Error]" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción error]" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Fecha y hora error]" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Fecha y hora error] DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY [Pila error]" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Pila error] DESC" ;
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
                  return conditional_H004Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
            case 1 :
                  return conditional_H004Y4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H004Y4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 6);
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 6);
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

