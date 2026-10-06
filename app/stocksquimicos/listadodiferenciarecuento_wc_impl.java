package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodiferenciarecuento_wc_impl extends GXWebComponent
{
   public listadodiferenciarecuento_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public listadodiferenciarecuento_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodiferenciarecuento_wc_impl.class ));
   }

   public listadodiferenciarecuento_wc_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6recfec", localUtil.format(AV6recfec, "99/99/99"));
               AV7prdnumfrom = httpContext.GetPar( "prdnumfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7prdnumfrom", AV7prdnumfrom);
               AV8prdnumto = httpContext.GetPar( "prdnumto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8prdnumto", AV8prdnumto);
               AV60desvios = httpContext.GetPar( "desvios") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60desvios", AV60desvios);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6recfec,AV7prdnumfrom,AV8prdnumto,AV60desvios});
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
      AV7prdnumfrom = httpContext.GetPar( "prdnumfrom") ;
      AV8prdnumto = httpContext.GetPar( "prdnumto") ;
      AV60desvios = httpContext.GetPar( "desvios") ;
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV32TFRecFec = localUtil.parseDateParm( httpContext.GetPar( "TFRecFec")) ;
      AV36TFRechora = localUtil.parseDTimeParm( httpContext.GetPar( "TFRechora")) ;
      AV40TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV41TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV42TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV43TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV44TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV45TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV46TFRecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiRea"), ".") ;
      AV47TFRecExiRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiRea_To"), ".") ;
      AV64TFRecPreRec = CommonUtil.decimalVal( httpContext.GetPar( "TFRecPreRec"), ".") ;
      AV65TFRecPreRec_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecPreRec_To"), ".") ;
      AV66TFDifAlmacen = CommonUtil.decimalVal( httpContext.GetPar( "TFDifAlmacen"), ".") ;
      AV67TFDifAlmacen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDifAlmacen_To"), ".") ;
      AV81TFDifAlmPor = CommonUtil.decimalVal( httpContext.GetPar( "TFDifAlmPor"), ".") ;
      AV82TFDifAlmPor_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDifAlmPor_To"), ".") ;
      AV86Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV52TotRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TotRecExiTeo"), ".") ;
      AV56TotRecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "TotRecExiRea"), ".") ;
      AV58TotValorActual = CommonUtil.decimalVal( httpContext.GetPar( "TotValorActual"), ".") ;
      AV63ImpCod = httpContext.GetPar( "ImpCod") ;
      AV61InvAt = (byte)(GXutil.lval( httpContext.GetPar( "InvAt"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1PD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recuentos de Productos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.listadodiferenciarecuento_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV6recfec)),GXutil.URLEncode(GXutil.rtrim(AV7prdnumfrom)),GXutil.URLEncode(GXutil.rtrim(AV8prdnumto)),GXutil.URLEncode(GXutil.rtrim(AV60desvios))}, new String[] {"Emprcod","recfec","prdnumfrom","prdnumto","desvios"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALORACTUAL", getSecureSignedToken( sPrefix, localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINVAT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61InvAt), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadoDiferenciaRecuento_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV86Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodiferenciarecuento_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", wcpOAV5Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6recfec", localUtil.dtoc( wcpOAV6recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7prdnumfrom", wcpOAV7prdnumfrom);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8prdnumto", wcpOAV8prdnumto);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60desvios", GXutil.rtrim( wcpOAV60desvios));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFEC", localUtil.dtoc( AV32TFRecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECHORA", localUtil.ttoc( AV36TFRechora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV40TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV41TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV42TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV43TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV44TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV45TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV46TFRecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXIREA_TO", GXutil.ltrim( localUtil.ntoc( AV47TFRecExiRea_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPREREC", GXutil.ltrim( localUtil.ntoc( AV64TFRecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPREREC_TO", GXutil.ltrim( localUtil.ntoc( AV65TFRecPreRec_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFALMACEN", GXutil.ltrim( localUtil.ntoc( AV66TFDifAlmacen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFALMACEN_TO", GXutil.ltrim( localUtil.ntoc( AV67TFDifAlmacen_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFALMPOR", GXutil.ltrim( localUtil.ntoc( AV81TFDifAlmPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIFALMPOR_TO", GXutil.ltrim( localUtil.ntoc( AV82TFDifAlmPor_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV52TotRecExiTeo, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV56TotRecExiRea, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTVALORACTUAL", GXutil.ltrim( localUtil.ntoc( AV58TotValorActual, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALORACTUAL", getSecureSignedToken( sPrefix, localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV63ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vERRORMESSAGE", AV23ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINVAT", GXutil.ltrim( localUtil.ntoc( AV61InvAt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINVAT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61InvAt), "9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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

   public void renderHtmlCloseForm1PD2( )
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
      return "StocksQuimicos.ListadoDiferenciaRecuento_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recuentos de Productos", "") ;
   }

   public void wb1PD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.listadodiferenciarecuento_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexporttoexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel (AT)", ""), bttBtnexporttoexcel_Jsonclick, 5, httpContext.getMessage( "Excel (AT)", ""), "", StyleString, ClassString, bttBtnexporttoexcel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTTOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (1)", ""), bttBtnpdf_1_Jsonclick, 7, httpContext.getMessage( "PDF (1)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111pd1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (2)", ""), bttBtnpdf_2_Jsonclick, 7, httpContext.getMessage( "PDF (2)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121pd1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_31_1PD2( true) ;
      }
      else
      {
         wb_table1_31_1PD2( false) ;
      }
      return  ;
   }

   public void wb_table1_31_1PD2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_60_1PD2( true) ;
      }
      else
      {
         wb_table2_60_1PD2( false) ;
      }
      return  ;
   }

   public void wb_table2_60_1PD2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV86Pgmname), GXutil.rtrim( localUtil.format( AV86Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         wb_table3_88_1PD2( true) ;
      }
      else
      {
         wb_table3_88_1PD2( false) ;
      }
      return  ;
   }

   public void wb_table3_88_1PD2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecauxdate_Internalname, localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"), localUtil.format( AV34DDO_RecFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,122);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_rechoraauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_rechoraauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_rechoraauxdate_Internalname, localUtil.format(AV38DDO_RechoraAuxDate, "99/99/99"), localUtil.format( AV38DDO_RechoraAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,124);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_rechoraauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_rechoraauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 46 )
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

   public void start1PD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recuentos de Productos", ""), (short)(0)) ;
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
            strup1PD0( ) ;
         }
      }
   }

   public void ws1PD2( )
   {
      start1PD2( ) ;
      evt1PD2( ) ;
   }

   public void evt1PD2( )
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
                              strup1PD0( ) ;
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
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTTOEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportToExcel' */
                                 e181PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e191PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e201PD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1PD0( ) ;
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
                              strup1PD0( ) ;
                           }
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           A810RecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtRecFec_Internalname), 0)) ;
                           A13455Rechora = localUtil.ctot( httpContext.cgiGet( edtRechora_Internalname), 0) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
                           A6573RecPreRec = localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)) ;
                           AV21ValorActual = localUtil.ctond( httpContext.cgiGet( edtavValoractual_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValoractual_Internalname, GXutil.ltrimstr( AV21ValorActual, 11, 2));
                           A14034DifAlmacen = localUtil.ctond( httpContext.cgiGet( edtDifAlmacen_Internalname)) ;
                           A14377DifAlmPor = localUtil.ctond( httpContext.cgiGet( edtDifAlmPor_Internalname)) ;
                           AV80DesvioMon = localUtil.ctond( httpContext.cgiGet( edtavDesviomon_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDesviomon_Internalname, GXutil.ltrimstr( AV80DesvioMon, 7, 2));
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
                                       e211PD2 ();
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
                                       e221PD2 ();
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
                                       e231PD2 ();
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
                                    strup1PD0( ) ;
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

   public void we1PD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1PD2( ) ;
         }
      }
   }

   public void pa1PD2( )
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 java.util.Date AV6recfec ,
                                 String AV7prdnumfrom ,
                                 String AV8prdnumto ,
                                 String AV60desvios ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV19FilterFullText ,
                                 java.util.Date AV32TFRecFec ,
                                 java.util.Date AV36TFRechora ,
                                 String AV40TFPrdNum ,
                                 String AV41TFPrdNum_Sel ,
                                 String AV42TFPrdNom ,
                                 String AV43TFPrdNom_Sel ,
                                 java.math.BigDecimal AV44TFRecExiTeo ,
                                 java.math.BigDecimal AV45TFRecExiTeo_To ,
                                 java.math.BigDecimal AV46TFRecExiRea ,
                                 java.math.BigDecimal AV47TFRecExiRea_To ,
                                 java.math.BigDecimal AV64TFRecPreRec ,
                                 java.math.BigDecimal AV65TFRecPreRec_To ,
                                 java.math.BigDecimal AV66TFDifAlmacen ,
                                 java.math.BigDecimal AV67TFDifAlmacen_To ,
                                 java.math.BigDecimal AV81TFDifAlmPor ,
                                 java.math.BigDecimal AV82TFDifAlmPor_To ,
                                 String AV86Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 java.math.BigDecimal AV52TotRecExiTeo ,
                                 java.math.BigDecimal AV56TotRecExiRea ,
                                 java.math.BigDecimal AV58TotValorActual ,
                                 String AV63ImpCod ,
                                 byte AV61InvAt ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221PD2 ();
      GRID_nCurrentRecord = 0 ;
      rf1PD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadoDiferenciaRecuento_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV86Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\listadodiferenciarecuento_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1PD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV88Pgmdesc = httpContext.getMessage( "Recuentos de Productos", "") ;
      AV86Pgmname = "StocksQuimicos.ListadoDiferenciaRecuento_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Pgmname", AV86Pgmname);
      Gx_err = (short)(0) ;
      edtavValoractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValoractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavDesviomon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDesviomon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDesviomon_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTotvaluerecexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluerecexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexiteo_Enabled), 5, 0), true);
      edtavTotvaluerecexirea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluerecexirea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexirea_Enabled), 5, 0), true);
      edtavTotvaluevaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluevaloractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevaloractual_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV6recfec ,
                                           AV7prdnumfrom ,
                                           AV8prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV60desvios ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor H01PD2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV60desvios, AV60desvios, AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV6recfec, AV7prdnumfrom, AV8prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01PD2_A396EmprCod[0] ;
         A14034DifAlmacen = H01PD2_A14034DifAlmacen[0] ;
         A6573RecPreRec = H01PD2_A6573RecPreRec[0] ;
         A718PrdNom = H01PD2_A718PrdNom[0] ;
         A719PrdNum = H01PD2_A719PrdNum[0] ;
         A13455Rechora = H01PD2_A13455Rechora[0] ;
         A810RecFec = H01PD2_A810RecFec[0] ;
         A807RecExiRea = H01PD2_A807RecExiRea[0] ;
         A809RecExiTeo = H01PD2_A809RecExiTeo[0] ;
         A718PrdNom = H01PD2_A718PrdNom[0] ;
         GXt_decimal1 = A14377DifAlmPor ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
         listadodiferenciarecuento_wc_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
         A14377DifAlmPor = GXt_decimal1 ;
         if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
                  GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1PD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e221PD2 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_462( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                              AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                              AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                              AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                              AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                              AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                              AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                              AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                              AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                              AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                              AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                              AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                              AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                              AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                              AV6recfec ,
                                              AV7prdnumfrom ,
                                              AV8prdnumto ,
                                              A810RecFec ,
                                              A13455Rechora ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A807RecExiRea ,
                                              A6573RecPreRec ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                              A14034DifAlmacen ,
                                              A14377DifAlmPor ,
                                              AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                              AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                              AV60desvios ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
         lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
         /* Using cursor H01PD3 */
         pr_default.execute(1, new Object[] {AV5Emprcod, AV60desvios, AV60desvios, AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV6recfec, AV7prdnumfrom, AV8prdnumto});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01PD3_A396EmprCod[0] ;
            A14034DifAlmacen = H01PD3_A14034DifAlmacen[0] ;
            A6573RecPreRec = H01PD3_A6573RecPreRec[0] ;
            A718PrdNom = H01PD3_A718PrdNom[0] ;
            A719PrdNum = H01PD3_A719PrdNum[0] ;
            A13455Rechora = H01PD3_A13455Rechora[0] ;
            A810RecFec = H01PD3_A810RecFec[0] ;
            A807RecExiRea = H01PD3_A807RecExiRea[0] ;
            A809RecExiTeo = H01PD3_A809RecExiTeo[0] ;
            A718PrdNom = H01PD3_A718PrdNom[0] ;
            GXt_decimal1 = A14377DifAlmPor ;
            GXv_decimal2[0] = GXt_decimal1 ;
            new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
            listadodiferenciarecuento_wc_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
            A14377DifAlmPor = GXt_decimal1 ;
            if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
                  {
                     e231PD2 ();
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(46) ;
         wb1PD0( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV52TotRecExiTeo, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV56TotRecExiRea, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTVALORACTUAL", GXutil.ltrim( localUtil.ntoc( AV58TotValorActual, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALORACTUAL", getSecureSignedToken( sPrefix, localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV63ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV63ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINVAT", GXutil.ltrim( localUtil.ntoc( AV61InvAt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINVAT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61InvAt), "9")));
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
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV19FilterFullText, AV32TFRecFec, AV36TFRechora, AV40TFPrdNum, AV41TFPrdNum_Sel, AV42TFPrdNom, AV43TFPrdNom_Sel, AV44TFRecExiTeo, AV45TFRecExiTeo_To, AV46TFRecExiRea, AV47TFRecExiRea_To, AV64TFRecPreRec, AV65TFRecPreRec_To, AV66TFDifAlmacen, AV67TFDifAlmacen_To, AV81TFDifAlmPor, AV82TFDifAlmPor_To, AV86Pgmname, AV16OrderedBy, AV17OrderedDsc, AV52TotRecExiTeo, AV56TotRecExiRea, AV58TotValorActual, AV63ImpCod, AV61InvAt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV88Pgmdesc = httpContext.getMessage( "Recuentos de Productos", "") ;
      AV86Pgmname = "StocksQuimicos.ListadoDiferenciaRecuento_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Pgmname", AV86Pgmname);
      Gx_err = (short)(0) ;
      edtavValoractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValoractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavDesviomon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDesviomon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDesviomon_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTotvaluerecexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluerecexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexiteo_Enabled), 5, 0), true);
      edtavTotvaluerecexirea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluerecexirea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexirea_Enabled), 5, 0), true);
      edtavTotvaluevaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluevaloractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevaloractual_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1PD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211PD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV29ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6recfec"), 0) ;
         wcpOAV7prdnumfrom = httpContext.cgiGet( sPrefix+"wcpOAV7prdnumfrom") ;
         wcpOAV8prdnumto = httpContext.cgiGet( sPrefix+"wcpOAV8prdnumto") ;
         wcpOAV60desvios = httpContext.cgiGet( sPrefix+"wcpOAV60desvios") ;
         AV63ImpCod = httpContext.cgiGet( sPrefix+"vIMPCOD") ;
         AV61InvAt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vINVAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
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
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         AV53TotValueRecExiTeo = httpContext.cgiGet( edtavTotvaluerecexiteo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotValueRecExiTeo", AV53TotValueRecExiTeo);
         AV57TotValueRecExiRea = httpContext.cgiGet( edtavTotvaluerecexirea_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueRecExiRea", AV57TotValueRecExiRea);
         AV59TotValueValorActual = httpContext.cgiGet( edtavTotvaluevaloractual_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValueValorActual", AV59TotValueValorActual);
         AV86Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Pgmname", AV86Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECAUXDATE");
            GX_FocusControl = edtavDdo_recfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_RecFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_RecFecAuxDate", localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_RecFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_RecFecAuxDate", localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_rechoraauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECHORAAUXDATE");
            GX_FocusControl = edtavDdo_rechoraauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_RechoraAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_RechoraAuxDate", localUtil.format(AV38DDO_RechoraAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_RechoraAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_rechoraauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_RechoraAuxDate", localUtil.format(AV38DDO_RechoraAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ListadoDiferenciaRecuento_WC");
         AV86Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Pgmname", AV86Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV86Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\listadodiferenciarecuento_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e211PD2 ();
      if (returnInSub) return;
   }

   public void e211PD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int3 = AV61InvAt ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "INVAT", ""), GXv_int4) ;
      listadodiferenciarecuento_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV61InvAt = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61InvAt", GXutil.str( AV61InvAt, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINVAT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61InvAt), "9")));
      GXt_char5 = AV76Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      AV76Station = GXt_char5 ;
      GXv_char6[0] = AV5Emprcod ;
      GXv_char7[0] = AV77EmprNom ;
      GXv_char8[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char6, GXv_char7, GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.AV5Emprcod = GXv_char6[0] ;
      listadodiferenciarecuento_wc_impl.this.AV77EmprNom = GXv_char7[0] ;
      listadodiferenciarecuento_wc_impl.this.AV70UsurCod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S122 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char5 = AV79Carpeta ;
      GXv_char8[0] = GXt_char5 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "CARPET", ""), GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      AV79Carpeta = GXt_char5 ;
      GXt_char5 = AV87Path ;
      GXv_char8[0] = GXt_char5 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "PTHCSV", ""), GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      AV87Path = GXt_char5 ;
      AV78NomInf = AV88Pgmdesc ;
      GXt_int3 = AV69Flag ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "10002E", ""), GXv_int4) ;
      listadodiferenciarecuento_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV69Flag = GXt_int3 ;
      GXt_int3 = AV61InvAt ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "INVAT", ""), GXv_int4) ;
      listadodiferenciarecuento_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV61InvAt = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61InvAt", GXutil.str( AV61InvAt, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINVAT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61InvAt), "9")));
   }

   public void e221PD2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV10WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S162 ();
      if (returnInSub) return;
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
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S182 ();
         if (returnInSub) return;
      }
      edtRecFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtRechora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRechora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRechora_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtRecExiTeo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecExiTeo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtRecExiRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecExiRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRea_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtRecPreRec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPreRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreRec_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtavValoractual_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValoractual_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtDifAlmacen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDifAlmacen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDifAlmacen_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtDifAlmPor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDifAlmPor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDifAlmPor_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtavDesviomon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDesviomon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDesviomon_Visible), 5, 0), !bGXsfl_46_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S202 ();
      if (returnInSub) return;
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e141PD2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e151PD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161PD2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFec") == 0 )
         {
            AV32TFRecFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Rechora") == 0 )
         {
            AV36TFRechora = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRechora", localUtil.ttoc( AV36TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV40TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNum", AV40TFPrdNum);
            AV41TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNum_Sel", AV41TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV42TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdNom", AV42TFPrdNom);
            AV43TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNom_Sel", AV43TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV44TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecExiTeo", GXutil.ltrimstr( AV44TFRecExiTeo, 12, 4));
            AV45TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecExiTeo_To", GXutil.ltrimstr( AV45TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiRea") == 0 )
         {
            AV46TFRecExiRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFRecExiRea", GXutil.ltrimstr( AV46TFRecExiRea, 12, 4));
            AV47TFRecExiRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFRecExiRea_To", GXutil.ltrimstr( AV47TFRecExiRea_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPreRec") == 0 )
         {
            AV64TFRecPreRec = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFRecPreRec", GXutil.ltrimstr( AV64TFRecPreRec, 14, 5));
            AV65TFRecPreRec_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRecPreRec_To", GXutil.ltrimstr( AV65TFRecPreRec_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DifAlmacen") == 0 )
         {
            AV66TFDifAlmacen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFDifAlmacen", GXutil.ltrimstr( AV66TFDifAlmacen, 12, 4));
            AV67TFDifAlmacen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFDifAlmacen_To", GXutil.ltrimstr( AV67TFDifAlmacen_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DifAlmPor") == 0 )
         {
            AV81TFDifAlmPor = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFDifAlmPor", GXutil.ltrimstr( AV81TFDifAlmPor, 7, 2));
            AV82TFDifAlmPor_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFDifAlmPor_To", GXutil.ltrimstr( AV82TFDifAlmPor_To, 7, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e231PD2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV21ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValoractual_Internalname, GXutil.ltrimstr( AV21ValorActual, 11, 2));
         AV80DesvioMon = (A14034DifAlmacen.multiply(A6573RecPreRec)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDesviomon_Internalname, GXutil.ltrimstr( AV80DesvioMon, 7, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(46) ;
         }
         sendrow_462( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e171PD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e131PD2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S212 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S172 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadoDiferenciaRecuento_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV86Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.ListadoDiferenciaRecuento_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char5 = AV30ManageFiltersXml ;
         GXv_char8[0] = GXt_char5 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char8[0] ;
         AV30ManageFiltersXml = GXt_char5 ;
         if ( (GXutil.strcmp("", AV30ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S212 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV86Pgmname+"GridState", AV30ManageFiltersXml) ;
            AV14GridState.fromxml(AV30ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S222 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
   }

   public void e181PD2( )
   {
      /* 'DoExportToExcel' Routine */
      returnInSub = false ;
      GXv_char8[0] = AV22ExcelFilename ;
      new app.documentodiferenciarecuento(remoteHandle, context).execute( AV5Emprcod, AV63ImpCod, AV6recfec, AV7prdnumfrom, AV8prdnumto, AV60desvios, GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.AV22ExcelFilename = GXv_char8[0] ;
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

   public void e191PD2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char8[0] = AV22ExcelFilename ;
      GXv_char7[0] = AV23ErrorMessage ;
      new app.stocksquimicos.listadodiferenciarecuento_wcexport(remoteHandle, context).execute( GXv_char8, GXv_char7) ;
      listadodiferenciarecuento_wc_impl.this.AV22ExcelFilename = GXv_char8[0] ;
      listadodiferenciarecuento_wc_impl.this.AV23ErrorMessage = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ErrorMessage", AV23ErrorMessage);
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e201PD2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.listadodiferenciarecuento_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecFec", "", "Fecha", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Rechora", "", "Fecha/Hora", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNum", "", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNom", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecExiTeo", "Teorico", "Existencias", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecExiRea", "Real", "Existencias", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecPreRec", "", "Precio", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&ValorActual", "Real", "Valor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "DifAlmacen", "", "Diferencia Inventario", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "DifAlmPor", "", "% Desvio Inventário", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&DesvioMon", "", "Valor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char5 = AV25UserCustomValue ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector", GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      AV25UserCustomValue = GXt_char5 ;
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

   public void S162( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      GXt_int3 = (byte)(0) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "INVAT", ""), GXv_int4) ;
      listadodiferenciarecuento_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV83TempBoolean = (boolean)((GXt_int3==1)) ;
      if ( ! ( AV83TempBoolean ) )
      {
         bttBtnexporttoexcel_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtnexporttoexcel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnexporttoexcel_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV29ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV29ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S212( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
      AV32TFRecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
      AV36TFRechora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRechora", localUtil.ttoc( AV36TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV40TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNum", AV40TFPrdNum);
      AV41TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNum_Sel", AV41TFPrdNum_Sel);
      AV42TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdNom", AV42TFPrdNom);
      AV43TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNom_Sel", AV43TFPrdNom_Sel);
      AV44TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecExiTeo", GXutil.ltrimstr( AV44TFRecExiTeo, 12, 4));
      AV45TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecExiTeo_To", GXutil.ltrimstr( AV45TFRecExiTeo_To, 12, 4));
      AV46TFRecExiRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFRecExiRea", GXutil.ltrimstr( AV46TFRecExiRea, 12, 4));
      AV47TFRecExiRea_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFRecExiRea_To", GXutil.ltrimstr( AV47TFRecExiRea_To, 12, 4));
      AV64TFRecPreRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFRecPreRec", GXutil.ltrimstr( AV64TFRecPreRec, 14, 5));
      AV65TFRecPreRec_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRecPreRec_To", GXutil.ltrimstr( AV65TFRecPreRec_To, 14, 5));
      AV66TFDifAlmacen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFDifAlmacen", GXutil.ltrimstr( AV66TFDifAlmacen, 12, 4));
      AV67TFDifAlmacen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFDifAlmacen_To", GXutil.ltrimstr( AV67TFDifAlmacen_To, 12, 4));
      AV81TFDifAlmPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFDifAlmPor", GXutil.ltrimstr( AV81TFDifAlmPor, 7, 2));
      AV82TFDifAlmPor_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFDifAlmPor_To", GXutil.ltrimstr( AV82TFDifAlmPor_To, 7, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV86Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV86Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV28Session.getValue(AV86Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S222( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV106GXV1 = 1 ;
      while ( AV106GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV106GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV32TFRecFec = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV36TFRechora = localUtil.ctot( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFRechora", localUtil.ttoc( AV36TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV38DDO_RechoraAuxDate = GXutil.resetTime(AV36TFRechora) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_RechoraAuxDate", localUtil.format(AV38DDO_RechoraAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV40TFPrdNum = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdNum", AV40TFPrdNum);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV41TFPrdNum_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdNum_Sel", AV41TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV42TFPrdNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFPrdNom", AV42TFPrdNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV43TFPrdNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNom_Sel", AV43TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV44TFRecExiTeo = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFRecExiTeo", GXutil.ltrimstr( AV44TFRecExiTeo, 12, 4));
            AV45TFRecExiTeo_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFRecExiTeo_To", GXutil.ltrimstr( AV45TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV46TFRecExiRea = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFRecExiRea", GXutil.ltrimstr( AV46TFRecExiRea, 12, 4));
            AV47TFRecExiRea_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFRecExiRea_To", GXutil.ltrimstr( AV47TFRecExiRea_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV64TFRecPreRec = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFRecPreRec", GXutil.ltrimstr( AV64TFRecPreRec, 14, 5));
            AV65TFRecPreRec_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRecPreRec_To", GXutil.ltrimstr( AV65TFRecPreRec_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMACEN") == 0 )
         {
            AV66TFDifAlmacen = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFDifAlmacen", GXutil.ltrimstr( AV66TFDifAlmacen, 12, 4));
            AV67TFDifAlmacen_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFDifAlmacen_To", GXutil.ltrimstr( AV67TFDifAlmacen_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMPOR") == 0 )
         {
            AV81TFDifAlmPor = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFDifAlmPor", GXutil.ltrimstr( AV81TFDifAlmPor, 7, 2));
            AV82TFDifAlmPor_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFDifAlmPor_To", GXutil.ltrimstr( AV82TFDifAlmPor_To, 7, 2));
         }
         AV106GXV1 = (int)(AV106GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrdNum_Sel)==0), AV41TFPrdNum_Sel, GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      GXt_char16 = "" ;
      GXv_char7[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdNom_Sel)==0), AV43TFPrdNom_Sel, GXv_char7) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char16 = GXv_char7[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char5+"|"+GXt_char16+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char8[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrdNum)==0), AV40TFPrdNum, GXv_char8) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char16 = GXv_char8[0] ;
      GXt_char5 = "" ;
      GXv_char7[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFPrdNom)==0), AV42TFPrdNom, GXv_char7) ;
      listadodiferenciarecuento_wc_impl.this.GXt_char5 = GXv_char7[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRecFec)) ? "" : localUtil.dtoc( AV32TFRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV36TFRechora) ? "" : localUtil.dtoc( AV38DDO_RechoraAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16+"|"+GXt_char5+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFRecExiTeo)==0) ? "" : GXutil.str( AV44TFRecExiTeo, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFRecExiRea)==0) ? "" : GXutil.str( AV46TFRecExiRea, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFRecPreRec)==0) ? "" : GXutil.str( AV64TFRecPreRec, 14, 5))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFDifAlmacen)==0) ? "" : GXutil.str( AV66TFDifAlmacen, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFDifAlmPor)==0) ? "" : GXutil.str( AV81TFDifAlmPor, 7, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFRecExiTeo_To)==0) ? "" : GXutil.str( AV45TFRecExiTeo_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFRecExiRea_To)==0) ? "" : GXutil.str( AV47TFRecExiRea_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFRecPreRec_To)==0) ? "" : GXutil.str( AV65TFRecPreRec_To, 14, 5))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFDifAlmacen_To)==0) ? "" : GXutil.str( AV67TFDifAlmacen_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFDifAlmPor_To)==0) ? "" : GXutil.str( AV82TFDifAlmPor_To, 7, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV28Session.getValue(AV86Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFRECFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRecFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFRECHORA", "", !GXutil.dateCompare(GXutil.nullDate(), AV36TFRechora), (short)(0), GXutil.trim( localUtil.ttoc( AV36TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFPRDNUM", "", !(GXutil.strcmp("", AV40TFPrdNum)==0), (short)(0), AV40TFPrdNum, "", !(GXutil.strcmp("", AV41TFPrdNum_Sel)==0), AV41TFPrdNum_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFPRDNOM", "", !(GXutil.strcmp("", AV42TFPrdNom)==0), (short)(0), AV42TFPrdNom, "", !(GXutil.strcmp("", AV43TFPrdNom_Sel)==0), AV43TFPrdNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV45TFRecExiTeo_To, 12, 4))) ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFRECEXIREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFRecExiRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFRecExiRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFRecExiRea, 12, 4)), GXutil.trim( GXutil.str( AV47TFRecExiRea_To, 12, 4))) ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFRECPREREC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFRecPreRec)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFRecPreRec_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV64TFRecPreRec, 14, 5)), GXutil.trim( GXutil.str( AV65TFRecPreRec_To, 14, 5))) ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFDIFALMACEN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFDifAlmacen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFDifAlmacen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFDifAlmacen, 12, 4)), GXutil.trim( GXutil.str( AV67TFDifAlmacen_To, 12, 4))) ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFDIFALMPOR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFDifAlmPor)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFDifAlmPor_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV81TFDifAlmPor, 7, 2)), GXutil.trim( GXutil.str( AV82TFDifAlmPor_To, 7, 2))) ;
      AV14GridState = GXv_SdtWWPGridState17[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6recfec)) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECFEC" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV6recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7prdnumfrom)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUMFROM" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7prdnumfrom );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8prdnumto)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUMTO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8prdnumto );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60desvios)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DESVIOS" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60desvios );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV86Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV86Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.RECUEN_TRN" );
      AV28Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      tblTableparametro_Visible = (((1==2)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTableparametro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTableparametro_Visible), 5, 0), true);
   }

   public void S192( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV52TotRecExiTeo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotRecExiTeo", GXutil.ltrimstr( AV52TotRecExiTeo, 18, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999")));
      AV56TotRecExiRea = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotRecExiRea", GXutil.ltrimstr( AV56TotRecExiRea, 18, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999")));
      AV58TotValorActual = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotValorActual", GXutil.ltrimstr( AV58TotValorActual, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALORACTUAL", getSecureSignedToken( sPrefix, localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99")));
   }

   public void S202( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV19FilterFullText ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV32TFRecFec ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV36TFRechora ;
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV64TFRecPreRec ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV65TFRecPreRec_To ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV66TFDifAlmacen ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV67TFDifAlmacen_To ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV81TFDifAlmPor ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV82TFDifAlmPor_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV6recfec ,
                                           AV7prdnumfrom ,
                                           AV8prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV60desvios ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor H01PD4 */
      pr_default.execute(2, new Object[] {AV5Emprcod, AV60desvios, AV60desvios, AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV6recfec, AV7prdnumfrom, AV8prdnumto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H01PD4_A396EmprCod[0] ;
         A14034DifAlmacen = H01PD4_A14034DifAlmacen[0] ;
         A6573RecPreRec = H01PD4_A6573RecPreRec[0] ;
         A718PrdNom = H01PD4_A718PrdNom[0] ;
         A719PrdNum = H01PD4_A719PrdNum[0] ;
         A13455Rechora = H01PD4_A13455Rechora[0] ;
         A810RecFec = H01PD4_A810RecFec[0] ;
         A807RecExiRea = H01PD4_A807RecExiRea[0] ;
         A809RecExiTeo = H01PD4_A809RecExiTeo[0] ;
         A718PrdNom = H01PD4_A718PrdNom[0] ;
         GXt_decimal1 = A14377DifAlmPor ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
         listadodiferenciarecuento_wc_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
         A14377DifAlmPor = GXt_decimal1 ;
         if ( (GXutil.strcmp("", AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
                  AV52TotRecExiTeo = A809RecExiTeo.add(AV52TotRecExiTeo) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotRecExiTeo", GXutil.ltrimstr( AV52TotRecExiTeo, 18, 4));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999")));
                  AV56TotRecExiRea = A807RecExiRea.add(AV56TotRecExiRea) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotRecExiRea", GXutil.ltrimstr( AV56TotRecExiRea, 18, 4));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTRECEXIREA", getSecureSignedToken( sPrefix, localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999")));
                  AV21ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValoractual_Internalname, GXutil.ltrimstr( AV21ValorActual, 11, 2));
                  AV58TotValorActual = AV21ValorActual.add(AV58TotValorActual) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TotValorActual", GXutil.ltrimstr( AV58TotValorActual, 18, 2));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALORACTUAL", getSecureSignedToken( sPrefix, localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99")));
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV53TotValueRecExiTeo = localUtil.format( AV52TotRecExiTeo, "ZZZZZZ9.9999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotValueRecExiTeo", AV53TotValueRecExiTeo);
      AV57TotValueRecExiRea = localUtil.format( AV56TotRecExiRea, "ZZZZZZ9.9999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueRecExiRea", AV57TotValueRecExiRea);
      AV59TotValueValorActual = localUtil.format( AV58TotValorActual, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TotValueValorActual", AV59TotValueValorActual);
   }

   public void wb_table3_88_1PD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTableparametro_Visible == 0 )
         {
            sStyleString += "display:none;" ;
         }
         app.GxWebStd.gx_table_start( httpContext, tblTableparametro_Internalname, tblTableparametro_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprcod_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, AV5Emprcod, GXutil.rtrim( localUtil.format( AV5Emprcod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfec_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavRecfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfec_Internalname, localUtil.format(AV6recfec, "99/99/99"), localUtil.format( AV6recfec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnumfrom_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnumfrom_Internalname, AV7prdnumfrom, GXutil.rtrim( localUtil.format( AV7prdnumfrom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnumfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnumfrom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnumto_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnumto_Internalname, AV8prdnumto, GXutil.rtrim( localUtil.format( AV8prdnumto, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnumto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavDesvios_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesvios_Internalname, GXutil.rtrim( AV60desvios), GXutil.rtrim( localUtil.format( AV60desvios, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesvios_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesvios_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_88_1PD2e( true) ;
      }
      else
      {
         wb_table3_88_1PD2e( false) ;
      }
   }

   public void wb_table2_60_1PD2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluerecexiteo_Internalname, httpContext.getMessage( "Tot Value Rec Exi Teo", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluerecexiteo_Internalname, AV53TotValueRecExiTeo, GXutil.rtrim( localUtil.format( AV53TotValueRecExiTeo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluerecexiteo_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluerecexiteo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluerecexirea_Internalname, httpContext.getMessage( "Tot Value Rec Exi Rea", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluerecexirea_Internalname, AV57TotValueRecExiRea, GXutil.rtrim( localUtil.format( AV57TotValueRecExiRea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluerecexirea_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluerecexirea_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluevaloractual_Internalname, httpContext.getMessage( "Tot Value Valor Actual", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluevaloractual_Internalname, AV59TotValueValorActual, GXutil.rtrim( localUtil.format( AV59TotValueValorActual, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluevaloractual_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluevaloractual_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_60_1PD2e( true) ;
      }
      else
      {
         wb_table2_60_1PD2e( false) ;
      }
   }

   public void wb_table1_31_1PD2( boolean wbgen )
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
         wb_table4_36_1PD2( true) ;
      }
      else
      {
         wb_table4_36_1PD2( false) ;
      }
      return  ;
   }

   public void wb_table4_36_1PD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_31_1PD2e( true) ;
      }
      else
      {
         wb_table1_31_1PD2e( false) ;
      }
   }

   public void wb_table4_36_1PD2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\ListadoDiferenciaRecuento_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_36_1PD2e( true) ;
      }
      else
      {
         wb_table4_36_1PD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6recfec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6recfec", localUtil.format(AV6recfec, "99/99/99"));
      AV7prdnumfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7prdnumfrom", AV7prdnumfrom);
      AV8prdnumto = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8prdnumto", AV8prdnumto);
      AV60desvios = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60desvios", AV60desvios);
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
      pa1PD2( ) ;
      ws1PD2( ) ;
      we1PD2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6recfec = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7prdnumfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8prdnumto = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV60desvios = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1PD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\listadodiferenciarecuento_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1PD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6recfec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6recfec", localUtil.format(AV6recfec, "99/99/99"));
         AV7prdnumfrom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7prdnumfrom", AV7prdnumfrom);
         AV8prdnumto = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8prdnumto", AV8prdnumto);
         AV60desvios = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60desvios", AV60desvios);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6recfec"), 0) ;
      wcpOAV7prdnumfrom = httpContext.cgiGet( sPrefix+"wcpOAV7prdnumfrom") ;
      wcpOAV8prdnumto = httpContext.cgiGet( sPrefix+"wcpOAV8prdnumto") ;
      wcpOAV60desvios = httpContext.cgiGet( sPrefix+"wcpOAV60desvios") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV6recfec), GXutil.resetTime(wcpOAV6recfec)) ) || ( GXutil.strcmp(AV7prdnumfrom, wcpOAV7prdnumfrom) != 0 ) || ( GXutil.strcmp(AV8prdnumto, wcpOAV8prdnumto) != 0 ) || ( GXutil.strcmp(AV60desvios, wcpOAV60desvios) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6recfec = AV6recfec ;
      wcpOAV7prdnumfrom = AV7prdnumfrom ;
      wcpOAV8prdnumto = AV8prdnumto ;
      wcpOAV60desvios = AV60desvios ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6recfec = httpContext.cgiGet( sPrefix+"AV6recfec_CTRL") ;
      if ( GXutil.len( sCtrlAV6recfec) > 0 )
      {
         AV6recfec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6recfec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6recfec", localUtil.format(AV6recfec, "99/99/99"));
      }
      else
      {
         AV6recfec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6recfec_PARM"), 0) ;
      }
      sCtrlAV7prdnumfrom = httpContext.cgiGet( sPrefix+"AV7prdnumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV7prdnumfrom) > 0 )
      {
         AV7prdnumfrom = httpContext.cgiGet( sCtrlAV7prdnumfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7prdnumfrom", AV7prdnumfrom);
      }
      else
      {
         AV7prdnumfrom = httpContext.cgiGet( sPrefix+"AV7prdnumfrom_PARM") ;
      }
      sCtrlAV8prdnumto = httpContext.cgiGet( sPrefix+"AV8prdnumto_CTRL") ;
      if ( GXutil.len( sCtrlAV8prdnumto) > 0 )
      {
         AV8prdnumto = httpContext.cgiGet( sCtrlAV8prdnumto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8prdnumto", AV8prdnumto);
      }
      else
      {
         AV8prdnumto = httpContext.cgiGet( sPrefix+"AV8prdnumto_PARM") ;
      }
      sCtrlAV60desvios = httpContext.cgiGet( sPrefix+"AV60desvios_CTRL") ;
      if ( GXutil.len( sCtrlAV60desvios) > 0 )
      {
         AV60desvios = httpContext.cgiGet( sCtrlAV60desvios) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60desvios", AV60desvios);
      }
      else
      {
         AV60desvios = httpContext.cgiGet( sPrefix+"AV60desvios_PARM") ;
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
      pa1PD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1PD2( ) ;
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
      ws1PD2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", AV5Emprcod);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6recfec_PARM", localUtil.dtoc( AV6recfec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6recfec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6recfec_CTRL", GXutil.rtrim( sCtrlAV6recfec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7prdnumfrom_PARM", AV7prdnumfrom);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7prdnumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7prdnumfrom_CTRL", GXutil.rtrim( sCtrlAV7prdnumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8prdnumto_PARM", AV8prdnumto);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8prdnumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8prdnumto_CTRL", GXutil.rtrim( sCtrlAV8prdnumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60desvios_PARM", GXutil.rtrim( AV60desvios));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60desvios)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60desvios_CTRL", GXutil.rtrim( sCtrlAV60desvios));
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
      we1PD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556180", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/listadodiferenciarecuento_wc.js", "?20268211556180", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_462( )
   {
      edtRecFec_Internalname = sPrefix+"RECFEC_"+sGXsfl_46_idx ;
      edtRechora_Internalname = sPrefix+"RECHORA_"+sGXsfl_46_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_46_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_46_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_46_idx ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA_"+sGXsfl_46_idx ;
      edtRecPreRec_Internalname = sPrefix+"RECPREREC_"+sGXsfl_46_idx ;
      edtavValoractual_Internalname = sPrefix+"vVALORACTUAL_"+sGXsfl_46_idx ;
      edtDifAlmacen_Internalname = sPrefix+"DIFALMACEN_"+sGXsfl_46_idx ;
      edtDifAlmPor_Internalname = sPrefix+"DIFALMPOR_"+sGXsfl_46_idx ;
      edtavDesviomon_Internalname = sPrefix+"vDESVIOMON_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      edtRecFec_Internalname = sPrefix+"RECFEC_"+sGXsfl_46_fel_idx ;
      edtRechora_Internalname = sPrefix+"RECHORA_"+sGXsfl_46_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_46_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_46_fel_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_46_fel_idx ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA_"+sGXsfl_46_fel_idx ;
      edtRecPreRec_Internalname = sPrefix+"RECPREREC_"+sGXsfl_46_fel_idx ;
      edtavValoractual_Internalname = sPrefix+"vVALORACTUAL_"+sGXsfl_46_fel_idx ;
      edtDifAlmacen_Internalname = sPrefix+"DIFALMACEN_"+sGXsfl_46_fel_idx ;
      edtDifAlmPor_Internalname = sPrefix+"DIFALMPOR_"+sGXsfl_46_fel_idx ;
      edtavDesviomon_Internalname = sPrefix+"vDESVIOMON_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb1PD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFec_Internalname,localUtil.format(A810RecFec, "99/99/99"),localUtil.format( A810RecFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRechora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRechora_Internalname,localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13455Rechora, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRechora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRechora_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTeo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRea_Internalname,GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecExiRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecPreRec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPreRec_Internalname,GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6573RecPreRec, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPreRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecPreRec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValoractual_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValoractual_Internalname,GXutil.ltrim( localUtil.ntoc( AV21ValorActual, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValoractual_Enabled!=0) ? localUtil.format( AV21ValorActual, "ZZZZZZZ9.99") : localUtil.format( AV21ValorActual, "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValoractual_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValoractual_Visible),Integer.valueOf(edtavValoractual_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDifAlmacen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDifAlmacen_Internalname,GXutil.ltrim( localUtil.ntoc( A14034DifAlmacen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14034DifAlmacen, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDifAlmacen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDifAlmacen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDifAlmPor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDifAlmPor_Internalname,GXutil.ltrim( localUtil.ntoc( A14377DifAlmPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14377DifAlmPor, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDifAlmPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDifAlmPor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDesviomon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDesviomon_Internalname,GXutil.ltrim( localUtil.ntoc( AV80DesvioMon, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDesviomon_Enabled!=0) ? localUtil.format( AV80DesvioMon, "ZZZ9.99") : localUtil.format( AV80DesvioMon, "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDesviomon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDesviomon_Visible),Integer.valueOf(edtavDesviomon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1PD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRechora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha/Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPreRec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValoractual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDifAlmacen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Diferencia Inventario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDifAlmPor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% Desvio Inventário", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDesviomon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A810RecFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRechora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPreRec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21ValorActual, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValoractual_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValoractual_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14034DifAlmacen, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDifAlmacen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14377DifAlmPor, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDifAlmPor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80DesvioMon, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDesviomon_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDesviomon_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexporttoexcel_Internalname = sPrefix+"BTNEXPORTTOEXCEL" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnpdf_1_Internalname = sPrefix+"BTNPDF_1" ;
      bttBtnpdf_2_Internalname = sPrefix+"BTNPDF_2" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtRecFec_Internalname = sPrefix+"RECFEC" ;
      edtRechora_Internalname = sPrefix+"RECHORA" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO" ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA" ;
      edtRecPreRec_Internalname = sPrefix+"RECPREREC" ;
      edtavValoractual_Internalname = sPrefix+"vVALORACTUAL" ;
      edtDifAlmacen_Internalname = sPrefix+"DIFALMACEN" ;
      edtDifAlmPor_Internalname = sPrefix+"DIFALMPOR" ;
      edtavDesviomon_Internalname = sPrefix+"vDESVIOMON" ;
      edtavTotvaluerecexiteo_Internalname = sPrefix+"vTOTVALUERECEXITEO" ;
      edtavTotvaluerecexirea_Internalname = sPrefix+"vTOTVALUERECEXIREA" ;
      edtavTotvaluevaloractual_Internalname = sPrefix+"vTOTVALUEVALORACTUAL" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtavRecfec_Internalname = sPrefix+"vRECFEC" ;
      edtavPrdnumfrom_Internalname = sPrefix+"vPRDNUMFROM" ;
      edtavPrdnumto_Internalname = sPrefix+"vPRDNUMTO" ;
      edtavDesvios_Internalname = sPrefix+"vDESVIOS" ;
      tblTableparametro_Internalname = sPrefix+"TABLEPARAMETRO" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_recfecauxdate_Internalname = sPrefix+"vDDO_RECFECAUXDATE" ;
      divDdo_recfecauxdates_Internalname = sPrefix+"DDO_RECFECAUXDATES" ;
      edtavDdo_rechoraauxdate_Internalname = sPrefix+"vDDO_RECHORAAUXDATE" ;
      divDdo_rechoraauxdates_Internalname = sPrefix+"DDO_RECHORAAUXDATES" ;
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
      edtavDesviomon_Jsonclick = "" ;
      edtavDesviomon_Enabled = 0 ;
      edtDifAlmPor_Jsonclick = "" ;
      edtDifAlmacen_Jsonclick = "" ;
      edtavValoractual_Jsonclick = "" ;
      edtavValoractual_Enabled = 0 ;
      edtRecPreRec_Jsonclick = "" ;
      edtRecExiRea_Jsonclick = "" ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRechora_Jsonclick = "" ;
      edtRecFec_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluevaloractual_Jsonclick = "" ;
      edtavTotvaluevaloractual_Enabled = 1 ;
      edtavTotvaluerecexirea_Jsonclick = "" ;
      edtavTotvaluerecexirea_Enabled = 1 ;
      edtavTotvaluerecexiteo_Jsonclick = "" ;
      edtavTotvaluerecexiteo_Enabled = 1 ;
      edtavDesvios_Jsonclick = "" ;
      edtavDesvios_Enabled = 0 ;
      edtavPrdnumto_Jsonclick = "" ;
      edtavPrdnumto_Enabled = 0 ;
      edtavPrdnumfrom_Jsonclick = "" ;
      edtavPrdnumfrom_Enabled = 0 ;
      edtavRecfec_Jsonclick = "" ;
      edtavRecfec_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      tblTableparametro_Visible = 1 ;
      edtavDesviomon_Visible = -1 ;
      edtDifAlmPor_Visible = -1 ;
      edtDifAlmacen_Visible = -1 ;
      edtavValoractual_Visible = -1 ;
      edtRecPreRec_Visible = -1 ;
      edtRecExiRea_Visible = -1 ;
      edtRecExiTeo_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtRechora_Visible = -1 ;
      edtRecFec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_rechoraauxdate_Jsonclick = "" ;
      edtavDdo_recfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnexporttoexcel_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;Teorico;Real;;Real;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "StocksQuimicos.ListadoDiferenciaRecuento_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "||T|T|||||||" ;
      Ddo_grid_Filterisrange = "||||T|T|T||T|T|" ;
      Ddo_grid_Filtertype = "Date|Date|Character|Character|Numeric|Numeric|Numeric||Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T||T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T||||" ;
      Ddo_grid_Columnssortvalues = "2|3|1|4|5|6|7||||" ;
      Ddo_grid_Columnids = "0:RecFec|1:Rechora|2:PrdNum|3:PrdNom|4:RecExiTeo|5:RecExiRea|6:RecPreRec|7:ValorActual|8:DifAlmacen|9:DifAlmPor|10:DesvioMon" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtRecPreRec_Visible',ctrl:'RECPREREC',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'edtDifAlmacen_Visible',ctrl:'DIFALMACEN',prop:'Visible'},{av:'edtDifAlmPor_Visible',ctrl:'DIFALMPOR',prop:'Visible'},{av:'edtavDesviomon_Visible',ctrl:'vDESVIOMON',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNEXPORTTOEXCEL',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV21ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV53TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV57TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV59TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141PD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151PD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161PD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231PD2',iparms:[{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999'},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV21ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV80DesvioMon',fld:'vDESVIOMON',pic:'ZZZ9.99'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171PD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtRecPreRec_Visible',ctrl:'RECPREREC',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'edtDifAlmacen_Visible',ctrl:'DIFALMACEN',prop:'Visible'},{av:'edtDifAlmPor_Visible',ctrl:'DIFALMPOR',prop:'Visible'},{av:'edtavDesviomon_Visible',ctrl:'vDESVIOMON',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNEXPORTTOEXCEL',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV21ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV53TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV57TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV59TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e131PD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'AV86Pgmname',fld:'vPGMNAME',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV36TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV42TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV43TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV44TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV45TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFRecPreRec',fld:'vTFRECPREREC',pic:'ZZZZ9.99999'},{av:'AV65TFRecPreRec_To',fld:'vTFRECPREREC_TO',pic:'ZZZZ9.99999'},{av:'AV66TFDifAlmacen',fld:'vTFDIFALMACEN',pic:'ZZZZZZ9.9999'},{av:'AV67TFDifAlmacen_To',fld:'vTFDIFALMACEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV81TFDifAlmPor',fld:'vTFDIFALMPOR',pic:'ZZZ9.99'},{av:'AV82TFDifAlmPor_To',fld:'vTFDIFALMPOR_TO',pic:'ZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV38DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtRecPreRec_Visible',ctrl:'RECPREREC',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'edtDifAlmacen_Visible',ctrl:'DIFALMACEN',prop:'Visible'},{av:'edtDifAlmPor_Visible',ctrl:'DIFALMPOR',prop:'Visible'},{av:'edtavDesviomon_Visible',ctrl:'vDESVIOMON',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNEXPORTTOEXCEL',prop:'Visible'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV52TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV56TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV58TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV21ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV53TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV57TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV59TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("'DOEXPORTTOEXCEL'","{handler:'e181PD2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''},{av:'AV23ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("'DOEXPORTTOEXCEL'",",oparms:[]}");
      setEventMetadata("'DOPDF_1'","{handler:'e111PD1',iparms:[{av:'AV61InvAt',fld:'vINVAT',pic:'9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV63ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV6recfec',fld:'vRECFEC',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV60desvios',fld:'vDESVIOS',pic:''}]");
      setEventMetadata("'DOPDF_1'",",oparms:[]}");
      setEventMetadata("'DOPDF_2'","{handler:'e121PD1',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:''},{av:'AV7prdnumfrom',fld:'vPRDNUMFROM',pic:''},{av:'AV8prdnumto',fld:'vPRDNUMTO',pic:''},{av:'AV6recfec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("'DOPDF_2'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e191PD2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV23ErrorMessage',fld:'vERRORMESSAGE',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e201PD2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_RECEXITEO","{handler:'valid_Recexiteo',iparms:[]");
      setEventMetadata("VALID_RECEXITEO",",oparms:[]}");
      setEventMetadata("VALID_RECEXIREA","{handler:'valid_Recexirea',iparms:[]");
      setEventMetadata("VALID_RECEXIREA",",oparms:[]}");
      setEventMetadata("VALID_RECPREREC","{handler:'valid_Recprerec',iparms:[]");
      setEventMetadata("VALID_RECPREREC",",oparms:[]}");
      setEventMetadata("VALID_DIFALMACEN","{handler:'valid_Difalmacen',iparms:[]");
      setEventMetadata("VALID_DIFALMACEN",",oparms:[]}");
      setEventMetadata("VALID_DIFALMPOR","{handler:'valid_Difalmpor',iparms:[]");
      setEventMetadata("VALID_DIFALMPOR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Desviomon',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6recfec = GXutil.nullDate() ;
      wcpOAV7prdnumfrom = "" ;
      wcpOAV8prdnumto = "" ;
      wcpOAV60desvios = "" ;
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
      AV5Emprcod = "" ;
      AV6recfec = GXutil.nullDate() ;
      AV7prdnumfrom = "" ;
      AV8prdnumto = "" ;
      AV60desvios = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19FilterFullText = "" ;
      AV32TFRecFec = GXutil.nullDate() ;
      AV36TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV40TFPrdNum = "" ;
      AV41TFPrdNum_Sel = "" ;
      AV42TFPrdNom = "" ;
      AV43TFPrdNom_Sel = "" ;
      AV44TFRecExiTeo = DecimalUtil.ZERO ;
      AV45TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV46TFRecExiRea = DecimalUtil.ZERO ;
      AV47TFRecExiRea_To = DecimalUtil.ZERO ;
      AV64TFRecPreRec = DecimalUtil.ZERO ;
      AV65TFRecPreRec_To = DecimalUtil.ZERO ;
      AV66TFDifAlmacen = DecimalUtil.ZERO ;
      AV67TFDifAlmacen_To = DecimalUtil.ZERO ;
      AV81TFDifAlmPor = DecimalUtil.ZERO ;
      AV82TFDifAlmPor_To = DecimalUtil.ZERO ;
      AV86Pgmname = "" ;
      AV52TotRecExiTeo = DecimalUtil.ZERO ;
      AV56TotRecExiRea = DecimalUtil.ZERO ;
      AV58TotValorActual = DecimalUtil.ZERO ;
      AV63ImpCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV29ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23ErrorMessage = "" ;
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
      bttBtnexporttoexcel_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnpdf_1_Jsonclick = "" ;
      bttBtnpdf_2_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_RecFecAuxDate = GXutil.nullDate() ;
      AV38DDO_RechoraAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      AV21ValorActual = DecimalUtil.ZERO ;
      A14034DifAlmacen = DecimalUtil.ZERO ;
      A14377DifAlmPor = DecimalUtil.ZERO ;
      AV80DesvioMon = DecimalUtil.ZERO ;
      AV88Pgmdesc = "" ;
      AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = "" ;
      AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = "" ;
      AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = "" ;
      AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = DecimalUtil.ZERO ;
      AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = DecimalUtil.ZERO ;
      AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = DecimalUtil.ZERO ;
      AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = DecimalUtil.ZERO ;
      AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = DecimalUtil.ZERO ;
      AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      H01PD2_A396EmprCod = new String[] {""} ;
      H01PD2_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD2_A718PrdNom = new String[] {""} ;
      H01PD2_A719PrdNum = new String[] {""} ;
      H01PD2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD3_A396EmprCod = new String[] {""} ;
      H01PD3_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD3_A718PrdNom = new String[] {""} ;
      H01PD3_A719PrdNum = new String[] {""} ;
      H01PD3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV53TotValueRecExiTeo = "" ;
      AV57TotValueRecExiRea = "" ;
      AV59TotValueValorActual = "" ;
      hsh = "" ;
      AV76Station = "" ;
      GXv_char6 = new String[1] ;
      AV77EmprNom = "" ;
      AV70UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV79Carpeta = "" ;
      AV87Path = "" ;
      AV78NomInf = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_int4 = new byte[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char16 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char7 = new String[1] ;
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      H01PD4_A396EmprCod = new String[] {""} ;
      H01PD4_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD4_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD4_A718PrdNom = new String[] {""} ;
      H01PD4_A719PrdNum = new String[] {""} ;
      H01PD4_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01PD4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PD4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6recfec = "" ;
      sCtrlAV7prdnumfrom = "" ;
      sCtrlAV8prdnumto = "" ;
      sCtrlAV60desvios = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodiferenciarecuento_wc__default(),
         new Object[] {
             new Object[] {
            H01PD2_A396EmprCod, H01PD2_A14034DifAlmacen, H01PD2_A6573RecPreRec, H01PD2_A718PrdNom, H01PD2_A719PrdNum, H01PD2_A13455Rechora, H01PD2_A810RecFec, H01PD2_A807RecExiRea, H01PD2_A809RecExiTeo
            }
            , new Object[] {
            H01PD3_A396EmprCod, H01PD3_A14034DifAlmacen, H01PD3_A6573RecPreRec, H01PD3_A718PrdNom, H01PD3_A719PrdNum, H01PD3_A13455Rechora, H01PD3_A810RecFec, H01PD3_A807RecExiRea, H01PD3_A809RecExiTeo
            }
            , new Object[] {
            H01PD4_A396EmprCod, H01PD4_A14034DifAlmacen, H01PD4_A6573RecPreRec, H01PD4_A718PrdNom, H01PD4_A719PrdNum, H01PD4_A13455Rechora, H01PD4_A810RecFec, H01PD4_A807RecExiRea, H01PD4_A809RecExiTeo
            }
         }
      );
      AV88Pgmdesc = httpContext.getMessage( "Recuentos de Productos", "") ;
      AV86Pgmname = "StocksQuimicos.ListadoDiferenciaRecuento_WC" ;
      /* GeneXus formulas. */
      AV88Pgmdesc = httpContext.getMessage( "Recuentos de Productos", "") ;
      AV86Pgmname = "StocksQuimicos.ListadoDiferenciaRecuento_WC" ;
      Gx_err = (short)(0) ;
      edtavValoractual_Enabled = 0 ;
      edtavDesviomon_Enabled = 0 ;
      edtavTotvaluerecexiteo_Enabled = 0 ;
      edtavTotvaluerecexirea_Enabled = 0 ;
      edtavTotvaluevaloractual_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte AV61InvAt ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV69Flag ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV16OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int bttBtnexporttoexcel_Visible ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavValoractual_Enabled ;
   private int edtavDesviomon_Enabled ;
   private int edtavTotvaluerecexiteo_Enabled ;
   private int edtavTotvaluerecexirea_Enabled ;
   private int edtavTotvaluevaloractual_Enabled ;
   private int edtRecFec_Visible ;
   private int edtRechora_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtRecExiTeo_Visible ;
   private int edtRecExiRea_Visible ;
   private int edtRecPreRec_Visible ;
   private int edtavValoractual_Visible ;
   private int edtDifAlmacen_Visible ;
   private int edtDifAlmPor_Visible ;
   private int edtavDesviomon_Visible ;
   private int AV49PageToGo ;
   private int AV106GXV1 ;
   private int tblTableparametro_Visible ;
   private int edtavEmprcod_Enabled ;
   private int edtavRecfec_Enabled ;
   private int edtavPrdnumfrom_Enabled ;
   private int edtavPrdnumto_Enabled ;
   private int edtavDesvios_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV44TFRecExiTeo ;
   private java.math.BigDecimal AV45TFRecExiTeo_To ;
   private java.math.BigDecimal AV46TFRecExiRea ;
   private java.math.BigDecimal AV47TFRecExiRea_To ;
   private java.math.BigDecimal AV64TFRecPreRec ;
   private java.math.BigDecimal AV65TFRecPreRec_To ;
   private java.math.BigDecimal AV66TFDifAlmacen ;
   private java.math.BigDecimal AV67TFDifAlmacen_To ;
   private java.math.BigDecimal AV81TFDifAlmPor ;
   private java.math.BigDecimal AV82TFDifAlmPor_To ;
   private java.math.BigDecimal AV52TotRecExiTeo ;
   private java.math.BigDecimal AV56TotRecExiRea ;
   private java.math.BigDecimal AV58TotValorActual ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV21ValorActual ;
   private java.math.BigDecimal A14034DifAlmacen ;
   private java.math.BigDecimal A14377DifAlmPor ;
   private java.math.BigDecimal AV80DesvioMon ;
   private java.math.BigDecimal AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ;
   private java.math.BigDecimal AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ;
   private java.math.BigDecimal AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ;
   private java.math.BigDecimal AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ;
   private java.math.BigDecimal AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ;
   private java.math.BigDecimal AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String wcpOAV60desvios ;
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
   private String AV60desvios ;
   private String sGXsfl_46_idx="0001" ;
   private String AV40TFPrdNum ;
   private String AV41TFPrdNum_Sel ;
   private String AV42TFPrdNom ;
   private String AV43TFPrdNom_Sel ;
   private String AV86Pgmname ;
   private String AV63ImpCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String bttBtnexporttoexcel_Internalname ;
   private String bttBtnexporttoexcel_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtnpdf_1_Internalname ;
   private String bttBtnpdf_1_Jsonclick ;
   private String bttBtnpdf_2_Internalname ;
   private String bttBtnpdf_2_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_recfecauxdates_Internalname ;
   private String edtavDdo_recfecauxdate_Internalname ;
   private String edtavDdo_recfecauxdate_Jsonclick ;
   private String divDdo_rechoraauxdates_Internalname ;
   private String edtavDdo_rechoraauxdate_Internalname ;
   private String edtavDdo_rechoraauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtRecFec_Internalname ;
   private String edtRechora_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtRecExiRea_Internalname ;
   private String edtRecPreRec_Internalname ;
   private String edtavValoractual_Internalname ;
   private String edtDifAlmacen_Internalname ;
   private String edtDifAlmPor_Internalname ;
   private String edtavDesviomon_Internalname ;
   private String AV88Pgmdesc ;
   private String edtavTotvaluerecexiteo_Internalname ;
   private String edtavTotvaluerecexirea_Internalname ;
   private String edtavTotvaluevaloractual_Internalname ;
   private String AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ;
   private String AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String lV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String hsh ;
   private String AV76Station ;
   private String GXv_char6[] ;
   private String AV77EmprNom ;
   private String AV70UsurCod ;
   private String AV87Path ;
   private String GXt_char16 ;
   private String GXv_char8[] ;
   private String GXt_char5 ;
   private String GXv_char7[] ;
   private String tblTableparametro_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavRecfec_Internalname ;
   private String edtavRecfec_Jsonclick ;
   private String edtavPrdnumfrom_Internalname ;
   private String edtavPrdnumfrom_Jsonclick ;
   private String edtavPrdnumto_Internalname ;
   private String edtavPrdnumto_Jsonclick ;
   private String edtavDesvios_Internalname ;
   private String edtavDesvios_Jsonclick ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluerecexiteo_Jsonclick ;
   private String edtavTotvaluerecexirea_Jsonclick ;
   private String edtavTotvaluevaloractual_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6recfec ;
   private String sCtrlAV7prdnumfrom ;
   private String sCtrlAV8prdnumto ;
   private String sCtrlAV60desvios ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtRecFec_Jsonclick ;
   private String edtRechora_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtRecExiRea_Jsonclick ;
   private String edtRecPreRec_Jsonclick ;
   private String edtavValoractual_Jsonclick ;
   private String edtDifAlmacen_Jsonclick ;
   private String edtDifAlmPor_Jsonclick ;
   private String edtavDesviomon_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV36TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ;
   private java.util.Date wcpOAV6recfec ;
   private java.util.Date AV6recfec ;
   private java.util.Date AV32TFRecFec ;
   private java.util.Date AV34DDO_RecFecAuxDate ;
   private java.util.Date AV38DDO_RechoraAuxDate ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV83TempBoolean ;
   private String AV24ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV25UserCustomValue ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV7prdnumfrom ;
   private String wcpOAV8prdnumto ;
   private String AV5Emprcod ;
   private String AV7prdnumfrom ;
   private String AV8prdnumto ;
   private String AV19FilterFullText ;
   private String AV23ErrorMessage ;
   private String AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ;
   private String AV53TotValueRecExiTeo ;
   private String AV57TotValueRecExiRea ;
   private String AV59TotValueValorActual ;
   private String AV79Carpeta ;
   private String AV78NomInf ;
   private String AV22ExcelFilename ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01PD2_A396EmprCod ;
   private java.math.BigDecimal[] H01PD2_A14034DifAlmacen ;
   private java.math.BigDecimal[] H01PD2_A6573RecPreRec ;
   private String[] H01PD2_A718PrdNom ;
   private String[] H01PD2_A719PrdNum ;
   private java.util.Date[] H01PD2_A13455Rechora ;
   private java.util.Date[] H01PD2_A810RecFec ;
   private java.math.BigDecimal[] H01PD2_A807RecExiRea ;
   private java.math.BigDecimal[] H01PD2_A809RecExiTeo ;
   private String[] H01PD3_A396EmprCod ;
   private java.math.BigDecimal[] H01PD3_A14034DifAlmacen ;
   private java.math.BigDecimal[] H01PD3_A6573RecPreRec ;
   private String[] H01PD3_A718PrdNom ;
   private String[] H01PD3_A719PrdNum ;
   private java.util.Date[] H01PD3_A13455Rechora ;
   private java.util.Date[] H01PD3_A810RecFec ;
   private java.math.BigDecimal[] H01PD3_A807RecExiRea ;
   private java.math.BigDecimal[] H01PD3_A809RecExiTeo ;
   private String[] H01PD4_A396EmprCod ;
   private java.math.BigDecimal[] H01PD4_A14034DifAlmacen ;
   private java.math.BigDecimal[] H01PD4_A6573RecPreRec ;
   private String[] H01PD4_A718PrdNom ;
   private String[] H01PD4_A719PrdNum ;
   private java.util.Date[] H01PD4_A13455Rechora ;
   private java.util.Date[] H01PD4_A810RecFec ;
   private java.math.BigDecimal[] H01PD4_A807RecExiRea ;
   private java.math.BigDecimal[] H01PD4_A809RecExiTeo ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV29ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class listadodiferenciarecuento_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01PD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV6recfec ,
                                          String AV7prdnumfrom ,
                                          String AV8prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV60desvios ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[20];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H01PD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV6recfec ,
                                          String AV7prdnumfrom ,
                                          String AV8prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV60desvios ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[20];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H01PD4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV6recfec ,
                                          String AV7prdnumfrom ,
                                          String AV8prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String AV89Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV60desvios ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[20];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV91Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_H01PD2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_H01PD3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_H01PD4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01PD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PD4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
                  stmt.setVarchar(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

