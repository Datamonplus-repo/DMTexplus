package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotrecww_impl extends GXDataArea
{
   public tnotrecww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnotrecww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotrecww_impl.class ));
   }

   public tnotrecww_impl( int remoteHandle ,
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
      AV119FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV43TFNr_codigo = (int)(GXutil.lval( httpContext.GetPar( "TFNr_codigo"))) ;
      AV44TFNr_codigo_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_codigo_To"))) ;
      AV46TFNr_albreccod = (int)(GXutil.lval( httpContext.GetPar( "TFNr_albreccod"))) ;
      AV47TFNr_albreccod_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_albreccod_To"))) ;
      AV49TFNr_CliCod = (int)(GXutil.lval( httpContext.GetPar( "TFNr_CliCod"))) ;
      AV50TFNr_CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_CliCod_To"))) ;
      AV52TFNr_CliNom = httpContext.GetPar( "TFNr_CliNom") ;
      AV53TFNr_CliNom_Sel = httpContext.GetPar( "TFNr_CliNom_Sel") ;
      AV55TFNr_albent = httpContext.GetPar( "TFNr_albent") ;
      AV56TFNr_albent_Sel = httpContext.GetPar( "TFNr_albent_Sel") ;
      AV58TFNr_refcli = httpContext.GetPar( "TFNr_refcli") ;
      AV59TFNr_refcli_Sel = httpContext.GetPar( "TFNr_refcli_Sel") ;
      AV61TFNr_artcod = httpContext.GetPar( "TFNr_artcod") ;
      AV62TFNr_artcod_Sel = httpContext.GetPar( "TFNr_artcod_Sel") ;
      AV64TFNr_artdsc = httpContext.GetPar( "TFNr_artdsc") ;
      AV65TFNr_artdsc_Sel = httpContext.GetPar( "TFNr_artdsc_Sel") ;
      AV67TFNr_colnom = httpContext.GetPar( "TFNr_colnom") ;
      AV68TFNr_colnom_Sel = httpContext.GetPar( "TFNr_colnom_Sel") ;
      AV70TFNr_colnum = (int)(GXutil.lval( httpContext.GetPar( "TFNr_colnum"))) ;
      AV71TFNr_colnum_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_colnum_To"))) ;
      AV73TFNr_piezas = (int)(GXutil.lval( httpContext.GetPar( "TFNr_piezas"))) ;
      AV74TFNr_piezas_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_piezas_To"))) ;
      AV76TFNr_unidades = CommonUtil.decimalVal( httpContext.GetPar( "TFNr_unidades"), ".") ;
      AV77TFNr_unidades_To = CommonUtil.decimalVal( httpContext.GetPar( "TFNr_unidades_To"), ".") ;
      AV79TFNr_unidad = httpContext.GetPar( "TFNr_unidad") ;
      AV80TFNr_unidad_Sel = httpContext.GetPar( "TFNr_unidad_Sel") ;
      AV82TFNr_barcoda = (int)(GXutil.lval( httpContext.GetPar( "TFNr_barcoda"))) ;
      AV83TFNr_barcoda_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_barcoda_To"))) ;
      AV85TFNr_barreoa = (byte)(GXutil.lval( httpContext.GetPar( "TFNr_barreoa"))) ;
      AV86TFNr_barreoa_To = (byte)(GXutil.lval( httpContext.GetPar( "TFNr_barreoa_To"))) ;
      AV88TFNr_barpara = httpContext.GetPar( "TFNr_barpara") ;
      AV89TFNr_barpara_Sel = httpContext.GetPar( "TFNr_barpara_Sel") ;
      AV91TFNr_NAlb = GXutil.lval( httpContext.GetPar( "TFNr_NAlb")) ;
      AV92TFNr_NAlb_To = GXutil.lval( httpContext.GetPar( "TFNr_NAlb_To")) ;
      AV94TFNr_local = httpContext.GetPar( "TFNr_local") ;
      AV95TFNr_local_Sel = httpContext.GetPar( "TFNr_local_Sel") ;
      AV97TFNr_user = httpContext.GetPar( "TFNr_user") ;
      AV98TFNr_user_Sel = httpContext.GetPar( "TFNr_user_Sel") ;
      AV100TFNr_fecreg = localUtil.parseDTimeParm( httpContext.GetPar( "TFNr_fecreg")) ;
      AV105TFNr_fecent = localUtil.parseDateParm( httpContext.GetPar( "TFNr_fecent")) ;
      AV110TFNr_barcod = (int)(GXutil.lval( httpContext.GetPar( "TFNr_barcod"))) ;
      AV111TFNr_barcod_To = (int)(GXutil.lval( httpContext.GetPar( "TFNr_barcod_To"))) ;
      AV170Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paA72( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startA72( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnotrecww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV119FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV115GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV116GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV113DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV113DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CODIGO", GXutil.ltrim( localUtil.ntoc( AV43TFNr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CODIGO_TO", GXutil.ltrim( localUtil.ntoc( AV44TFNr_codigo_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV46TFNr_albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFNr_albreccod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CLICOD", GXutil.ltrim( localUtil.ntoc( AV49TFNr_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFNr_CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CLINOM", GXutil.rtrim( AV52TFNr_CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_CLINOM_SEL", GXutil.rtrim( AV53TFNr_CliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ALBENT", GXutil.rtrim( AV55TFNr_albent));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ALBENT_SEL", GXutil.rtrim( AV56TFNr_albent_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_REFCLI", GXutil.rtrim( AV58TFNr_refcli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_REFCLI_SEL", GXutil.rtrim( AV59TFNr_refcli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ARTCOD", GXutil.rtrim( AV61TFNr_artcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ARTCOD_SEL", GXutil.rtrim( AV62TFNr_artcod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ARTDSC", GXutil.rtrim( AV64TFNr_artdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_ARTDSC_SEL", GXutil.rtrim( AV65TFNr_artdsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_COLNOM", GXutil.rtrim( AV67TFNr_colnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_COLNOM_SEL", GXutil.rtrim( AV68TFNr_colnom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_COLNUM", GXutil.ltrim( localUtil.ntoc( AV70TFNr_colnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV71TFNr_colnum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_PIEZAS", GXutil.ltrim( localUtil.ntoc( AV73TFNr_piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_PIEZAS_TO", GXutil.ltrim( localUtil.ntoc( AV74TFNr_piezas_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_UNIDADES", GXutil.ltrim( localUtil.ntoc( AV76TFNr_unidades, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_UNIDADES_TO", GXutil.ltrim( localUtil.ntoc( AV77TFNr_unidades_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_UNIDAD", GXutil.rtrim( AV79TFNr_unidad));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_UNIDAD_SEL", GXutil.rtrim( AV80TFNr_unidad_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARCODA", GXutil.ltrim( localUtil.ntoc( AV82TFNr_barcoda, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARCODA_TO", GXutil.ltrim( localUtil.ntoc( AV83TFNr_barcoda_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARREOA", GXutil.ltrim( localUtil.ntoc( AV85TFNr_barreoa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARREOA_TO", GXutil.ltrim( localUtil.ntoc( AV86TFNr_barreoa_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARPARA", GXutil.rtrim( AV88TFNr_barpara));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARPARA_SEL", GXutil.rtrim( AV89TFNr_barpara_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_NALB", GXutil.ltrim( localUtil.ntoc( AV91TFNr_NAlb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_NALB_TO", GXutil.ltrim( localUtil.ntoc( AV92TFNr_NAlb_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_LOCAL", GXutil.rtrim( AV94TFNr_local));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_LOCAL_SEL", GXutil.rtrim( AV95TFNr_local_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_USER", GXutil.rtrim( AV97TFNr_user));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_USER_SEL", GXutil.rtrim( AV98TFNr_user_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_FECREG", localUtil.ttoc( AV100TFNr_fecreg, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_FECENT", localUtil.dtoc( AV105TFNr_fecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARCOD", GXutil.ltrim( localUtil.ntoc( AV110TFNr_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFNR_BARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV111TFNr_barcod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
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
         weA72( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtA72( ) ;
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
      return formatLink("app.tnotrecww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TNOTRECWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " NOTAS DE RECLAMACIONES", "") ;
   }

   public void wbA70( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_A72( true) ;
      }
      else
      {
         wb_table1_27_A72( false) ;
      }
      return  ;
   }

   public void wb_table1_27_A72e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV115GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV116GridPageCount);
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_nr_fecregauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_nr_fecregauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_nr_fecregauxdate_Internalname, localUtil.format(AV102DDO_Nr_fecregAuxDate, "99/99/99"), localUtil.format( AV102DDO_Nr_fecregAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_nr_fecregauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_nr_fecregauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTRECWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_nr_fecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_nr_fecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_nr_fecentauxdate_Internalname, localUtil.format(AV107DDO_Nr_fecentAuxDate, "99/99/99"), localUtil.format( AV107DDO_Nr_fecentAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_nr_fecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_nr_fecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTRECWW.htm");
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

   public void startA72( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " NOTAS DE RECLAMACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupA70( ) ;
   }

   public void wsA72( )
   {
      startA72( ) ;
      evtA72( ) ;
   }

   public void evtA72( )
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
                           e11A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18A72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19A72 ();
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
                           AV120GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5206Nr_albrecc = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_albrecc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5206Nr_albrecc = false ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A5340Nr_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_CliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5340Nr_CliCod = false ;
                           A5341Nr_CliNom = httpContext.cgiGet( edtNr_CliNom_Internalname) ;
                           n5341Nr_CliNom = false ;
                           A5199Nr_albent = httpContext.cgiGet( edtNr_albent_Internalname) ;
                           n5199Nr_albent = false ;
                           A5200Nr_refcli = httpContext.cgiGet( edtNr_refcli_Internalname) ;
                           n5200Nr_refcli = false ;
                           A5201Nr_artcod = httpContext.cgiGet( edtNr_artcod_Internalname) ;
                           n5201Nr_artcod = false ;
                           A5202Nr_artdsc = httpContext.cgiGet( edtNr_artdsc_Internalname) ;
                           n5202Nr_artdsc = false ;
                           A5203Nr_colnom = httpContext.cgiGet( edtNr_colnom_Internalname) ;
                           n5203Nr_colnom = false ;
                           A5204Nr_colnum = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_colnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5204Nr_colnum = false ;
                           A5205Nr_partida = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_partida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5205Nr_partida = false ;
                           A5207Nr_piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5207Nr_piezas = false ;
                           A5208Nr_unidade = localUtil.ctond( httpContext.cgiGet( edtNr_unidade_Internalname)) ;
                           n5208Nr_unidade = false ;
                           A5209Nr_unidad = httpContext.cgiGet( edtNr_unidad_Internalname) ;
                           n5209Nr_unidad = false ;
                           A5222Nr_barcoda = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcoda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5222Nr_barcoda = false ;
                           A5223Nr_barreoa = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreoa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5223Nr_barreoa = false ;
                           A5224Nr_barpara = httpContext.cgiGet( edtNr_barpara_Internalname) ;
                           n5224Nr_barpara = false ;
                           A12235Nr_NAlb = localUtil.ctol( httpContext.cgiGet( edtNr_NAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n12235Nr_NAlb = false ;
                           A5214Nr_local = httpContext.cgiGet( edtNr_local_Internalname) ;
                           n5214Nr_local = false ;
                           A5215Nr_user = GXutil.upper( httpContext.cgiGet( edtNr_user_Internalname)) ;
                           n5215Nr_user = false ;
                           A5216Nr_fecreg = localUtil.ctot( httpContext.cgiGet( edtNr_fecreg_Internalname), 0) ;
                           n5216Nr_fecreg = false ;
                           A5217Nr_fecent = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtNr_fecent_Internalname), 0)) ;
                           n5217Nr_fecent = false ;
                           A5210Nr_barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n5210Nr_barcod = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20A72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21A72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22A72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV119FilterFullText) != 0 )
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

   public void weA72( )
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

   public void paA72( )
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
                                 String AV119FilterFullText ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 int AV43TFNr_codigo ,
                                 int AV44TFNr_codigo_To ,
                                 int AV46TFNr_albreccod ,
                                 int AV47TFNr_albreccod_To ,
                                 int AV49TFNr_CliCod ,
                                 int AV50TFNr_CliCod_To ,
                                 String AV52TFNr_CliNom ,
                                 String AV53TFNr_CliNom_Sel ,
                                 String AV55TFNr_albent ,
                                 String AV56TFNr_albent_Sel ,
                                 String AV58TFNr_refcli ,
                                 String AV59TFNr_refcli_Sel ,
                                 String AV61TFNr_artcod ,
                                 String AV62TFNr_artcod_Sel ,
                                 String AV64TFNr_artdsc ,
                                 String AV65TFNr_artdsc_Sel ,
                                 String AV67TFNr_colnom ,
                                 String AV68TFNr_colnom_Sel ,
                                 int AV70TFNr_colnum ,
                                 int AV71TFNr_colnum_To ,
                                 int AV73TFNr_piezas ,
                                 int AV74TFNr_piezas_To ,
                                 java.math.BigDecimal AV76TFNr_unidades ,
                                 java.math.BigDecimal AV77TFNr_unidades_To ,
                                 String AV79TFNr_unidad ,
                                 String AV80TFNr_unidad_Sel ,
                                 int AV82TFNr_barcoda ,
                                 int AV83TFNr_barcoda_To ,
                                 byte AV85TFNr_barreoa ,
                                 byte AV86TFNr_barreoa_To ,
                                 String AV88TFNr_barpara ,
                                 String AV89TFNr_barpara_Sel ,
                                 long AV91TFNr_NAlb ,
                                 long AV92TFNr_NAlb_To ,
                                 String AV94TFNr_local ,
                                 String AV95TFNr_local_Sel ,
                                 String AV97TFNr_user ,
                                 String AV98TFNr_user_Sel ,
                                 java.util.Date AV100TFNr_fecreg ,
                                 java.util.Date AV105TFNr_fecent ,
                                 int AV110TFNr_barcod ,
                                 int AV111TFNr_barcod_To ,
                                 String AV170Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21A72 ();
      GRID_nCurrentRecord = 0 ;
      rfA72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_NR_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "NR_CODIGO", GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), ".", "")));
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
      rfA72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV170Pgmname = "TNOTRECWW" ;
      Gx_err = (short)(0) ;
   }

   public void rfA72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21A72 ();
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
                                              AV127Tnotrecwwds_1_filterfulltext ,
                                              Integer.valueOf(AV128Tnotrecwwds_2_tfnr_codigo) ,
                                              Integer.valueOf(AV129Tnotrecwwds_3_tfnr_codigo_to) ,
                                              Integer.valueOf(AV130Tnotrecwwds_4_tfnr_albreccod) ,
                                              Integer.valueOf(AV131Tnotrecwwds_5_tfnr_albreccod_to) ,
                                              Integer.valueOf(AV132Tnotrecwwds_6_tfnr_clicod) ,
                                              Integer.valueOf(AV133Tnotrecwwds_7_tfnr_clicod_to) ,
                                              AV135Tnotrecwwds_9_tfnr_clinom_sel ,
                                              AV134Tnotrecwwds_8_tfnr_clinom ,
                                              AV137Tnotrecwwds_11_tfnr_albent_sel ,
                                              AV136Tnotrecwwds_10_tfnr_albent ,
                                              AV139Tnotrecwwds_13_tfnr_refcli_sel ,
                                              AV138Tnotrecwwds_12_tfnr_refcli ,
                                              AV141Tnotrecwwds_15_tfnr_artcod_sel ,
                                              AV140Tnotrecwwds_14_tfnr_artcod ,
                                              AV143Tnotrecwwds_17_tfnr_artdsc_sel ,
                                              AV142Tnotrecwwds_16_tfnr_artdsc ,
                                              AV145Tnotrecwwds_19_tfnr_colnom_sel ,
                                              AV144Tnotrecwwds_18_tfnr_colnom ,
                                              Integer.valueOf(AV146Tnotrecwwds_20_tfnr_colnum) ,
                                              Integer.valueOf(AV147Tnotrecwwds_21_tfnr_colnum_to) ,
                                              Integer.valueOf(AV148Tnotrecwwds_22_tfnr_piezas) ,
                                              Integer.valueOf(AV149Tnotrecwwds_23_tfnr_piezas_to) ,
                                              AV150Tnotrecwwds_24_tfnr_unidades ,
                                              AV151Tnotrecwwds_25_tfnr_unidades_to ,
                                              AV153Tnotrecwwds_27_tfnr_unidad_sel ,
                                              AV152Tnotrecwwds_26_tfnr_unidad ,
                                              Integer.valueOf(AV154Tnotrecwwds_28_tfnr_barcoda) ,
                                              Integer.valueOf(AV155Tnotrecwwds_29_tfnr_barcoda_to) ,
                                              Byte.valueOf(AV156Tnotrecwwds_30_tfnr_barreoa) ,
                                              Byte.valueOf(AV157Tnotrecwwds_31_tfnr_barreoa_to) ,
                                              AV159Tnotrecwwds_33_tfnr_barpara_sel ,
                                              AV158Tnotrecwwds_32_tfnr_barpara ,
                                              Long.valueOf(AV160Tnotrecwwds_34_tfnr_nalb) ,
                                              Long.valueOf(AV161Tnotrecwwds_35_tfnr_nalb_to) ,
                                              AV163Tnotrecwwds_37_tfnr_local_sel ,
                                              AV162Tnotrecwwds_36_tfnr_local ,
                                              AV165Tnotrecwwds_39_tfnr_user_sel ,
                                              AV164Tnotrecwwds_38_tfnr_user ,
                                              AV166Tnotrecwwds_40_tfnr_fecreg ,
                                              AV167Tnotrecwwds_41_tfnr_fecent ,
                                              Integer.valueOf(AV168Tnotrecwwds_42_tfnr_barcod) ,
                                              Integer.valueOf(AV169Tnotrecwwds_43_tfnr_barcod_to) ,
                                              Integer.valueOf(A5198Nr_codigo) ,
                                              Integer.valueOf(A5206Nr_albrecc) ,
                                              Integer.valueOf(A5340Nr_CliCod) ,
                                              A5341Nr_CliNom ,
                                              A5199Nr_albent ,
                                              A5200Nr_refcli ,
                                              A5201Nr_artcod ,
                                              A5202Nr_artdsc ,
                                              A5203Nr_colnom ,
                                              Integer.valueOf(A5204Nr_colnum) ,
                                              Integer.valueOf(A5207Nr_piezas) ,
                                              A5208Nr_unidade ,
                                              A5209Nr_unidad ,
                                              Integer.valueOf(A5222Nr_barcoda) ,
                                              Byte.valueOf(A5223Nr_barreoa) ,
                                              A5224Nr_barpara ,
                                              Long.valueOf(A12235Nr_NAlb) ,
                                              A5214Nr_local ,
                                              A5215Nr_user ,
                                              Integer.valueOf(A5210Nr_barcod) ,
                                              A5216Nr_fecreg ,
                                              A5217Nr_fecent ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
         lV134Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV134Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
         lV136Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV136Tnotrecwwds_10_tfnr_albent), 8, "%") ;
         lV138Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV138Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
         lV140Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV140Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
         lV142Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV142Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
         lV144Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV144Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
         lV152Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV152Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
         lV158Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV158Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
         lV162Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV162Tnotrecwwds_36_tfnr_local), 10, "%") ;
         lV164Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV164Tnotrecwwds_38_tfnr_user), 8, "%") ;
         /* Using cursor H00A72 */
         pr_default.execute(0, new Object[] {lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV128Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV129Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV130Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV131Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV132Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV133Tnotrecwwds_7_tfnr_clicod_to), lV134Tnotrecwwds_8_tfnr_clinom, AV135Tnotrecwwds_9_tfnr_clinom_sel, lV136Tnotrecwwds_10_tfnr_albent, AV137Tnotrecwwds_11_tfnr_albent_sel, lV138Tnotrecwwds_12_tfnr_refcli, AV139Tnotrecwwds_13_tfnr_refcli_sel, lV140Tnotrecwwds_14_tfnr_artcod, AV141Tnotrecwwds_15_tfnr_artcod_sel, lV142Tnotrecwwds_16_tfnr_artdsc, AV143Tnotrecwwds_17_tfnr_artdsc_sel, lV144Tnotrecwwds_18_tfnr_colnom, AV145Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV146Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV147Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV148Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV149Tnotrecwwds_23_tfnr_piezas_to), AV150Tnotrecwwds_24_tfnr_unidades, AV151Tnotrecwwds_25_tfnr_unidades_to, lV152Tnotrecwwds_26_tfnr_unidad, AV153Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV154Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV155Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV156Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV157Tnotrecwwds_31_tfnr_barreoa_to), lV158Tnotrecwwds_32_tfnr_barpara, AV159Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV160Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV161Tnotrecwwds_35_tfnr_nalb_to), lV162Tnotrecwwds_36_tfnr_local, AV163Tnotrecwwds_37_tfnr_local_sel, lV164Tnotrecwwds_38_tfnr_user, AV165Tnotrecwwds_39_tfnr_user_sel, AV166Tnotrecwwds_40_tfnr_fecreg, AV167Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV168Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV169Tnotrecwwds_43_tfnr_barcod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5210Nr_barcod = H00A72_A5210Nr_barcod[0] ;
            n5210Nr_barcod = H00A72_n5210Nr_barcod[0] ;
            A5217Nr_fecent = H00A72_A5217Nr_fecent[0] ;
            n5217Nr_fecent = H00A72_n5217Nr_fecent[0] ;
            A5216Nr_fecreg = H00A72_A5216Nr_fecreg[0] ;
            n5216Nr_fecreg = H00A72_n5216Nr_fecreg[0] ;
            A5215Nr_user = H00A72_A5215Nr_user[0] ;
            n5215Nr_user = H00A72_n5215Nr_user[0] ;
            A5214Nr_local = H00A72_A5214Nr_local[0] ;
            n5214Nr_local = H00A72_n5214Nr_local[0] ;
            A12235Nr_NAlb = H00A72_A12235Nr_NAlb[0] ;
            n12235Nr_NAlb = H00A72_n12235Nr_NAlb[0] ;
            A5224Nr_barpara = H00A72_A5224Nr_barpara[0] ;
            n5224Nr_barpara = H00A72_n5224Nr_barpara[0] ;
            A5223Nr_barreoa = H00A72_A5223Nr_barreoa[0] ;
            n5223Nr_barreoa = H00A72_n5223Nr_barreoa[0] ;
            A5222Nr_barcoda = H00A72_A5222Nr_barcoda[0] ;
            n5222Nr_barcoda = H00A72_n5222Nr_barcoda[0] ;
            A5209Nr_unidad = H00A72_A5209Nr_unidad[0] ;
            n5209Nr_unidad = H00A72_n5209Nr_unidad[0] ;
            A5208Nr_unidade = H00A72_A5208Nr_unidade[0] ;
            n5208Nr_unidade = H00A72_n5208Nr_unidade[0] ;
            A5207Nr_piezas = H00A72_A5207Nr_piezas[0] ;
            n5207Nr_piezas = H00A72_n5207Nr_piezas[0] ;
            A5205Nr_partida = H00A72_A5205Nr_partida[0] ;
            n5205Nr_partida = H00A72_n5205Nr_partida[0] ;
            A5204Nr_colnum = H00A72_A5204Nr_colnum[0] ;
            n5204Nr_colnum = H00A72_n5204Nr_colnum[0] ;
            A5203Nr_colnom = H00A72_A5203Nr_colnom[0] ;
            n5203Nr_colnom = H00A72_n5203Nr_colnom[0] ;
            A5202Nr_artdsc = H00A72_A5202Nr_artdsc[0] ;
            n5202Nr_artdsc = H00A72_n5202Nr_artdsc[0] ;
            A5201Nr_artcod = H00A72_A5201Nr_artcod[0] ;
            n5201Nr_artcod = H00A72_n5201Nr_artcod[0] ;
            A5200Nr_refcli = H00A72_A5200Nr_refcli[0] ;
            n5200Nr_refcli = H00A72_n5200Nr_refcli[0] ;
            A5199Nr_albent = H00A72_A5199Nr_albent[0] ;
            n5199Nr_albent = H00A72_n5199Nr_albent[0] ;
            A5341Nr_CliNom = H00A72_A5341Nr_CliNom[0] ;
            n5341Nr_CliNom = H00A72_n5341Nr_CliNom[0] ;
            A5340Nr_CliCod = H00A72_A5340Nr_CliCod[0] ;
            n5340Nr_CliCod = H00A72_n5340Nr_CliCod[0] ;
            A407EmprNom = H00A72_A407EmprNom[0] ;
            n407EmprNom = H00A72_n407EmprNom[0] ;
            A5206Nr_albrecc = H00A72_A5206Nr_albrecc[0] ;
            n5206Nr_albrecc = H00A72_n5206Nr_albrecc[0] ;
            A5198Nr_codigo = H00A72_A5198Nr_codigo[0] ;
            A396EmprCod = H00A72_A396EmprCod[0] ;
            A407EmprNom = H00A72_A407EmprNom[0] ;
            n407EmprNom = H00A72_n407EmprNom[0] ;
            e22A72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wbA70( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesA72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_NR_CODIGO"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")));
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
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV127Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV128Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV129Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV130Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV131Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV132Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV135Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV134Tnotrecwwds_8_tfnr_clinom ,
                                           AV137Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV136Tnotrecwwds_10_tfnr_albent ,
                                           AV139Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV138Tnotrecwwds_12_tfnr_refcli ,
                                           AV141Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV140Tnotrecwwds_14_tfnr_artcod ,
                                           AV143Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV142Tnotrecwwds_16_tfnr_artdsc ,
                                           AV145Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV144Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV146Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV147Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV148Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV149Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV150Tnotrecwwds_24_tfnr_unidades ,
                                           AV151Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV153Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV152Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV154Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV155Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV156Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV157Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV159Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV158Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV160Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV161Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV163Tnotrecwwds_37_tfnr_local_sel ,
                                           AV162Tnotrecwwds_36_tfnr_local ,
                                           AV165Tnotrecwwds_39_tfnr_user_sel ,
                                           AV164Tnotrecwwds_38_tfnr_user ,
                                           AV166Tnotrecwwds_40_tfnr_fecreg ,
                                           AV167Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV168Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV169Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV127Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV134Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV134Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV136Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV136Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV138Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV138Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV140Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV140Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV142Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV142Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV144Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV144Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV152Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV152Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV158Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV158Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV162Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV162Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV164Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV164Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor H00A73 */
      pr_default.execute(1, new Object[] {lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, lV127Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV128Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV129Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV130Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV131Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV132Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV133Tnotrecwwds_7_tfnr_clicod_to), lV134Tnotrecwwds_8_tfnr_clinom, AV135Tnotrecwwds_9_tfnr_clinom_sel, lV136Tnotrecwwds_10_tfnr_albent, AV137Tnotrecwwds_11_tfnr_albent_sel, lV138Tnotrecwwds_12_tfnr_refcli, AV139Tnotrecwwds_13_tfnr_refcli_sel, lV140Tnotrecwwds_14_tfnr_artcod, AV141Tnotrecwwds_15_tfnr_artcod_sel, lV142Tnotrecwwds_16_tfnr_artdsc, AV143Tnotrecwwds_17_tfnr_artdsc_sel, lV144Tnotrecwwds_18_tfnr_colnom, AV145Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV146Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV147Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV148Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV149Tnotrecwwds_23_tfnr_piezas_to), AV150Tnotrecwwds_24_tfnr_unidades, AV151Tnotrecwwds_25_tfnr_unidades_to, lV152Tnotrecwwds_26_tfnr_unidad, AV153Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV154Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV155Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV156Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV157Tnotrecwwds_31_tfnr_barreoa_to), lV158Tnotrecwwds_32_tfnr_barpara, AV159Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV160Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV161Tnotrecwwds_35_tfnr_nalb_to), lV162Tnotrecwwds_36_tfnr_local, AV163Tnotrecwwds_37_tfnr_local_sel, lV164Tnotrecwwds_38_tfnr_user, AV165Tnotrecwwds_39_tfnr_user_sel, AV166Tnotrecwwds_40_tfnr_fecreg, AV167Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV168Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV169Tnotrecwwds_43_tfnr_barcod_to)});
      GRID_nRecordCount = H00A73_AGRID_nRecordCount[0] ;
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
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV119FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFNr_codigo, AV44TFNr_codigo_To, AV46TFNr_albreccod, AV47TFNr_albreccod_To, AV49TFNr_CliCod, AV50TFNr_CliCod_To, AV52TFNr_CliNom, AV53TFNr_CliNom_Sel, AV55TFNr_albent, AV56TFNr_albent_Sel, AV58TFNr_refcli, AV59TFNr_refcli_Sel, AV61TFNr_artcod, AV62TFNr_artcod_Sel, AV64TFNr_artdsc, AV65TFNr_artdsc_Sel, AV67TFNr_colnom, AV68TFNr_colnom_Sel, AV70TFNr_colnum, AV71TFNr_colnum_To, AV73TFNr_piezas, AV74TFNr_piezas_To, AV76TFNr_unidades, AV77TFNr_unidades_To, AV79TFNr_unidad, AV80TFNr_unidad_Sel, AV82TFNr_barcoda, AV83TFNr_barcoda_To, AV85TFNr_barreoa, AV86TFNr_barreoa_To, AV88TFNr_barpara, AV89TFNr_barpara_Sel, AV91TFNr_NAlb, AV92TFNr_NAlb_To, AV94TFNr_local, AV95TFNr_local_Sel, AV97TFNr_user, AV98TFNr_user_Sel, AV100TFNr_fecreg, AV105TFNr_fecent, AV110TFNr_barcod, AV111TFNr_barcod_To, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV170Pgmname = "TNOTRECWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupA70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20A72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV113DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV115GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV116GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV119FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119FilterFullText", AV119FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_nr_fecregauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_NR_FECREGAUXDATE");
            GX_FocusControl = edtavDdo_nr_fecregauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV102DDO_Nr_fecregAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102DDO_Nr_fecregAuxDate", localUtil.format(AV102DDO_Nr_fecregAuxDate, "99/99/99"));
         }
         else
         {
            AV102DDO_Nr_fecregAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_nr_fecregauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102DDO_Nr_fecregAuxDate", localUtil.format(AV102DDO_Nr_fecregAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_nr_fecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_NR_FECENTAUXDATE");
            GX_FocusControl = edtavDdo_nr_fecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107DDO_Nr_fecentAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107DDO_Nr_fecentAuxDate", localUtil.format(AV107DDO_Nr_fecentAuxDate, "99/99/99"));
         }
         else
         {
            AV107DDO_Nr_fecentAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_nr_fecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107DDO_Nr_fecentAuxDate", localUtil.format(AV107DDO_Nr_fecentAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV119FilterFullText) != 0 )
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
      e20A72 ();
      if (returnInSub) return;
   }

   public void e20A72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV123Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnotrecww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV123Station = GXt_char1 ;
      GXv_char2[0] = AV124Emprcod ;
      GXv_char3[0] = AV125Emprnom ;
      GXv_char4[0] = AV126Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV123Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnotrecww_impl.this.AV124Emprcod = GXv_char2[0] ;
      tnotrecww_impl.this.AV125Emprnom = GXv_char3[0] ;
      tnotrecww_impl.this.AV126Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " NOTAS DE RECLAMACIONES", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV113DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV113DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21A72( )
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
      if ( AV41ManageFiltersExecutionStep == 1 )
      {
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV41ManageFiltersExecutionStep == 2 )
      {
         AV41ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV38Session.getValue("TNOTRECWWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("TNOTRECWWColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtNr_codigo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_codigo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_codigo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_albrecc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albrecc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albrecc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_CliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_CliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_albent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albent_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_refcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_refcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_refcli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_artcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artcod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_artdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artdsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_colnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_colnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_colnom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_colnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_colnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_colnum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_piezas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_piezas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_piezas_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_unidade_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_unidade_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_unidade_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_unidad_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_unidad_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_unidad_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_barcoda_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcoda_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcoda_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_barreoa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barreoa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barreoa_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_barpara_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barpara_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barpara_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_NAlb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_NAlb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_NAlb_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_local_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_local_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_local_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_user_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_user_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_user_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_fecreg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecreg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecreg_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_fecent_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecent_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtNr_barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV115GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115GridCurrentPage), 10, 0));
      AV116GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridPageCount), 10, 0));
      AV127Tnotrecwwds_1_filterfulltext = AV119FilterFullText ;
      AV128Tnotrecwwds_2_tfnr_codigo = AV43TFNr_codigo ;
      AV129Tnotrecwwds_3_tfnr_codigo_to = AV44TFNr_codigo_To ;
      AV130Tnotrecwwds_4_tfnr_albreccod = AV46TFNr_albreccod ;
      AV131Tnotrecwwds_5_tfnr_albreccod_to = AV47TFNr_albreccod_To ;
      AV132Tnotrecwwds_6_tfnr_clicod = AV49TFNr_CliCod ;
      AV133Tnotrecwwds_7_tfnr_clicod_to = AV50TFNr_CliCod_To ;
      AV134Tnotrecwwds_8_tfnr_clinom = AV52TFNr_CliNom ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = AV53TFNr_CliNom_Sel ;
      AV136Tnotrecwwds_10_tfnr_albent = AV55TFNr_albent ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = AV56TFNr_albent_Sel ;
      AV138Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV140Tnotrecwwds_14_tfnr_artcod = AV61TFNr_artcod ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = AV62TFNr_artcod_Sel ;
      AV142Tnotrecwwds_16_tfnr_artdsc = AV64TFNr_artdsc ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = AV65TFNr_artdsc_Sel ;
      AV144Tnotrecwwds_18_tfnr_colnom = AV67TFNr_colnom ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = AV68TFNr_colnom_Sel ;
      AV146Tnotrecwwds_20_tfnr_colnum = AV70TFNr_colnum ;
      AV147Tnotrecwwds_21_tfnr_colnum_to = AV71TFNr_colnum_To ;
      AV148Tnotrecwwds_22_tfnr_piezas = AV73TFNr_piezas ;
      AV149Tnotrecwwds_23_tfnr_piezas_to = AV74TFNr_piezas_To ;
      AV150Tnotrecwwds_24_tfnr_unidades = AV76TFNr_unidades ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = AV77TFNr_unidades_To ;
      AV152Tnotrecwwds_26_tfnr_unidad = AV79TFNr_unidad ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = AV80TFNr_unidad_Sel ;
      AV154Tnotrecwwds_28_tfnr_barcoda = AV82TFNr_barcoda ;
      AV155Tnotrecwwds_29_tfnr_barcoda_to = AV83TFNr_barcoda_To ;
      AV156Tnotrecwwds_30_tfnr_barreoa = AV85TFNr_barreoa ;
      AV157Tnotrecwwds_31_tfnr_barreoa_to = AV86TFNr_barreoa_To ;
      AV158Tnotrecwwds_32_tfnr_barpara = AV88TFNr_barpara ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = AV89TFNr_barpara_Sel ;
      AV160Tnotrecwwds_34_tfnr_nalb = AV91TFNr_NAlb ;
      AV161Tnotrecwwds_35_tfnr_nalb_to = AV92TFNr_NAlb_To ;
      AV162Tnotrecwwds_36_tfnr_local = AV94TFNr_local ;
      AV163Tnotrecwwds_37_tfnr_local_sel = AV95TFNr_local_Sel ;
      AV164Tnotrecwwds_38_tfnr_user = AV97TFNr_user ;
      AV165Tnotrecwwds_39_tfnr_user_sel = AV98TFNr_user_Sel ;
      AV166Tnotrecwwds_40_tfnr_fecreg = AV100TFNr_fecreg ;
      AV167Tnotrecwwds_41_tfnr_fecent = AV105TFNr_fecent ;
      AV168Tnotrecwwds_42_tfnr_barcod = AV110TFNr_barcod ;
      AV169Tnotrecwwds_43_tfnr_barcod_to = AV111TFNr_barcod_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12A72( )
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
         AV114PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV114PageToGo) ;
      }
   }

   public void e13A72( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14A72( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_codigo") == 0 )
         {
            AV43TFNr_codigo = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFNr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFNr_codigo), 8, 0));
            AV44TFNr_codigo_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFNr_codigo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFNr_codigo_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_albreccod") == 0 )
         {
            AV46TFNr_albreccod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFNr_albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFNr_albreccod), 8, 0));
            AV47TFNr_albreccod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFNr_albreccod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFNr_albreccod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_CliCod") == 0 )
         {
            AV49TFNr_CliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFNr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFNr_CliCod), 6, 0));
            AV50TFNr_CliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFNr_CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFNr_CliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_CliNom") == 0 )
         {
            AV52TFNr_CliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFNr_CliNom", AV52TFNr_CliNom);
            AV53TFNr_CliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFNr_CliNom_Sel", AV53TFNr_CliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_albent") == 0 )
         {
            AV55TFNr_albent = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFNr_albent", AV55TFNr_albent);
            AV56TFNr_albent_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFNr_albent_Sel", AV56TFNr_albent_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_refcli") == 0 )
         {
            AV58TFNr_refcli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFNr_refcli", AV58TFNr_refcli);
            AV59TFNr_refcli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFNr_refcli_Sel", AV59TFNr_refcli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_artcod") == 0 )
         {
            AV61TFNr_artcod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFNr_artcod", AV61TFNr_artcod);
            AV62TFNr_artcod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFNr_artcod_Sel", AV62TFNr_artcod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_artdsc") == 0 )
         {
            AV64TFNr_artdsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFNr_artdsc", AV64TFNr_artdsc);
            AV65TFNr_artdsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFNr_artdsc_Sel", AV65TFNr_artdsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_colnom") == 0 )
         {
            AV67TFNr_colnom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFNr_colnom", AV67TFNr_colnom);
            AV68TFNr_colnom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFNr_colnom_Sel", AV68TFNr_colnom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_colnum") == 0 )
         {
            AV70TFNr_colnum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFNr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFNr_colnum), 6, 0));
            AV71TFNr_colnum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFNr_colnum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFNr_colnum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_piezas") == 0 )
         {
            AV73TFNr_piezas = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFNr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFNr_piezas), 6, 0));
            AV74TFNr_piezas_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFNr_piezas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFNr_piezas_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_unidades") == 0 )
         {
            AV76TFNr_unidades = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFNr_unidades", GXutil.ltrimstr( AV76TFNr_unidades, 9, 2));
            AV77TFNr_unidades_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFNr_unidades_To", GXutil.ltrimstr( AV77TFNr_unidades_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_unidad") == 0 )
         {
            AV79TFNr_unidad = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFNr_unidad", AV79TFNr_unidad);
            AV80TFNr_unidad_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFNr_unidad_Sel", AV80TFNr_unidad_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_barcoda") == 0 )
         {
            AV82TFNr_barcoda = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFNr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFNr_barcoda), 8, 0));
            AV83TFNr_barcoda_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFNr_barcoda_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFNr_barcoda_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_barreoa") == 0 )
         {
            AV85TFNr_barreoa = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFNr_barreoa", GXutil.str( AV85TFNr_barreoa, 1, 0));
            AV86TFNr_barreoa_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFNr_barreoa_To", GXutil.str( AV86TFNr_barreoa_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_barpara") == 0 )
         {
            AV88TFNr_barpara = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFNr_barpara", AV88TFNr_barpara);
            AV89TFNr_barpara_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFNr_barpara_Sel", AV89TFNr_barpara_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_NAlb") == 0 )
         {
            AV91TFNr_NAlb = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFNr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFNr_NAlb), 10, 0));
            AV92TFNr_NAlb_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFNr_NAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFNr_NAlb_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_local") == 0 )
         {
            AV94TFNr_local = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFNr_local", AV94TFNr_local);
            AV95TFNr_local_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFNr_local_Sel", AV95TFNr_local_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_user") == 0 )
         {
            AV97TFNr_user = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFNr_user", AV97TFNr_user);
            AV98TFNr_user_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFNr_user_Sel", AV98TFNr_user_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_fecreg") == 0 )
         {
            AV100TFNr_fecreg = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFNr_fecreg", localUtil.ttoc( AV100TFNr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_fecent") == 0 )
         {
            AV105TFNr_fecent = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFNr_fecent", localUtil.format(AV105TFNr_fecent, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Nr_barcod") == 0 )
         {
            AV110TFNr_barcod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFNr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110TFNr_barcod), 8, 0));
            AV111TFNr_barcod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFNr_barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFNr_barcod_To), 8, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22A72( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtNr_albrecc_Link = formatLink("app.tnotrecview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5198Nr_codigo,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Nr_codigo","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV120GridActions, 4, 0)) );
   }

   public void e15A72( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TNOTRECWWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11A72( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TNOTRECWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV170Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TNOTRECWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TNOTRECWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tnotrecww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV40ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV40ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV40ManageFiltersXml) ;
            AV10GridState.fromxml(AV40ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e16A72( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tnotrec", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","Nr_codigo"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17A72( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tnotrecwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tnotrecww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tnotrecww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
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
   }

   public void e18A72( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tnotrecwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19A72( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tnotrecwwexportcsv", new String[] {}, new String[] {}) );
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
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_codigo", "", "Reclacacion ID", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_albreccod", "", "Nº Recepcion Id", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_CliCod", "", "Cliente", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_CliNom", "", "Nombre", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_albent", "", "Nº Albaran Cliente", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_refcli", "", "Referencia Albaran entrega cli", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_artcod", "", "Articulo", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_artdsc", "", "Descripcion", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_colnom", "", "Color", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_colnum", "", "Numero", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_piezas", "", "Piezas Entrada", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_unidades", "", "Unidades Entrada", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_unidad", "", "Unidad (K,M)", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_barcoda", "", "Hdr Anterior", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_barreoa", "", "Reopeado Anterior", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_barpara", "", "Particion Anterior", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_NAlb", "", "Numero Albaran Salida", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_local", "", "Localizacion", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_user", "", "Usuario creacion", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_fecreg", "", "Fecha-Hora entrada", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_fecent", "", "Fecha entrega", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Nr_barcod", "", "Hdr", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TNOTRECWWColumnsSelector", GXv_char4) ;
      tnotrecww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TNOTRECWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV119FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119FilterFullText", AV119FilterFullText);
      AV43TFNr_codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFNr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFNr_codigo), 8, 0));
      AV44TFNr_codigo_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFNr_codigo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFNr_codigo_To), 8, 0));
      AV46TFNr_albreccod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFNr_albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFNr_albreccod), 8, 0));
      AV47TFNr_albreccod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFNr_albreccod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFNr_albreccod_To), 8, 0));
      AV49TFNr_CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFNr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFNr_CliCod), 6, 0));
      AV50TFNr_CliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFNr_CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFNr_CliCod_To), 6, 0));
      AV52TFNr_CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFNr_CliNom", AV52TFNr_CliNom);
      AV53TFNr_CliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFNr_CliNom_Sel", AV53TFNr_CliNom_Sel);
      AV55TFNr_albent = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFNr_albent", AV55TFNr_albent);
      AV56TFNr_albent_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFNr_albent_Sel", AV56TFNr_albent_Sel);
      AV58TFNr_refcli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFNr_refcli", AV58TFNr_refcli);
      AV59TFNr_refcli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFNr_refcli_Sel", AV59TFNr_refcli_Sel);
      AV61TFNr_artcod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFNr_artcod", AV61TFNr_artcod);
      AV62TFNr_artcod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFNr_artcod_Sel", AV62TFNr_artcod_Sel);
      AV64TFNr_artdsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFNr_artdsc", AV64TFNr_artdsc);
      AV65TFNr_artdsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFNr_artdsc_Sel", AV65TFNr_artdsc_Sel);
      AV67TFNr_colnom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFNr_colnom", AV67TFNr_colnom);
      AV68TFNr_colnom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFNr_colnom_Sel", AV68TFNr_colnom_Sel);
      AV70TFNr_colnum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFNr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFNr_colnum), 6, 0));
      AV71TFNr_colnum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFNr_colnum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFNr_colnum_To), 6, 0));
      AV73TFNr_piezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFNr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFNr_piezas), 6, 0));
      AV74TFNr_piezas_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFNr_piezas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFNr_piezas_To), 6, 0));
      AV76TFNr_unidades = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFNr_unidades", GXutil.ltrimstr( AV76TFNr_unidades, 9, 2));
      AV77TFNr_unidades_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFNr_unidades_To", GXutil.ltrimstr( AV77TFNr_unidades_To, 9, 2));
      AV79TFNr_unidad = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFNr_unidad", AV79TFNr_unidad);
      AV80TFNr_unidad_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFNr_unidad_Sel", AV80TFNr_unidad_Sel);
      AV82TFNr_barcoda = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFNr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFNr_barcoda), 8, 0));
      AV83TFNr_barcoda_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFNr_barcoda_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFNr_barcoda_To), 8, 0));
      AV85TFNr_barreoa = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFNr_barreoa", GXutil.str( AV85TFNr_barreoa, 1, 0));
      AV86TFNr_barreoa_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFNr_barreoa_To", GXutil.str( AV86TFNr_barreoa_To, 1, 0));
      AV88TFNr_barpara = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFNr_barpara", AV88TFNr_barpara);
      AV89TFNr_barpara_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFNr_barpara_Sel", AV89TFNr_barpara_Sel);
      AV91TFNr_NAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFNr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFNr_NAlb), 10, 0));
      AV92TFNr_NAlb_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFNr_NAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFNr_NAlb_To), 10, 0));
      AV94TFNr_local = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFNr_local", AV94TFNr_local);
      AV95TFNr_local_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFNr_local_Sel", AV95TFNr_local_Sel);
      AV97TFNr_user = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFNr_user", AV97TFNr_user);
      AV98TFNr_user_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFNr_user_Sel", AV98TFNr_user_Sel);
      AV100TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFNr_fecreg", localUtil.ttoc( AV100TFNr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV105TFNr_fecent = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFNr_fecent", localUtil.format(AV105TFNr_fecent, "99/99/99"));
      AV110TFNr_barcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFNr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110TFNr_barcod), 8, 0));
      AV111TFNr_barcod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFNr_barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFNr_barcod_To), 8, 0));
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
      callWebObject(formatLink("app.tnotrecview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5198Nr_codigo,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Nr_codigo","TabCode"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tnotrec", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5198Nr_codigo,8,0))}, new String[] {"Mode","EmprCod","Nr_codigo"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tnotrec", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A5198Nr_codigo,8,0))}, new String[] {"Mode","EmprCod","Nr_codigo"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV170Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV170Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV170Pgmname+"GridState"), null, null);
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
      AV171GXV1 = 1 ;
      while ( AV171GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV171GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV119FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119FilterFullText", AV119FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CODIGO") == 0 )
         {
            AV43TFNr_codigo = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFNr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFNr_codigo), 8, 0));
            AV44TFNr_codigo_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFNr_codigo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFNr_codigo_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBRECCOD") == 0 )
         {
            AV46TFNr_albreccod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFNr_albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFNr_albreccod), 8, 0));
            AV47TFNr_albreccod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFNr_albreccod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFNr_albreccod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLICOD") == 0 )
         {
            AV49TFNr_CliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFNr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFNr_CliCod), 6, 0));
            AV50TFNr_CliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFNr_CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFNr_CliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM") == 0 )
         {
            AV52TFNr_CliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFNr_CliNom", AV52TFNr_CliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM_SEL") == 0 )
         {
            AV53TFNr_CliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFNr_CliNom_Sel", AV53TFNr_CliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT") == 0 )
         {
            AV55TFNr_albent = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFNr_albent", AV55TFNr_albent);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT_SEL") == 0 )
         {
            AV56TFNr_albent_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFNr_albent_Sel", AV56TFNr_albent_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI") == 0 )
         {
            AV58TFNr_refcli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFNr_refcli", AV58TFNr_refcli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI_SEL") == 0 )
         {
            AV59TFNr_refcli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFNr_refcli_Sel", AV59TFNr_refcli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD") == 0 )
         {
            AV61TFNr_artcod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFNr_artcod", AV61TFNr_artcod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD_SEL") == 0 )
         {
            AV62TFNr_artcod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFNr_artcod_Sel", AV62TFNr_artcod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC") == 0 )
         {
            AV64TFNr_artdsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFNr_artdsc", AV64TFNr_artdsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC_SEL") == 0 )
         {
            AV65TFNr_artdsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFNr_artdsc_Sel", AV65TFNr_artdsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM") == 0 )
         {
            AV67TFNr_colnom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFNr_colnom", AV67TFNr_colnom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM_SEL") == 0 )
         {
            AV68TFNr_colnom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFNr_colnom_Sel", AV68TFNr_colnom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNUM") == 0 )
         {
            AV70TFNr_colnum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFNr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFNr_colnum), 6, 0));
            AV71TFNr_colnum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFNr_colnum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFNr_colnum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_PIEZAS") == 0 )
         {
            AV73TFNr_piezas = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFNr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFNr_piezas), 6, 0));
            AV74TFNr_piezas_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFNr_piezas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFNr_piezas_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDADES") == 0 )
         {
            AV76TFNr_unidades = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFNr_unidades", GXutil.ltrimstr( AV76TFNr_unidades, 9, 2));
            AV77TFNr_unidades_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFNr_unidades_To", GXutil.ltrimstr( AV77TFNr_unidades_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD") == 0 )
         {
            AV79TFNr_unidad = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFNr_unidad", AV79TFNr_unidad);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD_SEL") == 0 )
         {
            AV80TFNr_unidad_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFNr_unidad_Sel", AV80TFNr_unidad_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCODA") == 0 )
         {
            AV82TFNr_barcoda = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFNr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TFNr_barcoda), 8, 0));
            AV83TFNr_barcoda_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFNr_barcoda_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFNr_barcoda_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARREOA") == 0 )
         {
            AV85TFNr_barreoa = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFNr_barreoa", GXutil.str( AV85TFNr_barreoa, 1, 0));
            AV86TFNr_barreoa_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFNr_barreoa_To", GXutil.str( AV86TFNr_barreoa_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA") == 0 )
         {
            AV88TFNr_barpara = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFNr_barpara", AV88TFNr_barpara);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA_SEL") == 0 )
         {
            AV89TFNr_barpara_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFNr_barpara_Sel", AV89TFNr_barpara_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_NALB") == 0 )
         {
            AV91TFNr_NAlb = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFNr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFNr_NAlb), 10, 0));
            AV92TFNr_NAlb_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFNr_NAlb_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFNr_NAlb_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL") == 0 )
         {
            AV94TFNr_local = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFNr_local", AV94TFNr_local);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL_SEL") == 0 )
         {
            AV95TFNr_local_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFNr_local_Sel", AV95TFNr_local_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER") == 0 )
         {
            AV97TFNr_user = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFNr_user", AV97TFNr_user);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER_SEL") == 0 )
         {
            AV98TFNr_user_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFNr_user_Sel", AV98TFNr_user_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECREG") == 0 )
         {
            AV100TFNr_fecreg = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFNr_fecreg", localUtil.ttoc( AV100TFNr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV102DDO_Nr_fecregAuxDate = GXutil.resetTime(AV100TFNr_fecreg) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102DDO_Nr_fecregAuxDate", localUtil.format(AV102DDO_Nr_fecregAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECENT") == 0 )
         {
            AV105TFNr_fecent = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFNr_fecent", localUtil.format(AV105TFNr_fecent, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCOD") == 0 )
         {
            AV110TFNr_barcod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFNr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110TFNr_barcod), 8, 0));
            AV111TFNr_barcod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFNr_barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFNr_barcod_To), 8, 0));
         }
         AV171GXV1 = (int)(AV171GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFNr_CliNom_Sel)==0), AV53TFNr_CliNom_Sel, GXv_char4) ;
      tnotrecww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFNr_albent_Sel)==0), AV56TFNr_albent_Sel, GXv_char3) ;
      tnotrecww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFNr_refcli_Sel)==0), AV59TFNr_refcli_Sel, GXv_char2) ;
      tnotrecww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFNr_artcod_Sel)==0), AV62TFNr_artcod_Sel, GXv_char15) ;
      tnotrecww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFNr_artdsc_Sel)==0), AV65TFNr_artdsc_Sel, GXv_char17) ;
      tnotrecww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFNr_colnom_Sel)==0), AV68TFNr_colnom_Sel, GXv_char19) ;
      tnotrecww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFNr_unidad_Sel)==0), AV80TFNr_unidad_Sel, GXv_char21) ;
      tnotrecww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFNr_barpara_Sel)==0), AV89TFNr_barpara_Sel, GXv_char23) ;
      tnotrecww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFNr_local_Sel)==0), AV95TFNr_local_Sel, GXv_char25) ;
      tnotrecww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFNr_user_Sel)==0), AV98TFNr_user_Sel, GXv_char27) ;
      tnotrecww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||||"+GXt_char20+"|||"+GXt_char22+"||"+GXt_char24+"|"+GXt_char26+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFNr_CliNom)==0), AV52TFNr_CliNom, GXv_char27) ;
      tnotrecww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFNr_albent)==0), AV55TFNr_albent, GXv_char25) ;
      tnotrecww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFNr_refcli)==0), AV58TFNr_refcli, GXv_char23) ;
      tnotrecww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFNr_artcod)==0), AV61TFNr_artcod, GXv_char21) ;
      tnotrecww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFNr_artdsc)==0), AV64TFNr_artdsc, GXv_char19) ;
      tnotrecww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFNr_colnom)==0), AV67TFNr_colnom, GXv_char17) ;
      tnotrecww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFNr_unidad)==0), AV79TFNr_unidad, GXv_char15) ;
      tnotrecww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFNr_barpara)==0), AV88TFNr_barpara, GXv_char4) ;
      tnotrecww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFNr_local)==0), AV94TFNr_local, GXv_char3) ;
      tnotrecww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFNr_user)==0), AV97TFNr_user, GXv_char2) ;
      tnotrecww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV43TFNr_codigo) ? "" : GXutil.str( AV43TFNr_codigo, 8, 0))+"|"+((0==AV46TFNr_albreccod) ? "" : GXutil.str( AV46TFNr_albreccod, 8, 0))+"|"+((0==AV49TFNr_CliCod) ? "" : GXutil.str( AV49TFNr_CliCod, 6, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV70TFNr_colnum) ? "" : GXutil.str( AV70TFNr_colnum, 6, 0))+"|"+((0==AV73TFNr_piezas) ? "" : GXutil.str( AV73TFNr_piezas, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFNr_unidades)==0) ? "" : GXutil.str( AV76TFNr_unidades, 9, 2))+"|"+GXt_char14+"|"+((0==AV82TFNr_barcoda) ? "" : GXutil.str( AV82TFNr_barcoda, 8, 0))+"|"+((0==AV85TFNr_barreoa) ? "" : GXutil.str( AV85TFNr_barreoa, 1, 0))+"|"+GXt_char13+"|"+((0==AV91TFNr_NAlb) ? "" : GXutil.str( AV91TFNr_NAlb, 10, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV100TFNr_fecreg) ? "" : localUtil.dtoc( AV102DDO_Nr_fecregAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105TFNr_fecent)) ? "" : localUtil.dtoc( AV105TFNr_fecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV110TFNr_barcod) ? "" : GXutil.str( AV110TFNr_barcod, 8, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV44TFNr_codigo_To) ? "" : GXutil.str( AV44TFNr_codigo_To, 8, 0))+"|"+((0==AV47TFNr_albreccod_To) ? "" : GXutil.str( AV47TFNr_albreccod_To, 8, 0))+"|"+((0==AV50TFNr_CliCod_To) ? "" : GXutil.str( AV50TFNr_CliCod_To, 6, 0))+"|||||||"+((0==AV71TFNr_colnum_To) ? "" : GXutil.str( AV71TFNr_colnum_To, 6, 0))+"|"+((0==AV74TFNr_piezas_To) ? "" : GXutil.str( AV74TFNr_piezas_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFNr_unidades_To)==0) ? "" : GXutil.str( AV77TFNr_unidades_To, 9, 2))+"||"+((0==AV83TFNr_barcoda_To) ? "" : GXutil.str( AV83TFNr_barcoda_To, 8, 0))+"|"+((0==AV86TFNr_barreoa_To) ? "" : GXutil.str( AV86TFNr_barreoa_To, 1, 0))+"||"+((0==AV92TFNr_NAlb_To) ? "" : GXutil.str( AV92TFNr_NAlb_To, 10, 0))+"|||||"+((0==AV111TFNr_barcod_To) ? "" : GXutil.str( AV111TFNr_barcod_To, 8, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV170Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV119FilterFullText)==0), (short)(0), AV119FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_CODIGO", "", !((0==AV43TFNr_codigo)&&(0==AV44TFNr_codigo_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFNr_codigo, 8, 0)), GXutil.trim( GXutil.str( AV44TFNr_codigo_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_ALBRECCOD", "", !((0==AV46TFNr_albreccod)&&(0==AV47TFNr_albreccod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFNr_albreccod, 8, 0)), GXutil.trim( GXutil.str( AV47TFNr_albreccod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_CLICOD", "", !((0==AV49TFNr_CliCod)&&(0==AV50TFNr_CliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFNr_CliCod, 6, 0)), GXutil.trim( GXutil.str( AV50TFNr_CliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_CLINOM", "", !(GXutil.strcmp("", AV52TFNr_CliNom)==0), (short)(0), AV52TFNr_CliNom, "", !(GXutil.strcmp("", AV53TFNr_CliNom_Sel)==0), AV53TFNr_CliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_ALBENT", "", !(GXutil.strcmp("", AV55TFNr_albent)==0), (short)(0), AV55TFNr_albent, "", !(GXutil.strcmp("", AV56TFNr_albent_Sel)==0), AV56TFNr_albent_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_REFCLI", "", !(GXutil.strcmp("", AV58TFNr_refcli)==0), (short)(0), AV58TFNr_refcli, "", !(GXutil.strcmp("", AV59TFNr_refcli_Sel)==0), AV59TFNr_refcli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_ARTCOD", "", !(GXutil.strcmp("", AV61TFNr_artcod)==0), (short)(0), AV61TFNr_artcod, "", !(GXutil.strcmp("", AV62TFNr_artcod_Sel)==0), AV62TFNr_artcod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_ARTDSC", "", !(GXutil.strcmp("", AV64TFNr_artdsc)==0), (short)(0), AV64TFNr_artdsc, "", !(GXutil.strcmp("", AV65TFNr_artdsc_Sel)==0), AV65TFNr_artdsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_COLNOM", "", !(GXutil.strcmp("", AV67TFNr_colnom)==0), (short)(0), AV67TFNr_colnom, "", !(GXutil.strcmp("", AV68TFNr_colnom_Sel)==0), AV68TFNr_colnom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_COLNUM", "", !((0==AV70TFNr_colnum)&&(0==AV71TFNr_colnum_To)), (short)(0), GXutil.trim( GXutil.str( AV70TFNr_colnum, 6, 0)), GXutil.trim( GXutil.str( AV71TFNr_colnum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_PIEZAS", "", !((0==AV73TFNr_piezas)&&(0==AV74TFNr_piezas_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFNr_piezas, 6, 0)), GXutil.trim( GXutil.str( AV74TFNr_piezas_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_UNIDADES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFNr_unidades)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFNr_unidades_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFNr_unidades, 9, 2)), GXutil.trim( GXutil.str( AV77TFNr_unidades_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_UNIDAD", "", !(GXutil.strcmp("", AV79TFNr_unidad)==0), (short)(0), AV79TFNr_unidad, "", !(GXutil.strcmp("", AV80TFNr_unidad_Sel)==0), AV80TFNr_unidad_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_BARCODA", "", !((0==AV82TFNr_barcoda)&&(0==AV83TFNr_barcoda_To)), (short)(0), GXutil.trim( GXutil.str( AV82TFNr_barcoda, 8, 0)), GXutil.trim( GXutil.str( AV83TFNr_barcoda_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_BARREOA", "", !((0==AV85TFNr_barreoa)&&(0==AV86TFNr_barreoa_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFNr_barreoa, 1, 0)), GXutil.trim( GXutil.str( AV86TFNr_barreoa_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_BARPARA", "", !(GXutil.strcmp("", AV88TFNr_barpara)==0), (short)(0), AV88TFNr_barpara, "", !(GXutil.strcmp("", AV89TFNr_barpara_Sel)==0), AV89TFNr_barpara_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_NALB", "", !((0==AV91TFNr_NAlb)&&(0==AV92TFNr_NAlb_To)), (short)(0), GXutil.trim( GXutil.str( AV91TFNr_NAlb, 10, 0)), GXutil.trim( GXutil.str( AV92TFNr_NAlb_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_LOCAL", "", !(GXutil.strcmp("", AV94TFNr_local)==0), (short)(0), AV94TFNr_local, "", !(GXutil.strcmp("", AV95TFNr_local_Sel)==0), AV95TFNr_local_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_USER", "", !(GXutil.strcmp("", AV97TFNr_user)==0), (short)(0), AV97TFNr_user, "", !(GXutil.strcmp("", AV98TFNr_user_Sel)==0), AV98TFNr_user_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_FECREG", "", !GXutil.dateCompare(GXutil.nullDate(), AV100TFNr_fecreg), (short)(0), GXutil.trim( localUtil.ttoc( AV100TFNr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_FECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105TFNr_fecent)), (short)(0), GXutil.trim( localUtil.dtoc( AV105TFNr_fecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFNR_BARCOD", "", !((0==AV110TFNr_barcod)&&(0==AV111TFNr_barcod_To)), (short)(0), GXutil.trim( GXutil.str( AV110TFNr_barcod, 8, 0)), GXutil.trim( GXutil.str( AV111TFNr_barcod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV170Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TNOTREC" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_A72( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_A72( true) ;
      }
      else
      {
         wb_table2_32_A72( false) ;
      }
      return  ;
   }

   public void wb_table2_32_A72e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_A72e( true) ;
      }
      else
      {
         wb_table1_27_A72e( false) ;
      }
   }

   public void wb_table2_32_A72( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV119FilterFullText, GXutil.rtrim( localUtil.format( AV119FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TNOTRECWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_A72e( true) ;
      }
      else
      {
         wb_table2_32_A72e( false) ;
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
      paA72( ) ;
      wsA72( ) ;
      weA72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116113857", true, true);
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
      httpContext.AddJavascriptSource("tnotrecww.js", "?202682116113857", false, true);
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
      edtNr_codigo_Internalname = "NR_CODIGO_"+sGXsfl_45_idx ;
      edtNr_albrecc_Internalname = "NR_ALBRECC_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtNr_CliCod_Internalname = "NR_CLICOD_"+sGXsfl_45_idx ;
      edtNr_CliNom_Internalname = "NR_CLINOM_"+sGXsfl_45_idx ;
      edtNr_albent_Internalname = "NR_ALBENT_"+sGXsfl_45_idx ;
      edtNr_refcli_Internalname = "NR_REFCLI_"+sGXsfl_45_idx ;
      edtNr_artcod_Internalname = "NR_ARTCOD_"+sGXsfl_45_idx ;
      edtNr_artdsc_Internalname = "NR_ARTDSC_"+sGXsfl_45_idx ;
      edtNr_colnom_Internalname = "NR_COLNOM_"+sGXsfl_45_idx ;
      edtNr_colnum_Internalname = "NR_COLNUM_"+sGXsfl_45_idx ;
      edtNr_partida_Internalname = "NR_PARTIDA_"+sGXsfl_45_idx ;
      edtNr_piezas_Internalname = "NR_PIEZAS_"+sGXsfl_45_idx ;
      edtNr_unidade_Internalname = "NR_UNIDADE_"+sGXsfl_45_idx ;
      edtNr_unidad_Internalname = "NR_UNIDAD_"+sGXsfl_45_idx ;
      edtNr_barcoda_Internalname = "NR_BARCODA_"+sGXsfl_45_idx ;
      edtNr_barreoa_Internalname = "NR_BARREOA_"+sGXsfl_45_idx ;
      edtNr_barpara_Internalname = "NR_BARPARA_"+sGXsfl_45_idx ;
      edtNr_NAlb_Internalname = "NR_NALB_"+sGXsfl_45_idx ;
      edtNr_local_Internalname = "NR_LOCAL_"+sGXsfl_45_idx ;
      edtNr_user_Internalname = "NR_USER_"+sGXsfl_45_idx ;
      edtNr_fecreg_Internalname = "NR_FECREG_"+sGXsfl_45_idx ;
      edtNr_fecent_Internalname = "NR_FECENT_"+sGXsfl_45_idx ;
      edtNr_barcod_Internalname = "NR_BARCOD_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtNr_codigo_Internalname = "NR_CODIGO_"+sGXsfl_45_fel_idx ;
      edtNr_albrecc_Internalname = "NR_ALBRECC_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtNr_CliCod_Internalname = "NR_CLICOD_"+sGXsfl_45_fel_idx ;
      edtNr_CliNom_Internalname = "NR_CLINOM_"+sGXsfl_45_fel_idx ;
      edtNr_albent_Internalname = "NR_ALBENT_"+sGXsfl_45_fel_idx ;
      edtNr_refcli_Internalname = "NR_REFCLI_"+sGXsfl_45_fel_idx ;
      edtNr_artcod_Internalname = "NR_ARTCOD_"+sGXsfl_45_fel_idx ;
      edtNr_artdsc_Internalname = "NR_ARTDSC_"+sGXsfl_45_fel_idx ;
      edtNr_colnom_Internalname = "NR_COLNOM_"+sGXsfl_45_fel_idx ;
      edtNr_colnum_Internalname = "NR_COLNUM_"+sGXsfl_45_fel_idx ;
      edtNr_partida_Internalname = "NR_PARTIDA_"+sGXsfl_45_fel_idx ;
      edtNr_piezas_Internalname = "NR_PIEZAS_"+sGXsfl_45_fel_idx ;
      edtNr_unidade_Internalname = "NR_UNIDADE_"+sGXsfl_45_fel_idx ;
      edtNr_unidad_Internalname = "NR_UNIDAD_"+sGXsfl_45_fel_idx ;
      edtNr_barcoda_Internalname = "NR_BARCODA_"+sGXsfl_45_fel_idx ;
      edtNr_barreoa_Internalname = "NR_BARREOA_"+sGXsfl_45_fel_idx ;
      edtNr_barpara_Internalname = "NR_BARPARA_"+sGXsfl_45_fel_idx ;
      edtNr_NAlb_Internalname = "NR_NALB_"+sGXsfl_45_fel_idx ;
      edtNr_local_Internalname = "NR_LOCAL_"+sGXsfl_45_fel_idx ;
      edtNr_user_Internalname = "NR_USER_"+sGXsfl_45_fel_idx ;
      edtNr_fecreg_Internalname = "NR_FECREG_"+sGXsfl_45_fel_idx ;
      edtNr_fecent_Internalname = "NR_FECENT_"+sGXsfl_45_fel_idx ;
      edtNr_barcod_Internalname = "NR_BARCOD_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbA70( ) ;
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
               AV120GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV120GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV120GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23a72_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV120GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_codigo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_codigo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_codigo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_albrecc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_albrecc_Internalname,GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'",edtNr_albrecc_Link,"","","",edtNr_albrecc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtNr_albrecc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_CliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_CliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5340Nr_CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_CliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_CliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_CliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_CliNom_Internalname,GXutil.rtrim( A5341Nr_CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_CliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_CliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_albent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_albent_Internalname,GXutil.rtrim( A5199Nr_albent),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_albent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_albent_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_refcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_refcli_Internalname,GXutil.rtrim( A5200Nr_refcli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_refcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_refcli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_artcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_artcod_Internalname,GXutil.rtrim( A5201Nr_artcod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_artcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_artcod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_artdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_artdsc_Internalname,GXutil.rtrim( A5202Nr_artdsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_artdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_artdsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_colnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_colnom_Internalname,GXutil.rtrim( A5203Nr_colnom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_colnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_colnom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_colnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_colnum_Internalname,GXutil.ltrim( localUtil.ntoc( A5204Nr_colnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_colnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_colnum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_partida_Internalname,GXutil.ltrim( localUtil.ntoc( A5205Nr_partida, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5205Nr_partida), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_partida_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_piezas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_piezas_Internalname,GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_piezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_piezas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_unidade_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_unidade_Internalname,GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5208Nr_unidade, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_unidade_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_unidade_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_unidad_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_unidad_Internalname,GXutil.rtrim( A5209Nr_unidad),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_unidad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_unidad_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_barcoda_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_barcoda_Internalname,GXutil.ltrim( localUtil.ntoc( A5222Nr_barcoda, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_barcoda_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_barcoda_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_barreoa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_barreoa_Internalname,GXutil.ltrim( localUtil.ntoc( A5223Nr_barreoa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_barreoa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_barreoa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_barpara_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_barpara_Internalname,GXutil.rtrim( A5224Nr_barpara),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_barpara_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_barpara_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_NAlb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_NAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A12235Nr_NAlb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_NAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_NAlb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_local_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_local_Internalname,GXutil.rtrim( A5214Nr_local),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_local_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_local_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtNr_user_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_user_Internalname,GXutil.rtrim( A5215Nr_user),GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_user_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_user_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_fecreg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_fecreg_Internalname,localUtil.ttoc( A5216Nr_fecreg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_fecreg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_fecreg_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_fecent_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_fecent_Internalname,localUtil.format(A5217Nr_fecent, "99/99/99"),localUtil.format( A5217Nr_fecent, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_fecent_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_fecent_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtNr_barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNr_barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A5210Nr_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNr_barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtNr_barcod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesA72( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_codigo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reclacacion ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_albrecc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Recepcion Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_CliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_CliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_albent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Albaran Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_refcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia Albaran entrega cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_artcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_artdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_colnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_colnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_piezas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_unidade_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_unidad_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad (K,M)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_barcoda_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr Anterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_barreoa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reopeado Anterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_barpara_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Particion Anterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_NAlb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Albaran Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_local_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_user_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario creacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_fecreg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha-Hora entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_fecent_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtNr_barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV120GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_codigo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtNr_albrecc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_albrecc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_CliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5341Nr_CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_CliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5199Nr_albent));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_albent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5200Nr_refcli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_refcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5201Nr_artcod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_artcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5202Nr_artdsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_artdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5203Nr_colnom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_colnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5204Nr_colnum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_colnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5205Nr_partida, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_piezas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_unidade_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5209Nr_unidad));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_unidad_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5222Nr_barcoda, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_barcoda_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5223Nr_barreoa, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_barreoa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5224Nr_barpara));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_barpara_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12235Nr_NAlb, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_NAlb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5214Nr_local));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_local_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5215Nr_user));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_user_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A5216Nr_fecreg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_fecreg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5217Nr_fecent, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_fecent_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5210Nr_barcod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNr_barcod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtNr_codigo_Internalname = "NR_CODIGO" ;
      edtNr_albrecc_Internalname = "NR_ALBRECC" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtNr_CliCod_Internalname = "NR_CLICOD" ;
      edtNr_CliNom_Internalname = "NR_CLINOM" ;
      edtNr_albent_Internalname = "NR_ALBENT" ;
      edtNr_refcli_Internalname = "NR_REFCLI" ;
      edtNr_artcod_Internalname = "NR_ARTCOD" ;
      edtNr_artdsc_Internalname = "NR_ARTDSC" ;
      edtNr_colnom_Internalname = "NR_COLNOM" ;
      edtNr_colnum_Internalname = "NR_COLNUM" ;
      edtNr_partida_Internalname = "NR_PARTIDA" ;
      edtNr_piezas_Internalname = "NR_PIEZAS" ;
      edtNr_unidade_Internalname = "NR_UNIDADE" ;
      edtNr_unidad_Internalname = "NR_UNIDAD" ;
      edtNr_barcoda_Internalname = "NR_BARCODA" ;
      edtNr_barreoa_Internalname = "NR_BARREOA" ;
      edtNr_barpara_Internalname = "NR_BARPARA" ;
      edtNr_NAlb_Internalname = "NR_NALB" ;
      edtNr_local_Internalname = "NR_LOCAL" ;
      edtNr_user_Internalname = "NR_USER" ;
      edtNr_fecreg_Internalname = "NR_FECREG" ;
      edtNr_fecent_Internalname = "NR_FECENT" ;
      edtNr_barcod_Internalname = "NR_BARCOD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_nr_fecregauxdate_Internalname = "vDDO_NR_FECREGAUXDATE" ;
      divDdo_nr_fecregauxdates_Internalname = "DDO_NR_FECREGAUXDATES" ;
      edtavDdo_nr_fecentauxdate_Internalname = "vDDO_NR_FECENTAUXDATE" ;
      divDdo_nr_fecentauxdates_Internalname = "DDO_NR_FECENTAUXDATES" ;
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
      edtNr_barcod_Jsonclick = "" ;
      edtNr_fecent_Jsonclick = "" ;
      edtNr_fecreg_Jsonclick = "" ;
      edtNr_user_Jsonclick = "" ;
      edtNr_local_Jsonclick = "" ;
      edtNr_NAlb_Jsonclick = "" ;
      edtNr_barpara_Jsonclick = "" ;
      edtNr_barreoa_Jsonclick = "" ;
      edtNr_barcoda_Jsonclick = "" ;
      edtNr_unidad_Jsonclick = "" ;
      edtNr_unidade_Jsonclick = "" ;
      edtNr_piezas_Jsonclick = "" ;
      edtNr_partida_Jsonclick = "" ;
      edtNr_colnum_Jsonclick = "" ;
      edtNr_colnom_Jsonclick = "" ;
      edtNr_artdsc_Jsonclick = "" ;
      edtNr_artcod_Jsonclick = "" ;
      edtNr_refcli_Jsonclick = "" ;
      edtNr_albent_Jsonclick = "" ;
      edtNr_CliNom_Jsonclick = "" ;
      edtNr_CliCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtNr_albrecc_Jsonclick = "" ;
      edtNr_albrecc_Link = "" ;
      edtNr_codigo_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtNr_barcod_Visible = -1 ;
      edtNr_fecent_Visible = -1 ;
      edtNr_fecreg_Visible = -1 ;
      edtNr_user_Visible = -1 ;
      edtNr_local_Visible = -1 ;
      edtNr_NAlb_Visible = -1 ;
      edtNr_barpara_Visible = -1 ;
      edtNr_barreoa_Visible = -1 ;
      edtNr_barcoda_Visible = -1 ;
      edtNr_unidad_Visible = -1 ;
      edtNr_unidade_Visible = -1 ;
      edtNr_piezas_Visible = -1 ;
      edtNr_colnum_Visible = -1 ;
      edtNr_colnom_Visible = -1 ;
      edtNr_artdsc_Visible = -1 ;
      edtNr_artcod_Visible = -1 ;
      edtNr_refcli_Visible = -1 ;
      edtNr_albent_Visible = -1 ;
      edtNr_CliNom_Visible = -1 ;
      edtNr_CliCod_Visible = -1 ;
      edtNr_albrecc_Visible = -1 ;
      edtNr_codigo_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_nr_fecentauxdate_Jsonclick = "" ;
      edtavDdo_nr_fecregauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TNOTRECWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||||Dynamic|||Dynamic||Dynamic|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T|T|T||||T|||T||T|T|||" ;
      Ddo_grid_Filterisrange = "T|T|T|||||||T|T|T||T|T||T|||||T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Numeric|Character|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Character|Numeric|Numeric|Character|Numeric|Character|Character|Date|Date|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22" ;
      Ddo_grid_Columnids = "2:Nr_codigo|3:Nr_albreccod|5:Nr_CliCod|6:Nr_CliNom|7:Nr_albent|8:Nr_refcli|9:Nr_artcod|10:Nr_artdsc|11:Nr_colnom|12:Nr_colnum|14:Nr_piezas|15:Nr_unidades|16:Nr_unidad|17:Nr_barcoda|18:Nr_barreoa|19:Nr_barpara|20:Nr_NAlb|21:Nr_local|22:Nr_user|23:Nr_fecreg|24:Nr_fecent|25:Nr_barcod" ;
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
      Form.setCaption( httpContext.getMessage( " NOTAS DE RECLAMACIONES", "") );
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
         AV120GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV120GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtNr_codigo_Visible',ctrl:'NR_CODIGO',prop:'Visible'},{av:'edtNr_albrecc_Visible',ctrl:'NR_ALBRECC',prop:'Visible'},{av:'edtNr_CliCod_Visible',ctrl:'NR_CLICOD',prop:'Visible'},{av:'edtNr_CliNom_Visible',ctrl:'NR_CLINOM',prop:'Visible'},{av:'edtNr_albent_Visible',ctrl:'NR_ALBENT',prop:'Visible'},{av:'edtNr_refcli_Visible',ctrl:'NR_REFCLI',prop:'Visible'},{av:'edtNr_artcod_Visible',ctrl:'NR_ARTCOD',prop:'Visible'},{av:'edtNr_artdsc_Visible',ctrl:'NR_ARTDSC',prop:'Visible'},{av:'edtNr_colnom_Visible',ctrl:'NR_COLNOM',prop:'Visible'},{av:'edtNr_colnum_Visible',ctrl:'NR_COLNUM',prop:'Visible'},{av:'edtNr_piezas_Visible',ctrl:'NR_PIEZAS',prop:'Visible'},{av:'edtNr_unidade_Visible',ctrl:'NR_UNIDADE',prop:'Visible'},{av:'edtNr_unidad_Visible',ctrl:'NR_UNIDAD',prop:'Visible'},{av:'edtNr_barcoda_Visible',ctrl:'NR_BARCODA',prop:'Visible'},{av:'edtNr_barreoa_Visible',ctrl:'NR_BARREOA',prop:'Visible'},{av:'edtNr_barpara_Visible',ctrl:'NR_BARPARA',prop:'Visible'},{av:'edtNr_NAlb_Visible',ctrl:'NR_NALB',prop:'Visible'},{av:'edtNr_local_Visible',ctrl:'NR_LOCAL',prop:'Visible'},{av:'edtNr_user_Visible',ctrl:'NR_USER',prop:'Visible'},{av:'edtNr_fecreg_Visible',ctrl:'NR_FECREG',prop:'Visible'},{av:'edtNr_fecent_Visible',ctrl:'NR_FECENT',prop:'Visible'},{av:'edtNr_barcod_Visible',ctrl:'NR_BARCOD',prop:'Visible'},{av:'AV115GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV116GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12A72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13A72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14A72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22A72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV120GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtNr_albrecc_Link',ctrl:'NR_ALBRECC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15A72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtNr_codigo_Visible',ctrl:'NR_CODIGO',prop:'Visible'},{av:'edtNr_albrecc_Visible',ctrl:'NR_ALBRECC',prop:'Visible'},{av:'edtNr_CliCod_Visible',ctrl:'NR_CLICOD',prop:'Visible'},{av:'edtNr_CliNom_Visible',ctrl:'NR_CLINOM',prop:'Visible'},{av:'edtNr_albent_Visible',ctrl:'NR_ALBENT',prop:'Visible'},{av:'edtNr_refcli_Visible',ctrl:'NR_REFCLI',prop:'Visible'},{av:'edtNr_artcod_Visible',ctrl:'NR_ARTCOD',prop:'Visible'},{av:'edtNr_artdsc_Visible',ctrl:'NR_ARTDSC',prop:'Visible'},{av:'edtNr_colnom_Visible',ctrl:'NR_COLNOM',prop:'Visible'},{av:'edtNr_colnum_Visible',ctrl:'NR_COLNUM',prop:'Visible'},{av:'edtNr_piezas_Visible',ctrl:'NR_PIEZAS',prop:'Visible'},{av:'edtNr_unidade_Visible',ctrl:'NR_UNIDADE',prop:'Visible'},{av:'edtNr_unidad_Visible',ctrl:'NR_UNIDAD',prop:'Visible'},{av:'edtNr_barcoda_Visible',ctrl:'NR_BARCODA',prop:'Visible'},{av:'edtNr_barreoa_Visible',ctrl:'NR_BARREOA',prop:'Visible'},{av:'edtNr_barpara_Visible',ctrl:'NR_BARPARA',prop:'Visible'},{av:'edtNr_NAlb_Visible',ctrl:'NR_NALB',prop:'Visible'},{av:'edtNr_local_Visible',ctrl:'NR_LOCAL',prop:'Visible'},{av:'edtNr_user_Visible',ctrl:'NR_USER',prop:'Visible'},{av:'edtNr_fecreg_Visible',ctrl:'NR_FECREG',prop:'Visible'},{av:'edtNr_fecent_Visible',ctrl:'NR_FECENT',prop:'Visible'},{av:'edtNr_barcod_Visible',ctrl:'NR_BARCOD',prop:'Visible'},{av:'AV115GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV116GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11A72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtNr_codigo_Visible',ctrl:'NR_CODIGO',prop:'Visible'},{av:'edtNr_albrecc_Visible',ctrl:'NR_ALBRECC',prop:'Visible'},{av:'edtNr_CliCod_Visible',ctrl:'NR_CLICOD',prop:'Visible'},{av:'edtNr_CliNom_Visible',ctrl:'NR_CLINOM',prop:'Visible'},{av:'edtNr_albent_Visible',ctrl:'NR_ALBENT',prop:'Visible'},{av:'edtNr_refcli_Visible',ctrl:'NR_REFCLI',prop:'Visible'},{av:'edtNr_artcod_Visible',ctrl:'NR_ARTCOD',prop:'Visible'},{av:'edtNr_artdsc_Visible',ctrl:'NR_ARTDSC',prop:'Visible'},{av:'edtNr_colnom_Visible',ctrl:'NR_COLNOM',prop:'Visible'},{av:'edtNr_colnum_Visible',ctrl:'NR_COLNUM',prop:'Visible'},{av:'edtNr_piezas_Visible',ctrl:'NR_PIEZAS',prop:'Visible'},{av:'edtNr_unidade_Visible',ctrl:'NR_UNIDADE',prop:'Visible'},{av:'edtNr_unidad_Visible',ctrl:'NR_UNIDAD',prop:'Visible'},{av:'edtNr_barcoda_Visible',ctrl:'NR_BARCODA',prop:'Visible'},{av:'edtNr_barreoa_Visible',ctrl:'NR_BARREOA',prop:'Visible'},{av:'edtNr_barpara_Visible',ctrl:'NR_BARPARA',prop:'Visible'},{av:'edtNr_NAlb_Visible',ctrl:'NR_NALB',prop:'Visible'},{av:'edtNr_local_Visible',ctrl:'NR_LOCAL',prop:'Visible'},{av:'edtNr_user_Visible',ctrl:'NR_USER',prop:'Visible'},{av:'edtNr_fecreg_Visible',ctrl:'NR_FECREG',prop:'Visible'},{av:'edtNr_fecent_Visible',ctrl:'NR_FECENT',prop:'Visible'},{av:'edtNr_barcod_Visible',ctrl:'NR_BARCOD',prop:'Visible'},{av:'AV115GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV116GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23A72',iparms:[{av:'cmbavGridactions'},{av:'AV120GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV120GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16A72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17A72',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18A72',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19A72',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV119FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFNr_codigo',fld:'vTFNR_CODIGO',pic:'ZZZZZZZ9'},{av:'AV44TFNr_codigo_To',fld:'vTFNR_CODIGO_TO',pic:'ZZZZZZZ9'},{av:'AV46TFNr_albreccod',fld:'vTFNR_ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFNr_albreccod_To',fld:'vTFNR_ALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFNr_CliCod',fld:'vTFNR_CLICOD',pic:'ZZZZZ9'},{av:'AV50TFNr_CliCod_To',fld:'vTFNR_CLICOD_TO',pic:'ZZZZZ9'},{av:'AV52TFNr_CliNom',fld:'vTFNR_CLINOM',pic:''},{av:'AV53TFNr_CliNom_Sel',fld:'vTFNR_CLINOM_SEL',pic:''},{av:'AV55TFNr_albent',fld:'vTFNR_ALBENT',pic:''},{av:'AV56TFNr_albent_Sel',fld:'vTFNR_ALBENT_SEL',pic:''},{av:'AV58TFNr_refcli',fld:'vTFNR_REFCLI',pic:''},{av:'AV59TFNr_refcli_Sel',fld:'vTFNR_REFCLI_SEL',pic:''},{av:'AV61TFNr_artcod',fld:'vTFNR_ARTCOD',pic:''},{av:'AV62TFNr_artcod_Sel',fld:'vTFNR_ARTCOD_SEL',pic:''},{av:'AV64TFNr_artdsc',fld:'vTFNR_ARTDSC',pic:''},{av:'AV65TFNr_artdsc_Sel',fld:'vTFNR_ARTDSC_SEL',pic:''},{av:'AV67TFNr_colnom',fld:'vTFNR_COLNOM',pic:''},{av:'AV68TFNr_colnom_Sel',fld:'vTFNR_COLNOM_SEL',pic:''},{av:'AV70TFNr_colnum',fld:'vTFNR_COLNUM',pic:'ZZZZZ9'},{av:'AV71TFNr_colnum_To',fld:'vTFNR_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFNr_piezas',fld:'vTFNR_PIEZAS',pic:'ZZZ9'},{av:'AV74TFNr_piezas_To',fld:'vTFNR_PIEZAS_TO',pic:'ZZZ9'},{av:'AV76TFNr_unidades',fld:'vTFNR_UNIDADES',pic:'ZZZZZ9.99'},{av:'AV77TFNr_unidades_To',fld:'vTFNR_UNIDADES_TO',pic:'ZZZZZ9.99'},{av:'AV79TFNr_unidad',fld:'vTFNR_UNIDAD',pic:''},{av:'AV80TFNr_unidad_Sel',fld:'vTFNR_UNIDAD_SEL',pic:''},{av:'AV82TFNr_barcoda',fld:'vTFNR_BARCODA',pic:'ZZZZZZZ9'},{av:'AV83TFNr_barcoda_To',fld:'vTFNR_BARCODA_TO',pic:'ZZZZZZZ9'},{av:'AV85TFNr_barreoa',fld:'vTFNR_BARREOA',pic:'9'},{av:'AV86TFNr_barreoa_To',fld:'vTFNR_BARREOA_TO',pic:'9'},{av:'AV88TFNr_barpara',fld:'vTFNR_BARPARA',pic:''},{av:'AV89TFNr_barpara_Sel',fld:'vTFNR_BARPARA_SEL',pic:''},{av:'AV91TFNr_NAlb',fld:'vTFNR_NALB',pic:'ZZZZZZZZZ9'},{av:'AV92TFNr_NAlb_To',fld:'vTFNR_NALB_TO',pic:'ZZZZZZZZZ9'},{av:'AV94TFNr_local',fld:'vTFNR_LOCAL',pic:''},{av:'AV95TFNr_local_Sel',fld:'vTFNR_LOCAL_SEL',pic:''},{av:'AV97TFNr_user',fld:'vTFNR_USER',pic:'@!'},{av:'AV98TFNr_user_Sel',fld:'vTFNR_USER_SEL',pic:'@!'},{av:'AV100TFNr_fecreg',fld:'vTFNR_FECREG',pic:'99/99/99 99:99:99'},{av:'AV105TFNr_fecent',fld:'vTFNR_FECENT',pic:''},{av:'AV110TFNr_barcod',fld:'vTFNR_BARCOD',pic:'ZZZZZZZ9'},{av:'AV111TFNr_barcod_To',fld:'vTFNR_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV102DDO_Nr_fecregAuxDate',fld:'vDDO_NR_FECREGAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Nr_barcod',iparms:[]");
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
      AV119FilterFullText = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV52TFNr_CliNom = "" ;
      AV53TFNr_CliNom_Sel = "" ;
      AV55TFNr_albent = "" ;
      AV56TFNr_albent_Sel = "" ;
      AV58TFNr_refcli = "" ;
      AV59TFNr_refcli_Sel = "" ;
      AV61TFNr_artcod = "" ;
      AV62TFNr_artcod_Sel = "" ;
      AV64TFNr_artdsc = "" ;
      AV65TFNr_artdsc_Sel = "" ;
      AV67TFNr_colnom = "" ;
      AV68TFNr_colnom_Sel = "" ;
      AV76TFNr_unidades = DecimalUtil.ZERO ;
      AV77TFNr_unidades_To = DecimalUtil.ZERO ;
      AV79TFNr_unidad = "" ;
      AV80TFNr_unidad_Sel = "" ;
      AV88TFNr_barpara = "" ;
      AV89TFNr_barpara_Sel = "" ;
      AV94TFNr_local = "" ;
      AV95TFNr_local_Sel = "" ;
      AV97TFNr_user = "" ;
      AV98TFNr_user_Sel = "" ;
      AV100TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV105TFNr_fecent = GXutil.nullDate() ;
      AV170Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV113DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      AV102DDO_Nr_fecregAuxDate = GXutil.nullDate() ;
      AV107DDO_Nr_fecentAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5215Nr_user = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5217Nr_fecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV127Tnotrecwwds_1_filterfulltext = "" ;
      lV134Tnotrecwwds_8_tfnr_clinom = "" ;
      lV136Tnotrecwwds_10_tfnr_albent = "" ;
      lV138Tnotrecwwds_12_tfnr_refcli = "" ;
      lV140Tnotrecwwds_14_tfnr_artcod = "" ;
      lV142Tnotrecwwds_16_tfnr_artdsc = "" ;
      lV144Tnotrecwwds_18_tfnr_colnom = "" ;
      lV152Tnotrecwwds_26_tfnr_unidad = "" ;
      lV158Tnotrecwwds_32_tfnr_barpara = "" ;
      lV162Tnotrecwwds_36_tfnr_local = "" ;
      lV164Tnotrecwwds_38_tfnr_user = "" ;
      AV127Tnotrecwwds_1_filterfulltext = "" ;
      AV135Tnotrecwwds_9_tfnr_clinom_sel = "" ;
      AV134Tnotrecwwds_8_tfnr_clinom = "" ;
      AV137Tnotrecwwds_11_tfnr_albent_sel = "" ;
      AV136Tnotrecwwds_10_tfnr_albent = "" ;
      AV139Tnotrecwwds_13_tfnr_refcli_sel = "" ;
      AV138Tnotrecwwds_12_tfnr_refcli = "" ;
      AV141Tnotrecwwds_15_tfnr_artcod_sel = "" ;
      AV140Tnotrecwwds_14_tfnr_artcod = "" ;
      AV143Tnotrecwwds_17_tfnr_artdsc_sel = "" ;
      AV142Tnotrecwwds_16_tfnr_artdsc = "" ;
      AV145Tnotrecwwds_19_tfnr_colnom_sel = "" ;
      AV144Tnotrecwwds_18_tfnr_colnom = "" ;
      AV150Tnotrecwwds_24_tfnr_unidades = DecimalUtil.ZERO ;
      AV151Tnotrecwwds_25_tfnr_unidades_to = DecimalUtil.ZERO ;
      AV153Tnotrecwwds_27_tfnr_unidad_sel = "" ;
      AV152Tnotrecwwds_26_tfnr_unidad = "" ;
      AV159Tnotrecwwds_33_tfnr_barpara_sel = "" ;
      AV158Tnotrecwwds_32_tfnr_barpara = "" ;
      AV163Tnotrecwwds_37_tfnr_local_sel = "" ;
      AV162Tnotrecwwds_36_tfnr_local = "" ;
      AV165Tnotrecwwds_39_tfnr_user_sel = "" ;
      AV164Tnotrecwwds_38_tfnr_user = "" ;
      AV166Tnotrecwwds_40_tfnr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV167Tnotrecwwds_41_tfnr_fecent = GXutil.nullDate() ;
      H00A72_A5210Nr_barcod = new int[1] ;
      H00A72_n5210Nr_barcod = new boolean[] {false} ;
      H00A72_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      H00A72_n5217Nr_fecent = new boolean[] {false} ;
      H00A72_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      H00A72_n5216Nr_fecreg = new boolean[] {false} ;
      H00A72_A5215Nr_user = new String[] {""} ;
      H00A72_n5215Nr_user = new boolean[] {false} ;
      H00A72_A5214Nr_local = new String[] {""} ;
      H00A72_n5214Nr_local = new boolean[] {false} ;
      H00A72_A12235Nr_NAlb = new long[1] ;
      H00A72_n12235Nr_NAlb = new boolean[] {false} ;
      H00A72_A5224Nr_barpara = new String[] {""} ;
      H00A72_n5224Nr_barpara = new boolean[] {false} ;
      H00A72_A5223Nr_barreoa = new byte[1] ;
      H00A72_n5223Nr_barreoa = new boolean[] {false} ;
      H00A72_A5222Nr_barcoda = new int[1] ;
      H00A72_n5222Nr_barcoda = new boolean[] {false} ;
      H00A72_A5209Nr_unidad = new String[] {""} ;
      H00A72_n5209Nr_unidad = new boolean[] {false} ;
      H00A72_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00A72_n5208Nr_unidade = new boolean[] {false} ;
      H00A72_A5207Nr_piezas = new int[1] ;
      H00A72_n5207Nr_piezas = new boolean[] {false} ;
      H00A72_A5205Nr_partida = new int[1] ;
      H00A72_n5205Nr_partida = new boolean[] {false} ;
      H00A72_A5204Nr_colnum = new int[1] ;
      H00A72_n5204Nr_colnum = new boolean[] {false} ;
      H00A72_A5203Nr_colnom = new String[] {""} ;
      H00A72_n5203Nr_colnom = new boolean[] {false} ;
      H00A72_A5202Nr_artdsc = new String[] {""} ;
      H00A72_n5202Nr_artdsc = new boolean[] {false} ;
      H00A72_A5201Nr_artcod = new String[] {""} ;
      H00A72_n5201Nr_artcod = new boolean[] {false} ;
      H00A72_A5200Nr_refcli = new String[] {""} ;
      H00A72_n5200Nr_refcli = new boolean[] {false} ;
      H00A72_A5199Nr_albent = new String[] {""} ;
      H00A72_n5199Nr_albent = new boolean[] {false} ;
      H00A72_A5341Nr_CliNom = new String[] {""} ;
      H00A72_n5341Nr_CliNom = new boolean[] {false} ;
      H00A72_A5340Nr_CliCod = new int[1] ;
      H00A72_n5340Nr_CliCod = new boolean[] {false} ;
      H00A72_A407EmprNom = new String[] {""} ;
      H00A72_n407EmprNom = new boolean[] {false} ;
      H00A72_A5206Nr_albrecc = new int[1] ;
      H00A72_n5206Nr_albrecc = new boolean[] {false} ;
      H00A72_A5198Nr_codigo = new int[1] ;
      H00A72_A396EmprCod = new String[] {""} ;
      H00A73_AGRID_nRecordCount = new long[1] ;
      AV123Station = "" ;
      AV124Emprcod = "" ;
      AV125Emprnom = "" ;
      AV126Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV40ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV35UserCustomValue = "" ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecww__default(),
         new Object[] {
             new Object[] {
            H00A72_A5210Nr_barcod, H00A72_n5210Nr_barcod, H00A72_A5217Nr_fecent, H00A72_n5217Nr_fecent, H00A72_A5216Nr_fecreg, H00A72_n5216Nr_fecreg, H00A72_A5215Nr_user, H00A72_n5215Nr_user, H00A72_A5214Nr_local, H00A72_n5214Nr_local,
            H00A72_A12235Nr_NAlb, H00A72_n12235Nr_NAlb, H00A72_A5224Nr_barpara, H00A72_n5224Nr_barpara, H00A72_A5223Nr_barreoa, H00A72_n5223Nr_barreoa, H00A72_A5222Nr_barcoda, H00A72_n5222Nr_barcoda, H00A72_A5209Nr_unidad, H00A72_n5209Nr_unidad,
            H00A72_A5208Nr_unidade, H00A72_n5208Nr_unidade, H00A72_A5207Nr_piezas, H00A72_n5207Nr_piezas, H00A72_A5205Nr_partida, H00A72_n5205Nr_partida, H00A72_A5204Nr_colnum, H00A72_n5204Nr_colnum, H00A72_A5203Nr_colnom, H00A72_n5203Nr_colnom,
            H00A72_A5202Nr_artdsc, H00A72_n5202Nr_artdsc, H00A72_A5201Nr_artcod, H00A72_n5201Nr_artcod, H00A72_A5200Nr_refcli, H00A72_n5200Nr_refcli, H00A72_A5199Nr_albent, H00A72_n5199Nr_albent, H00A72_A5341Nr_CliNom, H00A72_n5341Nr_CliNom,
            H00A72_A5340Nr_CliCod, H00A72_n5340Nr_CliCod, H00A72_A407EmprNom, H00A72_n407EmprNom, H00A72_A5206Nr_albrecc, H00A72_n5206Nr_albrecc, H00A72_A5198Nr_codigo, H00A72_A396EmprCod
            }
            , new Object[] {
            H00A73_AGRID_nRecordCount
            }
         }
      );
      AV170Pgmname = "TNOTRECWW" ;
      /* GeneXus formulas. */
      AV170Pgmname = "TNOTRECWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte AV85TFNr_barreoa ;
   private byte AV86TFNr_barreoa_To ;
   private byte gxajaxcallmode ;
   private byte A5223Nr_barreoa ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV156Tnotrecwwds_30_tfnr_barreoa ;
   private byte AV157Tnotrecwwds_31_tfnr_barreoa_to ;
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
   private short AV120GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV43TFNr_codigo ;
   private int AV44TFNr_codigo_To ;
   private int AV46TFNr_albreccod ;
   private int AV47TFNr_albreccod_To ;
   private int AV49TFNr_CliCod ;
   private int AV50TFNr_CliCod_To ;
   private int AV70TFNr_colnum ;
   private int AV71TFNr_colnum_To ;
   private int AV73TFNr_piezas ;
   private int AV74TFNr_piezas_To ;
   private int AV82TFNr_barcoda ;
   private int AV83TFNr_barcoda_To ;
   private int AV110TFNr_barcod ;
   private int AV111TFNr_barcod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A5198Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5204Nr_colnum ;
   private int A5205Nr_partida ;
   private int A5207Nr_piezas ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV128Tnotrecwwds_2_tfnr_codigo ;
   private int AV129Tnotrecwwds_3_tfnr_codigo_to ;
   private int AV130Tnotrecwwds_4_tfnr_albreccod ;
   private int AV131Tnotrecwwds_5_tfnr_albreccod_to ;
   private int AV132Tnotrecwwds_6_tfnr_clicod ;
   private int AV133Tnotrecwwds_7_tfnr_clicod_to ;
   private int AV146Tnotrecwwds_20_tfnr_colnum ;
   private int AV147Tnotrecwwds_21_tfnr_colnum_to ;
   private int AV148Tnotrecwwds_22_tfnr_piezas ;
   private int AV149Tnotrecwwds_23_tfnr_piezas_to ;
   private int AV154Tnotrecwwds_28_tfnr_barcoda ;
   private int AV155Tnotrecwwds_29_tfnr_barcoda_to ;
   private int AV168Tnotrecwwds_42_tfnr_barcod ;
   private int AV169Tnotrecwwds_43_tfnr_barcod_to ;
   private int edtNr_codigo_Visible ;
   private int edtNr_albrecc_Visible ;
   private int edtNr_CliCod_Visible ;
   private int edtNr_CliNom_Visible ;
   private int edtNr_albent_Visible ;
   private int edtNr_refcli_Visible ;
   private int edtNr_artcod_Visible ;
   private int edtNr_artdsc_Visible ;
   private int edtNr_colnom_Visible ;
   private int edtNr_colnum_Visible ;
   private int edtNr_piezas_Visible ;
   private int edtNr_unidade_Visible ;
   private int edtNr_unidad_Visible ;
   private int edtNr_barcoda_Visible ;
   private int edtNr_barreoa_Visible ;
   private int edtNr_barpara_Visible ;
   private int edtNr_NAlb_Visible ;
   private int edtNr_local_Visible ;
   private int edtNr_user_Visible ;
   private int edtNr_fecreg_Visible ;
   private int edtNr_fecent_Visible ;
   private int edtNr_barcod_Visible ;
   private int AV114PageToGo ;
   private int AV171GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV91TFNr_NAlb ;
   private long AV92TFNr_NAlb_To ;
   private long AV115GridCurrentPage ;
   private long AV116GridPageCount ;
   private long A12235Nr_NAlb ;
   private long GRID_nCurrentRecord ;
   private long AV160Tnotrecwwds_34_tfnr_nalb ;
   private long AV161Tnotrecwwds_35_tfnr_nalb_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV76TFNr_unidades ;
   private java.math.BigDecimal AV77TFNr_unidades_To ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private java.math.BigDecimal AV150Tnotrecwwds_24_tfnr_unidades ;
   private java.math.BigDecimal AV151Tnotrecwwds_25_tfnr_unidades_to ;
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
   private String AV52TFNr_CliNom ;
   private String AV53TFNr_CliNom_Sel ;
   private String AV55TFNr_albent ;
   private String AV56TFNr_albent_Sel ;
   private String AV58TFNr_refcli ;
   private String AV59TFNr_refcli_Sel ;
   private String AV61TFNr_artcod ;
   private String AV62TFNr_artcod_Sel ;
   private String AV64TFNr_artdsc ;
   private String AV65TFNr_artdsc_Sel ;
   private String AV67TFNr_colnom ;
   private String AV68TFNr_colnom_Sel ;
   private String AV79TFNr_unidad ;
   private String AV80TFNr_unidad_Sel ;
   private String AV88TFNr_barpara ;
   private String AV89TFNr_barpara_Sel ;
   private String AV94TFNr_local ;
   private String AV95TFNr_local_Sel ;
   private String AV97TFNr_user ;
   private String AV98TFNr_user_Sel ;
   private String AV170Pgmname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_nr_fecregauxdates_Internalname ;
   private String edtavDdo_nr_fecregauxdate_Internalname ;
   private String edtavDdo_nr_fecregauxdate_Jsonclick ;
   private String divDdo_nr_fecentauxdates_Internalname ;
   private String edtavDdo_nr_fecentauxdate_Internalname ;
   private String edtavDdo_nr_fecentauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtNr_codigo_Internalname ;
   private String edtNr_albrecc_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtNr_CliCod_Internalname ;
   private String A5341Nr_CliNom ;
   private String edtNr_CliNom_Internalname ;
   private String A5199Nr_albent ;
   private String edtNr_albent_Internalname ;
   private String A5200Nr_refcli ;
   private String edtNr_refcli_Internalname ;
   private String A5201Nr_artcod ;
   private String edtNr_artcod_Internalname ;
   private String A5202Nr_artdsc ;
   private String edtNr_artdsc_Internalname ;
   private String A5203Nr_colnom ;
   private String edtNr_colnom_Internalname ;
   private String edtNr_colnum_Internalname ;
   private String edtNr_partida_Internalname ;
   private String edtNr_piezas_Internalname ;
   private String edtNr_unidade_Internalname ;
   private String A5209Nr_unidad ;
   private String edtNr_unidad_Internalname ;
   private String edtNr_barcoda_Internalname ;
   private String edtNr_barreoa_Internalname ;
   private String A5224Nr_barpara ;
   private String edtNr_barpara_Internalname ;
   private String edtNr_NAlb_Internalname ;
   private String A5214Nr_local ;
   private String edtNr_local_Internalname ;
   private String A5215Nr_user ;
   private String edtNr_user_Internalname ;
   private String edtNr_fecreg_Internalname ;
   private String edtNr_fecent_Internalname ;
   private String edtNr_barcod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV134Tnotrecwwds_8_tfnr_clinom ;
   private String lV136Tnotrecwwds_10_tfnr_albent ;
   private String lV138Tnotrecwwds_12_tfnr_refcli ;
   private String lV140Tnotrecwwds_14_tfnr_artcod ;
   private String lV142Tnotrecwwds_16_tfnr_artdsc ;
   private String lV144Tnotrecwwds_18_tfnr_colnom ;
   private String lV152Tnotrecwwds_26_tfnr_unidad ;
   private String lV158Tnotrecwwds_32_tfnr_barpara ;
   private String lV162Tnotrecwwds_36_tfnr_local ;
   private String lV164Tnotrecwwds_38_tfnr_user ;
   private String AV135Tnotrecwwds_9_tfnr_clinom_sel ;
   private String AV134Tnotrecwwds_8_tfnr_clinom ;
   private String AV137Tnotrecwwds_11_tfnr_albent_sel ;
   private String AV136Tnotrecwwds_10_tfnr_albent ;
   private String AV139Tnotrecwwds_13_tfnr_refcli_sel ;
   private String AV138Tnotrecwwds_12_tfnr_refcli ;
   private String AV141Tnotrecwwds_15_tfnr_artcod_sel ;
   private String AV140Tnotrecwwds_14_tfnr_artcod ;
   private String AV143Tnotrecwwds_17_tfnr_artdsc_sel ;
   private String AV142Tnotrecwwds_16_tfnr_artdsc ;
   private String AV145Tnotrecwwds_19_tfnr_colnom_sel ;
   private String AV144Tnotrecwwds_18_tfnr_colnom ;
   private String AV153Tnotrecwwds_27_tfnr_unidad_sel ;
   private String AV152Tnotrecwwds_26_tfnr_unidad ;
   private String AV159Tnotrecwwds_33_tfnr_barpara_sel ;
   private String AV158Tnotrecwwds_32_tfnr_barpara ;
   private String AV163Tnotrecwwds_37_tfnr_local_sel ;
   private String AV162Tnotrecwwds_36_tfnr_local ;
   private String AV165Tnotrecwwds_39_tfnr_user_sel ;
   private String AV164Tnotrecwwds_38_tfnr_user ;
   private String AV123Station ;
   private String AV124Emprcod ;
   private String AV125Emprnom ;
   private String AV126Usurcod ;
   private String edtNr_albrecc_Link ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
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
   private String edtNr_codigo_Jsonclick ;
   private String edtNr_albrecc_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtNr_CliCod_Jsonclick ;
   private String edtNr_CliNom_Jsonclick ;
   private String edtNr_albent_Jsonclick ;
   private String edtNr_refcli_Jsonclick ;
   private String edtNr_artcod_Jsonclick ;
   private String edtNr_artdsc_Jsonclick ;
   private String edtNr_colnom_Jsonclick ;
   private String edtNr_colnum_Jsonclick ;
   private String edtNr_partida_Jsonclick ;
   private String edtNr_piezas_Jsonclick ;
   private String edtNr_unidade_Jsonclick ;
   private String edtNr_unidad_Jsonclick ;
   private String edtNr_barcoda_Jsonclick ;
   private String edtNr_barreoa_Jsonclick ;
   private String edtNr_barpara_Jsonclick ;
   private String edtNr_NAlb_Jsonclick ;
   private String edtNr_local_Jsonclick ;
   private String edtNr_user_Jsonclick ;
   private String edtNr_fecreg_Jsonclick ;
   private String edtNr_fecent_Jsonclick ;
   private String edtNr_barcod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV100TFNr_fecreg ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date AV166Tnotrecwwds_40_tfnr_fecreg ;
   private java.util.Date AV105TFNr_fecent ;
   private java.util.Date AV102DDO_Nr_fecregAuxDate ;
   private java.util.Date AV107DDO_Nr_fecentAuxDate ;
   private java.util.Date A5217Nr_fecent ;
   private java.util.Date AV167Tnotrecwwds_41_tfnr_fecent ;
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
   private boolean n5206Nr_albrecc ;
   private boolean n407EmprNom ;
   private boolean n5340Nr_CliCod ;
   private boolean n5341Nr_CliNom ;
   private boolean n5199Nr_albent ;
   private boolean n5200Nr_refcli ;
   private boolean n5201Nr_artcod ;
   private boolean n5202Nr_artdsc ;
   private boolean n5203Nr_colnom ;
   private boolean n5204Nr_colnum ;
   private boolean n5205Nr_partida ;
   private boolean n5207Nr_piezas ;
   private boolean n5208Nr_unidade ;
   private boolean n5209Nr_unidad ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n12235Nr_NAlb ;
   private boolean n5214Nr_local ;
   private boolean n5215Nr_user ;
   private boolean n5216Nr_fecreg ;
   private boolean n5217Nr_fecent ;
   private boolean n5210Nr_barcod ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV119FilterFullText ;
   private String lV127Tnotrecwwds_1_filterfulltext ;
   private String AV127Tnotrecwwds_1_filterfulltext ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private int[] H00A72_A5210Nr_barcod ;
   private boolean[] H00A72_n5210Nr_barcod ;
   private java.util.Date[] H00A72_A5217Nr_fecent ;
   private boolean[] H00A72_n5217Nr_fecent ;
   private java.util.Date[] H00A72_A5216Nr_fecreg ;
   private boolean[] H00A72_n5216Nr_fecreg ;
   private String[] H00A72_A5215Nr_user ;
   private boolean[] H00A72_n5215Nr_user ;
   private String[] H00A72_A5214Nr_local ;
   private boolean[] H00A72_n5214Nr_local ;
   private long[] H00A72_A12235Nr_NAlb ;
   private boolean[] H00A72_n12235Nr_NAlb ;
   private String[] H00A72_A5224Nr_barpara ;
   private boolean[] H00A72_n5224Nr_barpara ;
   private byte[] H00A72_A5223Nr_barreoa ;
   private boolean[] H00A72_n5223Nr_barreoa ;
   private int[] H00A72_A5222Nr_barcoda ;
   private boolean[] H00A72_n5222Nr_barcoda ;
   private String[] H00A72_A5209Nr_unidad ;
   private boolean[] H00A72_n5209Nr_unidad ;
   private java.math.BigDecimal[] H00A72_A5208Nr_unidade ;
   private boolean[] H00A72_n5208Nr_unidade ;
   private int[] H00A72_A5207Nr_piezas ;
   private boolean[] H00A72_n5207Nr_piezas ;
   private int[] H00A72_A5205Nr_partida ;
   private boolean[] H00A72_n5205Nr_partida ;
   private int[] H00A72_A5204Nr_colnum ;
   private boolean[] H00A72_n5204Nr_colnum ;
   private String[] H00A72_A5203Nr_colnom ;
   private boolean[] H00A72_n5203Nr_colnom ;
   private String[] H00A72_A5202Nr_artdsc ;
   private boolean[] H00A72_n5202Nr_artdsc ;
   private String[] H00A72_A5201Nr_artcod ;
   private boolean[] H00A72_n5201Nr_artcod ;
   private String[] H00A72_A5200Nr_refcli ;
   private boolean[] H00A72_n5200Nr_refcli ;
   private String[] H00A72_A5199Nr_albent ;
   private boolean[] H00A72_n5199Nr_albent ;
   private String[] H00A72_A5341Nr_CliNom ;
   private boolean[] H00A72_n5341Nr_CliNom ;
   private int[] H00A72_A5340Nr_CliCod ;
   private boolean[] H00A72_n5340Nr_CliCod ;
   private String[] H00A72_A407EmprNom ;
   private boolean[] H00A72_n407EmprNom ;
   private int[] H00A72_A5206Nr_albrecc ;
   private boolean[] H00A72_n5206Nr_albrecc ;
   private int[] H00A72_A5198Nr_codigo ;
   private String[] H00A72_A396EmprCod ;
   private long[] H00A73_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV113DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tnotrecww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00A72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV127Tnotrecwwds_1_filterfulltext ,
                                          int AV128Tnotrecwwds_2_tfnr_codigo ,
                                          int AV129Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV130Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV131Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV132Tnotrecwwds_6_tfnr_clicod ,
                                          int AV133Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV135Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV134Tnotrecwwds_8_tfnr_clinom ,
                                          String AV137Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV136Tnotrecwwds_10_tfnr_albent ,
                                          String AV139Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV138Tnotrecwwds_12_tfnr_refcli ,
                                          String AV141Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV140Tnotrecwwds_14_tfnr_artcod ,
                                          String AV143Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV142Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV145Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV144Tnotrecwwds_18_tfnr_colnom ,
                                          int AV146Tnotrecwwds_20_tfnr_colnum ,
                                          int AV147Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV148Tnotrecwwds_22_tfnr_piezas ,
                                          int AV149Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV150Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV151Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV153Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV152Tnotrecwwds_26_tfnr_unidad ,
                                          int AV154Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV155Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV156Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV157Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV159Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV158Tnotrecwwds_32_tfnr_barpara ,
                                          long AV160Tnotrecwwds_34_tfnr_nalb ,
                                          long AV161Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV163Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV162Tnotrecwwds_36_tfnr_local ,
                                          String AV165Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV164Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV166Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV167Tnotrecwwds_41_tfnr_fecent ,
                                          int AV168Tnotrecwwds_42_tfnr_barcod ,
                                          int AV169Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[67];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.Nr_barcod, T1.Nr_fecent, T1.Nr_fecreg, T1.Nr_user, T1.Nr_local, T1.Nr_NAlb, T1.Nr_barpara, T1.Nr_barreoa, T1.Nr_barcoda, T1.Nr_unidad, T1.Nr_unidade, T1.Nr_piezas," ;
      sSelectString += " T1.Nr_partida, T1.Nr_colnum, T1.Nr_colnom, T1.Nr_artdsc, T1.Nr_artcod, T1.Nr_refcli, T1.Nr_albent, T1.Nr_CliNom, T1.Nr_CliCod, T2.EmprNom, T1.Nr_albrecc, T1.Nr_codigo," ;
      sSelectString += " T1.EmprCod" ;
      sFromString = " FROM (TXPNOTREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Nr_albent) like '%' || UPPER(?)) or ( UPPER(T1.Nr_refcli) like '%' || UPPER(?)) or ( UPPER(T1.Nr_artcod) like '%' || UPPER(?)) or ( UPPER(T1.Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(T1.Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(T1.Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(T1.Nr_local) like '%' || UPPER(?)) or ( UPPER(T1.Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
         GXv_int29[1] = (byte)(1) ;
         GXv_int29[2] = (byte)(1) ;
         GXv_int29[3] = (byte)(1) ;
         GXv_int29[4] = (byte)(1) ;
         GXv_int29[5] = (byte)(1) ;
         GXv_int29[6] = (byte)(1) ;
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
         GXv_int29[13] = (byte)(1) ;
         GXv_int29[14] = (byte)(1) ;
         GXv_int29[15] = (byte)(1) ;
         GXv_int29[16] = (byte)(1) ;
         GXv_int29[17] = (byte)(1) ;
         GXv_int29[18] = (byte)(1) ;
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(T1.Nr_codigo >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV129Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(T1.Nr_codigo <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV130Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(T1.Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(T1.Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_CliNom = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV136Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_albent = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_refcli = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV140Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_artcod = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_artdsc = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV144Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_colnom = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV146Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(T1.Nr_colnum >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV147Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Nr_colnum <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV148Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(T1.Nr_piezas >= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (0==AV149Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(T1.Nr_piezas <= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidade >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidade <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV152Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidad = ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (0==AV154Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(T1.Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (0==AV155Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (0==AV156Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(T1.Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV157Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV158Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_barpara = ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (0==AV160Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(T1.Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (0==AV161Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(T1.Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV162Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_local = ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV164Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_user = ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV166Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(T1.Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV167Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(T1.Nr_fecent >= ?)");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (0==AV168Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(T1.Nr_barcod >= ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (0==AV169Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barcod <= ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_albrecc" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_albrecc DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_codigo" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_codigo DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_CliCod" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_CliNom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_albent" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_albent DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_refcli" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_refcli DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_artcod" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_artcod DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_artdsc" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_artdsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_colnom" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_colnom DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_colnum" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_colnum DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_piezas" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_piezas DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_unidade" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_unidade DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_unidad" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_unidad DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_barcoda" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_barcoda DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_barreoa" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_barreoa DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_barpara" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_barpara DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_NAlb" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_NAlb DESC" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_local" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_local DESC" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_user" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_user DESC" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_fecreg" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_fecreg DESC" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_fecent" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_fecent DESC" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Nr_barcod" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Nr_barcod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Nr_codigo" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H00A73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV127Tnotrecwwds_1_filterfulltext ,
                                          int AV128Tnotrecwwds_2_tfnr_codigo ,
                                          int AV129Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV130Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV131Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV132Tnotrecwwds_6_tfnr_clicod ,
                                          int AV133Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV135Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV134Tnotrecwwds_8_tfnr_clinom ,
                                          String AV137Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV136Tnotrecwwds_10_tfnr_albent ,
                                          String AV139Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV138Tnotrecwwds_12_tfnr_refcli ,
                                          String AV141Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV140Tnotrecwwds_14_tfnr_artcod ,
                                          String AV143Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV142Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV145Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV144Tnotrecwwds_18_tfnr_colnom ,
                                          int AV146Tnotrecwwds_20_tfnr_colnum ,
                                          int AV147Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV148Tnotrecwwds_22_tfnr_piezas ,
                                          int AV149Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV150Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV151Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV153Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV152Tnotrecwwds_26_tfnr_unidad ,
                                          int AV154Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV155Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV156Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV157Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV159Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV158Tnotrecwwds_32_tfnr_barpara ,
                                          long AV160Tnotrecwwds_34_tfnr_nalb ,
                                          long AV161Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV163Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV162Tnotrecwwds_36_tfnr_local ,
                                          String AV165Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV164Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV166Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV167Tnotrecwwds_41_tfnr_fecent ,
                                          int AV168Tnotrecwwds_42_tfnr_barcod ,
                                          int AV169Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[62];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPNOTREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Nr_albent) like '%' || UPPER(?)) or ( UPPER(T1.Nr_refcli) like '%' || UPPER(?)) or ( UPPER(T1.Nr_artcod) like '%' || UPPER(?)) or ( UPPER(T1.Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(T1.Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(T1.Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(T1.Nr_local) like '%' || UPPER(?)) or ( UPPER(T1.Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
         GXv_int31[1] = (byte)(1) ;
         GXv_int31[2] = (byte)(1) ;
         GXv_int31[3] = (byte)(1) ;
         GXv_int31[4] = (byte)(1) ;
         GXv_int31[5] = (byte)(1) ;
         GXv_int31[6] = (byte)(1) ;
         GXv_int31[7] = (byte)(1) ;
         GXv_int31[8] = (byte)(1) ;
         GXv_int31[9] = (byte)(1) ;
         GXv_int31[10] = (byte)(1) ;
         GXv_int31[11] = (byte)(1) ;
         GXv_int31[12] = (byte)(1) ;
         GXv_int31[13] = (byte)(1) ;
         GXv_int31[14] = (byte)(1) ;
         GXv_int31[15] = (byte)(1) ;
         GXv_int31[16] = (byte)(1) ;
         GXv_int31[17] = (byte)(1) ;
         GXv_int31[18] = (byte)(1) ;
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(T1.Nr_codigo >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV129Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(T1.Nr_codigo <= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (0==AV130Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(T1.Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(T1.Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_CliNom = ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV136Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_albent = ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_refcli = ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV140Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_artcod = ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_artdsc = ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV144Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_colnom = ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (0==AV146Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(T1.Nr_colnum >= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (0==AV147Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Nr_colnum <= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (0==AV148Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(T1.Nr_piezas >= ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (0==AV149Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(T1.Nr_piezas <= ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidade >= ?)");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidade <= ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV152Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_unidad = ?)");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! (0==AV154Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(T1.Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      if ( ! (0==AV155Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int31[47] = (byte)(1) ;
      }
      if ( ! (0==AV156Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(T1.Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int31[48] = (byte)(1) ;
      }
      if ( ! (0==AV157Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int31[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV158Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_barpara = ?)");
      }
      else
      {
         GXv_int31[51] = (byte)(1) ;
      }
      if ( ! (0==AV160Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(T1.Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int31[52] = (byte)(1) ;
      }
      if ( ! (0==AV161Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(T1.Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int31[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV162Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_local = ?)");
      }
      else
      {
         GXv_int31[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV164Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Nr_user = ?)");
      }
      else
      {
         GXv_int31[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV166Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(T1.Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int31[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV167Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(T1.Nr_fecent >= ?)");
      }
      else
      {
         GXv_int31[59] = (byte)(1) ;
      }
      if ( ! (0==AV168Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(T1.Nr_barcod >= ?)");
      }
      else
      {
         GXv_int31[60] = (byte)(1) ;
      }
      if ( ! (0==AV169Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(T1.Nr_barcod <= ?)");
      }
      else
      {
         GXv_int31[61] = (byte)(1) ;
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
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H00A72(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Boolean) dynConstraints[66]).booleanValue() );
            case 1 :
                  return conditional_H00A73(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Boolean) dynConstraints[66]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00A72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00A73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(24);
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[115]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[119]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[120]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[125], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[132]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
      }
   }

}

