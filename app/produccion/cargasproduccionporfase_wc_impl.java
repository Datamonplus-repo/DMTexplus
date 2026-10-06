package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasproduccionporfase_wc_impl extends GXWebComponent
{
   public cargasproduccionporfase_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cargasproduccionporfase_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporfase_wc_impl.class ));
   }

   public cargasproduccionporfase_wc_impl( int remoteHandle ,
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
      chkavSel = UIFactory.getCheckbox(this);
      cmbBarFasEst = new HTMLChoice();
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
               AV73Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Emprcod", AV73Emprcod);
               AV83FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83FasCod", AV83FasCod);
               AV74CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CliCod), 6, 0));
               AV75CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75CliCod_to), 6, 0));
               AV76BarFecgen = localUtil.parseDateParm( httpContext.GetPar( "BarFecgen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecgen", localUtil.format(AV76BarFecgen, "99/99/99"));
               AV77BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarFecGen_to", localUtil.format(AV77BarFecGen_to, "99/99/99"));
               AV78BarSIt = (byte)(GXutil.lval( httpContext.GetPar( "BarSIt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarSIt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarSIt), 2, 0));
               AV79Barsit_to = (byte)(GXutil.lval( httpContext.GetPar( "Barsit_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79Barsit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79Barsit_to), 2, 0));
               AV80BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFasEst", GXutil.str( AV80BarFasEst, 1, 0));
               AV81BarFasEst_to = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFasEst_to", GXutil.str( AV81BarFasEst_to, 1, 0));
               AV82BarAcaAnh = (short)(GXutil.lval( httpContext.GetPar( "BarAcaAnh"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAcaAnh), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV73Emprcod,AV83FasCod,Integer.valueOf(AV74CliCod),Integer.valueOf(AV75CliCod_to),AV76BarFecgen,AV77BarFecGen_to,Byte.valueOf(AV78BarSIt),Byte.valueOf(AV79Barsit_to),Byte.valueOf(AV80BarFasEst),Byte.valueOf(AV81BarFasEst_to),Short.valueOf(AV82BarAcaAnh)});
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
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
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
      AV73Emprcod = httpContext.GetPar( "Emprcod") ;
      AV83FasCod = httpContext.GetPar( "FasCod") ;
      AV74CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV75CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
      AV76BarFecgen = localUtil.parseDateParm( httpContext.GetPar( "BarFecgen")) ;
      AV77BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
      AV78BarSIt = (byte)(GXutil.lval( httpContext.GetPar( "BarSIt"))) ;
      AV79Barsit_to = (byte)(GXutil.lval( httpContext.GetPar( "Barsit_to"))) ;
      AV80BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      AV81BarFasEst_to = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst_to"))) ;
      AV82BarAcaAnh = (short)(GXutil.lval( httpContext.GetPar( "BarAcaAnh"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV126Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV94TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV95TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36TFBarFasEst_Sels);
      AV37TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV38TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV39TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV40TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV43TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV44TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV45TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV46TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV47TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV48TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV49TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV50TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV51TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV52TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV53TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV54TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV55TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV56TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV57TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV58TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV59TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV60TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV61TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV62TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV63TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV64TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV65TFBarFasLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarFasLin"))) ;
      AV66TFBarFasLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarFasLin_To"))) ;
      AV67TFBarFasSig = httpContext.GetPar( "TFBarFasSig") ;
      AV68TFBarFasSig_Sel = httpContext.GetPar( "TFBarFasSig_Sel") ;
      AV69TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV70TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV110TFBarDibCli = httpContext.GetPar( "TFBarDibCli") ;
      AV111TFBarDibCli_Sel = httpContext.GetPar( "TFBarDibCli_Sel") ;
      AV71TFBarAcaAnh = (short)(GXutil.lval( httpContext.GetPar( "TFBarAcaAnh"))) ;
      AV72TFBarAcaAnh_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarAcaAnh_To"))) ;
      AV106fio = (byte)(GXutil.lval( httpContext.GetPar( "fio"))) ;
      AV112tintest = (byte)(GXutil.lval( httpContext.GetPar( "tintest"))) ;
      AV103CnoEnc = (byte)(GXutil.lval( httpContext.GetPar( "CnoEnc"))) ;
      AV84TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV86TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV100Abierta = httpContext.GetPar( "Abierta") ;
      AV113FasCodAnt = httpContext.GetPar( "FasCodAnt") ;
      AV109Rioplatense = (byte)(GXutil.lval( httpContext.GetPar( "Rioplatense"))) ;
      AV102Carvitin = (byte)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      A13878PedidoClie = httpContext.GetPar( "PedidoClie") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19V2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.cargasproduccionporfase_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV73Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV83FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV74CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV75CliCod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV76BarFecgen)),GXutil.URLEncode(GXutil.formatDateParm(AV77BarFecGen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV78BarSIt,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV79Barsit_to,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80BarFasEst,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV81BarFasEst_to,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82BarAcaAnh,4,0))}, new String[] {"Emprcod","FasCod","CliCod","CliCod_to","BarFecgen","BarFecGen_to","BarSIt","Barsit_to","BarFasEst","BarFasEst_to","BarAcaAnh"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106fio), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV112tintest), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCNOENC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODANT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113FasCodAnt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRIOPLATENSE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Rioplatense), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CargasProduccionporFase_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV126Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\cargasproduccionporfase_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_59, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73Emprcod", GXutil.rtrim( wcpOAV73Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83FasCod", GXutil.rtrim( wcpOAV83FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV74CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV74CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV75CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV75CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV76BarFecgen", localUtil.dtoc( wcpOAV76BarFecgen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77BarFecGen_to", localUtil.dtoc( wcpOAV77BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78BarSIt", GXutil.ltrim( localUtil.ntoc( wcpOAV78BarSIt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV79Barsit_to", GXutil.ltrim( localUtil.ntoc( wcpOAV79Barsit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV80BarFasEst", GXutil.ltrim( localUtil.ntoc( wcpOAV80BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV81BarFasEst_to", GXutil.ltrim( localUtil.ntoc( wcpOAV81BarFasEst_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV82BarAcaAnh", GXutil.ltrim( localUtil.ntoc( wcpOAV82BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV94TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV95TFMaqCodBis_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV36TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV36TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV37TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV38TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV39TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV40TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV43TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV44TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV45TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV46TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV47TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV48TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV49TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV50TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV51TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV52TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV53TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV54TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV55TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV56TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV57TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV58TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV59TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV60TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV61TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV62TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV63TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV64TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASLIN", GXutil.ltrim( localUtil.ntoc( AV65TFBarFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASLIN_TO", GXutil.ltrim( localUtil.ntoc( AV66TFBarFasLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASSIG", GXutil.rtrim( AV67TFBarFasSig));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASSIG_SEL", GXutil.rtrim( AV68TFBarFasSig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV69TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV70TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDIBCLI", GXutil.rtrim( AV110TFBarDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDIBCLI_SEL", GXutil.rtrim( AV111TFBarDibCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARACAANH", GXutil.ltrim( localUtil.ntoc( AV71TFBarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARACAANH_TO", GXutil.ltrim( localUtil.ntoc( AV72TFBarAcaAnh_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV73Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV74CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV75CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV76BarFecgen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV77BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT", GXutil.ltrim( localUtil.ntoc( AV78BarSIt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV79Barsit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFASEST", GXutil.ltrim( localUtil.ntoc( AV80BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFASEST_TO", GXutil.ltrim( localUtil.ntoc( AV81BarFasEst_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARACAANH", GXutil.ltrim( localUtil.ntoc( AV82BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFIO", GXutil.ltrim( localUtil.ntoc( AV106fio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106fio), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTINTEST", GXutil.ltrim( localUtil.ntoc( AV112tintest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV112tintest), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCNOENC", GXutil.ltrim( localUtil.ntoc( AV103CnoEnc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCNOENC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFECGEN", localUtil.dtoc( A159BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV84TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV86TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODANT", GXutil.rtrim( AV113FasCodAnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODANT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113FasCodAnt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDIBINT", GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRIOPLATENSE", GXutil.ltrim( localUtil.ntoc( AV109Rioplatense, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRIOPLATENSE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Rioplatense), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV102Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102Carvitin), "9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASEST_SELSJSON", AV35TFBarFasEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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

   public void renderHtmlCloseForm19V2( )
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
      return "Produccion.CargasProduccionporFase_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla BARFAS", "") ;
   }

   public void wb19V0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.cargasproduccionporfase_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, divUnnamedtable1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV83FasCod), GXutil.rtrim( localUtil.format( AV83FasCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'" + sPrefix + "',false,'" + sGXsfl_59_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV88FasDsc), GXutil.rtrim( localUtil.format( AV88FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnusuexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnusuexport_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUSUEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "CSV", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnusuexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnusuexportreport_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUSUEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "Marcar Todas", ""), bttBtnmarcartodas_Jsonclick, 7, httpContext.getMessage( "Marcar Todas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1119v1_client"+"'", TempTags, "", 2, "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "Des-Marcar Todas", ""), bttBtndesmarcartodas_Jsonclick, 7, httpContext.getMessage( "Des-Marcar Todas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1219v1_client"+"'", TempTags, "", 2, "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_41_19V2( true) ;
      }
      else
      {
         wb_table1_41_19V2( false) ;
      }
      return  ;
   }

   public void wb_table1_41_19V2e( boolean wbgen )
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
         startgridcontrol59( ) ;
      }
      if ( wbEnd == 59 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_59 = (int)(nGXsfl_59_idx-1) ;
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
         wb_table2_98_19V2( true) ;
      }
      else
      {
         wb_table2_98_19V2( false) ;
      }
      return  ;
   }

   public void wb_table2_98_19V2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0145"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0145"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_59_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0145"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV126Pgmname), GXutil.rtrim( localUtil.format( AV126Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
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
      if ( wbEnd == 59 )
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

   public void start19V2( )
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
            strup19V0( ) ;
         }
      }
   }

   public void ws19V2( )
   {
      start19V2( ) ;
      evt19V2( ) ;
   }

   public void evt19V2( )
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
                              strup19V0( ) ;
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
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1319V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1419V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1519V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1619V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1719V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSUEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUsuExport' */
                                 e1819V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSUEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUsuExportReport' */
                                 e1919V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2019V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19V0( ) ;
                           }
                           nGXsfl_59_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_592( ) ;
                           AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV118Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSel.getInternalname(), AV118Sel);
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONFUSOS");
                              GX_FocusControl = edtavHispronfusos_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV107HisProNFusos = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispronfusos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107HisProNFusos), 6, 0));
                           }
                           else
                           {
                              AV107HisProNFusos = (int)(localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispronfusos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107HisProNFusos), 6, 0));
                           }
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
                           AV121BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV121BarEncCli);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A154BarFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n154BarFasLin = false ;
                           AV32FasDscLast = httpContext.cgiGet( edtavFasdsclast_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsclast_Internalname, AV32FasDscLast);
                           A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
                           n1955BarFasSig = false ;
                           AV33FasdscNext = httpContext.cgiGet( edtavFasdscnext_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscnext_Internalname, AV33FasdscNext);
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV105FasDscAnt = httpContext.cgiGet( edtavFasdscant_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscant_Internalname, AV105FasDscAnt);
                           AV100Abierta = httpContext.cgiGet( edtavAbierta_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAbierta_Internalname, AV100Abierta);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vABIERTA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sPrefix+sGXsfl_59_idx, GXutil.rtrim( localUtil.format( AV100Abierta, ""))));
                           A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
                           AV104Estado = httpContext.cgiGet( edtavEstado_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstado_Internalname, AV104Estado);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
                              GX_FocusControl = edtavAlbrfen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV101AlbRFen = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrfen_Internalname, localUtil.format(AV101AlbRFen, "99/99/99"));
                           }
                           else
                           {
                              AV101AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAlbrfen_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrfen_Internalname, localUtil.format(AV101AlbRFen, "99/99/99"));
                           }
                           A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV34AlbRLoc = httpContext.cgiGet( edtavAlbrloc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrloc_Internalname, AV34AlbRLoc);
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
                                       e2119V2 ();
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
                                       e2219V2 ();
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
                                       e2319V2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e2419V2 ();
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
                                    strup19V0( ) ;
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
                     if ( nCmpId == 145 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0145") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0145", "", sEvt);
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

   public void we19V2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19V2( ) ;
         }
      }
   }

   public void pa19V2( )
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
            GX_FocusControl = edtavFasdsc_Internalname ;
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
      subsflControlProps_592( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         sendrow_592( ) ;
         nGXsfl_59_idx = ((subGrid_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV73Emprcod ,
                                 String AV83FasCod ,
                                 int AV74CliCod ,
                                 int AV75CliCod_to ,
                                 java.util.Date AV76BarFecgen ,
                                 java.util.Date AV77BarFecGen_to ,
                                 byte AV78BarSIt ,
                                 byte AV79Barsit_to ,
                                 byte AV80BarFasEst ,
                                 byte AV81BarFasEst_to ,
                                 short AV82BarAcaAnh ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV126Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV94TFMaqCodBis ,
                                 String AV95TFMaqCodBis_Sel ,
                                 GXSimpleCollection<Byte> AV36TFBarFasEst_Sels ,
                                 int AV37TFCliCod ,
                                 int AV38TFCliCod_To ,
                                 String AV39TFCliNom ,
                                 String AV40TFCliNom_Sel ,
                                 String AV43TFBarNHdr ,
                                 String AV44TFBarNHdr_Sel ,
                                 byte AV45TFBarSit ,
                                 byte AV46TFBarSit_To ,
                                 String AV47TFBarSer ,
                                 String AV48TFBarSer_Sel ,
                                 String AV49TFBarSerDsc ,
                                 String AV50TFBarSerDsc_Sel ,
                                 String AV51TFBarColNom ,
                                 String AV52TFBarColNom_Sel ,
                                 int AV53TFBarColNum ,
                                 int AV54TFBarColNum_To ,
                                 byte AV55TFBarTipCol ,
                                 byte AV56TFBarTipCol_To ,
                                 String AV57TFBarNomCli ,
                                 String AV58TFBarNomCli_Sel ,
                                 java.math.BigDecimal AV59TFBarKgm ,
                                 java.math.BigDecimal AV60TFBarKgm_To ,
                                 java.math.BigDecimal AV61TFBarMtr ,
                                 java.math.BigDecimal AV62TFBarMtr_To ,
                                 String AV63TFBarFasCod ,
                                 String AV64TFBarFasCod_Sel ,
                                 short AV65TFBarFasLin ,
                                 short AV66TFBarFasLin_To ,
                                 String AV67TFBarFasSig ,
                                 String AV68TFBarFasSig_Sel ,
                                 short AV69TFBarOrdLin ,
                                 short AV70TFBarOrdLin_To ,
                                 String AV110TFBarDibCli ,
                                 String AV111TFBarDibCli_Sel ,
                                 short AV71TFBarAcaAnh ,
                                 short AV72TFBarAcaAnh_To ,
                                 byte AV106fio ,
                                 byte AV112tintest ,
                                 byte AV103CnoEnc ,
                                 java.math.BigDecimal AV84TotBarKgm ,
                                 java.math.BigDecimal AV86TotBarMtr ,
                                 String AV100Abierta ,
                                 String AV113FasCodAnt ,
                                 byte AV109Rioplatense ,
                                 byte AV102Carvitin ,
                                 String A13878PedidoClie ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2219V2 ();
      GRID_nCurrentRecord = 0 ;
      rf19V2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CargasProduccionporFase_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV126Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\cargasproduccionporfase_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vABIERTA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV100Abierta, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vABIERTA", GXutil.rtrim( AV100Abierta));
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
      rf19V2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV127Pgmdesc = httpContext.getMessage( " Tabla BARFAS", "") ;
      AV126Pgmname = "Produccion.CargasProduccionporFase_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavHispronfusos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispronfusos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispronfusos_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdsclast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsclast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsclast_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscnext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscnext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscnext_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscant_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAbierta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAbierta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAbierta_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEstado_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrloc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf19V2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(59) ;
      /* Execute user event: Refresh */
      e2219V2 ();
      nGXsfl_59_idx = 1 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_592( ) ;
      bGXsfl_59_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_592( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV36TFBarFasEst_Sels ,
                                              AV95TFMaqCodBis_Sel ,
                                              AV94TFMaqCodBis ,
                                              Integer.valueOf(AV36TFBarFasEst_Sels.size()) ,
                                              Integer.valueOf(AV37TFCliCod) ,
                                              Integer.valueOf(AV38TFCliCod_To) ,
                                              AV40TFCliNom_Sel ,
                                              AV39TFCliNom ,
                                              AV44TFBarNHdr_Sel ,
                                              AV43TFBarNHdr ,
                                              Byte.valueOf(AV45TFBarSit) ,
                                              Byte.valueOf(AV46TFBarSit_To) ,
                                              AV48TFBarSer_Sel ,
                                              AV47TFBarSer ,
                                              AV50TFBarSerDsc_Sel ,
                                              AV49TFBarSerDsc ,
                                              AV52TFBarColNom_Sel ,
                                              AV51TFBarColNom ,
                                              Integer.valueOf(AV53TFBarColNum) ,
                                              Integer.valueOf(AV54TFBarColNum_To) ,
                                              Byte.valueOf(AV55TFBarTipCol) ,
                                              Byte.valueOf(AV56TFBarTipCol_To) ,
                                              AV58TFBarNomCli_Sel ,
                                              AV57TFBarNomCli ,
                                              AV59TFBarKgm ,
                                              AV60TFBarKgm_To ,
                                              AV61TFBarMtr ,
                                              AV62TFBarMtr_To ,
                                              Short.valueOf(AV69TFBarOrdLin) ,
                                              Short.valueOf(AV70TFBarOrdLin_To) ,
                                              AV111TFBarDibCli_Sel ,
                                              AV110TFBarDibCli ,
                                              Short.valueOf(AV71TFBarAcaAnh) ,
                                              Short.valueOf(AV72TFBarAcaAnh_To) ,
                                              A603MaqCodBis ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Byte.valueOf(A213BarSit) ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A218BarTipCol) ,
                                              A1234BarNomCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A1798BarDibCli ,
                                              Short.valueOf(A4466BarAcaAnh) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV15FilterFullText ,
                                              A13696BarNHdr ,
                                              A151BarFasCod ,
                                              Short.valueOf(A154BarFasLin) ,
                                              A1955BarFasSig ,
                                              AV64TFBarFasCod_Sel ,
                                              AV63TFBarFasCod ,
                                              Short.valueOf(AV65TFBarFasLin) ,
                                              Short.valueOf(AV66TFBarFasLin_To) ,
                                              AV68TFBarFasSig_Sel ,
                                              AV67TFBarFasSig ,
                                              Integer.valueOf(AV74CliCod) ,
                                              Integer.valueOf(AV75CliCod_to) ,
                                              A159BarFecGen ,
                                              AV76BarFecgen ,
                                              AV77BarFecGen_to ,
                                              Byte.valueOf(AV78BarSIt) ,
                                              Byte.valueOf(AV79Barsit_to) ,
                                              Byte.valueOf(AV80BarFasEst) ,
                                              Byte.valueOf(AV81BarFasEst_to) ,
                                              Short.valueOf(AV82BarAcaAnh) ,
                                              AV73Emprcod ,
                                              AV83FasCod ,
                                              A396EmprCod ,
                                              A457FasCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
         lV63TFBarFasCod = GXutil.padr( GXutil.rtrim( AV63TFBarFasCod), 8, "%") ;
         lV67TFBarFasSig = GXutil.padr( GXutil.rtrim( AV67TFBarFasSig), 8, "%") ;
         lV94TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV94TFMaqCodBis), 6, "%") ;
         lV39TFCliNom = GXutil.padr( GXutil.rtrim( AV39TFCliNom), 30, "%") ;
         lV43TFBarNHdr = GXutil.padr( GXutil.rtrim( AV43TFBarNHdr), 11, "%") ;
         lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
         lV49TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV49TFBarSerDsc), 26, "%") ;
         lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
         lV57TFBarNomCli = GXutil.padr( GXutil.rtrim( AV57TFBarNomCli), 13, "%") ;
         lV110TFBarDibCli = GXutil.padr( GXutil.rtrim( AV110TFBarDibCli), 16, "%") ;
         /* Using cursor H019V10 */
         pr_default.execute(0, new Object[] {AV73Emprcod, AV83FasCod, AV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, AV64TFBarFasCod_Sel, AV63TFBarFasCod, lV63TFBarFasCod, AV64TFBarFasCod_Sel, AV64TFBarFasCod_Sel, Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV66TFBarFasLin_To), Short.valueOf(AV66TFBarFasLin_To), AV68TFBarFasSig_Sel, AV67TFBarFasSig, lV67TFBarFasSig, AV68TFBarFasSig_Sel, AV68TFBarFasSig_Sel, Integer.valueOf(AV74CliCod), Integer.valueOf(AV75CliCod_to), AV76BarFecgen, AV77BarFecGen_to, Byte.valueOf(AV78BarSIt), Byte.valueOf(AV79Barsit_to), Byte.valueOf(AV80BarFasEst), Byte.valueOf(AV81BarFasEst_to), Short.valueOf(AV82BarAcaAnh), Short.valueOf(AV82BarAcaAnh), lV94TFMaqCodBis, AV95TFMaqCodBis_Sel, Integer.valueOf(AV37TFCliCod), Integer.valueOf(AV38TFCliCod_To), lV39TFCliNom, AV40TFCliNom_Sel, lV43TFBarNHdr, AV44TFBarNHdr_Sel, Byte.valueOf(AV45TFBarSit), Byte.valueOf(AV46TFBarSit_To), lV47TFBarSer, AV48TFBarSer_Sel, lV49TFBarSerDsc, AV50TFBarSerDsc_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, Integer.valueOf(AV53TFBarColNum), Integer.valueOf(AV54TFBarColNum_To), Byte.valueOf(AV55TFBarTipCol), Byte.valueOf(AV56TFBarTipCol_To), lV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, Short.valueOf(AV69TFBarOrdLin), Short.valueOf(AV70TFBarOrdLin_To), lV110TFBarDibCli, AV111TFBarDibCli_Sel, Short.valueOf(AV71TFBarAcaAnh), Short.valueOf(AV72TFBarAcaAnh_To), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_59_idx = 1 ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A159BarFecGen = H019V10_A159BarFecGen[0] ;
            A457FasCod = H019V10_A457FasCod[0] ;
            A1799BarDibInt = H019V10_A1799BarDibInt[0] ;
            A4466BarAcaAnh = H019V10_A4466BarAcaAnh[0] ;
            A1798BarDibCli = H019V10_A1798BarDibCli[0] ;
            A194BarOrdLin = H019V10_A194BarOrdLin[0] ;
            A1234BarNomCli = H019V10_A1234BarNomCli[0] ;
            A218BarTipCol = H019V10_A218BarTipCol[0] ;
            A136BarColNum = H019V10_A136BarColNum[0] ;
            A135BarColNom = H019V10_A135BarColNom[0] ;
            A1652BarSerDsc = H019V10_A1652BarSerDsc[0] ;
            A212BarSer = H019V10_A212BarSer[0] ;
            A213BarSit = H019V10_A213BarSit[0] ;
            A13696BarNHdr = H019V10_A13696BarNHdr[0] ;
            A279CliNom = H019V10_A279CliNom[0] ;
            A252CliCod = H019V10_A252CliCod[0] ;
            n252CliCod = H019V10_n252CliCod[0] ;
            A153BarFasEst = H019V10_A153BarFasEst[0] ;
            A603MaqCodBis = H019V10_A603MaqCodBis[0] ;
            A1955BarFasSig = H019V10_A1955BarFasSig[0] ;
            n1955BarFasSig = H019V10_n1955BarFasSig[0] ;
            A154BarFasLin = H019V10_A154BarFasLin[0] ;
            n154BarFasLin = H019V10_n154BarFasLin[0] ;
            A151BarFasCod = H019V10_A151BarFasCod[0] ;
            n151BarFasCod = H019V10_n151BarFasCod[0] ;
            A184BarMtr = H019V10_A184BarMtr[0] ;
            A166BarKgm = H019V10_A166BarKgm[0] ;
            A129BarCod = H019V10_A129BarCod[0] ;
            A132BarCodReo = H019V10_A132BarCodReo[0] ;
            A130BarCodPar = H019V10_A130BarCodPar[0] ;
            A143BarDisNum = H019V10_A143BarDisNum[0] ;
            A4812BarEncCli = H019V10_A4812BarEncCli[0] ;
            A396EmprCod = H019V10_A396EmprCod[0] ;
            A159BarFecGen = H019V10_A159BarFecGen[0] ;
            A1799BarDibInt = H019V10_A1799BarDibInt[0] ;
            A4466BarAcaAnh = H019V10_A4466BarAcaAnh[0] ;
            A1798BarDibCli = H019V10_A1798BarDibCli[0] ;
            A1234BarNomCli = H019V10_A1234BarNomCli[0] ;
            A218BarTipCol = H019V10_A218BarTipCol[0] ;
            A136BarColNum = H019V10_A136BarColNum[0] ;
            A135BarColNom = H019V10_A135BarColNom[0] ;
            A1652BarSerDsc = H019V10_A1652BarSerDsc[0] ;
            A212BarSer = H019V10_A212BarSer[0] ;
            A213BarSit = H019V10_A213BarSit[0] ;
            A13696BarNHdr = H019V10_A13696BarNHdr[0] ;
            A252CliCod = H019V10_A252CliCod[0] ;
            n252CliCod = H019V10_n252CliCod[0] ;
            A143BarDisNum = H019V10_A143BarDisNum[0] ;
            A4812BarEncCli = H019V10_A4812BarEncCli[0] ;
            A279CliNom = H019V10_A279CliNom[0] ;
            A1955BarFasSig = H019V10_A1955BarFasSig[0] ;
            n1955BarFasSig = H019V10_n1955BarFasSig[0] ;
            A154BarFasLin = H019V10_A154BarFasLin[0] ;
            n154BarFasLin = H019V10_n154BarFasLin[0] ;
            A151BarFasCod = H019V10_A151BarFasCod[0] ;
            n151BarFasCod = H019V10_n151BarFasCod[0] ;
            A184BarMtr = H019V10_A184BarMtr[0] ;
            A166BarKgm = H019V10_A166BarKgm[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A4812BarEncCli ;
            GXv_char4[0] = A143BarDisNum ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
            cargasproduccionporfase_wc_impl.this.A396EmprCod = GXv_char2[0] ;
            cargasproduccionporfase_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
            cargasproduccionporfase_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
            cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
            e2319V2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(59) ;
         wb19V0( ) ;
      }
      bGXsfl_59_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19V2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFIO", GXutil.ltrim( localUtil.ntoc( AV106fio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106fio), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTINTEST", GXutil.ltrim( localUtil.ntoc( AV112tintest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV112tintest), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCNOENC", GXutil.ltrim( localUtil.ntoc( AV103CnoEnc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCNOENC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103CnoEnc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV84TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV86TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vABIERTA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sPrefix+sGXsfl_59_idx, GXutil.rtrim( localUtil.format( AV100Abierta, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASCODANT", GXutil.rtrim( AV113FasCodAnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODANT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113FasCodAnt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRIOPLATENSE", GXutil.ltrim( localUtil.ntoc( AV109Rioplatense, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRIOPLATENSE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Rioplatense), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV102Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV36TFBarFasEst_Sels ,
                                           AV95TFMaqCodBis_Sel ,
                                           AV94TFMaqCodBis ,
                                           Integer.valueOf(AV36TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV37TFCliCod) ,
                                           Integer.valueOf(AV38TFCliCod_To) ,
                                           AV40TFCliNom_Sel ,
                                           AV39TFCliNom ,
                                           AV44TFBarNHdr_Sel ,
                                           AV43TFBarNHdr ,
                                           Byte.valueOf(AV45TFBarSit) ,
                                           Byte.valueOf(AV46TFBarSit_To) ,
                                           AV48TFBarSer_Sel ,
                                           AV47TFBarSer ,
                                           AV50TFBarSerDsc_Sel ,
                                           AV49TFBarSerDsc ,
                                           AV52TFBarColNom_Sel ,
                                           AV51TFBarColNom ,
                                           Integer.valueOf(AV53TFBarColNum) ,
                                           Integer.valueOf(AV54TFBarColNum_To) ,
                                           Byte.valueOf(AV55TFBarTipCol) ,
                                           Byte.valueOf(AV56TFBarTipCol_To) ,
                                           AV58TFBarNomCli_Sel ,
                                           AV57TFBarNomCli ,
                                           AV59TFBarKgm ,
                                           AV60TFBarKgm_To ,
                                           AV61TFBarMtr ,
                                           AV62TFBarMtr_To ,
                                           Short.valueOf(AV69TFBarOrdLin) ,
                                           Short.valueOf(AV70TFBarOrdLin_To) ,
                                           AV111TFBarDibCli_Sel ,
                                           AV110TFBarDibCli ,
                                           Short.valueOf(AV71TFBarAcaAnh) ,
                                           Short.valueOf(AV72TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV15FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV64TFBarFasCod_Sel ,
                                           AV63TFBarFasCod ,
                                           Short.valueOf(AV65TFBarFasLin) ,
                                           Short.valueOf(AV66TFBarFasLin_To) ,
                                           AV68TFBarFasSig_Sel ,
                                           AV67TFBarFasSig ,
                                           Integer.valueOf(AV74CliCod) ,
                                           Integer.valueOf(AV75CliCod_to) ,
                                           A159BarFecGen ,
                                           AV76BarFecgen ,
                                           AV77BarFecGen_to ,
                                           Byte.valueOf(AV78BarSIt) ,
                                           Byte.valueOf(AV79Barsit_to) ,
                                           Byte.valueOf(AV80BarFasEst) ,
                                           Byte.valueOf(AV81BarFasEst_to) ,
                                           Short.valueOf(AV82BarAcaAnh) ,
                                           AV73Emprcod ,
                                           AV83FasCod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV63TFBarFasCod = GXutil.padr( GXutil.rtrim( AV63TFBarFasCod), 8, "%") ;
      lV67TFBarFasSig = GXutil.padr( GXutil.rtrim( AV67TFBarFasSig), 8, "%") ;
      lV94TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV94TFMaqCodBis), 6, "%") ;
      lV39TFCliNom = GXutil.padr( GXutil.rtrim( AV39TFCliNom), 30, "%") ;
      lV43TFBarNHdr = GXutil.padr( GXutil.rtrim( AV43TFBarNHdr), 11, "%") ;
      lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
      lV49TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV49TFBarSerDsc), 26, "%") ;
      lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
      lV57TFBarNomCli = GXutil.padr( GXutil.rtrim( AV57TFBarNomCli), 13, "%") ;
      lV110TFBarDibCli = GXutil.padr( GXutil.rtrim( AV110TFBarDibCli), 16, "%") ;
      /* Using cursor H019V19 */
      pr_default.execute(1, new Object[] {AV73Emprcod, AV83FasCod, AV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, AV64TFBarFasCod_Sel, AV63TFBarFasCod, lV63TFBarFasCod, AV64TFBarFasCod_Sel, AV64TFBarFasCod_Sel, Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV66TFBarFasLin_To), Short.valueOf(AV66TFBarFasLin_To), AV68TFBarFasSig_Sel, AV67TFBarFasSig, lV67TFBarFasSig, AV68TFBarFasSig_Sel, AV68TFBarFasSig_Sel, Integer.valueOf(AV74CliCod), Integer.valueOf(AV75CliCod_to), AV76BarFecgen, AV77BarFecGen_to, Byte.valueOf(AV78BarSIt), Byte.valueOf(AV79Barsit_to), Byte.valueOf(AV80BarFasEst), Byte.valueOf(AV81BarFasEst_to), Short.valueOf(AV82BarAcaAnh), Short.valueOf(AV82BarAcaAnh), lV94TFMaqCodBis, AV95TFMaqCodBis_Sel, Integer.valueOf(AV37TFCliCod), Integer.valueOf(AV38TFCliCod_To), lV39TFCliNom, AV40TFCliNom_Sel, lV43TFBarNHdr, AV44TFBarNHdr_Sel, Byte.valueOf(AV45TFBarSit), Byte.valueOf(AV46TFBarSit_To), lV47TFBarSer, AV48TFBarSer_Sel, lV49TFBarSerDsc, AV50TFBarSerDsc_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, Integer.valueOf(AV53TFBarColNum), Integer.valueOf(AV54TFBarColNum_To), Byte.valueOf(AV55TFBarTipCol), Byte.valueOf(AV56TFBarTipCol_To), lV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, Short.valueOf(AV69TFBarOrdLin), Short.valueOf(AV70TFBarOrdLin_To), lV110TFBarDibCli, AV111TFBarDibCli_Sel, Short.valueOf(AV71TFBarAcaAnh), Short.valueOf(AV72TFBarAcaAnh_To)});
      GRID_nRecordCount = H019V19_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV73Emprcod, AV83FasCod, AV74CliCod, AV75CliCod_to, AV76BarFecgen, AV77BarFecGen_to, AV78BarSIt, AV79Barsit_to, AV80BarFasEst, AV81BarFasEst_to, AV82BarAcaAnh, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV126Pgmname, AV12OrderedBy, AV13OrderedDsc, AV94TFMaqCodBis, AV95TFMaqCodBis_Sel, AV36TFBarFasEst_Sels, AV37TFCliCod, AV38TFCliCod_To, AV39TFCliNom, AV40TFCliNom_Sel, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV45TFBarSit, AV46TFBarSit_To, AV47TFBarSer, AV48TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV51TFBarColNom, AV52TFBarColNom_Sel, AV53TFBarColNum, AV54TFBarColNum_To, AV55TFBarTipCol, AV56TFBarTipCol_To, AV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, AV63TFBarFasCod, AV64TFBarFasCod_Sel, AV65TFBarFasLin, AV66TFBarFasLin_To, AV67TFBarFasSig, AV68TFBarFasSig_Sel, AV69TFBarOrdLin, AV70TFBarOrdLin_To, AV110TFBarDibCli, AV111TFBarDibCli_Sel, AV71TFBarAcaAnh, AV72TFBarAcaAnh_To, AV106fio, AV112tintest, AV103CnoEnc, AV84TotBarKgm, AV86TotBarMtr, AV100Abierta, AV113FasCodAnt, AV109Rioplatense, AV102Carvitin, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV127Pgmdesc = httpContext.getMessage( " Tabla BARFAS", "") ;
      AV126Pgmname = "Produccion.CargasProduccionporFase_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126Pgmname", AV126Pgmname);
      Gx_err = (short)(0) ;
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavHispronfusos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispronfusos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispronfusos_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdsclast_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsclast_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsclast_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscnext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscnext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscnext_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscant_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAbierta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAbierta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAbierta_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEstado_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrfen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrfen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrloc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrloc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrloc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup19V0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2119V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV73Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV73Emprcod") ;
         wcpOAV83FasCod = httpContext.cgiGet( sPrefix+"wcpOAV83FasCod") ;
         wcpOAV74CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV75CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV76BarFecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76BarFecgen"), 0) ;
         wcpOAV77BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV77BarFecGen_to"), 0) ;
         wcpOAV78BarSIt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78BarSIt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV79Barsit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79Barsit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV80BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV81BarFasEst_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81BarFasEst_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV82BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82BarAcaAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13878PedidoClie = httpContext.cgiGet( sPrefix+"PEDIDOCLIE") ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
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
         AV88FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88FasDsc", AV88FasDsc);
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV85TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueBarKgm", AV85TotValueBarKgm);
         AV87TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueBarMtr", AV87TotValueBarMtr);
         AV126Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126Pgmname", AV126Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_59_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
         if ( nGXsfl_59_idx > 0 )
         {
            AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV118Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSel.getInternalname(), AV118Sel);
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONFUSOS");
               GX_FocusControl = edtavHispronfusos_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV107HisProNFusos = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispronfusos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107HisProNFusos), 6, 0));
            }
            else
            {
               AV107HisProNFusos = (int)(localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispronfusos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107HisProNFusos), 6, 0));
            }
            cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
            cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
            A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
            AV121BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV121BarEncCli);
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
            n151BarFasCod = false ;
            A154BarFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n154BarFasLin = false ;
            AV32FasDscLast = httpContext.cgiGet( edtavFasdsclast_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsclast_Internalname, AV32FasDscLast);
            A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
            n1955BarFasSig = false ;
            AV33FasdscNext = httpContext.cgiGet( edtavFasdscnext_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscnext_Internalname, AV33FasdscNext);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV105FasDscAnt = httpContext.cgiGet( edtavFasdscant_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscant_Internalname, AV105FasDscAnt);
            AV100Abierta = httpContext.cgiGet( edtavAbierta_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAbierta_Internalname, AV100Abierta);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vABIERTA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sPrefix+sGXsfl_59_idx, GXutil.rtrim( localUtil.format( AV100Abierta, ""))));
            A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
            AV104Estado = httpContext.cgiGet( edtavEstado_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstado_Internalname, AV104Estado);
            if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
               GX_FocusControl = edtavAlbrfen_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV101AlbRFen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrfen_Internalname, localUtil.format(AV101AlbRFen, "99/99/99"));
            }
            else
            {
               AV101AlbRFen = localUtil.ctod( httpContext.cgiGet( edtavAlbrfen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrfen_Internalname, localUtil.format(AV101AlbRFen, "99/99/99"));
            }
            A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34AlbRLoc = httpContext.cgiGet( edtavAlbrloc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrloc_Internalname, AV34AlbRLoc);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"CargasProduccionporFase_WC");
         AV126Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126Pgmname", AV126Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV126Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\cargasproduccionporfase_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2119V2 ();
      if (returnInSub) return;
   }

   public void e2119V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV115Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV115Station = GXt_char1 ;
      GXv_char5[0] = AV73Emprcod ;
      GXv_char4[0] = AV114EmprNom ;
      GXv_char3[0] = AV116UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char5, GXv_char4, GXv_char3) ;
      cargasproduccionporfase_wc_impl.this.AV73Emprcod = GXv_char5[0] ;
      cargasproduccionporfase_wc_impl.this.AV114EmprNom = GXv_char4[0] ;
      cargasproduccionporfase_wc_impl.this.AV116UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Emprcod", AV73Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV28DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV28DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV108NomInf = GXutil.trim( AV127Pgmdesc) ;
      GXt_int8 = AV109Rioplatense ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV73Emprcod, httpContext.getMessage( "RIOP00", ""), GXv_int9) ;
      cargasproduccionporfase_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV109Rioplatense = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Rioplatense", GXutil.str( AV109Rioplatense, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRIOPLATENSE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Rioplatense), "9")));
      GXt_int8 = AV102Carvitin ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV73Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int9) ;
      cargasproduccionporfase_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV102Carvitin = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Carvitin", GXutil.str( AV102Carvitin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102Carvitin), "9")));
      GXt_int8 = AV106fio ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV73Emprcod, httpContext.getMessage( "FIO", ""), GXv_int9) ;
      cargasproduccionporfase_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV106fio = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106fio", GXutil.str( AV106fio, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV106fio), "9")));
      GXt_char1 = AV88FasDsc ;
      GXv_char5[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( AV73Emprcod, AV83FasCod, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV88FasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88FasDsc", AV88FasDsc);
      GXt_int8 = AV103CnoEnc ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV73Emprcod, httpContext.getMessage( "CNOENC", ""), GXv_int9) ;
      cargasproduccionporfase_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV103CnoEnc = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103CnoEnc", GXutil.str( AV103CnoEnc, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCNOENC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV103CnoEnc), "9")));
      GXt_int8 = AV112tintest ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV73Emprcod, httpContext.getMessage( "TINEST", ""), GXv_int9) ;
      cargasproduccionporfase_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV112tintest = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112tintest", GXutil.str( AV112tintest, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTINTEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV112tintest), "9")));
   }

   public void e2219V2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV6WWPContext = GXv_SdtWWPContext10[0] ;
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
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      chkavSel.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSel.getInternalname(), "Visible", GXutil.ltrimstr( chkavSel.getVisible(), 5, 0), !bGXsfl_59_Refreshing);
      edtMaqCodBis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavHispronfusos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispronfusos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispronfusos_Visible), 5, 0), !bGXsfl_59_Refreshing);
      cmbBarFasEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbBarFasEst.getVisible(), 5, 0), !bGXsfl_59_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarFasLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLin_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdsclast_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsclast_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsclast_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarFasSig_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasSig_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasSig_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscnext_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscnext_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscnext_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavFasdscant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscant_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavAbierta_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAbierta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAbierta_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarDibCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDibCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavEstado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEstado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEstado_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrfen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrfen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrfen_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtBarAcaAnh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_59_Refreshing);
      edtavAlbrloc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbrloc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrloc_Visible), 5, 0), !bGXsfl_59_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'FIN BARRA PROGRESO' */
      S202 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92ProgressIndicator", AV92ProgressIndicator);
   }

   public void e1419V2( )
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
         AV29PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV29PageToGo) ;
      }
   }

   public void e1519V2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1619V2( )
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
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV94TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMaqCodBis", AV94TFMaqCodBis);
            AV95TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFMaqCodBis_Sel", AV95TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV35TFBarFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarFasEst_SelsJson", AV35TFBarFasEst_SelsJson);
            AV36TFBarFasEst_Sels.fromJSonString(GXutil.strReplace( AV35TFBarFasEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV39TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
            AV40TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV43TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
            AV44TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV45TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarSit), 2, 0));
            AV46TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV47TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer", AV47TFBarSer);
            AV48TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer_Sel", AV48TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV49TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
            AV50TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV51TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarColNom", AV51TFBarColNom);
            AV52TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCol") == 0 )
         {
            AV55TFBarTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarTipCol), 2, 0));
            AV56TFBarTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV57TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNomCli", AV57TFBarNomCli);
            AV58TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarNomCli_Sel", AV58TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV59TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarKgm", GXutil.ltrimstr( AV59TFBarKgm, 9, 2));
            AV60TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarKgm_To", GXutil.ltrimstr( AV60TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV61TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarMtr", GXutil.ltrimstr( AV61TFBarMtr, 9, 2));
            AV62TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarMtr_To", GXutil.ltrimstr( AV62TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV63TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarFasCod", AV63TFBarFasCod);
            AV64TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarFasCod_Sel", AV64TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasLin") == 0 )
         {
            AV65TFBarFasLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFBarFasLin), 4, 0));
            AV66TFBarFasLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFBarFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasSig") == 0 )
         {
            AV67TFBarFasSig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasSig", AV67TFBarFasSig);
            AV68TFBarFasSig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasSig_Sel", AV68TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV69TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarOrdLin), 4, 0));
            AV70TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarDibCli") == 0 )
         {
            AV110TFBarDibCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarDibCli", AV110TFBarDibCli);
            AV111TFBarDibCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarDibCli_Sel", AV111TFBarDibCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAcaAnh") == 0 )
         {
            AV71TFBarAcaAnh = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAcaAnh), 4, 0));
            AV72TFBarAcaAnh_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAcaAnh_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36TFBarFasEst_Sels", AV36TFBarFasEst_Sels);
   }

   private void e2319V2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV118Sel = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSel.getInternalname(), AV118Sel);
      AV89DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV89DetailWebComponent);
      GXt_int11 = AV107HisProNFusos ;
      GXv_int12[0] = GXt_int11 ;
      new app.produccion.pnfusos(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A194BarOrdLin, GXv_int12) ;
      cargasproduccionporfase_wc_impl.this.GXt_int11 = GXv_int12[0] ;
      AV107HisProNFusos = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispronfusos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107HisProNFusos), 6, 0));
      if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
      {
         AV121BarEncCli = A4812BarEncCli ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV121BarEncCli);
      }
      else
      {
         AV121BarEncCli = A143BarDisNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV121BarEncCli);
      }
      GXt_char1 = AV32FasDscLast ;
      GXv_char5[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV32FasDscLast = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsclast_Internalname, AV32FasDscLast);
      AV32FasDscLast = ((GXutil.strcmp("", A151BarFasCod)==0) ? " " : AV32FasDscLast) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsclast_Internalname, AV32FasDscLast);
      GXt_char1 = AV33FasdscNext ;
      GXv_char5[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV33FasdscNext = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscnext_Internalname, AV33FasdscNext);
      AV33FasdscNext = ((GXutil.strcmp("", A1955BarFasSig)==0) ? "" : AV33FasdscNext) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscnext_Internalname, AV33FasdscNext);
      GXv_char5[0] = A396EmprCod ;
      GXv_int12[0] = A129BarCod ;
      GXv_int9[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int13[0] = A194BarOrdLin ;
      GXv_char3[0] = AV100Abierta ;
      GXv_char2[0] = AV113FasCodAnt ;
      new app.pfinant(remoteHandle, context).execute( GXv_char5, GXv_int12, GXv_int9, GXv_char4, GXv_int13, GXv_char3, GXv_char2) ;
      cargasproduccionporfase_wc_impl.this.A396EmprCod = GXv_char5[0] ;
      cargasproduccionporfase_wc_impl.this.A129BarCod = GXv_int12[0] ;
      cargasproduccionporfase_wc_impl.this.A132BarCodReo = GXv_int9[0] ;
      cargasproduccionporfase_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
      cargasproduccionporfase_wc_impl.this.A194BarOrdLin = GXv_int13[0] ;
      cargasproduccionporfase_wc_impl.this.AV100Abierta = GXv_char3[0] ;
      cargasproduccionporfase_wc_impl.this.AV113FasCodAnt = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAbierta_Internalname, AV100Abierta);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vABIERTA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sPrefix+sGXsfl_59_idx, GXutil.rtrim( localUtil.format( AV100Abierta, ""))));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113FasCodAnt", AV113FasCodAnt);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASCODANT", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113FasCodAnt, ""))));
      if ( GXutil.strcmp(AV113FasCodAnt, " ") != 0 )
      {
         GXt_char1 = AV105FasDscAnt ;
         GXv_char5[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV113FasCodAnt, GXv_char5) ;
         cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV105FasDscAnt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscant_Internalname, AV105FasDscAnt);
      }
      GXt_char1 = AV104Estado ;
      GXv_char5[0] = GXt_char1 ;
      new app.produccion.estadodibujo(remoteHandle, context).execute( A396EmprCod, A1798BarDibCli, A252CliCod, A1799BarDibInt, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV104Estado = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstado_Internalname, AV104Estado);
      if ( ( AV109Rioplatense == 1 ) || ( AV102Carvitin == 1 ) )
      {
         GXt_date14 = AV101AlbRFen ;
         GXv_date15[0] = GXt_date14 ;
         new app.produccion.recuperafechaentregaalbr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_date15) ;
         cargasproduccionporfase_wc_impl.this.GXt_date14 = GXv_date15[0] ;
         AV101AlbRFen = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrfen_Internalname, localUtil.format(AV101AlbRFen, "99/99/99"));
      }
      if ( ( AV109Rioplatense == 1 ) || ( AV102Carvitin == 1 ) )
      {
         GXt_char1 = AV34AlbRLoc ;
         GXv_char5[0] = GXt_char1 ;
         new app.produccion.recuperalocalizacionalbr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char5) ;
         cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV34AlbRLoc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavAlbrloc_Internalname, AV34AlbRLoc);
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(59) ;
      }
      sendrow_592( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_59_Refreshing )
      {
         httpContext.doAjaxLoad(59, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1719V2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92ProgressIndicator", AV92ProgressIndicator);
   }

   public void e1319V2( )
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
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.CargasProduccionporFase_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV126Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.CargasProduccionporFase_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S212 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36TFBarFasEst_Sels", AV36TFBarFasEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92ProgressIndicator", AV92ProgressIndicator);
   }

   public void e1819V2( )
   {
      /* 'DoUsuExport' Routine */
      returnInSub = false ;
      AV117cBarCod.clear();
      AV120jsonBarCod = "" ;
      AV122Flag = httpContext.getMessage( "N", "") ;
      /* Start For Each Line */
      nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_59_fel_idx = 0 ;
      while ( nGXsfl_59_fel_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_59_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_59_fel_idx+1) ;
         sGXsfl_59_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_592( ) ;
         AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV118Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONFUSOS");
            GX_FocusControl = edtavHispronfusos_Internalname ;
            wbErr = true ;
            AV107HisProNFusos = 0 ;
         }
         else
         {
            AV107HisProNFusos = (int)(localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
         cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
         A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         AV121BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
         A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
         n151BarFasCod = false ;
         A154BarFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n154BarFasLin = false ;
         AV32FasDscLast = httpContext.cgiGet( edtavFasdsclast_Internalname) ;
         A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
         n1955BarFasSig = false ;
         AV33FasdscNext = httpContext.cgiGet( edtavFasdscnext_Internalname) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV105FasDscAnt = httpContext.cgiGet( edtavFasdscant_Internalname) ;
         AV100Abierta = httpContext.cgiGet( edtavAbierta_Internalname) ;
         A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
         AV104Estado = httpContext.cgiGet( edtavEstado_Internalname) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
            GX_FocusControl = edtavAlbrfen_Internalname ;
            wbErr = true ;
            AV101AlbRFen = GXutil.nullDate() ;
         }
         else
         {
            AV101AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAlbrfen_Internalname), 0)) ;
         }
         A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34AlbRLoc = httpContext.cgiGet( edtavAlbrloc_Internalname) ;
         if ( GXutil.strcmp(AV118Sel, "S") == 0 )
         {
            AV117cBarCod.add(GXutil.trim( GXutil.str( A129BarCod, 8, 0)), 0);
            AV122Flag = httpContext.getMessage( "S", "") ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_59_fel_idx == 0 )
      {
         nGXsfl_59_idx = 1 ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      nGXsfl_59_fel_idx = 1 ;
      AV93WebSession.setValue("FiltroProduccionporFase_FasCod", AV83FasCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S232 ();
      if (returnInSub) return;
      AV120jsonBarCod = GXutil.rtrim( AV117cBarCod.toJSonString(false)) ;
      if ( GXutil.strcmp(AV122Flag, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char5[0] = AV16ExcelFilename ;
         GXv_char4[0] = AV17ErrorMessage ;
         new app.produccion.cargasproduccionporfase_usuwcexport(remoteHandle, context).execute( AV120jsonBarCod, GXv_char5, GXv_char4) ;
         cargasproduccionporfase_wc_impl.this.AV16ExcelFilename = GXv_char5[0] ;
         cargasproduccionporfase_wc_impl.this.AV17ErrorMessage = GXv_char4[0] ;
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
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe seleccionar al menos un registro", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e1919V2( )
   {
      /* 'DoUsuExportReport' Routine */
      returnInSub = false ;
      AV117cBarCod.clear();
      AV120jsonBarCod = "" ;
      AV122Flag = httpContext.getMessage( "N", "") ;
      /* Start For Each Line */
      nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_59_fel_idx = 0 ;
      while ( nGXsfl_59_fel_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_59_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_59_fel_idx+1) ;
         sGXsfl_59_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_592( ) ;
         AV89DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV118Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISPRONFUSOS");
            GX_FocusControl = edtavHispronfusos_Internalname ;
            wbErr = true ;
            AV107HisProNFusos = 0 ;
         }
         else
         {
            AV107HisProNFusos = (int)(localUtil.ctol( httpContext.cgiGet( edtavHispronfusos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
         cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
         A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         AV121BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
         A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
         n151BarFasCod = false ;
         A154BarFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n154BarFasLin = false ;
         AV32FasDscLast = httpContext.cgiGet( edtavFasdsclast_Internalname) ;
         A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
         n1955BarFasSig = false ;
         AV33FasdscNext = httpContext.cgiGet( edtavFasdscnext_Internalname) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV105FasDscAnt = httpContext.cgiGet( edtavFasdscant_Internalname) ;
         AV100Abierta = httpContext.cgiGet( edtavAbierta_Internalname) ;
         A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
         AV104Estado = httpContext.cgiGet( edtavEstado_Internalname) ;
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbrfen_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFEN");
            GX_FocusControl = edtavAlbrfen_Internalname ;
            wbErr = true ;
            AV101AlbRFen = GXutil.nullDate() ;
         }
         else
         {
            AV101AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAlbrfen_Internalname), 0)) ;
         }
         A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34AlbRLoc = httpContext.cgiGet( edtavAlbrloc_Internalname) ;
         if ( GXutil.strcmp(AV118Sel, "S") == 0 )
         {
            AV117cBarCod.add(GXutil.trim( GXutil.str( A129BarCod, 8, 0)), 0);
            AV122Flag = httpContext.getMessage( "S", "") ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_59_fel_idx == 0 )
      {
         nGXsfl_59_idx = 1 ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      nGXsfl_59_fel_idx = 1 ;
      AV93WebSession.setValue("FiltroProduccionporFase_FasCod", AV83FasCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S232 ();
      if (returnInSub) return;
      AV120jsonBarCod = GXutil.rtrim( AV117cBarCod.toJSonString(false)) ;
      if ( GXutil.strcmp(AV122Flag, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.popup(formatLink("app.produccion.cargasproduccionporfase_usuwcexportreport", new String[] {GXutil.URLEncode(GXutil.rtrim(AV120jsonBarCod))}, new String[] {"jsonBarCod"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe seleccionar al menos un registro", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV92ProgressIndicator", AV92ProgressIndicator);
   }

   public void e2019V2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.produccion.cargasproduccionporfase_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Sel", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "MaqCodBis", "", "Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      if ( AV106fio == 1 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&HisProNFusos", "", "Nro.Fusos", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasEst", "", "Estado Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "CliNom", "", "Nombre.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&BarEncCli", "", "Disp.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarNHdr", "", "Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSit", "", "Sit.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSer", "", "Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSerDsc", "", "Descripción", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarColNum", "", "Número", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarTipCol", "", "TC", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarNomCli", "", "Color.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarKgm", "", "Kgs.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      if ( AV106fio == 0 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarMtr", "", "Mts.", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
         AV61TFBarMtr = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarMtr", GXutil.ltrimstr( AV61TFBarMtr, 9, 2));
         AV62TFBarMtr_To = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarMtr_To", GXutil.ltrimstr( AV62TFBarMtr_To, 9, 2));
      }
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasCod", "", "", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasLin", "", "#Ult.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&FasDscLast", "", "Ult.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasSig", "", "", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&FasdscNext", "", "Sig.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarOrdLin", "", "# Act", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&FasDscAnt", "", "Fas.Ant", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Abierta", "", "E", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      if ( ( AV112tintest == 1 ) || ( AV106fio == 1 ) )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarDibCli", "", "Dibujo", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
         AV110TFBarDibCli = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarDibCli", AV110TFBarDibCli);
         AV111TFBarDibCli_Sel = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarDibCli_Sel", AV111TFBarDibCli_Sel);
      }
      if ( AV106fio == 0 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Estado", "", "Estado", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      if ( AV106fio == 0 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&AlbRFen", "", "Fecha Entrada", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      if ( AV103CnoEnc == 1 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarAcaAnh", "", "Caderno", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
         AV71TFBarAcaAnh = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAcaAnh), 4, 0));
         AV72TFBarAcaAnh_To = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAcaAnh_To), 4, 0));
      }
      if ( AV106fio == 0 )
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&AlbRLoc", "", "Local", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector16[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
      GXt_char1 = AV19UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCColumnsSelector", GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S212( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV94TFMaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMaqCodBis", AV94TFMaqCodBis);
      AV95TFMaqCodBis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFMaqCodBis_Sel", AV95TFMaqCodBis_Sel);
      AV36TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV37TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
      AV38TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
      AV39TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
      AV40TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
      AV43TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
      AV44TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
      AV45TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarSit), 2, 0));
      AV46TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarSit_To), 2, 0));
      AV47TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer", AV47TFBarSer);
      AV48TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer_Sel", AV48TFBarSer_Sel);
      AV49TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
      AV50TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
      AV51TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarColNom", AV51TFBarColNom);
      AV52TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
      AV53TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
      AV54TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
      AV55TFBarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarTipCol), 2, 0));
      AV56TFBarTipCol_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol_To), 2, 0));
      AV57TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNomCli", AV57TFBarNomCli);
      AV58TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarNomCli_Sel", AV58TFBarNomCli_Sel);
      AV59TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarKgm", GXutil.ltrimstr( AV59TFBarKgm, 9, 2));
      AV60TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarKgm_To", GXutil.ltrimstr( AV60TFBarKgm_To, 9, 2));
      AV61TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarMtr", GXutil.ltrimstr( AV61TFBarMtr, 9, 2));
      AV62TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarMtr_To", GXutil.ltrimstr( AV62TFBarMtr_To, 9, 2));
      AV63TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarFasCod", AV63TFBarFasCod);
      AV64TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarFasCod_Sel", AV64TFBarFasCod_Sel);
      AV65TFBarFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFBarFasLin), 4, 0));
      AV66TFBarFasLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFBarFasLin_To), 4, 0));
      AV67TFBarFasSig = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasSig", AV67TFBarFasSig);
      AV68TFBarFasSig_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasSig_Sel", AV68TFBarFasSig_Sel);
      AV69TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarOrdLin), 4, 0));
      AV70TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarOrdLin_To), 4, 0));
      AV110TFBarDibCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarDibCli", AV110TFBarDibCli);
      AV111TFBarDibCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarDibCli_Sel", AV111TFBarDibCli_Sel);
      AV71TFBarAcaAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAcaAnh), 4, 0));
      AV72TFBarAcaAnh_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAcaAnh_To), 4, 0));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV126Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV126Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV126Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S222( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV94TFMaqCodBis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFMaqCodBis", AV94TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV95TFMaqCodBis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFMaqCodBis_Sel", AV95TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV35TFBarFasEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarFasEst_SelsJson", AV35TFBarFasEst_SelsJson);
            AV36TFBarFasEst_Sels.fromJSonString(AV35TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV37TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFCliCod), 6, 0));
            AV38TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV39TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFCliNom", AV39TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV40TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFCliNom_Sel", AV40TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV43TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV44TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV45TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFBarSit), 2, 0));
            AV46TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV47TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer", AV47TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV48TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer_Sel", AV48TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV49TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV50TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV51TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarColNom", AV51TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV52TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom_Sel", AV52TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarColNum), 6, 0));
            AV54TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV55TFBarTipCol = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarTipCol), 2, 0));
            AV56TFBarTipCol_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV57TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarNomCli", AV57TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV58TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarNomCli_Sel", AV58TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV59TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarKgm", GXutil.ltrimstr( AV59TFBarKgm, 9, 2));
            AV60TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarKgm_To", GXutil.ltrimstr( AV60TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV61TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarMtr", GXutil.ltrimstr( AV61TFBarMtr, 9, 2));
            AV62TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarMtr_To", GXutil.ltrimstr( AV62TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV63TFBarFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarFasCod", AV63TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV64TFBarFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarFasCod_Sel", AV64TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASLIN") == 0 )
         {
            AV65TFBarFasLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFBarFasLin), 4, 0));
            AV66TFBarFasLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFBarFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV67TFBarFasSig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarFasSig", AV67TFBarFasSig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV68TFBarFasSig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasSig_Sel", AV68TFBarFasSig_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV69TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFBarOrdLin), 4, 0));
            AV70TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI") == 0 )
         {
            AV110TFBarDibCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarDibCli", AV110TFBarDibCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI_SEL") == 0 )
         {
            AV111TFBarDibCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarDibCli_Sel", AV111TFBarDibCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV71TFBarAcaAnh = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFBarAcaAnh), 4, 0));
            AV72TFBarAcaAnh_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarAcaAnh_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarAcaAnh_To), 4, 0));
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0), AV95TFMaqCodBis_Sel, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, GXv_char4) ;
      cargasproduccionporfase_wc_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0), AV44TFBarNHdr_Sel, GXv_char3) ;
      cargasproduccionporfase_wc_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char22 = "" ;
      GXv_char2[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFBarSer_Sel)==0), AV48TFBarSer_Sel, GXv_char2) ;
      cargasproduccionporfase_wc_impl.this.GXt_char22 = GXv_char2[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, GXv_char24) ;
      cargasproduccionporfase_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, GXv_char26) ;
      cargasproduccionporfase_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0), AV58TFBarNomCli_Sel, GXv_char28) ;
      cargasproduccionporfase_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFBarFasCod_Sel)==0), AV64TFBarFasCod_Sel, GXv_char30) ;
      cargasproduccionporfase_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFBarFasSig_Sel)==0), AV68TFBarFasSig_Sel, GXv_char32) ;
      cargasproduccionporfase_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0), AV111TFBarDibCli_Sel, GXv_char34) ;
      cargasproduccionporfase_wc_impl.this.GXt_char33 = GXv_char34[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+((AV36TFBarFasEst_Sels.size()==0) ? "" : AV35TFBarFasEst_SelsJson)+"||"+GXt_char20+"||"+GXt_char21+"||"+GXt_char22+"|"+GXt_char23+"|"+GXt_char25+"|||"+GXt_char27+"|||"+GXt_char29+"|||"+GXt_char31+"|||||"+GXt_char33+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char33 = "" ;
      GXv_char34[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFMaqCodBis)==0), AV94TFMaqCodBis, GXv_char34) ;
      cargasproduccionporfase_wc_impl.this.GXt_char33 = GXv_char34[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFCliNom)==0), AV39TFCliNom, GXv_char32) ;
      cargasproduccionporfase_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFBarNHdr)==0), AV43TFBarNHdr, GXv_char30) ;
      cargasproduccionporfase_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarSer)==0), AV47TFBarSer, GXv_char28) ;
      cargasproduccionporfase_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarSerDsc)==0), AV49TFBarSerDsc, GXv_char26) ;
      cargasproduccionporfase_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarColNom)==0), AV51TFBarColNom, GXv_char24) ;
      cargasproduccionporfase_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char22 = "" ;
      GXv_char5[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarNomCli)==0), AV57TFBarNomCli, GXv_char5) ;
      cargasproduccionporfase_wc_impl.this.GXt_char22 = GXv_char5[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFBarFasCod)==0), AV63TFBarFasCod, GXv_char4) ;
      cargasproduccionporfase_wc_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFBarFasSig)==0), AV67TFBarFasSig, GXv_char3) ;
      cargasproduccionporfase_wc_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFBarDibCli)==0), AV110TFBarDibCli, GXv_char2) ;
      cargasproduccionporfase_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char33+"|||"+((0==AV37TFCliCod) ? "" : GXutil.str( AV37TFCliCod, 6, 0))+"|"+GXt_char31+"||"+GXt_char29+"|"+((0==AV45TFBarSit) ? "" : GXutil.str( AV45TFBarSit, 2, 0))+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+((0==AV53TFBarColNum) ? "" : GXutil.str( AV53TFBarColNum, 6, 0))+"|"+((0==AV55TFBarTipCol) ? "" : GXutil.str( AV55TFBarTipCol, 2, 0))+"|"+GXt_char22+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm)==0) ? "" : GXutil.str( AV59TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr)==0) ? "" : GXutil.str( AV61TFBarMtr, 9, 2))+"|"+GXt_char21+"|"+((0==AV65TFBarFasLin) ? "" : GXutil.str( AV65TFBarFasLin, 4, 0))+"||"+GXt_char20+"||"+((0==AV69TFBarOrdLin) ? "" : GXutil.str( AV69TFBarOrdLin, 4, 0))+"|||"+GXt_char1+"|||"+((0==AV71TFBarAcaAnh) ? "" : GXutil.str( AV71TFBarAcaAnh, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV38TFCliCod_To) ? "" : GXutil.str( AV38TFCliCod_To, 6, 0))+"||||"+((0==AV46TFBarSit_To) ? "" : GXutil.str( AV46TFBarSit_To, 2, 0))+"||||"+((0==AV54TFBarColNum_To) ? "" : GXutil.str( AV54TFBarColNum_To, 6, 0))+"|"+((0==AV56TFBarTipCol_To) ? "" : GXutil.str( AV56TFBarTipCol_To, 2, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm_To)==0) ? "" : GXutil.str( AV60TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarMtr_To)==0) ? "" : GXutil.str( AV62TFBarMtr_To, 9, 2))+"||"+((0==AV66TFBarFasLin_To) ? "" : GXutil.str( AV66TFBarFasLin_To, 4, 0))+"||||"+((0==AV70TFBarOrdLin_To) ? "" : GXutil.str( AV70TFBarOrdLin_To, 4, 0))+"||||||"+((0==AV72TFBarAcaAnh_To) ? "" : GXutil.str( AV72TFBarAcaAnh_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV126Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV94TFMaqCodBis)==0), (short)(0), AV94TFMaqCodBis, "", !(GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0), AV95TFMaqCodBis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASEST_SEL", "", !(AV36TFBarFasEst_Sels.size()==0), (short)(0), AV36TFBarFasEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFCLICOD", "", !((0==AV37TFCliCod)&&(0==AV38TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV38TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFCLINOM", "", !(GXutil.strcmp("", AV39TFCliNom)==0), (short)(0), AV39TFCliNom, "", !(GXutil.strcmp("", AV40TFCliNom_Sel)==0), AV40TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARNHDR", "", !(GXutil.strcmp("", AV43TFBarNHdr)==0), (short)(0), AV43TFBarNHdr, "", !(GXutil.strcmp("", AV44TFBarNHdr_Sel)==0), AV44TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARSIT", "", !((0==AV45TFBarSit)&&(0==AV46TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV46TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARSER", "", !(GXutil.strcmp("", AV47TFBarSer)==0), (short)(0), AV47TFBarSer, "", !(GXutil.strcmp("", AV48TFBarSer_Sel)==0), AV48TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARSERDSC", "", !(GXutil.strcmp("", AV49TFBarSerDsc)==0), (short)(0), AV49TFBarSerDsc, "", !(GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV51TFBarColNom)==0), (short)(0), AV51TFBarColNom, "", !(GXutil.strcmp("", AV52TFBarColNom_Sel)==0), AV52TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARCOLNUM", "", !((0==AV53TFBarColNum)&&(0==AV54TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV54TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARTIPCOL", "", !((0==AV55TFBarTipCol)&&(0==AV56TFBarTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFBarTipCol, 2, 0)), GXutil.trim( GXutil.str( AV56TFBarTipCol_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV57TFBarNomCli)==0), (short)(0), AV57TFBarNomCli, "", !(GXutil.strcmp("", AV58TFBarNomCli_Sel)==0), AV58TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV60TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV62TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASCOD", "", !(GXutil.strcmp("", AV63TFBarFasCod)==0), (short)(0), AV63TFBarFasCod, "", !(GXutil.strcmp("", AV64TFBarFasCod_Sel)==0), AV64TFBarFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASLIN", "", !((0==AV65TFBarFasLin)&&(0==AV66TFBarFasLin_To)), (short)(0), GXutil.trim( GXutil.str( AV65TFBarFasLin, 4, 0)), GXutil.trim( GXutil.str( AV66TFBarFasLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASSIG", "", !(GXutil.strcmp("", AV67TFBarFasSig)==0), (short)(0), AV67TFBarFasSig, "", !(GXutil.strcmp("", AV68TFBarFasSig_Sel)==0), AV68TFBarFasSig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARORDLIN", "", !((0==AV69TFBarOrdLin)&&(0==AV70TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV69TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV70TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARDIBCLI", "", !(GXutil.strcmp("", AV110TFBarDibCli)==0), (short)(0), AV110TFBarDibCli, "", !(GXutil.strcmp("", AV111TFBarDibCli_Sel)==0), AV111TFBarDibCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARACAANH", "", !((0==AV71TFBarAcaAnh)&&(0==AV72TFBarAcaAnh_To)), (short)(0), GXutil.trim( GXutil.str( AV71TFBarAcaAnh, 4, 0)), GXutil.trim( GXutil.str( AV72TFBarAcaAnh_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      if ( ! (GXutil.strcmp("", AV73Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV83FasCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FASCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV83FasCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV74CliCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV74CliCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV75CliCod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV75CliCod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecgen)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV76BarFecgen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecGen_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFECGEN_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV77BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV78BarSIt) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78BarSIt, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV79Barsit_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV79Barsit_to, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV80BarFasEst) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFASEST" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV80BarFasEst, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV81BarFasEst_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFASEST_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV81BarFasEst_to, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV82BarAcaAnh) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARACAANH" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV82BarAcaAnh, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV126Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARFAS" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divUnnamedtable1_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Visible), 5, 0), true);
   }

   public void S182( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV84TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotBarKgm", GXutil.ltrimstr( AV84TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotBarKgm, "ZZZZZ9.99")));
      AV86TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotBarMtr", GXutil.ltrimstr( AV86TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotBarMtr, "ZZZZZ9.99")));
   }

   public void S192( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV36TFBarFasEst_Sels ,
                                           AV95TFMaqCodBis_Sel ,
                                           AV94TFMaqCodBis ,
                                           Integer.valueOf(AV36TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV37TFCliCod) ,
                                           Integer.valueOf(AV38TFCliCod_To) ,
                                           AV40TFCliNom_Sel ,
                                           AV39TFCliNom ,
                                           AV44TFBarNHdr_Sel ,
                                           AV43TFBarNHdr ,
                                           Byte.valueOf(AV45TFBarSit) ,
                                           Byte.valueOf(AV46TFBarSit_To) ,
                                           AV48TFBarSer_Sel ,
                                           AV47TFBarSer ,
                                           AV50TFBarSerDsc_Sel ,
                                           AV49TFBarSerDsc ,
                                           AV52TFBarColNom_Sel ,
                                           AV51TFBarColNom ,
                                           Integer.valueOf(AV53TFBarColNum) ,
                                           Integer.valueOf(AV54TFBarColNum_To) ,
                                           Byte.valueOf(AV55TFBarTipCol) ,
                                           Byte.valueOf(AV56TFBarTipCol_To) ,
                                           AV58TFBarNomCli_Sel ,
                                           AV57TFBarNomCli ,
                                           AV59TFBarKgm ,
                                           AV60TFBarKgm_To ,
                                           AV61TFBarMtr ,
                                           AV62TFBarMtr_To ,
                                           Short.valueOf(AV69TFBarOrdLin) ,
                                           Short.valueOf(AV70TFBarOrdLin_To) ,
                                           AV111TFBarDibCli_Sel ,
                                           AV110TFBarDibCli ,
                                           Short.valueOf(AV71TFBarAcaAnh) ,
                                           Short.valueOf(AV72TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           AV15FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV64TFBarFasCod_Sel ,
                                           AV63TFBarFasCod ,
                                           Short.valueOf(AV65TFBarFasLin) ,
                                           Short.valueOf(AV66TFBarFasLin_To) ,
                                           AV68TFBarFasSig_Sel ,
                                           AV67TFBarFasSig ,
                                           Integer.valueOf(AV74CliCod) ,
                                           Integer.valueOf(AV75CliCod_to) ,
                                           A159BarFecGen ,
                                           AV76BarFecgen ,
                                           AV77BarFecGen_to ,
                                           Byte.valueOf(AV78BarSIt) ,
                                           Byte.valueOf(AV79Barsit_to) ,
                                           Byte.valueOf(AV80BarFasEst) ,
                                           Byte.valueOf(AV81BarFasEst_to) ,
                                           Short.valueOf(AV82BarAcaAnh) ,
                                           AV73Emprcod ,
                                           AV83FasCod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV15FilterFullText = GXutil.concat( GXutil.rtrim( AV15FilterFullText), "%", "") ;
      lV63TFBarFasCod = GXutil.padr( GXutil.rtrim( AV63TFBarFasCod), 8, "%") ;
      lV67TFBarFasSig = GXutil.padr( GXutil.rtrim( AV67TFBarFasSig), 8, "%") ;
      lV94TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV94TFMaqCodBis), 6, "%") ;
      lV39TFCliNom = GXutil.padr( GXutil.rtrim( AV39TFCliNom), 30, "%") ;
      lV43TFBarNHdr = GXutil.padr( GXutil.rtrim( AV43TFBarNHdr), 11, "%") ;
      lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
      lV49TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV49TFBarSerDsc), 26, "%") ;
      lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
      lV57TFBarNomCli = GXutil.padr( GXutil.rtrim( AV57TFBarNomCli), 13, "%") ;
      lV110TFBarDibCli = GXutil.padr( GXutil.rtrim( AV110TFBarDibCli), 16, "%") ;
      /* Using cursor H019V28 */
      pr_default.execute(2, new Object[] {AV73Emprcod, AV83FasCod, AV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, lV15FilterFullText, AV64TFBarFasCod_Sel, AV63TFBarFasCod, lV63TFBarFasCod, AV64TFBarFasCod_Sel, AV64TFBarFasCod_Sel, Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV65TFBarFasLin), Short.valueOf(AV66TFBarFasLin_To), Short.valueOf(AV66TFBarFasLin_To), AV68TFBarFasSig_Sel, AV67TFBarFasSig, lV67TFBarFasSig, AV68TFBarFasSig_Sel, AV68TFBarFasSig_Sel, Integer.valueOf(AV74CliCod), Integer.valueOf(AV75CliCod_to), AV76BarFecgen, AV77BarFecGen_to, Byte.valueOf(AV78BarSIt), Byte.valueOf(AV79Barsit_to), Byte.valueOf(AV80BarFasEst), Byte.valueOf(AV81BarFasEst_to), Short.valueOf(AV82BarAcaAnh), Short.valueOf(AV82BarAcaAnh), lV94TFMaqCodBis, AV95TFMaqCodBis_Sel, Integer.valueOf(AV37TFCliCod), Integer.valueOf(AV38TFCliCod_To), lV39TFCliNom, AV40TFCliNom_Sel, lV43TFBarNHdr, AV44TFBarNHdr_Sel, Byte.valueOf(AV45TFBarSit), Byte.valueOf(AV46TFBarSit_To), lV47TFBarSer, AV48TFBarSer_Sel, lV49TFBarSerDsc, AV50TFBarSerDsc_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, Integer.valueOf(AV53TFBarColNum), Integer.valueOf(AV54TFBarColNum_To), Byte.valueOf(AV55TFBarTipCol), Byte.valueOf(AV56TFBarTipCol_To), lV57TFBarNomCli, AV58TFBarNomCli_Sel, AV59TFBarKgm, AV60TFBarKgm_To, AV61TFBarMtr, AV62TFBarMtr_To, Short.valueOf(AV69TFBarOrdLin), Short.valueOf(AV70TFBarOrdLin_To), lV110TFBarDibCli, AV111TFBarDibCli_Sel, Short.valueOf(AV71TFBarAcaAnh), Short.valueOf(AV72TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A159BarFecGen = H019V28_A159BarFecGen[0] ;
         A457FasCod = H019V28_A457FasCod[0] ;
         A396EmprCod = H019V28_A396EmprCod[0] ;
         A4466BarAcaAnh = H019V28_A4466BarAcaAnh[0] ;
         A1798BarDibCli = H019V28_A1798BarDibCli[0] ;
         A194BarOrdLin = H019V28_A194BarOrdLin[0] ;
         A1234BarNomCli = H019V28_A1234BarNomCli[0] ;
         A218BarTipCol = H019V28_A218BarTipCol[0] ;
         A136BarColNum = H019V28_A136BarColNum[0] ;
         A135BarColNom = H019V28_A135BarColNom[0] ;
         A1652BarSerDsc = H019V28_A1652BarSerDsc[0] ;
         A212BarSer = H019V28_A212BarSer[0] ;
         A213BarSit = H019V28_A213BarSit[0] ;
         A13696BarNHdr = H019V28_A13696BarNHdr[0] ;
         A279CliNom = H019V28_A279CliNom[0] ;
         A252CliCod = H019V28_A252CliCod[0] ;
         n252CliCod = H019V28_n252CliCod[0] ;
         A153BarFasEst = H019V28_A153BarFasEst[0] ;
         A603MaqCodBis = H019V28_A603MaqCodBis[0] ;
         A1955BarFasSig = H019V28_A1955BarFasSig[0] ;
         n1955BarFasSig = H019V28_n1955BarFasSig[0] ;
         A154BarFasLin = H019V28_A154BarFasLin[0] ;
         n154BarFasLin = H019V28_n154BarFasLin[0] ;
         A151BarFasCod = H019V28_A151BarFasCod[0] ;
         n151BarFasCod = H019V28_n151BarFasCod[0] ;
         A184BarMtr = H019V28_A184BarMtr[0] ;
         A166BarKgm = H019V28_A166BarKgm[0] ;
         A129BarCod = H019V28_A129BarCod[0] ;
         A132BarCodReo = H019V28_A132BarCodReo[0] ;
         A130BarCodPar = H019V28_A130BarCodPar[0] ;
         A159BarFecGen = H019V28_A159BarFecGen[0] ;
         A4466BarAcaAnh = H019V28_A4466BarAcaAnh[0] ;
         A1798BarDibCli = H019V28_A1798BarDibCli[0] ;
         A1234BarNomCli = H019V28_A1234BarNomCli[0] ;
         A218BarTipCol = H019V28_A218BarTipCol[0] ;
         A136BarColNum = H019V28_A136BarColNum[0] ;
         A135BarColNom = H019V28_A135BarColNom[0] ;
         A1652BarSerDsc = H019V28_A1652BarSerDsc[0] ;
         A212BarSer = H019V28_A212BarSer[0] ;
         A213BarSit = H019V28_A213BarSit[0] ;
         A13696BarNHdr = H019V28_A13696BarNHdr[0] ;
         A252CliCod = H019V28_A252CliCod[0] ;
         n252CliCod = H019V28_n252CliCod[0] ;
         A279CliNom = H019V28_A279CliNom[0] ;
         A1955BarFasSig = H019V28_A1955BarFasSig[0] ;
         n1955BarFasSig = H019V28_n1955BarFasSig[0] ;
         A154BarFasLin = H019V28_A154BarFasLin[0] ;
         n154BarFasLin = H019V28_n154BarFasLin[0] ;
         A151BarFasCod = H019V28_A151BarFasCod[0] ;
         n151BarFasCod = H019V28_n151BarFasCod[0] ;
         A184BarMtr = H019V28_A184BarMtr[0] ;
         A166BarKgm = H019V28_A166BarKgm[0] ;
         AV84TotBarKgm = A166BarKgm.add(AV84TotBarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotBarKgm", GXutil.ltrimstr( AV84TotBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotBarKgm, "ZZZZZ9.99")));
         AV86TotBarMtr = A184BarMtr.add(AV86TotBarMtr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotBarMtr", GXutil.ltrimstr( AV86TotBarMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotBarMtr, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV85TotValueBarKgm = localUtil.format( AV84TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueBarKgm", AV85TotValueBarKgm);
      AV87TotValueBarMtr = localUtil.format( AV86TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueBarMtr", AV87TotValueBarMtr);
   }

   public void e2419V2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV93WebSession.setValue("FiltroProduccionporFase_FasCod", AV83FasCod);
      /*  Sending Event outputs  */
   }

   public void S202( )
   {
      /* 'FIN BARRA PROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV93WebSession.getValue("CargasProduccionporFaseWW"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV93WebSession.remove("CargasProduccionporFaseWW");
         AV92ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV92ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV123i = GXutil.sleep( 6) ;
         AV92ProgressIndicator.hide();
      }
   }

   public void S232( )
   {
      /* 'GUARDAR VARIABLES FILTROS EN SESSION' Routine */
      returnInSub = false ;
      AV93WebSession.setValue("EmprCod", AV73Emprcod);
      AV93WebSession.setValue("FasCod", AV83FasCod);
      AV93WebSession.setValue("CliCod", GXutil.str( AV74CliCod, 6, 0));
      AV93WebSession.setValue("CliCod_to", GXutil.str( AV75CliCod_to, 6, 0));
      AV93WebSession.setValue("BarFecGen", localUtil.dtoc( AV76BarFecgen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV93WebSession.setValue("BarFecGen_to", localUtil.dtoc( AV77BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV93WebSession.setValue("BarSit", GXutil.str( AV78BarSIt, 2, 0));
      AV93WebSession.setValue("BarSit_to", GXutil.str( AV79Barsit_to, 2, 0));
      AV93WebSession.setValue("BarFasEst", GXutil.str( AV80BarFasEst, 1, 0));
      AV93WebSession.setValue("BarFasEst_to", GXutil.str( AV81BarFasEst_to, 1, 0));
      AV93WebSession.setValue("BarAcaAnh", GXutil.str( AV82BarAcaAnh, 4, 0));
   }

   public void wb_table2_98_19V2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'" + sPrefix + "',false,'" + sGXsfl_59_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV85TotValueBarKgm, GXutil.rtrim( localUtil.format( AV85TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'" + sPrefix + "',false,'" + sGXsfl_59_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV87TotValueBarMtr, GXutil.rtrim( localUtil.format( AV87TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
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
         wb_table2_98_19V2e( true) ;
      }
      else
      {
         wb_table2_98_19V2e( false) ;
      }
   }

   public void wb_table1_41_19V2( boolean wbgen )
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
         wb_table3_46_19V2( true) ;
      }
      else
      {
         wb_table3_46_19V2( false) ;
      }
      return  ;
   }

   public void wb_table3_46_19V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_41_19V2e( true) ;
      }
      else
      {
         wb_table1_41_19V2e( false) ;
      }
   }

   public void wb_table3_46_19V2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'" + sGXsfl_59_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\CargasProduccionporFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_46_19V2e( true) ;
      }
      else
      {
         wb_table3_46_19V2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV73Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Emprcod", AV73Emprcod);
      AV83FasCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83FasCod", AV83FasCod);
      AV74CliCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CliCod), 6, 0));
      AV75CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75CliCod_to), 6, 0));
      AV76BarFecgen = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecgen", localUtil.format(AV76BarFecgen, "99/99/99"));
      AV77BarFecGen_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarFecGen_to", localUtil.format(AV77BarFecGen_to, "99/99/99"));
      AV78BarSIt = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarSIt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarSIt), 2, 0));
      AV79Barsit_to = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79Barsit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79Barsit_to), 2, 0));
      AV80BarFasEst = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFasEst", GXutil.str( AV80BarFasEst, 1, 0));
      AV81BarFasEst_to = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFasEst_to", GXutil.str( AV81BarFasEst_to, 1, 0));
      AV82BarAcaAnh = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAcaAnh), 4, 0));
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
      pa19V2( ) ;
      ws19V2( ) ;
      we19V2( ) ;
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
      sCtrlAV73Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV83FasCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV74CliCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV75CliCod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV76BarFecgen = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV77BarFecGen_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV78BarSIt = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV79Barsit_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV80BarFasEst = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV81BarFasEst_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV82BarAcaAnh = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19V2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\cargasproduccionporfase_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19V2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV73Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Emprcod", AV73Emprcod);
         AV83FasCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83FasCod", AV83FasCod);
         AV74CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CliCod), 6, 0));
         AV75CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75CliCod_to), 6, 0));
         AV76BarFecgen = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecgen", localUtil.format(AV76BarFecgen, "99/99/99"));
         AV77BarFecGen_to = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarFecGen_to", localUtil.format(AV77BarFecGen_to, "99/99/99"));
         AV78BarSIt = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarSIt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarSIt), 2, 0));
         AV79Barsit_to = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79Barsit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79Barsit_to), 2, 0));
         AV80BarFasEst = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFasEst", GXutil.str( AV80BarFasEst, 1, 0));
         AV81BarFasEst_to = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFasEst_to", GXutil.str( AV81BarFasEst_to, 1, 0));
         AV82BarAcaAnh = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAcaAnh), 4, 0));
      }
      wcpOAV73Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV73Emprcod") ;
      wcpOAV83FasCod = httpContext.cgiGet( sPrefix+"wcpOAV83FasCod") ;
      wcpOAV74CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV74CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV75CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV75CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV76BarFecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV76BarFecgen"), 0) ;
      wcpOAV77BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV77BarFecGen_to"), 0) ;
      wcpOAV78BarSIt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78BarSIt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV79Barsit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV79Barsit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV80BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV80BarFasEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV81BarFasEst_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV81BarFasEst_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV82BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV82BarAcaAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV73Emprcod, wcpOAV73Emprcod) != 0 ) || ( GXutil.strcmp(AV83FasCod, wcpOAV83FasCod) != 0 ) || ( AV74CliCod != wcpOAV74CliCod ) || ( AV75CliCod_to != wcpOAV75CliCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV76BarFecgen), GXutil.resetTime(wcpOAV76BarFecgen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV77BarFecGen_to), GXutil.resetTime(wcpOAV77BarFecGen_to)) ) || ( AV78BarSIt != wcpOAV78BarSIt ) || ( AV79Barsit_to != wcpOAV79Barsit_to ) || ( AV80BarFasEst != wcpOAV80BarFasEst ) || ( AV81BarFasEst_to != wcpOAV81BarFasEst_to ) || ( AV82BarAcaAnh != wcpOAV82BarAcaAnh ) ) )
      {
         setjustcreated();
      }
      wcpOAV73Emprcod = AV73Emprcod ;
      wcpOAV83FasCod = AV83FasCod ;
      wcpOAV74CliCod = AV74CliCod ;
      wcpOAV75CliCod_to = AV75CliCod_to ;
      wcpOAV76BarFecgen = AV76BarFecgen ;
      wcpOAV77BarFecGen_to = AV77BarFecGen_to ;
      wcpOAV78BarSIt = AV78BarSIt ;
      wcpOAV79Barsit_to = AV79Barsit_to ;
      wcpOAV80BarFasEst = AV80BarFasEst ;
      wcpOAV81BarFasEst_to = AV81BarFasEst_to ;
      wcpOAV82BarAcaAnh = AV82BarAcaAnh ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV73Emprcod = httpContext.cgiGet( sPrefix+"AV73Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV73Emprcod) > 0 )
      {
         AV73Emprcod = httpContext.cgiGet( sCtrlAV73Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73Emprcod", AV73Emprcod);
      }
      else
      {
         AV73Emprcod = httpContext.cgiGet( sPrefix+"AV73Emprcod_PARM") ;
      }
      sCtrlAV83FasCod = httpContext.cgiGet( sPrefix+"AV83FasCod_CTRL") ;
      if ( GXutil.len( sCtrlAV83FasCod) > 0 )
      {
         AV83FasCod = httpContext.cgiGet( sCtrlAV83FasCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83FasCod", AV83FasCod);
      }
      else
      {
         AV83FasCod = httpContext.cgiGet( sPrefix+"AV83FasCod_PARM") ;
      }
      sCtrlAV74CliCod = httpContext.cgiGet( sPrefix+"AV74CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV74CliCod) > 0 )
      {
         AV74CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV74CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CliCod), 6, 0));
      }
      else
      {
         AV74CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV74CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV75CliCod_to = httpContext.cgiGet( sPrefix+"AV75CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV75CliCod_to) > 0 )
      {
         AV75CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV75CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75CliCod_to), 6, 0));
      }
      else
      {
         AV75CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV75CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV76BarFecgen = httpContext.cgiGet( sPrefix+"AV76BarFecgen_CTRL") ;
      if ( GXutil.len( sCtrlAV76BarFecgen) > 0 )
      {
         AV76BarFecgen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV76BarFecgen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecgen", localUtil.format(AV76BarFecgen, "99/99/99"));
      }
      else
      {
         AV76BarFecgen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV76BarFecgen_PARM"), 0) ;
      }
      sCtrlAV77BarFecGen_to = httpContext.cgiGet( sPrefix+"AV77BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV77BarFecGen_to) > 0 )
      {
         AV77BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV77BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77BarFecGen_to", localUtil.format(AV77BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV77BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV77BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV78BarSIt = httpContext.cgiGet( sPrefix+"AV78BarSIt_CTRL") ;
      if ( GXutil.len( sCtrlAV78BarSIt) > 0 )
      {
         AV78BarSIt = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV78BarSIt), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78BarSIt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78BarSIt), 2, 0));
      }
      else
      {
         AV78BarSIt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV78BarSIt_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV79Barsit_to = httpContext.cgiGet( sPrefix+"AV79Barsit_to_CTRL") ;
      if ( GXutil.len( sCtrlAV79Barsit_to) > 0 )
      {
         AV79Barsit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV79Barsit_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79Barsit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79Barsit_to), 2, 0));
      }
      else
      {
         AV79Barsit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV79Barsit_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV80BarFasEst = httpContext.cgiGet( sPrefix+"AV80BarFasEst_CTRL") ;
      if ( GXutil.len( sCtrlAV80BarFasEst) > 0 )
      {
         AV80BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV80BarFasEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarFasEst", GXutil.str( AV80BarFasEst, 1, 0));
      }
      else
      {
         AV80BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV80BarFasEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV81BarFasEst_to = httpContext.cgiGet( sPrefix+"AV81BarFasEst_to_CTRL") ;
      if ( GXutil.len( sCtrlAV81BarFasEst_to) > 0 )
      {
         AV81BarFasEst_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV81BarFasEst_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarFasEst_to", GXutil.str( AV81BarFasEst_to, 1, 0));
      }
      else
      {
         AV81BarFasEst_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV81BarFasEst_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV82BarAcaAnh = httpContext.cgiGet( sPrefix+"AV82BarAcaAnh_CTRL") ;
      if ( GXutil.len( sCtrlAV82BarAcaAnh) > 0 )
      {
         AV82BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV82BarAcaAnh), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAcaAnh), 4, 0));
      }
      else
      {
         AV82BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV82BarAcaAnh_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa19V2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19V2( ) ;
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
      ws19V2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73Emprcod_PARM", GXutil.rtrim( AV73Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73Emprcod_CTRL", GXutil.rtrim( sCtrlAV73Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83FasCod_PARM", GXutil.rtrim( AV83FasCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83FasCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83FasCod_CTRL", GXutil.rtrim( sCtrlAV83FasCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV74CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV74CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV74CliCod_CTRL", GXutil.rtrim( sCtrlAV74CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV75CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV75CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV75CliCod_to_CTRL", GXutil.rtrim( sCtrlAV75CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76BarFecgen_PARM", localUtil.dtoc( AV76BarFecgen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV76BarFecgen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV76BarFecgen_CTRL", GXutil.rtrim( sCtrlAV76BarFecgen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77BarFecGen_to_PARM", localUtil.dtoc( AV77BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV77BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarSIt_PARM", GXutil.ltrim( localUtil.ntoc( AV78BarSIt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78BarSIt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78BarSIt_CTRL", GXutil.rtrim( sCtrlAV78BarSIt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79Barsit_to_PARM", GXutil.ltrim( localUtil.ntoc( AV79Barsit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV79Barsit_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV79Barsit_to_CTRL", GXutil.rtrim( sCtrlAV79Barsit_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80BarFasEst_PARM", GXutil.ltrim( localUtil.ntoc( AV80BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV80BarFasEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV80BarFasEst_CTRL", GXutil.rtrim( sCtrlAV80BarFasEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarFasEst_to_PARM", GXutil.ltrim( localUtil.ntoc( AV81BarFasEst_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV81BarFasEst_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV81BarFasEst_to_CTRL", GXutil.rtrim( sCtrlAV81BarFasEst_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82BarAcaAnh_PARM", GXutil.ltrim( localUtil.ntoc( AV82BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV82BarAcaAnh)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV82BarAcaAnh_CTRL", GXutil.rtrim( sCtrlAV82BarAcaAnh));
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
      we19V2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169976", true, true);
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
      httpContext.AddJavascriptSource("produccion/cargasproduccionporfase_wc.js", "?2026821169977", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_592( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_59_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_59_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_59_idx ;
      chkavSel.setInternalname( sPrefix+"vSEL_"+sGXsfl_59_idx );
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_59_idx ;
      edtavHispronfusos_Internalname = sPrefix+"vHISPRONFUSOS_"+sGXsfl_59_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_59_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_59_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_59_idx ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI_"+sGXsfl_59_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_59_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_59_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_59_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_59_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_59_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_59_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_59_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_59_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_59_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_59_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_59_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_59_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_59_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_59_idx ;
      edtBarFasLin_Internalname = sPrefix+"BARFASLIN_"+sGXsfl_59_idx ;
      edtavFasdsclast_Internalname = sPrefix+"vFASDSCLAST_"+sGXsfl_59_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_59_idx ;
      edtavFasdscnext_Internalname = sPrefix+"vFASDSCNEXT_"+sGXsfl_59_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_59_idx ;
      edtavFasdscant_Internalname = sPrefix+"vFASDSCANT_"+sGXsfl_59_idx ;
      edtavAbierta_Internalname = sPrefix+"vABIERTA_"+sGXsfl_59_idx ;
      edtBarDibCli_Internalname = sPrefix+"BARDIBCLI_"+sGXsfl_59_idx ;
      edtavEstado_Internalname = sPrefix+"vESTADO_"+sGXsfl_59_idx ;
      edtavAlbrfen_Internalname = sPrefix+"vALBRFEN_"+sGXsfl_59_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_59_idx ;
      edtavAlbrloc_Internalname = sPrefix+"vALBRLOC_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_592( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_59_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_59_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_59_fel_idx ;
      chkavSel.setInternalname( sPrefix+"vSEL_"+sGXsfl_59_fel_idx );
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_59_fel_idx ;
      edtavHispronfusos_Internalname = sPrefix+"vHISPRONFUSOS_"+sGXsfl_59_fel_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_59_fel_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_59_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_59_fel_idx ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI_"+sGXsfl_59_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_59_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_59_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_59_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_59_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_59_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_59_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_59_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_59_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_59_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_59_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_59_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_59_fel_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_59_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_59_fel_idx ;
      edtBarFasLin_Internalname = sPrefix+"BARFASLIN_"+sGXsfl_59_fel_idx ;
      edtavFasdsclast_Internalname = sPrefix+"vFASDSCLAST_"+sGXsfl_59_fel_idx ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG_"+sGXsfl_59_fel_idx ;
      edtavFasdscnext_Internalname = sPrefix+"vFASDSCNEXT_"+sGXsfl_59_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_59_fel_idx ;
      edtavFasdscant_Internalname = sPrefix+"vFASDSCANT_"+sGXsfl_59_fel_idx ;
      edtavAbierta_Internalname = sPrefix+"vABIERTA_"+sGXsfl_59_fel_idx ;
      edtBarDibCli_Internalname = sPrefix+"BARDIBCLI_"+sGXsfl_59_fel_idx ;
      edtavEstado_Internalname = sPrefix+"vESTADO_"+sGXsfl_59_fel_idx ;
      edtavAlbrfen_Internalname = sPrefix+"vALBRFEN_"+sGXsfl_59_fel_idx ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH_"+sGXsfl_59_fel_idx ;
      edtavAlbrloc_Internalname = sPrefix+"vALBRLOC_"+sGXsfl_59_fel_idx ;
   }

   public void sendrow_592( )
   {
      subsflControlProps_592( ) ;
      wb19V0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_59_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_59_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV89DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2519v2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSel.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSEL_" + sGXsfl_59_idx ;
         chkavSel.setName( GXCCtl );
         chkavSel.setWebtags( "" );
         chkavSel.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_59_Refreshing);
         chkavSel.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSel.getInternalname(),AV118Sel,"","",Integer.valueOf(chkavSel.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCodBis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHispronfusos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHispronfusos_Enabled!=0)&&(edtavHispronfusos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHispronfusos_Internalname,GXutil.ltrim( localUtil.ntoc( AV107HisProNFusos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHispronfusos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107HisProNFusos), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV107HisProNFusos), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHispronfusos_Enabled!=0)&&(edtavHispronfusos_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHispronfusos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHispronfusos_Visible),Integer.valueOf(edtavHispronfusos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BARFASEST_" + sGXsfl_59_idx ;
            cmbBarFasEst.setName( GXCCtl );
            cmbBarFasEst.setWebtags( "" );
            cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso (Fase Ini)", ""), (short)(0));
            cmbBarFasEst.addItem("2", httpContext.getMessage( "En Proceso  (Fase Fin)", ""), (short)(0));
            if ( cmbBarFasEst.getItemCount() > 0 )
            {
               A153BarFasEst = (byte)(GXutil.lval( cmbBarFasEst.getValidValue(GXutil.trim( GXutil.str( A153BarFasEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbBarFasEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEncCli_Internalname,GXutil.rtrim( A4812BarEncCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV121BarEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFasLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A154BarFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A154BarFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdsclast_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdsclast_Enabled!=0)&&(edtavFasdsclast_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsclast_Internalname,GXutil.rtrim( AV32FasDscLast),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdsclast_Enabled!=0)&&(edtavFasdsclast_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,85);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsclast_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdsclast_Visible),Integer.valueOf(edtavFasdsclast_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasSig_Internalname,GXutil.rtrim( A1955BarFasSig),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasSig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasSig_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdscnext_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdscnext_Enabled!=0)&&(edtavFasdscnext_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 87,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdscnext_Internalname,GXutil.rtrim( AV33FasdscNext),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdscnext_Enabled!=0)&&(edtavFasdscnext_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,87);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdscnext_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdscnext_Visible),Integer.valueOf(edtavFasdscnext_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdscant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdscant_Enabled!=0)&&(edtavFasdscant_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdscant_Internalname,GXutil.rtrim( AV105FasDscAnt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdscant_Enabled!=0)&&(edtavFasdscant_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdscant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdscant_Visible),Integer.valueOf(edtavFasdscant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAbierta_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAbierta_Enabled!=0)&&(edtavAbierta_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAbierta_Internalname,GXutil.rtrim( AV100Abierta),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAbierta_Enabled!=0)&&(edtavAbierta_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,90);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAbierta_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAbierta_Visible),Integer.valueOf(edtavAbierta_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDibCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDibCli_Internalname,GXutil.rtrim( A1798BarDibCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDibCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarDibCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEstado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEstado_Enabled!=0)&&(edtavEstado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 92,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEstado_Internalname,GXutil.rtrim( AV104Estado),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEstado_Enabled!=0)&&(edtavEstado_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,92);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEstado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEstado_Visible),Integer.valueOf(edtavEstado_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavAlbrfen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlbrfen_Enabled!=0)&&(edtavAlbrfen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrfen_Internalname,localUtil.format(AV101AlbRFen, "99/99/99"),localUtil.format( AV101AlbRFen, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavAlbrfen_Enabled!=0)&&(edtavAlbrfen_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrfen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlbrfen_Visible),Integer.valueOf(edtavAlbrfen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarAcaAnh_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavAlbrloc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlbrloc_Enabled!=0)&&(edtavAlbrloc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'"+sPrefix+"',false,'"+sGXsfl_59_idx+"',59)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlbrloc_Internalname,GXutil.rtrim( AV34AlbRLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAlbrloc_Enabled!=0)&&(edtavAlbrloc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,95);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavAlbrloc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavAlbrloc_Visible),Integer.valueOf(edtavAlbrloc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19V2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_59_idx = ((subGrid_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      /* End function sendrow_592 */
   }

   public void startgridcontrol59( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"59\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSel.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHispronfusos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nro.Fusos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre.Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp.Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color.Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "#Ult.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdsclast_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasSig_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdscnext_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sig.Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Act", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdscant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fas.Ant", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAbierta_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDibCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dibujo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEstado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlbrfen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Caderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavAlbrloc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Local", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118Sel));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSel.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV107HisProNFusos, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHispronfusos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHispronfusos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbBarFasEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4812BarEncCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV121BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A154BarFasLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV32FasDscLast));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsclast_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdsclast_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1955BarFasSig));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasSig_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV33FasdscNext));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdscnext_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdscnext_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV105FasDscAnt));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdscant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdscant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV100Abierta));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAbierta_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAbierta_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1798BarDibCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDibCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV104Estado));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEstado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEstado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV101AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrfen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlbrfen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34AlbRLoc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlbrloc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavAlbrloc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavFascod_Internalname = sPrefix+"vFASCOD" ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnusuexport_Internalname = sPrefix+"BTNUSUEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnusuexportreport_Internalname = sPrefix+"BTNUSUEXPORTREPORT" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      chkavSel.setInternalname( sPrefix+"vSEL" );
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtavHispronfusos_Internalname = sPrefix+"vHISPRONFUSOS" ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarFasLin_Internalname = sPrefix+"BARFASLIN" ;
      edtavFasdsclast_Internalname = sPrefix+"vFASDSCLAST" ;
      edtBarFasSig_Internalname = sPrefix+"BARFASSIG" ;
      edtavFasdscnext_Internalname = sPrefix+"vFASDSCNEXT" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtavFasdscant_Internalname = sPrefix+"vFASDSCANT" ;
      edtavAbierta_Internalname = sPrefix+"vABIERTA" ;
      edtBarDibCli_Internalname = sPrefix+"BARDIBCLI" ;
      edtavEstado_Internalname = sPrefix+"vESTADO" ;
      edtavAlbrfen_Internalname = sPrefix+"vALBRFEN" ;
      edtBarAcaAnh_Internalname = sPrefix+"BARACAANH" ;
      edtavAlbrloc_Internalname = sPrefix+"vALBRLOC" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavAlbrloc_Jsonclick = "" ;
      edtavAlbrloc_Enabled = 1 ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtavAlbrfen_Jsonclick = "" ;
      edtavAlbrfen_Enabled = 1 ;
      edtavEstado_Jsonclick = "" ;
      edtavEstado_Enabled = 1 ;
      edtBarDibCli_Jsonclick = "" ;
      edtavAbierta_Jsonclick = "" ;
      edtavAbierta_Enabled = 1 ;
      edtavFasdscant_Jsonclick = "" ;
      edtavFasdscant_Enabled = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtavFasdscnext_Jsonclick = "" ;
      edtavFasdscnext_Enabled = 1 ;
      edtBarFasSig_Jsonclick = "" ;
      edtavFasdsclast_Jsonclick = "" ;
      edtavFasdsclast_Enabled = 1 ;
      edtBarFasLin_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtBarEncCli_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbBarFasEst.setJsonclick( "" );
      edtavHispronfusos_Jsonclick = "" ;
      edtavHispronfusos_Enabled = 1 ;
      edtMaqCodBis_Jsonclick = "" ;
      chkavSel.setCaption( "" );
      chkavSel.setEnabled( 1 );
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtavAlbrloc_Visible = -1 ;
      edtBarAcaAnh_Visible = -1 ;
      edtavAlbrfen_Visible = -1 ;
      edtavEstado_Visible = -1 ;
      edtBarDibCli_Visible = -1 ;
      edtavAbierta_Visible = -1 ;
      edtavFasdscant_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtavFasdscnext_Visible = -1 ;
      edtBarFasSig_Visible = -1 ;
      edtavFasdsclast_Visible = -1 ;
      edtBarFasLin_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarTipCol_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      cmbBarFasEst.setVisible( -1 );
      edtavHispronfusos_Visible = -1 ;
      edtMaqCodBis_Visible = -1 ;
      chkavSel.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 1 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 0 ;
      divUnnamedtable1_Visible = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Produccion.CargasProduccionporFase_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||0:Pendiente,1:En Proceso (Fase Ini),2:En Proceso  (Fase Fin)||||||||||||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|||T||||||||||||||||||||||||||" ;
      Ddo_grid_Datalisttype = "|Dynamic||FixedValues||Dynamic||Dynamic||Dynamic|Dynamic|Dynamic|||Dynamic|||Dynamic|||Dynamic|||||Dynamic||||" ;
      Ddo_grid_Includedatalist = "|T||T||T||T||T|T|T|||T|||T|||T|||||T||||" ;
      Ddo_grid_Filterisrange = "||||T||||T||||T|T||T|T||T||||T||||||T|" ;
      Ddo_grid_Filtertype = "|Character|||Numeric|Character||Character|Numeric|Character|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character|Numeric||Character||Numeric|||Character|||Numeric|" ;
      Ddo_grid_Includefilter = "|T|||T|T||T|T|T|T|T|T|T|T|T|T|T|T||T||T|||T|||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T||T|T|T|||T|T|T|T|T|T|T||||||||T|||T|||T|" ;
      Ddo_grid_Columnssortvalues = "|2||3|4|5|||6|7|8|9|10|11|12||||||||13|||14|||15|" ;
      Ddo_grid_Columnids = "3:Sel|4:MaqCodBis|5:HisProNFusos|6:BarFasEst|7:CliCod|8:CliNom|10:BarEncCli|11:BarNHdr|14:BarSit|15:BarSer|16:BarSerDsc|17:BarColNom|18:BarColNum|19:BarTipCol|20:BarNomCli|21:BarKgm|22:BarMtr|23:BarFasCod|24:BarFasLin|25:FasDscLast|26:BarFasSig|27:FasdscNext|28:BarOrdLin|29:FasDscAnt|30:Abierta|31:BarDibCli|32:Estado|33:AlbRFen|34:BarAcaAnh|35:AlbRLoc" ;
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
      GXCCtl = "vSEL_" + sGXsfl_59_idx ;
      chkavSel.setName( GXCCtl );
      chkavSel.setWebtags( "" );
      chkavSel.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_59_Refreshing);
      chkavSel.setCheckedValue( "N" );
      GXCCtl = "BARFASEST_" + sGXsfl_59_idx ;
      cmbBarFasEst.setName( GXCCtl );
      cmbBarFasEst.setWebtags( "" );
      cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso (Fase Ini)", ""), (short)(0));
      cmbBarFasEst.addItem("2", httpContext.getMessage( "En Proceso  (Fase Fin)", ""), (short)(0));
      if ( cmbBarFasEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'cmbBarFasEst'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A154BarFasLin',fld:'BARFASLIN',pic:'ZZZ9'},{av:'A1955BarFasSig',fld:'BARFASSIG',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavHispronfusos_Visible',ctrl:'vHISPRONFUSOS',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasLin_Visible',ctrl:'BARFASLIN',prop:'Visible'},{av:'edtavFasdsclast_Visible',ctrl:'vFASDSCLAST',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscnext_Visible',ctrl:'vFASDSCNEXT',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtavFasdscant_Visible',ctrl:'vFASDSCANT',prop:'Visible'},{av:'edtavAbierta_Visible',ctrl:'vABIERTA',prop:'Visible'},{av:'edtBarDibCli_Visible',ctrl:'BARDIBCLI',prop:'Visible'},{av:'edtavEstado_Visible',ctrl:'vESTADO',prop:'Visible'},{av:'edtavAlbrfen_Visible',ctrl:'vALBRFEN',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavAlbrloc_Visible',ctrl:'vALBRLOC',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV87TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1419V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1519V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1619V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV35TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2319V2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A1955BarFasSig',fld:'BARFASSIG',pic:''},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV118Sel',fld:'vSEL',pic:''},{av:'AV89DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV107HisProNFusos',fld:'vHISPRONFUSOS',pic:'ZZZZZ9'},{av:'AV121BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV32FasDscLast',fld:'vFASDSCLAST',pic:''},{av:'AV33FasdscNext',fld:'vFASDSCNEXT',pic:''},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV105FasDscAnt',fld:'vFASDSCANT',pic:''},{av:'AV104Estado',fld:'vESTADO',pic:''},{av:'AV101AlbRFen',fld:'vALBRFEN',pic:''},{av:'AV34AlbRLoc',fld:'vALBRLOC',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1719V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'cmbBarFasEst'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A154BarFasLin',fld:'BARFASLIN',pic:'ZZZ9'},{av:'A1955BarFasSig',fld:'BARFASSIG',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavHispronfusos_Visible',ctrl:'vHISPRONFUSOS',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasLin_Visible',ctrl:'BARFASLIN',prop:'Visible'},{av:'edtavFasdsclast_Visible',ctrl:'vFASDSCLAST',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscnext_Visible',ctrl:'vFASDSCNEXT',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtavFasdscant_Visible',ctrl:'vFASDSCANT',prop:'Visible'},{av:'edtavAbierta_Visible',ctrl:'vABIERTA',prop:'Visible'},{av:'edtBarDibCli_Visible',ctrl:'BARDIBCLI',prop:'Visible'},{av:'edtavEstado_Visible',ctrl:'vESTADO',prop:'Visible'},{av:'edtavAlbrfen_Visible',ctrl:'vALBRFEN',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavAlbrloc_Visible',ctrl:'vALBRLOC',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV87TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1319V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',pic:'',hsh:true},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'cmbBarFasEst'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A154BarFasLin',fld:'BARFASLIN',pic:'ZZZ9'},{av:'A1955BarFasSig',fld:'BARFASSIG',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV35TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavHispronfusos_Visible',ctrl:'vHISPRONFUSOS',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasLin_Visible',ctrl:'BARFASLIN',prop:'Visible'},{av:'edtavFasdsclast_Visible',ctrl:'vFASDSCLAST',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscnext_Visible',ctrl:'vFASDSCNEXT',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtavFasdscant_Visible',ctrl:'vFASDSCANT',prop:'Visible'},{av:'edtavAbierta_Visible',ctrl:'vABIERTA',prop:'Visible'},{av:'edtBarDibCli_Visible',ctrl:'BARDIBCLI',prop:'Visible'},{av:'edtavEstado_Visible',ctrl:'vESTADO',prop:'Visible'},{av:'edtavAlbrfen_Visible',ctrl:'vALBRFEN',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavAlbrloc_Visible',ctrl:'vALBRLOC',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV87TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("'DOUSUEXPORT'","{handler:'e1819V2',iparms:[{av:'AV118Sel',fld:'vSEL',grid:59,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_59',ctrl:'GRID',grid:59,prop:'GridRC',grid:59},{av:'A129BarCod',fld:'BARCOD',grid:59,pic:'ZZZZZZZ9'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'}]");
      setEventMetadata("'DOUSUEXPORT'",",oparms:[]}");
      setEventMetadata("'DOUSUEXPORTREPORT'","{handler:'e1919V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV74CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV76BarFecgen',fld:'vBARFECGEN',pic:''},{av:'AV77BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV78BarSIt',fld:'vBARSIT',pic:'Z9'},{av:'AV79Barsit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV80BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV81BarFasEst_to',fld:'vBARFASEST_TO',pic:'9'},{av:'AV82BarAcaAnh',fld:'vBARACAANH',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV95TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV36TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV37TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV38TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV39TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV45TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV46TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV47TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV48TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV51TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV52TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV53TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV56TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV57TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV59TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV60TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV63TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV64TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV65TFBarFasLin',fld:'vTFBARFASLIN',pic:'ZZZ9'},{av:'AV66TFBarFasLin_To',fld:'vTFBARFASLIN_TO',pic:'ZZZ9'},{av:'AV67TFBarFasSig',fld:'vTFBARFASSIG',pic:''},{av:'AV68TFBarFasSig_Sel',fld:'vTFBARFASSIG_SEL',pic:''},{av:'AV69TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV70TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV106fio',fld:'vFIO',pic:'9',hsh:true},{av:'AV112tintest',fld:'vTINTEST',pic:'9',hsh:true},{av:'AV103CnoEnc',fld:'vCNOENC',pic:'9',hsh:true},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV100Abierta',fld:'vABIERTA',grid:59,pic:'',hsh:true},{av:'nRC_GXsfl_59',ctrl:'GRID',grid:59,prop:'GridRC',grid:59},{av:'AV113FasCodAnt',fld:'vFASCODANT',pic:'',hsh:true},{av:'AV109Rioplatense',fld:'vRIOPLATENSE',pic:'9',hsh:true},{av:'AV102Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'AV118Sel',fld:'vSEL',grid:59,pic:''},{av:'A129BarCod',fld:'BARCOD',grid:59,pic:'ZZZZZZZ9'},{av:'A603MaqCodBis',fld:'MAQCODBIS',grid:59,pic:''},{av:'A153BarFasEst',fld:'BARFASEST',grid:59,pic:'9'},{av:'A252CliCod',fld:'CLICOD',grid:59,pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',grid:59,pic:''},{av:'A13696BarNHdr',fld:'BARNHDR',grid:59,pic:''},{av:'A213BarSit',fld:'BARSIT',grid:59,pic:'Z9'},{av:'A212BarSer',fld:'BARSER',grid:59,pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',grid:59,pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',grid:59,pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',grid:59,pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',grid:59,pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',grid:59,pic:''},{av:'A166BarKgm',fld:'BARKGM',grid:59,pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',grid:59,pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',grid:59,pic:''},{av:'A154BarFasLin',fld:'BARFASLIN',grid:59,pic:'ZZZ9'},{av:'A1955BarFasSig',fld:'BARFASSIG',grid:59,pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',grid:59,pic:'ZZZ9'},{av:'A1798BarDibCli',fld:'BARDIBCLI',grid:59,pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',grid:59,pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',grid:59,pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''}]");
      setEventMetadata("'DOUSUEXPORTREPORT'",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtavHispronfusos_Visible',ctrl:'vHISPRONFUSOS',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFasLin_Visible',ctrl:'BARFASLIN',prop:'Visible'},{av:'edtavFasdsclast_Visible',ctrl:'vFASDSCLAST',prop:'Visible'},{av:'edtBarFasSig_Visible',ctrl:'BARFASSIG',prop:'Visible'},{av:'edtavFasdscnext_Visible',ctrl:'vFASDSCNEXT',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtavFasdscant_Visible',ctrl:'vFASDSCANT',prop:'Visible'},{av:'edtavAbierta_Visible',ctrl:'vABIERTA',prop:'Visible'},{av:'edtBarDibCli_Visible',ctrl:'BARDIBCLI',prop:'Visible'},{av:'edtavEstado_Visible',ctrl:'vESTADO',prop:'Visible'},{av:'edtavAlbrfen_Visible',ctrl:'vALBRFEN',prop:'Visible'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtavAlbrloc_Visible',ctrl:'vALBRLOC',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV62TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV110TFBarDibCli',fld:'vTFBARDIBCLI',pic:''},{av:'AV111TFBarDibCli_Sel',fld:'vTFBARDIBCLI_SEL',pic:''},{av:'AV71TFBarAcaAnh',fld:'vTFBARACAANH',pic:'ZZZ9'},{av:'AV72TFBarAcaAnh_To',fld:'vTFBARACAANH_TO',pic:'ZZZ9'},{av:'AV84TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV85TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV87TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e1119V1',iparms:[]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV118Sel',fld:'vSEL',pic:''}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e1219V1',iparms:[]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV118Sel',fld:'vSEL',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2019V2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2519V2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2419V2',iparms:[{av:'AV83FasCod',fld:'vFASCOD',pic:'@!'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("VALIDV_FASCOD","{handler:'validv_Fascod',iparms:[]");
      setEventMetadata("VALIDV_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_SEL","{handler:'validv_Sel',iparms:[]");
      setEventMetadata("VALIDV_SEL",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARENCCLI","{handler:'valid_Barenccli',iparms:[]");
      setEventMetadata("VALID_BARENCCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Albrloc',iparms:[]");
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
      wcpOAV73Emprcod = "" ;
      wcpOAV83FasCod = "" ;
      wcpOAV76BarFecgen = GXutil.nullDate() ;
      wcpOAV77BarFecGen_to = GXutil.nullDate() ;
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
      AV73Emprcod = "" ;
      AV83FasCod = "" ;
      AV76BarFecgen = GXutil.nullDate() ;
      AV77BarFecGen_to = GXutil.nullDate() ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV126Pgmname = "" ;
      AV94TFMaqCodBis = "" ;
      AV95TFMaqCodBis_Sel = "" ;
      AV36TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV39TFCliNom = "" ;
      AV40TFCliNom_Sel = "" ;
      AV43TFBarNHdr = "" ;
      AV44TFBarNHdr_Sel = "" ;
      AV47TFBarSer = "" ;
      AV48TFBarSer_Sel = "" ;
      AV49TFBarSerDsc = "" ;
      AV50TFBarSerDsc_Sel = "" ;
      AV51TFBarColNom = "" ;
      AV52TFBarColNom_Sel = "" ;
      AV57TFBarNomCli = "" ;
      AV58TFBarNomCli_Sel = "" ;
      AV59TFBarKgm = DecimalUtil.ZERO ;
      AV60TFBarKgm_To = DecimalUtil.ZERO ;
      AV61TFBarMtr = DecimalUtil.ZERO ;
      AV62TFBarMtr_To = DecimalUtil.ZERO ;
      AV63TFBarFasCod = "" ;
      AV64TFBarFasCod_Sel = "" ;
      AV67TFBarFasSig = "" ;
      AV68TFBarFasSig_Sel = "" ;
      AV110TFBarDibCli = "" ;
      AV111TFBarDibCli_Sel = "" ;
      AV84TotBarKgm = DecimalUtil.ZERO ;
      AV86TotBarMtr = DecimalUtil.ZERO ;
      AV100Abierta = "" ;
      AV113FasCodAnt = "" ;
      A13878PedidoClie = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A457FasCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35TFBarFasEst_SelsJson = "" ;
      A143BarDisNum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      AV88FasDsc = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtnusuexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnusuexportreport_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV89DetailWebComponent = "" ;
      A396EmprCod = "" ;
      AV118Sel = "" ;
      A603MaqCodBis = "" ;
      A279CliNom = "" ;
      A4812BarEncCli = "" ;
      AV121BarEncCli = "" ;
      A13696BarNHdr = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      AV32FasDscLast = "" ;
      A1955BarFasSig = "" ;
      AV33FasdscNext = "" ;
      AV105FasDscAnt = "" ;
      A1798BarDibCli = "" ;
      AV104Estado = "" ;
      AV101AlbRFen = GXutil.nullDate() ;
      AV34AlbRLoc = "" ;
      AV127Pgmdesc = "" ;
      scmdbuf = "" ;
      lV15FilterFullText = "" ;
      lV63TFBarFasCod = "" ;
      lV67TFBarFasSig = "" ;
      lV94TFMaqCodBis = "" ;
      lV39TFCliNom = "" ;
      lV43TFBarNHdr = "" ;
      lV47TFBarSer = "" ;
      lV49TFBarSerDsc = "" ;
      lV51TFBarColNom = "" ;
      lV57TFBarNomCli = "" ;
      lV110TFBarDibCli = "" ;
      H019V10_A758ProCod = new String[] {""} ;
      H019V10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H019V10_A457FasCod = new String[] {""} ;
      H019V10_A1799BarDibInt = new int[1] ;
      H019V10_A4466BarAcaAnh = new short[1] ;
      H019V10_A1798BarDibCli = new String[] {""} ;
      H019V10_A194BarOrdLin = new short[1] ;
      H019V10_A1234BarNomCli = new String[] {""} ;
      H019V10_A218BarTipCol = new byte[1] ;
      H019V10_A136BarColNum = new int[1] ;
      H019V10_A135BarColNom = new String[] {""} ;
      H019V10_A1652BarSerDsc = new String[] {""} ;
      H019V10_A212BarSer = new String[] {""} ;
      H019V10_A213BarSit = new byte[1] ;
      H019V10_A13696BarNHdr = new String[] {""} ;
      H019V10_A279CliNom = new String[] {""} ;
      H019V10_A252CliCod = new int[1] ;
      H019V10_n252CliCod = new boolean[] {false} ;
      H019V10_A153BarFasEst = new byte[1] ;
      H019V10_A603MaqCodBis = new String[] {""} ;
      H019V10_A1955BarFasSig = new String[] {""} ;
      H019V10_n1955BarFasSig = new boolean[] {false} ;
      H019V10_A154BarFasLin = new short[1] ;
      H019V10_n154BarFasLin = new boolean[] {false} ;
      H019V10_A151BarFasCod = new String[] {""} ;
      H019V10_n151BarFasCod = new boolean[] {false} ;
      H019V10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019V10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019V10_A129BarCod = new int[1] ;
      H019V10_A132BarCodReo = new byte[1] ;
      H019V10_A130BarCodPar = new String[] {""} ;
      H019V10_A143BarDisNum = new String[] {""} ;
      H019V10_A4812BarEncCli = new String[] {""} ;
      H019V10_A396EmprCod = new String[] {""} ;
      H019V19_AGRID_nRecordCount = new long[1] ;
      AV85TotValueBarKgm = "" ;
      AV87TotValueBarMtr = "" ;
      hsh = "" ;
      AV115Station = "" ;
      AV114EmprNom = "" ;
      AV116UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV108NomInf = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV92ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_int12 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXt_date14 = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV117cBarCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV120jsonBarCod = "" ;
      AV122Flag = "" ;
      AV93WebSession = httpContext.getWebSession();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char33 = "" ;
      GXv_char34 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState35 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H019V28_A758ProCod = new String[] {""} ;
      H019V28_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H019V28_A457FasCod = new String[] {""} ;
      H019V28_A396EmprCod = new String[] {""} ;
      H019V28_A4466BarAcaAnh = new short[1] ;
      H019V28_A1798BarDibCli = new String[] {""} ;
      H019V28_A194BarOrdLin = new short[1] ;
      H019V28_A1234BarNomCli = new String[] {""} ;
      H019V28_A218BarTipCol = new byte[1] ;
      H019V28_A136BarColNum = new int[1] ;
      H019V28_A135BarColNom = new String[] {""} ;
      H019V28_A1652BarSerDsc = new String[] {""} ;
      H019V28_A212BarSer = new String[] {""} ;
      H019V28_A213BarSit = new byte[1] ;
      H019V28_A13696BarNHdr = new String[] {""} ;
      H019V28_A279CliNom = new String[] {""} ;
      H019V28_A252CliCod = new int[1] ;
      H019V28_n252CliCod = new boolean[] {false} ;
      H019V28_A153BarFasEst = new byte[1] ;
      H019V28_A603MaqCodBis = new String[] {""} ;
      H019V28_A1955BarFasSig = new String[] {""} ;
      H019V28_n1955BarFasSig = new boolean[] {false} ;
      H019V28_A154BarFasLin = new short[1] ;
      H019V28_n154BarFasLin = new boolean[] {false} ;
      H019V28_A151BarFasCod = new String[] {""} ;
      H019V28_n151BarFasCod = new boolean[] {false} ;
      H019V28_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019V28_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H019V28_A129BarCod = new int[1] ;
      H019V28_A132BarCodReo = new byte[1] ;
      H019V28_A130BarCodPar = new String[] {""} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV73Emprcod = "" ;
      sCtrlAV83FasCod = "" ;
      sCtrlAV74CliCod = "" ;
      sCtrlAV75CliCod_to = "" ;
      sCtrlAV76BarFecgen = "" ;
      sCtrlAV77BarFecGen_to = "" ;
      sCtrlAV78BarSIt = "" ;
      sCtrlAV79Barsit_to = "" ;
      sCtrlAV80BarFasEst = "" ;
      sCtrlAV81BarFasEst_to = "" ;
      sCtrlAV82BarAcaAnh = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporfase_wc__default(),
         new Object[] {
             new Object[] {
            H019V10_A758ProCod, H019V10_A159BarFecGen, H019V10_A457FasCod, H019V10_A1799BarDibInt, H019V10_A4466BarAcaAnh, H019V10_A1798BarDibCli, H019V10_A194BarOrdLin, H019V10_A1234BarNomCli, H019V10_A218BarTipCol, H019V10_A136BarColNum,
            H019V10_A135BarColNom, H019V10_A1652BarSerDsc, H019V10_A212BarSer, H019V10_A213BarSit, H019V10_A13696BarNHdr, H019V10_A279CliNom, H019V10_A252CliCod, H019V10_n252CliCod, H019V10_A153BarFasEst, H019V10_A603MaqCodBis,
            H019V10_A1955BarFasSig, H019V10_n1955BarFasSig, H019V10_A154BarFasLin, H019V10_n154BarFasLin, H019V10_A151BarFasCod, H019V10_n151BarFasCod, H019V10_A184BarMtr, H019V10_A166BarKgm, H019V10_A129BarCod, H019V10_A132BarCodReo,
            H019V10_A130BarCodPar, H019V10_A143BarDisNum, H019V10_A4812BarEncCli, H019V10_A396EmprCod
            }
            , new Object[] {
            H019V19_AGRID_nRecordCount
            }
            , new Object[] {
            H019V28_A758ProCod, H019V28_A159BarFecGen, H019V28_A457FasCod, H019V28_A396EmprCod, H019V28_A4466BarAcaAnh, H019V28_A1798BarDibCli, H019V28_A194BarOrdLin, H019V28_A1234BarNomCli, H019V28_A218BarTipCol, H019V28_A136BarColNum,
            H019V28_A135BarColNom, H019V28_A1652BarSerDsc, H019V28_A212BarSer, H019V28_A213BarSit, H019V28_A13696BarNHdr, H019V28_A279CliNom, H019V28_A252CliCod, H019V28_n252CliCod, H019V28_A153BarFasEst, H019V28_A603MaqCodBis,
            H019V28_A1955BarFasSig, H019V28_n1955BarFasSig, H019V28_A154BarFasLin, H019V28_n154BarFasLin, H019V28_A151BarFasCod, H019V28_n151BarFasCod, H019V28_A184BarMtr, H019V28_A166BarKgm, H019V28_A129BarCod, H019V28_A132BarCodReo,
            H019V28_A130BarCodPar
            }
         }
      );
      AV127Pgmdesc = httpContext.getMessage( " Tabla BARFAS", "") ;
      AV126Pgmname = "Produccion.CargasProduccionporFase_WC" ;
      /* GeneXus formulas. */
      AV127Pgmdesc = httpContext.getMessage( " Tabla BARFAS", "") ;
      AV126Pgmname = "Produccion.CargasProduccionporFase_WC" ;
      Gx_err = (short)(0) ;
      edtavFascod_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavHispronfusos_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      edtavFasdsclast_Enabled = 0 ;
      edtavFasdscnext_Enabled = 0 ;
      edtavFasdscant_Enabled = 0 ;
      edtavAbierta_Enabled = 0 ;
      edtavEstado_Enabled = 0 ;
      edtavAlbrfen_Enabled = 0 ;
      edtavAlbrloc_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV78BarSIt ;
   private byte wcpOAV79Barsit_to ;
   private byte wcpOAV80BarFasEst ;
   private byte wcpOAV81BarFasEst_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV78BarSIt ;
   private byte AV79Barsit_to ;
   private byte AV80BarFasEst ;
   private byte AV81BarFasEst_to ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV45TFBarSit ;
   private byte AV46TFBarSit_To ;
   private byte AV55TFBarTipCol ;
   private byte AV56TFBarTipCol_To ;
   private byte AV106fio ;
   private byte AV112tintest ;
   private byte AV103CnoEnc ;
   private byte AV109Rioplatense ;
   private byte AV102Carvitin ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV82BarAcaAnh ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV82BarAcaAnh ;
   private short AV12OrderedBy ;
   private short AV65TFBarFasLin ;
   private short AV66TFBarFasLin_To ;
   private short AV69TFBarOrdLin ;
   private short AV70TFBarOrdLin_To ;
   private short AV71TFBarAcaAnh ;
   private short AV72TFBarAcaAnh_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A154BarFasLin ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int13[] ;
   private short AV123i ;
   private int wcpOAV74CliCod ;
   private int wcpOAV75CliCod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_59 ;
   private int AV74CliCod ;
   private int AV75CliCod_to ;
   private int nGXsfl_59_idx=1 ;
   private int AV37TFCliCod ;
   private int AV38TFCliCod_To ;
   private int AV53TFBarColNum ;
   private int AV54TFBarColNum_To ;
   private int A1799BarDibInt ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable1_Visible ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int AV107HisProNFusos ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavHispronfusos_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavFasdsclast_Enabled ;
   private int edtavFasdscnext_Enabled ;
   private int edtavFasdscant_Enabled ;
   private int edtavAbierta_Enabled ;
   private int edtavEstado_Enabled ;
   private int edtavAlbrfen_Enabled ;
   private int edtavAlbrloc_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV36TFBarFasEst_Sels_size ;
   private int edtMaqCodBis_Visible ;
   private int edtavHispronfusos_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarTipCol_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtBarFasLin_Visible ;
   private int edtavFasdsclast_Visible ;
   private int edtBarFasSig_Visible ;
   private int edtavFasdscnext_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtavFasdscant_Visible ;
   private int edtavAbierta_Visible ;
   private int edtBarDibCli_Visible ;
   private int edtavEstado_Visible ;
   private int edtavAlbrfen_Visible ;
   private int edtBarAcaAnh_Visible ;
   private int edtavAlbrloc_Visible ;
   private int AV29PageToGo ;
   private int GXt_int11 ;
   private int GXv_int12[] ;
   private int nGXsfl_59_fel_idx=1 ;
   private int AV132GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV59TFBarKgm ;
   private java.math.BigDecimal AV60TFBarKgm_To ;
   private java.math.BigDecimal AV61TFBarMtr ;
   private java.math.BigDecimal AV62TFBarMtr_To ;
   private java.math.BigDecimal AV84TotBarKgm ;
   private java.math.BigDecimal AV86TotBarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String wcpOAV73Emprcod ;
   private String wcpOAV83FasCod ;
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
   private String AV73Emprcod ;
   private String AV83FasCod ;
   private String sGXsfl_59_idx="0001" ;
   private String AV126Pgmname ;
   private String AV94TFMaqCodBis ;
   private String AV95TFMaqCodBis_Sel ;
   private String AV39TFCliNom ;
   private String AV40TFCliNom_Sel ;
   private String AV43TFBarNHdr ;
   private String AV44TFBarNHdr_Sel ;
   private String AV47TFBarSer ;
   private String AV48TFBarSer_Sel ;
   private String AV49TFBarSerDsc ;
   private String AV50TFBarSerDsc_Sel ;
   private String AV51TFBarColNom ;
   private String AV52TFBarColNom_Sel ;
   private String AV57TFBarNomCli ;
   private String AV58TFBarNomCli_Sel ;
   private String AV63TFBarFasCod ;
   private String AV64TFBarFasCod_Sel ;
   private String AV67TFBarFasSig ;
   private String AV68TFBarFasSig_Sel ;
   private String AV110TFBarDibCli ;
   private String AV111TFBarDibCli_Sel ;
   private String AV100Abierta ;
   private String AV113FasCodAnt ;
   private String A13878PedidoClie ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A457FasCod ;
   private String A143BarDisNum ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtavFascod_Internalname ;
   private String edtavFascod_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String TempTags ;
   private String AV88FasDsc ;
   private String edtavFasdsc_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnusuexport_Internalname ;
   private String bttBtnusuexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtnusuexportreport_Internalname ;
   private String bttBtnusuexportreport_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
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
   private String AV89DetailWebComponent ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String AV118Sel ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String edtavHispronfusos_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Internalname ;
   private String AV121BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarSit_Internalname ;
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
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String edtBarFasLin_Internalname ;
   private String AV32FasDscLast ;
   private String edtavFasdsclast_Internalname ;
   private String A1955BarFasSig ;
   private String edtBarFasSig_Internalname ;
   private String AV33FasdscNext ;
   private String edtavFasdscnext_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String AV105FasDscAnt ;
   private String edtavFasdscant_Internalname ;
   private String edtavAbierta_Internalname ;
   private String A1798BarDibCli ;
   private String edtBarDibCli_Internalname ;
   private String AV104Estado ;
   private String edtavEstado_Internalname ;
   private String edtavAlbrfen_Internalname ;
   private String edtBarAcaAnh_Internalname ;
   private String AV34AlbRLoc ;
   private String edtavAlbrloc_Internalname ;
   private String AV127Pgmdesc ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String scmdbuf ;
   private String lV63TFBarFasCod ;
   private String lV67TFBarFasSig ;
   private String lV94TFMaqCodBis ;
   private String lV39TFCliNom ;
   private String lV43TFBarNHdr ;
   private String lV47TFBarSer ;
   private String lV49TFBarSerDsc ;
   private String lV51TFBarColNom ;
   private String lV57TFBarNomCli ;
   private String lV110TFBarDibCli ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV115Station ;
   private String AV114EmprNom ;
   private String AV116UsurCod ;
   private String AV108NomInf ;
   private String AV122Flag ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char22 ;
   private String GXv_char5[] ;
   private String GXt_char21 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV73Emprcod ;
   private String sCtrlAV83FasCod ;
   private String sCtrlAV74CliCod ;
   private String sCtrlAV75CliCod_to ;
   private String sCtrlAV76BarFecgen ;
   private String sCtrlAV77BarFecGen_to ;
   private String sCtrlAV78BarSIt ;
   private String sCtrlAV79Barsit_to ;
   private String sCtrlAV80BarFasEst ;
   private String sCtrlAV81BarFasEst_to ;
   private String sCtrlAV82BarAcaAnh ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String GXCCtl ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtavHispronfusos_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarEncCli_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFasLin_Jsonclick ;
   private String edtavFasdsclast_Jsonclick ;
   private String edtBarFasSig_Jsonclick ;
   private String edtavFasdscnext_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtavFasdscant_Jsonclick ;
   private String edtavAbierta_Jsonclick ;
   private String edtBarDibCli_Jsonclick ;
   private String edtavEstado_Jsonclick ;
   private String edtavAlbrfen_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtavAlbrloc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV76BarFecgen ;
   private java.util.Date wcpOAV77BarFecGen_to ;
   private java.util.Date AV76BarFecgen ;
   private java.util.Date AV77BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV101AlbRFen ;
   private java.util.Date GXt_date14 ;
   private java.util.Date GXv_date15[] ;
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
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n154BarFasLin ;
   private boolean n1955BarFasSig ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV35TFBarFasEst_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV15FilterFullText ;
   private String AV85TotValueBarKgm ;
   private String AV87TotValueBarMtr ;
   private String AV120jsonBarCod ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private GXSimpleCollection<Byte> AV36TFBarFasEst_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSel ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H019V10_A758ProCod ;
   private java.util.Date[] H019V10_A159BarFecGen ;
   private String[] H019V10_A457FasCod ;
   private int[] H019V10_A1799BarDibInt ;
   private short[] H019V10_A4466BarAcaAnh ;
   private String[] H019V10_A1798BarDibCli ;
   private short[] H019V10_A194BarOrdLin ;
   private String[] H019V10_A1234BarNomCli ;
   private byte[] H019V10_A218BarTipCol ;
   private int[] H019V10_A136BarColNum ;
   private String[] H019V10_A135BarColNom ;
   private String[] H019V10_A1652BarSerDsc ;
   private String[] H019V10_A212BarSer ;
   private byte[] H019V10_A213BarSit ;
   private String[] H019V10_A13696BarNHdr ;
   private String[] H019V10_A279CliNom ;
   private int[] H019V10_A252CliCod ;
   private boolean[] H019V10_n252CliCod ;
   private byte[] H019V10_A153BarFasEst ;
   private String[] H019V10_A603MaqCodBis ;
   private String[] H019V10_A1955BarFasSig ;
   private boolean[] H019V10_n1955BarFasSig ;
   private short[] H019V10_A154BarFasLin ;
   private boolean[] H019V10_n154BarFasLin ;
   private String[] H019V10_A151BarFasCod ;
   private boolean[] H019V10_n151BarFasCod ;
   private java.math.BigDecimal[] H019V10_A184BarMtr ;
   private java.math.BigDecimal[] H019V10_A166BarKgm ;
   private int[] H019V10_A129BarCod ;
   private byte[] H019V10_A132BarCodReo ;
   private String[] H019V10_A130BarCodPar ;
   private String[] H019V10_A143BarDisNum ;
   private String[] H019V10_A4812BarEncCli ;
   private String[] H019V10_A396EmprCod ;
   private long[] H019V19_AGRID_nRecordCount ;
   private String[] H019V28_A758ProCod ;
   private java.util.Date[] H019V28_A159BarFecGen ;
   private String[] H019V28_A457FasCod ;
   private String[] H019V28_A396EmprCod ;
   private short[] H019V28_A4466BarAcaAnh ;
   private String[] H019V28_A1798BarDibCli ;
   private short[] H019V28_A194BarOrdLin ;
   private String[] H019V28_A1234BarNomCli ;
   private byte[] H019V28_A218BarTipCol ;
   private int[] H019V28_A136BarColNum ;
   private String[] H019V28_A135BarColNom ;
   private String[] H019V28_A1652BarSerDsc ;
   private String[] H019V28_A212BarSer ;
   private byte[] H019V28_A213BarSit ;
   private String[] H019V28_A13696BarNHdr ;
   private String[] H019V28_A279CliNom ;
   private int[] H019V28_A252CliCod ;
   private boolean[] H019V28_n252CliCod ;
   private byte[] H019V28_A153BarFasEst ;
   private String[] H019V28_A603MaqCodBis ;
   private String[] H019V28_A1955BarFasSig ;
   private boolean[] H019V28_n1955BarFasSig ;
   private short[] H019V28_A154BarFasLin ;
   private boolean[] H019V28_n154BarFasLin ;
   private String[] H019V28_A151BarFasCod ;
   private boolean[] H019V28_n151BarFasCod ;
   private java.math.BigDecimal[] H019V28_A184BarMtr ;
   private java.math.BigDecimal[] H019V28_A166BarKgm ;
   private int[] H019V28_A129BarCod ;
   private byte[] H019V28_A132BarCodReo ;
   private String[] H019V28_A130BarCodPar ;
   private com.genexus.webpanels.WebSession AV93WebSession ;
   private GXSimpleCollection<String> AV117cBarCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState35[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV92ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
}

final  class cargasproduccionporfase_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H019V10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV36TFBarFasEst_Sels ,
                                           String AV95TFMaqCodBis_Sel ,
                                           String AV94TFMaqCodBis ,
                                           int AV36TFBarFasEst_Sels_size ,
                                           int AV37TFCliCod ,
                                           int AV38TFCliCod_To ,
                                           String AV40TFCliNom_Sel ,
                                           String AV39TFCliNom ,
                                           String AV44TFBarNHdr_Sel ,
                                           String AV43TFBarNHdr ,
                                           byte AV45TFBarSit ,
                                           byte AV46TFBarSit_To ,
                                           String AV48TFBarSer_Sel ,
                                           String AV47TFBarSer ,
                                           String AV50TFBarSerDsc_Sel ,
                                           String AV49TFBarSerDsc ,
                                           String AV52TFBarColNom_Sel ,
                                           String AV51TFBarColNom ,
                                           int AV53TFBarColNum ,
                                           int AV54TFBarColNum_To ,
                                           byte AV55TFBarTipCol ,
                                           byte AV56TFBarTipCol_To ,
                                           String AV58TFBarNomCli_Sel ,
                                           String AV57TFBarNomCli ,
                                           java.math.BigDecimal AV59TFBarKgm ,
                                           java.math.BigDecimal AV60TFBarKgm_To ,
                                           java.math.BigDecimal AV61TFBarMtr ,
                                           java.math.BigDecimal AV62TFBarMtr_To ,
                                           short AV69TFBarOrdLin ,
                                           short AV70TFBarOrdLin_To ,
                                           String AV111TFBarDibCli_Sel ,
                                           String AV110TFBarDibCli ,
                                           short AV71TFBarAcaAnh ,
                                           short AV72TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV15FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV64TFBarFasCod_Sel ,
                                           String AV63TFBarFasCod ,
                                           short AV65TFBarFasLin ,
                                           short AV66TFBarFasLin_To ,
                                           String AV68TFBarFasSig_Sel ,
                                           String AV67TFBarFasSig ,
                                           int AV74CliCod ,
                                           int AV75CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV76BarFecgen ,
                                           java.util.Date AV77BarFecGen_to ,
                                           byte AV78BarSIt ,
                                           byte AV79Barsit_to ,
                                           byte AV80BarFasEst ,
                                           byte AV81BarFasEst_to ,
                                           short AV82BarAcaAnh ,
                                           String AV73Emprcod ,
                                           String AV83FasCod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[84];
      Object[] GXv_Object37 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ProCod, T2.BarFecGen, T1.FasCod, T2.BarDibInt, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      sSelectString += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      sSelectString += " T3.CliNom, T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ')" ;
      sSelectString += " AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarDisNum, T2.BarEncCli, T1.EmprCod" ;
      sFromString = " FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sFromString += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin," ;
      sFromString += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      sFromString += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo" ;
      sFromString += " AND T9.BarCodPar = T8.BarCodPar) INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      sFromString += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      sFromString += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      sFromString += " WHERE (T11.BarOrdLin >= 0) AND (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      sFromString += " T11.BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      sFromString += " = T10.GXC1) AND (T8.BarOrdLin >= 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      sFromString += " T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      sFromString += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod" ;
      sFromString += " AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod," ;
      sFromString += " T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      sFromString += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      sFromString += " WHERE (T8.BarOrdLin = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod" ;
      sFromString += " = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      sFromString += " SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo" ;
      sFromString += " = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV94TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int36[48] = (byte)(1) ;
      }
      if ( AV36TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV36TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV37TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int36[49] = (byte)(1) ;
      }
      if ( ! (0==AV38TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int36[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int36[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int36[54] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int36[55] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int36[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int36[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int36[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int36[62] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int36[63] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int36[64] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int36[65] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int36[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int36[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int36[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int36[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int36[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int36[72] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int36[73] = (byte)(1) ;
      }
      if ( ! (0==AV70TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int36[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV110TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int36[76] = (byte)(1) ;
      }
      if ( ! (0==AV71TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int36[77] = (byte)(1) ;
      }
      if ( ! (0==AV72TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int36[78] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarDibCli" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarDibCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarAcaAnh" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarAcaAnh DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
   }

   protected Object[] conditional_H019V19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV36TFBarFasEst_Sels ,
                                           String AV95TFMaqCodBis_Sel ,
                                           String AV94TFMaqCodBis ,
                                           int AV36TFBarFasEst_Sels_size ,
                                           int AV37TFCliCod ,
                                           int AV38TFCliCod_To ,
                                           String AV40TFCliNom_Sel ,
                                           String AV39TFCliNom ,
                                           String AV44TFBarNHdr_Sel ,
                                           String AV43TFBarNHdr ,
                                           byte AV45TFBarSit ,
                                           byte AV46TFBarSit_To ,
                                           String AV48TFBarSer_Sel ,
                                           String AV47TFBarSer ,
                                           String AV50TFBarSerDsc_Sel ,
                                           String AV49TFBarSerDsc ,
                                           String AV52TFBarColNom_Sel ,
                                           String AV51TFBarColNom ,
                                           int AV53TFBarColNum ,
                                           int AV54TFBarColNum_To ,
                                           byte AV55TFBarTipCol ,
                                           byte AV56TFBarTipCol_To ,
                                           String AV58TFBarNomCli_Sel ,
                                           String AV57TFBarNomCli ,
                                           java.math.BigDecimal AV59TFBarKgm ,
                                           java.math.BigDecimal AV60TFBarKgm_To ,
                                           java.math.BigDecimal AV61TFBarMtr ,
                                           java.math.BigDecimal AV62TFBarMtr_To ,
                                           short AV69TFBarOrdLin ,
                                           short AV70TFBarOrdLin_To ,
                                           String AV111TFBarDibCli_Sel ,
                                           String AV110TFBarDibCli ,
                                           short AV71TFBarAcaAnh ,
                                           short AV72TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV15FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV64TFBarFasCod_Sel ,
                                           String AV63TFBarFasCod ,
                                           short AV65TFBarFasLin ,
                                           short AV66TFBarFasLin_To ,
                                           String AV68TFBarFasSig_Sel ,
                                           String AV67TFBarFasSig ,
                                           int AV74CliCod ,
                                           int AV75CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV76BarFecgen ,
                                           java.util.Date AV77BarFecGen_to ,
                                           byte AV78BarSIt ,
                                           byte AV79Barsit_to ,
                                           byte AV80BarFasEst ,
                                           byte AV81BarFasEst_to ,
                                           short AV82BarAcaAnh ,
                                           String AV73Emprcod ,
                                           String AV83FasCod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[79];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar" ;
      scmdbuf += " = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE" ;
      scmdbuf += " (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >= 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND" ;
      scmdbuf += " T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod" ;
      scmdbuf += " AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV94TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( AV36TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV36TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV37TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! (0==AV38TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int39[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[54] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int39[55] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int39[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int39[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int39[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int39[62] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[63] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[64] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int39[65] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int39[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int39[68] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int39[69] = (byte)(1) ;
      }
      if ( ! (0==AV70TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int39[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV110TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int39[72] = (byte)(1) ;
      }
      if ( ! (0==AV71TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int39[73] = (byte)(1) ;
      }
      if ( ! (0==AV72TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int39[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
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

   protected Object[] conditional_H019V28( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV36TFBarFasEst_Sels ,
                                           String AV95TFMaqCodBis_Sel ,
                                           String AV94TFMaqCodBis ,
                                           int AV36TFBarFasEst_Sels_size ,
                                           int AV37TFCliCod ,
                                           int AV38TFCliCod_To ,
                                           String AV40TFCliNom_Sel ,
                                           String AV39TFCliNom ,
                                           String AV44TFBarNHdr_Sel ,
                                           String AV43TFBarNHdr ,
                                           byte AV45TFBarSit ,
                                           byte AV46TFBarSit_To ,
                                           String AV48TFBarSer_Sel ,
                                           String AV47TFBarSer ,
                                           String AV50TFBarSerDsc_Sel ,
                                           String AV49TFBarSerDsc ,
                                           String AV52TFBarColNom_Sel ,
                                           String AV51TFBarColNom ,
                                           int AV53TFBarColNum ,
                                           int AV54TFBarColNum_To ,
                                           byte AV55TFBarTipCol ,
                                           byte AV56TFBarTipCol_To ,
                                           String AV58TFBarNomCli_Sel ,
                                           String AV57TFBarNomCli ,
                                           java.math.BigDecimal AV59TFBarKgm ,
                                           java.math.BigDecimal AV60TFBarKgm_To ,
                                           java.math.BigDecimal AV61TFBarMtr ,
                                           java.math.BigDecimal AV62TFBarMtr_To ,
                                           short AV69TFBarOrdLin ,
                                           short AV70TFBarOrdLin_To ,
                                           String AV111TFBarDibCli_Sel ,
                                           String AV110TFBarDibCli ,
                                           short AV71TFBarAcaAnh ,
                                           short AV72TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           String AV15FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV64TFBarFasCod_Sel ,
                                           String AV63TFBarFasCod ,
                                           short AV65TFBarFasLin ,
                                           short AV66TFBarFasLin_To ,
                                           String AV68TFBarFasSig_Sel ,
                                           String AV67TFBarFasSig ,
                                           int AV74CliCod ,
                                           int AV75CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV76BarFecgen ,
                                           java.util.Date AV77BarFecGen_to ,
                                           byte AV78BarSIt ,
                                           byte AV79Barsit_to ,
                                           byte AV80BarFasEst ,
                                           byte AV81BarFasEst_to ,
                                           short AV82BarAcaAnh ,
                                           String AV73Emprcod ,
                                           String AV83FasCod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int42 = new byte[79];
      Object[] GXv_Object43 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T3.CliNom, T2.CliCod, T1.BarFasEst, T1.MaqCodBis, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE( T6.BarFasSig, ' ')" ;
      scmdbuf += " AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((((((TXPBARFAS T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T10 ON T10.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND (T8.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod =" ;
      scmdbuf += " T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV94TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int42[48] = (byte)(1) ;
      }
      if ( AV36TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV36TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV37TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int42[49] = (byte)(1) ;
      }
      if ( ! (0==AV38TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int42[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int42[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int42[54] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int42[55] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int42[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int42[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int42[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int42[62] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int42[63] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int42[64] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int42[65] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int42[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int42[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int42[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int42[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int42[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int42[72] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int42[73] = (byte)(1) ;
      }
      if ( ! (0==AV70TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int42[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV110TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int42[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int42[76] = (byte)(1) ;
      }
      if ( ! (0==AV71TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int42[77] = (byte)(1) ;
      }
      if ( ! (0==AV72TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int42[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object43[0] = scmdbuf ;
      GXv_Object43[1] = GXv_int42 ;
      return GXv_Object43 ;
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
                  return conditional_H019V10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).byteValue() , ((Number) dynConstraints[74]).byteValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 1 :
                  return conditional_H019V19(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).byteValue() , ((Number) dynConstraints[74]).byteValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 2 :
                  return conditional_H019V28(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H019V10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019V19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H019V28", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 11);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 11);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
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
                  stmt.setString(sIdx, (String)parms[84], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[112]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[115]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[121]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[123]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[124]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[125]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[126]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[127]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[128]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[129]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[130]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[140]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[147]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[148]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[149]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[150]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[158]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[159], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[160], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[161]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[162]).shortValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[163]).intValue());
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[164]).intValue());
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[167]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
      }
   }

}

