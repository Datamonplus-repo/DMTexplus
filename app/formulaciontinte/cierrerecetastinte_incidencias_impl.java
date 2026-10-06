package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidencias_impl extends GXWebComponent
{
   public cierrerecetastinte_incidencias_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_incidencias_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_incidencias_impl.class ));
   }

   public cierrerecetastinte_incidencias_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV7emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7emprcod", AV7emprcod);
               AV8barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
               AV9barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodreo", GXutil.str( AV9barcodreo, 1, 0));
               AV10barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodpar", AV10barcodpar);
               AV11reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11reclinmaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7emprcod,Integer.valueOf(AV8barcod),Byte.valueOf(AV9barcodreo),AV10barcodpar,Short.valueOf(AV11reclinmaq)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
      nRC_GXsfl_38 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_38"))) ;
      nGXsfl_38_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_38_idx"))) ;
      sGXsfl_38_idx = httpContext.GetPar( "sGXsfl_38_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV7emprcod = httpContext.GetPar( "emprcod") ;
      AV8barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV9barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV10barcodpar = httpContext.GetPar( "barcodpar") ;
      AV11reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
      AV32TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV33TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV34TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV35TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV36TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV37TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV38TFFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon"), ".") ;
      AV39TFFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon_To"), ".") ;
      AV44TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV45TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV46TFPrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC"), ".") ;
      AV47TFPrdExiCC_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC_To"), ".") ;
      AV48TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV49TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV50TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV51TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV86Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV57consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
      AV58todosproductos = (short)(GXutil.lval( httpContext.GetPar( "todosproductos"))) ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod") ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod"))) ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo"))) ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar") ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1LN2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento de Productos (Receta)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cierrerecetastinte_incidencias", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV11reclinmaq,4,0))}, new String[] {"emprcod","barcod","barcodreo","barcodpar","reclinmaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV86Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV57consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODOSPRODUCTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV58todosproductos), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV21FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_38", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_38, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7emprcod", GXutil.rtrim( wcpOAV7emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV9barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10barcodpar", GXutil.rtrim( wcpOAV10barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11reclinmaq", GXutil.ltrim( localUtil.ntoc( wcpOAV11reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV10barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV11reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV32TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV33TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM", GXutil.rtrim( AV34TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDNUM_SEL", GXutil.rtrim( AV35TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC", GXutil.rtrim( AV36TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPRDDSC_SEL", GXutil.rtrim( AV37TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFACCON", GXutil.ltrim( localUtil.ntoc( AV38TFFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV39TFFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV44TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV45TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXICC", GXutil.ltrim( localUtil.ntoc( AV46TFPrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXICC_TO", GXutil.ltrim( localUtil.ntoc( AV47TFPrdExiCC_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV48TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV49TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLOTE", GXutil.rtrim( AV50TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLOTE_SEL", GXutil.rtrim( AV51TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV86Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV86Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV57consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV57consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODOSPRODUCTOS", GXutil.ltrim( localUtil.ntoc( AV58todosproductos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODOSPRODUCTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV58todosproductos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD", GXutil.rtrim( AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR", GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1LN2( )
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
      return "FormulacionTinte.CierreRecetasTinte_Incidencias" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Productos (Receta)", "") ;
   }

   public void wb1LN0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.cierrerecetastinte_incidencias");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1LN2( true) ;
      }
      else
      {
         wb_table1_23_1LN2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1LN2e( boolean wbgen )
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol38( ) ;
      }
      if ( wbEnd == 38 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_38 = (int)(nGXsfl_38_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 38 )
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

   public void start1LN2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Productos (Receta)", ""), (short)(0)) ;
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
            strup1LN0( ) ;
         }
      }
   }

   public void ws1LN2( )
   {
      start1LN2( ) ;
      evt1LN2( ) ;
   }

   public void evt1LN2( )
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
                              strup1LN0( ) ;
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
                              strup1LN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111LN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121LN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131LN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141LN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e151LN2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LN0( ) ;
                           }
                           AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
                           AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
                           AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
                           AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
                           AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
                           AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
                           AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
                           AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
                           AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
                           AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
                           AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
                           AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
                           AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
                           AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
                           AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
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
                              strup1LN0( ) ;
                           }
                           nGXsfl_38_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_382( ) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV61Existencias = localUtil.ctond( httpContext.cgiGet( edtavExistencias_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExistencias_Internalname, GXutil.ltrimstr( AV61Existencias, 12, 4));
                           AV53RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecmar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmar_Internalname, GXutil.str( AV53RecMar, 1, 0));
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
                           AV59PrdCant = localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdcant_Internalname, GXutil.ltrimstr( AV59PrdCant, 11, 3));
                           AV60ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForprddsc_Internalname, AV60ForPrdDsc);
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e161LN2 ();
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
                                       e171LN2 ();
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
                                       e181LN2 ();
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
                                    strup1LN0( ) ;
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

   public void we1LN2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1LN2( ) ;
         }
      }
   }

   public void pa1LN2( )
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
      subsflControlProps_382( ) ;
      while ( nGXsfl_38_idx <= nRC_GXsfl_38 )
      {
         sendrow_382( ) ;
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV21FilterFullText ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV7emprcod ,
                                 int AV8barcod ,
                                 byte AV9barcodreo ,
                                 String AV10barcodpar ,
                                 short AV11reclinmaq ,
                                 short AV32TFRecLin ,
                                 short AV33TFRecLin_To ,
                                 String AV34TFRecPrdNum ,
                                 String AV35TFRecPrdNum_Sel ,
                                 String AV36TFRecPrdDsc ,
                                 String AV37TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV38TFFacCon ,
                                 java.math.BigDecimal AV39TFFacCon_To ,
                                 java.math.BigDecimal AV44TFPrdExiAlm ,
                                 java.math.BigDecimal AV45TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV46TFPrdExiCC ,
                                 java.math.BigDecimal AV47TFPrdExiCC_To ,
                                 java.math.BigDecimal AV48TFPrdCanRes ,
                                 java.math.BigDecimal AV49TFPrdCanRes_To ,
                                 String AV50TFRecLote ,
                                 String AV51TFRecLote_Sel ,
                                 String AV86Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String A396EmprCod ,
                                 short AV57consumos ,
                                 short AV58todosproductos ,
                                 String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                 int AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                 byte AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                 String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                 short AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171LN2 ();
      GRID_nCurrentRecord = 0 ;
      rf1LN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      rf1LN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV86Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias" ;
      Gx_err = (short)(0) ;
      edtavExistencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistencias_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavRecmar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmar_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavPrdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_38_Refreshing);
   }

   public void rf1LN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(38) ;
      /* Execute user event: Refresh */
      e171LN2 ();
      nGXsfl_38_idx = 1 ;
      sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_382( ) ;
      bGXsfl_38_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_382( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                              Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                              Short.valueOf(AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                              AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                              AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                              AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                              AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                              AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                              AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                              AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                              AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                              AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                              AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                              AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                              AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                              AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                              AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A431FacCon ,
                                              A704PrdExiAlm ,
                                              A705PrdExiCC ,
                                              A685PrdCanRes ,
                                              A5725RecLote ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                              Integer.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                              Byte.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                              AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                              Short.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
         lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
         lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
         lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
         /* Using cursor H01LN2 */
         pr_default.execute(0, new Object[] {AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_38_idx = 1 ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A719PrdNum = H01LN2_A719PrdNum[0] ;
            n719PrdNum = H01LN2_n719PrdNum[0] ;
            A707PrdFacCon = H01LN2_A707PrdFacCon[0] ;
            A1797PrdCanAny = H01LN2_A1797PrdCanAny[0] ;
            A686PrdCant = H01LN2_A686PrdCant[0] ;
            A490ForPrdUMe = H01LN2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01LN2_n490ForPrdUMe[0] ;
            A488ForPrdDsc = H01LN2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LN2_n488ForPrdDsc[0] ;
            A1273RecLinPro = H01LN2_A1273RecLinPro[0] ;
            A2804RecLinMaq = H01LN2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01LN2_A130BarCodPar[0] ;
            A132BarCodReo = H01LN2_A132BarCodReo[0] ;
            A129BarCod = H01LN2_A129BarCod[0] ;
            A5725RecLote = H01LN2_A5725RecLote[0] ;
            A685PrdCanRes = H01LN2_A685PrdCanRes[0] ;
            A705PrdExiCC = H01LN2_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01LN2_A704PrdExiAlm[0] ;
            A431FacCon = H01LN2_A431FacCon[0] ;
            A875RecPrdDsc = H01LN2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01LN2_A872RecPrdNum[0] ;
            A811RecLin = H01LN2_A811RecLin[0] ;
            A707PrdFacCon = H01LN2_A707PrdFacCon[0] ;
            A685PrdCanRes = H01LN2_A685PrdCanRes[0] ;
            A705PrdExiCC = H01LN2_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01LN2_A704PrdExiAlm[0] ;
            A488ForPrdDsc = H01LN2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01LN2_n488ForPrdDsc[0] ;
            e181LN2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(38) ;
         wb1LN0( ) ;
      }
      bGXsfl_38_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1LN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV86Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV86Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD"+"_"+sGXsfl_38_idx, getSecureSignedToken( sPrefix+sGXsfl_38_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV57consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV57consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODOSPRODUCTOS", GXutil.ltrim( localUtil.ntoc( AV58todosproductos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODOSPRODUCTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV58todosproductos), "ZZZ9")));
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
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                           Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) ,
                                           Short.valueOf(AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) ,
                                           AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                           AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                           AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                           AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                           AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                           AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                           AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                           AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                           AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                           AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                           Integer.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod) ,
                                           Byte.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo) ,
                                           AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                           Short.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext), "%", "") ;
      lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum), 6, "%") ;
      lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc), 26, "%") ;
      lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote), 26, "%") ;
      /* Using cursor H01LN3 */
      pr_default.execute(1, new Object[] {AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, Integer.valueOf(AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod), Byte.valueOf(AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo), AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, Short.valueOf(AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq), lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext, Short.valueOf(AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin), Short.valueOf(AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to), lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum, AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel, lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc, AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm, AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to, lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote, AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel});
      GRID_nRecordCount = H01LN3_AGRID_nRecordCount[0] ;
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
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV7emprcod, AV8barcod, AV9barcodreo, AV10barcodpar, AV11reclinmaq, AV32TFRecLin, AV33TFRecLin_To, AV34TFRecPrdNum, AV35TFRecPrdNum_Sel, AV36TFRecPrdDsc, AV37TFRecPrdDsc_Sel, AV38TFFacCon, AV39TFFacCon_To, AV44TFPrdExiAlm, AV45TFPrdExiAlm_To, AV46TFPrdExiCC, AV47TFPrdExiCC_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV50TFRecLote, AV51TFRecLote_Sel, AV86Pgmname, AV18OrderedBy, AV19OrderedDsc, A396EmprCod, AV57consumos, AV58todosproductos, AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod, AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod, AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo, AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar, AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV86Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias" ;
      Gx_err = (short)(0) ;
      edtavExistencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistencias_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavRecmar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmar_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavPrdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1LN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161LN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV29ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_38 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_38"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7emprcod") ;
         wcpOAV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV10barcodpar") ;
         wcpOAV11reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11reclinmaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      e161LN2 ();
      if (returnInSub) return;
   }

   public void e161LN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_incidencias_impl.this.A396EmprCod = GXv_char2[0] ;
      cierrerecetastinte_incidencias_impl.this.AV55EmprNom = GXv_char3[0] ;
      cierrerecetastinte_incidencias_impl.this.AV56UsurCod = GXv_char4[0] ;
      GXt_int5 = AV57consumos ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = "011100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      cierrerecetastinte_incidencias_impl.this.A396EmprCod = GXv_char4[0] ;
      cierrerecetastinte_incidencias_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57consumos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57consumos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONSUMOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV57consumos), "ZZZ9")));
      GXt_int7 = (byte)(AV58todosproductos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALLCP0", ""), GXv_int8) ;
      cierrerecetastinte_incidencias_impl.this.GXt_int7 = GXv_int8[0] ;
      AV58todosproductos = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58todosproductos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58todosproductos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODOSPRODUCTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV58todosproductos), "ZZZ9")));
      GXt_char1 = AV54Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54Station = GXt_char1 ;
      GXv_char4[0] = AV7emprcod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char2[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char4, GXv_char3, GXv_char2) ;
      cierrerecetastinte_incidencias_impl.this.AV7emprcod = GXv_char4[0] ;
      cierrerecetastinte_incidencias_impl.this.AV55EmprNom = GXv_char3[0] ;
      cierrerecetastinte_incidencias_impl.this.AV56UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7emprcod", AV7emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e171LN2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
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
      if ( GXutil.strcmp(AV28Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRecLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavExistencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistencias_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavRecmar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecmar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecmar_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtRecPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtRecPrdDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtFacCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavPrdcant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcant_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavForprddsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForprddsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdExiCC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtPrdCanRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtRecLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Visible), 5, 0), !bGXsfl_38_Refreshing);
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = AV7emprcod ;
      AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod = AV8barcod ;
      AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo = AV9barcodreo ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = AV10barcodpar ;
      AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq = AV11reclinmaq ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = AV21FilterFullText ;
      AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin = AV32TFRecLin ;
      AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to = AV33TFRecLin_To ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = AV34TFRecPrdNum ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = AV35TFRecPrdNum_Sel ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = AV36TFRecPrdDsc ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = AV37TFRecPrdDsc_Sel ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = AV38TFFacCon ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = AV39TFFacCon_To ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = AV44TFPrdExiAlm ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = AV45TFPrdExiAlm_To ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = AV46TFPrdExiCC ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = AV47TFPrdExiCC_To ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = AV48TFPrdCanRes ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = AV50TFRecLote ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = AV51TFRecLote_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e121LN2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV32TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFRecLin), 4, 0));
            AV33TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV34TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFRecPrdNum", AV34TFRecPrdNum);
            AV35TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFRecPrdNum_Sel", AV35TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV36TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRecPrdDsc", AV36TFRecPrdDsc);
            AV37TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRecPrdDsc_Sel", AV37TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCon") == 0 )
         {
            AV38TFFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFacCon", GXutil.ltrimstr( AV38TFFacCon, 11, 5));
            AV39TFFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFFacCon_To", GXutil.ltrimstr( AV39TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV44TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdExiAlm", GXutil.ltrimstr( AV44TFPrdExiAlm, 12, 4));
            AV45TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdExiAlm_To", GXutil.ltrimstr( AV45TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiCC") == 0 )
         {
            AV46TFPrdExiCC = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdExiCC", GXutil.ltrimstr( AV46TFPrdExiCC, 12, 4));
            AV47TFPrdExiCC_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdExiCC_To", GXutil.ltrimstr( AV47TFPrdExiCC_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV48TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdCanRes", GXutil.ltrimstr( AV48TFPrdCanRes, 12, 4));
            AV49TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdCanRes_To", GXutil.ltrimstr( AV49TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV50TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLote", AV50TFRecLote);
            AV51TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLote_Sel", AV51TFRecLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181LN2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV61Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExistencias_Internalname, GXutil.ltrimstr( AV61Existencias, 12, 4));
      if ( AV57consumos == 1 )
      {
         AV53RecMar = (byte)(((DecimalUtil.compareTo(AV61Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmar_Internalname, GXutil.str( AV53RecMar, 1, 0));
      }
      else
      {
         AV53RecMar = (byte)(((DecimalUtil.compareTo(AV61Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecmar_Internalname, GXutil.str( AV53RecMar, 1, 0));
      }
      AV59PrdCant = ((AV58todosproductos==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdcant_Internalname, GXutil.ltrimstr( AV59PrdCant, 11, 3));
      AV60ForPrdDsc = ((AV58todosproductos==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForprddsc_Internalname, AV60ForPrdDsc);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(38) ;
      }
      sendrow_382( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_38_Refreshing )
      {
         httpContext.doAjaxLoad(38, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e131LN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e111LN2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_IncidenciasFilters")),GXutil.URLEncode(GXutil.rtrim(AV86Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.CierreRecetasTinte_IncidenciasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV30ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV86Pgmname+"GridState", AV30ManageFiltersXml) ;
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
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
   }

   public void e141LN2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.formulaciontinte.cierrerecetastinte_incidenciasexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      cierrerecetastinte_incidencias_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      cierrerecetastinte_incidencias_impl.this.AV23ErrorMessage = GXv_char3[0] ;
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

   public void e151LN2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.cierrerecetastinte_incidenciasexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLin", "", "Linea", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Existencias", "", "Exis", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&RecMar", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecPrdNum", "", "Codigo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecPrdDsc", "", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "FacCon", "", "Factor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&PrdCant", "", "Cantidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ForPrdDsc", "", "Unidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char4, GXv_char3) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidencias_impl.this.A396EmprCod = GXv_char4[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdExiCC", "", "Exis C.C.", true, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "", "", "", false, "") ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
         AV46TFPrdExiCC = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdExiCC", GXutil.ltrimstr( AV46TFPrdExiCC, 12, 4));
         AV47TFPrdExiCC_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdExiCC_To", GXutil.ltrimstr( AV47TFPrdExiCC_To, 12, 4));
      }
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLote", "", "Lote", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV25UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasColumnsSelector", GXv_char4) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV29ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_IncidenciasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV29ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV21FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
      AV32TFRecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFRecLin), 4, 0));
      AV33TFRecLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFRecLin_To), 4, 0));
      AV34TFRecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFRecPrdNum", AV34TFRecPrdNum);
      AV35TFRecPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFRecPrdNum_Sel", AV35TFRecPrdNum_Sel);
      AV36TFRecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRecPrdDsc", AV36TFRecPrdDsc);
      AV37TFRecPrdDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRecPrdDsc_Sel", AV37TFRecPrdDsc_Sel);
      AV38TFFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFacCon", GXutil.ltrimstr( AV38TFFacCon, 11, 5));
      AV39TFFacCon_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFFacCon_To", GXutil.ltrimstr( AV39TFFacCon_To, 11, 5));
      AV44TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdExiAlm", GXutil.ltrimstr( AV44TFPrdExiAlm, 12, 4));
      AV45TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdExiAlm_To", GXutil.ltrimstr( AV45TFPrdExiAlm_To, 12, 4));
      AV46TFPrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdExiCC", GXutil.ltrimstr( AV46TFPrdExiCC, 12, 4));
      AV47TFPrdExiCC_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdExiCC_To", GXutil.ltrimstr( AV47TFPrdExiCC_To, 12, 4));
      AV48TFPrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdCanRes", GXutil.ltrimstr( AV48TFPrdCanRes, 12, 4));
      AV49TFPrdCanRes_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdCanRes_To", GXutil.ltrimstr( AV49TFPrdCanRes_To, 12, 4));
      AV50TFRecLote = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLote", AV50TFRecLote);
      AV51TFRecLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLote_Sel", AV51TFRecLote_Sel);
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
      if ( GXutil.strcmp(AV28Session.getValue(AV86Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV86Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV28Session.getValue(AV86Pgmname+"GridState"), null, null);
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
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV32TFRecLin = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFRecLin), 4, 0));
            AV33TFRecLin_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV34TFRecPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFRecPrdNum", AV34TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV35TFRecPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFRecPrdNum_Sel", AV35TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV36TFRecPrdDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRecPrdDsc", AV36TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV37TFRecPrdDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFRecPrdDsc_Sel", AV37TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV38TFFacCon = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFFacCon", GXutil.ltrimstr( AV38TFFacCon, 11, 5));
            AV39TFFacCon_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFFacCon_To", GXutil.ltrimstr( AV39TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV44TFPrdExiAlm = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdExiAlm", GXutil.ltrimstr( AV44TFPrdExiAlm, 12, 4));
            AV45TFPrdExiAlm_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdExiAlm_To", GXutil.ltrimstr( AV45TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV46TFPrdExiCC = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdExiCC", GXutil.ltrimstr( AV46TFPrdExiCC, 12, 4));
            AV47TFPrdExiCC_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdExiCC_To", GXutil.ltrimstr( AV47TFPrdExiCC_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV48TFPrdCanRes = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdCanRes", GXutil.ltrimstr( AV48TFPrdCanRes, 12, 4));
            AV49TFPrdCanRes_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdCanRes_To", GXutil.ltrimstr( AV49TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV50TFRecLote = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLote", AV50TFRecLote);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV51TFRecLote_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLote_Sel", AV51TFRecLote_Sel);
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFRecPrdNum_Sel)==0), AV35TFRecPrdNum_Sel, GXv_char4) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFRecPrdDsc_Sel)==0), AV37TFRecPrdDsc_Sel, GXv_char3) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFRecLote_Sel)==0), AV51TFRecLote_Sel, GXv_char2) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char17 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char16+"|||||||"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFRecPrdNum)==0), AV34TFRecPrdNum, GXv_char4) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFRecPrdDsc)==0), AV36TFRecPrdDsc, GXv_char3) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFRecLote)==0), AV50TFRecLote, GXv_char2) ;
      cierrerecetastinte_incidencias_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV32TFRecLin) ? "" : GXutil.str( AV32TFRecLin, 4, 0))+"|||"+GXt_char17+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFFacCon)==0) ? "" : GXutil.str( AV38TFFacCon, 11, 5))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdExiAlm)==0) ? "" : GXutil.str( AV44TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdExiCC)==0) ? "" : GXutil.str( AV46TFPrdExiCC, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCanRes)==0) ? "" : GXutil.str( AV48TFPrdCanRes, 12, 4))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV33TFRecLin_To) ? "" : GXutil.str( AV33TFRecLin_To, 4, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFFacCon_To)==0) ? "" : GXutil.str( AV39TFFacCon_To, 11, 5))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV45TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdExiCC_To)==0) ? "" : GXutil.str( AV47TFPrdExiCC_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCanRes_To)==0) ? "" : GXutil.str( AV49TFPrdCanRes_To, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV28Session.getValue(AV86Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV21FilterFullText)==0), (short)(0), AV21FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECLIN", "", !((0==AV32TFRecLin)&&(0==AV33TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV33TFRecLin_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV34TFRecPrdNum)==0), (short)(0), AV34TFRecPrdNum, "", !(GXutil.strcmp("", AV35TFRecPrdNum_Sel)==0), AV35TFRecPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV36TFRecPrdDsc)==0), (short)(0), AV36TFRecPrdDsc, "", !(GXutil.strcmp("", AV37TFRecPrdDsc_Sel)==0), AV37TFRecPrdDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFFacCon, 11, 5)), GXutil.trim( GXutil.str( AV39TFFacCon_To, 11, 5))) ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV45TFPrdExiAlm_To, 12, 4))) ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDEXICC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdExiCC)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdExiCC_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFPrdExiCC, 12, 4)), GXutil.trim( GXutil.str( AV47TFPrdExiCC_To, 12, 4))) ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV49TFPrdCanRes_To, 12, 4))) ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFRECLOTE", "", !(GXutil.strcmp("", AV50TFRecLote)==0), (short)(0), AV50TFRecLote, "", !(GXutil.strcmp("", AV51TFRecLote_Sel)==0), AV51TFRecLote_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV7emprcod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7emprcod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV8barcod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8barcod, 8, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9barcodreo) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9barcodreo, 1, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV10barcodpar)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV10barcodpar );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV11reclinmaq) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11reclinmaq, 4, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV86Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV86Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoProductosReceta_TRN" );
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "emprcod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV7emprcod );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcod" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV8barcod, 8, 0) );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodreo" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV9barcodreo, 1, 0) );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodpar" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV10barcodpar );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "reclinmaq" );
      AV15TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV11reclinmaq, 4, 0) );
      AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV15TrnContextAtt, 0);
      AV28Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1LN2( boolean wbgen )
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
         wb_table2_28_1LN2( true) ;
      }
      else
      {
         wb_table2_28_1LN2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1LN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1LN2e( true) ;
      }
      else
      {
         wb_table1_23_1LN2e( false) ;
      }
   }

   public void wb_table2_28_1LN2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_38_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV21FilterFullText, GXutil.rtrim( localUtil.format( AV21FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinte_Incidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1LN2e( true) ;
      }
      else
      {
         wb_table2_28_1LN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7emprcod", AV7emprcod);
      AV8barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
      AV9barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodreo", GXutil.str( AV9barcodreo, 1, 0));
      AV10barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodpar", AV10barcodpar);
      AV11reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11reclinmaq), 4, 0));
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
      pa1LN2( ) ;
      ws1LN2( ) ;
      we1LN2( ) ;
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
      sCtrlAV7emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11reclinmaq = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1LN2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\cierrerecetastinte_incidencias", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1LN2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7emprcod", AV7emprcod);
         AV8barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
         AV9barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodreo", GXutil.str( AV9barcodreo, 1, 0));
         AV10barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodpar", AV10barcodpar);
         AV11reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11reclinmaq), 4, 0));
      }
      wcpOAV7emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7emprcod") ;
      wcpOAV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV10barcodpar") ;
      wcpOAV11reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11reclinmaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7emprcod, wcpOAV7emprcod) != 0 ) || ( AV8barcod != wcpOAV8barcod ) || ( AV9barcodreo != wcpOAV9barcodreo ) || ( GXutil.strcmp(AV10barcodpar, wcpOAV10barcodpar) != 0 ) || ( AV11reclinmaq != wcpOAV11reclinmaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV7emprcod = AV7emprcod ;
      wcpOAV8barcod = AV8barcod ;
      wcpOAV9barcodreo = AV9barcodreo ;
      wcpOAV10barcodpar = AV10barcodpar ;
      wcpOAV11reclinmaq = AV11reclinmaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7emprcod = httpContext.cgiGet( sPrefix+"AV7emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7emprcod) > 0 )
      {
         AV7emprcod = httpContext.cgiGet( sCtrlAV7emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7emprcod", AV7emprcod);
      }
      else
      {
         AV7emprcod = httpContext.cgiGet( sPrefix+"AV7emprcod_PARM") ;
      }
      sCtrlAV8barcod = httpContext.cgiGet( sPrefix+"AV8barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV8barcod) > 0 )
      {
         AV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
      }
      else
      {
         AV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9barcodreo = httpContext.cgiGet( sPrefix+"AV9barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV9barcodreo) > 0 )
      {
         AV9barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodreo", GXutil.str( AV9barcodreo, 1, 0));
      }
      else
      {
         AV9barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10barcodpar = httpContext.cgiGet( sPrefix+"AV10barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV10barcodpar) > 0 )
      {
         AV10barcodpar = httpContext.cgiGet( sCtrlAV10barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodpar", AV10barcodpar);
      }
      else
      {
         AV10barcodpar = httpContext.cgiGet( sPrefix+"AV10barcodpar_PARM") ;
      }
      sCtrlAV11reclinmaq = httpContext.cgiGet( sPrefix+"AV11reclinmaq_CTRL") ;
      if ( GXutil.len( sCtrlAV11reclinmaq) > 0 )
      {
         AV11reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11reclinmaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11reclinmaq), 4, 0));
      }
      else
      {
         AV11reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11reclinmaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1LN2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1LN2( ) ;
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
      ws1LN2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7emprcod_PARM", GXutil.rtrim( AV7emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7emprcod_CTRL", GXutil.rtrim( sCtrlAV7emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8barcod_CTRL", GXutil.rtrim( sCtrlAV8barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV9barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9barcodreo_CTRL", GXutil.rtrim( sCtrlAV9barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10barcodpar_PARM", GXutil.rtrim( AV10barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10barcodpar_CTRL", GXutil.rtrim( sCtrlAV10barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11reclinmaq_PARM", GXutil.ltrim( localUtil.ntoc( AV11reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11reclinmaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11reclinmaq_CTRL", GXutil.rtrim( sCtrlAV11reclinmaq));
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
      we1LN2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691916", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cierrerecetastinte_incidencias.js", "?20268211691917", false, true);
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

   public void subsflControlProps_382( )
   {
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_38_idx ;
      edtavExistencias_Internalname = sPrefix+"vEXISTENCIAS_"+sGXsfl_38_idx ;
      edtavRecmar_Internalname = sPrefix+"vRECMAR_"+sGXsfl_38_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_38_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_38_idx ;
      edtFacCon_Internalname = sPrefix+"FACCON_"+sGXsfl_38_idx ;
      edtavPrdcant_Internalname = sPrefix+"vPRDCANT_"+sGXsfl_38_idx ;
      edtavForprddsc_Internalname = sPrefix+"vFORPRDDSC_"+sGXsfl_38_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_38_idx ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC_"+sGXsfl_38_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_38_idx ;
      edtRecLote_Internalname = sPrefix+"RECLOTE_"+sGXsfl_38_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_38_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_38_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_38_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_38_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_38_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_38_idx ;
   }

   public void subsflControlProps_fel_382( )
   {
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_38_fel_idx ;
      edtavExistencias_Internalname = sPrefix+"vEXISTENCIAS_"+sGXsfl_38_fel_idx ;
      edtavRecmar_Internalname = sPrefix+"vRECMAR_"+sGXsfl_38_fel_idx ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM_"+sGXsfl_38_fel_idx ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC_"+sGXsfl_38_fel_idx ;
      edtFacCon_Internalname = sPrefix+"FACCON_"+sGXsfl_38_fel_idx ;
      edtavPrdcant_Internalname = sPrefix+"vPRDCANT_"+sGXsfl_38_fel_idx ;
      edtavForprddsc_Internalname = sPrefix+"vFORPRDDSC_"+sGXsfl_38_fel_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_38_fel_idx ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC_"+sGXsfl_38_fel_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_38_fel_idx ;
      edtRecLote_Internalname = sPrefix+"RECLOTE_"+sGXsfl_38_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_38_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_38_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_38_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_38_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_38_fel_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_38_fel_idx ;
   }

   public void sendrow_382( )
   {
      subsflControlProps_382( ) ;
      wb1LN0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_38_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_38_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_38_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavExistencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExistencias_Internalname,GXutil.ltrim( localUtil.ntoc( AV61Existencias, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavExistencias_Enabled!=0) ? localUtil.format( AV61Existencias, "ZZZZZZ9.9999") : localUtil.format( AV61Existencias, "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavExistencias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavExistencias_Visible),Integer.valueOf(edtavExistencias_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecmar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecmar_Internalname,GXutil.ltrim( localUtil.ntoc( AV53RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecmar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53RecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(AV53RecMar), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecmar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(edtavRecmar_Visible),Integer.valueOf(edtavRecmar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPrdDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFacCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFacCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrdcant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV59PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdcant_Enabled!=0) ? localUtil.format( AV59PrdCant, "ZZZZZZ9.999") : localUtil.format( AV59PrdCant, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrdcant_Visible),Integer.valueOf(edtavPrdcant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavForprddsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForprddsc_Internalname,GXutil.rtrim( AV60ForPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavForprddsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavForprddsc_Visible),Integer.valueOf(edtavForprddsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdCanRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1LN2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      /* End function sendrow_382 */
   }

   public void startgridcontrol38( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"38\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavExistencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecmar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPrdDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFacCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrdcant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavForprddsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis C.C.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCanRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61Existencias, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExistencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavExistencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53RecMar, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecmar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecmar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdcant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrdcant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60ForPrdDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForprddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavForprddsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtRecLin_Internalname = sPrefix+"RECLIN" ;
      edtavExistencias_Internalname = sPrefix+"vEXISTENCIAS" ;
      edtavRecmar_Internalname = sPrefix+"vRECMAR" ;
      edtRecPrdNum_Internalname = sPrefix+"RECPRDNUM" ;
      edtRecPrdDsc_Internalname = sPrefix+"RECPRDDSC" ;
      edtFacCon_Internalname = sPrefix+"FACCON" ;
      edtavPrdcant_Internalname = sPrefix+"vPRDCANT" ;
      edtavForprddsc_Internalname = sPrefix+"vFORPRDDSC" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdExiCC_Internalname = sPrefix+"PRDEXICC" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtRecLote_Internalname = sPrefix+"RECLOTE" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO" ;
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
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 0 ;
      edtavPrdcant_Jsonclick = "" ;
      edtavPrdcant_Enabled = 0 ;
      edtFacCon_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtavRecmar_Jsonclick = "" ;
      edtavRecmar_Enabled = 0 ;
      edtavExistencias_Jsonclick = "" ;
      edtavExistencias_Enabled = 0 ;
      edtRecLin_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtRecLote_Visible = -1 ;
      edtPrdCanRes_Visible = -1 ;
      edtPrdExiCC_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtavForprddsc_Visible = -1 ;
      edtavPrdcant_Visible = -1 ;
      edtFacCon_Visible = -1 ;
      edtRecPrdDsc_Visible = -1 ;
      edtRecPrdNum_Visible = -1 ;
      edtavRecmar_Visible = -1 ;
      edtavExistencias_Visible = -1 ;
      edtRecLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = ";;;L;L;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CierreRecetasTinte_IncidenciasGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|||||||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T|||||||T" ;
      Ddo_grid_Filterisrange = "T|||||T|||T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|||Character|Character|Numeric|||Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T|||T|T|T|||T|T|T|T" ;
      Ddo_grid_Fixable = "T|T|T|||T|T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T|||T|T|T|||T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "2|||3|4|5|||6|7|8|9" ;
      Ddo_grid_Columnids = "0:RecLin|1:Existencias|2:RecMar|3:RecPrdNum|4:RecPrdDsc|5:FacCon|6:PrdCant|7:ForPrdDsc|8:PrdExiAlm|9:PrdExiCC|10:PrdCanRes|11:RecLote" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121LN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181LN2',iparms:[{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV61Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV53RecMar',fld:'vRECMAR',pic:'9'},{av:'AV59PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV60ForPrdDsc',fld:'vFORPRDDSC',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131LN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111LN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141LN2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e151LN2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV58todosproductos',fld:'vTODOSPRODUCTOS',pic:'ZZZ9',hsh:true},{av:'AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_1_EMPRCOD',pic:'@!'},{av:'AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_3_BARCODREO',pic:'9'},{av:'AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_4_BARCODPAR',pic:''},{av:'AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTE_INCIDENCIASDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV7emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV33TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV34TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV35TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV36TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV37TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV38TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV39TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV51TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV86Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLin_Visible',ctrl:'RECLIN',prop:'Visible'},{av:'edtavExistencias_Visible',ctrl:'vEXISTENCIAS',prop:'Visible'},{av:'edtavRecmar_Visible',ctrl:'vRECMAR',prop:'Visible'},{av:'edtRecPrdNum_Visible',ctrl:'RECPRDNUM',prop:'Visible'},{av:'edtRecPrdDsc_Visible',ctrl:'RECPRDDSC',prop:'Visible'},{av:'edtFacCon_Visible',ctrl:'FACCON',prop:'Visible'},{av:'edtavPrdcant_Visible',ctrl:'vPRDCANT',prop:'Visible'},{av:'edtavForprddsc_Visible',ctrl:'vFORPRDDSC',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'edtPrdCanRes_Visible',ctrl:'PRDCANRES',prop:'Visible'},{av:'edtRecLote_Visible',ctrl:'RECLOTE',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Reclinpro',iparms:[]");
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
      wcpOAV7emprcod = "" ;
      wcpOAV10barcodpar = "" ;
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
      AV7emprcod = "" ;
      AV10barcodpar = "" ;
      A396EmprCod = "" ;
      AV21FilterFullText = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV34TFRecPrdNum = "" ;
      AV35TFRecPrdNum_Sel = "" ;
      AV36TFRecPrdDsc = "" ;
      AV37TFRecPrdDsc_Sel = "" ;
      AV38TFFacCon = DecimalUtil.ZERO ;
      AV39TFFacCon_To = DecimalUtil.ZERO ;
      AV44TFPrdExiAlm = DecimalUtil.ZERO ;
      AV45TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV46TFPrdExiCC = DecimalUtil.ZERO ;
      AV47TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV48TFPrdCanRes = DecimalUtil.ZERO ;
      AV49TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV50TFRecLote = "" ;
      AV51TFRecLote_Sel = "" ;
      AV86Pgmname = "" ;
      AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod = "" ;
      AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV29ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel = "" ;
      AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel = "" ;
      AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon = DecimalUtil.ZERO ;
      AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm = DecimalUtil.ZERO ;
      AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to = DecimalUtil.ZERO ;
      AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc = DecimalUtil.ZERO ;
      AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to = DecimalUtil.ZERO ;
      AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres = DecimalUtil.ZERO ;
      AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to = DecimalUtil.ZERO ;
      AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel = "" ;
      AV61Existencias = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      AV59PrdCant = DecimalUtil.ZERO ;
      AV60ForPrdDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext = "" ;
      lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum = "" ;
      lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc = "" ;
      lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote = "" ;
      H01LN2_A719PrdNum = new String[] {""} ;
      H01LN2_n719PrdNum = new boolean[] {false} ;
      H01LN2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A490ForPrdUMe = new byte[1] ;
      H01LN2_n490ForPrdUMe = new boolean[] {false} ;
      H01LN2_A488ForPrdDsc = new String[] {""} ;
      H01LN2_n488ForPrdDsc = new boolean[] {false} ;
      H01LN2_A1273RecLinPro = new byte[1] ;
      H01LN2_A2804RecLinMaq = new short[1] ;
      H01LN2_A130BarCodPar = new String[] {""} ;
      H01LN2_A132BarCodReo = new byte[1] ;
      H01LN2_A129BarCod = new int[1] ;
      H01LN2_A396EmprCod = new String[] {""} ;
      H01LN2_A5725RecLote = new String[] {""} ;
      H01LN2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LN2_A875RecPrdDsc = new String[] {""} ;
      H01LN2_A872RecPrdNum = new String[] {""} ;
      H01LN2_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      H01LN3_AGRID_nRecordCount = new long[1] ;
      AV54Station = "" ;
      AV55EmprNom = "" ;
      AV56UsurCod = "" ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7emprcod = "" ;
      sCtrlAV8barcod = "" ;
      sCtrlAV9barcodreo = "" ;
      sCtrlAV10barcodpar = "" ;
      sCtrlAV11reclinmaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidencias__default(),
         new Object[] {
             new Object[] {
            H01LN2_A719PrdNum, H01LN2_n719PrdNum, H01LN2_A707PrdFacCon, H01LN2_A1797PrdCanAny, H01LN2_A686PrdCant, H01LN2_A490ForPrdUMe, H01LN2_n490ForPrdUMe, H01LN2_A488ForPrdDsc, H01LN2_n488ForPrdDsc, H01LN2_A1273RecLinPro,
            H01LN2_A2804RecLinMaq, H01LN2_A130BarCodPar, H01LN2_A132BarCodReo, H01LN2_A129BarCod, H01LN2_A396EmprCod, H01LN2_A5725RecLote, H01LN2_A685PrdCanRes, H01LN2_A705PrdExiCC, H01LN2_A704PrdExiAlm, H01LN2_A431FacCon,
            H01LN2_A875RecPrdDsc, H01LN2_A872RecPrdNum, H01LN2_A811RecLin
            }
            , new Object[] {
            H01LN3_AGRID_nRecordCount
            }
         }
      );
      AV86Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias" ;
      /* GeneXus formulas. */
      AV86Pgmname = "FormulacionTinte.CierreRecetasTinte_Incidencias" ;
      Gx_err = (short)(0) ;
      edtavExistencias_Enabled = 0 ;
      edtavRecmar_Enabled = 0 ;
      edtavPrdcant_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
   }

   private byte wcpOAV9barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV9barcodreo ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ;
   private byte A490ForPrdUMe ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV53RecMar ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV11reclinmaq ;
   private short AV11reclinmaq ;
   private short AV32TFRecLin ;
   private short AV33TFRecLin_To ;
   private short AV18OrderedBy ;
   private short AV57consumos ;
   private short AV58todosproductos ;
   private short AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ;
   private short wbEnd ;
   private short wbStart ;
   private short AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ;
   private short AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8barcod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_38 ;
   private int AV8barcod ;
   private int nGXsfl_38_idx=1 ;
   private int AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavExistencias_Enabled ;
   private int edtavRecmar_Enabled ;
   private int edtavPrdcant_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int edtRecLin_Visible ;
   private int edtavExistencias_Visible ;
   private int edtavRecmar_Visible ;
   private int edtRecPrdNum_Visible ;
   private int edtRecPrdDsc_Visible ;
   private int edtFacCon_Visible ;
   private int edtavPrdcant_Visible ;
   private int edtavForprddsc_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdExiCC_Visible ;
   private int edtPrdCanRes_Visible ;
   private int edtRecLote_Visible ;
   private int AV87GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFFacCon ;
   private java.math.BigDecimal AV39TFFacCon_To ;
   private java.math.BigDecimal AV44TFPrdExiAlm ;
   private java.math.BigDecimal AV45TFPrdExiAlm_To ;
   private java.math.BigDecimal AV46TFPrdExiCC ;
   private java.math.BigDecimal AV47TFPrdExiCC_To ;
   private java.math.BigDecimal AV48TFPrdCanRes ;
   private java.math.BigDecimal AV49TFPrdCanRes_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ;
   private java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ;
   private java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ;
   private java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ;
   private java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ;
   private java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ;
   private java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ;
   private java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ;
   private java.math.BigDecimal AV61Existencias ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV59PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String wcpOAV7emprcod ;
   private String wcpOAV10barcodpar ;
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
   private String AV7emprcod ;
   private String AV10barcodpar ;
   private String sGXsfl_38_idx="0001" ;
   private String A396EmprCod ;
   private String AV34TFRecPrdNum ;
   private String AV35TFRecPrdNum_Sel ;
   private String AV36TFRecPrdDsc ;
   private String AV37TFRecPrdDsc_Sel ;
   private String AV50TFRecLote ;
   private String AV51TFRecLote_Sel ;
   private String AV86Pgmname ;
   private String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ;
   private String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A488ForPrdDsc ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ;
   private String AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ;
   private String AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ;
   private String edtRecLin_Internalname ;
   private String edtavExistencias_Internalname ;
   private String edtavRecmar_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtavPrdcant_Internalname ;
   private String AV60ForPrdDsc ;
   private String edtavForprddsc_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String scmdbuf ;
   private String lV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ;
   private String lV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ;
   private String lV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ;
   private String A719PrdNum ;
   private String AV54Station ;
   private String AV55EmprNom ;
   private String AV56UsurCod ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV7emprcod ;
   private String sCtrlAV8barcod ;
   private String sCtrlAV9barcodreo ;
   private String sCtrlAV10barcodpar ;
   private String sCtrlAV11reclinmaq ;
   private String sGXsfl_38_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtRecLin_Jsonclick ;
   private String edtavExistencias_Jsonclick ;
   private String edtavRecmar_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtavPrdcant_Jsonclick ;
   private String edtavForprddsc_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_38_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV24ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV25UserCustomValue ;
   private String AV21FilterFullText ;
   private String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
   private String lV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01LN2_A719PrdNum ;
   private boolean[] H01LN2_n719PrdNum ;
   private java.math.BigDecimal[] H01LN2_A707PrdFacCon ;
   private java.math.BigDecimal[] H01LN2_A1797PrdCanAny ;
   private java.math.BigDecimal[] H01LN2_A686PrdCant ;
   private byte[] H01LN2_A490ForPrdUMe ;
   private boolean[] H01LN2_n490ForPrdUMe ;
   private String[] H01LN2_A488ForPrdDsc ;
   private boolean[] H01LN2_n488ForPrdDsc ;
   private byte[] H01LN2_A1273RecLinPro ;
   private short[] H01LN2_A2804RecLinMaq ;
   private String[] H01LN2_A130BarCodPar ;
   private byte[] H01LN2_A132BarCodReo ;
   private int[] H01LN2_A129BarCod ;
   private String[] H01LN2_A396EmprCod ;
   private String[] H01LN2_A5725RecLote ;
   private java.math.BigDecimal[] H01LN2_A685PrdCanRes ;
   private java.math.BigDecimal[] H01LN2_A705PrdExiCC ;
   private java.math.BigDecimal[] H01LN2_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01LN2_A431FacCon ;
   private String[] H01LN2_A875RecPrdDsc ;
   private String[] H01LN2_A872RecPrdNum ;
   private short[] H01LN2_A811RecLin ;
   private long[] H01LN3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV29ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class cierrerecetastinte_incidencias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01LN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[34];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.PrdNum, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecLote," ;
      sSelectString += " T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin" ;
      sFromString = " FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( AV18OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01LN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext ,
                                          short AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin ,
                                          short AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to ,
                                          String AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel ,
                                          String AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum ,
                                          String AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel ,
                                          String AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm ,
                                          java.math.BigDecimal AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to ,
                                          java.math.BigDecimal AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc ,
                                          java.math.BigDecimal AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to ,
                                          java.math.BigDecimal AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres ,
                                          java.math.BigDecimal AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV64Formulaciontinte_cierrerecetastinte_incidenciasds_1_emprcod ,
                                          int AV65Formulaciontinte_cierrerecetastinte_incidenciasds_2_barcod ,
                                          byte AV66Formulaciontinte_cierrerecetastinte_incidenciasds_3_barcodreo ,
                                          String AV67Formulaciontinte_cierrerecetastinte_incidenciasds_4_barcodpar ,
                                          short AV68Formulaciontinte_cierrerecetastinte_incidenciasds_5_reclinmaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[29];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_incidenciasds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_cierrerecetastinte_incidenciasds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cierrerecetastinte_incidenciasds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_cierrerecetastinte_incidenciasds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_incidenciasds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_incidenciasds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_cierrerecetastinte_incidenciasds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_incidenciasds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_incidenciasds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_incidenciasds_15_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Formulaciontinte_cierrerecetastinte_incidenciasds_16_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Formulaciontinte_cierrerecetastinte_incidenciasds_17_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Formulaciontinte_cierrerecetastinte_incidenciasds_18_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Formulaciontinte_cierrerecetastinte_incidenciasds_19_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Formulaciontinte_cierrerecetastinte_incidenciasds_20_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidenciasds_21_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidenciasds_22_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
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
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01LN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
            case 1 :
                  return conditional_H01LN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((String[]) buf[15])[0] = rslt.getString(13, 26);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,4);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[20])[0] = rslt.getString(18, 26);
               ((String[]) buf[21])[0] = rslt.getString(19, 6);
               ((short[]) buf[22])[0] = rslt.getShort(20);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 4);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 4);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
      }
   }

}

