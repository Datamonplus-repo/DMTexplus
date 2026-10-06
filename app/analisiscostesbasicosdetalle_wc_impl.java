package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscostesbasicosdetalle_wc_impl extends GXWebComponent
{
   public analisiscostesbasicosdetalle_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscostesbasicosdetalle_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesbasicosdetalle_wc_impl.class ));
   }

   public analisiscostesbasicosdetalle_wc_impl( int remoteHandle ,
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
               AV286Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286Emprcod", AV286Emprcod);
               AV287Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV287Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV287Barcod), 8, 0));
               AV288Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV288Barcodreo", GXutil.str( AV288Barcodreo, 1, 0));
               AV289BarCodpar = httpContext.GetPar( "BarCodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV289BarCodpar", AV289BarCodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV286Emprcod,Integer.valueOf(AV287Barcod),Byte.valueOf(AV288Barcodreo),AV289BarCodpar});
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV27ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22ColumnsSelector);
      AV286Emprcod = httpContext.GetPar( "Emprcod") ;
      AV287Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV288Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV289BarCodpar = httpContext.GetPar( "BarCodpar") ;
      AV28TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV29TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV30TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV31TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV32TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV33TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV34TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV35TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV36TFBarUniMed = httpContext.GetPar( "TFBarUniMed") ;
      AV37TFBarUniMed_Sel = httpContext.GetPar( "TFBarUniMed_Sel") ;
      AV269TFBarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea"), ".") ;
      AV270TFBarTieRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea_To"), ".") ;
      AV271TFBarTieTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo"), ".") ;
      AV272TFBarTieTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo_To"), ".") ;
      AV319Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV232TasasEstandar = (byte)(GXutil.lval( httpContext.GetPar( "TasasEstandar"))) ;
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = httpContext.GetPar( "Analisiscostesbasicosdetalle_wcds_1_emprcod") ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Analisiscostesbasicosdetalle_wcds_2_barcod"))) ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Analisiscostesbasicosdetalle_wcds_3_barcodreo"))) ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = httpContext.GetPar( "Analisiscostesbasicosdetalle_wcds_4_barcodpar") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19Z2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla BARFAS", "")) ;
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
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.analisiscostesbasicosdetalle_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV286Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV287Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV288Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV289BarCodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","BarCodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV319Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV232TasasEstandar), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesBasicosDetalle_WC");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("analisiscostesbasicosdetalle_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV40GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV41GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV286Emprcod", GXutil.rtrim( wcpOAV286Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV287Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV287Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV288Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV288Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV289BarCodpar", GXutil.rtrim( wcpOAV289BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV27ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV286Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV287Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV288Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV289BarCodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV28TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV29TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV30TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV31TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV32TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV33TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV34TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV35TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARUNIMED", GXutil.rtrim( AV36TFBarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARUNIMED_SEL", GXutil.rtrim( AV37TFBarUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA", GXutil.ltrim( localUtil.ntoc( AV269TFBarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA_TO", GXutil.ltrim( localUtil.ntoc( AV270TFBarTieRea_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIETEO", GXutil.ltrim( localUtil.ntoc( AV271TFBarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIETEO_TO", GXutil.ltrim( localUtil.ntoc( AV272TFBarTieTeo_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV319Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV319Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV232TasasEstandar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV232TasasEstandar), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASKGM", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASKGT", GXutil.ltrim( localUtil.ntoc( A5719BarFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASMTT", GXutil.ltrim( localUtil.ntoc( A5720BarFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASMTR", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARHORINI", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARHORFIN", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD", GXutil.rtrim( AV295Analisiscostesbasicosdetalle_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV296Analisiscostesbasicosdetalle_wcds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR", GXutil.rtrim( AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar));
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

   public void renderHtmlCloseForm19Z2( )
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
      return "AnalisisCostesBasicosDetalle_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla BARFAS", "") ;
   }

   public void wb19Z0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.analisiscostesbasicosdetalle_wc");
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
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicosDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicosDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnalisisCostesBasicosDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_19Z2( true) ;
      }
      else
      {
         wb_table1_23_19Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_19Z2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV40GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV41GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnalisisCostesBasicosDetalle_WC.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV22ColumnsSelector);
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
      if ( wbEnd == 44 )
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

   public void start19Z2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla BARFAS", ""), (short)(0)) ;
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
            strup19Z0( ) ;
         }
      }
   }

   public void ws19Z2( )
   {
      start19Z2( ) ;
      evt19Z2( ) ;
   }

   public void evt19Z2( )
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
                              strup19Z0( ) ;
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
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1119Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1219Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1319Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1419Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1519Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1619Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1719Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19Z0( ) ;
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
                              strup19Z0( ) ;
                           }
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV264RecuperaciondeVariables = (short)(localUtil.ctol( httpContext.cgiGet( edtavRecuperaciondevariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecuperaciondevariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV264RecuperaciondeVariables), 4, 0));
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           AV285MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV285MaqDsc);
                           AV16Unidades = localUtil.ctond( httpContext.cgiGet( edtavUnidades_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidades_Internalname, GXutil.ltrimstr( AV16Unidades, 9, 2));
                           AV17Unidadest = localUtil.ctond( httpContext.cgiGet( edtavUnidadest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidadest_Internalname, GXutil.ltrimstr( AV17Unidadest, 9, 2));
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
                           AV157HorIni_5 = httpContext.cgiGet( edtavHorini_5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorini_5_Internalname, AV157HorIni_5);
                           AV155HorFin_5 = httpContext.cgiGet( edtavHorfin_5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorfin_5_Internalname, AV155HorFin_5);
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
                           AV268Tteo = localUtil.ctond( httpContext.cgiGet( edtavTteo_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTteo_Internalname, GXutil.ltrimstr( AV268Tteo, 5, 2));
                           AV193MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtavMaqcosmin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV193MaqCosMin, 10, 4));
                           AV95Coste_m = localUtil.ctond( httpContext.cgiGet( edtavCoste_m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_m_Internalname, GXutil.ltrimstr( AV95Coste_m, 12, 2));
                           AV106Coste_tm = localUtil.ctond( httpContext.cgiGet( edtavCoste_tm_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_tm_Internalname, GXutil.ltrimstr( AV106Coste_tm, 12, 2));
                           AV234Tiempo_m = (int)(localUtil.ctol( httpContext.cgiGet( edtavTiempo_m_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTiempo_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV234Tiempo_m), 6, 0));
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
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
                                       e1819Z2 ();
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
                                       e1919Z2 ();
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
                                       e2019Z2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                                    strup19Z0( ) ;
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

   public void we19Z2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19Z2( ) ;
         }
      }
   }

   public void pa19Z2( )
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 byte AV27ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ,
                                 String AV286Emprcod ,
                                 int AV287Barcod ,
                                 byte AV288Barcodreo ,
                                 String AV289BarCodpar ,
                                 short AV28TFBarOrdLin ,
                                 short AV29TFBarOrdLin_To ,
                                 String AV30TFFasCod ,
                                 String AV31TFFasCod_Sel ,
                                 String AV32TFFasDsc ,
                                 String AV33TFFasDsc_Sel ,
                                 String AV34TFMaqCodBis ,
                                 String AV35TFMaqCodBis_Sel ,
                                 String AV36TFBarUniMed ,
                                 String AV37TFBarUniMed_Sel ,
                                 java.math.BigDecimal AV269TFBarTieRea ,
                                 java.math.BigDecimal AV270TFBarTieRea_To ,
                                 java.math.BigDecimal AV271TFBarTieTeo ,
                                 java.math.BigDecimal AV272TFBarTieTeo_To ,
                                 String AV319Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV232TasasEstandar ,
                                 String AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                 int AV296Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                 byte AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                 String AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1919Z2 ();
      GRID_nCurrentRecord = 0 ;
      rf19Z2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesBasicosDetalle_WC");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("analisiscostesbasicosdetalle_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf19Z2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV319Pgmname = "AnalisisCostesBasicosDetalle_WC" ;
      Gx_err = (short)(0) ;
      edtavRecuperaciondevariables_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecuperaciondevariables_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecuperaciondevariables_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidades_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidadest_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorini_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorini_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorini_5_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorfin_5_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTteo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosmin_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_m_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_tm_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTiempo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempo_m_Enabled), 5, 0), !bGXsfl_44_Refreshing);
   }

   public void rf19Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e1919Z2 ();
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_442( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                              Short.valueOf(AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                              Short.valueOf(AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                              AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                              AV302Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                              AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                              AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                              AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                              AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                              AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                              AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                              AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                              AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                              AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                              AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A228BarUniMed ,
                                              A215BarTieRea ,
                                              A216BarTieTeo ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                              Integer.valueOf(AV296Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                              Byte.valueOf(AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                              AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
         lV302Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV302Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
         lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
         lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
         lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
         /* Using cursor H019Z3 */
         pr_default.execute(0, new Object[] {AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV296Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV302Analisiscostesbasicosdetalle_wcds_8_tffascod, AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_44_idx = 1 ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3837BarFasKgm = H019Z3_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H019Z3_n3837BarFasKgm[0] ;
            A5719BarFasKgT = H019Z3_A5719BarFasKgT[0] ;
            n5719BarFasKgT = H019Z3_n5719BarFasKgT[0] ;
            A5720BarFasMtT = H019Z3_A5720BarFasMtT[0] ;
            n5720BarFasMtT = H019Z3_n5720BarFasMtT[0] ;
            A3838BarFasMtr = H019Z3_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H019Z3_n3838BarFasMtr[0] ;
            A165BarHorIni = H019Z3_A165BarHorIni[0] ;
            A164BarHorFin = H019Z3_A164BarHorFin[0] ;
            A396EmprCod = H019Z3_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A130BarCodPar = H019Z3_A130BarCodPar[0] ;
            A132BarCodReo = H019Z3_A132BarCodReo[0] ;
            A129BarCod = H019Z3_A129BarCod[0] ;
            A212BarSer = H019Z3_A212BarSer[0] ;
            A252CliCod = H019Z3_A252CliCod[0] ;
            n252CliCod = H019Z3_n252CliCod[0] ;
            A758ProCod = H019Z3_A758ProCod[0] ;
            A216BarTieTeo = H019Z3_A216BarTieTeo[0] ;
            A215BarTieRea = H019Z3_A215BarTieRea[0] ;
            A228BarUniMed = H019Z3_A228BarUniMed[0] ;
            A603MaqCodBis = H019Z3_A603MaqCodBis[0] ;
            A460FasDsc = H019Z3_A460FasDsc[0] ;
            A457FasCod = H019Z3_A457FasCod[0] ;
            A194BarOrdLin = H019Z3_A194BarOrdLin[0] ;
            A166BarKgm = H019Z3_A166BarKgm[0] ;
            A184BarMtr = H019Z3_A184BarMtr[0] ;
            A212BarSer = H019Z3_A212BarSer[0] ;
            A252CliCod = H019Z3_A252CliCod[0] ;
            n252CliCod = H019Z3_n252CliCod[0] ;
            A228BarUniMed = H019Z3_A228BarUniMed[0] ;
            A166BarKgm = H019Z3_A166BarKgm[0] ;
            A184BarMtr = H019Z3_A184BarMtr[0] ;
            A460FasDsc = H019Z3_A460FasDsc[0] ;
            e2019Z2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(44) ;
         wb19Z0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19Z2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV319Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV319Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTASASESTANDAR", GXutil.ltrim( localUtil.ntoc( AV232TasasEstandar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV232TasasEstandar), "9")));
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
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV302Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV296Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV302Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV302Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor H019Z5 */
      pr_default.execute(1, new Object[] {AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV296Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV302Analisiscostesbasicosdetalle_wcds_8_tffascod, AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      GRID_nRecordCount = H019Z5_AGRID_nRecordCount[0] ;
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
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV286Emprcod, AV287Barcod, AV288Barcodreo, AV289BarCodpar, AV28TFBarOrdLin, AV29TFBarOrdLin_To, AV30TFFasCod, AV31TFFasCod_Sel, AV32TFFasDsc, AV33TFFasDsc_Sel, AV34TFMaqCodBis, AV35TFMaqCodBis_Sel, AV36TFBarUniMed, AV37TFBarUniMed_Sel, AV269TFBarTieRea, AV270TFBarTieRea_To, AV271TFBarTieTeo, AV272TFBarTieTeo_To, AV319Pgmname, AV12OrderedBy, AV13OrderedDsc, AV232TasasEstandar, AV295Analisiscostesbasicosdetalle_wcds_1_emprcod, AV296Analisiscostesbasicosdetalle_wcds_2_barcod, AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo, AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV319Pgmname = "AnalisisCostesBasicosDetalle_WC" ;
      Gx_err = (short)(0) ;
      edtavRecuperaciondevariables_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecuperaciondevariables_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecuperaciondevariables_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidades_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidadest_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorini_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorini_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorini_5_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorfin_5_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTteo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosmin_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_m_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_tm_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTiempo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempo_m_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup19Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1819Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV25ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV22ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV286Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV286Emprcod") ;
         wcpOAV287Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV287Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV288Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV288Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV289BarCodpar = httpContext.cgiGet( sPrefix+"wcpOAV289BarCodpar") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         /* Read subfile selected row values. */
         nGXsfl_44_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         if ( nGXsfl_44_idx > 0 )
         {
            AV264RecuperaciondeVariables = (short)(localUtil.ctol( httpContext.cgiGet( edtavRecuperaciondevariables_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecuperaciondevariables_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV264RecuperaciondeVariables), 4, 0));
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            AV285MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV285MaqDsc);
            AV16Unidades = localUtil.ctond( httpContext.cgiGet( edtavUnidades_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidades_Internalname, GXutil.ltrimstr( AV16Unidades, 9, 2));
            AV17Unidadest = localUtil.ctond( httpContext.cgiGet( edtavUnidadest_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidadest_Internalname, GXutil.ltrimstr( AV17Unidadest, 9, 2));
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            AV157HorIni_5 = httpContext.cgiGet( edtavHorini_5_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorini_5_Internalname, AV157HorIni_5);
            AV155HorFin_5 = httpContext.cgiGet( edtavHorfin_5_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorfin_5_Internalname, AV155HorFin_5);
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
            AV268Tteo = localUtil.ctond( httpContext.cgiGet( edtavTteo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTteo_Internalname, GXutil.ltrimstr( AV268Tteo, 5, 2));
            AV193MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtavMaqcosmin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV193MaqCosMin, 10, 4));
            AV95Coste_m = localUtil.ctond( httpContext.cgiGet( edtavCoste_m_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_m_Internalname, GXutil.ltrimstr( AV95Coste_m, 12, 2));
            AV106Coste_tm = localUtil.ctond( httpContext.cgiGet( edtavCoste_tm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_tm_Internalname, GXutil.ltrimstr( AV106Coste_tm, 12, 2));
            AV234Tiempo_m = (int)(localUtil.ctol( httpContext.cgiGet( edtavTiempo_m_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTiempo_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV234Tiempo_m), 6, 0));
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AnalisisCostesBasicosDetalle_WC");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("analisiscostesbasicosdetalle_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e1819Z2 ();
      if (returnInSub) return;
   }

   public void e1819Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV292Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV292Station = GXt_char1 ;
      GXv_char2[0] = AV286Emprcod ;
      GXv_char3[0] = AV293Emprnom ;
      GXv_char4[0] = AV294Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV292Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscostesbasicosdetalle_wc_impl.this.AV286Emprcod = GXv_char2[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV293Emprnom = GXv_char3[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV294Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286Emprcod", AV286Emprcod);
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
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1919Z2( )
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
      if ( AV27ManageFiltersExecutionStep == 1 )
      {
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV27ManageFiltersExecutionStep == 2 )
      {
         AV27ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV24Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV20ColumnsSelectorXML = AV24Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV20ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtMaqCodBis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidades_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidades_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidades_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavUnidadest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUnidadest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidadest_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtBarUniMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorini_5_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorini_5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorini_5_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavHorfin_5_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorfin_5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorfin_5_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtBarTieRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTieRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtBarTieTeo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTieTeo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavTteo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTteo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTteo_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavMaqcosmin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcosmin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosmin_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_m_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_m_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_m_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavCoste_tm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCoste_tm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_tm_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtavTiempo_m_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempo_m_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempo_m_Visible), 5, 0), !bGXsfl_44_Refreshing);
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = AV286Emprcod ;
      AV296Analisiscostesbasicosdetalle_wcds_2_barcod = AV287Barcod ;
      AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV288Barcodreo ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV289BarCodpar ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV15FilterFullText ;
      AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV28TFBarOrdLin ;
      AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV29TFBarOrdLin_To ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = AV30TFFasCod ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV31TFFasCod_Sel ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV32TFFasDsc ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV33TFFasDsc_Sel ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV34TFMaqCodBis ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV36TFBarUniMed ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV37TFBarUniMed_Sel ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV269TFBarTieRea ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV270TFBarTieRea_To ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV271TFBarTieTeo ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV272TFBarTieTeo_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1219Z2( )
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
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e1319Z2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1419Z2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV28TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarOrdLin), 4, 0));
            AV29TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV30TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasCod", AV30TFFasCod);
            AV31TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasCod_Sel", AV31TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV32TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasDsc", AV32TFFasDsc);
            AV33TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasDsc_Sel", AV33TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV34TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqCodBis", AV34TFMaqCodBis);
            AV35TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqCodBis_Sel", AV35TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarUniMed") == 0 )
         {
            AV36TFBarUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarUniMed", AV36TFBarUniMed);
            AV37TFBarUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarUniMed_Sel", AV37TFBarUniMed_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieRea") == 0 )
         {
            AV269TFBarTieRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV269TFBarTieRea", GXutil.ltrimstr( AV269TFBarTieRea, 5, 2));
            AV270TFBarTieRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV270TFBarTieRea_To", GXutil.ltrimstr( AV270TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieTeo") == 0 )
         {
            AV271TFBarTieTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV271TFBarTieTeo", GXutil.ltrimstr( AV271TFBarTieTeo, 5, 2));
            AV272TFBarTieTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV272TFBarTieTeo_To", GXutil.ltrimstr( AV272TFBarTieTeo_To, 5, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2019Z2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A228BarUniMed ;
      GXv_decimal10[0] = A166BarKgm ;
      GXv_decimal11[0] = A184BarMtr ;
      GXv_char12[0] = A603MaqCodBis ;
      GXv_char13[0] = A457FasCod ;
      GXv_char14[0] = A758ProCod ;
      GXv_int15[0] = A252CliCod ;
      GXv_char16[0] = A212BarSer ;
      GXv_int17[0] = AV232TasasEstandar ;
      GXv_decimal18[0] = A215BarTieRea ;
      GXv_decimal19[0] = A216BarTieTeo ;
      GXv_decimal20[0] = A3837BarFasKgm ;
      GXv_decimal21[0] = A5719BarFasKgT ;
      GXv_decimal22[0] = A5720BarFasMtT ;
      GXv_decimal23[0] = A3838BarFasMtr ;
      GXv_decimal24[0] = AV95Coste_m ;
      GXv_decimal25[0] = AV106Coste_tm ;
      GXv_decimal26[0] = AV193MaqCosMin ;
      GXv_decimal27[0] = AV99Coste_mmod ;
      GXv_decimal28[0] = AV100Coste_mmoi ;
      GXv_decimal29[0] = AV97Coste_menergia ;
      GXv_decimal30[0] = AV98Coste_mgas ;
      GXv_decimal31[0] = AV96Coste_mAgua ;
      GXv_int32[0] = AV234Tiempo_m ;
      GXv_char33[0] = AV157HorIni_5 ;
      GXv_char34[0] = AV155HorFin_5 ;
      GXv_decimal35[0] = AV268Tteo ;
      GXv_decimal36[0] = AV16Unidades ;
      GXv_decimal37[0] = AV17Unidadest ;
      GXv_decimal38[0] = AV314Coste_p_k ;
      new app.recuperodatoscostesmaquina(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_char2, GXv_decimal10, GXv_decimal11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_int17, GXv_decimal18, GXv_decimal19, GXv_decimal20, GXv_decimal21, GXv_decimal22, GXv_decimal23, GXv_decimal24, GXv_decimal25, GXv_decimal26, GXv_decimal27, GXv_decimal28, GXv_decimal29, GXv_decimal30, GXv_decimal31, GXv_int32, GXv_char33, GXv_char34, GXv_decimal35, GXv_decimal36, GXv_decimal37, GXv_decimal38) ;
      analisiscostesbasicosdetalle_wc_impl.this.A396EmprCod = GXv_char4[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A129BarCod = GXv_int8[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A132BarCodReo = GXv_int9[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A228BarUniMed = GXv_char2[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A166BarKgm = GXv_decimal10[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A184BarMtr = GXv_decimal11[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A603MaqCodBis = GXv_char12[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A457FasCod = GXv_char13[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A758ProCod = GXv_char14[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A252CliCod = GXv_int15[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A212BarSer = GXv_char16[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV232TasasEstandar = GXv_int17[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A215BarTieRea = GXv_decimal18[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A216BarTieTeo = GXv_decimal19[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A3837BarFasKgm = GXv_decimal20[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A5719BarFasKgT = GXv_decimal21[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A5720BarFasMtT = GXv_decimal22[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.A3838BarFasMtr = GXv_decimal23[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV95Coste_m = GXv_decimal24[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV106Coste_tm = GXv_decimal25[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV193MaqCosMin = GXv_decimal26[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV99Coste_mmod = GXv_decimal27[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV100Coste_mmoi = GXv_decimal28[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV97Coste_menergia = GXv_decimal29[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV98Coste_mgas = GXv_decimal30[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV96Coste_mAgua = GXv_decimal31[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV234Tiempo_m = GXv_int32[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV157HorIni_5 = GXv_char33[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV155HorFin_5 = GXv_char34[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV268Tteo = GXv_decimal35[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV16Unidades = GXv_decimal36[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV17Unidadest = GXv_decimal37[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV314Coste_p_k = GXv_decimal38[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV232TasasEstandar", GXutil.str( AV232TasasEstandar, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTASASESTANDAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV232TasasEstandar), "9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3837BarFasKgm", GXutil.ltrimstr( A3837BarFasKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5719BarFasKgT", GXutil.ltrimstr( A5719BarFasKgT, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5720BarFasMtT", GXutil.ltrimstr( A5720BarFasMtT, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3838BarFasMtr", GXutil.ltrimstr( A3838BarFasMtr, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_m_Internalname, GXutil.ltrimstr( AV95Coste_m, 12, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCoste_tm_Internalname, GXutil.ltrimstr( AV106Coste_tm, 12, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV193MaqCosMin, 10, 4));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTiempo_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV234Tiempo_m), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorini_5_Internalname, AV157HorIni_5);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorfin_5_Internalname, AV155HorFin_5);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTteo_Internalname, GXutil.ltrimstr( AV268Tteo, 5, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidades_Internalname, GXutil.ltrimstr( AV16Unidades, 9, 2));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUnidadest_Internalname, GXutil.ltrimstr( AV17Unidadest, 9, 2));
      GXt_char1 = AV285MaqDsc ;
      GXv_char34[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A603MaqCodBis, GXv_char34) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char34[0] ;
      AV285MaqDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV285MaqDsc);
      AV315Ceros4 = "0000" ;
      AV316Horini = GXutil.str( A165BarHorIni, 4, 0) ;
      AV316Horini = GXutil.ltrim( GXutil.rtrim( AV316Horini)) ;
      AV317Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV316Horini)) ;
      AV317Lenvar = DecimalUtil.doubleToDec(4).subtract(AV317Lenvar) ;
      AV316Horini = GXutil.substring( AV315Ceros4, 1, (int)(DecimalUtil.decToDouble(AV317Lenvar))) + AV316Horini ;
      AV157HorIni_5 = GXutil.substring( AV316Horini, 1, 2) + "." + GXutil.substring( AV316Horini, 3, 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorini_5_Internalname, AV157HorIni_5);
      AV318Horfin = GXutil.str( A164BarHorFin, 4, 0) ;
      AV318Horfin = GXutil.ltrim( GXutil.rtrim( AV318Horfin)) ;
      AV317Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV318Horfin)) ;
      AV317Lenvar = DecimalUtil.doubleToDec(4).subtract(AV317Lenvar) ;
      AV318Horfin = GXutil.substring( AV315Ceros4, 1, (int)(DecimalUtil.decToDouble(AV317Lenvar))) + AV318Horfin ;
      AV155HorFin_5 = GXutil.substring( AV318Horfin, 1, 2) + "." + GXutil.substring( AV318Horfin, 3, 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorfin_5_Internalname, AV155HorFin_5);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(44) ;
      }
      sendrow_442( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
      {
         httpContext.doAjaxLoad(44, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1519Z2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV20ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV22ColumnsSelector.fromJSonString(AV20ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCColumnsSelector", ((GXutil.strcmp("", AV20ColumnsSelectorXML)==0) ? "" : AV22ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1119Z2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("AnalisisCostesBasicosDetalle_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV319Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AnalisisCostesBasicosDetalle_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV26ManageFiltersXml ;
         GXv_char34[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char34) ;
         analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char34[0] ;
         AV26ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV26ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV319Pgmname+"GridState", AV26ManageFiltersXml) ;
            AV10GridState.fromxml(AV26ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
   }

   public void e1619Z2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char34[0] = AV18ExcelFilename ;
      GXv_char33[0] = AV19ErrorMessage ;
      new app.analisiscostesbasicosdetalle_wcexport(remoteHandle, context).execute( GXv_char34, GXv_char33) ;
      analisiscostesbasicosdetalle_wc_impl.this.AV18ExcelFilename = GXv_char34[0] ;
      analisiscostesbasicosdetalle_wc_impl.this.AV19ErrorMessage = GXv_char33[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV19ErrorMessage);
      }
   }

   public void e1719Z2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.analisiscostesbasicosdetalle_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "BarOrdLin", "", "Orden", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "FasCod", "", "Codigo Fase", false, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "MaqCodBis", "", "Maquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Unidades", "", "Unidades", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Unidadest", "", "Und Totales", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "BarUniMed", "", "Und", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&HorIni_5", "", "Inicio", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&HorFin_5", "", "Fin", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "BarTieRea", "", "T Real", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "BarTieTeo", "", "T Teo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Tteo", "", "", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&MaqCosMin", "", "Coste Minuto", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Coste_m", "", "Coste Real", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Coste_tm", "", "Coste Teo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXv_SdtWWPColumnsSelector39[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, "&Tiempo_m", "", "Tiempo (m)", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector39[0] ;
      GXt_char1 = AV21UserCustomValue ;
      GXv_char34[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCColumnsSelector", GXv_char34) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char34[0] ;
      AV21UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector39[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector40[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector39, GXv_SdtWWPColumnsSelector40) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector39[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector40[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 = AV25ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item42[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item42) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item42[0] ;
      AV25ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarOrdLin), 4, 0));
      AV29TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarOrdLin_To), 4, 0));
      AV30TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasCod", AV30TFFasCod);
      AV31TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasCod_Sel", AV31TFFasCod_Sel);
      AV32TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasDsc", AV32TFFasDsc);
      AV33TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasDsc_Sel", AV33TFFasDsc_Sel);
      AV34TFMaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqCodBis", AV34TFMaqCodBis);
      AV35TFMaqCodBis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqCodBis_Sel", AV35TFMaqCodBis_Sel);
      AV36TFBarUniMed = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarUniMed", AV36TFBarUniMed);
      AV37TFBarUniMed_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarUniMed_Sel", AV37TFBarUniMed_Sel);
      AV269TFBarTieRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV269TFBarTieRea", GXutil.ltrimstr( AV269TFBarTieRea, 5, 2));
      AV270TFBarTieRea_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV270TFBarTieRea_To", GXutil.ltrimstr( AV270TFBarTieRea_To, 5, 2));
      AV271TFBarTieTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV271TFBarTieTeo", GXutil.ltrimstr( AV271TFBarTieTeo, 5, 2));
      AV272TFBarTieTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV272TFBarTieTeo_To", GXutil.ltrimstr( AV272TFBarTieTeo_To, 5, 2));
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
      if ( GXutil.strcmp(AV24Session.getValue(AV319Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV319Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV24Session.getValue(AV319Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV320GXV1 = 1 ;
      while ( AV320GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV320GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV28TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarOrdLin), 4, 0));
            AV29TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV30TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasCod", AV30TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV31TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasCod_Sel", AV31TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV32TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasDsc", AV32TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV33TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasDsc_Sel", AV33TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV34TFMaqCodBis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFMaqCodBis", AV34TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV35TFMaqCodBis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFMaqCodBis_Sel", AV35TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV36TFBarUniMed = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarUniMed", AV36TFBarUniMed);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV37TFBarUniMed_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarUniMed_Sel", AV37TFBarUniMed_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV269TFBarTieRea = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV269TFBarTieRea", GXutil.ltrimstr( AV269TFBarTieRea, 5, 2));
            AV270TFBarTieRea_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV270TFBarTieRea_To", GXutil.ltrimstr( AV270TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV271TFBarTieTeo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV271TFBarTieTeo", GXutil.ltrimstr( AV271TFBarTieTeo, 5, 2));
            AV272TFBarTieTeo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV272TFBarTieTeo_To", GXutil.ltrimstr( AV272TFBarTieTeo_To, 5, 2));
         }
         AV320GXV1 = (int)(AV320GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char34[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFFasCod_Sel)==0), AV31TFFasCod_Sel, GXv_char34) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char34[0] ;
      GXt_char43 = "" ;
      GXv_char33[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFFasDsc_Sel)==0), AV33TFFasDsc_Sel, GXv_char33) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char43 = GXv_char33[0] ;
      GXt_char44 = "" ;
      GXv_char16[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFMaqCodBis_Sel)==0), AV35TFMaqCodBis_Sel, GXv_char16) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char44 = GXv_char16[0] ;
      GXt_char45 = "" ;
      GXv_char14[0] = GXt_char45 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarUniMed_Sel)==0), AV37TFBarUniMed_Sel, GXv_char14) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char45 = GXv_char14[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char43+"|"+GXt_char44+"||||"+GXt_char45+"|||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char45 = "" ;
      GXv_char34[0] = GXt_char45 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFFasCod)==0), AV30TFFasCod, GXv_char34) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char45 = GXv_char34[0] ;
      GXt_char44 = "" ;
      GXv_char33[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFFasDsc)==0), AV32TFFasDsc, GXv_char33) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char44 = GXv_char33[0] ;
      GXt_char43 = "" ;
      GXv_char16[0] = GXt_char43 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFMaqCodBis)==0), AV34TFMaqCodBis, GXv_char16) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char43 = GXv_char16[0] ;
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarUniMed)==0), AV36TFBarUniMed, GXv_char14) ;
      analisiscostesbasicosdetalle_wc_impl.this.GXt_char1 = GXv_char14[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFBarOrdLin) ? "" : GXutil.str( AV28TFBarOrdLin, 4, 0))+"|"+GXt_char45+"|"+GXt_char44+"|"+GXt_char43+"||||"+GXt_char1+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV269TFBarTieRea)==0) ? "" : GXutil.str( AV269TFBarTieRea, 5, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV271TFBarTieTeo)==0) ? "" : GXutil.str( AV271TFBarTieTeo, 5, 2))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFBarOrdLin_To) ? "" : GXutil.str( AV29TFBarOrdLin_To, 4, 0))+"||||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV270TFBarTieRea_To)==0) ? "" : GXutil.str( AV270TFBarTieRea_To, 5, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV272TFBarTieTeo_To)==0) ? "" : GXutil.str( AV272TFBarTieTeo_To, 5, 2))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV24Session.getValue(AV319Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFBARORDLIN", "", !((0==AV28TFBarOrdLin)&&(0==AV29TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV29TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFASCOD", "", !(GXutil.strcmp("", AV30TFFasCod)==0), (short)(0), AV30TFFasCod, "", !(GXutil.strcmp("", AV31TFFasCod_Sel)==0), AV31TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFASDSC", "", !(GXutil.strcmp("", AV32TFFasDsc)==0), (short)(0), AV32TFFasDsc, "", !(GXutil.strcmp("", AV33TFFasDsc_Sel)==0), AV33TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV34TFMaqCodBis)==0), (short)(0), AV34TFMaqCodBis, "", !(GXutil.strcmp("", AV35TFMaqCodBis_Sel)==0), AV35TFMaqCodBis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFBARUNIMED", "", !(GXutil.strcmp("", AV36TFBarUniMed)==0), (short)(0), AV36TFBarUniMed, "", !(GXutil.strcmp("", AV37TFBarUniMed_Sel)==0), AV37TFBarUniMed_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFBARTIEREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV269TFBarTieRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV270TFBarTieRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV269TFBarTieRea, 5, 2)), GXutil.trim( GXutil.str( AV270TFBarTieRea_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFBARTIETEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV271TFBarTieTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV272TFBarTieTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV271TFBarTieTeo, 5, 2)), GXutil.trim( GXutil.str( AV272TFBarTieTeo_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      if ( ! (GXutil.strcmp("", AV286Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV286Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV287Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV287Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV288Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV288Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV289BarCodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV289BarCodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV319Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV319Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARFAS" );
      AV266TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV286Emprcod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV266TrnContextAtt, 0);
      AV266TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcod" );
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV287Barcod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV266TrnContextAtt, 0);
      AV266TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Barcodreo" );
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV288Barcodreo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV266TrnContextAtt, 0);
      AV266TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodpar" );
      AV266TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV289BarCodpar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV266TrnContextAtt, 0);
      AV24Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_19Z2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV25ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_19Z2( true) ;
      }
      else
      {
         wb_table2_28_19Z2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_19Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_19Z2e( true) ;
      }
      else
      {
         wb_table1_23_19Z2e( false) ;
      }
   }

   public void wb_table2_28_19Z2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_AnalisisCostesBasicosDetalle_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_19Z2e( true) ;
      }
      else
      {
         wb_table2_28_19Z2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV286Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286Emprcod", AV286Emprcod);
      AV287Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV287Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV287Barcod), 8, 0));
      AV288Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV288Barcodreo", GXutil.str( AV288Barcodreo, 1, 0));
      AV289BarCodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV289BarCodpar", AV289BarCodpar);
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
      pa19Z2( ) ;
      ws19Z2( ) ;
      we19Z2( ) ;
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
      sCtrlAV286Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV287Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV288Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV289BarCodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19Z2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "analisiscostesbasicosdetalle_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19Z2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV286Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286Emprcod", AV286Emprcod);
         AV287Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV287Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV287Barcod), 8, 0));
         AV288Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV288Barcodreo", GXutil.str( AV288Barcodreo, 1, 0));
         AV289BarCodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV289BarCodpar", AV289BarCodpar);
      }
      wcpOAV286Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV286Emprcod") ;
      wcpOAV287Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV287Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV288Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV288Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV289BarCodpar = httpContext.cgiGet( sPrefix+"wcpOAV289BarCodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV286Emprcod, wcpOAV286Emprcod) != 0 ) || ( AV287Barcod != wcpOAV287Barcod ) || ( AV288Barcodreo != wcpOAV288Barcodreo ) || ( GXutil.strcmp(AV289BarCodpar, wcpOAV289BarCodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV286Emprcod = AV286Emprcod ;
      wcpOAV287Barcod = AV287Barcod ;
      wcpOAV288Barcodreo = AV288Barcodreo ;
      wcpOAV289BarCodpar = AV289BarCodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV286Emprcod = httpContext.cgiGet( sPrefix+"AV286Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV286Emprcod) > 0 )
      {
         AV286Emprcod = httpContext.cgiGet( sCtrlAV286Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV286Emprcod", AV286Emprcod);
      }
      else
      {
         AV286Emprcod = httpContext.cgiGet( sPrefix+"AV286Emprcod_PARM") ;
      }
      sCtrlAV287Barcod = httpContext.cgiGet( sPrefix+"AV287Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV287Barcod) > 0 )
      {
         AV287Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV287Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV287Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV287Barcod), 8, 0));
      }
      else
      {
         AV287Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV287Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV288Barcodreo = httpContext.cgiGet( sPrefix+"AV288Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV288Barcodreo) > 0 )
      {
         AV288Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV288Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV288Barcodreo", GXutil.str( AV288Barcodreo, 1, 0));
      }
      else
      {
         AV288Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV288Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV289BarCodpar = httpContext.cgiGet( sPrefix+"AV289BarCodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV289BarCodpar) > 0 )
      {
         AV289BarCodpar = httpContext.cgiGet( sCtrlAV289BarCodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV289BarCodpar", AV289BarCodpar);
      }
      else
      {
         AV289BarCodpar = httpContext.cgiGet( sPrefix+"AV289BarCodpar_PARM") ;
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
      pa19Z2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19Z2( ) ;
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
      ws19Z2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV286Emprcod_PARM", GXutil.rtrim( AV286Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV286Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV286Emprcod_CTRL", GXutil.rtrim( sCtrlAV286Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV287Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV287Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV287Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV287Barcod_CTRL", GXutil.rtrim( sCtrlAV287Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV288Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV288Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV288Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV288Barcodreo_CTRL", GXutil.rtrim( sCtrlAV288Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV289BarCodpar_PARM", GXutil.rtrim( AV289BarCodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV289BarCodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV289BarCodpar_CTRL", GXutil.rtrim( sCtrlAV289BarCodpar));
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
      we19Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202641319445688", true, true);
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
      httpContext.AddJavascriptSource("analisiscostesbasicosdetalle_wc.js", "?202641319445688", false, true);
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

   public void subsflControlProps_442( )
   {
      edtavRecuperaciondevariables_Internalname = sPrefix+"vRECUPERACIONDEVARIABLES_"+sGXsfl_44_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_44_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_44_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_44_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_44_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_44_idx ;
      edtavUnidades_Internalname = sPrefix+"vUNIDADES_"+sGXsfl_44_idx ;
      edtavUnidadest_Internalname = sPrefix+"vUNIDADEST_"+sGXsfl_44_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_44_idx ;
      edtavHorini_5_Internalname = sPrefix+"vHORINI_5_"+sGXsfl_44_idx ;
      edtavHorfin_5_Internalname = sPrefix+"vHORFIN_5_"+sGXsfl_44_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_44_idx ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO_"+sGXsfl_44_idx ;
      edtavTteo_Internalname = sPrefix+"vTTEO_"+sGXsfl_44_idx ;
      edtavMaqcosmin_Internalname = sPrefix+"vMAQCOSMIN_"+sGXsfl_44_idx ;
      edtavCoste_m_Internalname = sPrefix+"vCOSTE_M_"+sGXsfl_44_idx ;
      edtavCoste_tm_Internalname = sPrefix+"vCOSTE_TM_"+sGXsfl_44_idx ;
      edtavTiempo_m_Internalname = sPrefix+"vTIEMPO_M_"+sGXsfl_44_idx ;
      edtProCod_Internalname = sPrefix+"PROCOD_"+sGXsfl_44_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_44_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_44_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_44_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_44_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      edtavRecuperaciondevariables_Internalname = sPrefix+"vRECUPERACIONDEVARIABLES_"+sGXsfl_44_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_44_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_44_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_44_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_44_fel_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_44_fel_idx ;
      edtavUnidades_Internalname = sPrefix+"vUNIDADES_"+sGXsfl_44_fel_idx ;
      edtavUnidadest_Internalname = sPrefix+"vUNIDADEST_"+sGXsfl_44_fel_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_44_fel_idx ;
      edtavHorini_5_Internalname = sPrefix+"vHORINI_5_"+sGXsfl_44_fel_idx ;
      edtavHorfin_5_Internalname = sPrefix+"vHORFIN_5_"+sGXsfl_44_fel_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_44_fel_idx ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO_"+sGXsfl_44_fel_idx ;
      edtavTteo_Internalname = sPrefix+"vTTEO_"+sGXsfl_44_fel_idx ;
      edtavMaqcosmin_Internalname = sPrefix+"vMAQCOSMIN_"+sGXsfl_44_fel_idx ;
      edtavCoste_m_Internalname = sPrefix+"vCOSTE_M_"+sGXsfl_44_fel_idx ;
      edtavCoste_tm_Internalname = sPrefix+"vCOSTE_TM_"+sGXsfl_44_fel_idx ;
      edtavTiempo_m_Internalname = sPrefix+"vTIEMPO_M_"+sGXsfl_44_fel_idx ;
      edtProCod_Internalname = sPrefix+"PROCOD_"+sGXsfl_44_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_44_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_44_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_44_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_44_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb19Z0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecuperaciondevariables_Internalname,GXutil.ltrim( localUtil.ntoc( AV264RecuperaciondeVariables, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecuperaciondevariables_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV264RecuperaciondeVariables), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV264RecuperaciondeVariables), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecuperaciondevariables_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecuperaciondevariables_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCodBis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV285MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqdsc_Visible),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavUnidades_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUnidades_Internalname,GXutil.ltrim( localUtil.ntoc( AV16Unidades, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavUnidades_Enabled!=0) ? localUtil.format( AV16Unidades, "ZZZZZ9.99") : localUtil.format( AV16Unidades, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavUnidades_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavUnidades_Visible),Integer.valueOf(edtavUnidades_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavUnidadest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUnidadest_Internalname,GXutil.ltrim( localUtil.ntoc( AV17Unidadest, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavUnidadest_Enabled!=0) ? localUtil.format( AV17Unidadest, "ZZZZZ9.99") : localUtil.format( AV17Unidadest, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavUnidadest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavUnidadest_Visible),Integer.valueOf(edtavUnidadest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarUniMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarUniMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHorini_5_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorini_5_Internalname,GXutil.rtrim( AV157HorIni_5),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHorini_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHorini_5_Visible),Integer.valueOf(edtavHorini_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHorfin_5_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorfin_5_Internalname,GXutil.rtrim( AV155HorFin_5),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHorfin_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHorfin_5_Visible),Integer.valueOf(edtavHorfin_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTieRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTieTeo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTieTeo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTteo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTteo_Internalname,GXutil.ltrim( localUtil.ntoc( AV268Tteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTteo_Enabled!=0) ? localUtil.format( AV268Tteo, "Z9.99") : localUtil.format( AV268Tteo, "Z9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTteo_Visible),Integer.valueOf(edtavTteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavMaqcosmin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcosmin_Internalname,GXutil.ltrim( localUtil.ntoc( AV193MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaqcosmin_Enabled!=0) ? localUtil.format( AV193MaqCosMin, "ZZZZ9.9999") : localUtil.format( AV193MaqCosMin, "ZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcosmin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqcosmin_Visible),Integer.valueOf(edtavMaqcosmin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCoste_m_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_m_Internalname,GXutil.ltrim( localUtil.ntoc( AV95Coste_m, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_m_Enabled!=0) ? localUtil.format( AV95Coste_m, "ZZZZZZ9.99") : localUtil.format( AV95Coste_m, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCoste_m_Visible),Integer.valueOf(edtavCoste_m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCoste_tm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_tm_Internalname,GXutil.ltrim( localUtil.ntoc( AV106Coste_tm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_tm_Enabled!=0) ? localUtil.format( AV106Coste_tm, "ZZZZZZZZ9.99") : localUtil.format( AV106Coste_tm, "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_tm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCoste_tm_Visible),Integer.valueOf(edtavCoste_tm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTiempo_m_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTiempo_m_Internalname,GXutil.ltrim( localUtil.ntoc( AV234Tiempo_m, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTiempo_m_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV234Tiempo_m), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV234Tiempo_m), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTiempo_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTiempo_m_Visible),Integer.valueOf(edtavTiempo_m_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19Z2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"44\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavUnidades_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavUnidadest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und Totales", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarUniMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHorini_5_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHorfin_5_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTieRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTieTeo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T Teo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTteo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqcosmin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Minuto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCoste_m_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCoste_tm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Teo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTiempo_m_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo (m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV264RecuperaciondeVariables, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecuperaciondevariables_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV285MaqDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16Unidades, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUnidades_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavUnidades_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17Unidadest, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUnidadest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavUnidadest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarUniMed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV157HorIni_5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorini_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHorini_5_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV155HorFin_5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorfin_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHorfin_5_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTieRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV268Tteo, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTteo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV193MaqCosMin, (byte)(10), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcosmin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcosmin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV95Coste_m, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCoste_m_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV106Coste_tm, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_tm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCoste_tm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV234Tiempo_m, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTiempo_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTiempo_m_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
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
      edtavRecuperaciondevariables_Internalname = sPrefix+"vRECUPERACIONDEVARIABLES" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      edtavUnidades_Internalname = sPrefix+"vUNIDADES" ;
      edtavUnidadest_Internalname = sPrefix+"vUNIDADEST" ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED" ;
      edtavHorini_5_Internalname = sPrefix+"vHORINI_5" ;
      edtavHorfin_5_Internalname = sPrefix+"vHORFIN_5" ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA" ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO" ;
      edtavTteo_Internalname = sPrefix+"vTTEO" ;
      edtavMaqcosmin_Internalname = sPrefix+"vMAQCOSMIN" ;
      edtavCoste_m_Internalname = sPrefix+"vCOSTE_M" ;
      edtavCoste_tm_Internalname = sPrefix+"vCOSTE_TM" ;
      edtavTiempo_m_Internalname = sPrefix+"vTIEMPO_M" ;
      edtProCod_Internalname = sPrefix+"PROCOD" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtavTiempo_m_Jsonclick = "" ;
      edtavTiempo_m_Enabled = 0 ;
      edtavCoste_tm_Jsonclick = "" ;
      edtavCoste_tm_Enabled = 0 ;
      edtavCoste_m_Jsonclick = "" ;
      edtavCoste_m_Enabled = 0 ;
      edtavMaqcosmin_Jsonclick = "" ;
      edtavMaqcosmin_Enabled = 0 ;
      edtavTteo_Jsonclick = "" ;
      edtavTteo_Enabled = 0 ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtavHorfin_5_Jsonclick = "" ;
      edtavHorfin_5_Enabled = 0 ;
      edtavHorini_5_Jsonclick = "" ;
      edtavHorini_5_Enabled = 0 ;
      edtBarUniMed_Jsonclick = "" ;
      edtavUnidadest_Jsonclick = "" ;
      edtavUnidadest_Enabled = 0 ;
      edtavUnidades_Jsonclick = "" ;
      edtavUnidades_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtavRecuperaciondevariables_Jsonclick = "" ;
      edtavRecuperaciondevariables_Enabled = 0 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTiempo_m_Visible = -1 ;
      edtavCoste_tm_Visible = -1 ;
      edtavCoste_m_Visible = -1 ;
      edtavMaqcosmin_Visible = -1 ;
      edtavTteo_Visible = -1 ;
      edtBarTieTeo_Visible = -1 ;
      edtBarTieRea_Visible = -1 ;
      edtavHorfin_5_Visible = -1 ;
      edtavHorini_5_Visible = -1 ;
      edtBarUniMed_Visible = -1 ;
      edtavUnidadest_Visible = -1 ;
      edtavUnidades_Visible = -1 ;
      edtavMaqdsc_Visible = -1 ;
      edtMaqCodBis_Visible = -1 ;
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "AnalisisCostesBasicosDetalle_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||||Dynamic|||||||||" ;
      Ddo_grid_Includedatalist = "|T|T|T||||T|||||||||" ;
      Ddo_grid_Filterisrange = "T||||||||||T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character||||Character|||Numeric|Numeric|||||" ;
      Ddo_grid_Includefilter = "T|T|T|T||||T|||T|T|||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||||T|||T|T|||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||||5|||6|7|||||" ;
      Ddo_grid_Columnids = "1:BarOrdLin|2:FasCod|3:FasDsc|4:MaqCodBis|5:MaqDsc|6:Unidades|7:Unidadest|8:BarUniMed|9:HorIni_5|10:HorFin_5|11:BarTieRea|12:BarTieTeo|13:Tteo|14:MaqCosMin|15:Coste_m|16:Coste_tm|17:Tiempo_m" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtavUnidades_Visible',ctrl:'vUNIDADES',prop:'Visible'},{av:'edtavUnidadest_Visible',ctrl:'vUNIDADEST',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'edtavHorini_5_Visible',ctrl:'vHORINI_5',prop:'Visible'},{av:'edtavHorfin_5_Visible',ctrl:'vHORFIN_5',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'edtBarTieTeo_Visible',ctrl:'BARTIETEO',prop:'Visible'},{av:'edtavTteo_Visible',ctrl:'vTTEO',prop:'Visible'},{av:'edtavMaqcosmin_Visible',ctrl:'vMAQCOSMIN',prop:'Visible'},{av:'edtavCoste_m_Visible',ctrl:'vCOSTE_M',prop:'Visible'},{av:'edtavCoste_tm_Visible',ctrl:'vCOSTE_TM',prop:'Visible'},{av:'edtavTiempo_m_Visible',ctrl:'vTIEMPO_M',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1219Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1319Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1419Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2019Z2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV17Unidadest',fld:'vUNIDADEST',pic:'ZZZZZ9.99'},{av:'AV16Unidades',fld:'vUNIDADES',pic:'ZZZZZ9.99'},{av:'AV268Tteo',fld:'vTTEO',pic:'Z9.99'},{av:'AV155HorFin_5',fld:'vHORFIN_5',pic:''},{av:'AV157HorIni_5',fld:'vHORINI_5',pic:''},{av:'AV234Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9'},{av:'AV193MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999'},{av:'AV106Coste_tm',fld:'vCOSTE_TM',pic:'ZZZZZZZZ9.99'},{av:'AV95Coste_m',fld:'vCOSTE_M',pic:'ZZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV285MaqDsc',fld:'vMAQDSC',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1519Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtavUnidades_Visible',ctrl:'vUNIDADES',prop:'Visible'},{av:'edtavUnidadest_Visible',ctrl:'vUNIDADEST',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'edtavHorini_5_Visible',ctrl:'vHORINI_5',prop:'Visible'},{av:'edtavHorfin_5_Visible',ctrl:'vHORFIN_5',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'edtBarTieTeo_Visible',ctrl:'BARTIETEO',prop:'Visible'},{av:'edtavTteo_Visible',ctrl:'vTTEO',prop:'Visible'},{av:'edtavMaqcosmin_Visible',ctrl:'vMAQCOSMIN',prop:'Visible'},{av:'edtavCoste_m_Visible',ctrl:'vCOSTE_M',prop:'Visible'},{av:'edtavCoste_tm_Visible',ctrl:'vCOSTE_TM',prop:'Visible'},{av:'edtavTiempo_m_Visible',ctrl:'vTIEMPO_M',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1119Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV286Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV287Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV288Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV289BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV319Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV232TasasEstandar',fld:'vTASASESTANDAR',pic:'9',hsh:true},{av:'AV295Analisiscostesbasicosdetalle_wcds_1_emprcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV296Analisiscostesbasicosdetalle_wcds_2_barcod',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_3_BARCODREO',pic:'9'},{av:'AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar',fld:'vANALISISCOSTESBASICOSDETALLE_WCDS_4_BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV29TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV30TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV31TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV32TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV33TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV34TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV35TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV37TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV269TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV270TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV271TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV272TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavMaqdsc_Visible',ctrl:'vMAQDSC',prop:'Visible'},{av:'edtavUnidades_Visible',ctrl:'vUNIDADES',prop:'Visible'},{av:'edtavUnidadest_Visible',ctrl:'vUNIDADEST',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'edtavHorini_5_Visible',ctrl:'vHORINI_5',prop:'Visible'},{av:'edtavHorfin_5_Visible',ctrl:'vHORFIN_5',prop:'Visible'},{av:'edtBarTieRea_Visible',ctrl:'BARTIEREA',prop:'Visible'},{av:'edtBarTieTeo_Visible',ctrl:'BARTIETEO',prop:'Visible'},{av:'edtavTteo_Visible',ctrl:'vTTEO',prop:'Visible'},{av:'edtavMaqcosmin_Visible',ctrl:'vMAQCOSMIN',prop:'Visible'},{av:'edtavCoste_m_Visible',ctrl:'vCOSTE_M',prop:'Visible'},{av:'edtavCoste_tm_Visible',ctrl:'vCOSTE_TM',prop:'Visible'},{av:'edtavTiempo_m_Visible',ctrl:'vTIEMPO_M',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1619Z2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1719Z2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      wcpOAV286Emprcod = "" ;
      wcpOAV289BarCodpar = "" ;
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
      AV286Emprcod = "" ;
      AV289BarCodpar = "" ;
      AV15FilterFullText = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV30TFFasCod = "" ;
      AV31TFFasCod_Sel = "" ;
      AV32TFFasDsc = "" ;
      AV33TFFasDsc_Sel = "" ;
      AV34TFMaqCodBis = "" ;
      AV35TFMaqCodBis_Sel = "" ;
      AV36TFBarUniMed = "" ;
      AV37TFBarUniMed_Sel = "" ;
      AV269TFBarTieRea = DecimalUtil.ZERO ;
      AV270TFBarTieRea_To = DecimalUtil.ZERO ;
      AV271TFBarTieTeo = DecimalUtil.ZERO ;
      AV272TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV319Pgmname = "" ;
      AV295Analisiscostesbasicosdetalle_wcds_1_emprcod = "" ;
      AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV25ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      AV285MaqDsc = "" ;
      AV16Unidades = DecimalUtil.ZERO ;
      AV17Unidadest = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      AV157HorIni_5 = "" ;
      AV155HorFin_5 = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      AV268Tteo = DecimalUtil.ZERO ;
      AV193MaqCosMin = DecimalUtil.ZERO ;
      AV95Coste_m = DecimalUtil.ZERO ;
      AV106Coste_tm = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      lV302Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = "" ;
      AV302Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = "" ;
      AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = "" ;
      AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = "" ;
      AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea = DecimalUtil.ZERO ;
      AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = DecimalUtil.ZERO ;
      AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = DecimalUtil.ZERO ;
      H019Z3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_n3837BarFasKgm = new boolean[] {false} ;
      H019Z3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_n5719BarFasKgT = new boolean[] {false} ;
      H019Z3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_n5720BarFasMtT = new boolean[] {false} ;
      H019Z3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_n3838BarFasMtr = new boolean[] {false} ;
      H019Z3_A165BarHorIni = new short[1] ;
      H019Z3_A164BarHorFin = new short[1] ;
      H019Z3_A396EmprCod = new String[] {""} ;
      H019Z3_A130BarCodPar = new String[] {""} ;
      H019Z3_A132BarCodReo = new byte[1] ;
      H019Z3_A129BarCod = new int[1] ;
      H019Z3_A212BarSer = new String[] {""} ;
      H019Z3_A252CliCod = new int[1] ;
      H019Z3_n252CliCod = new boolean[] {false} ;
      H019Z3_A758ProCod = new String[] {""} ;
      H019Z3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_A228BarUniMed = new String[] {""} ;
      H019Z3_A603MaqCodBis = new String[] {""} ;
      H019Z3_A460FasDsc = new String[] {""} ;
      H019Z3_A457FasCod = new String[] {""} ;
      H019Z3_A194BarOrdLin = new short[1] ;
      H019Z3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019Z5_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV292Station = "" ;
      AV293Emprnom = "" ;
      AV294Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV20ColumnsSelectorXML = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      AV99Coste_mmod = DecimalUtil.ZERO ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      AV100Coste_mmoi = DecimalUtil.ZERO ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      AV97Coste_menergia = DecimalUtil.ZERO ;
      GXv_decimal29 = new java.math.BigDecimal[1] ;
      AV98Coste_mgas = DecimalUtil.ZERO ;
      GXv_decimal30 = new java.math.BigDecimal[1] ;
      AV96Coste_mAgua = DecimalUtil.ZERO ;
      GXv_decimal31 = new java.math.BigDecimal[1] ;
      GXv_int32 = new int[1] ;
      GXv_decimal35 = new java.math.BigDecimal[1] ;
      GXv_decimal36 = new java.math.BigDecimal[1] ;
      GXv_decimal37 = new java.math.BigDecimal[1] ;
      AV314Coste_p_k = DecimalUtil.ZERO ;
      GXv_decimal38 = new java.math.BigDecimal[1] ;
      AV315Ceros4 = "" ;
      AV316Horini = "" ;
      AV317Lenvar = DecimalUtil.ZERO ;
      AV318Horfin = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26ManageFiltersXml = "" ;
      AV18ExcelFilename = "" ;
      AV19ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector39 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector40 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item42 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char45 = "" ;
      GXv_char34 = new String[1] ;
      GXt_char44 = "" ;
      GXv_char33 = new String[1] ;
      GXt_char43 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char14 = new String[1] ;
      GXv_SdtWWPGridState46 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV266TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV286Emprcod = "" ;
      sCtrlAV287Barcod = "" ;
      sCtrlAV288Barcodreo = "" ;
      sCtrlAV289BarCodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicosdetalle_wc__default(),
         new Object[] {
             new Object[] {
            H019Z3_A3837BarFasKgm, H019Z3_n3837BarFasKgm, H019Z3_A5719BarFasKgT, H019Z3_n5719BarFasKgT, H019Z3_A5720BarFasMtT, H019Z3_n5720BarFasMtT, H019Z3_A3838BarFasMtr, H019Z3_n3838BarFasMtr, H019Z3_A165BarHorIni, H019Z3_A164BarHorFin,
            H019Z3_A396EmprCod, H019Z3_A130BarCodPar, H019Z3_A132BarCodReo, H019Z3_A129BarCod, H019Z3_A212BarSer, H019Z3_A252CliCod, H019Z3_n252CliCod, H019Z3_A758ProCod, H019Z3_A216BarTieTeo, H019Z3_A215BarTieRea,
            H019Z3_A228BarUniMed, H019Z3_A603MaqCodBis, H019Z3_A460FasDsc, H019Z3_A457FasCod, H019Z3_A194BarOrdLin, H019Z3_A166BarKgm, H019Z3_A184BarMtr
            }
            , new Object[] {
            H019Z5_AGRID_nRecordCount
            }
         }
      );
      AV319Pgmname = "AnalisisCostesBasicosDetalle_WC" ;
      /* GeneXus formulas. */
      AV319Pgmname = "AnalisisCostesBasicosDetalle_WC" ;
      Gx_err = (short)(0) ;
      edtavRecuperaciondevariables_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavUnidades_Enabled = 0 ;
      edtavUnidadest_Enabled = 0 ;
      edtavHorini_5_Enabled = 0 ;
      edtavHorfin_5_Enabled = 0 ;
      edtavTteo_Enabled = 0 ;
      edtavMaqcosmin_Enabled = 0 ;
      edtavCoste_m_Enabled = 0 ;
      edtavCoste_tm_Enabled = 0 ;
      edtavTiempo_m_Enabled = 0 ;
   }

   private byte wcpOAV288Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV288Barcodreo ;
   private byte AV27ManageFiltersExecutionStep ;
   private byte AV232TasasEstandar ;
   private byte AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte GXv_int17[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV28TFBarOrdLin ;
   private short AV29TFBarOrdLin_To ;
   private short AV12OrderedBy ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV264RecuperaciondeVariables ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ;
   private short AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ;
   private int wcpOAV287Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_44 ;
   private int AV287Barcod ;
   private int nGXsfl_44_idx=1 ;
   private int AV296Analisiscostesbasicosdetalle_wcds_2_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtEmprCod_Visible ;
   private int AV234Tiempo_m ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavRecuperaciondevariables_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavUnidades_Enabled ;
   private int edtavUnidadest_Enabled ;
   private int edtavHorini_5_Enabled ;
   private int edtavHorfin_5_Enabled ;
   private int edtavTteo_Enabled ;
   private int edtavMaqcosmin_Enabled ;
   private int edtavCoste_m_Enabled ;
   private int edtavCoste_tm_Enabled ;
   private int edtavTiempo_m_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtBarOrdLin_Visible ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtMaqCodBis_Visible ;
   private int edtavMaqdsc_Visible ;
   private int edtavUnidades_Visible ;
   private int edtavUnidadest_Visible ;
   private int edtBarUniMed_Visible ;
   private int edtavHorini_5_Visible ;
   private int edtavHorfin_5_Visible ;
   private int edtBarTieRea_Visible ;
   private int edtBarTieTeo_Visible ;
   private int edtavTteo_Visible ;
   private int edtavMaqcosmin_Visible ;
   private int edtavCoste_m_Visible ;
   private int edtavCoste_tm_Visible ;
   private int edtavTiempo_m_Visible ;
   private int AV39PageToGo ;
   private int GXv_int8[] ;
   private int GXv_int15[] ;
   private int GXv_int32[] ;
   private int AV320GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV40GridCurrentPage ;
   private long AV41GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV269TFBarTieRea ;
   private java.math.BigDecimal AV270TFBarTieRea_To ;
   private java.math.BigDecimal AV271TFBarTieTeo ;
   private java.math.BigDecimal AV272TFBarTieTeo_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal AV17Unidadest ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV268Tteo ;
   private java.math.BigDecimal AV193MaqCosMin ;
   private java.math.BigDecimal AV95Coste_m ;
   private java.math.BigDecimal AV106Coste_tm ;
   private java.math.BigDecimal AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea ;
   private java.math.BigDecimal AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ;
   private java.math.BigDecimal AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ;
   private java.math.BigDecimal AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal AV99Coste_mmod ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal AV100Coste_mmoi ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal AV97Coste_menergia ;
   private java.math.BigDecimal GXv_decimal29[] ;
   private java.math.BigDecimal AV98Coste_mgas ;
   private java.math.BigDecimal GXv_decimal30[] ;
   private java.math.BigDecimal AV96Coste_mAgua ;
   private java.math.BigDecimal GXv_decimal31[] ;
   private java.math.BigDecimal GXv_decimal35[] ;
   private java.math.BigDecimal GXv_decimal36[] ;
   private java.math.BigDecimal GXv_decimal37[] ;
   private java.math.BigDecimal AV314Coste_p_k ;
   private java.math.BigDecimal GXv_decimal38[] ;
   private java.math.BigDecimal AV317Lenvar ;
   private String wcpOAV286Emprcod ;
   private String wcpOAV289BarCodpar ;
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
   private String AV286Emprcod ;
   private String AV289BarCodpar ;
   private String sGXsfl_44_idx="0001" ;
   private String AV30TFFasCod ;
   private String AV31TFFasCod_Sel ;
   private String AV32TFFasDsc ;
   private String AV33TFFasDsc_Sel ;
   private String AV34TFMaqCodBis ;
   private String AV35TFMaqCodBis_Sel ;
   private String AV36TFBarUniMed ;
   private String AV37TFBarUniMed_Sel ;
   private String AV319Pgmname ;
   private String AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ;
   private String AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ;
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
   private String Ddo_grid_Datalistproc ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divTablecontent_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavRecuperaciondevariables_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String AV285MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtavUnidades_Internalname ;
   private String edtavUnidadest_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String AV157HorIni_5 ;
   private String edtavHorini_5_Internalname ;
   private String AV155HorFin_5 ;
   private String edtavHorfin_5_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtavTteo_Internalname ;
   private String edtavMaqcosmin_Internalname ;
   private String edtavCoste_m_Internalname ;
   private String edtavCoste_tm_Internalname ;
   private String edtavTiempo_m_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String scmdbuf ;
   private String lV302Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String lV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String lV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String lV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ;
   private String AV302Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ;
   private String AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ;
   private String AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ;
   private String AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String hsh ;
   private String AV292Station ;
   private String AV293Emprnom ;
   private String AV294Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String AV315Ceros4 ;
   private String AV316Horini ;
   private String AV318Horfin ;
   private String GXt_char45 ;
   private String GXv_char34[] ;
   private String GXt_char44 ;
   private String GXv_char33[] ;
   private String GXt_char43 ;
   private String GXv_char16[] ;
   private String GXt_char1 ;
   private String GXv_char14[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV286Emprcod ;
   private String sCtrlAV287Barcod ;
   private String sCtrlAV288Barcodreo ;
   private String sCtrlAV289BarCodpar ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavRecuperaciondevariables_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavUnidades_Jsonclick ;
   private String edtavUnidadest_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String edtavHorini_5_Jsonclick ;
   private String edtavHorfin_5_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtavTteo_Jsonclick ;
   private String edtavMaqcosmin_Jsonclick ;
   private String edtavCoste_m_Jsonclick ;
   private String edtavCoste_tm_Jsonclick ;
   private String edtavTiempo_m_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
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
   private boolean n252CliCod ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n3837BarFasKgm ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV20ColumnsSelectorXML ;
   private String AV26ManageFiltersXml ;
   private String AV21UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String AV18ExcelFilename ;
   private String AV19ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H019Z3_A3837BarFasKgm ;
   private boolean[] H019Z3_n3837BarFasKgm ;
   private java.math.BigDecimal[] H019Z3_A5719BarFasKgT ;
   private boolean[] H019Z3_n5719BarFasKgT ;
   private java.math.BigDecimal[] H019Z3_A5720BarFasMtT ;
   private boolean[] H019Z3_n5720BarFasMtT ;
   private java.math.BigDecimal[] H019Z3_A3838BarFasMtr ;
   private boolean[] H019Z3_n3838BarFasMtr ;
   private short[] H019Z3_A165BarHorIni ;
   private short[] H019Z3_A164BarHorFin ;
   private String[] H019Z3_A396EmprCod ;
   private String[] H019Z3_A130BarCodPar ;
   private byte[] H019Z3_A132BarCodReo ;
   private int[] H019Z3_A129BarCod ;
   private String[] H019Z3_A212BarSer ;
   private int[] H019Z3_A252CliCod ;
   private boolean[] H019Z3_n252CliCod ;
   private String[] H019Z3_A758ProCod ;
   private java.math.BigDecimal[] H019Z3_A216BarTieTeo ;
   private java.math.BigDecimal[] H019Z3_A215BarTieRea ;
   private String[] H019Z3_A228BarUniMed ;
   private String[] H019Z3_A603MaqCodBis ;
   private String[] H019Z3_A460FasDsc ;
   private String[] H019Z3_A457FasCod ;
   private short[] H019Z3_A194BarOrdLin ;
   private java.math.BigDecimal[] H019Z3_A166BarKgm ;
   private java.math.BigDecimal[] H019Z3_A184BarMtr ;
   private long[] H019Z5_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV25ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item41 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item42[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector39[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector40[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState46[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV266TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class analisiscostesbasicosdetalle_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H019Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV302Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV296Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int47 = new byte[28];
      Object[] GXv_Object48 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.BarFasKgm, T1.BarFasKgT, T1.BarFasMtT, T1.BarFasMtr, T1.BarHorIni, T1.BarHorFin, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarSer, T2.CliCod, T1.ProCod," ;
      sSelectString += " T1.BarTieTeo, T1.BarTieRea, T2.BarUniMed, T1.MaqCodBis, T4.FasDsc, T1.FasCod, T1.BarOrdLin, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr" ;
      sFromString = " FROM (((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T4 ON" ;
      sFromString += " T4.EmprCod = T1.EmprCod AND T4.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T4.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int47[4] = (byte)(1) ;
         GXv_int47[5] = (byte)(1) ;
         GXv_int47[6] = (byte)(1) ;
         GXv_int47[7] = (byte)(1) ;
         GXv_int47[8] = (byte)(1) ;
         GXv_int47[9] = (byte)(1) ;
         GXv_int47[10] = (byte)(1) ;
      }
      if ( ! (0==AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int47[11] = (byte)(1) ;
      }
      if ( ! (0==AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int47[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV302Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int47[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.FasDsc = ?)");
      }
      else
      {
         GXv_int47[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int47[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int47[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int47[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int47[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int47[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int47[24] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T4.FasDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T4.FasDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.BarUniMed DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieTeo" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieTeo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object48[0] = scmdbuf ;
      GXv_Object48[1] = GXv_int47 ;
      return GXv_Object48 ;
   }

   protected Object[] conditional_H019Z5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV302Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV295Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV296Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV297Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV298Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int49 = new byte[25];
      Object[] GXv_Object50 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPBARFAS T1 INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV299Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T3.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int49[4] = (byte)(1) ;
         GXv_int49[5] = (byte)(1) ;
         GXv_int49[6] = (byte)(1) ;
         GXv_int49[7] = (byte)(1) ;
         GXv_int49[8] = (byte)(1) ;
         GXv_int49[9] = (byte)(1) ;
         GXv_int49[10] = (byte)(1) ;
      }
      if ( ! (0==AV300Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int49[11] = (byte)(1) ;
      }
      if ( ! (0==AV301Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int49[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV302Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV303Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int49[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV304Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV305Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int49[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV306Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV307Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int49[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV308Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int49[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV309Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarUniMed = ?)");
      }
      else
      {
         GXv_int49[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV310Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int49[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV311Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int49[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV312Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int49[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV313Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int49[24] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object50[0] = scmdbuf ;
      GXv_Object50[1] = GXv_int49 ;
      return GXv_Object50 ;
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
                  return conditional_H019Z3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
            case 1 :
                  return conditional_H019Z5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019Z5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 28);
               ((String[]) buf[23])[0] = rslt.getString(19, 8);
               ((short[]) buf[24])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
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
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
      }
   }

}

