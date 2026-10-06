package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaalmacentejidoencrudoproduccion_wc_impl extends GXWebComponent
{
   public consultaalmacentejidoencrudoproduccion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaalmacentejidoencrudoproduccion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaalmacentejidoencrudoproduccion_wc_impl.class ));
   }

   public consultaalmacentejidoencrudoproduccion_wc_impl( int remoteHandle ,
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
               AV6ALbrecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbrecCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbrecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ALbrecCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6ALbrecCod)});
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
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
      AV6ALbrecCod = (int)(GXutil.lval( httpContext.GetPar( "ALbrecCod"))) ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV17FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV30TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV31TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV32TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV33TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV34TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV35TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV36TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV37TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV38TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV39TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV40TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV41TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV42TFBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil"), ".") ;
      AV43TFBarPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil_To"), ".") ;
      AV44TFBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet"), ".") ;
      AV45TFBarPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet_To"), ".") ;
      AV46TFBarPiePie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPiePie"))) ;
      AV47TFBarPiePie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPiePie_To"))) ;
      AV48TFBarAgrEst = httpContext.GetPar( "TFBarAgrEst") ;
      AV49TFBarAgrEst_Sel = httpContext.GetPar( "TFBarAgrEst_Sel") ;
      AV50TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV51TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV52TFBarFecCum = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCum")) ;
      AV64Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV61Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1Q92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nº Recepción utilizada en las siguientes Producciones:", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ALbrecCod,8,0))}, new String[] {"Emprcod","ALbrecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Clicod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaAlmacenTejidoencrudoProduccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\consultaalmacentejidoencrudoproduccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ALbrecCod", GXutil.ltrim( localUtil.ntoc( wcpOAV6ALbrecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV30TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV31TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV32TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV33TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV34TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV35TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV36TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV37TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV38TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV39TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV40TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV41TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV42TFBarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV43TFBarPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV44TFBarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV45TFBarPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEPIE", GXutil.ltrim( localUtil.ntoc( AV46TFBarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIEPIE_TO", GXutil.ltrim( localUtil.ntoc( AV47TFBarPiePie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGREST", GXutil.rtrim( AV48TFBarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGREST_SEL", GXutil.rtrim( AV49TFBarAgrEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV50TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV51TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM", localUtil.dtoc( AV52TFBarFecCum, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV61Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV12GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV12GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV6ALbrecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1Q92( )
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
      return "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nº Recepción utilizada en las siguientes Producciones:", "") ;
   }

   public void wb1Q90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblText1_Internalname, httpContext.getMessage( "Nº Recepción utilizada en las siguientes Producciones:", ""), "", "", lblText1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_29_1Q92( true) ;
      }
      else
      {
         wb_table1_29_1Q92( false) ;
      }
      return  ;
   }

   public void wb_table1_29_1Q92e( boolean wbgen )
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
         startgridcontrol47( ) ;
      }
      if ( wbEnd == 47 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_47 = (int)(nGXsfl_47_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
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
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV56DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccumauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_47_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccumauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccumauxdate_Internalname, localUtil.format(AV54DDO_BarFecCumAuxDate, "99/99/99"), localUtil.format( AV54DDO_BarFecCumAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccumauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccumauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 47 )
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

   public void start1Q92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Nº Recepción utilizada en las siguientes Producciones:", ""), (short)(0)) ;
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
            strup1Q90( ) ;
         }
      }
   }

   public void ws1Q92( )
   {
      start1Q92( ) ;
      evt1Q92( ) ;
   }

   public void evt1Q92( )
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
                              strup1Q90( ) ;
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
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171Q92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1Q90( ) ;
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
                              strup1Q90( ) ;
                           }
                           nGXsfl_47_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_472( ) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           AV18CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV18CliNom);
                           AV19BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV19BarEncCli);
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
                           A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
                           A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A156BarFecCum = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCum_Internalname), 0)) ;
                           n156BarFecCum = false ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e181Q92 ();
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
                                       e191Q92 ();
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
                                       e201Q92 ();
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
                                    strup1Q90( ) ;
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

   public void we1Q92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1Q92( ) ;
         }
      }
   }

   public void pa1Q92( )
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
      subsflControlProps_472( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         sendrow_472( ) ;
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6ALbrecCod ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV17FilterFullText ,
                                 String AV30TFBarNHdr ,
                                 String AV31TFBarNHdr_Sel ,
                                 String AV32TFBarSer ,
                                 String AV33TFBarSer_Sel ,
                                 String AV34TFBarSerDsc ,
                                 String AV35TFBarSerDsc_Sel ,
                                 String AV36TFBarColNom ,
                                 String AV37TFBarColNom_Sel ,
                                 int AV38TFBarColNum ,
                                 int AV39TFBarColNum_To ,
                                 String AV40TFBarNomCli ,
                                 String AV41TFBarNomCli_Sel ,
                                 java.math.BigDecimal AV42TFBarPieKil ,
                                 java.math.BigDecimal AV43TFBarPieKil_To ,
                                 java.math.BigDecimal AV44TFBarPieMet ,
                                 java.math.BigDecimal AV45TFBarPieMet_To ,
                                 int AV46TFBarPiePie ,
                                 int AV47TFBarPiePie_To ,
                                 String AV48TFBarAgrEst ,
                                 String AV49TFBarAgrEst_Sel ,
                                 String AV50TFBarFasCod ,
                                 String AV51TFBarFasCod_Sel ,
                                 java.util.Date AV52TFBarFecCum ,
                                 String AV64Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 int AV61Clicod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191Q92 ();
      GRID_nCurrentRecord = 0 ;
      rf1Q92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaAlmacenTejidoencrudoProduccion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\consultaalmacentejidoencrudoproduccion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1Q92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmname = "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1Q92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(47) ;
      /* Execute user event: Refresh */
      e191Q92 ();
      nGXsfl_47_idx = 1 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
      bGXsfl_47_Refreshing = true ;
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
         subsflControlProps_472( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                              AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                              AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                              AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                              AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                              AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                              AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                              AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                              Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                              Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                              AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                              AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                              AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                              AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                              AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                              AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                              Integer.valueOf(AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                              Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                              AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                              AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              A203BarPieKil ,
                                              A205BarPieMet ,
                                              Integer.valueOf(A1501BarPiePie) ,
                                              A120BarAgrEst ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              A151BarFasCod ,
                                              AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                              AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                              AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                              A156BarFecCum ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6ALbrecCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A44AlbRecCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
         lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
         lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
         lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
         lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
         lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
         lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
         lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
         /* Using cursor H01Q98 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6ALbrecCod), AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_47_idx = 1 ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01Q98_A396EmprCod[0] ;
            A143BarDisNum = H01Q98_A143BarDisNum[0] ;
            A4812BarEncCli = H01Q98_A4812BarEncCli[0] ;
            A44AlbRecCod = H01Q98_A44AlbRecCod[0] ;
            A200BarPieCod = H01Q98_A200BarPieCod[0] ;
            A120BarAgrEst = H01Q98_A120BarAgrEst[0] ;
            A1501BarPiePie = H01Q98_A1501BarPiePie[0] ;
            A205BarPieMet = H01Q98_A205BarPieMet[0] ;
            A203BarPieKil = H01Q98_A203BarPieKil[0] ;
            A1234BarNomCli = H01Q98_A1234BarNomCli[0] ;
            A136BarColNum = H01Q98_A136BarColNum[0] ;
            A135BarColNom = H01Q98_A135BarColNom[0] ;
            A1652BarSerDsc = H01Q98_A1652BarSerDsc[0] ;
            A212BarSer = H01Q98_A212BarSer[0] ;
            A13696BarNHdr = H01Q98_A13696BarNHdr[0] ;
            A156BarFecCum = H01Q98_A156BarFecCum[0] ;
            n156BarFecCum = H01Q98_n156BarFecCum[0] ;
            A151BarFasCod = H01Q98_A151BarFasCod[0] ;
            n151BarFasCod = H01Q98_n151BarFasCod[0] ;
            A129BarCod = H01Q98_A129BarCod[0] ;
            A132BarCodReo = H01Q98_A132BarCodReo[0] ;
            A130BarCodPar = H01Q98_A130BarCodPar[0] ;
            A143BarDisNum = H01Q98_A143BarDisNum[0] ;
            A4812BarEncCli = H01Q98_A4812BarEncCli[0] ;
            A120BarAgrEst = H01Q98_A120BarAgrEst[0] ;
            A1234BarNomCli = H01Q98_A1234BarNomCli[0] ;
            A136BarColNum = H01Q98_A136BarColNum[0] ;
            A135BarColNom = H01Q98_A135BarColNom[0] ;
            A1652BarSerDsc = H01Q98_A1652BarSerDsc[0] ;
            A212BarSer = H01Q98_A212BarSer[0] ;
            A13696BarNHdr = H01Q98_A13696BarNHdr[0] ;
            A156BarFecCum = H01Q98_A156BarFecCum[0] ;
            n156BarFecCum = H01Q98_n156BarFecCum[0] ;
            A151BarFasCod = H01Q98_A151BarFasCod[0] ;
            n151BarFasCod = H01Q98_n151BarFasCod[0] ;
            e201Q92 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(47) ;
         wb1Q90( ) ;
      }
      bGXsfl_47_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1Q92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV61Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLICOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61Clicod), "ZZZZZ9")));
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
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor H01Q915 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6ALbrecCod), AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      GRID_nRecordCount = H01Q915_AGRID_nRecordCount[0] ;
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
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6ALbrecCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV17FilterFullText, AV30TFBarNHdr, AV31TFBarNHdr_Sel, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFBarPieKil, AV43TFBarPieKil_To, AV44TFBarPieMet, AV45TFBarPieMet_To, AV46TFBarPiePie, AV47TFBarPiePie_To, AV48TFBarAgrEst, AV49TFBarAgrEst_Sel, AV50TFBarFasCod, AV51TFBarFasCod_Sel, AV52TFBarFecCum, AV64Pgmname, AV14OrderedBy, AV15OrderedDsc, AV61Clicod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV64Pgmname = "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1Q90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181Q92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV56DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV59GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6ALbrecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6ALbrecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV17FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCUMAUXDATE");
            GX_FocusControl = edtavDdo_barfeccumauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_BarFecCumAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_BarFecCumAuxDate", localUtil.format(AV54DDO_BarFecCumAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_BarFecCumAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_BarFecCumAuxDate", localUtil.format(AV54DDO_BarFecCumAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultaAlmacenTejidoencrudoProduccion_WC");
         AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Pgmname", AV64Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV64Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\consultaalmacentejidoencrudoproduccion_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e181Q92 ();
      if (returnInSub) return;
   }

   public void e181Q92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV65Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV66Emprnom ;
      GXv_char4[0] = AV67Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV5Emprcod = GXv_char2[0] ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV66Emprnom = GXv_char3[0] ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV67Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      divUnnamedtable1_Height = 10 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
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

   public void e191Q92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV8WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPieKil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieKil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPieMet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPieMet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPiePie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPiePie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_47_Refreshing);
      edtBarFecCum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCum_Visible), 5, 0), !bGXsfl_47_Refreshing);
      AV58GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridCurrentPage), 10, 0));
      AV59GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59GridPageCount), 10, 0));
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV17FilterFullText ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV30TFBarNHdr ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV31TFBarNHdr_Sel ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV32TFBarSer ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV33TFBarSer_Sel ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV34TFBarSerDsc ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV36TFBarColNom ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV38TFBarColNum ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV40TFBarNomCli ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV42TFBarPieKil ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV43TFBarPieKil_To ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV44TFBarPieMet ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV45TFBarPieMet_To ;
      AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV46TFBarPiePie ;
      AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV47TFBarPiePie_To ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV48TFBarAgrEst ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV49TFBarAgrEst_Sel ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV50TFBarFasCod ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV51TFBarFasCod_Sel ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV52TFBarFecCum ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e121Q92( )
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

   public void e131Q92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141Q92( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV30TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNHdr", AV30TFBarNHdr);
            AV31TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV32TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
            AV33TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV34TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
            AV35TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV36TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNom", AV36TFBarColNom);
            AV37TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNom_Sel", AV37TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV38TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarColNum), 6, 0));
            AV39TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV40TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNomCli", AV40TFBarNomCli);
            AV41TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarNomCli_Sel", AV41TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieKil") == 0 )
         {
            AV42TFBarPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPieKil", GXutil.ltrimstr( AV42TFBarPieKil, 9, 2));
            AV43TFBarPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPieKil_To", GXutil.ltrimstr( AV43TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieMet") == 0 )
         {
            AV44TFBarPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarPieMet", GXutil.ltrimstr( AV44TFBarPieMet, 9, 2));
            AV45TFBarPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarPieMet_To", GXutil.ltrimstr( AV45TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPiePie") == 0 )
         {
            AV46TFBarPiePie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarPiePie), 6, 0));
            AV47TFBarPiePie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarPiePie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrEst") == 0 )
         {
            AV48TFBarAgrEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAgrEst", AV48TFBarAgrEst);
            AV49TFBarAgrEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAgrEst_Sel", AV49TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV50TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasCod", AV50TFBarFasCod);
            AV51TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarFasCod_Sel", AV51TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCum") == 0 )
         {
            AV52TFBarFecCum = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecCum", localUtil.format(AV52TFBarFecCum, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201Q92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char1 = AV18CliNom ;
      GXv_int8[0] = AV61Clicod ;
      GXv_char4[0] = GXt_char1 ;
      new app.cliente_tabla_barcad(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8, GXv_char4) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV61Clicod = GXv_int8[0] ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18CliNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV18CliNom);
      AV19BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV19BarEncCli);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(47) ;
      }
      sendrow_472( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_47_Refreshing )
      {
         httpContext.doAjaxLoad(47, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151Q92( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e111Q92( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV64Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV12GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
            AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e161Q92( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV60WebSession.setValue(httpContext.getMessage( "Emprcod", ""), AV5Emprcod);
      AV60WebSession.setValue(httpContext.getMessage( "ALbrecCod", ""), GXutil.str( AV6ALbrecCod, 8, 0));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e171Q92( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV60WebSession.setValue(httpContext.getMessage( "Emprcod", ""), AV5Emprcod);
      AV60WebSession.setValue(httpContext.getMessage( "ALbrecCod", ""), GXutil.str( AV6ALbrecCod, 8, 0));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&CliNom", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Color Cli", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPieKil", "", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPieMet", "", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPiePie", "", "Piezas", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAgrEst", "", "Ag?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasCod", "Fase", "Codigo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecCum", "Fase", "Fech Ult", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCColumnsSelector", GXv_char4) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV17FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
      AV30TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNHdr", AV30TFBarNHdr);
      AV31TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
      AV32TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
      AV33TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
      AV34TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
      AV35TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
      AV36TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNom", AV36TFBarColNom);
      AV37TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNom_Sel", AV37TFBarColNom_Sel);
      AV38TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarColNum), 6, 0));
      AV39TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarColNum_To), 6, 0));
      AV40TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNomCli", AV40TFBarNomCli);
      AV41TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarNomCli_Sel", AV41TFBarNomCli_Sel);
      AV42TFBarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPieKil", GXutil.ltrimstr( AV42TFBarPieKil, 9, 2));
      AV43TFBarPieKil_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPieKil_To", GXutil.ltrimstr( AV43TFBarPieKil_To, 9, 2));
      AV44TFBarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarPieMet", GXutil.ltrimstr( AV44TFBarPieMet, 9, 2));
      AV45TFBarPieMet_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarPieMet_To", GXutil.ltrimstr( AV45TFBarPieMet_To, 9, 2));
      AV46TFBarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarPiePie), 6, 0));
      AV47TFBarPiePie_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarPiePie_To), 6, 0));
      AV48TFBarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAgrEst", AV48TFBarAgrEst);
      AV49TFBarAgrEst_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAgrEst_Sel", AV49TFBarAgrEst_Sel);
      AV50TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasCod", AV50TFBarFasCod);
      AV51TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarFasCod_Sel", AV51TFBarFasCod_Sel);
      AV52TFBarFecCum = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecCum", localUtil.format(AV52TFBarFecCum, "99/99/99"));
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
      if ( GXutil.strcmp(AV26Session.getValue(AV64Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV64Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV26Session.getValue(AV64Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV17FilterFullText = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV30TFBarNHdr = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNHdr", AV30TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV31TFBarNHdr_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNHdr_Sel", AV31TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV32TFBarSer = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV33TFBarSer_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV34TFBarSerDsc = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV35TFBarSerDsc_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV36TFBarColNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNom", AV36TFBarColNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV37TFBarColNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNom_Sel", AV37TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV38TFBarColNum = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarColNum), 6, 0));
            AV39TFBarColNum_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV40TFBarNomCli = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarNomCli", AV40TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV41TFBarNomCli_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarNomCli_Sel", AV41TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV42TFBarPieKil = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarPieKil", GXutil.ltrimstr( AV42TFBarPieKil, 9, 2));
            AV43TFBarPieKil_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarPieKil_To", GXutil.ltrimstr( AV43TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV44TFBarPieMet = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarPieMet", GXutil.ltrimstr( AV44TFBarPieMet, 9, 2));
            AV45TFBarPieMet_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarPieMet_To", GXutil.ltrimstr( AV45TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV46TFBarPiePie = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarPiePie), 6, 0));
            AV47TFBarPiePie_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarPiePie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarPiePie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV48TFBarAgrEst = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarAgrEst", AV48TFBarAgrEst);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV49TFBarAgrEst_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarAgrEst_Sel", AV49TFBarAgrEst_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV50TFBarFasCod = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarFasCod", AV50TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV51TFBarFasCod_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarFasCod_Sel", AV51TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV52TFBarFecCum = localUtil.ctod( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarFecCum", localUtil.format(AV52TFBarFecCum, "99/99/99"));
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarNHdr_Sel)==0), AV31TFBarNHdr_Sel, GXv_char4) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, GXv_char3) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, GXv_char2) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0), AV37TFBarColNom_Sel, GXv_char16) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFBarNomCli_Sel)==0), AV41TFBarNomCli_Sel, GXv_char18) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarAgrEst_Sel)==0), AV49TFBarAgrEst_Sel, GXv_char20) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarFasCod_Sel)==0), AV51TFBarFasCod_Sel, GXv_char22) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char15+"||"+GXt_char17+"||||"+GXt_char19+"|"+GXt_char21+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarNHdr)==0), AV30TFBarNHdr, GXv_char22) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSer)==0), AV32TFBarSer, GXv_char20) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSerDsc)==0), AV34TFBarSerDsc, GXv_char18) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarColNom)==0), AV36TFBarColNom, GXv_char16) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarNomCli)==0), AV40TFBarNomCli, GXv_char4) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFBarAgrEst)==0), AV48TFBarAgrEst, GXv_char3) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarFasCod)==0), AV50TFBarFasCod, GXv_char2) ;
      consultaalmacentejidoencrudoproduccion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char21+"|||"+GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+((0==AV38TFBarColNum) ? "" : GXutil.str( AV38TFBarColNum, 6, 0))+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarPieKil)==0) ? "" : GXutil.str( AV42TFBarPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarPieMet)==0) ? "" : GXutil.str( AV44TFBarPieMet, 9, 2))+"|"+((0==AV46TFBarPiePie) ? "" : GXutil.str( AV46TFBarPiePie, 6, 0))+"|"+GXt_char13+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFBarFecCum)) ? "" : localUtil.dtoc( AV52TFBarFecCum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||"+((0==AV39TFBarColNum_To) ? "" : GXutil.str( AV39TFBarColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarPieKil_To)==0) ? "" : GXutil.str( AV43TFBarPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFBarPieMet_To)==0) ? "" : GXutil.str( AV45TFBarPieMet_To, 9, 2))+"|"+((0==AV47TFBarPiePie_To) ? "" : GXutil.str( AV47TFBarPiePie_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV26Session.getValue(AV64Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV17FilterFullText)==0), (short)(0), AV17FilterFullText, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARNHDR", "", !(GXutil.strcmp("", AV30TFBarNHdr)==0), (short)(0), AV30TFBarNHdr, "", !(GXutil.strcmp("", AV31TFBarNHdr_Sel)==0), AV31TFBarNHdr_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARSER", "", !(GXutil.strcmp("", AV32TFBarSer)==0), (short)(0), AV32TFBarSer, "", !(GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARSERDSC", "", !(GXutil.strcmp("", AV34TFBarSerDsc)==0), (short)(0), AV34TFBarSerDsc, "", !(GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV36TFBarColNom)==0), (short)(0), AV36TFBarColNom, "", !(GXutil.strcmp("", AV37TFBarColNom_Sel)==0), AV37TFBarColNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARCOLNUM", "", !((0==AV38TFBarColNum)&&(0==AV39TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV39TFBarColNum_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV40TFBarNomCli)==0), (short)(0), AV40TFBarNomCli, "", !(GXutil.strcmp("", AV41TFBarNomCli_Sel)==0), AV41TFBarNomCli_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFBarPieKil, 9, 2)), GXutil.trim( GXutil.str( AV43TFBarPieKil_To, 9, 2))) ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFBarPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFBarPieMet, 9, 2)), GXutil.trim( GXutil.str( AV45TFBarPieMet_To, 9, 2))) ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARPIEPIE", "", !((0==AV46TFBarPiePie)&&(0==AV47TFBarPiePie_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFBarPiePie, 6, 0)), GXutil.trim( GXutil.str( AV47TFBarPiePie_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARAGREST", "", !(GXutil.strcmp("", AV48TFBarAgrEst)==0), (short)(0), AV48TFBarAgrEst, "", !(GXutil.strcmp("", AV49TFBarAgrEst_Sel)==0), AV49TFBarAgrEst_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARFASCOD", "", !(GXutil.strcmp("", AV50TFBarFasCod)==0), (short)(0), AV50TFBarFasCod, "", !(GXutil.strcmp("", AV51TFBarFasCod_Sel)==0), AV51TFBarFasCod_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      GXv_SdtWWPGridState23[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState23, "TFBARFECCUM", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFBarFecCum)), (short)(0), GXutil.trim( localUtil.dtoc( AV52TFBarFecCum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV12GridState = GXv_SdtWWPGridState23[0] ;
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV64Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV64Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARPIE" );
      AV26Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_29_1Q92( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_34_1Q92( true) ;
      }
      else
      {
         wb_table2_34_1Q92( false) ;
      }
      return  ;
   }

   public void wb_table2_34_1Q92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_29_1Q92e( true) ;
      }
      else
      {
         wb_table1_29_1Q92e( false) ;
      }
   }

   public void wb_table2_34_1Q92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_47_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV17FilterFullText, GXutil.rtrim( localUtil.format( AV17FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_PedidosClienteSinDetalle\\ConsultaAlmacenTejidoencrudoProduccion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_34_1Q92e( true) ;
      }
      else
      {
         wb_table2_34_1Q92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6ALbrecCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbrecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ALbrecCod), 8, 0));
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
      pa1Q92( ) ;
      ws1Q92( ) ;
      we1Q92( ) ;
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
      sCtrlAV6ALbrecCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1Q92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidosclientesindetalle\\consultaalmacentejidoencrudoproduccion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1Q92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6ALbrecCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbrecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ALbrecCod), 8, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6ALbrecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6ALbrecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6ALbrecCod != wcpOAV6ALbrecCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6ALbrecCod = AV6ALbrecCod ;
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
      sCtrlAV6ALbrecCod = httpContext.cgiGet( sPrefix+"AV6ALbrecCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6ALbrecCod) > 0 )
      {
         AV6ALbrecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6ALbrecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbrecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ALbrecCod), 8, 0));
      }
      else
      {
         AV6ALbrecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6ALbrecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1Q92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1Q92( ) ;
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
      ws1Q92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ALbrecCod_PARM", GXutil.ltrim( localUtil.ntoc( AV6ALbrecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ALbrecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ALbrecCod_CTRL", GXutil.rtrim( sCtrlAV6ALbrecCod));
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
      we1Q92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556189", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/consultaalmacentejidoencrudoproduccion_wc.js", "?202682115561810", false, true);
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

   public void subsflControlProps_472( )
   {
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_47_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_47_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_47_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_47_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_47_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_47_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_47_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_47_idx ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL_"+sGXsfl_47_idx ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET_"+sGXsfl_47_idx ;
      edtBarPiePie_Internalname = sPrefix+"BARPIEPIE_"+sGXsfl_47_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_47_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_47_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_47_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_47_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_47_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_47_idx ;
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD_"+sGXsfl_47_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_472( )
   {
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_47_fel_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_47_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_47_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_47_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_47_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_47_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_47_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_47_fel_idx ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL_"+sGXsfl_47_fel_idx ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET_"+sGXsfl_47_fel_idx ;
      edtBarPiePie_Internalname = sPrefix+"BARPIEPIE_"+sGXsfl_47_fel_idx ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST_"+sGXsfl_47_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_47_fel_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_47_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_47_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_47_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_47_fel_idx ;
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD_"+sGXsfl_47_fel_idx ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_47_fel_idx ;
   }

   public void sendrow_472( )
   {
      subsflControlProps_472( ) ;
      wb1Q90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_47_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_47_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV18CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV19BarEncCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPieKil_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPieMet_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPiePie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarPiePie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAgrEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCum_Internalname,localUtil.format(A156BarFecCum, "99/99/99"),localUtil.format( A156BarFecCum, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecCum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1Q92( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      /* End function sendrow_472 */
   }

   public void startgridcontrol47( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"47\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPiePie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ag?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fech Ult", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A156BarFecCum, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCum_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
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
      lblText1_Internalname = sPrefix+"TEXT1" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
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
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarPieKil_Internalname = sPrefix+"BARPIEKIL" ;
      edtBarPieMet_Internalname = sPrefix+"BARPIEMET" ;
      edtBarPiePie_Internalname = sPrefix+"BARPIEPIE" ;
      edtBarAgrEst_Internalname = sPrefix+"BARAGREST" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarPieCod_Internalname = sPrefix+"BARPIECOD" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfeccumauxdate_Internalname = sPrefix+"vDDO_BARFECCUMAUXDATE" ;
      divDdo_barfeccumauxdates_Internalname = sPrefix+"DDO_BARFECCUMAUXDATES" ;
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
      edtAlbRecCod_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarFecCum_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarFecCum_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarAgrEst_Visible = -1 ;
      edtBarPiePie_Visible = -1 ;
      edtBarPieMet_Visible = -1 ;
      edtBarPieKil_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtavClinom_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccumauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable1_Height = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;Fase;Fase;;;;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic||Dynamic||||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|||T|T|T||T||||T|T|" ;
      Ddo_grid_Filterisrange = "||||||T||T|T|T|||" ;
      Ddo_grid_Filtertype = "Character|||Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Character|Character|Date" ;
      Ddo_grid_Includefilter = "T|||T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|||T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "|||2|3|4|5|6|7|8|9|10||" ;
      Ddo_grid_Columnids = "0:BarNHdr|1:CliNom|2:BarEncCli|3:BarSer|4:BarSerDsc|5:BarColNom|6:BarColNum|7:BarNomCli|8:BarPieKil|9:BarPieMet|10:BarPiePie|11:BarAgrEst|12:BarFasCod|13:BarFecCum" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPiePie_Visible',ctrl:'BARPIEPIE',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121Q92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131Q92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141Q92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201Q92',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV18CliNom',fld:'vCLINOM',pic:''},{av:'AV19BarEncCli',fld:'vBARENCCLI',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151Q92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPiePie_Visible',ctrl:'BARPIEPIE',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111Q92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPiePie_Visible',ctrl:'BARPIEPIE',prop:'Visible'},{av:'edtBarAgrEst_Visible',ctrl:'BARAGREST',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'AV58GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV59GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161Q92',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171Q92',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ALbrecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV31TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV43TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV44TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV45TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV46TFBarPiePie',fld:'vTFBARPIEPIE',pic:'ZZZZZ9'},{av:'AV47TFBarPiePie_To',fld:'vTFBARPIEPIE_TO',pic:'ZZZZZ9'},{av:'AV48TFBarAgrEst',fld:'vTFBARAGREST',pic:'@!'},{av:'AV49TFBarAgrEst_Sel',fld:'vTFBARAGREST_SEL',pic:'@!'},{av:'AV50TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV51TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV52TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV64Pgmname',fld:'vPGMNAME',pic:''},{av:'AV61Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albreccod',iparms:[]");
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
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV17FilterFullText = "" ;
      AV30TFBarNHdr = "" ;
      AV31TFBarNHdr_Sel = "" ;
      AV32TFBarSer = "" ;
      AV33TFBarSer_Sel = "" ;
      AV34TFBarSerDsc = "" ;
      AV35TFBarSerDsc_Sel = "" ;
      AV36TFBarColNom = "" ;
      AV37TFBarColNom_Sel = "" ;
      AV40TFBarNomCli = "" ;
      AV41TFBarNomCli_Sel = "" ;
      AV42TFBarPieKil = DecimalUtil.ZERO ;
      AV43TFBarPieKil_To = DecimalUtil.ZERO ;
      AV44TFBarPieMet = DecimalUtil.ZERO ;
      AV45TFBarPieMet_To = DecimalUtil.ZERO ;
      AV48TFBarAgrEst = "" ;
      AV49TFBarAgrEst_Sel = "" ;
      AV50TFBarFasCod = "" ;
      AV51TFBarFasCod_Sel = "" ;
      AV52TFBarFecCum = GXutil.nullDate() ;
      AV64Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV56DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      lblText1_Jsonclick = "" ;
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
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_BarFecCumAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13696BarNHdr = "" ;
      AV18CliNom = "" ;
      AV19BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      scmdbuf = "" ;
      lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = "" ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = "" ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = "" ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = "" ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = "" ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = DecimalUtil.ZERO ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = DecimalUtil.ZERO ;
      AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = "" ;
      AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = "" ;
      AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = GXutil.nullDate() ;
      H01Q98_A396EmprCod = new String[] {""} ;
      H01Q98_A143BarDisNum = new String[] {""} ;
      H01Q98_A4812BarEncCli = new String[] {""} ;
      H01Q98_A44AlbRecCod = new int[1] ;
      H01Q98_A200BarPieCod = new String[] {""} ;
      H01Q98_A120BarAgrEst = new String[] {""} ;
      H01Q98_A1501BarPiePie = new int[1] ;
      H01Q98_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Q98_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01Q98_A1234BarNomCli = new String[] {""} ;
      H01Q98_A136BarColNum = new int[1] ;
      H01Q98_A135BarColNom = new String[] {""} ;
      H01Q98_A1652BarSerDsc = new String[] {""} ;
      H01Q98_A212BarSer = new String[] {""} ;
      H01Q98_A13696BarNHdr = new String[] {""} ;
      H01Q98_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      H01Q98_n156BarFecCum = new boolean[] {false} ;
      H01Q98_A151BarFasCod = new String[] {""} ;
      H01Q98_n151BarFasCod = new boolean[] {false} ;
      H01Q98_A129BarCod = new int[1] ;
      H01Q98_A132BarCodReo = new byte[1] ;
      H01Q98_A130BarCodPar = new String[] {""} ;
      H01Q915_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV65Station = "" ;
      AV66Emprnom = "" ;
      AV67Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GXv_int8 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV60WebSession = httpContext.getWebSession();
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState23 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6ALbrecCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wc__default(),
         new Object[] {
             new Object[] {
            H01Q98_A396EmprCod, H01Q98_A143BarDisNum, H01Q98_A4812BarEncCli, H01Q98_A44AlbRecCod, H01Q98_A200BarPieCod, H01Q98_A120BarAgrEst, H01Q98_A1501BarPiePie, H01Q98_A205BarPieMet, H01Q98_A203BarPieKil, H01Q98_A1234BarNomCli,
            H01Q98_A136BarColNum, H01Q98_A135BarColNom, H01Q98_A1652BarSerDsc, H01Q98_A212BarSer, H01Q98_A13696BarNHdr, H01Q98_A156BarFecCum, H01Q98_n156BarFecCum, H01Q98_A151BarFasCod, H01Q98_n151BarFasCod, H01Q98_A129BarCod,
            H01Q98_A132BarCodReo, H01Q98_A130BarCodPar
            }
            , new Object[] {
            H01Q915_AGRID_nRecordCount
            }
         }
      );
      AV64Pgmname = "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WC" ;
      /* GeneXus formulas. */
      AV64Pgmname = "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WC" ;
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29ManageFiltersExecutionStep ;
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
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6ALbrecCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_47 ;
   private int AV6ALbrecCod ;
   private int nGXsfl_47_idx=1 ;
   private int AV38TFBarColNum ;
   private int AV39TFBarColNum_To ;
   private int AV46TFBarPiePie ;
   private int AV47TFBarPiePie_To ;
   private int AV61Clicod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable1_Height ;
   private int edtavPgmname_Enabled ;
   private int A136BarColNum ;
   private int A1501BarPiePie ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int subGrid_Islastpage ;
   private int edtavClinom_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ;
   private int AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ;
   private int AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ;
   private int AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ;
   private int edtBarNHdr_Visible ;
   private int edtavClinom_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarPieKil_Visible ;
   private int edtBarPieMet_Visible ;
   private int edtBarPiePie_Visible ;
   private int edtBarAgrEst_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtBarFecCum_Visible ;
   private int AV57PageToGo ;
   private int GXv_int8[] ;
   private int AV92GXV1 ;
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
   private java.math.BigDecimal AV42TFBarPieKil ;
   private java.math.BigDecimal AV43TFBarPieKil_To ;
   private java.math.BigDecimal AV44TFBarPieMet ;
   private java.math.BigDecimal AV45TFBarPieMet_To ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ;
   private java.math.BigDecimal AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ;
   private java.math.BigDecimal AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ;
   private java.math.BigDecimal AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ;
   private String wcpOAV5Emprcod ;
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
   private String AV5Emprcod ;
   private String sGXsfl_47_idx="0001" ;
   private String AV30TFBarNHdr ;
   private String AV31TFBarNHdr_Sel ;
   private String AV32TFBarSer ;
   private String AV33TFBarSer_Sel ;
   private String AV34TFBarSerDsc ;
   private String AV35TFBarSerDsc_Sel ;
   private String AV36TFBarColNom ;
   private String AV37TFBarColNom_Sel ;
   private String AV40TFBarNomCli ;
   private String AV41TFBarNomCli_Sel ;
   private String AV48TFBarAgrEst ;
   private String AV49TFBarAgrEst_Sel ;
   private String AV50TFBarFasCod ;
   private String AV51TFBarFasCod_Sel ;
   private String AV64Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
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
   private String lblText1_Internalname ;
   private String lblText1_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
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
   private String divDdo_barfeccumauxdates_Internalname ;
   private String edtavDdo_barfeccumauxdate_Internalname ;
   private String edtavDdo_barfeccumauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String AV18CliNom ;
   private String edtavClinom_Internalname ;
   private String AV19BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPiePie_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String edtBarFecCum_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String scmdbuf ;
   private String lV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String lV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String lV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String lV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String lV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String lV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String lV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ;
   private String AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ;
   private String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ;
   private String AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ;
   private String AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ;
   private String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ;
   private String AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ;
   private String AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String hsh ;
   private String AV65Station ;
   private String AV66Emprnom ;
   private String AV67Usurcod ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6ALbrecCod ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPiePie_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFecCum_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFBarFecCum ;
   private java.util.Date AV54DDO_BarFecCumAuxDate ;
   private java.util.Date A156BarFecCum ;
   private java.util.Date AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
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
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV17FilterFullText ;
   private String lV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private String AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01Q98_A396EmprCod ;
   private String[] H01Q98_A143BarDisNum ;
   private String[] H01Q98_A4812BarEncCli ;
   private int[] H01Q98_A44AlbRecCod ;
   private String[] H01Q98_A200BarPieCod ;
   private String[] H01Q98_A120BarAgrEst ;
   private int[] H01Q98_A1501BarPiePie ;
   private java.math.BigDecimal[] H01Q98_A205BarPieMet ;
   private java.math.BigDecimal[] H01Q98_A203BarPieKil ;
   private String[] H01Q98_A1234BarNomCli ;
   private int[] H01Q98_A136BarColNum ;
   private String[] H01Q98_A135BarColNom ;
   private String[] H01Q98_A1652BarSerDsc ;
   private String[] H01Q98_A212BarSer ;
   private String[] H01Q98_A13696BarNHdr ;
   private java.util.Date[] H01Q98_A156BarFecCum ;
   private boolean[] H01Q98_n156BarFecCum ;
   private String[] H01Q98_A151BarFasCod ;
   private boolean[] H01Q98_n151BarFasCod ;
   private int[] H01Q98_A129BarCod ;
   private byte[] H01Q98_A132BarCodReo ;
   private String[] H01Q98_A130BarCodPar ;
   private long[] H01Q915_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV60WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState23[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV56DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultaalmacentejidoencrudoproduccion_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01Q98( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                          String AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                          String AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                          String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                          String AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                          String AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                          String AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                          String AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                          int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                          int AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                          String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                          String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                          java.math.BigDecimal AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                          java.math.BigDecimal AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                          int AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                          int AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                          String AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                          String AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          String A120BarAgrEst ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A151BarFasCod ,
                                          String AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                          String AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                          java.util.Date AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          String AV5Emprcod ,
                                          int AV6ALbrecCod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[46];
      Object[] GXv_Object25 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T2.BarDisNum, T2.BarEncCli, T1.AlbRecCod, T1.BarPieCod, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom," ;
      sSelectString += " T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS" ;
      sSelectString += " BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      sFromString = " FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod, '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo," ;
      sFromString += " T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod) AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      sFromString += " FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      sFromString += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin" ;
      sFromString += " = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod" ;
      sFromString += " AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS" ;
      sFromString += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND" ;
      sFromString += " T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod, '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod," ;
      sFromString += " T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod," ;
      sFromString += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod =" ;
      sFromString += " T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod," ;
      sFromString += " T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( AV14OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarPiePie" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarPiePie DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarAgrEst" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarAgrEst DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H01Q915( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           short AV14OrderedBy ,
                                           boolean AV15OrderedDsc ,
                                           String AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV90Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV89Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV91Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV5Emprcod ,
                                           int AV6ALbrecCod ,
                                           String A396EmprCod ,
                                           int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[41];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod, '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod," ;
      scmdbuf += " T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod) AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod" ;
      scmdbuf += " AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo" ;
      scmdbuf += " = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod, '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod," ;
      scmdbuf += " T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod" ;
      scmdbuf += " AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod," ;
      scmdbuf += " T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV14OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H01Q98(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
            case 1 :
                  return conditional_H01Q915(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01Q98", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01Q915", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 11);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
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
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
      }
   }

}

