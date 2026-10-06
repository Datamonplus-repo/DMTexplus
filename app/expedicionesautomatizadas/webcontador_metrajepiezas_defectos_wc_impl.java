package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_defectos_wc_impl extends GXWebComponent
{
   public webcontador_metrajepiezas_defectos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webcontador_metrajepiezas_defectos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_defectos_wc_impl.class ));
   }

   public webcontador_metrajepiezas_defectos_wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               AV7EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
               AV8MetTerCod = httpContext.GetPar( "MetTerCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MetTerCod", AV8MetTerCod);
               AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
               AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodPar", AV11BarCodPar);
               AV12MetPieCod = httpContext.GetPar( "MetPieCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MetPieCod", AV12MetPieCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7EmprCod,AV8MetTerCod,Integer.valueOf(AV9BarCod),Byte.valueOf(AV10BarCodReo),AV11BarCodPar,AV12MetPieCod});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV21FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8MetTerCod = httpContext.GetPar( "MetTerCod") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV12MetPieCod = httpContext.GetPar( "MetPieCod") ;
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV44TFMetPieDfLin = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfLin"))) ;
      AV45TFMetPieDfLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfLin_To"))) ;
      AV46TFMetPieDfID = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfID"))) ;
      AV47TFMetPieDfID_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfID_To"))) ;
      AV48TFMetPieDfDc = httpContext.GetPar( "TFMetPieDfDc") ;
      AV49TFMetPieDfDc_Sel = httpContext.GetPar( "TFMetPieDfDc_Sel") ;
      AV50TFMetPieDfMin = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieDfMin"), ".") ;
      AV51TFMetPieDfMin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieDfMin_To"), ".") ;
      AV52TFMetPieDfMax = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieDfMax"), ".") ;
      AV53TFMetPieDfMax_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieDfMax_To"), ".") ;
      AV54TFMetPieDfFase = httpContext.GetPar( "TFMetPieDfFase") ;
      AV55TFMetPieDfFase_Sel = httpContext.GetPar( "TFMetPieDfFase_Sel") ;
      AV84Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod") ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod") ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = (int)(GXutil.lval( httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod"))) ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo"))) ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar") ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1GX2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " METPID", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV12MetPieCod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV21FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV58GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV59GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV56DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7EmprCod", GXutil.rtrim( wcpOAV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8MetTerCod", GXutil.rtrim( wcpOAV8MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarCodPar", GXutil.rtrim( wcpOAV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12MetPieCod", GXutil.rtrim( wcpOAV12MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMETTERCOD", GXutil.rtrim( AV8MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMETPIECOD", GXutil.rtrim( AV12MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFLIN", GXutil.ltrim( localUtil.ntoc( AV44TFMetPieDfLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFLIN_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMetPieDfLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFID", GXutil.ltrim( localUtil.ntoc( AV46TFMetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFID_TO", GXutil.ltrim( localUtil.ntoc( AV47TFMetPieDfID_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFDC", GXutil.rtrim( AV48TFMetPieDfDc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFDC_SEL", GXutil.rtrim( AV49TFMetPieDfDc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFMIN", GXutil.ltrim( localUtil.ntoc( AV50TFMetPieDfMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFMIN_TO", GXutil.ltrim( localUtil.ntoc( AV51TFMetPieDfMin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFMAX", GXutil.ltrim( localUtil.ntoc( AV52TFMetPieDfMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFMAX_TO", GXutil.ltrim( localUtil.ntoc( AV53TFMetPieDfMax_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFFASE", GXutil.rtrim( AV54TFMetPieDfFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFFASE_SEL", GXutil.rtrim( AV55TFMetPieDfFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV84Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD", GXutil.rtrim( AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD", GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD", GXutil.ltrim( localUtil.ntoc( AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR", GXutil.rtrim( AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD", GXutil.rtrim( AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1GX2( )
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
      return "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " METPID", "") ;
   }

   public void wb1GX0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_Defectos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111gx1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_Defectos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_Defectos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_Defectos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1GX2( true) ;
      }
      else
      {
         wb_table1_25_1GX2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1GX2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start1GX2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " METPID", ""), (short)(0)) ;
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
            strup1GX0( ) ;
         }
      }
   }

   public void ws1GX2( )
   {
      start1GX2( ) ;
      evt1GX2( ) ;
   }

   public void evt1GX2( )
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
                              strup1GX0( ) ;
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
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181GX2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GX0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
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
                              strup1GX0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           A12995MetPieDfLi = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12997MetPieDfDc = httpContext.cgiGet( edtMetPieDfDc_Internalname) ;
                           n12997MetPieDfDc = false ;
                           A12998MetPieDfMi = localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)) ;
                           A12999MetPieDfMa = localUtil.ctond( httpContext.cgiGet( edtMetPieDfMa_Internalname)) ;
                           A13000MetPieDfFa = httpContext.cgiGet( edtMetPieDfFa_Internalname) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191GX2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201GX2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211GX2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup1GX0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1GX2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1GX2( ) ;
         }
      }
   }

   public void pa1GX2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV21FilterFullText ,
                                 String AV7EmprCod ,
                                 String AV8MetTerCod ,
                                 int AV9BarCod ,
                                 byte AV10BarCodReo ,
                                 String AV11BarCodPar ,
                                 String AV12MetPieCod ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 short AV44TFMetPieDfLin ,
                                 short AV45TFMetPieDfLin_To ,
                                 short AV46TFMetPieDfID ,
                                 short AV47TFMetPieDfID_To ,
                                 String AV48TFMetPieDfDc ,
                                 String AV49TFMetPieDfDc_Sel ,
                                 java.math.BigDecimal AV50TFMetPieDfMin ,
                                 java.math.BigDecimal AV51TFMetPieDfMin_To ,
                                 java.math.BigDecimal AV52TFMetPieDfMax ,
                                 java.math.BigDecimal AV53TFMetPieDfMax_To ,
                                 String AV54TFMetPieDfFase ,
                                 String AV55TFMetPieDfFase_Sel ,
                                 String AV84Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                 String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                 int AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                 byte AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                 String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                 String AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201GX2 ();
      GRID_nCurrentRecord = 0 ;
      rf1GX2( ) ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1GX2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV84Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf1GX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201GX2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                              Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                              Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                              Short.valueOf(AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                              Short.valueOf(AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                              AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                              AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                              AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                              AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                              AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                              AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                              AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                              AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                              Short.valueOf(A12995MetPieDfLi) ,
                                              Short.valueOf(A12996MetPieDfID) ,
                                              A12997MetPieDfDc ,
                                              A12998MetPieDfMi ,
                                              A12999MetPieDfMa ,
                                              A13000MetPieDfFa ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              A396EmprCod ,
                                              AV7EmprCod ,
                                              A2809MetTerCod ,
                                              AV8MetTerCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV9BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV10BarCodReo) ,
                                              A130BarCodPar ,
                                              AV11BarCodPar ,
                                              A2813MetPieCod ,
                                              AV12MetPieCod ,
                                              AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                              AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                              Integer.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                              Byte.valueOf(AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                              AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                              AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
         lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
         lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
         /* Using cursor H01GX2 */
         pr_default.execute(0, new Object[] {AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV7EmprCod, AV8MetTerCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV12MetPieCod, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13000MetPieDfFa = H01GX2_A13000MetPieDfFa[0] ;
            A12999MetPieDfMa = H01GX2_A12999MetPieDfMa[0] ;
            A12998MetPieDfMi = H01GX2_A12998MetPieDfMi[0] ;
            A12997MetPieDfDc = H01GX2_A12997MetPieDfDc[0] ;
            n12997MetPieDfDc = H01GX2_n12997MetPieDfDc[0] ;
            A12996MetPieDfID = H01GX2_A12996MetPieDfID[0] ;
            A12995MetPieDfLi = H01GX2_A12995MetPieDfLi[0] ;
            A2813MetPieCod = H01GX2_A2813MetPieCod[0] ;
            A130BarCodPar = H01GX2_A130BarCodPar[0] ;
            A132BarCodReo = H01GX2_A132BarCodReo[0] ;
            A129BarCod = H01GX2_A129BarCod[0] ;
            A2809MetTerCod = H01GX2_A2809MetTerCod[0] ;
            A396EmprCod = H01GX2_A396EmprCod[0] ;
            A12997MetPieDfDc = H01GX2_A12997MetPieDfDc[0] ;
            n12997MetPieDfDc = H01GX2_n12997MetPieDfDc[0] ;
            e211GX2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb1GX0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1GX2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV84Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV84Pgmname, ""))));
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
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           A396EmprCod ,
                                           AV7EmprCod ,
                                           A2809MetTerCod ,
                                           AV8MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV9BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV10BarCodReo) ,
                                           A130BarCodPar ,
                                           AV11BarCodPar ,
                                           A2813MetPieCod ,
                                           AV12MetPieCod ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor H01GX3 */
      pr_default.execute(1, new Object[] {AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV7EmprCod, AV8MetTerCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV12MetPieCod, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      GRID_nRecordCount = H01GX3_AGRID_nRecordCount[0] ;
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
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV7EmprCod, AV8MetTerCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12MetPieCod, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV44TFMetPieDfLin, AV45TFMetPieDfLin_To, AV46TFMetPieDfID, AV47TFMetPieDfID_To, AV48TFMetPieDfDc, AV49TFMetPieDfDc_Sel, AV50TFMetPieDfMin, AV51TFMetPieDfMin_To, AV52TFMetPieDfMax, AV53TFMetPieDfMax_To, AV54TFMetPieDfFase, AV55TFMetPieDfFase_Sel, AV84Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV84Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1GX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191GX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV29ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV56DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV59GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
         wcpOAV8MetTerCod = httpContext.cgiGet( sPrefix+"wcpOAV8MetTerCod") ;
         wcpOAV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV11BarCodPar") ;
         wcpOAV12MetPieCod = httpContext.cgiGet( sPrefix+"wcpOAV12MetPieCod") ;
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
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV21FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
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
      e191GX2 ();
      if (returnInSub) return;
   }

   public void e191GX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV62Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV63Emprnom ;
      GXv_char4[0] = AV64Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.AV7EmprCod = GXv_char2[0] ;
      webcontador_metrajepiezas_defectos_wc_impl.this.AV63Emprnom = GXv_char3[0] ;
      webcontador_metrajepiezas_defectos_wc_impl.this.AV64Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      subGrid_Rows = 10 ;
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
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
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
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201GX2( )
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
      if ( AV31ManageFiltersExecutionStep == 1 )
      {
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV31ManageFiltersExecutionStep == 2 )
      {
         AV31ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMetPieDfLi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMetPieDfID_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMetPieDfDc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfDc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfDc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMetPieDfMi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfMi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMi_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMetPieDfMa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfMa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMa_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMetPieDfFa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfFa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfFa_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV58GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridCurrentPage), 10, 0));
      AV59GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridPageCount), 10, 0));
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV7EmprCod ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV8MetTerCod ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV9BarCod ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV10BarCodReo ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV11BarCodPar ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV12MetPieCod ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV21FilterFullText ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV44TFMetPieDfLin ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV45TFMetPieDfLin_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV46TFMetPieDfID ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV47TFMetPieDfID_To ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV48TFMetPieDfDc ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV49TFMetPieDfDc_Sel ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV50TFMetPieDfMin ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV51TFMetPieDfMin_To ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV52TFMetPieDfMax ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV53TFMetPieDfMax_To ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV54TFMetPieDfFase ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV55TFMetPieDfFase_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e131GX2( )
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

   public void e141GX2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151GX2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfLin") == 0 )
         {
            AV44TFMetPieDfLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieDfLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMetPieDfLin), 4, 0));
            AV45TFMetPieDfLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieDfLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMetPieDfLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfID") == 0 )
         {
            AV46TFMetPieDfID = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMetPieDfID), 4, 0));
            AV47TFMetPieDfID_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieDfID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMetPieDfID_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfDc") == 0 )
         {
            AV48TFMetPieDfDc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieDfDc", AV48TFMetPieDfDc);
            AV49TFMetPieDfDc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieDfDc_Sel", AV49TFMetPieDfDc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfMin") == 0 )
         {
            AV50TFMetPieDfMin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMetPieDfMin", GXutil.ltrimstr( AV50TFMetPieDfMin, 9, 2));
            AV51TFMetPieDfMin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMetPieDfMin_To", GXutil.ltrimstr( AV51TFMetPieDfMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfMax") == 0 )
         {
            AV52TFMetPieDfMax = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMetPieDfMax", GXutil.ltrimstr( AV52TFMetPieDfMax, 9, 2));
            AV53TFMetPieDfMax_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMetPieDfMax_To", GXutil.ltrimstr( AV53TFMetPieDfMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfFase") == 0 )
         {
            AV54TFMetPieDfFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMetPieDfFase", AV54TFMetPieDfFase);
            AV55TFMetPieDfFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMetPieDfFase_Sel", AV55TFMetPieDfFase_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211GX2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtMetPieDfDc_Link = formatLink("app.ficherosbasicos.ttipdefview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A12996MetPieDfID,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipDefCod","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e161GX2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e121GX2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV84Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV30ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV30ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV30ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV30ManageFiltersXml) ;
            AV16GridState.fromxml(AV30ManageFiltersXml, null, null);
            AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
            AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
   }

   public void e171GX2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      webcontador_metrajepiezas_defectos_wc_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   public void e181GX2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfLin", "", "Linea", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfID", "", "Defecto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfDc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfMin", "", "Metros Iniciales", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfMax", "", "Metros Finales", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfFase", "", "Fase", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV25UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector", GXv_char4) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV29ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV29ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV21FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
      AV44TFMetPieDfLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieDfLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMetPieDfLin), 4, 0));
      AV45TFMetPieDfLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieDfLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMetPieDfLin_To), 4, 0));
      AV46TFMetPieDfID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMetPieDfID), 4, 0));
      AV47TFMetPieDfID_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieDfID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMetPieDfID_To), 4, 0));
      AV48TFMetPieDfDc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieDfDc", AV48TFMetPieDfDc);
      AV49TFMetPieDfDc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieDfDc_Sel", AV49TFMetPieDfDc_Sel);
      AV50TFMetPieDfMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMetPieDfMin", GXutil.ltrimstr( AV50TFMetPieDfMin, 9, 2));
      AV51TFMetPieDfMin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMetPieDfMin_To", GXutil.ltrimstr( AV51TFMetPieDfMin_To, 9, 2));
      AV52TFMetPieDfMax = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMetPieDfMax", GXutil.ltrimstr( AV52TFMetPieDfMax, 9, 2));
      AV53TFMetPieDfMax_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMetPieDfMax_To", GXutil.ltrimstr( AV53TFMetPieDfMax_To, 9, 2));
      AV54TFMetPieDfFase = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMetPieDfFase", AV54TFMetPieDfFase);
      AV55TFMetPieDfFase_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMetPieDfFase_Sel", AV55TFMetPieDfFase_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV84Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV84Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV28Session.getValue(AV84Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFLIN") == 0 )
         {
            AV44TFMetPieDfLin = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieDfLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFMetPieDfLin), 4, 0));
            AV45TFMetPieDfLin_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieDfLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFMetPieDfLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFID") == 0 )
         {
            AV46TFMetPieDfID = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieDfID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFMetPieDfID), 4, 0));
            AV47TFMetPieDfID_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieDfID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFMetPieDfID_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC") == 0 )
         {
            AV48TFMetPieDfDc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieDfDc", AV48TFMetPieDfDc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC_SEL") == 0 )
         {
            AV49TFMetPieDfDc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieDfDc_Sel", AV49TFMetPieDfDc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMIN") == 0 )
         {
            AV50TFMetPieDfMin = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFMetPieDfMin", GXutil.ltrimstr( AV50TFMetPieDfMin, 9, 2));
            AV51TFMetPieDfMin_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFMetPieDfMin_To", GXutil.ltrimstr( AV51TFMetPieDfMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMAX") == 0 )
         {
            AV52TFMetPieDfMax = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMetPieDfMax", GXutil.ltrimstr( AV52TFMetPieDfMax, 9, 2));
            AV53TFMetPieDfMax_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMetPieDfMax_To", GXutil.ltrimstr( AV53TFMetPieDfMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE") == 0 )
         {
            AV54TFMetPieDfFase = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMetPieDfFase", AV54TFMetPieDfFase);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE_SEL") == 0 )
         {
            AV55TFMetPieDfFase_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFMetPieDfFase_Sel", AV55TFMetPieDfFase_Sel);
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMetPieDfDc_Sel)==0), AV49TFMetPieDfDc_Sel, GXv_char4) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFMetPieDfFase_Sel)==0), AV55TFMetPieDfFase_Sel, GXv_char3) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMetPieDfDc)==0), AV48TFMetPieDfDc, GXv_char4) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFMetPieDfFase)==0), AV54TFMetPieDfFase, GXv_char3) ;
      webcontador_metrajepiezas_defectos_wc_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV44TFMetPieDfLin) ? "" : GXutil.str( AV44TFMetPieDfLin, 4, 0))+"|"+((0==AV46TFMetPieDfID) ? "" : GXutil.str( AV46TFMetPieDfID, 4, 0))+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMetPieDfMin)==0) ? "" : GXutil.str( AV50TFMetPieDfMin, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMetPieDfMax)==0) ? "" : GXutil.str( AV52TFMetPieDfMax, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV45TFMetPieDfLin_To) ? "" : GXutil.str( AV45TFMetPieDfLin_To, 4, 0))+"|"+((0==AV47TFMetPieDfID_To) ? "" : GXutil.str( AV47TFMetPieDfID_To, 4, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMetPieDfMin_To)==0) ? "" : GXutil.str( AV51TFMetPieDfMin_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMetPieDfMax_To)==0) ? "" : GXutil.str( AV53TFMetPieDfMax_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV28Session.getValue(AV84Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV21FilterFullText)==0), (short)(0), AV21FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFLIN", "", !((0==AV44TFMetPieDfLin)&&(0==AV45TFMetPieDfLin_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFMetPieDfLin, 4, 0)), GXutil.trim( GXutil.str( AV45TFMetPieDfLin_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFID", "", !((0==AV46TFMetPieDfID)&&(0==AV47TFMetPieDfID_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFMetPieDfID, 4, 0)), GXutil.trim( GXutil.str( AV47TFMetPieDfID_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFDC", "", !(GXutil.strcmp("", AV48TFMetPieDfDc)==0), (short)(0), AV48TFMetPieDfDc, "", !(GXutil.strcmp("", AV49TFMetPieDfDc_Sel)==0), AV49TFMetPieDfDc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFMIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFMetPieDfMin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFMetPieDfMin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFMetPieDfMin, 9, 2)), GXutil.trim( GXutil.str( AV51TFMetPieDfMin_To, 9, 2))) ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFMAX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFMetPieDfMax)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFMetPieDfMax_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFMetPieDfMax, 9, 2)), GXutil.trim( GXutil.str( AV53TFMetPieDfMax_To, 9, 2))) ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFMETPIEDFFASE", "", !(GXutil.strcmp("", AV54TFMetPieDfFase)==0), (short)(0), AV54TFMetPieDfFase, "", !(GXutil.strcmp("", AV55TFMetPieDfFase_Sel)==0), AV55TFMetPieDfFase_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7EmprCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8MetTerCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&METTERCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8MetTerCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9BarCod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9BarCod, 8, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV10BarCodReo) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10BarCodReo, 1, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV11BarCodPar)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11BarCodPar );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV12MetPieCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&METPIECOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV12MetPieCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV84Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV84Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ExpedicionesAutomatizadas.METPID" );
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV7EmprCod );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MetTerCod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV8MetTerCod );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV9BarCod, 8, 0) );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV10BarCodReo, 1, 0) );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV11BarCodPar );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MetPieCod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV12MetPieCod );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV28Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_1GX2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV29ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_1GX2( true) ;
      }
      else
      {
         wb_table2_30_1GX2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_1GX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1GX2e( true) ;
      }
      else
      {
         wb_table1_25_1GX2e( false) ;
      }
   }

   public void wb_table2_30_1GX2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV21FilterFullText, GXutil.rtrim( localUtil.format( AV21FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_Defectos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_1GX2e( true) ;
      }
      else
      {
         wb_table2_30_1GX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      AV8MetTerCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MetTerCod", AV8MetTerCod);
      AV9BarCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      AV11BarCodPar = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodPar", AV11BarCodPar);
      AV12MetPieCod = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MetPieCod", AV12MetPieCod);
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
      pa1GX2( ) ;
      ws1GX2( ) ;
      we1GX2( ) ;
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
      sCtrlAV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8MetTerCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9BarCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10BarCodReo = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11BarCodPar = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV12MetPieCod = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1GX2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "expedicionesautomatizadas\\webcontador_metrajepiezas_defectos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1GX2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
         AV8MetTerCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MetTerCod", AV8MetTerCod);
         AV9BarCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         AV10BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
         AV11BarCodPar = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodPar", AV11BarCodPar);
         AV12MetPieCod = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MetPieCod", AV12MetPieCod);
      }
      wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
      wcpOAV8MetTerCod = httpContext.cgiGet( sPrefix+"wcpOAV8MetTerCod") ;
      wcpOAV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV11BarCodPar") ;
      wcpOAV12MetPieCod = httpContext.cgiGet( sPrefix+"wcpOAV12MetPieCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7EmprCod, wcpOAV7EmprCod) != 0 ) || ( GXutil.strcmp(AV8MetTerCod, wcpOAV8MetTerCod) != 0 ) || ( AV9BarCod != wcpOAV9BarCod ) || ( AV10BarCodReo != wcpOAV10BarCodReo ) || ( GXutil.strcmp(AV11BarCodPar, wcpOAV11BarCodPar) != 0 ) || ( GXutil.strcmp(AV12MetPieCod, wcpOAV12MetPieCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7EmprCod = AV7EmprCod ;
      wcpOAV8MetTerCod = AV8MetTerCod ;
      wcpOAV9BarCod = AV9BarCod ;
      wcpOAV10BarCodReo = AV10BarCodReo ;
      wcpOAV11BarCodPar = AV11BarCodPar ;
      wcpOAV12MetPieCod = AV12MetPieCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV7EmprCod) > 0 )
      {
         AV7EmprCod = httpContext.cgiGet( sCtrlAV7EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      }
      else
      {
         AV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_PARM") ;
      }
      sCtrlAV8MetTerCod = httpContext.cgiGet( sPrefix+"AV8MetTerCod_CTRL") ;
      if ( GXutil.len( sCtrlAV8MetTerCod) > 0 )
      {
         AV8MetTerCod = httpContext.cgiGet( sCtrlAV8MetTerCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8MetTerCod", AV8MetTerCod);
      }
      else
      {
         AV8MetTerCod = httpContext.cgiGet( sPrefix+"AV8MetTerCod_PARM") ;
      }
      sCtrlAV9BarCod = httpContext.cgiGet( sPrefix+"AV9BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarCod) > 0 )
      {
         AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      }
      else
      {
         AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10BarCodReo = httpContext.cgiGet( sPrefix+"AV10BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarCodReo) > 0 )
      {
         AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
      }
      else
      {
         AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarCodPar = httpContext.cgiGet( sPrefix+"AV11BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarCodPar) > 0 )
      {
         AV11BarCodPar = httpContext.cgiGet( sCtrlAV11BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarCodPar", AV11BarCodPar);
      }
      else
      {
         AV11BarCodPar = httpContext.cgiGet( sPrefix+"AV11BarCodPar_PARM") ;
      }
      sCtrlAV12MetPieCod = httpContext.cgiGet( sPrefix+"AV12MetPieCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12MetPieCod) > 0 )
      {
         AV12MetPieCod = httpContext.cgiGet( sCtrlAV12MetPieCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12MetPieCod", AV12MetPieCod);
      }
      else
      {
         AV12MetPieCod = httpContext.cgiGet( sPrefix+"AV12MetPieCod_PARM") ;
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
      pa1GX2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1GX2( ) ;
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
      ws1GX2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_PARM", GXutil.rtrim( AV7EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_CTRL", GXutil.rtrim( sCtrlAV7EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MetTerCod_PARM", GXutil.rtrim( AV8MetTerCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8MetTerCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8MetTerCod_CTRL", GXutil.rtrim( sCtrlAV8MetTerCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarCod_CTRL", GXutil.rtrim( sCtrlAV9BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarCodReo_CTRL", GXutil.rtrim( sCtrlAV10BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodPar_PARM", GXutil.rtrim( AV11BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarCodPar_CTRL", GXutil.rtrim( sCtrlAV11BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12MetPieCod_PARM", GXutil.rtrim( AV12MetPieCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12MetPieCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12MetPieCod_CTRL", GXutil.rtrim( sCtrlAV12MetPieCod));
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
      we1GX2( ) ;
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
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691336", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webcontador_metrajepiezas_defectos_wc.js", "?20268211691336", false, true);
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

   public void subsflControlProps_432( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_idx ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_43_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_43_idx ;
      edtMetPieDfLi_Internalname = sPrefix+"METPIEDFLI_"+sGXsfl_43_idx ;
      edtMetPieDfID_Internalname = sPrefix+"METPIEDFID_"+sGXsfl_43_idx ;
      edtMetPieDfDc_Internalname = sPrefix+"METPIEDFDC_"+sGXsfl_43_idx ;
      edtMetPieDfMi_Internalname = sPrefix+"METPIEDFMI_"+sGXsfl_43_idx ;
      edtMetPieDfMa_Internalname = sPrefix+"METPIEDFMA_"+sGXsfl_43_idx ;
      edtMetPieDfFa_Internalname = sPrefix+"METPIEDFFA_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_fel_idx ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_43_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_fel_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_43_fel_idx ;
      edtMetPieDfLi_Internalname = sPrefix+"METPIEDFLI_"+sGXsfl_43_fel_idx ;
      edtMetPieDfID_Internalname = sPrefix+"METPIEDFID_"+sGXsfl_43_fel_idx ;
      edtMetPieDfDc_Internalname = sPrefix+"METPIEDFDC_"+sGXsfl_43_fel_idx ;
      edtMetPieDfMi_Internalname = sPrefix+"METPIEDFMI_"+sGXsfl_43_fel_idx ;
      edtMetPieDfMa_Internalname = sPrefix+"METPIEDFMA_"+sGXsfl_43_fel_idx ;
      edtMetPieDfFa_Internalname = sPrefix+"METPIEDFFA_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1GX0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieDfLi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfLi_Internalname,GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12995MetPieDfLi), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfLi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieDfID_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfID_Internalname,GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12996MetPieDfID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfID_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetPieDfDc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfDc_Internalname,GXutil.rtrim( A12997MetPieDfDc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtMetPieDfDc_Link,"","","",edtMetPieDfDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfDc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieDfMi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfMi_Internalname,GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfMi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieDfMa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfMa_Internalname,GXutil.ltrim( localUtil.ntoc( A12999MetPieDfMa, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12999MetPieDfMa, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfMa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfMa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetPieDfFa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfFa_Internalname,GXutil.rtrim( A13000MetPieDfFa),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfFa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieDfFa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1GX2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfLi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfID_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfDc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfMi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Iniciales", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfMa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Finales", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfFa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfLi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfID_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12997MetPieDfDc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMetPieDfDc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfDc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12999MetPieDfMa, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13000MetPieDfFa));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfFa_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD" ;
      edtMetPieDfLi_Internalname = sPrefix+"METPIEDFLI" ;
      edtMetPieDfID_Internalname = sPrefix+"METPIEDFID" ;
      edtMetPieDfDc_Internalname = sPrefix+"METPIEDFDC" ;
      edtMetPieDfMi_Internalname = sPrefix+"METPIEDFMI" ;
      edtMetPieDfMa_Internalname = sPrefix+"METPIEDFMA" ;
      edtMetPieDfFa_Internalname = sPrefix+"METPIEDFFA" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtMetPieDfFa_Jsonclick = "" ;
      edtMetPieDfMa_Jsonclick = "" ;
      edtMetPieDfMi_Jsonclick = "" ;
      edtMetPieDfDc_Jsonclick = "" ;
      edtMetPieDfDc_Link = "" ;
      edtMetPieDfID_Jsonclick = "" ;
      edtMetPieDfLi_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtMetTerCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtMetPieDfFa_Visible = -1 ;
      edtMetPieDfMa_Visible = -1 ;
      edtMetPieDfMi_Visible = -1 ;
      edtMetPieDfDc_Visible = -1 ;
      edtMetPieDfID_Visible = -1 ;
      edtMetPieDfLi_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      Ddo_grid_Datalistproc = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|||T" ;
      Ddo_grid_Filterisrange = "T|T||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|1" ;
      Ddo_grid_Columnids = "6:MetPieDfLin|7:MetPieDfID|8:MetPieDfDc|9:MetPieDfMin|10:MetPieDfMax|11:MetPieDfFase" ;
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
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetPieDfLi_Visible',ctrl:'METPIEDFLI',prop:'Visible'},{av:'edtMetPieDfID_Visible',ctrl:'METPIEDFID',prop:'Visible'},{av:'edtMetPieDfDc_Visible',ctrl:'METPIEDFDC',prop:'Visible'},{av:'edtMetPieDfMi_Visible',ctrl:'METPIEDFMI',prop:'Visible'},{av:'edtMetPieDfMa_Visible',ctrl:'METPIEDFMA',prop:'Visible'},{av:'edtMetPieDfFa_Visible',ctrl:'METPIEDFFA',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131GX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141GX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151GX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211GX2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12996MetPieDfID',fld:'METPIEDFID',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtMetPieDfDc_Link',ctrl:'METPIEDFDC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161GX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMetPieDfLi_Visible',ctrl:'METPIEDFLI',prop:'Visible'},{av:'edtMetPieDfID_Visible',ctrl:'METPIEDFID',prop:'Visible'},{av:'edtMetPieDfDc_Visible',ctrl:'METPIEDFDC',prop:'Visible'},{av:'edtMetPieDfMi_Visible',ctrl:'METPIEDFMI',prop:'Visible'},{av:'edtMetPieDfMa_Visible',ctrl:'METPIEDFMA',prop:'Visible'},{av:'edtMetPieDfFa_Visible',ctrl:'METPIEDFFA',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121GX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8MetTerCod',fld:'vMETTERCOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV12MetPieCod',fld:'vMETPIECOD',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'AV84Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_2_METTERCOD',pic:''},{av:'AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_3_BARCOD',pic:'ZZZZZZZ9'},{av:'AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_4_BARCODREO',pic:'9'},{av:'AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_5_BARCODPAR',pic:''},{av:'AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_DEFECTOS_WCDS_6_METPIECOD',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFMetPieDfLin',fld:'vTFMETPIEDFLIN',pic:'ZZZ9'},{av:'AV45TFMetPieDfLin_To',fld:'vTFMETPIEDFLIN_TO',pic:'ZZZ9'},{av:'AV46TFMetPieDfID',fld:'vTFMETPIEDFID',pic:'ZZZ9'},{av:'AV47TFMetPieDfID_To',fld:'vTFMETPIEDFID_TO',pic:'ZZZ9'},{av:'AV48TFMetPieDfDc',fld:'vTFMETPIEDFDC',pic:''},{av:'AV49TFMetPieDfDc_Sel',fld:'vTFMETPIEDFDC_SEL',pic:''},{av:'AV50TFMetPieDfMin',fld:'vTFMETPIEDFMIN',pic:'ZZZZZ9.99'},{av:'AV51TFMetPieDfMin_To',fld:'vTFMETPIEDFMIN_TO',pic:'ZZZZZ9.99'},{av:'AV52TFMetPieDfMax',fld:'vTFMETPIEDFMAX',pic:'ZZZZZ9.99'},{av:'AV53TFMetPieDfMax_To',fld:'vTFMETPIEDFMAX_TO',pic:'ZZZZZ9.99'},{av:'AV54TFMetPieDfFase',fld:'vTFMETPIEDFFASE',pic:''},{av:'AV55TFMetPieDfFase_Sel',fld:'vTFMETPIEDFFASE_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetPieDfLi_Visible',ctrl:'METPIEDFLI',prop:'Visible'},{av:'edtMetPieDfID_Visible',ctrl:'METPIEDFID',prop:'Visible'},{av:'edtMetPieDfDc_Visible',ctrl:'METPIEDFDC',prop:'Visible'},{av:'edtMetPieDfMi_Visible',ctrl:'METPIEDFMI',prop:'Visible'},{av:'edtMetPieDfMa_Visible',ctrl:'METPIEDFMA',prop:'Visible'},{av:'edtMetPieDfFa_Visible',ctrl:'METPIEDFFA',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171GX2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111GX1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181GX2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METPIEDFID","{handler:'valid_Metpiedfid',iparms:[]");
      setEventMetadata("VALID_METPIEDFID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metpiedffa',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV8MetTerCod = "" ;
      wcpOAV11BarCodPar = "" ;
      wcpOAV12MetPieCod = "" ;
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
      sPrefix = "" ;
      AV7EmprCod = "" ;
      AV8MetTerCod = "" ;
      AV11BarCodPar = "" ;
      AV12MetPieCod = "" ;
      AV21FilterFullText = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV48TFMetPieDfDc = "" ;
      AV49TFMetPieDfDc_Sel = "" ;
      AV50TFMetPieDfMin = DecimalUtil.ZERO ;
      AV51TFMetPieDfMin_To = DecimalUtil.ZERO ;
      AV52TFMetPieDfMax = DecimalUtil.ZERO ;
      AV53TFMetPieDfMax_To = DecimalUtil.ZERO ;
      AV54TFMetPieDfFase = "" ;
      AV55TFMetPieDfFase_Sel = "" ;
      AV84Pgmname = "" ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = "" ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = "" ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = "" ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV29ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV56DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      scmdbuf = "" ;
      lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = "" ;
      AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = DecimalUtil.ZERO ;
      AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = DecimalUtil.ZERO ;
      AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = DecimalUtil.ZERO ;
      AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = DecimalUtil.ZERO ;
      AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = "" ;
      AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      H01GX2_A13000MetPieDfFa = new String[] {""} ;
      H01GX2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GX2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GX2_A12997MetPieDfDc = new String[] {""} ;
      H01GX2_n12997MetPieDfDc = new boolean[] {false} ;
      H01GX2_A12996MetPieDfID = new short[1] ;
      H01GX2_A12995MetPieDfLi = new short[1] ;
      H01GX2_A2813MetPieCod = new String[] {""} ;
      H01GX2_A130BarCodPar = new String[] {""} ;
      H01GX2_A132BarCodReo = new byte[1] ;
      H01GX2_A129BarCod = new int[1] ;
      H01GX2_A2809MetTerCod = new String[] {""} ;
      H01GX2_A396EmprCod = new String[] {""} ;
      H01GX3_AGRID_nRecordCount = new long[1] ;
      AV62Station = "" ;
      GXv_char2 = new String[1] ;
      AV63Emprnom = "" ;
      AV64Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7EmprCod = "" ;
      sCtrlAV8MetTerCod = "" ;
      sCtrlAV9BarCod = "" ;
      sCtrlAV10BarCodReo = "" ;
      sCtrlAV11BarCodPar = "" ;
      sCtrlAV12MetPieCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wc__default(),
         new Object[] {
             new Object[] {
            H01GX2_A13000MetPieDfFa, H01GX2_A12999MetPieDfMa, H01GX2_A12998MetPieDfMi, H01GX2_A12997MetPieDfDc, H01GX2_n12997MetPieDfDc, H01GX2_A12996MetPieDfID, H01GX2_A12995MetPieDfLi, H01GX2_A2813MetPieCod, H01GX2_A130BarCodPar, H01GX2_A132BarCodReo,
            H01GX2_A129BarCod, H01GX2_A2809MetTerCod, H01GX2_A396EmprCod
            }
            , new Object[] {
            H01GX3_AGRID_nRecordCount
            }
         }
      );
      AV84Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WC" ;
      /* GeneXus formulas. */
      AV84Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV10BarCodReo ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
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
   private short AV44TFMetPieDfLin ;
   private short AV45TFMetPieDfLin_To ;
   private short AV46TFMetPieDfID ;
   private short AV47TFMetPieDfID_To ;
   private short AV18OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A12995MetPieDfLi ;
   private short A12996MetPieDfID ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ;
   private short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ;
   private short AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ;
   private short AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ;
   private int wcpOAV9BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV9BarCod ;
   private int nGXsfl_43_idx=1 ;
   private int AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtMetPieDfLi_Visible ;
   private int edtMetPieDfID_Visible ;
   private int edtMetPieDfDc_Visible ;
   private int edtMetPieDfMi_Visible ;
   private int edtMetPieDfMa_Visible ;
   private int edtMetPieDfFa_Visible ;
   private int AV57PageToGo ;
   private int AV85GXV1 ;
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
   private java.math.BigDecimal AV50TFMetPieDfMin ;
   private java.math.BigDecimal AV51TFMetPieDfMin_To ;
   private java.math.BigDecimal AV52TFMetPieDfMax ;
   private java.math.BigDecimal AV53TFMetPieDfMax_To ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private java.math.BigDecimal AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ;
   private java.math.BigDecimal AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ;
   private java.math.BigDecimal AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ;
   private java.math.BigDecimal AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8MetTerCod ;
   private String wcpOAV11BarCodPar ;
   private String wcpOAV12MetPieCod ;
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
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7EmprCod ;
   private String AV8MetTerCod ;
   private String AV11BarCodPar ;
   private String AV12MetPieCod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV48TFMetPieDfDc ;
   private String AV49TFMetPieDfDc_Sel ;
   private String AV54TFMetPieDfFase ;
   private String AV55TFMetPieDfFase_Sel ;
   private String AV84Pgmname ;
   private String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ;
   private String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ;
   private String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ;
   private String AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ;
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
   private String GX_FocusControl ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieDfLi_Internalname ;
   private String edtMetPieDfID_Internalname ;
   private String A12997MetPieDfDc ;
   private String edtMetPieDfDc_Internalname ;
   private String edtMetPieDfMi_Internalname ;
   private String edtMetPieDfMa_Internalname ;
   private String A13000MetPieDfFa ;
   private String edtMetPieDfFa_Internalname ;
   private String scmdbuf ;
   private String lV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String lV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ;
   private String AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ;
   private String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV62Station ;
   private String GXv_char2[] ;
   private String AV63Emprnom ;
   private String AV64Usurcod ;
   private String edtMetPieDfDc_Link ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV7EmprCod ;
   private String sCtrlAV8MetTerCod ;
   private String sCtrlAV9BarCod ;
   private String sCtrlAV10BarCodReo ;
   private String sCtrlAV11BarCodPar ;
   private String sCtrlAV12MetPieCod ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieDfLi_Jsonclick ;
   private String edtMetPieDfID_Jsonclick ;
   private String edtMetPieDfDc_Jsonclick ;
   private String edtMetPieDfMi_Jsonclick ;
   private String edtMetPieDfMa_Jsonclick ;
   private String edtMetPieDfFa_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
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
   private boolean n12997MetPieDfDc ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV24ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV25UserCustomValue ;
   private String AV21FilterFullText ;
   private String lV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01GX2_A13000MetPieDfFa ;
   private java.math.BigDecimal[] H01GX2_A12999MetPieDfMa ;
   private java.math.BigDecimal[] H01GX2_A12998MetPieDfMi ;
   private String[] H01GX2_A12997MetPieDfDc ;
   private boolean[] H01GX2_n12997MetPieDfDc ;
   private short[] H01GX2_A12996MetPieDfID ;
   private short[] H01GX2_A12995MetPieDfLi ;
   private String[] H01GX2_A2813MetPieCod ;
   private String[] H01GX2_A130BarCodPar ;
   private byte[] H01GX2_A132BarCodReo ;
   private int[] H01GX2_A129BarCod ;
   private String[] H01GX2_A2809MetTerCod ;
   private String[] H01GX2_A396EmprCod ;
   private long[] H01GX3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV29ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV56DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webcontador_metrajepiezas_defectos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01GX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV7EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV8MetTerCod ,
                                          int A129BarCod ,
                                          int AV9BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV10BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV11BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV12MetPieCod ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[35];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfID AS MetPieDfID, T1.MetPieDfLi, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      sSelectString += " T1.MetTerCod, T1.EmprCod" ;
      sFromString = " FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfFa DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfLi DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfID DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T2.TipDefDsc" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T2.TipDefDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMi" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMi DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMa" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMa DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H01GX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV7EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV8MetTerCod ,
                                          int A129BarCod ,
                                          int AV9BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV10BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV11BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV12MetPieCod ,
                                          String AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[30];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
         GXv_int16[16] = (byte)(1) ;
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H01GX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_H01GX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01GX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01GX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

