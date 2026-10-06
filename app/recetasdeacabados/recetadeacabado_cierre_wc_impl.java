package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadeacabado_cierre_wc_impl extends GXWebComponent
{
   public recetadeacabado_cierre_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadeacabado_cierre_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado_cierre_wc_impl.class ));
   }

   public recetadeacabado_cierre_wc_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV153Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
               AV154Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154Barcod), 8, 0));
               AV155Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Barcodreo", GXutil.str( AV155Barcodreo, 1, 0));
               AV156Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156Barcodpar", AV156Barcodpar);
               AV157FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157FechaCierre", localUtil.format(AV157FechaCierre, "99/99/99"));
               AV158RecAcab = httpContext.GetPar( "RecAcab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158RecAcab", AV158RecAcab);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV153Emprcod,Integer.valueOf(AV154Barcod),Byte.valueOf(AV155Barcodreo),AV156Barcodpar,AV157FechaCierre,AV158RecAcab});
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV153Emprcod = httpContext.GetPar( "Emprcod") ;
      AV154Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV155Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV156Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV158RecAcab = httpContext.GetPar( "RecAcab") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV34TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV35TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV50TFRecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq"))) ;
      AV51TFRecLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq_To"))) ;
      AV160TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV161TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV36TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV37TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV38TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV39TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV40TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV41TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV42TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV43TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV44TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV45TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV46TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV47TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV48TFBarNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli"))) ;
      AV49TFBarNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli_To"))) ;
      AV52TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV53TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV54TFRecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd"))) ;
      AV55TFRecVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd_To"))) ;
      AV162TFRecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgm"), ".") ;
      AV163TFRecTotKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgm_To"), ".") ;
      AV164TFRecFecAlt = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecFecAlt")) ;
      AV168TFBarNumAny = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAny"))) ;
      AV169TFBarNumAny_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAny_To"))) ;
      AV190Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV157FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
      A6034Ac_Metros = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Metros"), ".") ;
      n6034Ac_Metros = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1O72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Detalle de Recetas de Acabado Pendientes de Cerrar", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabados.recetadeacabado_cierre_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV153Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV154Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV155Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV156Barcodpar)),GXutil.URLEncode(GXutil.formatDateParm(AV157FechaCierre)),GXutil.URLEncode(GXutil.rtrim(AV158RecAcab))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","FechaCierre","RecAcab"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeAcabado_Cierre_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV190Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabados\\recetadeacabado_cierre_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV146DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV146DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV153Emprcod", GXutil.rtrim( wcpOAV153Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV154Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV154Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV155Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV155Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV156Barcodpar", GXutil.rtrim( wcpOAV156Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV157FechaCierre", localUtil.dtoc( wcpOAV157FechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV158RecAcab", GXutil.rtrim( wcpOAV158RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV34TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV35TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV50TFRecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV51TFRecLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV160TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV161TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV36TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV37TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV38TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV39TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV40TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV41TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV42TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV44TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV45TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV46TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV47TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV48TFBarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV49TFBarNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV52TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV53TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV54TFRecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV55TFRecVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV162TFRecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECTOTKGM_TO", GXutil.ltrim( localUtil.ntoc( AV163TFRecTotKgm_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFECALT", localUtil.ttoc( AV164TFRecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANY", GXutil.ltrim( localUtil.ntoc( AV168TFBarNumAny, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANY_TO", GXutil.ltrim( localUtil.ntoc( AV169TFBarNumAny_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV153Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV154Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV155Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV156Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECACAB", GXutil.rtrim( AV158RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AC_METROS", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECCIETIN", localUtil.dtoc( AV180FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV181Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV173Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGM", GXutil.ltrim( localUtil.ntoc( AV187FlagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV174Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLTSSR", GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCTOSCONSUMOS", AV178productosconsumos);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vJ", GXutil.ltrim( localUtil.ntoc( AV150j, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECORDLIN", GXutil.ltrim( localUtil.ntoc( A4268RecOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
   }

   public void renderHtmlCloseForm1O72( )
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
      return "RecetasDeAcabados.RecetadeAcabado_Cierre_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Recetas de Acabado Pendientes de Cerrar", "") ;
   }

   public void wb1O70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.recetasdeacabados.recetadeacabado_cierre_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1O72( true) ;
      }
      else
      {
         wb_table1_23_1O72( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1O72e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechacierre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechacierre_Internalname, httpContext.getMessage( "Fecha de Cierre", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavFechacierre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechacierre_Internalname, localUtil.format(AV157FechaCierre, "99/99/99"), localUtil.format( AV157FechaCierre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechacierre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechacierre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechacierre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechacierre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111o71_client"+"'", TempTags, "", 2, "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV190Pgmname), GXutil.rtrim( localUtil.format( AV190Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV146DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV146DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_77_1O72( true) ;
      }
      else
      {
         wb_table2_77_1O72( false) ;
      }
      return  ;
   }

   public void wb_table2_77_1O72e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_82_1O72( true) ;
      }
      else
      {
         wb_table3_82_1O72( false) ;
      }
      return  ;
   }

   public void wb_table3_82_1O72e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecaltauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecaltauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecaltauxdate_Internalname, localUtil.format(AV166DDO_RecFecAltAuxDate, "99/99/99"), localUtil.format( AV166DDO_RecFecAltAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecaltauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecaltauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RecetasDeAcabados\\RecetadeAcabado_Cierre_WC.htm");
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

   public void start1O72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Recetas de Acabado Pendientes de Cerrar", ""), (short)(0)) ;
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
            strup1O70( ) ;
         }
      }
   }

   public void ws1O72( )
   {
      start1O72( ) ;
      evt1O72( ) ;
   }

   public void evt1O72( )
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
                              strup1O70( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e161O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181O72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
                           AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
                           AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
                           AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
                           AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
                           AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
                           AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
                           AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
                           AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
                           AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
                           AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
                           AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
                           AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
                           AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
                           AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
                           AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
                           AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
                           AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
                           AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
                           AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
                           AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
                           AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
                           AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
                           AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
                           AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
                           AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
                           AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
                           AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
                           AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O70( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV171grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171grupodeacciones), 4, 0));
                           AV151Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV151Seleccionar);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCIDENCIAS");
                              GX_FocusControl = edtavIncidencias_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV149incidencias = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149incidencias), 4, 0));
                           }
                           else
                           {
                              AV149incidencias = (short)(localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149incidencias), 4, 0));
                           }
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV159BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV159BarAgrEst);
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
                           n812RecTotKgm = false ;
                           A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname), 0) ;
                           n4866RecFecAlt = false ;
                           A189BarNumAny = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191O72 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201O72 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211O72 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e221O72 ();
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
                                    strup1O70( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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

   public void we1O72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1O72( ) ;
         }
      }
   }

   public void pa1O72( )
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
            GX_FocusControl = edtavDdo_recfecaltauxdate_Internalname ;
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
                                 String AV153Emprcod ,
                                 int AV154Barcod ,
                                 byte AV155Barcodreo ,
                                 String AV156Barcodpar ,
                                 String AV158RecAcab ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV34TFBarNHdr ,
                                 String AV35TFBarNHdr_Sel ,
                                 short AV50TFRecLinMaq ,
                                 short AV51TFRecLinMaq_To ,
                                 byte AV160TFBarSit ,
                                 byte AV161TFBarSit_To ,
                                 String AV36TFBarSer ,
                                 String AV37TFBarSer_Sel ,
                                 String AV38TFBarSerDsc ,
                                 String AV39TFBarSerDsc_Sel ,
                                 String AV40TFBarColNom ,
                                 String AV41TFBarColNom_Sel ,
                                 int AV42TFBarColNum ,
                                 int AV43TFBarColNum_To ,
                                 byte AV44TFBarTipCol ,
                                 byte AV45TFBarTipCol_To ,
                                 String AV46TFBarNomCli ,
                                 String AV47TFBarNomCli_Sel ,
                                 int AV48TFBarNumCli ,
                                 int AV49TFBarNumCli_To ,
                                 String AV52TFMaqCod ,
                                 String AV53TFMaqCod_Sel ,
                                 int AV54TFRecVolPrd ,
                                 int AV55TFRecVolPrd_To ,
                                 java.math.BigDecimal AV162TFRecTotKgm ,
                                 java.math.BigDecimal AV163TFRecTotKgm_To ,
                                 java.util.Date AV164TFRecFecAlt ,
                                 short AV168TFBarNumAny ,
                                 short AV169TFBarNumAny_To ,
                                 String AV190Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date AV157FechaCierre ,
                                 java.math.BigDecimal A6034Ac_Metros ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201O72 ();
      GRID_nCurrentRecord = 0 ;
      rf1O72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeAcabado_Cierre_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV190Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabados\\recetadeacabado_cierre_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1O72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV190Pgmname = "RecetasDeAcabados.RecetadeAcabado_Cierre_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV190Pgmname", AV190Pgmname);
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechacierre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechacierre_Enabled), 5, 0), true);
      edtavIncidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1O72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e201O72 ();
      nGXsfl_45_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
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
         subsflControlProps_452( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                              AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                              Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                              Short.valueOf(AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                              Byte.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                              Byte.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                              AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                              AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                              AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                              AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                              AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                              AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                              Integer.valueOf(AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                              Integer.valueOf(AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                              Byte.valueOf(AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                              Byte.valueOf(AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                              AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                              AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                              Integer.valueOf(AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                              Integer.valueOf(AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                              AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                              AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                              Integer.valueOf(AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                              Integer.valueOf(AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                              AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                              Short.valueOf(AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                              Short.valueOf(AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                              Integer.valueOf(AV154Barcod) ,
                                              Byte.valueOf(AV155Barcodreo) ,
                                              AV156Barcodpar ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) ,
                                              Byte.valueOf(A213BarSit) ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A218BarTipCol) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              A602MaqCod ,
                                              Integer.valueOf(A2805RecVolPrd) ,
                                              A4866RecFecAlt ,
                                              Short.valueOf(A189BarNumAny) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                              A812RecTotKgm ,
                                              AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                              AV153Emprcod ,
                                              AV158RecAcab ,
                                              A396EmprCod ,
                                              A6039RecAcab } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
         lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
         lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
         lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
         lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
         lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
         /* Using cursor H01O75 */
         pr_default.execute(0, new Object[] {AV153Emprcod, AV158RecAcab, AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV154Barcod), Byte.valueOf(AV155Barcodreo), AV156Barcodpar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01O75_A396EmprCod[0] ;
            A6039RecAcab = H01O75_A6039RecAcab[0] ;
            n6039RecAcab = H01O75_n6039RecAcab[0] ;
            A9764RecLtsSR = H01O75_A9764RecLtsSR[0] ;
            n9764RecLtsSR = H01O75_n9764RecLtsSR[0] ;
            A4268RecOrdLin = H01O75_A4268RecOrdLin[0] ;
            n4268RecOrdLin = H01O75_n4268RecOrdLin[0] ;
            A189BarNumAny = H01O75_A189BarNumAny[0] ;
            A4866RecFecAlt = H01O75_A4866RecFecAlt[0] ;
            n4866RecFecAlt = H01O75_n4866RecFecAlt[0] ;
            A2805RecVolPrd = H01O75_A2805RecVolPrd[0] ;
            A602MaqCod = H01O75_A602MaqCod[0] ;
            A1235BarNumCli = H01O75_A1235BarNumCli[0] ;
            A1234BarNomCli = H01O75_A1234BarNomCli[0] ;
            A218BarTipCol = H01O75_A218BarTipCol[0] ;
            A136BarColNum = H01O75_A136BarColNum[0] ;
            A135BarColNom = H01O75_A135BarColNom[0] ;
            A1652BarSerDsc = H01O75_A1652BarSerDsc[0] ;
            A212BarSer = H01O75_A212BarSer[0] ;
            A213BarSit = H01O75_A213BarSit[0] ;
            A2804RecLinMaq = H01O75_A2804RecLinMaq[0] ;
            A812RecTotKgm = H01O75_A812RecTotKgm[0] ;
            n812RecTotKgm = H01O75_n812RecTotKgm[0] ;
            A130BarCodPar = H01O75_A130BarCodPar[0] ;
            A132BarCodReo = H01O75_A132BarCodReo[0] ;
            A129BarCod = H01O75_A129BarCod[0] ;
            A189BarNumAny = H01O75_A189BarNumAny[0] ;
            A1235BarNumCli = H01O75_A1235BarNumCli[0] ;
            A1234BarNomCli = H01O75_A1234BarNomCli[0] ;
            A218BarTipCol = H01O75_A218BarTipCol[0] ;
            A136BarColNum = H01O75_A136BarColNum[0] ;
            A135BarColNom = H01O75_A135BarColNom[0] ;
            A1652BarSerDsc = H01O75_A1652BarSerDsc[0] ;
            A212BarSer = H01O75_A212BarSer[0] ;
            A213BarSit = H01O75_A213BarSit[0] ;
            A812RecTotKgm = H01O75_A812RecTotKgm[0] ;
            n812RecTotKgm = H01O75_n812RecTotKgm[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e211O72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb1O70( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1O72( )
   {
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
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV154Barcod) ,
                                           Byte.valueOf(AV155Barcodreo) ,
                                           AV156Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           AV153Emprcod ,
                                           AV158RecAcab ,
                                           A396EmprCod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor H01O79 */
      pr_default.execute(1, new Object[] {AV153Emprcod, AV158RecAcab, AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV154Barcod), Byte.valueOf(AV155Barcodreo), AV156Barcodpar});
      GRID_nRecordCount = H01O79_AGRID_nRecordCount[0] ;
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
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV153Emprcod, AV154Barcod, AV155Barcodreo, AV156Barcodpar, AV158RecAcab, AV20ColumnsSelector, AV34TFBarNHdr, AV35TFBarNHdr_Sel, AV50TFRecLinMaq, AV51TFRecLinMaq_To, AV160TFBarSit, AV161TFBarSit_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarSerDsc, AV39TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV42TFBarColNum, AV43TFBarColNum_To, AV44TFBarTipCol, AV45TFBarTipCol_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV48TFBarNumCli, AV49TFBarNumCli_To, AV52TFMaqCod, AV53TFMaqCod_Sel, AV54TFRecVolPrd, AV55TFRecVolPrd_To, AV162TFRecTotKgm, AV163TFRecTotKgm_To, AV164TFRecFecAlt, AV168TFBarNumAny, AV169TFBarNumAny_To, AV190Pgmname, AV12OrderedBy, AV13OrderedDsc, AV157FechaCierre, A6034Ac_Metros, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV190Pgmname = "RecetasDeAcabados.RecetadeAcabado_Cierre_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV190Pgmname", AV190Pgmname);
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechacierre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechacierre_Enabled), 5, 0), true);
      edtavIncidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1O70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191O72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV146DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV153Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV153Emprcod") ;
         wcpOAV154Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV154Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV155Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV155Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV156Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV156Barcodpar") ;
         wcpOAV157FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV157FechaCierre"), 0) ;
         wcpOAV158RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV158RecAcab") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_anyadirproductos_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         Dvelop_confirmpanel_anyadirproductos_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result") ;
         /* Read variables values. */
         AV190Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV190Pgmname", AV190Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECALTAUXDATE");
            GX_FocusControl = edtavDdo_recfecaltauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV166DDO_RecFecAltAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166DDO_RecFecAltAuxDate", localUtil.format(AV166DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else
         {
            AV166DDO_RecFecAltAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166DDO_RecFecAltAuxDate", localUtil.format(AV166DDO_RecFecAltAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeAcabado_Cierre_WC");
         AV190Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV190Pgmname", AV190Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV190Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetasdeacabados\\recetadeacabado_cierre_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e191O72 ();
      if (returnInSub) return;
   }

   public void e191O72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV182Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV182Station = GXt_char1 ;
      GXv_char2[0] = AV153Emprcod ;
      GXv_char3[0] = AV183EmprNom ;
      GXv_char4[0] = AV184UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV182Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadeacabado_cierre_wc_impl.this.AV153Emprcod = GXv_char2[0] ;
      recetadeacabado_cierre_wc_impl.this.AV183EmprNom = GXv_char3[0] ;
      recetadeacabado_cierre_wc_impl.this.AV184UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
      GXt_int5 = AV185ContVal ;
      GXv_char4[0] = AV153Emprcod ;
      GXv_char3[0] = "011100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      recetadeacabado_cierre_wc_impl.this.AV153Emprcod = GXv_char4[0] ;
      recetadeacabado_cierre_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
      AV185ContVal = GXt_int5 ;
      AV181Consumos = (short)(((AV185ContVal==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV181Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV181Consumos), 4, 0));
      AV186t = (short)(0) ;
      GXt_char1 = AV182Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV182Station = GXt_char1 ;
      GXv_char4[0] = AV153Emprcod ;
      GXv_char3[0] = AV183EmprNom ;
      GXv_char2[0] = AV184UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV182Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadeacabado_cierre_wc_impl.this.AV153Emprcod = GXv_char4[0] ;
      recetadeacabado_cierre_wc_impl.this.AV183EmprNom = GXv_char3[0] ;
      recetadeacabado_cierre_wc_impl.this.AV184UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV146DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV146DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e201O72( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtavIncidencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtRecLinMaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavBaragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtRecVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrd_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtRecTotKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecTotKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtRecFecAlt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecFecAlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecAlt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtBarNumAny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAny_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavIncidencias_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Columnheaderclass", edtavIncidencias_Columnheaderclass, !bGXsfl_45_Refreshing);
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV34TFBarNHdr ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV50TFRecLinMaq ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV51TFRecLinMaq_To ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV160TFBarSit ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV161TFBarSit_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV36TFBarSer ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV37TFBarSer_Sel ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV38TFBarSerDsc ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV39TFBarSerDsc_Sel ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV40TFBarColNom ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV42TFBarColNum ;
      AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV43TFBarColNum_To ;
      AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV44TFBarTipCol ;
      AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV45TFBarTipCol_To ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV46TFBarNomCli ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV48TFBarNumCli ;
      AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV49TFBarNumCli_To ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV52TFMaqCod ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV53TFMaqCod_Sel ;
      AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV54TFRecVolPrd ;
      AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV55TFRecVolPrd_To ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV162TFRecTotKgm ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV163TFRecTotKgm_To ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV164TFRecFecAlt ;
      AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e121O72( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV34TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarNHdr", AV34TFBarNHdr);
            AV35TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarNHdr_Sel", AV35TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinMaq") == 0 )
         {
            AV50TFRecLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecLinMaq), 4, 0));
            AV51TFRecLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV160TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV160TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV160TFBarSit), 2, 0));
            AV161TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV161TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV36TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarSer", AV36TFBarSer);
            AV37TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarSer_Sel", AV37TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV38TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarSerDsc", AV38TFBarSerDsc);
            AV39TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarSerDsc_Sel", AV39TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV40TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
            AV41TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV42TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarColNum), 6, 0));
            AV43TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCol") == 0 )
         {
            AV44TFBarTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarTipCol), 2, 0));
            AV45TFBarTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV46TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
            AV47TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumCli") == 0 )
         {
            AV48TFBarNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFBarNumCli), 6, 0));
            AV49TFBarNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV52TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMaqCod", AV52TFMaqCod);
            AV53TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMaqCod_Sel", AV53TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecVolPrd") == 0 )
         {
            AV54TFRecVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFRecVolPrd), 5, 0));
            AV55TFRecVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecTotKgm") == 0 )
         {
            AV162TFRecTotKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TFRecTotKgm", GXutil.ltrimstr( AV162TFRecTotKgm, 10, 2));
            AV163TFRecTotKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV163TFRecTotKgm_To", GXutil.ltrimstr( AV163TFRecTotKgm_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFecAlt") == 0 )
         {
            AV164TFRecFecAlt = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164TFRecFecAlt", localUtil.ttoc( AV164TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumAny") == 0 )
         {
            AV168TFBarNumAny = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV168TFBarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV168TFBarNumAny), 3, 0));
            AV169TFBarNumAny_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169TFBarNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV169TFBarNumAny_To), 3, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211O72( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Añadir Productos ", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Numero de Añadidas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV151Seleccionar = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV151Seleccionar);
      GXt_int10 = AV149incidencias ;
      GXv_int11[0] = GXt_int10 ;
      new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int11) ;
      recetadeacabado_cierre_wc_impl.this.GXt_int10 = GXv_int11[0] ;
      AV149incidencias = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149incidencias), 4, 0));
      AV159BarAgrEst = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV159BarAgrEst);
      /* Using cursor H01O710 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6034Ac_Metros = H01O710_A6034Ac_Metros[0] ;
         n6034Ac_Metros = H01O710_n6034Ac_Metros[0] ;
         AV159BarAgrEst = "S" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV159BarAgrEst);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      edtavIncidencias_Columnclass = ((AV149incidencias>0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
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
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV171grupodeacciones, 4, 0)) );
   }

   public void e131O72( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e221O72( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV171grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO ANYADIRPRODUCTOS' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV171grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO NUMERODEANYADIDAS' */
         S172 ();
         if (returnInSub) return;
      }
      AV171grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV171grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e141O72( )
   {
      /* Dvelop_confirmpanel_anyadirproductos_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_anyadirproductos_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANYADIRPRODUCTOS' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151O72( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV179ProgressIndicator", AV179ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e161O72( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e171O72( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.recetasdeacabados.recetadeacabado_cierre_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetadeacabado_cierre_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      recetadeacabado_cierre_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e181O72( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.recetasdeacabados.recetadeacabado_cierre_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Seleccionar", "", "Op", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&incidencias", "", "Err", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNHdr", "", "N Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecLinMaq", "", "#", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSit", "", "Situacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&BarAgrEst", "", "A?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTipCol", "", "TC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNomCli", "", "Color Cli.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNumCli", "", "Numero ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "MaqCod", "", "Código Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecVolPrd", "", "Volumen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecTotKgm", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector", GXv_char4) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S162( )
   {
      /* 'DO ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      AV221Emprcod_selected = A396EmprCod ;
      AV222Barcod_selected = A129BarCod ;
      AV223Barcodreo_selected = A132BarCodReo ;
      AV224Barcodpar_selected = A130BarCodPar ;
      AV225Reclinmaq_selected = A2804RecLinMaq ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV180FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV181Consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV173Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV157FechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV187FlagM,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV174Recfec)),GXutil.URLEncode(DecimalUtil.decToString(A812RecTotKgm)),GXutil.URLEncode(GXutil.ltrimstr(A2805RecVolPrd,5,0)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2804RecLinMaq","AV180FecCieTin","AV181Consumos","A602MaqCod","AV173Cc_almcod","AV157FechaCierre","AV187FlagM","AV174Recfec","A812RecTotKgm","A2805RecVolPrd","A13696BarNHdr"});
   }

   public void S172( )
   {
      /* 'DO NUMERODEANYADIDAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_numerodeanyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(A189BarNumAny,3,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarNHdr","BarNumAny"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV179ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV179ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
      AV179ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV148i = GXutil.sleep( 2) ;
      AV179ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos lectura ... ", ""));
      AV148i = GXutil.sleep( 2) ;
      AV186t = (short)(0) ;
      /* Start For Each Line */
      nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_45_fel_idx = 0 ;
      while ( nGXsfl_45_fel_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_fel_idx+1) ;
         sGXsfl_45_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_452( ) ;
         cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
         cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
         AV171grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
         AV151Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCIDENCIAS");
            GX_FocusControl = edtavIncidencias_Internalname ;
            wbErr = true ;
            AV149incidencias = (short)(0) ;
         }
         else
         {
            AV149incidencias = (short)(localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV159BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         A2805RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
         n812RecTotKgm = false ;
         A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname), 0) ;
         n4866RecFecAlt = false ;
         A189BarNumAny = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         if ( GXutil.strcmp(AV151Seleccionar, httpContext.getMessage( "S", "")) == 0 )
         {
            AV179ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV179ProgressIndicator.showwithtitle(httpContext.getMessage( "Leyendo N Hdr ", "")+A13696BarNHdr);
            GXv_char4[0] = AV153Emprcod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int14[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_char2[0] = httpContext.getMessage( "A", "") ;
            GXv_int15[0] = (byte)(AV181Consumos) ;
            GXv_int11[0] = A189BarNumAny ;
            GXv_int16[0] = A2804RecLinMaq ;
            GXv_char17[0] = A602MaqCod ;
            GXv_char18[0] = httpContext.getMessage( "M", "") ;
            GXv_int19[0] = AV173Cc_almcod ;
            GXv_int20[0] = A9764RecLtsSR ;
            GXv_char21[0] = " " ;
            GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char23[0] = AV178productosconsumos ;
            GXv_int24[0] = AV150j ;
            GXv_date25[0] = AV157FechaCierre ;
            new app.recetasdeacabados.pcietina(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int14, GXv_char3, GXv_char2, GXv_int15, GXv_int11, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_char21, GXv_decimal22, GXv_char23, GXv_int24, GXv_date25) ;
            recetadeacabado_cierre_wc_impl.this.AV153Emprcod = GXv_char4[0] ;
            recetadeacabado_cierre_wc_impl.this.A129BarCod = GXv_int6[0] ;
            recetadeacabado_cierre_wc_impl.this.A132BarCodReo = GXv_int14[0] ;
            recetadeacabado_cierre_wc_impl.this.A130BarCodPar = GXv_char3[0] ;
            recetadeacabado_cierre_wc_impl.this.AV181Consumos = GXv_int15[0] ;
            recetadeacabado_cierre_wc_impl.this.A189BarNumAny = GXv_int11[0] ;
            recetadeacabado_cierre_wc_impl.this.A2804RecLinMaq = GXv_int16[0] ;
            recetadeacabado_cierre_wc_impl.this.A602MaqCod = GXv_char17[0] ;
            recetadeacabado_cierre_wc_impl.this.AV173Cc_almcod = GXv_int19[0] ;
            recetadeacabado_cierre_wc_impl.this.A9764RecLtsSR = GXv_int20[0] ;
            recetadeacabado_cierre_wc_impl.this.AV178productosconsumos = GXv_char23[0] ;
            recetadeacabado_cierre_wc_impl.this.AV150j = (short)((short)(GXv_int24[0])) ;
            recetadeacabado_cierre_wc_impl.this.AV157FechaCierre = GXv_date25[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV181Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV181Consumos), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV173Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV173Cc_almcod), 2, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9764RecLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9764RecLtsSR), 5, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV178productosconsumos", AV178productosconsumos);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV150j", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV150j), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157FechaCierre", localUtil.format(AV157FechaCierre, "99/99/99"));
            GXv_char23[0] = AV153Emprcod ;
            GXv_int24[0] = A129BarCod ;
            GXv_int19[0] = A132BarCodReo ;
            GXv_char21[0] = A130BarCodPar ;
            GXv_int16[0] = A4268RecOrdLin ;
            new app.pac0008(remoteHandle, context).execute( GXv_char23, GXv_int24, GXv_int19, GXv_char21, GXv_int16) ;
            recetadeacabado_cierre_wc_impl.this.AV153Emprcod = GXv_char23[0] ;
            recetadeacabado_cierre_wc_impl.this.A129BarCod = GXv_int24[0] ;
            recetadeacabado_cierre_wc_impl.this.A132BarCodReo = GXv_int19[0] ;
            recetadeacabado_cierre_wc_impl.this.A130BarCodPar = GXv_char21[0] ;
            recetadeacabado_cierre_wc_impl.this.A4268RecOrdLin = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4268RecOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4268RecOrdLin), 4, 0));
            AV179ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV179ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesada N Hdr ", "")+A13696BarNHdr);
            AV186t = (short)(AV186t+1) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_45_fel_idx == 0 )
      {
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      nGXsfl_45_fel_idx = 1 ;
      callWebObject(formatLink("app.pctrlinsumos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV153Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV178productosconsumos))}, new String[] {"Emprcod","ProductosConsumos"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      AV179ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
      AV179ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV148i = GXutil.sleep( 2) ;
      AV179ProgressIndicator.hide();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV190Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV190Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV190Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV227GXV1 = 1 ;
      while ( AV227GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV227GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarNHdr", AV34TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarNHdr_Sel", AV35TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV50TFRecLinMaq = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFRecLinMaq), 4, 0));
            AV51TFRecLinMaq_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV160TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV160TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV160TFBarSit), 2, 0));
            AV161TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV161TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV161TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV36TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarSer", AV36TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV37TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarSer_Sel", AV37TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV38TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarSerDsc", AV38TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV39TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarSerDsc_Sel", AV39TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV40TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV41TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV42TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFBarColNum), 6, 0));
            AV43TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV44TFBarTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarTipCol), 2, 0));
            AV45TFBarTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV46TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV47TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV48TFBarNumCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFBarNumCli), 6, 0));
            AV49TFBarNumCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV52TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFMaqCod", AV52TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV53TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMaqCod_Sel", AV53TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV54TFRecVolPrd = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFRecVolPrd), 5, 0));
            AV55TFRecVolPrd_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV162TFRecTotKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV162TFRecTotKgm", GXutil.ltrimstr( AV162TFRecTotKgm, 10, 2));
            AV163TFRecTotKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV163TFRecTotKgm_To", GXutil.ltrimstr( AV163TFRecTotKgm_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV164TFRecFecAlt = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV164TFRecFecAlt", localUtil.ttoc( AV164TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV166DDO_RecFecAltAuxDate = GXutil.resetTime(AV164TFRecFecAlt) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV166DDO_RecFecAltAuxDate", localUtil.format(AV166DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV168TFBarNumAny = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV168TFBarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV168TFBarNumAny), 3, 0));
            AV169TFBarNumAny_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV169TFBarNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV169TFBarNumAny_To), 3, 0));
         }
         AV227GXV1 = (int)(AV227GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char23[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0), AV35TFBarNHdr_Sel, GXv_char23) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char1 = GXv_char23[0] ;
      GXt_char26 = "" ;
      GXv_char21[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarSer_Sel)==0), AV37TFBarSer_Sel, GXv_char21) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char26 = GXv_char21[0] ;
      GXt_char27 = "" ;
      GXv_char18[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarSerDsc_Sel)==0), AV39TFBarSerDsc_Sel, GXv_char18) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char27 = GXv_char18[0] ;
      GXt_char28 = "" ;
      GXv_char17[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, GXv_char17) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char28 = GXv_char17[0] ;
      GXt_char29 = "" ;
      GXv_char4[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, GXv_char4) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char29 = GXv_char4[0] ;
      GXt_char30 = "" ;
      GXv_char3[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFMaqCod_Sel)==0), AV53TFMaqCod_Sel, GXv_char3) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char30 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char26+"|"+GXt_char27+"|"+GXt_char28+"|||"+GXt_char29+"||"+GXt_char30+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char23[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarNHdr)==0), AV34TFBarNHdr, GXv_char23) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char30 = GXv_char23[0] ;
      GXt_char29 = "" ;
      GXv_char21[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarSer)==0), AV36TFBarSer, GXv_char21) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char29 = GXv_char21[0] ;
      GXt_char28 = "" ;
      GXv_char18[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarSerDsc)==0), AV38TFBarSerDsc, GXv_char18) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char28 = GXv_char18[0] ;
      GXt_char27 = "" ;
      GXv_char17[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarColNom)==0), AV40TFBarColNom, GXv_char17) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char27 = GXv_char17[0] ;
      GXt_char26 = "" ;
      GXv_char4[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNomCli)==0), AV46TFBarNomCli, GXv_char4) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char26 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFMaqCod)==0), AV52TFMaqCod, GXv_char3) ;
      recetadeacabado_cierre_wc_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char30+"|"+((0==AV50TFRecLinMaq) ? "" : GXutil.str( AV50TFRecLinMaq, 4, 0))+"|"+((0==AV160TFBarSit) ? "" : GXutil.str( AV160TFBarSit, 2, 0))+"|"+GXt_char29+"|"+GXt_char28+"|"+GXt_char27+"|"+((0==AV42TFBarColNum) ? "" : GXutil.str( AV42TFBarColNum, 6, 0))+"|"+((0==AV44TFBarTipCol) ? "" : GXutil.str( AV44TFBarTipCol, 2, 0))+"|"+GXt_char26+"|"+((0==AV48TFBarNumCli) ? "" : GXutil.str( AV48TFBarNumCli, 6, 0))+"|"+GXt_char1+"|"+((0==AV54TFRecVolPrd) ? "" : GXutil.str( AV54TFRecVolPrd, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV162TFRecTotKgm)==0) ? "" : GXutil.str( AV162TFRecTotKgm, 10, 2))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV164TFRecFecAlt) ? "" : localUtil.dtoc( AV166DDO_RecFecAltAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV168TFBarNumAny) ? "" : GXutil.str( AV168TFBarNumAny, 3, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV51TFRecLinMaq_To) ? "" : GXutil.str( AV51TFRecLinMaq_To, 4, 0))+"|"+((0==AV161TFBarSit_To) ? "" : GXutil.str( AV161TFBarSit_To, 2, 0))+"||||"+((0==AV43TFBarColNum_To) ? "" : GXutil.str( AV43TFBarColNum_To, 6, 0))+"|"+((0==AV45TFBarTipCol_To) ? "" : GXutil.str( AV45TFBarTipCol_To, 2, 0))+"||"+((0==AV49TFBarNumCli_To) ? "" : GXutil.str( AV49TFBarNumCli_To, 6, 0))+"||"+((0==AV55TFRecVolPrd_To) ? "" : GXutil.str( AV55TFRecVolPrd_To, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV163TFRecTotKgm_To)==0) ? "" : GXutil.str( AV163TFRecTotKgm_To, 10, 2))+"||"+((0==AV169TFBarNumAny_To) ? "" : GXutil.str( AV169TFBarNumAny_To, 3, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV190Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARNHDR", "", !(GXutil.strcmp("", AV34TFBarNHdr)==0), (short)(0), AV34TFBarNHdr, "", !(GXutil.strcmp("", AV35TFBarNHdr_Sel)==0), AV35TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECLINMAQ", "", !((0==AV50TFRecLinMaq)&&(0==AV51TFRecLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFRecLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV51TFRecLinMaq_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARSIT", "", !((0==AV160TFBarSit)&&(0==AV161TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV160TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV161TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARSER", "", !(GXutil.strcmp("", AV36TFBarSer)==0), (short)(0), AV36TFBarSer, "", !(GXutil.strcmp("", AV37TFBarSer_Sel)==0), AV37TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARSERDSC", "", !(GXutil.strcmp("", AV38TFBarSerDsc)==0), (short)(0), AV38TFBarSerDsc, "", !(GXutil.strcmp("", AV39TFBarSerDsc_Sel)==0), AV39TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV40TFBarColNom)==0), (short)(0), AV40TFBarColNom, "", !(GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCOLNUM", "", !((0==AV42TFBarColNum)&&(0==AV43TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV43TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARTIPCOL", "", !((0==AV44TFBarTipCol)&&(0==AV45TFBarTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFBarTipCol, 2, 0)), GXutil.trim( GXutil.str( AV45TFBarTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV46TFBarNomCli)==0), (short)(0), AV46TFBarNomCli, "", !(GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARNUMCLI", "", !((0==AV48TFBarNumCli)&&(0==AV49TFBarNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFBarNumCli, 6, 0)), GXutil.trim( GXutil.str( AV49TFBarNumCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFMAQCOD", "", !(GXutil.strcmp("", AV52TFMaqCod)==0), (short)(0), AV52TFMaqCod, "", !(GXutil.strcmp("", AV53TFMaqCod_Sel)==0), AV53TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECVOLPRD", "", !((0==AV54TFRecVolPrd)&&(0==AV55TFRecVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFRecVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV55TFRecVolPrd_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECTOTKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV162TFRecTotKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV163TFRecTotKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV162TFRecTotKgm, 10, 2)), GXutil.trim( GXutil.str( AV163TFRecTotKgm_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECFECALT", "", !GXutil.dateCompare(GXutil.nullDate(), AV164TFRecFecAlt), (short)(0), GXutil.trim( localUtil.ttoc( AV164TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARNUMANY", "", !((0==AV168TFBarNumAny)&&(0==AV169TFBarNumAny_To)), (short)(0), GXutil.trim( GXutil.str( AV168TFBarNumAny, 3, 0)), GXutil.trim( GXutil.str( AV169TFBarNumAny_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      if ( ! (GXutil.strcmp("", AV153Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV153Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV154Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV154Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV155Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV155Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV156Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV156Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157FechaCierre)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHACIERRE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV157FechaCierre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV158RecAcab)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECACAB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV158RecAcab );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV190Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV190Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RECMAQ" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_82_1O72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_82_1O72e( true) ;
      }
      else
      {
         wb_table3_82_1O72e( false) ;
      }
   }

   public void wb_table2_77_1O72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_anyadirproductos.setProperty("Title", Dvelop_confirmpanel_anyadirproductos_Title);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonCaption", Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("NoButtonCaption", Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("CancelButtonCaption", Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonPosition", Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmType", Dvelop_confirmpanel_anyadirproductos_Confirmtype);
         ucDvelop_confirmpanel_anyadirproductos.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_anyadirproductos_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_77_1O72e( true) ;
      }
      else
      {
         wb_table2_77_1O72e( false) ;
      }
   }

   public void wb_table1_23_1O72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1O72e( true) ;
      }
      else
      {
         wb_table1_23_1O72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV153Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
      AV154Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154Barcod), 8, 0));
      AV155Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Barcodreo", GXutil.str( AV155Barcodreo, 1, 0));
      AV156Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156Barcodpar", AV156Barcodpar);
      AV157FechaCierre = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157FechaCierre", localUtil.format(AV157FechaCierre, "99/99/99"));
      AV158RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158RecAcab", AV158RecAcab);
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
      pa1O72( ) ;
      ws1O72( ) ;
      we1O72( ) ;
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
      sCtrlAV153Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV154Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV155Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV156Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV157FechaCierre = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV158RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1O72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "recetasdeacabados\\recetadeacabado_cierre_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1O72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV153Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
         AV154Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154Barcod), 8, 0));
         AV155Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Barcodreo", GXutil.str( AV155Barcodreo, 1, 0));
         AV156Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156Barcodpar", AV156Barcodpar);
         AV157FechaCierre = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157FechaCierre", localUtil.format(AV157FechaCierre, "99/99/99"));
         AV158RecAcab = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158RecAcab", AV158RecAcab);
      }
      wcpOAV153Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV153Emprcod") ;
      wcpOAV154Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV154Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV155Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV155Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV156Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV156Barcodpar") ;
      wcpOAV157FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV157FechaCierre"), 0) ;
      wcpOAV158RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV158RecAcab") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV153Emprcod, wcpOAV153Emprcod) != 0 ) || ( AV154Barcod != wcpOAV154Barcod ) || ( AV155Barcodreo != wcpOAV155Barcodreo ) || ( GXutil.strcmp(AV156Barcodpar, wcpOAV156Barcodpar) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV157FechaCierre), GXutil.resetTime(wcpOAV157FechaCierre)) ) || ( GXutil.strcmp(AV158RecAcab, wcpOAV158RecAcab) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV153Emprcod = AV153Emprcod ;
      wcpOAV154Barcod = AV154Barcod ;
      wcpOAV155Barcodreo = AV155Barcodreo ;
      wcpOAV156Barcodpar = AV156Barcodpar ;
      wcpOAV157FechaCierre = AV157FechaCierre ;
      wcpOAV158RecAcab = AV158RecAcab ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV153Emprcod = httpContext.cgiGet( sPrefix+"AV153Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV153Emprcod) > 0 )
      {
         AV153Emprcod = httpContext.cgiGet( sCtrlAV153Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153Emprcod", AV153Emprcod);
      }
      else
      {
         AV153Emprcod = httpContext.cgiGet( sPrefix+"AV153Emprcod_PARM") ;
      }
      sCtrlAV154Barcod = httpContext.cgiGet( sPrefix+"AV154Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV154Barcod) > 0 )
      {
         AV154Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV154Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154Barcod), 8, 0));
      }
      else
      {
         AV154Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV154Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV155Barcodreo = httpContext.cgiGet( sPrefix+"AV155Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV155Barcodreo) > 0 )
      {
         AV155Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV155Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155Barcodreo", GXutil.str( AV155Barcodreo, 1, 0));
      }
      else
      {
         AV155Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV155Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV156Barcodpar = httpContext.cgiGet( sPrefix+"AV156Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV156Barcodpar) > 0 )
      {
         AV156Barcodpar = httpContext.cgiGet( sCtrlAV156Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV156Barcodpar", AV156Barcodpar);
      }
      else
      {
         AV156Barcodpar = httpContext.cgiGet( sPrefix+"AV156Barcodpar_PARM") ;
      }
      sCtrlAV157FechaCierre = httpContext.cgiGet( sPrefix+"AV157FechaCierre_CTRL") ;
      if ( GXutil.len( sCtrlAV157FechaCierre) > 0 )
      {
         AV157FechaCierre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV157FechaCierre), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV157FechaCierre", localUtil.format(AV157FechaCierre, "99/99/99"));
      }
      else
      {
         AV157FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV157FechaCierre_PARM"), 0) ;
      }
      sCtrlAV158RecAcab = httpContext.cgiGet( sPrefix+"AV158RecAcab_CTRL") ;
      if ( GXutil.len( sCtrlAV158RecAcab) > 0 )
      {
         AV158RecAcab = httpContext.cgiGet( sCtrlAV158RecAcab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV158RecAcab", AV158RecAcab);
      }
      else
      {
         AV158RecAcab = httpContext.cgiGet( sPrefix+"AV158RecAcab_PARM") ;
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
      pa1O72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1O72( ) ;
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
      ws1O72( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV153Emprcod_PARM", GXutil.rtrim( AV153Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV153Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV153Emprcod_CTRL", GXutil.rtrim( sCtrlAV153Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV154Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV154Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV154Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV154Barcod_CTRL", GXutil.rtrim( sCtrlAV154Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV155Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV155Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV155Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV155Barcodreo_CTRL", GXutil.rtrim( sCtrlAV155Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV156Barcodpar_PARM", GXutil.rtrim( AV156Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV156Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV156Barcodpar_CTRL", GXutil.rtrim( sCtrlAV156Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV157FechaCierre_PARM", localUtil.dtoc( AV157FechaCierre, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV157FechaCierre)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV157FechaCierre_CTRL", GXutil.rtrim( sCtrlAV157FechaCierre));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV158RecAcab_PARM", GXutil.rtrim( AV158RecAcab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV158RecAcab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV158RecAcab_CTRL", GXutil.rtrim( sCtrlAV158RecAcab));
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
      we1O72( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115561357", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabados/recetadeacabado_cierre_wc.js", "?202682115561357", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_45_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_45_idx );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS_"+sGXsfl_45_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_45_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_45_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_45_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_45_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_45_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_45_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_45_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_45_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_45_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_45_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_45_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_45_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_45_idx ;
      edtBarNumCli_Internalname = sPrefix+"BARNUMCLI_"+sGXsfl_45_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_45_idx ;
      edtRecVolPrd_Internalname = sPrefix+"RECVOLPRD_"+sGXsfl_45_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_45_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_45_idx ;
      edtBarNumAny_Internalname = sPrefix+"BARNUMANY_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_45_fel_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_45_fel_idx );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS_"+sGXsfl_45_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_45_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_45_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_45_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_45_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_45_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_45_fel_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_45_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_45_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_45_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_45_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_45_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_45_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_45_fel_idx ;
      edtBarNumCli_Internalname = sPrefix+"BARNUMCLI_"+sGXsfl_45_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_45_fel_idx ;
      edtRecVolPrd_Internalname = sPrefix+"RECVOLPRD_"+sGXsfl_45_fel_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_45_fel_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_45_fel_idx ;
      edtBarNumAny_Internalname = sPrefix+"BARNUMANY_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1O70( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_45_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV171grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV171grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV171grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV171grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV171grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_45_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_45_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV151Seleccionar,"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(47, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIncidencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIncidencias_Enabled!=0)&&(edtavIncidencias_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIncidencias_Internalname,GXutil.ltrim( localUtil.ntoc( AV149incidencias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIncidencias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV149incidencias), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV149incidencias), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavIncidencias_Enabled!=0)&&(edtavIncidencias_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e231o72_client"+"'","","","","",edtavIncidencias_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,edtavIncidencias_Columnclass,edtavIncidencias_Columnheaderclass,Integer.valueOf(edtavIncidencias_Visible),Integer.valueOf(edtavIncidencias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinMaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecLinMaq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrest_Internalname,GXutil.rtrim( AV159BarAgrEst),GXutil.rtrim( localUtil.format( AV159BarAgrEst, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e241o72_client"+"'","","","","",edtavBaragrest_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaragrest_Visible),Integer.valueOf(edtavBaragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecTotKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecTotKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecTotKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecTotKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecAlt_Internalname,localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4866RecFecAlt, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecFecAlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFecAlt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumAny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumAny_Internalname,GXutil.ltrim( localUtil.ntoc( A189BarNumAny, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A189BarNumAny), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNumAny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1O72( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIncidencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinMaq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecVolPrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecTotKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Alta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumAny_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Añad.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV171grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV151Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV149incidencias, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavIncidencias_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavIncidencias_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIncidencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIncidencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinMaq_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV159BarAgrEst));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecVolPrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecTotKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFecAlt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A189BarNumAny, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumAny_Visible, (byte)(5), (byte)(0), ".", "")));
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
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      edtavFechacierre_Internalname = sPrefix+"vFECHACIERRE" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarNumCli_Internalname = sPrefix+"BARNUMCLI" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtRecVolPrd_Internalname = sPrefix+"RECVOLPRD" ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM" ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT" ;
      edtBarNumAny_Internalname = sPrefix+"BARNUMANY" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      tblTabledvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_recfecaltauxdate_Internalname = sPrefix+"vDDO_RECFECALTAUXDATE" ;
      divDdo_recfecaltauxdates_Internalname = sPrefix+"DDO_RECFECALTAUXDATES" ;
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
      edtBarNumAny_Jsonclick = "" ;
      edtRecFecAlt_Jsonclick = "" ;
      edtRecTotKgm_Jsonclick = "" ;
      edtRecVolPrd_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtavIncidencias_Jsonclick = "" ;
      edtavIncidencias_Columnclass = "WWColumn" ;
      edtavIncidencias_Enabled = 1 ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIncidencias_Columnheaderclass = "" ;
      edtBarNumAny_Visible = -1 ;
      edtRecFecAlt_Visible = -1 ;
      edtRecTotKgm_Visible = -1 ;
      edtRecVolPrd_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtBarNumCli_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarTipCol_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtavBaragrest_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtRecLinMaq_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtavIncidencias_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_recfecaltauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavFechacierre_Jsonclick = "" ;
      edtavFechacierre_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Grid" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;;Fecha;" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma el Cierre?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmtype = "1" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_anyadirproductos_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "RecetasDeAcabados.RecetadeAcabado_Cierre_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic|||Dynamic||Dynamic||||" ;
      Ddo_grid_Includedatalist = "T|||T|T|T|||T||T||||" ;
      Ddo_grid_Filterisrange = "|T|T||||T|T||T||T|T||T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Character|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Numeric|Date|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|1|11||12|13" ;
      Ddo_grid_Columnids = "3:BarNHdr|7:RecLinMaq|8:BarSit|10:BarSer|11:BarSerDsc|12:BarColNom|13:BarColNum|14:BarTipCol|15:BarNomCli|16:BarNumCli|17:MaqCod|18:RecVolPrd|19:RecTotKgm|20:RecFecAlt|21:BarNumAny" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_45_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_45_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_45_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121O72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211O72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV171grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV151Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV149incidencias',fld:'vINCIDENCIAS',pic:'ZZZ9'},{av:'AV159BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'edtavIncidencias_Columnclass',ctrl:'vINCIDENCIAS',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131O72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e221O72',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV171grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV171grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE","{handler:'e141O72',iparms:[{av:'Dvelop_confirmpanel_anyadirproductos_Result',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV180FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV181Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV173Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV187FlagM',fld:'vFLAGM',pic:'ZZZ9'},{av:'AV174Recfec',fld:'vRECFEC',pic:''},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE",",oparms:[{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV174Recfec',fld:'vRECFEC',pic:''},{av:'AV187FlagM',fld:'vFLAGM',pic:'ZZZ9'},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV173Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV181Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV180FecCieTin',fld:'vFECCIETIN',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111O71',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e151O72',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV151Seleccionar',fld:'vSELECCIONAR',grid:45,pic:''},{av:'nRC_GXsfl_45',ctrl:'GRID',grid:45,prop:'GridRC',grid:45},{av:'A13696BarNHdr',fld:'BARNHDR',grid:45,pic:''},{av:'A129BarCod',fld:'BARCOD',grid:45,pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',grid:45,pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',grid:45,pic:''},{av:'AV181Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A189BarNumAny',fld:'BARNUMANY',grid:45,pic:'ZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',grid:45,pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',grid:45,pic:''},{av:'AV173Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'AV178productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV150j',fld:'vJ',pic:'ZZZ9'},{av:'A4268RecOrdLin',fld:'RECORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV150j',fld:'vJ',pic:'ZZZ9'},{av:'AV178productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'AV173Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'},{av:'AV181Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4268RecOrdLin',fld:'RECORDLIN',pic:'ZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e161O72',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171O72',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181O72',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VBARAGREST.CLICK","{handler:'e241O72',iparms:[]");
      setEventMetadata("VBARAGREST.CLICK",",oparms:[]}");
      setEventMetadata("VINCIDENCIAS.CLICK","{handler:'e231O72',iparms:[]");
      setEventMetadata("VINCIDENCIAS.CLICK",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV35TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV50TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV51TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV160TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV161TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV39TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV42TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV43TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV44TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV45TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV48TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV49TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV52TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV53TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV54TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV55TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV162TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV163TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV164TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV168TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV169TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV190Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV153Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV154Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV155Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV156Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV157FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV158RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barnumany',iparms:[]");
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
      wcpOAV153Emprcod = "" ;
      wcpOAV156Barcodpar = "" ;
      wcpOAV157FechaCierre = GXutil.nullDate() ;
      wcpOAV158RecAcab = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_anyadirproductos_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV153Emprcod = "" ;
      AV156Barcodpar = "" ;
      AV157FechaCierre = GXutil.nullDate() ;
      AV158RecAcab = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV34TFBarNHdr = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV36TFBarSer = "" ;
      AV37TFBarSer_Sel = "" ;
      AV38TFBarSerDsc = "" ;
      AV39TFBarSerDsc_Sel = "" ;
      AV40TFBarColNom = "" ;
      AV41TFBarColNom_Sel = "" ;
      AV46TFBarNomCli = "" ;
      AV47TFBarNomCli_Sel = "" ;
      AV52TFMaqCod = "" ;
      AV53TFMaqCod_Sel = "" ;
      AV162TFRecTotKgm = DecimalUtil.ZERO ;
      AV163TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV164TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV190Pgmname = "" ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV146DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV180FecCieTin = GXutil.nullDate() ;
      AV174Recfec = GXutil.nullDate() ;
      AV178productosconsumos = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV166DDO_RecFecAltAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = "" ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = "" ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = "" ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = "" ;
      AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = "" ;
      AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = "" ;
      AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = DecimalUtil.ZERO ;
      AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV151Seleccionar = "" ;
      A13696BarNHdr = "" ;
      A130BarCodPar = "" ;
      AV159BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      A6039RecAcab = "" ;
      H01O75_A396EmprCod = new String[] {""} ;
      H01O75_A6039RecAcab = new String[] {""} ;
      H01O75_n6039RecAcab = new boolean[] {false} ;
      H01O75_A9764RecLtsSR = new int[1] ;
      H01O75_n9764RecLtsSR = new boolean[] {false} ;
      H01O75_A4268RecOrdLin = new short[1] ;
      H01O75_n4268RecOrdLin = new boolean[] {false} ;
      H01O75_A189BarNumAny = new short[1] ;
      H01O75_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01O75_n4866RecFecAlt = new boolean[] {false} ;
      H01O75_A2805RecVolPrd = new int[1] ;
      H01O75_A602MaqCod = new String[] {""} ;
      H01O75_A1235BarNumCli = new int[1] ;
      H01O75_A1234BarNomCli = new String[] {""} ;
      H01O75_A218BarTipCol = new byte[1] ;
      H01O75_A136BarColNum = new int[1] ;
      H01O75_A135BarColNom = new String[] {""} ;
      H01O75_A1652BarSerDsc = new String[] {""} ;
      H01O75_A212BarSer = new String[] {""} ;
      H01O75_A213BarSit = new byte[1] ;
      H01O75_A2804RecLinMaq = new short[1] ;
      H01O75_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O75_n812RecTotKgm = new boolean[] {false} ;
      H01O75_A130BarCodPar = new String[] {""} ;
      H01O75_A132BarCodReo = new byte[1] ;
      H01O75_A129BarCod = new int[1] ;
      H01O79_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV182Station = "" ;
      AV183EmprNom = "" ;
      AV184UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      H01O710_A6031Ac_Barcod = new int[1] ;
      H01O710_A6032Ac_BarReo = new byte[1] ;
      H01O710_A6033Ac_BarPar = new String[] {""} ;
      H01O710_A396EmprCod = new String[] {""} ;
      H01O710_A129BarCod = new int[1] ;
      H01O710_A132BarCodReo = new byte[1] ;
      H01O710_A130BarCodPar = new String[] {""} ;
      H01O710_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O710_n6034Ac_Metros = new boolean[] {false} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV179ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV221Emprcod_selected = "" ;
      AV224Barcodpar_selected = "" ;
      GXv_int6 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_int20 = new int[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_date25 = new java.util.Date[1] ;
      GXv_int24 = new int[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int16 = new short[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char30 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_anyadirproductos = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV153Emprcod = "" ;
      sCtrlAV154Barcod = "" ;
      sCtrlAV155Barcodreo = "" ;
      sCtrlAV156Barcodpar = "" ;
      sCtrlAV157FechaCierre = "" ;
      sCtrlAV158RecAcab = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado_cierre_wc__default(),
         new Object[] {
             new Object[] {
            H01O75_A396EmprCod, H01O75_A6039RecAcab, H01O75_n6039RecAcab, H01O75_A9764RecLtsSR, H01O75_n9764RecLtsSR, H01O75_A4268RecOrdLin, H01O75_n4268RecOrdLin, H01O75_A189BarNumAny, H01O75_A4866RecFecAlt, H01O75_n4866RecFecAlt,
            H01O75_A2805RecVolPrd, H01O75_A602MaqCod, H01O75_A1235BarNumCli, H01O75_A1234BarNomCli, H01O75_A218BarTipCol, H01O75_A136BarColNum, H01O75_A135BarColNom, H01O75_A1652BarSerDsc, H01O75_A212BarSer, H01O75_A213BarSit,
            H01O75_A2804RecLinMaq, H01O75_A812RecTotKgm, H01O75_n812RecTotKgm, H01O75_A130BarCodPar, H01O75_A132BarCodReo, H01O75_A129BarCod
            }
            , new Object[] {
            H01O79_AGRID_nRecordCount
            }
            , new Object[] {
            H01O710_A6031Ac_Barcod, H01O710_A6032Ac_BarReo, H01O710_A6033Ac_BarPar, H01O710_A396EmprCod, H01O710_A129BarCod, H01O710_A132BarCodReo, H01O710_A130BarCodPar, H01O710_A6034Ac_Metros, H01O710_n6034Ac_Metros
            }
         }
      );
      AV190Pgmname = "RecetasDeAcabados.RecetadeAcabado_Cierre_WC" ;
      /* GeneXus formulas. */
      AV190Pgmname = "RecetasDeAcabados.RecetadeAcabado_Cierre_WC" ;
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      edtavIncidencias_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV155Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV155Barcodreo ;
   private byte AV160TFBarSit ;
   private byte AV161TFBarSit_To ;
   private byte AV44TFBarTipCol ;
   private byte AV45TFBarTipCol_To ;
   private byte AV173Cc_almcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ;
   private byte AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ;
   private byte AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ;
   private byte AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV223Barcodreo_selected ;
   private byte GXv_int14[] ;
   private byte GXv_int15[] ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV50TFRecLinMaq ;
   private short AV51TFRecLinMaq_To ;
   private short AV168TFBarNumAny ;
   private short AV169TFBarNumAny_To ;
   private short AV12OrderedBy ;
   private short AV181Consumos ;
   private short AV187FlagM ;
   private short AV150j ;
   private short A4268RecOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ;
   private short AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ;
   private short AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ;
   private short AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ;
   private short AV171grupodeacciones ;
   private short AV149incidencias ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV186t ;
   private short GXt_int10 ;
   private short AV225Reclinmaq_selected ;
   private short AV148i ;
   private short GXv_int11[] ;
   private short GXv_int16[] ;
   private int wcpOAV154Barcod ;
   private int nRC_GXsfl_45 ;
   private int AV154Barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_45_idx=1 ;
   private int AV42TFBarColNum ;
   private int AV43TFBarColNum_To ;
   private int AV48TFBarNumCli ;
   private int AV49TFBarNumCli_To ;
   private int AV54TFRecVolPrd ;
   private int AV55TFRecVolPrd_To ;
   private int A9764RecLtsSR ;
   private int edtavFechacierre_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ;
   private int AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ;
   private int AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ;
   private int AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ;
   private int AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ;
   private int AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int subGrid_Islastpage ;
   private int edtavIncidencias_Enabled ;
   private int edtavBaragrest_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV185ContVal ;
   private int GXt_int5 ;
   private int edtavIncidencias_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtRecLinMaq_Visible ;
   private int edtBarSit_Visible ;
   private int edtavBaragrest_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarTipCol_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarNumCli_Visible ;
   private int edtMaqCod_Visible ;
   private int edtRecVolPrd_Visible ;
   private int edtRecTotKgm_Visible ;
   private int edtRecFecAlt_Visible ;
   private int edtBarNumAny_Visible ;
   private int AV222Barcod_selected ;
   private int nGXsfl_45_fel_idx=1 ;
   private int GXv_int6[] ;
   private int GXv_int20[] ;
   private int GXv_int24[] ;
   private int AV227GXV1 ;
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
   private java.math.BigDecimal AV162TFRecTotKgm ;
   private java.math.BigDecimal AV163TFRecTotKgm_To ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ;
   private java.math.BigDecimal AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String wcpOAV153Emprcod ;
   private String wcpOAV156Barcodpar ;
   private String wcpOAV158RecAcab ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_anyadirproductos_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV153Emprcod ;
   private String AV156Barcodpar ;
   private String AV158RecAcab ;
   private String sGXsfl_45_idx="0001" ;
   private String AV34TFBarNHdr ;
   private String AV35TFBarNHdr_Sel ;
   private String AV36TFBarSer ;
   private String AV37TFBarSer_Sel ;
   private String AV38TFBarSerDsc ;
   private String AV39TFBarSerDsc_Sel ;
   private String AV40TFBarColNom ;
   private String AV41TFBarColNom_Sel ;
   private String AV46TFBarNomCli ;
   private String AV47TFBarNomCli_Sel ;
   private String AV52TFMaqCod ;
   private String AV53TFMaqCod_Sel ;
   private String AV190Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Dvelop_confirmpanel_anyadirproductos_Title ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmationtext ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String edtavFechacierre_Internalname ;
   private String edtavFechacierre_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_recfecaltauxdates_Internalname ;
   private String edtavDdo_recfecaltauxdate_Internalname ;
   private String edtavDdo_recfecaltauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ;
   private String AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ;
   private String AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ;
   private String AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ;
   private String AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ;
   private String AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ;
   private String AV151Seleccionar ;
   private String edtavIncidencias_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtBarSit_Internalname ;
   private String AV159BarAgrEst ;
   private String edtavBaragrest_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtRecVolPrd_Internalname ;
   private String edtRecTotKgm_Internalname ;
   private String edtRecFecAlt_Internalname ;
   private String edtBarNumAny_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String lV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String lV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String lV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String lV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String lV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String A6039RecAcab ;
   private String hsh ;
   private String AV182Station ;
   private String AV183EmprNom ;
   private String AV184UsurCod ;
   private String edtavIncidencias_Columnheaderclass ;
   private String edtavIncidencias_Columnclass ;
   private String AV221Emprcod_selected ;
   private String AV224Barcodpar_selected ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String GXt_char30 ;
   private String GXv_char23[] ;
   private String GXt_char29 ;
   private String GXv_char21[] ;
   private String GXt_char28 ;
   private String GXv_char18[] ;
   private String GXt_char27 ;
   private String GXv_char17[] ;
   private String GXt_char26 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_anyadirproductos_Internalname ;
   private String Dvelop_confirmpanel_anyadirproductos_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV153Emprcod ;
   private String sCtrlAV154Barcod ;
   private String sCtrlAV155Barcodreo ;
   private String sCtrlAV156Barcodpar ;
   private String sCtrlAV157FechaCierre ;
   private String sCtrlAV158RecAcab ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavIncidencias_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtavBaragrest_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtRecVolPrd_Jsonclick ;
   private String edtRecTotKgm_Jsonclick ;
   private String edtRecFecAlt_Jsonclick ;
   private String edtBarNumAny_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV164TFRecFecAlt ;
   private java.util.Date AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date wcpOAV157FechaCierre ;
   private java.util.Date AV157FechaCierre ;
   private java.util.Date AV180FecCieTin ;
   private java.util.Date AV174Recfec ;
   private java.util.Date AV166DDO_RecFecAltAuxDate ;
   private java.util.Date GXv_date25[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean n6034Ac_Metros ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n812RecTotKgm ;
   private boolean n4866RecFecAlt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6039RecAcab ;
   private boolean n9764RecLtsSR ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV19UserCustomValue ;
   private String AV178productosconsumos ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anyadirproductos ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H01O75_A396EmprCod ;
   private String[] H01O75_A6039RecAcab ;
   private boolean[] H01O75_n6039RecAcab ;
   private int[] H01O75_A9764RecLtsSR ;
   private boolean[] H01O75_n9764RecLtsSR ;
   private short[] H01O75_A4268RecOrdLin ;
   private boolean[] H01O75_n4268RecOrdLin ;
   private short[] H01O75_A189BarNumAny ;
   private java.util.Date[] H01O75_A4866RecFecAlt ;
   private boolean[] H01O75_n4866RecFecAlt ;
   private int[] H01O75_A2805RecVolPrd ;
   private String[] H01O75_A602MaqCod ;
   private int[] H01O75_A1235BarNumCli ;
   private String[] H01O75_A1234BarNomCli ;
   private byte[] H01O75_A218BarTipCol ;
   private int[] H01O75_A136BarColNum ;
   private String[] H01O75_A135BarColNom ;
   private String[] H01O75_A1652BarSerDsc ;
   private String[] H01O75_A212BarSer ;
   private byte[] H01O75_A213BarSit ;
   private short[] H01O75_A2804RecLinMaq ;
   private java.math.BigDecimal[] H01O75_A812RecTotKgm ;
   private boolean[] H01O75_n812RecTotKgm ;
   private String[] H01O75_A130BarCodPar ;
   private byte[] H01O75_A132BarCodReo ;
   private int[] H01O75_A129BarCod ;
   private long[] H01O79_AGRID_nRecordCount ;
   private int[] H01O710_A6031Ac_Barcod ;
   private byte[] H01O710_A6032Ac_BarReo ;
   private String[] H01O710_A6033Ac_BarPar ;
   private String[] H01O710_A396EmprCod ;
   private int[] H01O710_A129BarCod ;
   private byte[] H01O710_A132BarCodReo ;
   private String[] H01O710_A130BarCodPar ;
   private java.math.BigDecimal[] H01O710_A6034Ac_Metros ;
   private boolean[] H01O710_n6034Ac_Metros ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV146DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV179ProgressIndicator ;
}

final  class recetadeacabado_cierre_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01O75( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV154Barcod ,
                                          byte AV155Barcodreo ,
                                          String AV156Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.math.BigDecimal AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String AV153Emprcod ,
                                          String AV158RecAcab ,
                                          String A396EmprCod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[41];
      Object[] GXv_Object33 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.RecAcab, T1.RecLtsSR, T1.RecOrdLin, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol," ;
      sSelectString += " T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm," ;
      sFromString += " T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR" ;
      sFromString += " GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar)" ;
      sFromString += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod" ;
      sFromString += " = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod" ;
      sFromString += " AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecAcab = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      if ( (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (0==AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (0==AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (0==AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (0==AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (0==AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (0==AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (0==AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (0==AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (0==AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (0==AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (0==AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (0==AV154Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! (0==AV155Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNumCli" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNumCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNumAny" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNumAny DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H01O79( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV154Barcod ,
                                          byte AV155Barcodreo ,
                                          String AV156Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.math.BigDecimal AV215Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV216Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String AV153Emprcod ,
                                          String AV158RecAcab ,
                                          String A396EmprCod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[36];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm," ;
      scmdbuf += " 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo" ;
      scmdbuf += " AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecAcab = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      if ( (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV191Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (0==AV194Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (0==AV195Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (0==AV196Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV197Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV199Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV201Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! (0==AV203Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (0==AV204Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (0==AV205Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (0==AV206Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV207Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (0==AV209Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (0==AV210Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV211Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV212Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (0==AV213Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (0==AV214Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV217Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (0==AV218Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (0==AV219Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (0==AV154Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV155Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_H01O75(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 1 :
                  return conditional_H01O79(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01O75", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O79", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O710", "SELECT Ac_Barcod, Ac_BarReo, Ac_BarPar, EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Metros FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((short[]) buf[20])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               ((int[]) buf[25])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

