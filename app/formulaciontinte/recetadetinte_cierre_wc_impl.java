package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre_wc_impl extends GXWebComponent
{
   public recetadetinte_cierre_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte_cierre_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre_wc_impl.class ));
   }

   public recetadetinte_cierre_wc_impl( int remoteHandle ,
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
      chkavPesado = UIFactory.getCheckbox(this);
      chkavAdicion = UIFactory.getCheckbox(this);
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
               AV59Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
               AV60Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Barcod), 8, 0));
               AV61Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barcodreo", GXutil.str( AV61Barcodreo, 1, 0));
               AV62Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcodpar", AV62Barcodpar);
               AV63FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FechaCierre", localUtil.format(AV63FechaCierre, "99/99/99"));
               AV64RecAcab = httpContext.GetPar( "RecAcab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64RecAcab", AV64RecAcab);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV59Emprcod,Integer.valueOf(AV60Barcod),Byte.valueOf(AV61Barcodreo),AV62Barcodpar,AV63FechaCierre,AV64RecAcab});
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
      AV59Emprcod = httpContext.GetPar( "Emprcod") ;
      AV60Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV61Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV62Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV64RecAcab = httpContext.GetPar( "RecAcab") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV27TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV28TFRecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq"))) ;
      AV29TFRecLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMaq_To"))) ;
      AV30TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV31TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV32TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV33TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV34TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV35TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV36TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV37TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV38TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV39TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV40TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV41TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV42TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV43TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV44TFBarNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli"))) ;
      AV45TFBarNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumCli_To"))) ;
      AV46TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV47TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV48TFRecVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd"))) ;
      AV49TFRecVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFRecVolPrd_To"))) ;
      AV50TFRecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgm"), ".") ;
      AV51TFRecTotKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecTotKgm_To"), ".") ;
      AV52TFRecFecAlt = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecFecAlt")) ;
      AV56TFBarNumAny = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAny"))) ;
      AV57TFBarNumAny_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAny_To"))) ;
      AV136Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV63FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
      A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
      A811RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
      A4576RecLinUsr = httpContext.GetPar( "RecLinUsr") ;
      A2808RecLinMAL = (short)(GXutil.lval( httpContext.GetPar( "RecLinMAL"))) ;
      A1377RecNumAny = (byte)(GXutil.lval( httpContext.GetPar( "RecNumAny"))) ;
      A13948WP_ID = GXutil.lval( httpContext.GetPar( "WP_ID")) ;
      A13951WP_BatchCo = httpContext.GetPar( "WP_BatchCo") ;
      AV76colorserviceID = GXutil.lval( httpContext.GetPar( "colorserviceID")) ;
      AV83BatchCode = httpContext.GetPar( "BatchCode") ;
      AV78colorservicecontador = (short)(GXutil.lval( httpContext.GetPar( "colorservicecontador"))) ;
      AV77clienteModa21 = (short)(GXutil.lval( httpContext.GetPar( "clienteModa21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1O52( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Detalle de Recetas de Tinte Pendientes de Cerrar", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.recetadetinte_cierre_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV60Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62Barcodpar)),GXutil.URLEncode(GXutil.formatDateParm(AV63FechaCierre)),GXutil.URLEncode(GXutil.rtrim(AV64RecAcab))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","FechaCierre","RecAcab"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICEID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76colorserviceID), "ZZZZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77clienteModa21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Emprcod", GXutil.rtrim( wcpOAV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV60Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV61Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Barcodpar", GXutil.rtrim( wcpOAV62Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63FechaCierre", localUtil.dtoc( wcpOAV63FechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64RecAcab", GXutil.rtrim( wcpOAV64RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV26TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV27TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV28TFRecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV29TFRecLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV30TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV31TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV32TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV33TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV34TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV35TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV36TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV37TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV38TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV39TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV40TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV41TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV42TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV43TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV44TFBarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV45TFBarNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV46TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV47TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV48TFRecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFRecVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV50TFRecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECTOTKGM_TO", GXutil.ltrim( localUtil.ntoc( AV51TFRecTotKgm_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFECALT", localUtil.ttoc( AV52TFRecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANY", GXutil.ltrim( localUtil.ntoc( AV56TFBarNumAny, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANY_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarNumAny_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV136Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV60Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV61Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV62Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHACIERRE", localUtil.dtoc( AV63FechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECACAB", GXutil.rtrim( AV64RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINUSR", GXutil.rtrim( A4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINMAL", GXutil.ltrim( localUtil.ntoc( A2808RecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECNUMANY", GXutil.ltrim( localUtil.ntoc( A1377RecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"WP_ID", GXutil.ltrim( localUtil.ntoc( A13948WP_ID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"WP_BATCHCO", A13951WP_BatchCo);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICEID", GXutil.ltrim( localUtil.ntoc( AV76colorserviceID, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICEID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76colorserviceID), "ZZZZZZZZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV78colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV77clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECCIETIN", localUtil.dtoc( AV70FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV75Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV67Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGM", GXutil.ltrim( localUtil.ntoc( AV80FlagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV68Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHAYANYADIDAS", GXutil.rtrim( AV99HayAnyadidas));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV73UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCTOSCONSUMOS", AV95productosconsumos);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vJ", GXutil.ltrim( localUtil.ntoc( AV97j, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
   }

   public void renderHtmlCloseForm1O52( )
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
      return "FormulacionTinte.RecetadeTinte_Cierre_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Recetas de Tinte Pendientes de Cerrar", "") ;
   }

   public void wb1O50( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.recetadetinte_cierre_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111o51_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1O52( true) ;
      }
      else
      {
         wb_table1_25_1O52( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1O52e( boolean wbgen )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0074"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0074"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0074"+"");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_80_1O52( true) ;
      }
      else
      {
         wb_table2_80_1O52( false) ;
      }
      return  ;
   }

   public void wb_table2_80_1O52e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_85_1O52( true) ;
      }
      else
      {
         wb_table3_85_1O52( false) ;
      }
      return  ;
   }

   public void wb_table3_85_1O52e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecaltauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecaltauxdate_Internalname, localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"), localUtil.format( AV54DDO_RecFecAltAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecaltauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecaltauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1O52( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Recetas de Tinte Pendientes de Cerrar", ""), (short)(0)) ;
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
            strup1O50( ) ;
         }
      }
   }

   public void ws1O52( )
   {
      start1O52( ) ;
      evt1O52( ) ;
   }

   public void evt1O52( )
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
                              strup1O50( ) ;
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
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181O52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1O50( ) ;
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
                              strup1O50( ) ;
                           }
                           AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
                           AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
                           AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
                           AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
                           AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
                           AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
                           AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
                           AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
                           AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
                           AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
                           AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
                           AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
                           AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
                           AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
                           AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
                           AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
                           AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
                           AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
                           AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
                           AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
                           AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
                           AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
                           AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
                           AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
                           AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
                           AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
                           AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
                           AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
                           AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
                           AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
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
                              strup1O50( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV65grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65grupodeacciones), 4, 0));
                           AV69Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV69Seleccionar);
                           AV82Pesado = ((GXutil.strcmp(httpContext.cgiGet( chkavPesado.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavPesado.getInternalname(), AV82Pesado);
                           AV81Adicion = ((GXutil.strcmp(httpContext.cgiGet( chkavAdicion.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavAdicion.getInternalname(), AV81Adicion);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCIDENCIAS");
                              GX_FocusControl = edtavIncidencias_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85incidencias = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85incidencias), 4, 0));
                           }
                           else
                           {
                              AV85incidencias = (short)(localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85incidencias), 4, 0));
                           }
                           AV83BatchCode = httpContext.cgiGet( edtavBatchcode_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBatchcode_Internalname, AV83BatchCode);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
                           AV88DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV88DetailWebComponent);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV89BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV89BarAgrEst);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!"))));
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
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLORSERVICE");
                              GX_FocusControl = edtavColorservice_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV84Colorservice = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
                           }
                           else
                           {
                              AV84Colorservice = (short)(localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
                           }
                           A4654RecNroPar = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4654RecNroPar = false ;
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
                                       e191O52 ();
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
                                       e201O52 ();
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
                                       e211O52 ();
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
                                       e221O52 ();
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
                                    strup1O50( ) ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 74 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0074") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0074", "", sEvt);
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

   public void we1O52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1O52( ) ;
         }
      }
   }

   public void pa1O52( )
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
                                 String AV59Emprcod ,
                                 int AV60Barcod ,
                                 byte AV61Barcodreo ,
                                 String AV62Barcodpar ,
                                 String AV64RecAcab ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFBarNHdr ,
                                 String AV27TFBarNHdr_Sel ,
                                 short AV28TFRecLinMaq ,
                                 short AV29TFRecLinMaq_To ,
                                 byte AV30TFBarSit ,
                                 byte AV31TFBarSit_To ,
                                 String AV32TFBarSer ,
                                 String AV33TFBarSer_Sel ,
                                 String AV34TFBarSerDsc ,
                                 String AV35TFBarSerDsc_Sel ,
                                 String AV36TFBarColNom ,
                                 String AV37TFBarColNom_Sel ,
                                 int AV38TFBarColNum ,
                                 int AV39TFBarColNum_To ,
                                 byte AV40TFBarTipCol ,
                                 byte AV41TFBarTipCol_To ,
                                 String AV42TFBarNomCli ,
                                 String AV43TFBarNomCli_Sel ,
                                 int AV44TFBarNumCli ,
                                 int AV45TFBarNumCli_To ,
                                 String AV46TFMaqCod ,
                                 String AV47TFMaqCod_Sel ,
                                 int AV48TFRecVolPrd ,
                                 int AV49TFRecVolPrd_To ,
                                 java.math.BigDecimal AV50TFRecTotKgm ,
                                 java.math.BigDecimal AV51TFRecTotKgm_To ,
                                 java.util.Date AV52TFRecFecAlt ,
                                 short AV56TFBarNumAny ,
                                 short AV57TFBarNumAny_To ,
                                 String AV136Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date AV63FechaCierre ,
                                 byte A1273RecLinPro ,
                                 short A811RecLin ,
                                 String A4576RecLinUsr ,
                                 short A2808RecLinMAL ,
                                 byte A1377RecNumAny ,
                                 long A13948WP_ID ,
                                 String A13951WP_BatchCo ,
                                 long AV76colorserviceID ,
                                 String AV83BatchCode ,
                                 short AV78colorservicecontador ,
                                 short AV77clienteModa21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201O52 ();
      GRID_nCurrentRecord = 0 ;
      rf1O52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBATCHCODE", GXutil.rtrim( AV83BatchCode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICE", GXutil.ltrim( localUtil.ntoc( AV84Colorservice, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECNROPAR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECNROPAR", GXutil.ltrim( localUtil.ntoc( A4654RecNroPar, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGREST", GXutil.rtrim( AV89BarAgrEst));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1O52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV136Pgmname = "FormulacionTinte.RecetadeTinte_Cierre_WC" ;
      Gx_err = (short)(0) ;
      chkavPesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPesado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPesado.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      chkavAdicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAdicion.getInternalname(), "Enabled", GXutil.ltrimstr( chkavAdicion.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavIncidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBatchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBatchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBatchcode_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavColorservice_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavColorservice_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColorservice_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void rf1O52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201O52 ();
      nGXsfl_43_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                              AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                              Short.valueOf(AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                              Short.valueOf(AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                              Byte.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                              Byte.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                              AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                              AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                              AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                              AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                              AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                              AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                              Integer.valueOf(AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                              Integer.valueOf(AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                              Byte.valueOf(AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                              Byte.valueOf(AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                              AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                              AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                              Integer.valueOf(AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                              Integer.valueOf(AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                              AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                              AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                              Integer.valueOf(AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                              Integer.valueOf(AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                              AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                              Short.valueOf(AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                              Short.valueOf(AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                              AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              A812RecTotKgm ,
                                              AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                              AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                              Integer.valueOf(AV60Barcod) ,
                                              Byte.valueOf(AV61Barcodreo) ,
                                              AV62Barcodpar ,
                                              A6039RecAcab ,
                                              AV64RecAcab ,
                                              AV59Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
         lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
         lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
         lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
         lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
         lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
         lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
         /* Using cursor H01O55 */
         pr_default.execute(0, new Object[] {AV59Emprcod, AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV64RecAcab, lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A2804RecLinMaq = H01O55_A2804RecLinMaq[0] ;
            A396EmprCod = H01O55_A396EmprCod[0] ;
            A6039RecAcab = H01O55_A6039RecAcab[0] ;
            n6039RecAcab = H01O55_n6039RecAcab[0] ;
            A120BarAgrEst = H01O55_A120BarAgrEst[0] ;
            A4654RecNroPar = H01O55_A4654RecNroPar[0] ;
            n4654RecNroPar = H01O55_n4654RecNroPar[0] ;
            A189BarNumAny = H01O55_A189BarNumAny[0] ;
            A4866RecFecAlt = H01O55_A4866RecFecAlt[0] ;
            n4866RecFecAlt = H01O55_n4866RecFecAlt[0] ;
            A2805RecVolPrd = H01O55_A2805RecVolPrd[0] ;
            A602MaqCod = H01O55_A602MaqCod[0] ;
            A1235BarNumCli = H01O55_A1235BarNumCli[0] ;
            A1234BarNomCli = H01O55_A1234BarNomCli[0] ;
            A218BarTipCol = H01O55_A218BarTipCol[0] ;
            A136BarColNum = H01O55_A136BarColNum[0] ;
            A135BarColNom = H01O55_A135BarColNom[0] ;
            A1652BarSerDsc = H01O55_A1652BarSerDsc[0] ;
            A212BarSer = H01O55_A212BarSer[0] ;
            A213BarSit = H01O55_A213BarSit[0] ;
            A13696BarNHdr = H01O55_A13696BarNHdr[0] ;
            A812RecTotKgm = H01O55_A812RecTotKgm[0] ;
            n812RecTotKgm = H01O55_n812RecTotKgm[0] ;
            A129BarCod = H01O55_A129BarCod[0] ;
            A132BarCodReo = H01O55_A132BarCodReo[0] ;
            A130BarCodPar = H01O55_A130BarCodPar[0] ;
            A120BarAgrEst = H01O55_A120BarAgrEst[0] ;
            A189BarNumAny = H01O55_A189BarNumAny[0] ;
            A1235BarNumCli = H01O55_A1235BarNumCli[0] ;
            A1234BarNomCli = H01O55_A1234BarNomCli[0] ;
            A218BarTipCol = H01O55_A218BarTipCol[0] ;
            A136BarColNum = H01O55_A136BarColNum[0] ;
            A135BarColNom = H01O55_A135BarColNom[0] ;
            A1652BarSerDsc = H01O55_A1652BarSerDsc[0] ;
            A212BarSer = H01O55_A212BarSer[0] ;
            A213BarSit = H01O55_A213BarSit[0] ;
            A13696BarNHdr = H01O55_A13696BarNHdr[0] ;
            A812RecTotKgm = H01O55_A812RecTotKgm[0] ;
            n812RecTotKgm = H01O55_n812RecTotKgm[0] ;
            e211O52 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb1O50( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1O52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV136Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV136Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICEID", GXutil.ltrim( localUtil.ntoc( AV76colorserviceID, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICEID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76colorserviceID), "ZZZZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV78colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECNROPAR"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV77clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!"))));
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
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A6039RecAcab ,
                                           AV64RecAcab ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor H01O59 */
      pr_default.execute(1, new Object[] {AV59Emprcod, AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV64RecAcab, lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      GRID_nRecordCount = H01O59_AGRID_nRecordCount[0] ;
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
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59Emprcod, AV60Barcod, AV61Barcodreo, AV62Barcodpar, AV64RecAcab, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFBarNHdr, AV27TFBarNHdr_Sel, AV28TFRecLinMaq, AV29TFRecLinMaq_To, AV30TFBarSit, AV31TFBarSit_To, AV32TFBarSer, AV33TFBarSer_Sel, AV34TFBarSerDsc, AV35TFBarSerDsc_Sel, AV36TFBarColNom, AV37TFBarColNom_Sel, AV38TFBarColNum, AV39TFBarColNum_To, AV40TFBarTipCol, AV41TFBarTipCol_To, AV42TFBarNomCli, AV43TFBarNomCli_Sel, AV44TFBarNumCli, AV45TFBarNumCli_To, AV46TFMaqCod, AV47TFMaqCod_Sel, AV48TFRecVolPrd, AV49TFRecVolPrd_To, AV50TFRecTotKgm, AV51TFRecTotKgm_To, AV52TFRecFecAlt, AV56TFBarNumAny, AV57TFBarNumAny_To, AV136Pgmname, AV12OrderedBy, AV13OrderedDsc, AV63FechaCierre, A1273RecLinPro, A811RecLin, A4576RecLinUsr, A2808RecLinMAL, A1377RecNumAny, A13948WP_ID, A13951WP_BatchCo, AV76colorserviceID, AV83BatchCode, AV78colorservicecontador, AV77clienteModa21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV136Pgmname = "FormulacionTinte.RecetadeTinte_Cierre_WC" ;
      Gx_err = (short)(0) ;
      chkavPesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPesado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPesado.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      chkavAdicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAdicion.getInternalname(), "Enabled", GXutil.ltrimstr( chkavAdicion.getEnabled(), 5, 0), !bGXsfl_43_Refreshing);
      edtavIncidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBatchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBatchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBatchcode_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavColorservice_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavColorservice_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColorservice_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1O50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191O52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV59Emprcod") ;
         wcpOAV60Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV62Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV62Barcodpar") ;
         wcpOAV63FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV63FechaCierre"), 0) ;
         wcpOAV64RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV64RecAcab") ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         AV59Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
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
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         Dvelop_confirmpanel_anyadirproductos_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECALTAUXDATE");
            GX_FocusControl = edtavDdo_recfecaltauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_RecFecAltAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_RecFecAltAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_43_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         if ( nGXsfl_43_idx > 0 )
         {
            cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
            cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
            AV65grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65grupodeacciones), 4, 0));
            AV69Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV69Seleccionar);
            AV82Pesado = ((GXutil.strcmp(httpContext.cgiGet( chkavPesado.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavPesado.getInternalname(), AV82Pesado);
            AV81Adicion = ((GXutil.strcmp(httpContext.cgiGet( chkavAdicion.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavAdicion.getInternalname(), AV81Adicion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCIDENCIAS");
               GX_FocusControl = edtavIncidencias_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV85incidencias = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85incidencias), 4, 0));
            }
            else
            {
               AV85incidencias = (short)(localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85incidencias), 4, 0));
            }
            AV83BatchCode = httpContext.cgiGet( edtavBatchcode_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBatchcode_Internalname, AV83BatchCode);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
            AV88DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV88DetailWebComponent);
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV89BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV89BarAgrEst);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!"))));
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
            A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname)) ;
            n4866RecFecAlt = false ;
            A189BarNumAny = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLORSERVICE");
               GX_FocusControl = edtavColorservice_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV84Colorservice = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
            }
            else
            {
               AV84Colorservice = (short)(localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
            }
            A4654RecNroPar = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4654RecNroPar = false ;
         }
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
      e191O52 ();
      if (returnInSub) return;
   }

   public void e191O52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Station", AV71Station);
      GXv_char2[0] = AV59Emprcod ;
      GXv_char3[0] = AV72EmprNom ;
      GXv_char4[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte_cierre_wc_impl.this.AV59Emprcod = GXv_char2[0] ;
      recetadetinte_cierre_wc_impl.this.AV72EmprNom = GXv_char3[0] ;
      recetadetinte_cierre_wc_impl.this.AV73UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73UsurCod", AV73UsurCod);
      GXt_int5 = AV74ContVal ;
      GXv_char4[0] = AV59Emprcod ;
      GXv_char3[0] = "011100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      recetadetinte_cierre_wc_impl.this.AV59Emprcod = GXv_char4[0] ;
      recetadetinte_cierre_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      AV74ContVal = GXt_int5 ;
      AV75Consumos = (short)(((AV74ContVal==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75Consumos), 4, 0));
      GXt_int5 = (int)(AV76colorserviceID) ;
      GXv_char4[0] = AV59Emprcod ;
      GXv_char3[0] = httpContext.getMessage( "CSTXP", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      recetadetinte_cierre_wc_impl.this.AV59Emprcod = GXv_char4[0] ;
      recetadetinte_cierre_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      AV76colorserviceID = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76colorserviceID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76colorserviceID), 15, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICEID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV76colorserviceID), "ZZZZZZZZZZZZZZ9")));
      GXt_int7 = (byte)(AV77clienteModa21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      recetadetinte_cierre_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV77clienteModa21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77clienteModa21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77clienteModa21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77clienteModa21), "ZZZ9")));
      GXt_int7 = (byte)(AV78colorservicecontador) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV59Emprcod, httpContext.getMessage( "CSTXP", ""), GXv_int8) ;
      recetadetinte_cierre_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV78colorservicecontador = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78colorservicecontador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78colorservicecontador), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78colorservicecontador), "ZZZ9")));
      AV79t = (short)(0) ;
      GXt_char1 = AV71Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Station", AV71Station);
      GXv_char4[0] = AV59Emprcod ;
      GXv_char3[0] = AV72EmprNom ;
      GXv_char2[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadetinte_cierre_wc_impl.this.AV59Emprcod = GXv_char4[0] ;
      recetadetinte_cierre_wc_impl.this.AV72EmprNom = GXv_char3[0] ;
      recetadetinte_cierre_wc_impl.this.AV73UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73UsurCod", AV73UsurCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 0 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e201O52( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      chkavPesado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPesado.getInternalname(), "Visible", GXutil.ltrimstr( chkavPesado.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      chkavAdicion.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAdicion.getInternalname(), "Visible", GXutil.ltrimstr( chkavAdicion.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtavIncidencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIncidencias_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtRecLinMaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBaragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtRecVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrd_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtRecTotKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecTotKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtRecFecAlt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecFecAlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecAlt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNumAny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAny_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavIncidencias_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavIncidencias_Internalname, "Columnheaderclass", edtavIncidencias_Columnheaderclass, !bGXsfl_43_Refreshing);
      edtBarNHdr_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Columnheaderclass", edtBarNHdr_Columnheaderclass, !bGXsfl_43_Refreshing);
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV15FilterFullText ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV26TFBarNHdr ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV27TFBarNHdr_Sel ;
      AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV28TFRecLinMaq ;
      AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV29TFRecLinMaq_To ;
      AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV30TFBarSit ;
      AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV31TFBarSit_To ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV32TFBarSer ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV33TFBarSer_Sel ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV34TFBarSerDsc ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV35TFBarSerDsc_Sel ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV36TFBarColNom ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV37TFBarColNom_Sel ;
      AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV38TFBarColNum ;
      AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV39TFBarColNum_To ;
      AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV40TFBarTipCol ;
      AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV41TFBarTipCol_To ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV42TFBarNomCli ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV43TFBarNomCli_Sel ;
      AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV44TFBarNumCli ;
      AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV45TFBarNumCli_To ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV46TFMaqCod ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV48TFRecVolPrd ;
      AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV49TFRecVolPrd_To ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV50TFRecTotKgm ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV51TFRecTotKgm_To ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV52TFRecFecAlt ;
      AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV56TFBarNumAny ;
      AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV57TFBarNumAny_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e131O52( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV26TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
            AV27TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinMaq") == 0 )
         {
            AV28TFRecLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFRecLinMaq), 4, 0));
            AV29TFRecLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV30TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFBarSit), 2, 0));
            AV31TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFBarSit_To), 2, 0));
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
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCol") == 0 )
         {
            AV40TFBarTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipCol), 2, 0));
            AV41TFBarTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV42TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarNomCli", AV42TFBarNomCli);
            AV43TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNomCli_Sel", AV43TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumCli") == 0 )
         {
            AV44TFBarNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarNumCli), 6, 0));
            AV45TFBarNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV46TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMaqCod", AV46TFMaqCod);
            AV47TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecVolPrd") == 0 )
         {
            AV48TFRecVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecVolPrd), 5, 0));
            AV49TFRecVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecTotKgm") == 0 )
         {
            AV50TFRecTotKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecTotKgm", GXutil.ltrimstr( AV50TFRecTotKgm, 10, 2));
            AV51TFRecTotKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecTotKgm_To", GXutil.ltrimstr( AV51TFRecTotKgm_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFecAlt") == 0 )
         {
            AV52TFRecFecAlt = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumAny") == 0 )
         {
            AV56TFBarNumAny = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarNumAny), 3, 0));
            AV57TFBarNumAny_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarNumAny_To), 3, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211O52( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Añadir Productos (Formato I)", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Añadir Productos (Formato II)", ""), "fa fa-plus", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeacciones.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Numero de Añadidas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV88DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV88DetailWebComponent);
      AV69Seleccionar = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV69Seleccionar);
      /* Using cursor H01O510 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4576RecLinUsr = H01O510_A4576RecLinUsr[0] ;
         A811RecLin = H01O510_A811RecLin[0] ;
         A1273RecLinPro = H01O510_A1273RecLinPro[0] ;
         AV82Pesado = (!(GXutil.strcmp("", A4576RecLinUsr)==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavPesado.getInternalname(), AV82Pesado);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV81Adicion = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavAdicion.getInternalname(), AV81Adicion);
      /* Using cursor H01O511 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1377RecNumAny = H01O511_A1377RecNumAny[0] ;
         A2808RecLinMAL = H01O511_A2808RecLinMAL[0] ;
         AV81Adicion = "S" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavAdicion.getInternalname(), AV81Adicion);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV81Adicion = ((A189BarNumAny>0) ? "S" : AV81Adicion) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavAdicion.getInternalname(), AV81Adicion);
      GXt_int12 = AV85incidencias ;
      GXv_int13[0] = GXt_int12 ;
      new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int13) ;
      recetadetinte_cierre_wc_impl.this.GXt_int12 = GXv_int13[0] ;
      AV85incidencias = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavIncidencias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85incidencias), 4, 0));
      AV83BatchCode = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBatchcode_Internalname, AV83BatchCode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
      AV83BatchCode = GXutil.trim( AV83BatchCode) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBatchcode_Internalname, AV83BatchCode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBATCHCODE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV83BatchCode, ""))));
      AV89BarAgrEst = A120BarAgrEst ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV89BarAgrEst);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!"))));
      AV84Colorservice = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
      /* Using cursor H01O512 */
      pr_colorservice.execute(0, new Object[] {AV83BatchCode});
      while ( (pr_colorservice.getStatus(0) != 101) )
      {
         A13951WP_BatchCo = H01O512_A13951WP_BatchCo[0] ;
         A13948WP_ID = H01O512_A13948WP_ID[0] ;
         if ( A13948WP_ID > AV76colorserviceID )
         {
            AV84Colorservice = (short)(1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavColorservice_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Colorservice), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICE"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")));
            AV87WeigProdID = A13948WP_ID ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_colorservice.readNext(0);
      }
      pr_colorservice.close(0);
      edtavIncidencias_Columnclass = ((AV85incidencias>0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
      edtBarNHdr_Columnclass = ((AV84Colorservice==1) ? "WWColumn hidden-xs WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn hidden-xs") ;
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
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV65grupodeacciones, 4, 0)) );
   }

   public void e141O52( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121O52( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Cierre_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV136Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Cierre_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV136Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
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
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e221O52( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV65grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO ANYADIRPRODUCTOS' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV65grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO ANYADIRPRODUCTOSMANUAL' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV65grupodeacciones == 3 )
      {
         /* Execute user subroutine: 'DO NUMERODEANYADIDAS' */
         S212 ();
         if (returnInSub) return;
      }
      AV65grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV65grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e151O52( )
   {
      /* Dvelop_confirmpanel_anyadirproductos_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_anyadirproductos_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANYADIRPRODUCTOS' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e161O52( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92ProgressIndicator", AV92ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e171O52( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.recetadetinte_cierre_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetadetinte_cierre_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      recetadetinte_cierre_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e181O52( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.recetadetinte_cierre_wcexportcsv", new String[] {}, new String[] {}) );
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
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Seleccionar", "", "Op", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Pesado", "", "P?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Adicion", "", "Ad?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&incidencias", "", "Err", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecLinMaq", "", "#", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSit", "", "Situacion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&BarAgrEst", "", "A?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipCol", "", "TC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNomCli", "", "Color Cli.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNumCli", "", "Numero ", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "MaqCod", "", "Código Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecVolPrd", "", "Volumen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecTotKgm", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre_WCColumnsSelector", GXv_char4) ;
      recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
      AV27TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
      AV28TFRecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFRecLinMaq), 4, 0));
      AV29TFRecLinMaq_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFRecLinMaq_To), 4, 0));
      AV30TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFBarSit), 2, 0));
      AV31TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFBarSit_To), 2, 0));
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
      AV40TFBarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipCol), 2, 0));
      AV41TFBarTipCol_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipCol_To), 2, 0));
      AV42TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarNomCli", AV42TFBarNomCli);
      AV43TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNomCli_Sel", AV43TFBarNomCli_Sel);
      AV44TFBarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarNumCli), 6, 0));
      AV45TFBarNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarNumCli_To), 6, 0));
      AV46TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMaqCod", AV46TFMaqCod);
      AV47TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
      AV48TFRecVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecVolPrd), 5, 0));
      AV49TFRecVolPrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecVolPrd_To), 5, 0));
      AV50TFRecTotKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecTotKgm", GXutil.ltrimstr( AV50TFRecTotKgm, 10, 2));
      AV51TFRecTotKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecTotKgm_To", GXutil.ltrimstr( AV51TFRecTotKgm_To, 10, 2));
      AV52TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56TFBarNumAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarNumAny), 3, 0));
      AV57TFBarNumAny_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarNumAny_To), 3, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Confirma?", "") ;
      ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      if ( ( AV78colorservicecontador == 1 ) && ( AV84Colorservice == 1 ) && ( A4654RecNroPar == 0 ) && ( AV77clienteModa21 == 1 ) )
      {
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Atenção, este O.S. contém consumos de ColorService. Se continuarmos, o programa atualizará os consumos ColorService no O.S.", "") ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      }
      AV137Emprcod_selected = A396EmprCod ;
      AV138Barcod_selected = A129BarCod ;
      AV139Barcodreo_selected = A132BarCodReo ;
      AV140Barcodpar_selected = A130BarCodPar ;
      AV141Reclinmaq_selected = A2804RecLinMaq ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      if ( ( AV78colorservicecontador == 1 ) && ( AV84Colorservice == 1 ) && ( A4654RecNroPar == 0 ) && ( AV77clienteModa21 == 1 ) )
      {
         GXv_char4[0] = AV93Inc_obs ;
         GXv_int8[0] = AV98RecNumAny ;
         GXv_objcol_SdtMessages_Message18[0] = AV100messages ;
         new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV83BatchCode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, httpContext.getMessage( "N", ""), GXv_char4, GXv_int8, GXv_objcol_SdtMessages_Message18) ;
         recetadetinte_cierre_wc_impl.this.AV93Inc_obs = GXv_char4[0] ;
         recetadetinte_cierre_wc_impl.this.AV98RecNumAny = GXv_int8[0] ;
         AV100messages = GXv_objcol_SdtMessages_Message18[0] ;
         AV99HayAnyadidas = ((AV98RecNumAny>0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99HayAnyadidas", AV99HayAnyadidas);
         new app.pcommit(remoteHandle, context).execute( ) ;
      }
      AV66Window.setAutoresize( 0 );
      AV66Window.setWidth( 1500 );
      AV66Window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV66Window.setUrl( formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV70FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV75Consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV67Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV63FechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV80FlagM,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV68Recfec)),GXutil.URLEncode(DecimalUtil.decToString(A812RecTotKgm)),GXutil.URLEncode(GXutil.ltrimstr(A2805RecVolPrd,5,0)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr)),GXutil.URLEncode(GXutil.rtrim(AV99HayAnyadidas))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"})  );
      AV66Window.setReturnParms(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2804RecLinMaq","AV70FecCieTin","AV75Consumos","A602MaqCod","AV67Cc_almcod","AV63FechaCierre","AV80FlagM","AV68Recfec","A812RecTotKgm","A2805RecVolPrd","A13696BarNHdr","AV99HayAnyadidas",});
      httpContext.newWindow(AV66Window);
   }

   public void S202( )
   {
      /* 'DO ANYADIRPRODUCTOSMANUAL' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.cierrerecetastinte_adicionesmanual", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMAL"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2804RecLinMaq"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO NUMERODEANYADIDAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_numerodeanyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(A189BarNumAny,3,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarNHdr","BarNumAny"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV136Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV136Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV136Pgmname+"GridState"), null, null);
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
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV142GXV1 = 1 ;
      while ( AV142GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV26TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarNHdr", AV26TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV27TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarNHdr_Sel", AV27TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV28TFRecLinMaq = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFRecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFRecLinMaq), 4, 0));
            AV29TFRecLinMaq_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFRecLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFRecLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV30TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFBarSit), 2, 0));
            AV31TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV32TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarSer", AV32TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV33TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarSer_Sel", AV33TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV34TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSerDsc", AV34TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV35TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSerDsc_Sel", AV35TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV36TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarColNom", AV36TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV37TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarColNom_Sel", AV37TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV38TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarColNum), 6, 0));
            AV39TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV40TFBarTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipCol), 2, 0));
            AV41TFBarTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV42TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarNomCli", AV42TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV43TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNomCli_Sel", AV43TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV44TFBarNumCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarNumCli), 6, 0));
            AV45TFBarNumCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV46TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMaqCod", AV46TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV47TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV48TFRecVolPrd = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecVolPrd), 5, 0));
            AV49TFRecVolPrd_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV50TFRecTotKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecTotKgm", GXutil.ltrimstr( AV50TFRecTotKgm, 10, 2));
            AV51TFRecTotKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFRecTotKgm_To", GXutil.ltrimstr( AV51TFRecTotKgm_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV52TFRecFecAlt = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFRecFecAlt", localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV54DDO_RecFecAltAuxDate = GXutil.resetTime(AV52TFRecFecAlt) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_RecFecAltAuxDate", localUtil.format(AV54DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV56TFBarNumAny = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarNumAny), 3, 0));
            AV57TFBarNumAny_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarNumAny_To), 3, 0));
         }
         AV142GXV1 = (int)(AV142GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, GXv_char4) ;
      recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, GXv_char3) ;
      recetadetinte_cierre_wc_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char20 = "" ;
      GXv_char2[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, GXv_char2) ;
      recetadetinte_cierre_wc_impl.this.GXt_char20 = GXv_char2[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarColNom_Sel)==0), AV37TFBarColNom_Sel, GXv_char22) ;
      recetadetinte_cierre_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFBarNomCli_Sel)==0), AV43TFBarNomCli_Sel, GXv_char24) ;
      recetadetinte_cierre_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMaqCod_Sel)==0), AV47TFMaqCod_Sel, GXv_char26) ;
      recetadetinte_cierre_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char19+"|"+GXt_char20+"|"+GXt_char21+"|||"+GXt_char23+"||"+GXt_char25+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarNHdr)==0), AV26TFBarNHdr, GXv_char26) ;
      recetadetinte_cierre_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarSer)==0), AV32TFBarSer, GXv_char24) ;
      recetadetinte_cierre_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSerDsc)==0), AV34TFBarSerDsc, GXv_char22) ;
      recetadetinte_cierre_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarColNom)==0), AV36TFBarColNom, GXv_char4) ;
      recetadetinte_cierre_wc_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFBarNomCli)==0), AV42TFBarNomCli, GXv_char3) ;
      recetadetinte_cierre_wc_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMaqCod)==0), AV46TFMaqCod, GXv_char2) ;
      recetadetinte_cierre_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char25+"|"+((0==AV28TFRecLinMaq) ? "" : GXutil.str( AV28TFRecLinMaq, 4, 0))+"|"+((0==AV30TFBarSit) ? "" : GXutil.str( AV30TFBarSit, 2, 0))+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char20+"|"+((0==AV38TFBarColNum) ? "" : GXutil.str( AV38TFBarColNum, 6, 0))+"|"+((0==AV40TFBarTipCol) ? "" : GXutil.str( AV40TFBarTipCol, 2, 0))+"|"+GXt_char19+"|"+((0==AV44TFBarNumCli) ? "" : GXutil.str( AV44TFBarNumCli, 6, 0))+"|"+GXt_char1+"|"+((0==AV48TFRecVolPrd) ? "" : GXutil.str( AV48TFRecVolPrd, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFRecTotKgm)==0) ? "" : GXutil.str( AV50TFRecTotKgm, 10, 2))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV52TFRecFecAlt) ? "" : localUtil.dtoc( AV54DDO_RecFecAltAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV56TFBarNumAny) ? "" : GXutil.str( AV56TFBarNumAny, 3, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFRecLinMaq_To) ? "" : GXutil.str( AV29TFRecLinMaq_To, 4, 0))+"|"+((0==AV31TFBarSit_To) ? "" : GXutil.str( AV31TFBarSit_To, 2, 0))+"||||"+((0==AV39TFBarColNum_To) ? "" : GXutil.str( AV39TFBarColNum_To, 6, 0))+"|"+((0==AV41TFBarTipCol_To) ? "" : GXutil.str( AV41TFBarTipCol_To, 2, 0))+"||"+((0==AV45TFBarNumCli_To) ? "" : GXutil.str( AV45TFBarNumCli_To, 6, 0))+"||"+((0==AV49TFRecVolPrd_To) ? "" : GXutil.str( AV49TFRecVolPrd_To, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFRecTotKgm_To)==0) ? "" : GXutil.str( AV51TFRecTotKgm_To, 10, 2))+"||"+((0==AV57TFBarNumAny_To) ? "" : GXutil.str( AV57TFBarNumAny_To, 3, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV136Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARNHDR", "", !(GXutil.strcmp("", AV26TFBarNHdr)==0), (short)(0), AV26TFBarNHdr, "", !(GXutil.strcmp("", AV27TFBarNHdr_Sel)==0), AV27TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFRECLINMAQ", "", !((0==AV28TFRecLinMaq)&&(0==AV29TFRecLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFRecLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV29TFRecLinMaq_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSIT", "", !((0==AV30TFBarSit)&&(0==AV31TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV31TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSER", "", !(GXutil.strcmp("", AV32TFBarSer)==0), (short)(0), AV32TFBarSer, "", !(GXutil.strcmp("", AV33TFBarSer_Sel)==0), AV33TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARSERDSC", "", !(GXutil.strcmp("", AV34TFBarSerDsc)==0), (short)(0), AV34TFBarSerDsc, "", !(GXutil.strcmp("", AV35TFBarSerDsc_Sel)==0), AV35TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV36TFBarColNom)==0), (short)(0), AV36TFBarColNom, "", !(GXutil.strcmp("", AV37TFBarColNom_Sel)==0), AV37TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARCOLNUM", "", !((0==AV38TFBarColNum)&&(0==AV39TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV39TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARTIPCOL", "", !((0==AV40TFBarTipCol)&&(0==AV41TFBarTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFBarTipCol, 2, 0)), GXutil.trim( GXutil.str( AV41TFBarTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV42TFBarNomCli)==0), (short)(0), AV42TFBarNomCli, "", !(GXutil.strcmp("", AV43TFBarNomCli_Sel)==0), AV43TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARNUMCLI", "", !((0==AV44TFBarNumCli)&&(0==AV45TFBarNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFBarNumCli, 6, 0)), GXutil.trim( GXutil.str( AV45TFBarNumCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFMAQCOD", "", !(GXutil.strcmp("", AV46TFMaqCod)==0), (short)(0), AV46TFMaqCod, "", !(GXutil.strcmp("", AV47TFMaqCod_Sel)==0), AV47TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFRECVOLPRD", "", !((0==AV48TFRecVolPrd)&&(0==AV49TFRecVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFRecVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV49TFRecVolPrd_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFRECTOTKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFRecTotKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFRecTotKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFRecTotKgm, 10, 2)), GXutil.trim( GXutil.str( AV51TFRecTotKgm_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFRECFECALT", "", !GXutil.dateCompare(GXutil.nullDate(), AV52TFRecFecAlt), (short)(0), GXutil.trim( localUtil.ttoc( AV52TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      GXv_SdtWWPGridState27[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState27, "TFBARNUMANY", "", !((0==AV56TFBarNumAny)&&(0==AV57TFBarNumAny_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarNumAny, 3, 0)), GXutil.trim( GXutil.str( AV57TFBarNumAny_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState27[0] ;
      if ( ! (GXutil.strcmp("", AV59Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV60Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV60Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV61Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV61Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV62Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63FechaCierre)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHACIERRE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV63FechaCierre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64RecAcab)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECACAB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64RecAcab );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV136Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV136Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RECMAQ" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S232( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV92ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
      AV92ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV91i = GXutil.sleep( 2) ;
      AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos lectura ... ", ""));
      AV91i = GXutil.sleep( 2) ;
      AV79t = (short)(0) ;
      /* Start For Each Line */
      nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_43_fel_idx = 0 ;
      while ( nGXsfl_43_fel_idx < nRC_GXsfl_43 )
      {
         nGXsfl_43_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_fel_idx+1) ;
         sGXsfl_43_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_432( ) ;
         cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
         cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
         AV65grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
         AV69Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
         AV82Pesado = ((GXutil.strcmp(httpContext.cgiGet( chkavPesado.getInternalname()), "S")==0) ? "S" : "N") ;
         AV81Adicion = ((GXutil.strcmp(httpContext.cgiGet( chkavAdicion.getInternalname()), "S")==0) ? "S" : "N") ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCIDENCIAS");
            GX_FocusControl = edtavIncidencias_Internalname ;
            wbErr = true ;
            AV85incidencias = (short)(0) ;
         }
         else
         {
            AV85incidencias = (short)(localUtil.ctol( httpContext.cgiGet( edtavIncidencias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV83BatchCode = httpContext.cgiGet( edtavBatchcode_Internalname) ;
         AV88DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV89BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
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
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLORSERVICE");
            GX_FocusControl = edtavColorservice_Internalname ;
            wbErr = true ;
            AV84Colorservice = (short)(0) ;
         }
         else
         {
            AV84Colorservice = (short)(localUtil.ctol( httpContext.cgiGet( edtavColorservice_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A4654RecNroPar = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4654RecNroPar = false ;
         if ( GXutil.strcmp(AV69Seleccionar, httpContext.getMessage( "S", "")) == 0 )
         {
            AV92ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Leyendo N Hdr ", "")+A13696BarNHdr);
            if ( AV84Colorservice == 1 )
            {
               GXv_char26[0] = AV93Inc_obs ;
               GXv_int8[0] = AV98RecNumAny ;
               GXv_objcol_SdtMessages_Message18[0] = new GXBaseCollection<com.genexus.SdtMessages_Message>() ;
               new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV83BatchCode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, httpContext.getMessage( "N", ""), GXv_char26, GXv_int8, GXv_objcol_SdtMessages_Message18) ;
               recetadetinte_cierre_wc_impl.this.AV93Inc_obs = GXv_char26[0] ;
               recetadetinte_cierre_wc_impl.this.AV98RecNumAny = GXv_int8[0] ;
               new app.pcommit(remoteHandle, context).execute( ) ;
               if ( ! (GXutil.strcmp("", AV93Inc_obs)==0) )
               {
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV136Pgmname, AV73UsurCod, AV71Station, AV93Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
            }
            AV94Ca_diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
            GXv_char26[0] = AV59Emprcod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int8[0] = A132BarCodReo ;
            GXv_char24[0] = A130BarCodPar ;
            GXv_char22[0] = httpContext.getMessage( "A", "") ;
            GXv_int28[0] = (byte)(AV75Consumos) ;
            GXv_int13[0] = A189BarNumAny ;
            GXv_int29[0] = A2804RecLinMaq ;
            GXv_char4[0] = A602MaqCod ;
            GXv_char3[0] = httpContext.getMessage( "M", "") ;
            GXv_char2[0] = httpContext.getMessage( "M", "") ;
            GXv_dtime30[0] = AV94Ca_diahora ;
            GXv_int31[0] = AV67Cc_almcod ;
            GXv_char32[0] = AV95productosconsumos ;
            GXv_int33[0] = AV97j ;
            GXv_char34[0] = AV73UsurCod ;
            GXv_char35[0] = AV71Station ;
            GXv_date36[0] = AV63FechaCierre ;
            new app.pcls999(remoteHandle, context).execute( GXv_char26, GXv_int6, GXv_int8, GXv_char24, GXv_char22, GXv_int28, GXv_int13, GXv_int29, GXv_char4, GXv_char3, GXv_char2, GXv_dtime30, GXv_int31, GXv_char32, GXv_int33, GXv_char34, GXv_char35, GXv_date36) ;
            recetadetinte_cierre_wc_impl.this.AV59Emprcod = GXv_char26[0] ;
            recetadetinte_cierre_wc_impl.this.A129BarCod = GXv_int6[0] ;
            recetadetinte_cierre_wc_impl.this.A132BarCodReo = GXv_int8[0] ;
            recetadetinte_cierre_wc_impl.this.A130BarCodPar = GXv_char24[0] ;
            recetadetinte_cierre_wc_impl.this.AV75Consumos = GXv_int28[0] ;
            recetadetinte_cierre_wc_impl.this.A189BarNumAny = GXv_int13[0] ;
            recetadetinte_cierre_wc_impl.this.A2804RecLinMaq = GXv_int29[0] ;
            recetadetinte_cierre_wc_impl.this.A602MaqCod = GXv_char4[0] ;
            recetadetinte_cierre_wc_impl.this.AV94Ca_diahora = GXv_dtime30[0] ;
            recetadetinte_cierre_wc_impl.this.AV67Cc_almcod = GXv_int31[0] ;
            recetadetinte_cierre_wc_impl.this.AV95productosconsumos = GXv_char32[0] ;
            recetadetinte_cierre_wc_impl.this.AV97j = (short)((short)(GXv_int33[0])) ;
            recetadetinte_cierre_wc_impl.this.AV73UsurCod = GXv_char34[0] ;
            recetadetinte_cierre_wc_impl.this.AV71Station = GXv_char35[0] ;
            recetadetinte_cierre_wc_impl.this.AV63FechaCierre = GXv_date36[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75Consumos), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Cc_almcod), 2, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95productosconsumos", AV95productosconsumos);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97j", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97j), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73UsurCod", AV73UsurCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71Station", AV71Station);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FechaCierre", localUtil.format(AV63FechaCierre, "99/99/99"));
            AV92ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesada N Hdr ", "")+A13696BarNHdr);
            AV79t = (short)(AV79t+1) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_43_fel_idx == 0 )
      {
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      nGXsfl_43_fel_idx = 1 ;
      callWebObject(formatLink("app.pctrlinsumos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV95productosconsumos))}, new String[] {"Emprcod","ProductosConsumos"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      AV92ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
      AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV91i = GXutil.sleep( 2) ;
      AV92ProgressIndicator.hide();
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void wb_table3_85_1O52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_85_1O52e( true) ;
      }
      else
      {
         wb_table3_85_1O52e( false) ;
      }
   }

   public void wb_table2_80_1O52( boolean wbgen )
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
         wb_table2_80_1O52e( true) ;
      }
      else
      {
         wb_table2_80_1O52e( false) ;
      }
   }

   public void wb_table1_25_1O52( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_30_1O52( true) ;
      }
      else
      {
         wb_table4_30_1O52( false) ;
      }
      return  ;
   }

   public void wb_table4_30_1O52e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1O52e( true) ;
      }
      else
      {
         wb_table1_25_1O52e( false) ;
      }
   }

   public void wb_table4_30_1O52( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_30_1O52e( true) ;
      }
      else
      {
         wb_table4_30_1O52e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV59Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      AV60Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Barcod), 8, 0));
      AV61Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barcodreo", GXutil.str( AV61Barcodreo, 1, 0));
      AV62Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcodpar", AV62Barcodpar);
      AV63FechaCierre = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FechaCierre", localUtil.format(AV63FechaCierre, "99/99/99"));
      AV64RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64RecAcab", AV64RecAcab);
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
      pa1O52( ) ;
      ws1O52( ) ;
      we1O52( ) ;
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
      sCtrlAV59Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV60Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV61Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV62Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV63FechaCierre = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV64RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1O52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\recetadetinte_cierre_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1O52( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV59Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
         AV60Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Barcod), 8, 0));
         AV61Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barcodreo", GXutil.str( AV61Barcodreo, 1, 0));
         AV62Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcodpar", AV62Barcodpar);
         AV63FechaCierre = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FechaCierre", localUtil.format(AV63FechaCierre, "99/99/99"));
         AV64RecAcab = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64RecAcab", AV64RecAcab);
      }
      wcpOAV59Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV59Emprcod") ;
      wcpOAV60Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV62Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV62Barcodpar") ;
      wcpOAV63FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV63FechaCierre"), 0) ;
      wcpOAV64RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV64RecAcab") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV59Emprcod, wcpOAV59Emprcod) != 0 ) || ( AV60Barcod != wcpOAV60Barcod ) || ( AV61Barcodreo != wcpOAV61Barcodreo ) || ( GXutil.strcmp(AV62Barcodpar, wcpOAV62Barcodpar) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV63FechaCierre), GXutil.resetTime(wcpOAV63FechaCierre)) ) || ( GXutil.strcmp(AV64RecAcab, wcpOAV64RecAcab) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV59Emprcod = AV59Emprcod ;
      wcpOAV60Barcod = AV60Barcod ;
      wcpOAV61Barcodreo = AV61Barcodreo ;
      wcpOAV62Barcodpar = AV62Barcodpar ;
      wcpOAV63FechaCierre = AV63FechaCierre ;
      wcpOAV64RecAcab = AV64RecAcab ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV59Emprcod = httpContext.cgiGet( sPrefix+"AV59Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV59Emprcod) > 0 )
      {
         AV59Emprcod = httpContext.cgiGet( sCtrlAV59Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Emprcod", AV59Emprcod);
      }
      else
      {
         AV59Emprcod = httpContext.cgiGet( sPrefix+"AV59Emprcod_PARM") ;
      }
      sCtrlAV60Barcod = httpContext.cgiGet( sPrefix+"AV60Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV60Barcod) > 0 )
      {
         AV60Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV60Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Barcod), 8, 0));
      }
      else
      {
         AV60Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV60Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61Barcodreo = httpContext.cgiGet( sPrefix+"AV61Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV61Barcodreo) > 0 )
      {
         AV61Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV61Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barcodreo", GXutil.str( AV61Barcodreo, 1, 0));
      }
      else
      {
         AV61Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV61Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV62Barcodpar = httpContext.cgiGet( sPrefix+"AV62Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV62Barcodpar) > 0 )
      {
         AV62Barcodpar = httpContext.cgiGet( sCtrlAV62Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barcodpar", AV62Barcodpar);
      }
      else
      {
         AV62Barcodpar = httpContext.cgiGet( sPrefix+"AV62Barcodpar_PARM") ;
      }
      sCtrlAV63FechaCierre = httpContext.cgiGet( sPrefix+"AV63FechaCierre_CTRL") ;
      if ( GXutil.len( sCtrlAV63FechaCierre) > 0 )
      {
         AV63FechaCierre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV63FechaCierre), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FechaCierre", localUtil.format(AV63FechaCierre, "99/99/99"));
      }
      else
      {
         AV63FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV63FechaCierre_PARM"), 0) ;
      }
      sCtrlAV64RecAcab = httpContext.cgiGet( sPrefix+"AV64RecAcab_CTRL") ;
      if ( GXutil.len( sCtrlAV64RecAcab) > 0 )
      {
         AV64RecAcab = httpContext.cgiGet( sCtrlAV64RecAcab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64RecAcab", AV64RecAcab);
      }
      else
      {
         AV64RecAcab = httpContext.cgiGet( sPrefix+"AV64RecAcab_PARM") ;
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
      pa1O52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1O52( ) ;
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
      ws1O52( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Emprcod_PARM", GXutil.rtrim( AV59Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Emprcod_CTRL", GXutil.rtrim( sCtrlAV59Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV60Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Barcod_CTRL", GXutil.rtrim( sCtrlAV60Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV61Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Barcodreo_CTRL", GXutil.rtrim( sCtrlAV61Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barcodpar_PARM", GXutil.rtrim( AV62Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barcodpar_CTRL", GXutil.rtrim( sCtrlAV62Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63FechaCierre_PARM", localUtil.dtoc( AV63FechaCierre, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63FechaCierre)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63FechaCierre_CTRL", GXutil.rtrim( sCtrlAV63FechaCierre));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64RecAcab_PARM", GXutil.rtrim( AV64RecAcab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64RecAcab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64RecAcab_CTRL", GXutil.rtrim( sCtrlAV64RecAcab));
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
      we1O52( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562377", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/recetadetinte_cierre_wc.js", "?202682115562378", false, true);
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

   public void subsflControlProps_432( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_43_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_43_idx );
      chkavPesado.setInternalname( sPrefix+"vPESADO_"+sGXsfl_43_idx );
      chkavAdicion.setInternalname( sPrefix+"vADICION_"+sGXsfl_43_idx );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS_"+sGXsfl_43_idx ;
      edtavBatchcode_Internalname = sPrefix+"vBATCHCODE_"+sGXsfl_43_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_43_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_43_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_43_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_43_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_43_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_idx ;
      edtBarNumCli_Internalname = sPrefix+"BARNUMCLI_"+sGXsfl_43_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_43_idx ;
      edtRecVolPrd_Internalname = sPrefix+"RECVOLPRD_"+sGXsfl_43_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_43_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_43_idx ;
      edtBarNumAny_Internalname = sPrefix+"BARNUMANY_"+sGXsfl_43_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_idx ;
      edtavColorservice_Internalname = sPrefix+"vCOLORSERVICE_"+sGXsfl_43_idx ;
      edtRecNroPar_Internalname = sPrefix+"RECNROPAR_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_43_fel_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_43_fel_idx );
      chkavPesado.setInternalname( sPrefix+"vPESADO_"+sGXsfl_43_fel_idx );
      chkavAdicion.setInternalname( sPrefix+"vADICION_"+sGXsfl_43_fel_idx );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS_"+sGXsfl_43_fel_idx ;
      edtavBatchcode_Internalname = sPrefix+"vBATCHCODE_"+sGXsfl_43_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_43_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_43_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_43_fel_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_43_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_43_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_fel_idx ;
      edtBarNumCli_Internalname = sPrefix+"BARNUMCLI_"+sGXsfl_43_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_43_fel_idx ;
      edtRecVolPrd_Internalname = sPrefix+"RECVOLPRD_"+sGXsfl_43_fel_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_43_fel_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_43_fel_idx ;
      edtBarNumAny_Internalname = sPrefix+"BARNUMANY_"+sGXsfl_43_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_fel_idx ;
      edtavColorservice_Internalname = sPrefix+"vCOLORSERVICE_"+sGXsfl_43_fel_idx ;
      edtRecNroPar_Internalname = sPrefix+"RECNROPAR_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1O50( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_43_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV65grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV65grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV65grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_43_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV65grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_43_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_43_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV69Seleccionar,"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(45, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavPesado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavPesado.getEnabled()!=0)&&(chkavPesado.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vPESADO_" + sGXsfl_43_idx ;
         chkavPesado.setName( GXCCtl );
         chkavPesado.setWebtags( "" );
         chkavPesado.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPesado.getInternalname(), "TitleCaption", chkavPesado.getCaption(), !bGXsfl_43_Refreshing);
         chkavPesado.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPesado.getInternalname(),AV82Pesado,"","",Integer.valueOf(chkavPesado.getVisible()),Integer.valueOf(chkavPesado.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(46, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavPesado.getEnabled()!=0)&&(chkavPesado.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavAdicion.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavAdicion.getEnabled()!=0)&&(chkavAdicion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vADICION_" + sGXsfl_43_idx ;
         chkavAdicion.setName( GXCCtl );
         chkavAdicion.setWebtags( "" );
         chkavAdicion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAdicion.getInternalname(), "TitleCaption", chkavAdicion.getCaption(), !bGXsfl_43_Refreshing);
         chkavAdicion.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavAdicion.getInternalname(),AV81Adicion,"","",Integer.valueOf(chkavAdicion.getVisible()),Integer.valueOf(chkavAdicion.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(47, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavAdicion.getEnabled()!=0)&&(chkavAdicion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIncidencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIncidencias_Enabled!=0)&&(edtavIncidencias_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIncidencias_Internalname,GXutil.ltrim( localUtil.ntoc( AV85incidencias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIncidencias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV85incidencias), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV85incidencias), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavIncidencias_Enabled!=0)&&(edtavIncidencias_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e231o52_client"+"'","","","","",edtavIncidencias_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,edtavIncidencias_Columnclass,edtavIncidencias_Columnheaderclass,Integer.valueOf(edtavIncidencias_Visible),Integer.valueOf(edtavIncidencias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBatchcode_Enabled!=0)&&(edtavBatchcode_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBatchcode_Internalname,GXutil.rtrim( AV83BatchCode),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBatchcode_Enabled!=0)&&(edtavBatchcode_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBatchcode_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBatchcode_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV88DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e241o52_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarNHdr_Columnclass,edtBarNHdr_Columnheaderclass,Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinMaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecLinMaq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrest_Internalname,GXutil.rtrim( AV89BarAgrEst),GXutil.rtrim( localUtil.format( AV89BarAgrEst, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e251o52_client"+"'","","","","",edtavBaragrest_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaragrest_Visible),Integer.valueOf(edtavBaragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2805RecVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecTotKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecTotKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecTotKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecTotKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecAlt_Internalname,localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4866RecFecAlt, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecFecAlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFecAlt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumAny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumAny_Internalname,GXutil.ltrim( localUtil.ntoc( A189BarNumAny, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A189BarNumAny), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNumAny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavColorservice_Enabled!=0)&&(edtavColorservice_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavColorservice_Internalname,GXutil.ltrim( localUtil.ntoc( AV84Colorservice, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavColorservice_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84Colorservice), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavColorservice_Enabled!=0)&&(edtavColorservice_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavColorservice_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavColorservice_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecNroPar_Internalname,GXutil.ltrim( localUtil.ntoc( A4654RecNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecNroPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1O52( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavPesado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavAdicion.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ad?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIncidencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV65grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV69Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV82Pesado));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavPesado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavPesado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81Adicion));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavAdicion.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavAdicion.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85incidencias, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavIncidencias_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavIncidencias_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIncidencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIncidencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83BatchCode));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBatchcode_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV88DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarNHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarNHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89BarAgrEst));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV84Colorservice, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavColorservice_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4654RecNroPar, (byte)(6), (byte)(0), ".", "")));
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
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      chkavPesado.setInternalname( sPrefix+"vPESADO" );
      chkavAdicion.setInternalname( sPrefix+"vADICION" );
      edtavIncidencias_Internalname = sPrefix+"vINCIDENCIAS" ;
      edtavBatchcode_Internalname = sPrefix+"vBATCHCODE" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
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
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtavColorservice_Internalname = sPrefix+"vCOLORSERVICE" ;
      edtRecNroPar_Internalname = sPrefix+"RECNROPAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      tblTabledvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtRecNroPar_Jsonclick = "" ;
      edtavColorservice_Jsonclick = "" ;
      edtavColorservice_Visible = 0 ;
      edtavColorservice_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
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
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Columnclass = "WWColumn hidden-xs" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavBatchcode_Jsonclick = "" ;
      edtavBatchcode_Visible = 0 ;
      edtavBatchcode_Enabled = 1 ;
      edtavIncidencias_Jsonclick = "" ;
      edtavIncidencias_Columnclass = "WWColumn" ;
      edtavIncidencias_Enabled = 1 ;
      chkavAdicion.setCaption( "" );
      chkavAdicion.setEnabled( 1 );
      chkavPesado.setCaption( "" );
      chkavPesado.setEnabled( 1 );
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarNHdr_Columnheaderclass = "" ;
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
      chkavAdicion.setVisible( -1 );
      chkavPesado.setVisible( -1 );
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_recfecaltauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Grid" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;;;Fecha;;;;;;" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma el Cierre?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
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
      Ddo_grid_Datalistproc = "FormulacionTinte.RecetadeTinte_Cierre_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|Dynamic|Dynamic|||Dynamic||Dynamic||||" ;
      Ddo_grid_Includedatalist = "T|||T|T|T|||T||T||||" ;
      Ddo_grid_Filterisrange = "|T|T||||T|T||T||T|T||T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Character|Character|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Numeric|Date|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10|1|11||12|13" ;
      Ddo_grid_Columnids = "7:BarNHdr|8:RecLinMaq|9:BarSit|11:BarSer|12:BarSerDsc|13:BarColNom|14:BarColNum|15:BarTipCol|16:BarNomCli|17:BarNumCli|18:MaqCod|19:RecVolPrd|20:RecTotKgm|21:RecFecAlt|22:BarNumAny" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_43_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_43_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_43_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      GXCCtl = "vPESADO_" + sGXsfl_43_idx ;
      chkavPesado.setName( GXCCtl );
      chkavPesado.setWebtags( "" );
      chkavPesado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPesado.getInternalname(), "TitleCaption", chkavPesado.getCaption(), !bGXsfl_43_Refreshing);
      chkavPesado.setCheckedValue( "N" );
      GXCCtl = "vADICION_" + sGXsfl_43_idx ;
      chkavAdicion.setName( GXCCtl );
      chkavAdicion.setWebtags( "" );
      chkavAdicion.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAdicion.getInternalname(), "TitleCaption", chkavAdicion.getCaption(), !bGXsfl_43_Refreshing);
      chkavAdicion.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131O52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211O52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV65grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV88DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV69Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV82Pesado',fld:'vPESADO',pic:''},{av:'AV81Adicion',fld:'vADICION',pic:''},{av:'AV85incidencias',fld:'vINCIDENCIAS',pic:'ZZZ9'},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV89BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV84Colorservice',fld:'vCOLORSERVICE',pic:'ZZZ9',hsh:true},{av:'edtavIncidencias_Columnclass',ctrl:'vINCIDENCIAS',prop:'Columnclass'},{av:'edtBarNHdr_Columnclass',ctrl:'BARNHDR',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141O52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121O52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e221O52',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV65grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV84Colorservice',fld:'vCOLORSERVICE',pic:'ZZZ9',hsh:true},{av:'A4654RecNroPar',fld:'RECNROPAR',pic:'ZZZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'sPrefix'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV65grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_anyadirproductos_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'ConfirmationText'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE","{handler:'e151O52',iparms:[{av:'Dvelop_confirmpanel_anyadirproductos_Result',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'Result'},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV84Colorservice',fld:'vCOLORSERVICE',pic:'ZZZ9',hsh:true},{av:'A4654RecNroPar',fld:'RECNROPAR',pic:'ZZZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV70FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV75Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV67Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV80FlagM',fld:'vFLAGM',pic:'ZZZ9'},{av:'AV68Recfec',fld:'vRECFEC',pic:''},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV99HayAnyadidas',fld:'vHAYANYADIDAS',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE",",oparms:[{av:'AV99HayAnyadidas',fld:'vHAYANYADIDAS',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV68Recfec',fld:'vRECFEC',pic:''},{av:'AV80FlagM',fld:'vFLAGM',pic:'ZZZ9'},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV67Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV75Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV70FecCieTin',fld:'vFECCIETIN',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111O51',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e161O52',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',grid:43,pic:'',hsh:true},{av:'nRC_GXsfl_43',ctrl:'GRID',grid:43,prop:'GridRC',grid:43},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV69Seleccionar',fld:'vSELECCIONAR',grid:43,pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',grid:43,pic:''},{av:'AV84Colorservice',fld:'vCOLORSERVICE',grid:43,pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',grid:43,pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',grid:43,pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',grid:43,pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',grid:43,pic:'ZZZ9'},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV71Station',fld:'vSTATION',pic:''},{av:'AV75Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A189BarNumAny',fld:'BARNUMANY',grid:43,pic:'ZZ9'},{av:'A602MaqCod',fld:'MAQCOD',grid:43,pic:''},{av:'AV67Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV95productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV97j',fld:'vJ',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV71Station',fld:'vSTATION',pic:''},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV97j',fld:'vJ',pic:'ZZZ9'},{av:'AV95productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV67Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A189BarNumAny',fld:'BARNUMANY',pic:'ZZ9'},{av:'AV75Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171O52',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181O52',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e241O52',iparms:[{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VBARAGREST.CLICK","{handler:'e251O52',iparms:[{av:'AV89BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VBARAGREST.CLICK",",oparms:[]}");
      setEventMetadata("VINCIDENCIAS.CLICK","{handler:'e231O52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("VINCIDENCIAS.CLICK",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'AV76colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZZZZZZZZ9',hsh:true},{av:'AV83BatchCode',fld:'vBATCHCODE',pic:'',hsh:true},{av:'AV78colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV77clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV27TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV28TFRecLinMaq',fld:'vTFRECLINMAQ',pic:'ZZZ9'},{av:'AV29TFRecLinMaq_To',fld:'vTFRECLINMAQ_TO',pic:'ZZZ9'},{av:'AV30TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV31TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV32TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV33TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV35TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV36TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV37TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV38TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV39TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV41TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV42TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV43TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV44TFBarNumCli',fld:'vTFBARNUMCLI',pic:'ZZZZZ9'},{av:'AV45TFBarNumCli_To',fld:'vTFBARNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV48TFRecVolPrd',fld:'vTFRECVOLPRD',pic:'ZZZZ9'},{av:'AV49TFRecVolPrd_To',fld:'vTFRECVOLPRD_TO',pic:'ZZZZ9'},{av:'AV50TFRecTotKgm',fld:'vTFRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV51TFRecTotKgm_To',fld:'vTFRECTOTKGM_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV56TFBarNumAny',fld:'vTFBARNUMANY',pic:'ZZ9'},{av:'AV57TFBarNumAny_To',fld:'vTFBARNUMANY_TO',pic:'ZZ9'},{av:'AV136Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV62Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV63FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV64RecAcab',fld:'vRECACAB',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{av:'chkavPesado.getVisible()',ctrl:'vPESADO',prop:'Visible'},{av:'chkavAdicion.getVisible()',ctrl:'vADICION',prop:'Visible'},{av:'edtavIncidencias_Visible',ctrl:'vINCIDENCIAS',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtRecLinMaq_Visible',ctrl:'RECLINMAQ',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNumCli_Visible',ctrl:'BARNUMCLI',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtRecVolPrd_Visible',ctrl:'RECVOLPRD',prop:'Visible'},{av:'edtRecTotKgm_Visible',ctrl:'RECTOTKGM',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtBarNumAny_Visible',ctrl:'BARNUMANY',prop:'Visible'},{av:'edtavIncidencias_Columnheaderclass',ctrl:'vINCIDENCIAS',prop:'Columnheaderclass'},{av:'edtBarNHdr_Columnheaderclass',ctrl:'BARNHDR',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recnropar',iparms:[]");
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
      wcpOAV59Emprcod = "" ;
      wcpOAV62Barcodpar = "" ;
      wcpOAV63FechaCierre = GXutil.nullDate() ;
      wcpOAV64RecAcab = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_anyadirproductos_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV59Emprcod = "" ;
      AV62Barcodpar = "" ;
      AV63FechaCierre = GXutil.nullDate() ;
      AV64RecAcab = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFBarNHdr = "" ;
      AV27TFBarNHdr_Sel = "" ;
      AV32TFBarSer = "" ;
      AV33TFBarSer_Sel = "" ;
      AV34TFBarSerDsc = "" ;
      AV35TFBarSerDsc_Sel = "" ;
      AV36TFBarColNom = "" ;
      AV37TFBarColNom_Sel = "" ;
      AV42TFBarNomCli = "" ;
      AV43TFBarNomCli_Sel = "" ;
      AV46TFMaqCod = "" ;
      AV47TFMaqCod_Sel = "" ;
      AV50TFRecTotKgm = DecimalUtil.ZERO ;
      AV51TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV52TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV136Pgmname = "" ;
      A4576RecLinUsr = "" ;
      A13951WP_BatchCo = "" ;
      AV83BatchCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70FecCieTin = GXutil.nullDate() ;
      AV68Recfec = GXutil.nullDate() ;
      AV99HayAnyadidas = "" ;
      AV73UsurCod = "" ;
      AV71Station = "" ;
      AV95productosconsumos = "" ;
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_RecFecAltAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = "" ;
      AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = "" ;
      AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = "" ;
      AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = "" ;
      AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = "" ;
      AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
      AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = "" ;
      AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = DecimalUtil.ZERO ;
      AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV69Seleccionar = "" ;
      AV82Pesado = "" ;
      AV81Adicion = "" ;
      AV88DetailWebComponent = "" ;
      A13696BarNHdr = "" ;
      AV89BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
      A6039RecAcab = "" ;
      H01O55_A2804RecLinMaq = new short[1] ;
      H01O55_A396EmprCod = new String[] {""} ;
      H01O55_A6039RecAcab = new String[] {""} ;
      H01O55_n6039RecAcab = new boolean[] {false} ;
      H01O55_A120BarAgrEst = new String[] {""} ;
      H01O55_A4654RecNroPar = new int[1] ;
      H01O55_n4654RecNroPar = new boolean[] {false} ;
      H01O55_A189BarNumAny = new short[1] ;
      H01O55_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01O55_n4866RecFecAlt = new boolean[] {false} ;
      H01O55_A2805RecVolPrd = new int[1] ;
      H01O55_A602MaqCod = new String[] {""} ;
      H01O55_A1235BarNumCli = new int[1] ;
      H01O55_A1234BarNomCli = new String[] {""} ;
      H01O55_A218BarTipCol = new byte[1] ;
      H01O55_A136BarColNum = new int[1] ;
      H01O55_A135BarColNom = new String[] {""} ;
      H01O55_A1652BarSerDsc = new String[] {""} ;
      H01O55_A212BarSer = new String[] {""} ;
      H01O55_A213BarSit = new byte[1] ;
      H01O55_A13696BarNHdr = new String[] {""} ;
      H01O55_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O55_n812RecTotKgm = new boolean[] {false} ;
      H01O55_A129BarCod = new int[1] ;
      H01O55_A132BarCodReo = new byte[1] ;
      H01O55_A130BarCodPar = new String[] {""} ;
      H01O59_AGRID_nRecordCount = new long[1] ;
      AV72EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      H01O510_A396EmprCod = new String[] {""} ;
      H01O510_A129BarCod = new int[1] ;
      H01O510_A132BarCodReo = new byte[1] ;
      H01O510_A130BarCodPar = new String[] {""} ;
      H01O510_A2804RecLinMaq = new short[1] ;
      H01O510_A4576RecLinUsr = new String[] {""} ;
      H01O510_A811RecLin = new short[1] ;
      H01O510_A1273RecLinPro = new byte[1] ;
      H01O511_A719PrdNum = new String[] {""} ;
      H01O511_A396EmprCod = new String[] {""} ;
      H01O511_A129BarCod = new int[1] ;
      H01O511_A132BarCodReo = new byte[1] ;
      H01O511_A130BarCodPar = new String[] {""} ;
      H01O511_A1377RecNumAny = new byte[1] ;
      H01O511_A2808RecLinMAL = new short[1] ;
      H01O512_A13951WP_BatchCo = new String[] {""} ;
      H01O512_A13948WP_ID = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV92ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_anyadirproductos = new com.genexus.webpanels.GXUserControl();
      AV137Emprcod_selected = "" ;
      AV140Barcodpar_selected = "" ;
      AV93Inc_obs = "" ;
      AV100messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV66Window = new com.genexus.webpanels.GXWindow();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char25 = "" ;
      GXt_char23 = "" ;
      GXt_char21 = "" ;
      GXt_char20 = "" ;
      GXt_char19 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState27 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_objcol_SdtMessages_Message18 = new GXBaseCollection[1] ;
      AV94Ca_diahora = GXutil.resetTime( GXutil.nullDate() );
      GXv_char26 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char24 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_int28 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime30 = new java.util.Date[1] ;
      GXv_int31 = new byte[1] ;
      GXv_char32 = new String[1] ;
      GXv_int33 = new int[1] ;
      GXv_char34 = new String[1] ;
      GXv_char35 = new String[1] ;
      GXv_date36 = new java.util.Date[1] ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV59Emprcod = "" ;
      sCtrlAV60Barcod = "" ;
      sCtrlAV61Barcodreo = "" ;
      sCtrlAV62Barcodpar = "" ;
      sCtrlAV63FechaCierre = "" ;
      sCtrlAV64RecAcab = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_wc__default(),
         new Object[] {
             new Object[] {
            H01O55_A2804RecLinMaq, H01O55_A396EmprCod, H01O55_A6039RecAcab, H01O55_n6039RecAcab, H01O55_A120BarAgrEst, H01O55_A4654RecNroPar, H01O55_n4654RecNroPar, H01O55_A189BarNumAny, H01O55_A4866RecFecAlt, H01O55_n4866RecFecAlt,
            H01O55_A2805RecVolPrd, H01O55_A602MaqCod, H01O55_A1235BarNumCli, H01O55_A1234BarNomCli, H01O55_A218BarTipCol, H01O55_A136BarColNum, H01O55_A135BarColNom, H01O55_A1652BarSerDsc, H01O55_A212BarSer, H01O55_A213BarSit,
            H01O55_A13696BarNHdr, H01O55_A812RecTotKgm, H01O55_n812RecTotKgm, H01O55_A129BarCod, H01O55_A132BarCodReo, H01O55_A130BarCodPar
            }
            , new Object[] {
            H01O59_AGRID_nRecordCount
            }
            , new Object[] {
            H01O510_A396EmprCod, H01O510_A129BarCod, H01O510_A132BarCodReo, H01O510_A130BarCodPar, H01O510_A2804RecLinMaq, H01O510_A4576RecLinUsr, H01O510_A811RecLin, H01O510_A1273RecLinPro
            }
            , new Object[] {
            H01O511_A719PrdNum, H01O511_A396EmprCod, H01O511_A129BarCod, H01O511_A132BarCodReo, H01O511_A130BarCodPar, H01O511_A1377RecNumAny, H01O511_A2808RecLinMAL
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_wc__colorservice(),
         new Object[] {
             new Object[] {
            H01O512_A13951WP_BatchCo, H01O512_A13948WP_ID
            }
         }
      );
      AV136Pgmname = "FormulacionTinte.RecetadeTinte_Cierre_WC" ;
      /* GeneXus formulas. */
      AV136Pgmname = "FormulacionTinte.RecetadeTinte_Cierre_WC" ;
      Gx_err = (short)(0) ;
      chkavPesado.setEnabled( 0 );
      chkavAdicion.setEnabled( 0 );
      edtavIncidencias_Enabled = 0 ;
      edtavBatchcode_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      edtavColorservice_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV61Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV61Barcodreo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV30TFBarSit ;
   private byte AV31TFBarSit_To ;
   private byte AV40TFBarTipCol ;
   private byte AV41TFBarTipCol_To ;
   private byte A1273RecLinPro ;
   private byte A1377RecNumAny ;
   private byte AV67Cc_almcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ;
   private byte AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ;
   private byte AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ;
   private byte AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte AV139Barcodreo_selected ;
   private byte AV98RecNumAny ;
   private byte GXv_int8[] ;
   private byte GXv_int28[] ;
   private byte GXv_int31[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV28TFRecLinMaq ;
   private short AV29TFRecLinMaq_To ;
   private short AV56TFBarNumAny ;
   private short AV57TFBarNumAny_To ;
   private short AV12OrderedBy ;
   private short A811RecLin ;
   private short A2808RecLinMAL ;
   private short AV78colorservicecontador ;
   private short AV77clienteModa21 ;
   private short AV75Consumos ;
   private short AV80FlagM ;
   private short AV97j ;
   private short wbEnd ;
   private short wbStart ;
   private short AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ;
   private short AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ;
   private short AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ;
   private short AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ;
   private short AV65grupodeacciones ;
   private short AV85incidencias ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short AV84Colorservice ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV79t ;
   private short GXt_int12 ;
   private short AV141Reclinmaq_selected ;
   private short AV91i ;
   private short GXv_int13[] ;
   private short GXv_int29[] ;
   private int wcpOAV60Barcod ;
   private int nRC_GXsfl_43 ;
   private int AV60Barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_43_idx=1 ;
   private int AV38TFBarColNum ;
   private int AV39TFBarColNum_To ;
   private int AV44TFBarNumCli ;
   private int AV45TFBarNumCli_To ;
   private int AV48TFRecVolPrd ;
   private int AV49TFRecVolPrd_To ;
   private int AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ;
   private int AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ;
   private int AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ;
   private int AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ;
   private int AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ;
   private int AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int A129BarCod ;
   private int A4654RecNroPar ;
   private int subGrid_Islastpage ;
   private int edtavIncidencias_Enabled ;
   private int edtavBatchcode_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavBaragrest_Enabled ;
   private int edtavColorservice_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV74ContVal ;
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
   private int AV138Barcod_selected ;
   private int AV142GXV1 ;
   private int nGXsfl_43_fel_idx=1 ;
   private int GXv_int6[] ;
   private int GXv_int33[] ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavBatchcode_Visible ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavColorservice_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13948WP_ID ;
   private long AV76colorserviceID ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV87WeigProdID ;
   private java.math.BigDecimal AV50TFRecTotKgm ;
   private java.math.BigDecimal AV51TFRecTotKgm_To ;
   private java.math.BigDecimal AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ;
   private java.math.BigDecimal AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String wcpOAV59Emprcod ;
   private String wcpOAV62Barcodpar ;
   private String wcpOAV64RecAcab ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_anyadirproductos_Result ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV59Emprcod ;
   private String AV62Barcodpar ;
   private String AV64RecAcab ;
   private String sGXsfl_43_idx="0001" ;
   private String AV26TFBarNHdr ;
   private String AV27TFBarNHdr_Sel ;
   private String AV32TFBarSer ;
   private String AV33TFBarSer_Sel ;
   private String AV34TFBarSerDsc ;
   private String AV35TFBarSerDsc_Sel ;
   private String AV36TFBarColNom ;
   private String AV37TFBarColNom_Sel ;
   private String AV42TFBarNomCli ;
   private String AV43TFBarNomCli_Sel ;
   private String AV46TFMaqCod ;
   private String AV47TFMaqCod_Sel ;
   private String AV136Pgmname ;
   private String A4576RecLinUsr ;
   private String AV83BatchCode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String AV99HayAnyadidas ;
   private String AV73UsurCod ;
   private String AV71Station ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
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
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
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
   private String AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ;
   private String AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ;
   private String AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ;
   private String AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ;
   private String AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ;
   private String AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ;
   private String AV69Seleccionar ;
   private String AV82Pesado ;
   private String AV81Adicion ;
   private String edtavIncidencias_Internalname ;
   private String edtavBatchcode_Internalname ;
   private String AV88DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtBarSit_Internalname ;
   private String AV89BarAgrEst ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtavColorservice_Internalname ;
   private String edtRecNroPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String lV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String lV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String lV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String lV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String lV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String A6039RecAcab ;
   private String AV72EmprNom ;
   private String edtavIncidencias_Columnheaderclass ;
   private String edtBarNHdr_Columnheaderclass ;
   private String edtavIncidencias_Columnclass ;
   private String edtBarNHdr_Columnclass ;
   private String Dvelop_confirmpanel_anyadirproductos_Internalname ;
   private String AV137Emprcod_selected ;
   private String AV140Barcodpar_selected ;
   private String GXt_char25 ;
   private String GXt_char23 ;
   private String GXt_char21 ;
   private String GXt_char20 ;
   private String GXt_char19 ;
   private String GXt_char1 ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String GXv_char26[] ;
   private String GXv_char24[] ;
   private String GXv_char22[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char32[] ;
   private String GXv_char34[] ;
   private String GXv_char35[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_anyadirproductos_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV59Emprcod ;
   private String sCtrlAV60Barcod ;
   private String sCtrlAV61Barcodreo ;
   private String sCtrlAV62Barcodpar ;
   private String sCtrlAV63FechaCierre ;
   private String sCtrlAV64RecAcab ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavIncidencias_Jsonclick ;
   private String edtavBatchcode_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
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
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtavColorservice_Jsonclick ;
   private String edtRecNroPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFRecFecAlt ;
   private java.util.Date AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV94Ca_diahora ;
   private java.util.Date GXv_dtime30[] ;
   private java.util.Date wcpOAV63FechaCierre ;
   private java.util.Date AV63FechaCierre ;
   private java.util.Date AV70FecCieTin ;
   private java.util.Date AV68Recfec ;
   private java.util.Date AV54DDO_RecFecAltAuxDate ;
   private java.util.Date GXv_date36[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n812RecTotKgm ;
   private boolean n4866RecFecAlt ;
   private boolean n4654RecNroPar ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String A13951WP_BatchCo ;
   private String AV95productosconsumos ;
   private String AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private String lV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV93Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV66Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anyadirproductos ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavSeleccionar ;
   private ICheckbox chkavPesado ;
   private ICheckbox chkavAdicion ;
   private IDataStoreProvider pr_default ;
   private short[] H01O55_A2804RecLinMaq ;
   private String[] H01O55_A396EmprCod ;
   private String[] H01O55_A6039RecAcab ;
   private boolean[] H01O55_n6039RecAcab ;
   private String[] H01O55_A120BarAgrEst ;
   private int[] H01O55_A4654RecNroPar ;
   private boolean[] H01O55_n4654RecNroPar ;
   private short[] H01O55_A189BarNumAny ;
   private java.util.Date[] H01O55_A4866RecFecAlt ;
   private boolean[] H01O55_n4866RecFecAlt ;
   private int[] H01O55_A2805RecVolPrd ;
   private String[] H01O55_A602MaqCod ;
   private int[] H01O55_A1235BarNumCli ;
   private String[] H01O55_A1234BarNomCli ;
   private byte[] H01O55_A218BarTipCol ;
   private int[] H01O55_A136BarColNum ;
   private String[] H01O55_A135BarColNom ;
   private String[] H01O55_A1652BarSerDsc ;
   private String[] H01O55_A212BarSer ;
   private byte[] H01O55_A213BarSit ;
   private String[] H01O55_A13696BarNHdr ;
   private java.math.BigDecimal[] H01O55_A812RecTotKgm ;
   private boolean[] H01O55_n812RecTotKgm ;
   private int[] H01O55_A129BarCod ;
   private byte[] H01O55_A132BarCodReo ;
   private String[] H01O55_A130BarCodPar ;
   private long[] H01O59_AGRID_nRecordCount ;
   private String[] H01O510_A396EmprCod ;
   private int[] H01O510_A129BarCod ;
   private byte[] H01O510_A132BarCodReo ;
   private String[] H01O510_A130BarCodPar ;
   private short[] H01O510_A2804RecLinMaq ;
   private String[] H01O510_A4576RecLinUsr ;
   private short[] H01O510_A811RecLin ;
   private byte[] H01O510_A1273RecLinPro ;
   private String[] H01O511_A719PrdNum ;
   private String[] H01O511_A396EmprCod ;
   private int[] H01O511_A129BarCod ;
   private byte[] H01O511_A132BarCodReo ;
   private String[] H01O511_A130BarCodPar ;
   private byte[] H01O511_A1377RecNumAny ;
   private short[] H01O511_A2808RecLinMAL ;
   private IDataStoreProvider pr_colorservice ;
   private String[] H01O512_A13951WP_BatchCo ;
   private long[] H01O512_A13948WP_ID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV100messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState27[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV92ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class recetadetinte_cierre_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01O55( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                          short AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                          short AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                          byte AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                          byte AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                          String AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                          String AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                          String AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                          String AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                          String AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                          String AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                          int AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                          int AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                          byte AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                          byte AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                          String AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                          String AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                          int AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                          int AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                          String AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                          String AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                          int AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                          int AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                          short AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                          short AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                          String AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                          java.math.BigDecimal AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV64RecAcab ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[59];
      Object[] GXv_Object38 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.RecLinMaq, T1.EmprCod, T1.RecAcab, T2.BarAgrEst, T1.RecNroPar, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli," ;
      sSelectString += " T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90')," ;
      sSelectString += " 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      sFromString = " FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm," ;
      sFromString += " T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR" ;
      sFromString += " GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar)" ;
      sFromString += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod" ;
      sFromString += " = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod" ;
      sFromString += " AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int37[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int37[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int37[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int37[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int37[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int37[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int37[44] = (byte)(1) ;
      }
      if ( ! (0==AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int37[45] = (byte)(1) ;
      }
      if ( ! (0==AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int37[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int37[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int37[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int37[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int37[51] = (byte)(1) ;
      }
      if ( ! (0==AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int37[52] = (byte)(1) ;
      }
      if ( ! (0==AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int37[53] = (byte)(1) ;
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
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H01O59( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                          short AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                          short AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                          byte AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                          byte AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                          String AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                          String AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                          String AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                          String AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                          String AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                          String AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                          int AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                          int AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                          byte AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                          byte AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                          String AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                          String AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                          int AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                          int AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                          String AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                          String AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                          int AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                          int AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                          short AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                          short AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                          String AV103Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV128Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                          java.math.BigDecimal AV129Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV64RecAcab ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[54];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm," ;
      scmdbuf += " 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo" ;
      scmdbuf += " AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( ! (0==AV109Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV110Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV114Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int39[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int39[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV120Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int39[44] = (byte)(1) ;
      }
      if ( ! (0==AV122Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int39[45] = (byte)(1) ;
      }
      if ( ! (0==AV123Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int39[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int39[51] = (byte)(1) ;
      }
      if ( ! (0==AV131Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int39[52] = (byte)(1) ;
      }
      if ( ! (0==AV132Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int39[53] = (byte)(1) ;
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
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
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
                  return conditional_H01O55(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
            case 1 :
                  return conditional_H01O59(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01O55", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O59", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O510", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinUsr, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O511", "SELECT PrdNum, EmprCod, BarCod, BarCodReo, BarCodPar, RecNumAny, RecLinMAL FROM TXPLANYAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((String[]) buf[17])[0] = rslt.getString(15, 26);
               ((String[]) buf[18])[0] = rslt.getString(16, 16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 11);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[90]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[91]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[100]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[101]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[110], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[111]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[112]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

final  class recetadetinte_cierre_wc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01O512", "SELECT [BatchCode], [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE RTRIM(LTRIM([BatchCode])) = RTRIM(LTRIM(?)) ORDER BY [id] ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               stmt.setString(1, (String)parms[0], 20);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

