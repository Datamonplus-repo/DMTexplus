package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwanalisiscostesquimicoss_impl extends GXWebComponent
{
   public wcwanalisiscostesquimicoss_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwanalisiscostesquimicoss_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwanalisiscostesquimicoss_impl.class ));
   }

   public wcwanalisiscostesquimicoss_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
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
               AV91EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EmprCod", AV91EmprCod);
               AV87HreRacab = httpContext.GetPar( "HreRacab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87HreRacab", AV87HreRacab);
               AV101Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Fec1", localUtil.format(AV101Fec1, "99/99/99"));
               AV102Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Fec2", localUtil.format(AV102Fec2, "99/99/99"));
               AV98Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Calculo", GXutil.str( AV98Calculo, 1, 0));
               AV88barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88barcod), 8, 0));
               AV89barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89barcodreo", GXutil.str( AV89barcodreo, 1, 0));
               AV90barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90barcodpar", AV90barcodpar);
               AV92ARtcod1 = httpContext.GetPar( "ARtcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92ARtcod1", AV92ARtcod1);
               AV93Artcod3 = httpContext.GetPar( "Artcod3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Artcod3", AV93Artcod3);
               AV94Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Barcolnom1", AV94Barcolnom1);
               AV95Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcolnom3", AV95Barcolnom3);
               AV96Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96Barcolnum1), 6, 0));
               AV97Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Barcolnum3), 6, 0));
               AV99Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Clicod1), 6, 0));
               AV100Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Clicod3), 6, 0));
               AV103Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Intcod1), 2, 0));
               AV104Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Intcod3), 2, 0));
               AV105TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TipArtCod1), 4, 0));
               AV106Tipartcod3 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106Tipartcod3), 4, 0));
               AV107Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Tipcolcod1), 2, 0));
               AV108Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Tipcolcod3), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV91EmprCod,AV87HreRacab,AV101Fec1,AV102Fec2,Byte.valueOf(AV98Calculo),Integer.valueOf(AV88barcod),Byte.valueOf(AV89barcodreo),AV90barcodpar,AV92ARtcod1,AV93Artcod3,AV94Barcolnom1,AV95Barcolnom3,Integer.valueOf(AV96Barcolnum1),Integer.valueOf(AV97Barcolnum3),Integer.valueOf(AV99Clicod1),Integer.valueOf(AV100Clicod3),Byte.valueOf(AV103Intcod1),Byte.valueOf(AV104Intcod3),Short.valueOf(AV105TipArtCod1),Short.valueOf(AV106Tipartcod3),Byte.valueOf(AV107Tipcolcod1),Byte.valueOf(AV108Tipcolcod3)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV123FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV91EmprCod = httpContext.GetPar( "EmprCod") ;
      AV87HreRacab = httpContext.GetPar( "HreRacab") ;
      AV101Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV102Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      AV88barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV89barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV90barcodpar = httpContext.GetPar( "barcodpar") ;
      AV92ARtcod1 = httpContext.GetPar( "ARtcod1") ;
      AV93Artcod3 = httpContext.GetPar( "Artcod3") ;
      AV94Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
      AV95Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
      AV96Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
      AV97Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
      AV99Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
      AV100Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
      AV103Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
      AV104Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
      AV105TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
      AV106Tipartcod3 = (short)(GXutil.lval( httpContext.GetPar( "Tipartcod3"))) ;
      AV107Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
      AV108Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
      AV24ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV19ColumnsSelector);
      AV26TFHreFecTin = localUtil.parseDateParm( httpContext.GetPar( "TFHreFecTin")) ;
      AV39TFHreBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHreBarKgm"), ".") ;
      AV40TFHreBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreBarKgm_To"), ".") ;
      AV42TFHreTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHreTotKgm"), ".") ;
      AV43TFHreTotKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreTotKgm_To"), ".") ;
      AV45TFHreMaqCod = httpContext.GetPar( "TFHreMaqCod") ;
      AV46TFHreMaqCod_Sel = httpContext.GetPar( "TFHreMaqCod_Sel") ;
      AV48TFHreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd"))) ;
      AV49TFHreVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd_To"))) ;
      AV57TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV58TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV60TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV61TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV63TFHreBarSer = httpContext.GetPar( "TFHreBarSer") ;
      AV64TFHreBarSer_Sel = httpContext.GetPar( "TFHreBarSer_Sel") ;
      AV66TFHreBarDsc = httpContext.GetPar( "TFHreBarDsc") ;
      AV67TFHreBarDsc_Sel = httpContext.GetPar( "TFHreBarDsc_Sel") ;
      AV69TFHreTipArtD = httpContext.GetPar( "TFHreTipArtD") ;
      AV70TFHreTipArtD_Sel = httpContext.GetPar( "TFHreTipArtD_Sel") ;
      AV72TFHreColNom = httpContext.GetPar( "TFHreColNom") ;
      AV73TFHreColNom_Sel = httpContext.GetPar( "TFHreColNom_Sel") ;
      AV75TFHreColNum = (int)(GXutil.lval( httpContext.GetPar( "TFHreColNum"))) ;
      AV76TFHreColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreColNum_To"))) ;
      AV78TFHreTipColN = httpContext.GetPar( "TFHreTipColN") ;
      AV79TFHreTipColN_Sel = httpContext.GetPar( "TFHreTipColN_Sel") ;
      AV83TFHreIntDsc = httpContext.GetPar( "TFHreIntDsc") ;
      AV84TFHreIntDsc_Sel = httpContext.GetPar( "TFHreIntDsc_Sel") ;
      AV114TFHreDti = localUtil.parseDTimeParm( httpContext.GetPar( "TFHreDti")) ;
      AV119TFHreDtf = localUtil.parseDTimeParm( httpContext.GetPar( "TFHreDtf")) ;
      AV165Pgmname = httpContext.GetPar( "Pgmname") ;
      AV37OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV12OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV98Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
      A4497HreAgrCod = (int)(GXutil.lval( httpContext.GetPar( "HreAgrCod"))) ;
      A9985HreAcCod = (int)(GXutil.lval( httpContext.GetPar( "HreAcCod"))) ;
      A4547HreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "HreVolPrd"))) ;
      A8602HreCosAA = CommonUtil.decimalVal( httpContext.GetPar( "HreCosAA"), ".") ;
      A8603HrecosAd = CommonUtil.decimalVal( httpContext.GetPar( "HrecosAd"), ".") ;
      A8604HreCosAnc = CommonUtil.decimalVal( httpContext.GetPar( "HreCosAnc"), ".") ;
      A8605HreCosCol = CommonUtil.decimalVal( httpContext.GetPar( "HreCosCol"), ".") ;
      A8606HreCosPA = CommonUtil.decimalVal( httpContext.GetPar( "HreCosPA"), ".") ;
      A8607HreCosPD = CommonUtil.decimalVal( httpContext.GetPar( "HreCosPD"), ".") ;
      A4551HreProCod = httpContext.GetPar( "HreProCod") ;
      A4552HreProDsc = httpContext.GetPar( "HreProDsc") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paT62( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " HISTORICO RECETAS (HDR)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwanalisiscostesquimicoss", new String[] {GXutil.URLEncode(GXutil.rtrim(AV91EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV87HreRacab)),GXutil.URLEncode(GXutil.formatDateParm(AV101Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV102Fec2)),GXutil.URLEncode(GXutil.ltrimstr(AV98Calculo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV88barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV90barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV92ARtcod1)),GXutil.URLEncode(GXutil.rtrim(AV93Artcod3)),GXutil.URLEncode(GXutil.rtrim(AV94Barcolnom1)),GXutil.URLEncode(GXutil.rtrim(AV95Barcolnom3)),GXutil.URLEncode(GXutil.ltrimstr(AV96Barcolnum1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV97Barcolnum3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV99Clicod1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV100Clicod3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV103Intcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV104Intcod3,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV105TipArtCod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV106Tipartcod3,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV107Tipcolcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV108Tipcolcod3,2,0))}, new String[] {"EmprCod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","Artcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","Tipartcod3","Tipcolcod1","Tipcolcod3"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV165Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV123FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV33GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV34GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV19ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV91EmprCod", GXutil.rtrim( wcpOAV91EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV87HreRacab", GXutil.rtrim( wcpOAV87HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV101Fec1", localUtil.dtoc( wcpOAV101Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV102Fec2", localUtil.dtoc( wcpOAV102Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV98Calculo", GXutil.ltrim( localUtil.ntoc( wcpOAV98Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV88barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV88barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV89barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV89barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV90barcodpar", GXutil.rtrim( wcpOAV90barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV92ARtcod1", GXutil.rtrim( wcpOAV92ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV93Artcod3", GXutil.rtrim( wcpOAV93Artcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV94Barcolnom1", GXutil.rtrim( wcpOAV94Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV95Barcolnom3", GXutil.rtrim( wcpOAV95Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV96Barcolnum1", GXutil.ltrim( localUtil.ntoc( wcpOAV96Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97Barcolnum3", GXutil.ltrim( localUtil.ntoc( wcpOAV97Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV99Clicod1", GXutil.ltrim( localUtil.ntoc( wcpOAV99Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV100Clicod3", GXutil.ltrim( localUtil.ntoc( wcpOAV100Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV103Intcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV103Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV104Intcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV104Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV105TipArtCod1", GXutil.ltrim( localUtil.ntoc( wcpOAV105TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV106Tipartcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV106Tipartcod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV107Tipcolcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV107Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV108Tipcolcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV108Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV24ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREFECTIN", localUtil.dtoc( AV26TFHreFecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARKGM", GXutil.ltrim( localUtil.ntoc( AV39TFHreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV40TFHreBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETOTKGM", GXutil.ltrim( localUtil.ntoc( AV42TFHreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETOTKGM_TO", GXutil.ltrim( localUtil.ntoc( AV43TFHreTotKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD", GXutil.rtrim( AV45TFHreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD_SEL", GXutil.rtrim( AV46TFHreMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD", GXutil.ltrim( localUtil.ntoc( AV48TFHreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFHreVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV57TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV58TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV60TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV61TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARSER", GXutil.rtrim( AV63TFHreBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARSER_SEL", GXutil.rtrim( AV64TFHreBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARDSC", GXutil.rtrim( AV66TFHreBarDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARDSC_SEL", GXutil.rtrim( AV67TFHreBarDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETIPARTD", GXutil.rtrim( AV69TFHreTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETIPARTD_SEL", GXutil.rtrim( AV70TFHreTipArtD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECOLNOM", GXutil.rtrim( AV72TFHreColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECOLNOM_SEL", GXutil.rtrim( AV73TFHreColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECOLNUM", GXutil.ltrim( localUtil.ntoc( AV75TFHreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV76TFHreColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETIPCOLN", GXutil.rtrim( AV78TFHreTipColN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRETIPCOLN_SEL", GXutil.rtrim( AV79TFHreTipColN_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREINTDSC", GXutil.rtrim( AV83TFHreIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREINTDSC_SEL", GXutil.rtrim( AV84TFHreIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREDTI", localUtil.ttoc( AV114TFHreDti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREDTF", localUtil.ttoc( AV119TFHreDtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV165Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV165Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV37OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV91EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACAB", GXutil.rtrim( AV87HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV101Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV102Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCALCULO", GXutil.ltrim( localUtil.ntoc( AV98Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV88barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV89barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV90barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD1", GXutil.rtrim( AV92ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD3", GXutil.rtrim( AV93Artcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM1", GXutil.rtrim( AV94Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM3", GXutil.rtrim( AV95Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM1", GXutil.ltrim( localUtil.ntoc( AV96Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV97Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV99Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV100Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD1", GXutil.ltrim( localUtil.ntoc( AV103Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV104Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV105TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV106Tipartcod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD1", GXutil.ltrim( localUtil.ntoc( AV107Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV108Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRCOD", GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACCOD", GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSAA", GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSAD", GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSANC", GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSCOL", GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSPA", GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSPD", GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPROCOD", GXutil.rtrim( A4551HreProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPRODSC", GXutil.rtrim( A4552HreProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDISCLI", GXutil.rtrim( A4516HreDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDISPCLI", GXutil.rtrim( A11318HreDispCli));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRERACAB", GXutil.rtrim( A9808HreRacab));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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

   public void renderHtmlCloseFormT62( )
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
         if ( ! ( WebComp_Wcwccostesproductos == null ) )
         {
            WebComp_Wcwccostesproductos.componentjscripts();
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
      return "WCWAnalisisCostesQuimicoss" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " HISTORICO RECETAS (HDR)", "") ;
   }

   public void wbT60( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwanalisiscostesquimicoss");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_T62( true) ;
      }
      else
      {
         wb_table1_23_T62( false) ;
      }
      return  ;
   }

   public void wb_table1_23_T62e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV33GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV34GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0088"+"", GXutil.rtrim( WebComp_Wcwccostesproductos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0088"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_41_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductos), GXutil.lower( WebComp_Wcwccostesproductos_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0088"+"");
                  }
                  WebComp_Wcwccostesproductos.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductos), GXutil.lower( WebComp_Wcwccostesproductos_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV19ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hrefectinauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hrefectinauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hrefectinauxdate_Internalname, localUtil.format(AV28DDO_HreFecTinAuxDate, "99/99/99"), localUtil.format( AV28DDO_HreFecTinAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hrefectinauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hrefectinauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hredtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hredtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hredtiauxdate_Internalname, localUtil.format(AV116DDO_HreDtiAuxDate, "99/99/99"), localUtil.format( AV116DDO_HreDtiAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hredtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hredtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hredtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hredtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hredtfauxdate_Internalname, localUtil.format(AV121DDO_HreDtfAuxDate, "99/99/99"), localUtil.format( AV121DDO_HreDtfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,100);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hredtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hredtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void startT62( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " HISTORICO RECETAS (HDR)", ""), (short)(0)) ;
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
            strupT60( ) ;
         }
      }
   }

   public void wsT62( )
   {
      startT62( ) ;
      evtT62( ) ;
   }

   public void evtT62( )
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
                              strupT60( ) ;
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
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17T62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT60( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV124GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124GridActions), 4, 0));
                           A4529HreFecTin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHreFecTin_Internalname), 0)) ;
                           n4529HreFecTin = false ;
                           AV14ToA = httpContext.cgiGet( edtavToa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavToa_Internalname, AV14ToA);
                           AV35Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV35Hdr);
                           AV36BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV36BarAgrEst);
                           A4532HreBarKgm = localUtil.ctond( httpContext.cgiGet( edtHreBarKgm_Internalname)) ;
                           n4532HreBarKgm = false ;
                           A4542HreTotKgm = localUtil.ctond( httpContext.cgiGet( edtHreTotKgm_Internalname)) ;
                           n4542HreTotKgm = false ;
                           A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
                           A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
                              GX_FocusControl = edtavRb_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50Rb = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV50Rb, 7, 2));
                           }
                           else
                           {
                              AV50Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV50Rb, 7, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEI");
                              GX_FocusControl = edtavCostei_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV51Costei = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV51Costei, 10, 2));
                           }
                           else
                           {
                              AV51Costei = localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV51Costei, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTET");
                              GX_FocusControl = edtavCostet_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV52CosteT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV52CosteT, 10, 2));
                           }
                           else
                           {
                              AV52CosteT = localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV52CosteT, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIF");
                              GX_FocusControl = edtavDif_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV53Dif = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV53Dif, 10, 2));
                           }
                           else
                           {
                              AV53Dif = localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV53Dif, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC");
                              GX_FocusControl = edtavPorc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV86Porc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV86Porc, 6, 2));
                           }
                           else
                           {
                              AV86Porc = localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV86Porc, 6, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEK");
                              GX_FocusControl = edtavCostek_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV55CosteK = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV55CosteK, 10, 2));
                           }
                           else
                           {
                              AV55CosteK = localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV55CosteK, 10, 2));
                           }
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A4517HreBarSer = httpContext.cgiGet( edtHreBarSer_Internalname) ;
                           n4517HreBarSer = false ;
                           A4518HreBarDsc = httpContext.cgiGet( edtHreBarDsc_Internalname) ;
                           n4518HreBarDsc = false ;
                           A4520HreTipArtD = httpContext.cgiGet( edtHreTipArtD_Internalname) ;
                           n4520HreTipArtD = false ;
                           A4521HreColNom = httpContext.cgiGet( edtHreColNom_Internalname) ;
                           n4521HreColNom = false ;
                           A4522HreColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtHreColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4522HreColNum = false ;
                           A4526HreTipColN = httpContext.cgiGet( edtHreTipColN_Internalname) ;
                           n4526HreTipColN = false ;
                           A4540HreIntDsc = httpContext.cgiGet( edtHreIntDsc_Internalname) ;
                           n4540HreIntDsc = false ;
                           AV80HreProCod = httpContext.cgiGet( edtavHreprocod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprocod_Internalname, AV80HreProCod);
                           AV81HreProDsc = httpContext.cgiGet( edtavHreprodsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprodsc_Internalname, AV81HreProDsc);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTABLAA");
                              GX_FocusControl = edtavTablaa_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85TablaA = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
                           }
                           else
                           {
                              AV85TablaA = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
                           }
                           A10103HreDti = localUtil.ctot( httpContext.cgiGet( edtHreDti_Internalname), 0) ;
                           A10104HreDtf = localUtil.ctot( httpContext.cgiGet( edtHreDtf_Internalname), 0) ;
                           AV112BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV112BarEncCli);
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
                           A13842BarNhdr_Hi = httpContext.cgiGet( edtBarNhdr_Hi_Internalname) ;
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e18T62 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e19T62 ();
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
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e20T62 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e21T62 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV123FilterFullText) != 0 )
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
                                    strupT60( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
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
                     if ( nCmpId == 88 )
                     {
                        OldWcwccostesproductos = httpContext.cgiGet( sPrefix+"W0088") ;
                        if ( ( GXutil.len( OldWcwccostesproductos) == 0 ) || ( GXutil.strcmp(OldWcwccostesproductos, WebComp_Wcwccostesproductos_Component) != 0 ) )
                        {
                           WebComp_Wcwccostesproductos = WebUtils.getWebComponent(getClass(), "app." + OldWcwccostesproductos + "_impl", remoteHandle, context);
                           WebComp_Wcwccostesproductos_Component = OldWcwccostesproductos ;
                        }
                        if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
                        {
                           WebComp_Wcwccostesproductos.componentprocess(sPrefix+"W0088", "", sEvt);
                        }
                        WebComp_Wcwccostesproductos_Component = OldWcwccostesproductos ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weT62( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormT62( ) ;
         }
      }
   }

   public void paT62( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV123FilterFullText ,
                                 String AV91EmprCod ,
                                 String AV87HreRacab ,
                                 java.util.Date AV101Fec1 ,
                                 java.util.Date AV102Fec2 ,
                                 int AV88barcod ,
                                 byte AV89barcodreo ,
                                 String AV90barcodpar ,
                                 String AV92ARtcod1 ,
                                 String AV93Artcod3 ,
                                 String AV94Barcolnom1 ,
                                 String AV95Barcolnom3 ,
                                 int AV96Barcolnum1 ,
                                 int AV97Barcolnum3 ,
                                 int AV99Clicod1 ,
                                 int AV100Clicod3 ,
                                 byte AV103Intcod1 ,
                                 byte AV104Intcod3 ,
                                 short AV105TipArtCod1 ,
                                 short AV106Tipartcod3 ,
                                 byte AV107Tipcolcod1 ,
                                 byte AV108Tipcolcod3 ,
                                 byte AV24ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ,
                                 java.util.Date AV26TFHreFecTin ,
                                 java.math.BigDecimal AV39TFHreBarKgm ,
                                 java.math.BigDecimal AV40TFHreBarKgm_To ,
                                 java.math.BigDecimal AV42TFHreTotKgm ,
                                 java.math.BigDecimal AV43TFHreTotKgm_To ,
                                 String AV45TFHreMaqCod ,
                                 String AV46TFHreMaqCod_Sel ,
                                 int AV48TFHreVolPrd ,
                                 int AV49TFHreVolPrd_To ,
                                 int AV57TFCliCod ,
                                 int AV58TFCliCod_To ,
                                 String AV60TFCliNom ,
                                 String AV61TFCliNom_Sel ,
                                 String AV63TFHreBarSer ,
                                 String AV64TFHreBarSer_Sel ,
                                 String AV66TFHreBarDsc ,
                                 String AV67TFHreBarDsc_Sel ,
                                 String AV69TFHreTipArtD ,
                                 String AV70TFHreTipArtD_Sel ,
                                 String AV72TFHreColNom ,
                                 String AV73TFHreColNom_Sel ,
                                 int AV75TFHreColNum ,
                                 int AV76TFHreColNum_To ,
                                 String AV78TFHreTipColN ,
                                 String AV79TFHreTipColN_Sel ,
                                 String AV83TFHreIntDsc ,
                                 String AV84TFHreIntDsc_Sel ,
                                 java.util.Date AV114TFHreDti ,
                                 java.util.Date AV119TFHreDtf ,
                                 String AV165Pgmname ,
                                 short AV37OrderedBy ,
                                 boolean AV12OrderedDsc ,
                                 byte AV98Calculo ,
                                 int A4497HreAgrCod ,
                                 int A9985HreAcCod ,
                                 int A4547HreVolPrd ,
                                 java.math.BigDecimal A8602HreCosAA ,
                                 java.math.BigDecimal A8603HrecosAd ,
                                 java.math.BigDecimal A8604HreCosAnc ,
                                 java.math.BigDecimal A8605HreCosCol ,
                                 java.math.BigDecimal A8606HreCosPA ,
                                 java.math.BigDecimal A8607HreCosPD ,
                                 String A4551HreProCod ,
                                 String A4552HreProDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19T62 ();
      GRID_nCurrentRecord = 0 ;
      rfT62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HRELINMAQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELINMAQ", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
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
      rfT62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV165Pgmname = "WCWAnalisisCostesQuimicoss" ;
      Gx_err = (short)(0) ;
      edtavToa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprocod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTablaa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV130Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV131Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV140Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV141Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV142Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV144Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV148Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV158Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV159Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           A10103HreDti ,
                                           A10104HreDtf ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV101Fec1 ,
                                           AV102Fec2 ,
                                           A9808HreRacab ,
                                           AV87HreRacab ,
                                           Integer.valueOf(AV99Clicod1) ,
                                           Integer.valueOf(AV100Clicod3) ,
                                           AV92ARtcod1 ,
                                           AV93Artcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV105TipArtCod1) ,
                                           Short.valueOf(AV106Tipartcod3) ,
                                           AV94Barcolnom1 ,
                                           AV95Barcolnom3 ,
                                           Integer.valueOf(AV96Barcolnum1) ,
                                           Integer.valueOf(AV97Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV107Tipcolcod1) ,
                                           Byte.valueOf(AV108Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV103Intcod1) ,
                                           Byte.valueOf(AV104Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV88barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV89barcodreo) ,
                                           A4494HreBarPar ,
                                           AV90barcodpar ,
                                           AV91EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV142Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV142Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV144Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV144Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV148Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV148Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor H00T62 */
      pr_default.execute(0, new Object[] {AV91EmprCod, AV101Fec1, AV102Fec2, Integer.valueOf(AV99Clicod1), Integer.valueOf(AV100Clicod3), AV92ARtcod1, AV93Artcod3, Short.valueOf(AV105TipArtCod1), Short.valueOf(AV106Tipartcod3), AV94Barcolnom1, AV95Barcolnom3, Integer.valueOf(AV96Barcolnum1), Integer.valueOf(AV97Barcolnum3), Byte.valueOf(AV107Tipcolcod1), Byte.valueOf(AV108Tipcolcod3), Byte.valueOf(AV103Intcod1), Byte.valueOf(AV104Intcod3), Integer.valueOf(AV88barcod), Integer.valueOf(AV88barcod), Byte.valueOf(AV89barcodreo), Byte.valueOf(AV89barcodreo), AV90barcodpar, AV90barcodpar, AV131Wcwanalisiscostesquimicossds_2_tfhrefectin, AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV140Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV141Wcwanalisiscostesquimicossds_12_tfclicod_to), lV142Wcwanalisiscostesquimicossds_13_tfclinom, AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV144Wcwanalisiscostesquimicossds_15_tfhrebarser, AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV148Wcwanalisiscostesquimicossds_19_tfhretipartd, AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4495HreNumCie = H00T62_A4495HreNumCie[0] ;
         A396EmprCod = H00T62_A396EmprCod[0] ;
         A4519HreTipArt = H00T62_A4519HreTipArt[0] ;
         n4519HreTipArt = H00T62_n4519HreTipArt[0] ;
         A4525HreTipCol = H00T62_A4525HreTipCol[0] ;
         n4525HreTipCol = H00T62_n4525HreTipCol[0] ;
         A4539HreIntCod = H00T62_A4539HreIntCod[0] ;
         n4539HreIntCod = H00T62_n4539HreIntCod[0] ;
         A9808HreRacab = H00T62_A9808HreRacab[0] ;
         n9808HreRacab = H00T62_n9808HreRacab[0] ;
         A4516HreDisCli = H00T62_A4516HreDisCli[0] ;
         n4516HreDisCli = H00T62_n4516HreDisCli[0] ;
         A11318HreDispCli = H00T62_A11318HreDispCli[0] ;
         n11318HreDispCli = H00T62_n11318HreDispCli[0] ;
         A4540HreIntDsc = H00T62_A4540HreIntDsc[0] ;
         n4540HreIntDsc = H00T62_n4540HreIntDsc[0] ;
         A4526HreTipColN = H00T62_A4526HreTipColN[0] ;
         n4526HreTipColN = H00T62_n4526HreTipColN[0] ;
         A4522HreColNum = H00T62_A4522HreColNum[0] ;
         n4522HreColNum = H00T62_n4522HreColNum[0] ;
         A4521HreColNom = H00T62_A4521HreColNom[0] ;
         n4521HreColNom = H00T62_n4521HreColNom[0] ;
         A4520HreTipArtD = H00T62_A4520HreTipArtD[0] ;
         n4520HreTipArtD = H00T62_n4520HreTipArtD[0] ;
         A4518HreBarDsc = H00T62_A4518HreBarDsc[0] ;
         n4518HreBarDsc = H00T62_n4518HreBarDsc[0] ;
         A4517HreBarSer = H00T62_A4517HreBarSer[0] ;
         n4517HreBarSer = H00T62_n4517HreBarSer[0] ;
         A279CliNom = H00T62_A279CliNom[0] ;
         A252CliCod = H00T62_A252CliCod[0] ;
         n252CliCod = H00T62_n252CliCod[0] ;
         A4542HreTotKgm = H00T62_A4542HreTotKgm[0] ;
         n4542HreTotKgm = H00T62_n4542HreTotKgm[0] ;
         A4532HreBarKgm = H00T62_A4532HreBarKgm[0] ;
         n4532HreBarKgm = H00T62_n4532HreBarKgm[0] ;
         A4529HreFecTin = H00T62_A4529HreFecTin[0] ;
         n4529HreFecTin = H00T62_n4529HreFecTin[0] ;
         A4494HreBarPar = H00T62_A4494HreBarPar[0] ;
         A4493HreBarReo = H00T62_A4493HreBarReo[0] ;
         A4492HreBarCod = H00T62_A4492HreBarCod[0] ;
         A279CliNom = H00T62_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV87HreRacab) == 0 ) || ( GXutil.strcmp(AV87HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfT62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e19T62 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
            {
               WebComp_Wcwccostesproductos.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV130Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                              AV131Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                              AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                              AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                              AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                              AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                              AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                              AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                              Integer.valueOf(AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                              Integer.valueOf(AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                              Integer.valueOf(AV140Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                              Integer.valueOf(AV141Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                              AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                              AV142Wcwanalisiscostesquimicossds_13_tfclinom ,
                                              AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                              AV144Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                              AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                              AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                              AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                              AV148Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                              AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                              AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                              Integer.valueOf(AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                              Integer.valueOf(AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                              AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                              AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                              AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                              AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                              AV158Wcwanalisiscostesquimicossds_29_tfhredti ,
                                              AV159Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                              A4532HreBarKgm ,
                                              A4542HreTotKgm ,
                                              A4546HreMaqCod ,
                                              Integer.valueOf(A4547HreVolPrd) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A4517HreBarSer ,
                                              A4518HreBarDsc ,
                                              A4520HreTipArtD ,
                                              A4521HreColNom ,
                                              Integer.valueOf(A4522HreColNum) ,
                                              A4526HreTipColN ,
                                              A4540HreIntDsc ,
                                              A4529HreFecTin ,
                                              A10103HreDti ,
                                              A10104HreDtf ,
                                              Short.valueOf(AV37OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV101Fec1 ,
                                              AV102Fec2 ,
                                              A9808HreRacab ,
                                              AV87HreRacab ,
                                              Integer.valueOf(AV99Clicod1) ,
                                              Integer.valueOf(AV100Clicod3) ,
                                              AV92ARtcod1 ,
                                              AV93Artcod3 ,
                                              Short.valueOf(A4519HreTipArt) ,
                                              Short.valueOf(AV105TipArtCod1) ,
                                              Short.valueOf(AV106Tipartcod3) ,
                                              AV94Barcolnom1 ,
                                              AV95Barcolnom3 ,
                                              Integer.valueOf(AV96Barcolnum1) ,
                                              Integer.valueOf(AV97Barcolnum3) ,
                                              Byte.valueOf(A4525HreTipCol) ,
                                              Byte.valueOf(AV107Tipcolcod1) ,
                                              Byte.valueOf(AV108Tipcolcod3) ,
                                              Byte.valueOf(A4539HreIntCod) ,
                                              Byte.valueOf(AV103Intcod1) ,
                                              Byte.valueOf(AV104Intcod3) ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Integer.valueOf(AV88barcod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              Byte.valueOf(AV89barcodreo) ,
                                              A4494HreBarPar ,
                                              AV90barcodpar ,
                                              AV91EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV142Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV142Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
         lV144Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV144Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
         lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
         lV148Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV148Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
         lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
         lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
         lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
         /* Using cursor H00T63 */
         pr_default.execute(1, new Object[] {AV91EmprCod, AV101Fec1, AV102Fec2, Integer.valueOf(AV99Clicod1), Integer.valueOf(AV100Clicod3), AV92ARtcod1, AV93Artcod3, Short.valueOf(AV105TipArtCod1), Short.valueOf(AV106Tipartcod3), AV94Barcolnom1, AV95Barcolnom3, Integer.valueOf(AV96Barcolnum1), Integer.valueOf(AV97Barcolnum3), Byte.valueOf(AV107Tipcolcod1), Byte.valueOf(AV108Tipcolcod3), Byte.valueOf(AV103Intcod1), Byte.valueOf(AV104Intcod3), Integer.valueOf(AV88barcod), Integer.valueOf(AV88barcod), Byte.valueOf(AV89barcodreo), Byte.valueOf(AV89barcodreo), AV90barcodpar, AV90barcodpar, AV131Wcwanalisiscostesquimicossds_2_tfhrefectin, AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV140Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV141Wcwanalisiscostesquimicossds_12_tfclicod_to), lV142Wcwanalisiscostesquimicossds_13_tfclinom, AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV144Wcwanalisiscostesquimicossds_15_tfhrebarser, AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV148Wcwanalisiscostesquimicossds_19_tfhretipartd, AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4495HreNumCie = H00T63_A4495HreNumCie[0] ;
            A396EmprCod = H00T63_A396EmprCod[0] ;
            A4519HreTipArt = H00T63_A4519HreTipArt[0] ;
            n4519HreTipArt = H00T63_n4519HreTipArt[0] ;
            A4525HreTipCol = H00T63_A4525HreTipCol[0] ;
            n4525HreTipCol = H00T63_n4525HreTipCol[0] ;
            A4539HreIntCod = H00T63_A4539HreIntCod[0] ;
            n4539HreIntCod = H00T63_n4539HreIntCod[0] ;
            A9808HreRacab = H00T63_A9808HreRacab[0] ;
            n9808HreRacab = H00T63_n9808HreRacab[0] ;
            A4516HreDisCli = H00T63_A4516HreDisCli[0] ;
            n4516HreDisCli = H00T63_n4516HreDisCli[0] ;
            A11318HreDispCli = H00T63_A11318HreDispCli[0] ;
            n11318HreDispCli = H00T63_n11318HreDispCli[0] ;
            A4540HreIntDsc = H00T63_A4540HreIntDsc[0] ;
            n4540HreIntDsc = H00T63_n4540HreIntDsc[0] ;
            A4526HreTipColN = H00T63_A4526HreTipColN[0] ;
            n4526HreTipColN = H00T63_n4526HreTipColN[0] ;
            A4522HreColNum = H00T63_A4522HreColNum[0] ;
            n4522HreColNum = H00T63_n4522HreColNum[0] ;
            A4521HreColNom = H00T63_A4521HreColNom[0] ;
            n4521HreColNom = H00T63_n4521HreColNom[0] ;
            A4520HreTipArtD = H00T63_A4520HreTipArtD[0] ;
            n4520HreTipArtD = H00T63_n4520HreTipArtD[0] ;
            A4518HreBarDsc = H00T63_A4518HreBarDsc[0] ;
            n4518HreBarDsc = H00T63_n4518HreBarDsc[0] ;
            A4517HreBarSer = H00T63_A4517HreBarSer[0] ;
            n4517HreBarSer = H00T63_n4517HreBarSer[0] ;
            A279CliNom = H00T63_A279CliNom[0] ;
            A252CliCod = H00T63_A252CliCod[0] ;
            n252CliCod = H00T63_n252CliCod[0] ;
            A4542HreTotKgm = H00T63_A4542HreTotKgm[0] ;
            n4542HreTotKgm = H00T63_n4542HreTotKgm[0] ;
            A4532HreBarKgm = H00T63_A4532HreBarKgm[0] ;
            n4532HreBarKgm = H00T63_n4532HreBarKgm[0] ;
            A4529HreFecTin = H00T63_A4529HreFecTin[0] ;
            n4529HreFecTin = H00T63_n4529HreFecTin[0] ;
            A4494HreBarPar = H00T63_A4494HreBarPar[0] ;
            A4493HreBarReo = H00T63_A4493HreBarReo[0] ;
            A4492HreBarCod = H00T63_A4492HreBarCod[0] ;
            A279CliNom = H00T63_A279CliNom[0] ;
            if ( ( GXutil.strcmp(A9808HreRacab, AV87HreRacab) == 0 ) || ( GXutil.strcmp(AV87HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
            {
               A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
               e20T62 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wbT60( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV165Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV165Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_HRELINMAQ"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9")));
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
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
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
         gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
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
         gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
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
         gxgrgrid_refresh( subGrid_Rows, AV123FilterFullText, AV91EmprCod, AV87HreRacab, AV101Fec1, AV102Fec2, AV88barcod, AV89barcodreo, AV90barcodpar, AV92ARtcod1, AV93Artcod3, AV94Barcolnom1, AV95Barcolnom3, AV96Barcolnum1, AV97Barcolnum3, AV99Clicod1, AV100Clicod3, AV103Intcod1, AV104Intcod3, AV105TipArtCod1, AV106Tipartcod3, AV107Tipcolcod1, AV108Tipcolcod3, AV24ManageFiltersExecutionStep, AV19ColumnsSelector, AV26TFHreFecTin, AV39TFHreBarKgm, AV40TFHreBarKgm_To, AV42TFHreTotKgm, AV43TFHreTotKgm_To, AV45TFHreMaqCod, AV46TFHreMaqCod_Sel, AV48TFHreVolPrd, AV49TFHreVolPrd_To, AV57TFCliCod, AV58TFCliCod_To, AV60TFCliNom, AV61TFCliNom_Sel, AV63TFHreBarSer, AV64TFHreBarSer_Sel, AV66TFHreBarDsc, AV67TFHreBarDsc_Sel, AV69TFHreTipArtD, AV70TFHreTipArtD_Sel, AV72TFHreColNom, AV73TFHreColNom_Sel, AV75TFHreColNum, AV76TFHreColNum_To, AV78TFHreTipColN, AV79TFHreTipColN_Sel, AV83TFHreIntDsc, AV84TFHreIntDsc_Sel, AV114TFHreDti, AV119TFHreDtf, AV165Pgmname, AV37OrderedBy, AV12OrderedDsc, AV98Calculo, A4497HreAgrCod, A9985HreAcCod, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4551HreProCod, A4552HreProDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV165Pgmname = "WCWAnalisisCostesQuimicoss" ;
      Gx_err = (short)(0) ;
      edtavToa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprocod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTablaa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupT60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18T62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV31DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV19ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV34GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV91EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV91EmprCod") ;
         wcpOAV87HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV87HreRacab") ;
         wcpOAV101Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV101Fec1"), 0) ;
         wcpOAV102Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV102Fec2"), 0) ;
         wcpOAV98Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV88barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV88barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV89barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV89barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV90barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV90barcodpar") ;
         wcpOAV92ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV92ARtcod1") ;
         wcpOAV93Artcod3 = httpContext.cgiGet( sPrefix+"wcpOAV93Artcod3") ;
         wcpOAV94Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV94Barcolnom1") ;
         wcpOAV95Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV95Barcolnom3") ;
         wcpOAV96Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV97Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV99Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV99Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV100Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV103Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV104Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV104Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV105TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV105TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV106Tipartcod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106Tipartcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV107Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV107Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV108Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV108Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV91EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         AV123FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123FilterFullText", AV123FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hrefectinauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HREFECTINAUXDATE");
            GX_FocusControl = edtavDdo_hrefectinauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28DDO_HreFecTinAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28DDO_HreFecTinAuxDate", localUtil.format(AV28DDO_HreFecTinAuxDate, "99/99/99"));
         }
         else
         {
            AV28DDO_HreFecTinAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hrefectinauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28DDO_HreFecTinAuxDate", localUtil.format(AV28DDO_HreFecTinAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hredtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HREDTIAUXDATE");
            GX_FocusControl = edtavDdo_hredtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116DDO_HreDtiAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116DDO_HreDtiAuxDate", localUtil.format(AV116DDO_HreDtiAuxDate, "99/99/99"));
         }
         else
         {
            AV116DDO_HreDtiAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hredtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116DDO_HreDtiAuxDate", localUtil.format(AV116DDO_HreDtiAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hredtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HREDTFAUXDATE");
            GX_FocusControl = edtavDdo_hredtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV121DDO_HreDtfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121DDO_HreDtfAuxDate", localUtil.format(AV121DDO_HreDtfAuxDate, "99/99/99"));
         }
         else
         {
            AV121DDO_HreDtfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hredtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121DDO_HreDtfAuxDate", localUtil.format(AV121DDO_HreDtfAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV123FilterFullText) != 0 )
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
      e18T62 ();
      if (returnInSub) return;
   }

   public void e18T62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV127Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char1 = GXv_char2[0] ;
      AV127Station = GXt_char1 ;
      GXv_char2[0] = AV91EmprCod ;
      GXv_char3[0] = AV128Emprnom ;
      GXv_char4[0] = AV129Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV127Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwanalisiscostesquimicoss_impl.this.AV91EmprCod = GXv_char2[0] ;
      wcwanalisiscostesquimicoss_impl.this.AV128Emprnom = GXv_char3[0] ;
      wcwanalisiscostesquimicoss_impl.this.AV129Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EmprCod", AV91EmprCod);
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
      if ( AV37OrderedBy < 1 )
      {
         AV37OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwccostesproductos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwccostesproductos_Component), GXutil.lower( "WCCostesProductos")) != 0 )
      {
         WebComp_Wcwccostesproductos = WebUtils.getWebComponent(getClass(), "app.wccostesproductos_impl", remoteHandle, context);
         WebComp_Wcwccostesproductos_Component = "WCCostesProductos" ;
      }
      if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
      {
         WebComp_Wcwccostesproductos.setjustcreated();
         WebComp_Wcwccostesproductos.componentprepare(new Object[] {sPrefix+"W0088","",AV91EmprCod,Integer.valueOf(A4492HreBarCod),Byte.valueOf(A4493HreBarReo),A4494HreBarPar,Byte.valueOf(A4495HreNumCie),Short.valueOf(A4545HreLinMaq)});
         WebComp_Wcwccostesproductos.componentbind(new Object[] {"","","","","",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV31DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV31DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19T62( )
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
      if ( AV24ManageFiltersExecutionStep == 1 )
      {
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV24ManageFiltersExecutionStep == 2 )
      {
         AV24ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV21Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector"), "") != 0 )
      {
         AV17ColumnsSelectorXML = AV21Session.getValue("WCWAnalisisCostesQuimicossColumnsSelector") ;
         AV19ColumnsSelector.fromxml(AV17ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHreFecTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreFecTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecTin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavToa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavBaragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarKgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreTotKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreTotKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotKgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavRb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostei_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavPorc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCostek_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreBarDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreTipColN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreTipColN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipColN_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreIntDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreIntDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreIntDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprocod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHreprodsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprodsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprodsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavTablaa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTablaa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTablaa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreDti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreDti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHreDtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreDtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDtf_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV19ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV33GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridCurrentPage), 10, 0));
      AV34GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridPageCount), 10, 0));
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = AV123FilterFullText ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = AV26TFHreFecTin ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV39TFHreBarKgm ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV40TFHreBarKgm_To ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV42TFHreTotKgm ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV43TFHreTotKgm_To ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV45TFHreMaqCod ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV46TFHreMaqCod_Sel ;
      AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV48TFHreVolPrd ;
      AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV49TFHreVolPrd_To ;
      AV140Wcwanalisiscostesquimicossds_11_tfclicod = AV57TFCliCod ;
      AV141Wcwanalisiscostesquimicossds_12_tfclicod_to = AV58TFCliCod_To ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = AV60TFCliNom ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV61TFCliNom_Sel ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = AV63TFHreBarSer ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV64TFHreBarSer_Sel ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV66TFHreBarDsc ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV67TFHreBarDsc_Sel ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = AV69TFHreTipArtD ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV70TFHreTipArtD_Sel ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV72TFHreColNom ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV73TFHreColNom_Sel ;
      AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV75TFHreColNum ;
      AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV76TFHreColNum_To ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV78TFHreTipColN ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV79TFHreTipColN_Sel ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV83TFHreIntDsc ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV84TFHreIntDsc_Sel ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = AV114TFHreDti ;
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = AV119TFHreDtf ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12T62( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e13T62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14T62( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV37OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreFecTin") == 0 )
         {
            AV26TFHreFecTin = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreFecTin", localUtil.format(AV26TFHreFecTin, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarKgm") == 0 )
         {
            AV39TFHreBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreBarKgm", GXutil.ltrimstr( AV39TFHreBarKgm, 9, 2));
            AV40TFHreBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHreBarKgm_To", GXutil.ltrimstr( AV40TFHreBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreTotKgm") == 0 )
         {
            AV42TFHreTotKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreTotKgm", GXutil.ltrimstr( AV42TFHreTotKgm, 9, 2));
            AV43TFHreTotKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreTotKgm_To", GXutil.ltrimstr( AV43TFHreTotKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreMaqCod") == 0 )
         {
            AV45TFHreMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHreMaqCod", AV45TFHreMaqCod);
            AV46TFHreMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHreMaqCod_Sel", AV46TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreVolPrd") == 0 )
         {
            AV48TFHreVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHreVolPrd), 5, 0));
            AV49TFHreVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV57TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
            AV58TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV60TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
            AV61TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarSer") == 0 )
         {
            AV63TFHreBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHreBarSer", AV63TFHreBarSer);
            AV64TFHreBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFHreBarSer_Sel", AV64TFHreBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarDsc") == 0 )
         {
            AV66TFHreBarDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFHreBarDsc", AV66TFHreBarDsc);
            AV67TFHreBarDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHreBarDsc_Sel", AV67TFHreBarDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreTipArtD") == 0 )
         {
            AV69TFHreTipArtD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHreTipArtD", AV69TFHreTipArtD);
            AV70TFHreTipArtD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHreTipArtD_Sel", AV70TFHreTipArtD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreColNom") == 0 )
         {
            AV72TFHreColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHreColNom", AV72TFHreColNom);
            AV73TFHreColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHreColNom_Sel", AV73TFHreColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreColNum") == 0 )
         {
            AV75TFHreColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFHreColNum), 6, 0));
            AV76TFHreColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHreColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFHreColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreTipColN") == 0 )
         {
            AV78TFHreTipColN = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHreTipColN", AV78TFHreTipColN);
            AV79TFHreTipColN_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHreTipColN_Sel", AV79TFHreTipColN_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreIntDsc") == 0 )
         {
            AV83TFHreIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHreIntDsc", AV83TFHreIntDsc);
            AV84TFHreIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHreIntDsc_Sel", AV84TFHreIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreDti") == 0 )
         {
            AV114TFHreDti = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFHreDti", localUtil.ttoc( AV114TFHreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreDtf") == 0 )
         {
            AV119TFHreDtf = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFHreDtf", localUtil.ttoc( AV119TFHreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20T62( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         AV14ToA = ((GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "A", "") : httpContext.getMessage( "T", "")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavToa_Internalname, AV14ToA);
         AV35Hdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV35Hdr);
         AV36BarAgrEst = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV36BarAgrEst);
         if ( GXutil.strcmp(AV14ToA, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Using cursor H00T64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4497HreAgrCod = H00T64_A4497HreAgrCod[0] ;
               AV36BarAgrEst = httpContext.getMessage( "S", "") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV36BarAgrEst);
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         else
         {
            /* Using cursor H00T65 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A9985HreAcCod = H00T65_A9985HreAcCod[0] ;
               AV36BarAgrEst = httpContext.getMessage( "S", "") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV36BarAgrEst);
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         AV50Rb = ((A4542HreTotKgm.doubleValue()>0)&&(GXutil.strcmp(AV14ToA, httpContext.getMessage( "T", ""))==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV50Rb, 7, 2));
         AV52CosteT = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV52CosteT, 10, 2));
         AV51Costei = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV51Costei, 10, 2));
         AV53Dif = AV51Costei.subtract(AV52CosteT) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV53Dif, 10, 2));
         AV86Porc = ((AV51Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV53Dif.divide(AV51Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV86Porc, 6, 2));
         AV55CosteK = ((A4532HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV52CosteT.divide(A4532HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV55CosteK, 10, 2));
         if ( GXutil.strcmp(AV14ToA, httpContext.getMessage( "T", "")) != 0 )
         {
            /* Using cursor H00T66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4551HreProCod = H00T66_A4551HreProCod[0] ;
               A4552HreProDsc = H00T66_A4552HreProDsc[0] ;
               AV80HreProCod = A4551HreProCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprocod_Internalname, AV80HreProCod);
               AV81HreProDsc = A4552HreProDsc ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprodsc_Internalname, AV81HreProDsc);
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         if ( GXutil.strcmp(AV36BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(AV14ToA, httpContext.getMessage( "T", "")) == 0 )
            {
               AV85TablaA = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
               /* Using cursor H00T67 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A4497HreAgrCod = H00T67_A4497HreAgrCod[0] ;
                  AV85TablaA = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
                  pr_default.readNext(5);
               }
               pr_default.close(5);
            }
            if ( GXutil.strcmp(AV14ToA, httpContext.getMessage( "A", "")) == 0 )
            {
               AV85TablaA = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
               /* Using cursor H00T68 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A9985HreAcCod = H00T68_A9985HreAcCod[0] ;
                  AV85TablaA = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV85TablaA, 1, 0));
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
         }
         AV112BarEncCli = ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV112BarEncCli);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV124GridActions, 4, 0)) );
   }

   public void e15T62( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV17ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV19ColumnsSelector.fromJSonString(AV17ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossColumnsSelector", ((GXutil.strcmp("", AV17ColumnsSelectorXML)==0) ? "" : AV19ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e11T62( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWAnalisisCostesQuimicossFilters")),GXutil.URLEncode(GXutil.rtrim(AV165Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWAnalisisCostesQuimicossFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV24ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ManageFiltersExecutionStep", GXutil.str( AV24ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV23ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcwanalisiscostesquimicoss_impl.this.GXt_char1 = GXv_char4[0] ;
         AV23ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV23ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV165Pgmname+"GridState", AV23ManageFiltersXml) ;
            AV10GridState.fromxml(AV23ManageFiltersXml, null, null);
            AV37OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
            AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ColumnsSelector", AV19ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e21T62( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV124GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV124GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S202 ();
         if (returnInSub) return;
      }
      AV124GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV124GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e16T62( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV15ExcelFilename ;
      GXv_char3[0] = AV16ErrorMessage ;
      new app.wcwanalisiscostesquimicossexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcwanalisiscostesquimicoss_impl.this.AV15ExcelFilename = GXv_char4[0] ;
      wcwanalisiscostesquimicoss_impl.this.AV16ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV15ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV15ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV16ErrorMessage);
      }
   }

   public void e17T62( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwanalisiscostesquimicossexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV37OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV19ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreFecTin", "", "Fecha Cierre", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&ToA", "", "", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Hdr", "", "N Hdr", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarAgrEst", "", "Agr?", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreBarKgm", "", "Kilos", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreTotKgm", "", "Kilos Tot", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreMaqCod", "", "Maquina", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreVolPrd", "", "Volumen", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Rb", "", "Rb", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Costei", "", "Coste I", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CosteT", "", "Coste T", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Dif", "", "Dif", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Porc", "", "%", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CosteK", "", "Coste kg", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreBarSer", "", "Articulo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreBarDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreTipArtD", "", "Tipo articulo", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreColNom", "", "Color", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreColNum", "", "Numero", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreTipColN", "", "TC", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreIntDsc", "", "Intensidad", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HreProCod", "", "Proceso", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HreProDsc", "", "Descripcion", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&TablaA", "", "", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreDti", "", "Inicio", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreDtf", "", "Fin", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV19ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV18UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossColumnsSelector", GXv_char4) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV18UserCustomValue)==0) ) )
      {
         AV20ColumnsSelectorAux.fromxml(AV18UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV19ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV20ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV19ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCWAnalisisCostesQuimicossFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV123FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123FilterFullText", AV123FilterFullText);
      AV26TFHreFecTin = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreFecTin", localUtil.format(AV26TFHreFecTin, "99/99/99"));
      AV39TFHreBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreBarKgm", GXutil.ltrimstr( AV39TFHreBarKgm, 9, 2));
      AV40TFHreBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHreBarKgm_To", GXutil.ltrimstr( AV40TFHreBarKgm_To, 9, 2));
      AV42TFHreTotKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreTotKgm", GXutil.ltrimstr( AV42TFHreTotKgm, 9, 2));
      AV43TFHreTotKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreTotKgm_To", GXutil.ltrimstr( AV43TFHreTotKgm_To, 9, 2));
      AV45TFHreMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHreMaqCod", AV45TFHreMaqCod);
      AV46TFHreMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHreMaqCod_Sel", AV46TFHreMaqCod_Sel);
      AV48TFHreVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHreVolPrd), 5, 0));
      AV49TFHreVolPrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHreVolPrd_To), 5, 0));
      AV57TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
      AV58TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
      AV60TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
      AV61TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
      AV63TFHreBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHreBarSer", AV63TFHreBarSer);
      AV64TFHreBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFHreBarSer_Sel", AV64TFHreBarSer_Sel);
      AV66TFHreBarDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFHreBarDsc", AV66TFHreBarDsc);
      AV67TFHreBarDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHreBarDsc_Sel", AV67TFHreBarDsc_Sel);
      AV69TFHreTipArtD = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHreTipArtD", AV69TFHreTipArtD);
      AV70TFHreTipArtD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHreTipArtD_Sel", AV70TFHreTipArtD_Sel);
      AV72TFHreColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHreColNom", AV72TFHreColNom);
      AV73TFHreColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHreColNom_Sel", AV73TFHreColNom_Sel);
      AV75TFHreColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFHreColNum), 6, 0));
      AV76TFHreColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHreColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFHreColNum_To), 6, 0));
      AV78TFHreTipColN = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHreTipColN", AV78TFHreTipColN);
      AV79TFHreTipColN_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHreTipColN_Sel", AV79TFHreTipColN_Sel);
      AV83TFHreIntDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHreIntDsc", AV83TFHreIntDsc);
      AV84TFHreIntDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHreIntDsc_Sel", AV84TFHreIntDsc_Sel);
      AV114TFHreDti = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFHreDti", localUtil.ttoc( AV114TFHreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV119TFHreDtf = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFHreDtf", localUtil.ttoc( AV119TFHreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thisrec", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thisrec", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue(AV165Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV165Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV21Session.getValue(AV165Pgmname+"GridState"), null, null);
      }
      AV37OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
      AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedDsc", AV12OrderedDsc);
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
      AV166GXV1 = 1 ;
      while ( AV166GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV166GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV123FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123FilterFullText", AV123FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFECTIN") == 0 )
         {
            AV26TFHreFecTin = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreFecTin", localUtil.format(AV26TFHreFecTin, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARKGM") == 0 )
         {
            AV39TFHreBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreBarKgm", GXutil.ltrimstr( AV39TFHreBarKgm, 9, 2));
            AV40TFHreBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHreBarKgm_To", GXutil.ltrimstr( AV40TFHreBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETOTKGM") == 0 )
         {
            AV42TFHreTotKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreTotKgm", GXutil.ltrimstr( AV42TFHreTotKgm, 9, 2));
            AV43TFHreTotKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreTotKgm_To", GXutil.ltrimstr( AV43TFHreTotKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV45TFHreMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHreMaqCod", AV45TFHreMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV46TFHreMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHreMaqCod_Sel", AV46TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV48TFHreVolPrd = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFHreVolPrd), 5, 0));
            AV49TFHreVolPrd_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV57TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFCliCod), 6, 0));
            AV58TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV60TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCliNom", AV60TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV61TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFCliNom_Sel", AV61TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER") == 0 )
         {
            AV63TFHreBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHreBarSer", AV63TFHreBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER_SEL") == 0 )
         {
            AV64TFHreBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFHreBarSer_Sel", AV64TFHreBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC") == 0 )
         {
            AV66TFHreBarDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFHreBarDsc", AV66TFHreBarDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC_SEL") == 0 )
         {
            AV67TFHreBarDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHreBarDsc_Sel", AV67TFHreBarDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD") == 0 )
         {
            AV69TFHreTipArtD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHreTipArtD", AV69TFHreTipArtD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD_SEL") == 0 )
         {
            AV70TFHreTipArtD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHreTipArtD_Sel", AV70TFHreTipArtD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM") == 0 )
         {
            AV72TFHreColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHreColNom", AV72TFHreColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM_SEL") == 0 )
         {
            AV73TFHreColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHreColNom_Sel", AV73TFHreColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNUM") == 0 )
         {
            AV75TFHreColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75TFHreColNum), 6, 0));
            AV76TFHreColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHreColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFHreColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN") == 0 )
         {
            AV78TFHreTipColN = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHreTipColN", AV78TFHreTipColN);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN_SEL") == 0 )
         {
            AV79TFHreTipColN_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFHreTipColN_Sel", AV79TFHreTipColN_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC") == 0 )
         {
            AV83TFHreIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFHreIntDsc", AV83TFHreIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC_SEL") == 0 )
         {
            AV84TFHreIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHreIntDsc_Sel", AV84TFHreIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTI") == 0 )
         {
            AV114TFHreDti = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFHreDti", localUtil.ttoc( AV114TFHreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV116DDO_HreDtiAuxDate = GXutil.resetTime(AV114TFHreDti) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116DDO_HreDtiAuxDate", localUtil.format(AV116DDO_HreDtiAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTF") == 0 )
         {
            AV119TFHreDtf = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TFHreDtf", localUtil.ttoc( AV119TFHreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV121DDO_HreDtfAuxDate = GXutil.resetTime(AV119TFHreDtf) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121DDO_HreDtfAuxDate", localUtil.format(AV121DDO_HreDtfAuxDate, "99/99/99"));
         }
         AV166GXV1 = (int)(AV166GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFHreMaqCod_Sel)==0), AV46TFHreMaqCod_Sel, GXv_char4) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, GXv_char3) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFHreBarSer_Sel)==0), AV64TFHreBarSer_Sel, GXv_char2) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFHreBarDsc_Sel)==0), AV67TFHreBarDsc_Sel, GXv_char15) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFHreTipArtD_Sel)==0), AV70TFHreTipArtD_Sel, GXv_char17) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFHreColNom_Sel)==0), AV73TFHreColNom_Sel, GXv_char19) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFHreTipColN_Sel)==0), AV79TFHreTipColN_Sel, GXv_char21) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFHreIntDsc_Sel)==0), AV84TFHreIntDsc_Sel, GXv_char23) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "||||||"+GXt_char1+"|||||||||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||"+GXt_char20+"|"+GXt_char22+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFHreMaqCod)==0), AV45TFHreMaqCod, GXv_char23) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFCliNom)==0), AV60TFCliNom, GXv_char21) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFHreBarSer)==0), AV63TFHreBarSer, GXv_char19) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFHreBarDsc)==0), AV66TFHreBarDsc, GXv_char17) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFHreTipArtD)==0), AV69TFHreTipArtD, GXv_char15) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFHreColNom)==0), AV72TFHreColNom, GXv_char4) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFHreTipColN)==0), AV78TFHreTipColN, GXv_char3) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFHreIntDsc)==0), AV83TFHreIntDsc, GXv_char2) ;
      wcwanalisiscostesquimicoss_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFHreFecTin)) ? "" : localUtil.dtoc( AV26TFHreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHreBarKgm)==0) ? "" : GXutil.str( AV39TFHreBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHreTotKgm)==0) ? "" : GXutil.str( AV42TFHreTotKgm, 9, 2))+"|"+GXt_char22+"|"+((0==AV48TFHreVolPrd) ? "" : GXutil.str( AV48TFHreVolPrd, 5, 0))+"|||||||"+((0==AV57TFCliCod) ? "" : GXutil.str( AV57TFCliCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV75TFHreColNum) ? "" : GXutil.str( AV75TFHreColNum, 6, 0))+"|"+GXt_char12+"|"+GXt_char1+"||||"+(GXutil.dateCompare(GXutil.nullDate(), AV114TFHreDti) ? "" : localUtil.dtoc( AV116DDO_HreDtiAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV119TFHreDtf) ? "" : localUtil.dtoc( AV121DDO_HreDtfAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHreBarKgm_To)==0) ? "" : GXutil.str( AV40TFHreBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHreTotKgm_To)==0) ? "" : GXutil.str( AV43TFHreTotKgm_To, 9, 2))+"||"+((0==AV49TFHreVolPrd_To) ? "" : GXutil.str( AV49TFHreVolPrd_To, 5, 0))+"|||||||"+((0==AV58TFCliCod_To) ? "" : GXutil.str( AV58TFCliCod_To, 6, 0))+"||||||"+((0==AV76TFHreColNum_To) ? "" : GXutil.str( AV76TFHreColNum_To, 6, 0))+"||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV21Session.getValue(AV165Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV37OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV12OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV123FilterFullText)==0), (short)(0), AV123FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREFECTIN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26TFHreFecTin)), (short)(0), GXutil.trim( localUtil.dtoc( AV26TFHreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHreBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHreBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFHreBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV40TFHreBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHRETOTKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHreTotKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHreTotKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFHreTotKgm, 9, 2)), GXutil.trim( GXutil.str( AV43TFHreTotKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREMAQCOD", "", !(GXutil.strcmp("", AV45TFHreMaqCod)==0), (short)(0), AV45TFHreMaqCod, "", !(GXutil.strcmp("", AV46TFHreMaqCod_Sel)==0), AV46TFHreMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREVOLPRD", "", !((0==AV48TFHreVolPrd)&&(0==AV49TFHreVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFHreVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV49TFHreVolPrd_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV57TFCliCod)&&(0==AV58TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV58TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV60TFCliNom)==0), (short)(0), AV60TFCliNom, "", !(GXutil.strcmp("", AV61TFCliNom_Sel)==0), AV61TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREBARSER", "", !(GXutil.strcmp("", AV63TFHreBarSer)==0), (short)(0), AV63TFHreBarSer, "", !(GXutil.strcmp("", AV64TFHreBarSer_Sel)==0), AV64TFHreBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREBARDSC", "", !(GXutil.strcmp("", AV66TFHreBarDsc)==0), (short)(0), AV66TFHreBarDsc, "", !(GXutil.strcmp("", AV67TFHreBarDsc_Sel)==0), AV67TFHreBarDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHRETIPARTD", "", !(GXutil.strcmp("", AV69TFHreTipArtD)==0), (short)(0), AV69TFHreTipArtD, "", !(GXutil.strcmp("", AV70TFHreTipArtD_Sel)==0), AV70TFHreTipArtD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHRECOLNOM", "", !(GXutil.strcmp("", AV72TFHreColNom)==0), (short)(0), AV72TFHreColNom, "", !(GXutil.strcmp("", AV73TFHreColNom_Sel)==0), AV73TFHreColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHRECOLNUM", "", !((0==AV75TFHreColNum)&&(0==AV76TFHreColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV75TFHreColNum, 6, 0)), GXutil.trim( GXutil.str( AV76TFHreColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHRETIPCOLN", "", !(GXutil.strcmp("", AV78TFHreTipColN)==0), (short)(0), AV78TFHreTipColN, "", !(GXutil.strcmp("", AV79TFHreTipColN_Sel)==0), AV79TFHreTipColN_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREINTDSC", "", !(GXutil.strcmp("", AV83TFHreIntDsc)==0), (short)(0), AV83TFHreIntDsc, "", !(GXutil.strcmp("", AV84TFHreIntDsc_Sel)==0), AV84TFHreIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREDTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV114TFHreDti), (short)(0), GXutil.trim( localUtil.ttoc( AV114TFHreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFHREDTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV119TFHreDtf), (short)(0), GXutil.trim( localUtil.ttoc( AV119TFHreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV91EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV91EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV87HreRacab)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRERACAB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV87HreRacab );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Fec1)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV101Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Fec2)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV102Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV98Calculo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CALCULO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV98Calculo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV88barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV88barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV89barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV89barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV90barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV90barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV92ARtcod1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV92ARtcod1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV93Artcod3)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ARTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV93Artcod3 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV94Barcolnom1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV94Barcolnom1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV95Barcolnom3)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV95Barcolnom3 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV96Barcolnum1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV96Barcolnum1, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV97Barcolnum3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV97Barcolnum3, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV99Clicod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV99Clicod1, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV100Clicod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV100Clicod3, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV103Intcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV103Intcod1, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV104Intcod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV104Intcod3, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV105TipArtCod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV105TipArtCod1, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV106Tipartcod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV106Tipartcod3, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV107Tipcolcod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV107Tipcolcod1, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV108Tipcolcod3) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD3" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV108Tipcolcod3, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV165Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV165Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREC" );
      AV21Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_T62( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_T62( true) ;
      }
      else
      {
         wb_table2_28_T62( false) ;
      }
      return  ;
   }

   public void wb_table2_28_T62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_T62e( true) ;
      }
      else
      {
         wb_table1_23_T62e( false) ;
      }
   }

   public void wb_table2_28_T62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV123FilterFullText, GXutil.rtrim( localUtil.format( AV123FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCWAnalisisCostesQuimicoss.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_T62e( true) ;
      }
      else
      {
         wb_table2_28_T62e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV91EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EmprCod", AV91EmprCod);
      AV87HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87HreRacab", AV87HreRacab);
      AV101Fec1 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Fec1", localUtil.format(AV101Fec1, "99/99/99"));
      AV102Fec2 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Fec2", localUtil.format(AV102Fec2, "99/99/99"));
      AV98Calculo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Calculo", GXutil.str( AV98Calculo, 1, 0));
      AV88barcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88barcod), 8, 0));
      AV89barcodreo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89barcodreo", GXutil.str( AV89barcodreo, 1, 0));
      AV90barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90barcodpar", AV90barcodpar);
      AV92ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92ARtcod1", AV92ARtcod1);
      AV93Artcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Artcod3", AV93Artcod3);
      AV94Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Barcolnom1", AV94Barcolnom1);
      AV95Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcolnom3", AV95Barcolnom3);
      AV96Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96Barcolnum1), 6, 0));
      AV97Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Barcolnum3), 6, 0));
      AV99Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Clicod1), 6, 0));
      AV100Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Clicod3), 6, 0));
      AV103Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Intcod1), 2, 0));
      AV104Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Intcod3), 2, 0));
      AV105TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TipArtCod1), 4, 0));
      AV106Tipartcod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106Tipartcod3), 4, 0));
      AV107Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Tipcolcod1), 2, 0));
      AV108Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Tipcolcod3), 2, 0));
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
      paT62( ) ;
      wsT62( ) ;
      weT62( ) ;
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
      sCtrlAV91EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV87HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV101Fec1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV102Fec2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV98Calculo = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV88barcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV89barcodreo = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV90barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV92ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV93Artcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV94Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV95Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV96Barcolnum1 = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV97Barcolnum3 = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV99Clicod1 = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV100Clicod3 = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV103Intcod1 = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV104Intcod3 = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV105TipArtCod1 = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV106Tipartcod3 = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV107Tipcolcod1 = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV108Tipcolcod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paT62( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwanalisiscostesquimicoss", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paT62( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV91EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EmprCod", AV91EmprCod);
         AV87HreRacab = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87HreRacab", AV87HreRacab);
         AV101Fec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Fec1", localUtil.format(AV101Fec1, "99/99/99"));
         AV102Fec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Fec2", localUtil.format(AV102Fec2, "99/99/99"));
         AV98Calculo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Calculo", GXutil.str( AV98Calculo, 1, 0));
         AV88barcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88barcod), 8, 0));
         AV89barcodreo = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89barcodreo", GXutil.str( AV89barcodreo, 1, 0));
         AV90barcodpar = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90barcodpar", AV90barcodpar);
         AV92ARtcod1 = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92ARtcod1", AV92ARtcod1);
         AV93Artcod3 = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Artcod3", AV93Artcod3);
         AV94Barcolnom1 = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Barcolnom1", AV94Barcolnom1);
         AV95Barcolnom3 = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcolnom3", AV95Barcolnom3);
         AV96Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96Barcolnum1), 6, 0));
         AV97Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Barcolnum3), 6, 0));
         AV99Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Clicod1), 6, 0));
         AV100Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Clicod3), 6, 0));
         AV103Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Intcod1), 2, 0));
         AV104Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Intcod3), 2, 0));
         AV105TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TipArtCod1), 4, 0));
         AV106Tipartcod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106Tipartcod3), 4, 0));
         AV107Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Tipcolcod1), 2, 0));
         AV108Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Tipcolcod3), 2, 0));
      }
      wcpOAV91EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV91EmprCod") ;
      wcpOAV87HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV87HreRacab") ;
      wcpOAV101Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV101Fec1"), 0) ;
      wcpOAV102Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV102Fec2"), 0) ;
      wcpOAV98Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV88barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV88barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV89barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV89barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV90barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV90barcodpar") ;
      wcpOAV92ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV92ARtcod1") ;
      wcpOAV93Artcod3 = httpContext.cgiGet( sPrefix+"wcpOAV93Artcod3") ;
      wcpOAV94Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV94Barcolnom1") ;
      wcpOAV95Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV95Barcolnom3") ;
      wcpOAV96Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV96Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV97Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV99Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV99Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV100Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV100Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV103Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV103Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV104Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV104Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV105TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV105TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV106Tipartcod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV106Tipartcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV107Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV107Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV108Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV108Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV91EmprCod, wcpOAV91EmprCod) != 0 ) || ( GXutil.strcmp(AV87HreRacab, wcpOAV87HreRacab) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV101Fec1), GXutil.resetTime(wcpOAV101Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV102Fec2), GXutil.resetTime(wcpOAV102Fec2)) ) || ( AV98Calculo != wcpOAV98Calculo ) || ( AV88barcod != wcpOAV88barcod ) || ( AV89barcodreo != wcpOAV89barcodreo ) || ( GXutil.strcmp(AV90barcodpar, wcpOAV90barcodpar) != 0 ) || ( GXutil.strcmp(AV92ARtcod1, wcpOAV92ARtcod1) != 0 ) || ( GXutil.strcmp(AV93Artcod3, wcpOAV93Artcod3) != 0 ) || ( GXutil.strcmp(AV94Barcolnom1, wcpOAV94Barcolnom1) != 0 ) || ( GXutil.strcmp(AV95Barcolnom3, wcpOAV95Barcolnom3) != 0 ) || ( AV96Barcolnum1 != wcpOAV96Barcolnum1 ) || ( AV97Barcolnum3 != wcpOAV97Barcolnum3 ) || ( AV99Clicod1 != wcpOAV99Clicod1 ) || ( AV100Clicod3 != wcpOAV100Clicod3 ) || ( AV103Intcod1 != wcpOAV103Intcod1 ) || ( AV104Intcod3 != wcpOAV104Intcod3 ) || ( AV105TipArtCod1 != wcpOAV105TipArtCod1 ) || ( AV106Tipartcod3 != wcpOAV106Tipartcod3 ) || ( AV107Tipcolcod1 != wcpOAV107Tipcolcod1 ) || ( AV108Tipcolcod3 != wcpOAV108Tipcolcod3 ) ) )
      {
         setjustcreated();
      }
      wcpOAV91EmprCod = AV91EmprCod ;
      wcpOAV87HreRacab = AV87HreRacab ;
      wcpOAV101Fec1 = AV101Fec1 ;
      wcpOAV102Fec2 = AV102Fec2 ;
      wcpOAV98Calculo = AV98Calculo ;
      wcpOAV88barcod = AV88barcod ;
      wcpOAV89barcodreo = AV89barcodreo ;
      wcpOAV90barcodpar = AV90barcodpar ;
      wcpOAV92ARtcod1 = AV92ARtcod1 ;
      wcpOAV93Artcod3 = AV93Artcod3 ;
      wcpOAV94Barcolnom1 = AV94Barcolnom1 ;
      wcpOAV95Barcolnom3 = AV95Barcolnom3 ;
      wcpOAV96Barcolnum1 = AV96Barcolnum1 ;
      wcpOAV97Barcolnum3 = AV97Barcolnum3 ;
      wcpOAV99Clicod1 = AV99Clicod1 ;
      wcpOAV100Clicod3 = AV100Clicod3 ;
      wcpOAV103Intcod1 = AV103Intcod1 ;
      wcpOAV104Intcod3 = AV104Intcod3 ;
      wcpOAV105TipArtCod1 = AV105TipArtCod1 ;
      wcpOAV106Tipartcod3 = AV106Tipartcod3 ;
      wcpOAV107Tipcolcod1 = AV107Tipcolcod1 ;
      wcpOAV108Tipcolcod3 = AV108Tipcolcod3 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV91EmprCod = httpContext.cgiGet( sPrefix+"AV91EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV91EmprCod) > 0 )
      {
         AV91EmprCod = httpContext.cgiGet( sCtrlAV91EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91EmprCod", AV91EmprCod);
      }
      else
      {
         AV91EmprCod = httpContext.cgiGet( sPrefix+"AV91EmprCod_PARM") ;
      }
      sCtrlAV87HreRacab = httpContext.cgiGet( sPrefix+"AV87HreRacab_CTRL") ;
      if ( GXutil.len( sCtrlAV87HreRacab) > 0 )
      {
         AV87HreRacab = httpContext.cgiGet( sCtrlAV87HreRacab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87HreRacab", AV87HreRacab);
      }
      else
      {
         AV87HreRacab = httpContext.cgiGet( sPrefix+"AV87HreRacab_PARM") ;
      }
      sCtrlAV101Fec1 = httpContext.cgiGet( sPrefix+"AV101Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV101Fec1) > 0 )
      {
         AV101Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV101Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Fec1", localUtil.format(AV101Fec1, "99/99/99"));
      }
      else
      {
         AV101Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV101Fec1_PARM"), 0) ;
      }
      sCtrlAV102Fec2 = httpContext.cgiGet( sPrefix+"AV102Fec2_CTRL") ;
      if ( GXutil.len( sCtrlAV102Fec2) > 0 )
      {
         AV102Fec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV102Fec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102Fec2", localUtil.format(AV102Fec2, "99/99/99"));
      }
      else
      {
         AV102Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV102Fec2_PARM"), 0) ;
      }
      sCtrlAV98Calculo = httpContext.cgiGet( sPrefix+"AV98Calculo_CTRL") ;
      if ( GXutil.len( sCtrlAV98Calculo) > 0 )
      {
         AV98Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV98Calculo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Calculo", GXutil.str( AV98Calculo, 1, 0));
      }
      else
      {
         AV98Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV98Calculo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV88barcod = httpContext.cgiGet( sPrefix+"AV88barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV88barcod) > 0 )
      {
         AV88barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV88barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88barcod), 8, 0));
      }
      else
      {
         AV88barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV88barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV89barcodreo = httpContext.cgiGet( sPrefix+"AV89barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV89barcodreo) > 0 )
      {
         AV89barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV89barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89barcodreo", GXutil.str( AV89barcodreo, 1, 0));
      }
      else
      {
         AV89barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV89barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV90barcodpar = httpContext.cgiGet( sPrefix+"AV90barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV90barcodpar) > 0 )
      {
         AV90barcodpar = httpContext.cgiGet( sCtrlAV90barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90barcodpar", AV90barcodpar);
      }
      else
      {
         AV90barcodpar = httpContext.cgiGet( sPrefix+"AV90barcodpar_PARM") ;
      }
      sCtrlAV92ARtcod1 = httpContext.cgiGet( sPrefix+"AV92ARtcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV92ARtcod1) > 0 )
      {
         AV92ARtcod1 = httpContext.cgiGet( sCtrlAV92ARtcod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92ARtcod1", AV92ARtcod1);
      }
      else
      {
         AV92ARtcod1 = httpContext.cgiGet( sPrefix+"AV92ARtcod1_PARM") ;
      }
      sCtrlAV93Artcod3 = httpContext.cgiGet( sPrefix+"AV93Artcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV93Artcod3) > 0 )
      {
         AV93Artcod3 = httpContext.cgiGet( sCtrlAV93Artcod3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Artcod3", AV93Artcod3);
      }
      else
      {
         AV93Artcod3 = httpContext.cgiGet( sPrefix+"AV93Artcod3_PARM") ;
      }
      sCtrlAV94Barcolnom1 = httpContext.cgiGet( sPrefix+"AV94Barcolnom1_CTRL") ;
      if ( GXutil.len( sCtrlAV94Barcolnom1) > 0 )
      {
         AV94Barcolnom1 = httpContext.cgiGet( sCtrlAV94Barcolnom1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Barcolnom1", AV94Barcolnom1);
      }
      else
      {
         AV94Barcolnom1 = httpContext.cgiGet( sPrefix+"AV94Barcolnom1_PARM") ;
      }
      sCtrlAV95Barcolnom3 = httpContext.cgiGet( sPrefix+"AV95Barcolnom3_CTRL") ;
      if ( GXutil.len( sCtrlAV95Barcolnom3) > 0 )
      {
         AV95Barcolnom3 = httpContext.cgiGet( sCtrlAV95Barcolnom3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95Barcolnom3", AV95Barcolnom3);
      }
      else
      {
         AV95Barcolnom3 = httpContext.cgiGet( sPrefix+"AV95Barcolnom3_PARM") ;
      }
      sCtrlAV96Barcolnum1 = httpContext.cgiGet( sPrefix+"AV96Barcolnum1_CTRL") ;
      if ( GXutil.len( sCtrlAV96Barcolnum1) > 0 )
      {
         AV96Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV96Barcolnum1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV96Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96Barcolnum1), 6, 0));
      }
      else
      {
         AV96Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV96Barcolnum1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV97Barcolnum3 = httpContext.cgiGet( sPrefix+"AV97Barcolnum3_CTRL") ;
      if ( GXutil.len( sCtrlAV97Barcolnum3) > 0 )
      {
         AV97Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV97Barcolnum3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Barcolnum3), 6, 0));
      }
      else
      {
         AV97Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV97Barcolnum3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV99Clicod1 = httpContext.cgiGet( sPrefix+"AV99Clicod1_CTRL") ;
      if ( GXutil.len( sCtrlAV99Clicod1) > 0 )
      {
         AV99Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV99Clicod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99Clicod1), 6, 0));
      }
      else
      {
         AV99Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV99Clicod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV100Clicod3 = httpContext.cgiGet( sPrefix+"AV100Clicod3_CTRL") ;
      if ( GXutil.len( sCtrlAV100Clicod3) > 0 )
      {
         AV100Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV100Clicod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Clicod3), 6, 0));
      }
      else
      {
         AV100Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV100Clicod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV103Intcod1 = httpContext.cgiGet( sPrefix+"AV103Intcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV103Intcod1) > 0 )
      {
         AV103Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV103Intcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV103Intcod1), 2, 0));
      }
      else
      {
         AV103Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV103Intcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV104Intcod3 = httpContext.cgiGet( sPrefix+"AV104Intcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV104Intcod3) > 0 )
      {
         AV104Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV104Intcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Intcod3), 2, 0));
      }
      else
      {
         AV104Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV104Intcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV105TipArtCod1 = httpContext.cgiGet( sPrefix+"AV105TipArtCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV105TipArtCod1) > 0 )
      {
         AV105TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV105TipArtCod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TipArtCod1), 4, 0));
      }
      else
      {
         AV105TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV105TipArtCod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV106Tipartcod3 = httpContext.cgiGet( sPrefix+"AV106Tipartcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV106Tipartcod3) > 0 )
      {
         AV106Tipartcod3 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV106Tipartcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106Tipartcod3), 4, 0));
      }
      else
      {
         AV106Tipartcod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV106Tipartcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV107Tipcolcod1 = httpContext.cgiGet( sPrefix+"AV107Tipcolcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV107Tipcolcod1) > 0 )
      {
         AV107Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV107Tipcolcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Tipcolcod1), 2, 0));
      }
      else
      {
         AV107Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV107Tipcolcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV108Tipcolcod3 = httpContext.cgiGet( sPrefix+"AV108Tipcolcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV108Tipcolcod3) > 0 )
      {
         AV108Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV108Tipcolcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Tipcolcod3), 2, 0));
      }
      else
      {
         AV108Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV108Tipcolcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paT62( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsT62( ) ;
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
      wsT62( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91EmprCod_PARM", GXutil.rtrim( AV91EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV91EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91EmprCod_CTRL", GXutil.rtrim( sCtrlAV91EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV87HreRacab_PARM", GXutil.rtrim( AV87HreRacab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV87HreRacab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV87HreRacab_CTRL", GXutil.rtrim( sCtrlAV87HreRacab));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101Fec1_PARM", localUtil.dtoc( AV101Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV101Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV101Fec1_CTRL", GXutil.rtrim( sCtrlAV101Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV102Fec2_PARM", localUtil.dtoc( AV102Fec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV102Fec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV102Fec2_CTRL", GXutil.rtrim( sCtrlAV102Fec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98Calculo_PARM", GXutil.ltrim( localUtil.ntoc( AV98Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV98Calculo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98Calculo_CTRL", GXutil.rtrim( sCtrlAV98Calculo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV88barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV88barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV88barcod_CTRL", GXutil.rtrim( sCtrlAV88barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV89barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV89barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89barcodreo_CTRL", GXutil.rtrim( sCtrlAV89barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90barcodpar_PARM", GXutil.rtrim( AV90barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV90barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90barcodpar_CTRL", GXutil.rtrim( sCtrlAV90barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92ARtcod1_PARM", GXutil.rtrim( AV92ARtcod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV92ARtcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV92ARtcod1_CTRL", GXutil.rtrim( sCtrlAV92ARtcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93Artcod3_PARM", GXutil.rtrim( AV93Artcod3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV93Artcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93Artcod3_CTRL", GXutil.rtrim( sCtrlAV93Artcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV94Barcolnom1_PARM", GXutil.rtrim( AV94Barcolnom1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV94Barcolnom1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV94Barcolnom1_CTRL", GXutil.rtrim( sCtrlAV94Barcolnom1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Barcolnom3_PARM", GXutil.rtrim( AV95Barcolnom3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV95Barcolnom3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95Barcolnom3_CTRL", GXutil.rtrim( sCtrlAV95Barcolnom3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96Barcolnum1_PARM", GXutil.ltrim( localUtil.ntoc( AV96Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV96Barcolnum1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV96Barcolnum1_CTRL", GXutil.rtrim( sCtrlAV96Barcolnum1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97Barcolnum3_PARM", GXutil.ltrim( localUtil.ntoc( AV97Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97Barcolnum3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97Barcolnum3_CTRL", GXutil.rtrim( sCtrlAV97Barcolnum3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Clicod1_PARM", GXutil.ltrim( localUtil.ntoc( AV99Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV99Clicod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV99Clicod1_CTRL", GXutil.rtrim( sCtrlAV99Clicod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100Clicod3_PARM", GXutil.ltrim( localUtil.ntoc( AV100Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV100Clicod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV100Clicod3_CTRL", GXutil.rtrim( sCtrlAV100Clicod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103Intcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV103Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV103Intcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV103Intcod1_CTRL", GXutil.rtrim( sCtrlAV103Intcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104Intcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV104Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV104Intcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV104Intcod3_CTRL", GXutil.rtrim( sCtrlAV104Intcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105TipArtCod1_PARM", GXutil.ltrim( localUtil.ntoc( AV105TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV105TipArtCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV105TipArtCod1_CTRL", GXutil.rtrim( sCtrlAV105TipArtCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106Tipartcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV106Tipartcod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV106Tipartcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV106Tipartcod3_CTRL", GXutil.rtrim( sCtrlAV106Tipartcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107Tipcolcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV107Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV107Tipcolcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV107Tipcolcod1_CTRL", GXutil.rtrim( sCtrlAV107Tipcolcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108Tipcolcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV108Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV108Tipcolcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV108Tipcolcod3_CTRL", GXutil.rtrim( sCtrlAV108Tipcolcod3));
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
      weT62( ) ;
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
      if ( ! ( WebComp_Wcwccostesproductos == null ) )
      {
         WebComp_Wcwccostesproductos.componentjscripts();
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
      if ( ! ( WebComp_Wcwccostesproductos == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
         {
            WebComp_Wcwccostesproductos.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565636", true, true);
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
      httpContext.AddJavascriptSource("wcwanalisiscostesquimicoss.js", "?202682115565636", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_41_idx );
      edtHreFecTin_Internalname = sPrefix+"HREFECTIN_"+sGXsfl_41_idx ;
      edtavToa_Internalname = sPrefix+"vTOA_"+sGXsfl_41_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_41_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_41_idx ;
      edtHreBarKgm_Internalname = sPrefix+"HREBARKGM_"+sGXsfl_41_idx ;
      edtHreTotKgm_Internalname = sPrefix+"HRETOTKGM_"+sGXsfl_41_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_41_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_41_idx ;
      edtavRb_Internalname = sPrefix+"vRB_"+sGXsfl_41_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_41_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_41_idx ;
      edtavDif_Internalname = sPrefix+"vDIF_"+sGXsfl_41_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_41_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_41_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtHreBarSer_Internalname = sPrefix+"HREBARSER_"+sGXsfl_41_idx ;
      edtHreBarDsc_Internalname = sPrefix+"HREBARDSC_"+sGXsfl_41_idx ;
      edtHreTipArtD_Internalname = sPrefix+"HRETIPARTD_"+sGXsfl_41_idx ;
      edtHreColNom_Internalname = sPrefix+"HRECOLNOM_"+sGXsfl_41_idx ;
      edtHreColNum_Internalname = sPrefix+"HRECOLNUM_"+sGXsfl_41_idx ;
      edtHreTipColN_Internalname = sPrefix+"HRETIPCOLN_"+sGXsfl_41_idx ;
      edtHreIntDsc_Internalname = sPrefix+"HREINTDSC_"+sGXsfl_41_idx ;
      edtavHreprocod_Internalname = sPrefix+"vHREPROCOD_"+sGXsfl_41_idx ;
      edtavHreprodsc_Internalname = sPrefix+"vHREPRODSC_"+sGXsfl_41_idx ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA_"+sGXsfl_41_idx ;
      edtHreDti_Internalname = sPrefix+"HREDTI_"+sGXsfl_41_idx ;
      edtHreDtf_Internalname = sPrefix+"HREDTF_"+sGXsfl_41_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_41_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_41_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_41_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_41_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_41_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_41_idx ;
      edtBarNhdr_Hi_Internalname = sPrefix+"BARNHDR_HI_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_41_fel_idx );
      edtHreFecTin_Internalname = sPrefix+"HREFECTIN_"+sGXsfl_41_fel_idx ;
      edtavToa_Internalname = sPrefix+"vTOA_"+sGXsfl_41_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_41_fel_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_41_fel_idx ;
      edtHreBarKgm_Internalname = sPrefix+"HREBARKGM_"+sGXsfl_41_fel_idx ;
      edtHreTotKgm_Internalname = sPrefix+"HRETOTKGM_"+sGXsfl_41_fel_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_41_fel_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_41_fel_idx ;
      edtavRb_Internalname = sPrefix+"vRB_"+sGXsfl_41_fel_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_41_fel_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_41_fel_idx ;
      edtavDif_Internalname = sPrefix+"vDIF_"+sGXsfl_41_fel_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_41_fel_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_41_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtHreBarSer_Internalname = sPrefix+"HREBARSER_"+sGXsfl_41_fel_idx ;
      edtHreBarDsc_Internalname = sPrefix+"HREBARDSC_"+sGXsfl_41_fel_idx ;
      edtHreTipArtD_Internalname = sPrefix+"HRETIPARTD_"+sGXsfl_41_fel_idx ;
      edtHreColNom_Internalname = sPrefix+"HRECOLNOM_"+sGXsfl_41_fel_idx ;
      edtHreColNum_Internalname = sPrefix+"HRECOLNUM_"+sGXsfl_41_fel_idx ;
      edtHreTipColN_Internalname = sPrefix+"HRETIPCOLN_"+sGXsfl_41_fel_idx ;
      edtHreIntDsc_Internalname = sPrefix+"HREINTDSC_"+sGXsfl_41_fel_idx ;
      edtavHreprocod_Internalname = sPrefix+"vHREPROCOD_"+sGXsfl_41_fel_idx ;
      edtavHreprodsc_Internalname = sPrefix+"vHREPRODSC_"+sGXsfl_41_fel_idx ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA_"+sGXsfl_41_fel_idx ;
      edtHreDti_Internalname = sPrefix+"HREDTI_"+sGXsfl_41_fel_idx ;
      edtHreDtf_Internalname = sPrefix+"HREDTF_"+sGXsfl_41_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_41_fel_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_41_fel_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_41_fel_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_41_fel_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_41_fel_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_41_fel_idx ;
      edtBarNhdr_Hi_Internalname = sPrefix+"BARNHDR_HI_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbT60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV124GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV124GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV124GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONS.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV124GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreFecTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFecTin_Internalname,localUtil.format(A4529HreFecTin, "99/99/99"),localUtil.format( A4529HreFecTin, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreFecTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreFecTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavToa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavToa_Enabled!=0)&&(edtavToa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavToa_Internalname,GXutil.rtrim( AV14ToA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavToa_Enabled!=0)&&(edtavToa_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavToa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavToa_Visible),Integer.valueOf(edtavToa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV35Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHdr_Visible),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrest_Internalname,GXutil.rtrim( AV36BarAgrEst),GXutil.rtrim( localUtil.format( AV36BarAgrEst, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBaragrest_Visible),Integer.valueOf(edtavBaragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4532HreBarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreTotKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTotKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4542HreTotKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreTotKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreTotKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRb_Enabled!=0)&&(edtavRb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRb_Internalname,GXutil.ltrim( localUtil.ntoc( AV50Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV50Rb, "ZZZ9.99") : localUtil.format( AV50Rb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavRb_Enabled!=0)&&(edtavRb_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRb_Visible),Integer.valueOf(edtavRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostei_Enabled!=0)&&(edtavCostei_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostei_Internalname,GXutil.ltrim( localUtil.ntoc( AV51Costei, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostei_Enabled!=0) ? localUtil.format( AV51Costei, "ZZZZZZ9.99") : localUtil.format( AV51Costei, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostei_Enabled!=0)&&(edtavCostei_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostei_Visible),Integer.valueOf(edtavCostei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostet_Enabled!=0)&&(edtavCostet_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostet_Internalname,GXutil.ltrim( localUtil.ntoc( AV52CosteT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostet_Enabled!=0) ? localUtil.format( AV52CosteT, "ZZZZZZ9.99") : localUtil.format( AV52CosteT, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostet_Enabled!=0)&&(edtavCostet_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostet_Visible),Integer.valueOf(edtavCostet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDif_Enabled!=0)&&(edtavDif_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDif_Internalname,GXutil.ltrim( localUtil.ntoc( AV53Dif, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDif_Enabled!=0) ? localUtil.format( AV53Dif, "ZZZZZZ9.99") : localUtil.format( AV53Dif, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavDif_Enabled!=0)&&(edtavDif_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDif_Visible),Integer.valueOf(edtavDif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorc_Internalname,GXutil.ltrim( localUtil.ntoc( AV86Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorc_Enabled!=0) ? localUtil.format( AV86Porc, "ZZ9.99") : localUtil.format( AV86Porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPorc_Visible),Integer.valueOf(edtavPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostek_Enabled!=0)&&(edtavCostek_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostek_Internalname,GXutil.ltrim( localUtil.ntoc( AV55CosteK, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostek_Enabled!=0) ? localUtil.format( AV55CosteK, "ZZZZZZ9.99") : localUtil.format( AV55CosteK, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostek_Enabled!=0)&&(edtavCostek_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostek_Visible),Integer.valueOf(edtavCostek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarSer_Internalname,GXutil.rtrim( A4517HreBarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreBarDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarDsc_Internalname,GXutil.rtrim( A4518HreBarDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTipArtD_Internalname,GXutil.rtrim( A4520HreTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreColNom_Internalname,GXutil.rtrim( A4521HreColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreTipColN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTipColN_Internalname,GXutil.rtrim( A4526HreTipColN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreTipColN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreTipColN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreIntDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreIntDsc_Internalname,GXutil.rtrim( A4540HreIntDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreIntDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHreprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHreprocod_Enabled!=0)&&(edtavHreprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHreprocod_Internalname,GXutil.rtrim( AV80HreProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHreprocod_Enabled!=0)&&(edtavHreprocod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,66);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHreprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHreprocod_Visible),Integer.valueOf(edtavHreprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHreprodsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHreprodsc_Enabled!=0)&&(edtavHreprodsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHreprodsc_Internalname,GXutil.rtrim( AV81HreProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHreprodsc_Enabled!=0)&&(edtavHreprodsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHreprodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHreprodsc_Visible),Integer.valueOf(edtavHreprodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTablaa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTablaa_Enabled!=0)&&(edtavTablaa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTablaa_Internalname,GXutil.ltrim( localUtil.ntoc( AV85TablaA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTablaa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV85TablaA), "9") : localUtil.format( DecimalUtil.doubleToDec(AV85TablaA), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTablaa_Enabled!=0)&&(edtavTablaa_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTablaa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTablaa_Visible),Integer.valueOf(edtavTablaa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreDti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreDti_Internalname,localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10103HreDti, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreDti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreDti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreDtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreDtf_Internalname,localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10104HreDtf, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreDtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreDtf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV112BarEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNhdr_Hi_Internalname,GXutil.rtrim( A13842BarNhdr_Hi),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNhdr_Hi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesT62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreFecTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavToa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agr?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreTotKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreVolPrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreTipColN_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreIntDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHreprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHreprodsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTablaa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreDti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreDtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV124GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4529HreFecTin, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreFecTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14ToA));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavToa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavToa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV35Hdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV36BarAgrEst));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreTotKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4546HreMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51Costei, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostei_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52CosteT, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53Dif, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDif_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV86Porc, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55CosteK, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostek_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4517HreBarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4518HreBarDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4520HreTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4521HreColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4526HreTipColN));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreTipColN_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4540HreIntDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreIntDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV80HreProCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHreprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHreprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81HreProDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHreprodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHreprodsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85TablaA, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTablaa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTablaa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreDti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreDtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV112BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13842BarNhdr_Hi));
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
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtHreFecTin_Internalname = sPrefix+"HREFECTIN" ;
      edtavToa_Internalname = sPrefix+"vTOA" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST" ;
      edtHreBarKgm_Internalname = sPrefix+"HREBARKGM" ;
      edtHreTotKgm_Internalname = sPrefix+"HRETOTKGM" ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD" ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD" ;
      edtavRb_Internalname = sPrefix+"vRB" ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI" ;
      edtavCostet_Internalname = sPrefix+"vCOSTET" ;
      edtavDif_Internalname = sPrefix+"vDIF" ;
      edtavPorc_Internalname = sPrefix+"vPORC" ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtHreBarSer_Internalname = sPrefix+"HREBARSER" ;
      edtHreBarDsc_Internalname = sPrefix+"HREBARDSC" ;
      edtHreTipArtD_Internalname = sPrefix+"HRETIPARTD" ;
      edtHreColNom_Internalname = sPrefix+"HRECOLNOM" ;
      edtHreColNum_Internalname = sPrefix+"HRECOLNUM" ;
      edtHreTipColN_Internalname = sPrefix+"HRETIPCOLN" ;
      edtHreIntDsc_Internalname = sPrefix+"HREINTDSC" ;
      edtavHreprocod_Internalname = sPrefix+"vHREPROCOD" ;
      edtavHreprodsc_Internalname = sPrefix+"vHREPRODSC" ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA" ;
      edtHreDti_Internalname = sPrefix+"HREDTI" ;
      edtHreDtf_Internalname = sPrefix+"HREDTF" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE" ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ" ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD" ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO" ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR" ;
      edtBarNhdr_Hi_Internalname = sPrefix+"BARNHDR_HI" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hrefectinauxdate_Internalname = sPrefix+"vDDO_HREFECTINAUXDATE" ;
      divDdo_hrefectinauxdates_Internalname = sPrefix+"DDO_HREFECTINAUXDATES" ;
      edtavDdo_hredtiauxdate_Internalname = sPrefix+"vDDO_HREDTIAUXDATE" ;
      divDdo_hredtiauxdates_Internalname = sPrefix+"DDO_HREDTIAUXDATES" ;
      edtavDdo_hredtfauxdate_Internalname = sPrefix+"vDDO_HREDTFAUXDATE" ;
      divDdo_hredtfauxdates_Internalname = sPrefix+"DDO_HREDTFAUXDATES" ;
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
      edtBarNhdr_Hi_Jsonclick = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtHreDtf_Jsonclick = "" ;
      edtHreDti_Jsonclick = "" ;
      edtavTablaa_Jsonclick = "" ;
      edtavTablaa_Enabled = 1 ;
      edtavHreprodsc_Jsonclick = "" ;
      edtavHreprodsc_Enabled = 1 ;
      edtavHreprocod_Jsonclick = "" ;
      edtavHreprocod_Enabled = 1 ;
      edtHreIntDsc_Jsonclick = "" ;
      edtHreTipColN_Jsonclick = "" ;
      edtHreColNum_Jsonclick = "" ;
      edtHreColNom_Jsonclick = "" ;
      edtHreTipArtD_Jsonclick = "" ;
      edtHreBarDsc_Jsonclick = "" ;
      edtHreBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavCostek_Jsonclick = "" ;
      edtavCostek_Enabled = 1 ;
      edtavPorc_Jsonclick = "" ;
      edtavPorc_Enabled = 1 ;
      edtavDif_Jsonclick = "" ;
      edtavDif_Enabled = 1 ;
      edtavCostet_Jsonclick = "" ;
      edtavCostet_Enabled = 1 ;
      edtavCostei_Jsonclick = "" ;
      edtavCostei_Enabled = 1 ;
      edtavRb_Jsonclick = "" ;
      edtavRb_Enabled = 1 ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreMaqCod_Jsonclick = "" ;
      edtHreTotKgm_Jsonclick = "" ;
      edtHreBarKgm_Jsonclick = "" ;
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 1 ;
      edtavToa_Jsonclick = "" ;
      edtavToa_Enabled = 1 ;
      edtHreFecTin_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavBarenccli_Visible = -1 ;
      edtHreDtf_Visible = -1 ;
      edtHreDti_Visible = -1 ;
      edtavTablaa_Visible = -1 ;
      edtavHreprodsc_Visible = -1 ;
      edtavHreprocod_Visible = -1 ;
      edtHreIntDsc_Visible = -1 ;
      edtHreTipColN_Visible = -1 ;
      edtHreColNum_Visible = -1 ;
      edtHreColNom_Visible = -1 ;
      edtHreTipArtD_Visible = -1 ;
      edtHreBarDsc_Visible = -1 ;
      edtHreBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtavCostek_Visible = -1 ;
      edtavPorc_Visible = -1 ;
      edtavDif_Visible = -1 ;
      edtavCostet_Visible = -1 ;
      edtavCostei_Visible = -1 ;
      edtavRb_Visible = -1 ;
      edtHreVolPrd_Visible = -1 ;
      edtHreMaqCod_Visible = -1 ;
      edtHreTotKgm_Visible = -1 ;
      edtHreBarKgm_Visible = -1 ;
      edtavBaragrest_Visible = -1 ;
      edtavHdr_Visible = -1 ;
      edtavToa_Visible = -1 ;
      edtHreFecTin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hredtfauxdate_Jsonclick = "" ;
      edtavDdo_hredtiauxdate_Jsonclick = "" ;
      edtavDdo_hrefectinauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCWAnalisisCostesQuimicossGetFilterData" ;
      Ddo_grid_Datalisttype = "||||||Dynamic|||||||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||||||" ;
      Ddo_grid_Includedatalist = "||||||T|||||||||T|T|T|T|T||T|T||||||" ;
      Ddo_grid_Filterisrange = "||||T|T||T|||||||T||||||T||||||||" ;
      Ddo_grid_Filtertype = "Date||||Numeric|Numeric|Character|Numeric|||||||Numeric|Character|Character|Character|Character|Character|Numeric|Character|Character||||Date|Date|" ;
      Ddo_grid_Includefilter = "T||||T|T|T|T|||||||T|T|T|T|T|T|T|T|T||||T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T||||T|T|T|T|||||||T|T|T|T|T|T|T|T|T||||T|T|" ;
      Ddo_grid_Columnssortvalues = "1||||2|3|4|5|||||||6|7|8|9|10|11|12|13|14||||15|16|" ;
      Ddo_grid_Columnids = "1:HreFecTin|2:ToA|3:Hdr|4:BarAgrEst|5:HreBarKgm|6:HreTotKgm|7:HreMaqCod|8:HreVolPrd|9:Rb|10:Costei|11:CosteT|12:Dif|13:Porc|14:CosteK|15:CliCod|16:CliNom|17:HreBarSer|18:HreBarDsc|19:HreTipArtD|20:HreColNom|21:HreColNum|22:HreTipColN|23:HreIntDsc|24:HreProCod|25:HreProDsc|26:TablaA|27:HreDti|28:HreDtf|29:BarEncCli" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Costes", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreFecTin_Visible',ctrl:'HREFECTIN',prop:'Visible'},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtHreBarKgm_Visible',ctrl:'HREBARKGM',prop:'Visible'},{av:'edtHreTotKgm_Visible',ctrl:'HRETOTKGM',prop:'Visible'},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHreBarSer_Visible',ctrl:'HREBARSER',prop:'Visible'},{av:'edtHreBarDsc_Visible',ctrl:'HREBARDSC',prop:'Visible'},{av:'edtHreTipArtD_Visible',ctrl:'HRETIPARTD',prop:'Visible'},{av:'edtHreColNom_Visible',ctrl:'HRECOLNOM',prop:'Visible'},{av:'edtHreColNum_Visible',ctrl:'HRECOLNUM',prop:'Visible'},{av:'edtHreTipColN_Visible',ctrl:'HRETIPCOLN',prop:'Visible'},{av:'edtHreIntDsc_Visible',ctrl:'HREINTDSC',prop:'Visible'},{av:'edtavHreprocod_Visible',ctrl:'vHREPROCOD',prop:'Visible'},{av:'edtavHreprodsc_Visible',ctrl:'vHREPRODSC',prop:'Visible'},{av:'edtavTablaa_Visible',ctrl:'vTABLAA',prop:'Visible'},{av:'edtHreDti_Visible',ctrl:'HREDTI',prop:'Visible'},{av:'edtHreDtf_Visible',ctrl:'HREDTF',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12T62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13T62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14T62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20T62',iparms:[{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV124GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV14ToA',fld:'vTOA',pic:''},{av:'AV35Hdr',fld:'vHDR',pic:''},{av:'AV36BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV50Rb',fld:'vRB',pic:'ZZZ9.99'},{av:'AV52CosteT',fld:'vCOSTET',pic:'ZZZZZZ9.99'},{av:'AV51Costei',fld:'vCOSTEI',pic:'ZZZZZZ9.99'},{av:'AV53Dif',fld:'vDIF',pic:'ZZZZZZ9.99'},{av:'AV86Porc',fld:'vPORC',pic:'ZZ9.99'},{av:'AV55CosteK',fld:'vCOSTEK',pic:'ZZZZZZ9.99'},{av:'AV80HreProCod',fld:'vHREPROCOD',pic:''},{av:'AV81HreProDsc',fld:'vHREPRODSC',pic:''},{av:'AV85TablaA',fld:'vTABLAA',pic:'9'},{av:'AV112BarEncCli',fld:'vBARENCCLI',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15T62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHreFecTin_Visible',ctrl:'HREFECTIN',prop:'Visible'},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtHreBarKgm_Visible',ctrl:'HREBARKGM',prop:'Visible'},{av:'edtHreTotKgm_Visible',ctrl:'HRETOTKGM',prop:'Visible'},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHreBarSer_Visible',ctrl:'HREBARSER',prop:'Visible'},{av:'edtHreBarDsc_Visible',ctrl:'HREBARDSC',prop:'Visible'},{av:'edtHreTipArtD_Visible',ctrl:'HRETIPARTD',prop:'Visible'},{av:'edtHreColNom_Visible',ctrl:'HRECOLNOM',prop:'Visible'},{av:'edtHreColNum_Visible',ctrl:'HRECOLNUM',prop:'Visible'},{av:'edtHreTipColN_Visible',ctrl:'HRETIPCOLN',prop:'Visible'},{av:'edtHreIntDsc_Visible',ctrl:'HREINTDSC',prop:'Visible'},{av:'edtavHreprocod_Visible',ctrl:'vHREPROCOD',prop:'Visible'},{av:'edtavHreprodsc_Visible',ctrl:'vHREPRODSC',prop:'Visible'},{av:'edtavTablaa_Visible',ctrl:'vTABLAA',prop:'Visible'},{av:'edtHreDti_Visible',ctrl:'HREDTI',prop:'Visible'},{av:'edtHreDtf_Visible',ctrl:'HREDTF',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11T62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV91EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV87HreRacab',fld:'vHRERACAB',pic:''},{av:'AV101Fec1',fld:'vFEC1',pic:''},{av:'AV102Fec2',fld:'vFEC2',pic:''},{av:'AV88barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV89barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV90barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV92ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV93Artcod3',fld:'vARTCOD3',pic:''},{av:'AV94Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV95Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV96Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV97Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV99Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV100Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV103Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV104Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV105TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV106Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV107Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV108Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'AV165Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98Calculo',fld:'vCALCULO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV116DDO_HreDtiAuxDate',fld:'vDDO_HREDTIAUXDATE',pic:''},{av:'AV121DDO_HreDtfAuxDate',fld:'vDDO_HREDTFAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV24ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV123FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFHreFecTin',fld:'vTFHREFECTIN',pic:''},{av:'AV39TFHreBarKgm',fld:'vTFHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV40TFHreBarKgm_To',fld:'vTFHREBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV42TFHreTotKgm',fld:'vTFHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV43TFHreTotKgm_To',fld:'vTFHRETOTKGM_TO',pic:'ZZZZZ9.99'},{av:'AV45TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV46TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV48TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV49TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV57TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV58TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV61TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV63TFHreBarSer',fld:'vTFHREBARSER',pic:''},{av:'AV64TFHreBarSer_Sel',fld:'vTFHREBARSER_SEL',pic:''},{av:'AV66TFHreBarDsc',fld:'vTFHREBARDSC',pic:''},{av:'AV67TFHreBarDsc_Sel',fld:'vTFHREBARDSC_SEL',pic:''},{av:'AV69TFHreTipArtD',fld:'vTFHRETIPARTD',pic:''},{av:'AV70TFHreTipArtD_Sel',fld:'vTFHRETIPARTD_SEL',pic:''},{av:'AV72TFHreColNom',fld:'vTFHRECOLNOM',pic:''},{av:'AV73TFHreColNom_Sel',fld:'vTFHRECOLNOM_SEL',pic:''},{av:'AV75TFHreColNum',fld:'vTFHRECOLNUM',pic:'ZZZZZ9'},{av:'AV76TFHreColNum_To',fld:'vTFHRECOLNUM_TO',pic:'ZZZZZ9'},{av:'AV78TFHreTipColN',fld:'vTFHRETIPCOLN',pic:''},{av:'AV79TFHreTipColN_Sel',fld:'vTFHRETIPCOLN_SEL',pic:''},{av:'AV83TFHreIntDsc',fld:'vTFHREINTDSC',pic:''},{av:'AV84TFHreIntDsc_Sel',fld:'vTFHREINTDSC_SEL',pic:''},{av:'AV114TFHreDti',fld:'vTFHREDTI',pic:'99/99/99 99:99:99'},{av:'AV119TFHreDtf',fld:'vTFHREDTF',pic:'99/99/99 99:99:99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV121DDO_HreDtfAuxDate',fld:'vDDO_HREDTFAUXDATE',pic:''},{av:'AV116DDO_HreDtiAuxDate',fld:'vDDO_HREDTIAUXDATE',pic:''},{av:'AV19ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreFecTin_Visible',ctrl:'HREFECTIN',prop:'Visible'},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtHreBarKgm_Visible',ctrl:'HREBARKGM',prop:'Visible'},{av:'edtHreTotKgm_Visible',ctrl:'HRETOTKGM',prop:'Visible'},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHreBarSer_Visible',ctrl:'HREBARSER',prop:'Visible'},{av:'edtHreBarDsc_Visible',ctrl:'HREBARDSC',prop:'Visible'},{av:'edtHreTipArtD_Visible',ctrl:'HRETIPARTD',prop:'Visible'},{av:'edtHreColNom_Visible',ctrl:'HRECOLNOM',prop:'Visible'},{av:'edtHreColNum_Visible',ctrl:'HRECOLNUM',prop:'Visible'},{av:'edtHreTipColN_Visible',ctrl:'HRETIPCOLN',prop:'Visible'},{av:'edtHreIntDsc_Visible',ctrl:'HREINTDSC',prop:'Visible'},{av:'edtavHreprocod_Visible',ctrl:'vHREPROCOD',prop:'Visible'},{av:'edtavHreprodsc_Visible',ctrl:'vHREPRODSC',prop:'Visible'},{av:'edtavTablaa_Visible',ctrl:'vTABLAA',prop:'Visible'},{av:'edtHreDti_Visible',ctrl:'HREDTI',prop:'Visible'},{av:'edtHreDtf_Visible',ctrl:'HREDTF',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e21T62',iparms:[{av:'cmbavGridactions'},{av:'AV124GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV124GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16T62',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17T62',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barnhdr_hi',iparms:[]");
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
      wcpOAV91EmprCod = "" ;
      wcpOAV87HreRacab = "" ;
      wcpOAV101Fec1 = GXutil.nullDate() ;
      wcpOAV102Fec2 = GXutil.nullDate() ;
      wcpOAV90barcodpar = "" ;
      wcpOAV92ARtcod1 = "" ;
      wcpOAV93Artcod3 = "" ;
      wcpOAV94Barcolnom1 = "" ;
      wcpOAV95Barcolnom3 = "" ;
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
      AV91EmprCod = "" ;
      AV87HreRacab = "" ;
      AV101Fec1 = GXutil.nullDate() ;
      AV102Fec2 = GXutil.nullDate() ;
      AV90barcodpar = "" ;
      AV92ARtcod1 = "" ;
      AV93Artcod3 = "" ;
      AV94Barcolnom1 = "" ;
      AV95Barcolnom3 = "" ;
      AV123FilterFullText = "" ;
      AV19ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFHreFecTin = GXutil.nullDate() ;
      AV39TFHreBarKgm = DecimalUtil.ZERO ;
      AV40TFHreBarKgm_To = DecimalUtil.ZERO ;
      AV42TFHreTotKgm = DecimalUtil.ZERO ;
      AV43TFHreTotKgm_To = DecimalUtil.ZERO ;
      AV45TFHreMaqCod = "" ;
      AV46TFHreMaqCod_Sel = "" ;
      AV60TFCliNom = "" ;
      AV61TFCliNom_Sel = "" ;
      AV63TFHreBarSer = "" ;
      AV64TFHreBarSer_Sel = "" ;
      AV66TFHreBarDsc = "" ;
      AV67TFHreBarDsc_Sel = "" ;
      AV69TFHreTipArtD = "" ;
      AV70TFHreTipArtD_Sel = "" ;
      AV72TFHreColNom = "" ;
      AV73TFHreColNom_Sel = "" ;
      AV78TFHreTipColN = "" ;
      AV79TFHreTipColN_Sel = "" ;
      AV83TFHreIntDsc = "" ;
      AV84TFHreIntDsc_Sel = "" ;
      AV114TFHreDti = GXutil.resetTime( GXutil.nullDate() );
      AV119TFHreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV165Pgmname = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV31DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4516HreDisCli = "" ;
      A11318HreDispCli = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A9808HreRacab = "" ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwccostesproductos_Component = "" ;
      OldWcwccostesproductos = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV28DDO_HreFecTinAuxDate = GXutil.nullDate() ;
      AV116DDO_HreDtiAuxDate = GXutil.nullDate() ;
      AV121DDO_HreDtfAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      AV14ToA = "" ;
      AV35Hdr = "" ;
      AV36BarAgrEst = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      AV50Rb = DecimalUtil.ZERO ;
      AV51Costei = DecimalUtil.ZERO ;
      AV52CosteT = DecimalUtil.ZERO ;
      AV53Dif = DecimalUtil.ZERO ;
      AV86Porc = DecimalUtil.ZERO ;
      AV55CosteK = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4521HreColNom = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      AV80HreProCod = "" ;
      AV81HreProDsc = "" ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV112BarEncCli = "" ;
      A4494HreBarPar = "" ;
      A13842BarNhdr_Hi = "" ;
      AV130Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      AV131Wcwanalisiscostesquimicossds_2_tfhrefectin = GXutil.nullDate() ;
      AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm = DecimalUtil.ZERO ;
      AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = DecimalUtil.ZERO ;
      AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm = DecimalUtil.ZERO ;
      AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = DecimalUtil.ZERO ;
      AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod = "" ;
      AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = "" ;
      AV142Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel = "" ;
      AV144Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = "" ;
      AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = "" ;
      AV148Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = "" ;
      AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = "" ;
      AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = "" ;
      AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = "" ;
      AV158Wcwanalisiscostesquimicossds_29_tfhredti = GXutil.resetTime( GXutil.nullDate() );
      AV159Wcwanalisiscostesquimicossds_30_tfhredtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV130Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      lV142Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      lV144Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      lV148Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      H00T62_A4495HreNumCie = new byte[1] ;
      H00T62_A396EmprCod = new String[] {""} ;
      H00T62_A4519HreTipArt = new short[1] ;
      H00T62_n4519HreTipArt = new boolean[] {false} ;
      H00T62_A4525HreTipCol = new byte[1] ;
      H00T62_n4525HreTipCol = new boolean[] {false} ;
      H00T62_A4539HreIntCod = new byte[1] ;
      H00T62_n4539HreIntCod = new boolean[] {false} ;
      H00T62_A9808HreRacab = new String[] {""} ;
      H00T62_n9808HreRacab = new boolean[] {false} ;
      H00T62_A4516HreDisCli = new String[] {""} ;
      H00T62_n4516HreDisCli = new boolean[] {false} ;
      H00T62_A11318HreDispCli = new String[] {""} ;
      H00T62_n11318HreDispCli = new boolean[] {false} ;
      H00T62_A4540HreIntDsc = new String[] {""} ;
      H00T62_n4540HreIntDsc = new boolean[] {false} ;
      H00T62_A4526HreTipColN = new String[] {""} ;
      H00T62_n4526HreTipColN = new boolean[] {false} ;
      H00T62_A4522HreColNum = new int[1] ;
      H00T62_n4522HreColNum = new boolean[] {false} ;
      H00T62_A4521HreColNom = new String[] {""} ;
      H00T62_n4521HreColNom = new boolean[] {false} ;
      H00T62_A4520HreTipArtD = new String[] {""} ;
      H00T62_n4520HreTipArtD = new boolean[] {false} ;
      H00T62_A4518HreBarDsc = new String[] {""} ;
      H00T62_n4518HreBarDsc = new boolean[] {false} ;
      H00T62_A4517HreBarSer = new String[] {""} ;
      H00T62_n4517HreBarSer = new boolean[] {false} ;
      H00T62_A279CliNom = new String[] {""} ;
      H00T62_A252CliCod = new int[1] ;
      H00T62_n252CliCod = new boolean[] {false} ;
      H00T62_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T62_n4542HreTotKgm = new boolean[] {false} ;
      H00T62_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T62_n4532HreBarKgm = new boolean[] {false} ;
      H00T62_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H00T62_n4529HreFecTin = new boolean[] {false} ;
      H00T62_A4494HreBarPar = new String[] {""} ;
      H00T62_A4493HreBarReo = new byte[1] ;
      H00T62_A4492HreBarCod = new int[1] ;
      H00T63_A4495HreNumCie = new byte[1] ;
      H00T63_A396EmprCod = new String[] {""} ;
      H00T63_A4519HreTipArt = new short[1] ;
      H00T63_n4519HreTipArt = new boolean[] {false} ;
      H00T63_A4525HreTipCol = new byte[1] ;
      H00T63_n4525HreTipCol = new boolean[] {false} ;
      H00T63_A4539HreIntCod = new byte[1] ;
      H00T63_n4539HreIntCod = new boolean[] {false} ;
      H00T63_A9808HreRacab = new String[] {""} ;
      H00T63_n9808HreRacab = new boolean[] {false} ;
      H00T63_A4516HreDisCli = new String[] {""} ;
      H00T63_n4516HreDisCli = new boolean[] {false} ;
      H00T63_A11318HreDispCli = new String[] {""} ;
      H00T63_n11318HreDispCli = new boolean[] {false} ;
      H00T63_A4540HreIntDsc = new String[] {""} ;
      H00T63_n4540HreIntDsc = new boolean[] {false} ;
      H00T63_A4526HreTipColN = new String[] {""} ;
      H00T63_n4526HreTipColN = new boolean[] {false} ;
      H00T63_A4522HreColNum = new int[1] ;
      H00T63_n4522HreColNum = new boolean[] {false} ;
      H00T63_A4521HreColNom = new String[] {""} ;
      H00T63_n4521HreColNom = new boolean[] {false} ;
      H00T63_A4520HreTipArtD = new String[] {""} ;
      H00T63_n4520HreTipArtD = new boolean[] {false} ;
      H00T63_A4518HreBarDsc = new String[] {""} ;
      H00T63_n4518HreBarDsc = new boolean[] {false} ;
      H00T63_A4517HreBarSer = new String[] {""} ;
      H00T63_n4517HreBarSer = new boolean[] {false} ;
      H00T63_A279CliNom = new String[] {""} ;
      H00T63_A252CliCod = new int[1] ;
      H00T63_n252CliCod = new boolean[] {false} ;
      H00T63_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T63_n4542HreTotKgm = new boolean[] {false} ;
      H00T63_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T63_n4532HreBarKgm = new boolean[] {false} ;
      H00T63_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H00T63_n4529HreFecTin = new boolean[] {false} ;
      H00T63_A4494HreBarPar = new String[] {""} ;
      H00T63_A4493HreBarReo = new byte[1] ;
      H00T63_A4492HreBarCod = new int[1] ;
      AV127Station = "" ;
      AV128Emprnom = "" ;
      AV129Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV17ColumnsSelectorXML = "" ;
      H00T64_A4498HreAgrReo = new byte[1] ;
      H00T64_A4499HreAgrPar = new String[] {""} ;
      H00T64_A396EmprCod = new String[] {""} ;
      H00T64_A4492HreBarCod = new int[1] ;
      H00T64_A4493HreBarReo = new byte[1] ;
      H00T64_A4494HreBarPar = new String[] {""} ;
      H00T64_A4495HreNumCie = new byte[1] ;
      H00T64_A4497HreAgrCod = new int[1] ;
      H00T65_A9986HreAcReo = new byte[1] ;
      H00T65_A9987HreAcPar = new String[] {""} ;
      H00T65_A396EmprCod = new String[] {""} ;
      H00T65_A4492HreBarCod = new int[1] ;
      H00T65_A4493HreBarReo = new byte[1] ;
      H00T65_A4494HreBarPar = new String[] {""} ;
      H00T65_A4495HreNumCie = new byte[1] ;
      H00T65_A9985HreAcCod = new int[1] ;
      H00T66_A4545HreLinMaq = new short[1] ;
      H00T66_A4550HreLinPro = new byte[1] ;
      H00T66_A396EmprCod = new String[] {""} ;
      H00T66_A4492HreBarCod = new int[1] ;
      H00T66_A4493HreBarReo = new byte[1] ;
      H00T66_A4494HreBarPar = new String[] {""} ;
      H00T66_A4495HreNumCie = new byte[1] ;
      H00T66_A4551HreProCod = new String[] {""} ;
      H00T66_A4552HreProDsc = new String[] {""} ;
      H00T67_A4498HreAgrReo = new byte[1] ;
      H00T67_A4499HreAgrPar = new String[] {""} ;
      H00T67_A396EmprCod = new String[] {""} ;
      H00T67_A4492HreBarCod = new int[1] ;
      H00T67_A4493HreBarReo = new byte[1] ;
      H00T67_A4494HreBarPar = new String[] {""} ;
      H00T67_A4495HreNumCie = new byte[1] ;
      H00T67_A4497HreAgrCod = new int[1] ;
      H00T68_A9986HreAcReo = new byte[1] ;
      H00T68_A9987HreAcPar = new String[] {""} ;
      H00T68_A396EmprCod = new String[] {""} ;
      H00T68_A4492HreBarCod = new int[1] ;
      H00T68_A4493HreBarReo = new byte[1] ;
      H00T68_A4494HreBarPar = new String[] {""} ;
      H00T68_A4495HreNumCie = new byte[1] ;
      H00T68_A9985HreAcCod = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ManageFiltersXml = "" ;
      AV15ExcelFilename = "" ;
      AV16ErrorMessage = "" ;
      AV18UserCustomValue = "" ;
      AV20ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV91EmprCod = "" ;
      sCtrlAV87HreRacab = "" ;
      sCtrlAV101Fec1 = "" ;
      sCtrlAV102Fec2 = "" ;
      sCtrlAV98Calculo = "" ;
      sCtrlAV88barcod = "" ;
      sCtrlAV89barcodreo = "" ;
      sCtrlAV90barcodpar = "" ;
      sCtrlAV92ARtcod1 = "" ;
      sCtrlAV93Artcod3 = "" ;
      sCtrlAV94Barcolnom1 = "" ;
      sCtrlAV95Barcolnom3 = "" ;
      sCtrlAV96Barcolnum1 = "" ;
      sCtrlAV97Barcolnum3 = "" ;
      sCtrlAV99Clicod1 = "" ;
      sCtrlAV100Clicod3 = "" ;
      sCtrlAV103Intcod1 = "" ;
      sCtrlAV104Intcod3 = "" ;
      sCtrlAV105TipArtCod1 = "" ;
      sCtrlAV106Tipartcod3 = "" ;
      sCtrlAV107Tipcolcod1 = "" ;
      sCtrlAV108Tipcolcod3 = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwanalisiscostesquimicoss__default(),
         new Object[] {
             new Object[] {
            H00T62_A4495HreNumCie, H00T62_A396EmprCod, H00T62_A4519HreTipArt, H00T62_n4519HreTipArt, H00T62_A4525HreTipCol, H00T62_n4525HreTipCol, H00T62_A4539HreIntCod, H00T62_n4539HreIntCod, H00T62_A9808HreRacab, H00T62_n9808HreRacab,
            H00T62_A4516HreDisCli, H00T62_n4516HreDisCli, H00T62_A11318HreDispCli, H00T62_n11318HreDispCli, H00T62_A4540HreIntDsc, H00T62_n4540HreIntDsc, H00T62_A4526HreTipColN, H00T62_n4526HreTipColN, H00T62_A4522HreColNum, H00T62_n4522HreColNum,
            H00T62_A4521HreColNom, H00T62_n4521HreColNom, H00T62_A4520HreTipArtD, H00T62_n4520HreTipArtD, H00T62_A4518HreBarDsc, H00T62_n4518HreBarDsc, H00T62_A4517HreBarSer, H00T62_n4517HreBarSer, H00T62_A279CliNom, H00T62_A252CliCod,
            H00T62_n252CliCod, H00T62_A4542HreTotKgm, H00T62_n4542HreTotKgm, H00T62_A4532HreBarKgm, H00T62_n4532HreBarKgm, H00T62_A4529HreFecTin, H00T62_n4529HreFecTin, H00T62_A4494HreBarPar, H00T62_A4493HreBarReo, H00T62_A4492HreBarCod
            }
            , new Object[] {
            H00T63_A4495HreNumCie, H00T63_A396EmprCod, H00T63_A4519HreTipArt, H00T63_n4519HreTipArt, H00T63_A4525HreTipCol, H00T63_n4525HreTipCol, H00T63_A4539HreIntCod, H00T63_n4539HreIntCod, H00T63_A9808HreRacab, H00T63_n9808HreRacab,
            H00T63_A4516HreDisCli, H00T63_n4516HreDisCli, H00T63_A11318HreDispCli, H00T63_n11318HreDispCli, H00T63_A4540HreIntDsc, H00T63_n4540HreIntDsc, H00T63_A4526HreTipColN, H00T63_n4526HreTipColN, H00T63_A4522HreColNum, H00T63_n4522HreColNum,
            H00T63_A4521HreColNom, H00T63_n4521HreColNom, H00T63_A4520HreTipArtD, H00T63_n4520HreTipArtD, H00T63_A4518HreBarDsc, H00T63_n4518HreBarDsc, H00T63_A4517HreBarSer, H00T63_n4517HreBarSer, H00T63_A279CliNom, H00T63_A252CliCod,
            H00T63_n252CliCod, H00T63_A4542HreTotKgm, H00T63_n4542HreTotKgm, H00T63_A4532HreBarKgm, H00T63_n4532HreBarKgm, H00T63_A4529HreFecTin, H00T63_n4529HreFecTin, H00T63_A4494HreBarPar, H00T63_A4493HreBarReo, H00T63_A4492HreBarCod
            }
            , new Object[] {
            H00T64_A4498HreAgrReo, H00T64_A4499HreAgrPar, H00T64_A396EmprCod, H00T64_A4492HreBarCod, H00T64_A4493HreBarReo, H00T64_A4494HreBarPar, H00T64_A4495HreNumCie, H00T64_A4497HreAgrCod
            }
            , new Object[] {
            H00T65_A9986HreAcReo, H00T65_A9987HreAcPar, H00T65_A396EmprCod, H00T65_A4492HreBarCod, H00T65_A4493HreBarReo, H00T65_A4494HreBarPar, H00T65_A4495HreNumCie, H00T65_A9985HreAcCod
            }
            , new Object[] {
            H00T66_A4545HreLinMaq, H00T66_A4550HreLinPro, H00T66_A396EmprCod, H00T66_A4492HreBarCod, H00T66_A4493HreBarReo, H00T66_A4494HreBarPar, H00T66_A4495HreNumCie, H00T66_A4551HreProCod, H00T66_A4552HreProDsc
            }
            , new Object[] {
            H00T67_A4498HreAgrReo, H00T67_A4499HreAgrPar, H00T67_A396EmprCod, H00T67_A4492HreBarCod, H00T67_A4493HreBarReo, H00T67_A4494HreBarPar, H00T67_A4495HreNumCie, H00T67_A4497HreAgrCod
            }
            , new Object[] {
            H00T68_A9986HreAcReo, H00T68_A9987HreAcPar, H00T68_A396EmprCod, H00T68_A4492HreBarCod, H00T68_A4493HreBarReo, H00T68_A4494HreBarPar, H00T68_A4495HreNumCie, H00T68_A9985HreAcCod
            }
         }
      );
      AV165Pgmname = "WCWAnalisisCostesQuimicoss" ;
      /* GeneXus formulas. */
      AV165Pgmname = "WCWAnalisisCostesQuimicoss" ;
      Gx_err = (short)(0) ;
      edtavToa_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      edtavRb_Enabled = 0 ;
      edtavCostei_Enabled = 0 ;
      edtavCostet_Enabled = 0 ;
      edtavDif_Enabled = 0 ;
      edtavPorc_Enabled = 0 ;
      edtavCostek_Enabled = 0 ;
      edtavHreprocod_Enabled = 0 ;
      edtavHreprodsc_Enabled = 0 ;
      edtavTablaa_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      WebComp_Wcwccostesproductos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV98Calculo ;
   private byte wcpOAV89barcodreo ;
   private byte wcpOAV103Intcod1 ;
   private byte wcpOAV104Intcod3 ;
   private byte wcpOAV107Tipcolcod1 ;
   private byte wcpOAV108Tipcolcod3 ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV98Calculo ;
   private byte AV89barcodreo ;
   private byte AV103Intcod1 ;
   private byte AV104Intcod3 ;
   private byte AV107Tipcolcod1 ;
   private byte AV108Tipcolcod3 ;
   private byte AV24ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV85TablaA ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte nDonePA ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV105TipArtCod1 ;
   private short wcpOAV106Tipartcod3 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV105TipArtCod1 ;
   private short AV106Tipartcod3 ;
   private short AV37OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV124GridActions ;
   private short A4545HreLinMaq ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4519HreTipArt ;
   private int wcpOAV88barcod ;
   private int wcpOAV96Barcolnum1 ;
   private int wcpOAV97Barcolnum3 ;
   private int wcpOAV99Clicod1 ;
   private int wcpOAV100Clicod3 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV88barcod ;
   private int AV96Barcolnum1 ;
   private int AV97Barcolnum3 ;
   private int AV99Clicod1 ;
   private int AV100Clicod3 ;
   private int nGXsfl_41_idx=1 ;
   private int AV48TFHreVolPrd ;
   private int AV49TFHreVolPrd_To ;
   private int AV57TFCliCod ;
   private int AV58TFCliCod_To ;
   private int AV75TFHreColNum ;
   private int AV76TFHreColNum_To ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private int A4547HreVolPrd ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int A4492HreBarCod ;
   private int subGrid_Islastpage ;
   private int edtavToa_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavBaragrest_Enabled ;
   private int edtavRb_Enabled ;
   private int edtavCostei_Enabled ;
   private int edtavCostet_Enabled ;
   private int edtavDif_Enabled ;
   private int edtavPorc_Enabled ;
   private int edtavCostek_Enabled ;
   private int edtavHreprocod_Enabled ;
   private int edtavHreprodsc_Enabled ;
   private int edtavTablaa_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd ;
   private int AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ;
   private int AV140Wcwanalisiscostesquimicossds_11_tfclicod ;
   private int AV141Wcwanalisiscostesquimicossds_12_tfclicod_to ;
   private int AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum ;
   private int AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ;
   private int edtHreFecTin_Visible ;
   private int edtavToa_Visible ;
   private int edtavHdr_Visible ;
   private int edtavBaragrest_Visible ;
   private int edtHreBarKgm_Visible ;
   private int edtHreTotKgm_Visible ;
   private int edtHreMaqCod_Visible ;
   private int edtHreVolPrd_Visible ;
   private int edtavRb_Visible ;
   private int edtavCostei_Visible ;
   private int edtavCostet_Visible ;
   private int edtavDif_Visible ;
   private int edtavPorc_Visible ;
   private int edtavCostek_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtHreBarSer_Visible ;
   private int edtHreBarDsc_Visible ;
   private int edtHreTipArtD_Visible ;
   private int edtHreColNom_Visible ;
   private int edtHreColNum_Visible ;
   private int edtHreTipColN_Visible ;
   private int edtHreIntDsc_Visible ;
   private int edtavHreprocod_Visible ;
   private int edtavHreprodsc_Visible ;
   private int edtavTablaa_Visible ;
   private int edtHreDti_Visible ;
   private int edtHreDtf_Visible ;
   private int edtavBarenccli_Visible ;
   private int AV32PageToGo ;
   private int AV166GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV33GridCurrentPage ;
   private long AV34GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV39TFHreBarKgm ;
   private java.math.BigDecimal AV40TFHreBarKgm_To ;
   private java.math.BigDecimal AV42TFHreTotKgm ;
   private java.math.BigDecimal AV43TFHreTotKgm_To ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal AV50Rb ;
   private java.math.BigDecimal AV51Costei ;
   private java.math.BigDecimal AV52CosteT ;
   private java.math.BigDecimal AV53Dif ;
   private java.math.BigDecimal AV86Porc ;
   private java.math.BigDecimal AV55CosteK ;
   private java.math.BigDecimal AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm ;
   private java.math.BigDecimal AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ;
   private java.math.BigDecimal AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm ;
   private java.math.BigDecimal AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ;
   private String wcpOAV91EmprCod ;
   private String wcpOAV87HreRacab ;
   private String wcpOAV90barcodpar ;
   private String wcpOAV92ARtcod1 ;
   private String wcpOAV93Artcod3 ;
   private String wcpOAV94Barcolnom1 ;
   private String wcpOAV95Barcolnom3 ;
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
   private String AV91EmprCod ;
   private String AV87HreRacab ;
   private String AV90barcodpar ;
   private String AV92ARtcod1 ;
   private String AV93Artcod3 ;
   private String AV94Barcolnom1 ;
   private String AV95Barcolnom3 ;
   private String sGXsfl_41_idx="0001" ;
   private String AV45TFHreMaqCod ;
   private String AV46TFHreMaqCod_Sel ;
   private String AV60TFCliNom ;
   private String AV61TFCliNom_Sel ;
   private String AV63TFHreBarSer ;
   private String AV64TFHreBarSer_Sel ;
   private String AV66TFHreBarDsc ;
   private String AV67TFHreBarDsc_Sel ;
   private String AV69TFHreTipArtD ;
   private String AV70TFHreTipArtD_Sel ;
   private String AV72TFHreColNom ;
   private String AV73TFHreColNom_Sel ;
   private String AV78TFHreTipColN ;
   private String AV79TFHreTipColN_Sel ;
   private String AV83TFHreIntDsc ;
   private String AV84TFHreIntDsc_Sel ;
   private String AV165Pgmname ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4516HreDisCli ;
   private String A11318HreDispCli ;
   private String A9808HreRacab ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcwccostesproductos_Component ;
   private String OldWcwccostesproductos ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hrefectinauxdates_Internalname ;
   private String edtavDdo_hrefectinauxdate_Internalname ;
   private String edtavDdo_hrefectinauxdate_Jsonclick ;
   private String divDdo_hredtiauxdates_Internalname ;
   private String edtavDdo_hredtiauxdate_Internalname ;
   private String edtavDdo_hredtiauxdate_Jsonclick ;
   private String divDdo_hredtfauxdates_Internalname ;
   private String edtavDdo_hredtfauxdate_Internalname ;
   private String edtavDdo_hredtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtHreFecTin_Internalname ;
   private String AV14ToA ;
   private String edtavToa_Internalname ;
   private String AV35Hdr ;
   private String edtavHdr_Internalname ;
   private String AV36BarAgrEst ;
   private String edtavBaragrest_Internalname ;
   private String edtHreBarKgm_Internalname ;
   private String edtHreTotKgm_Internalname ;
   private String A4546HreMaqCod ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtavRb_Internalname ;
   private String edtavCostei_Internalname ;
   private String edtavCostet_Internalname ;
   private String edtavDif_Internalname ;
   private String edtavPorc_Internalname ;
   private String edtavCostek_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A4517HreBarSer ;
   private String edtHreBarSer_Internalname ;
   private String A4518HreBarDsc ;
   private String edtHreBarDsc_Internalname ;
   private String A4520HreTipArtD ;
   private String edtHreTipArtD_Internalname ;
   private String A4521HreColNom ;
   private String edtHreColNom_Internalname ;
   private String edtHreColNum_Internalname ;
   private String A4526HreTipColN ;
   private String edtHreTipColN_Internalname ;
   private String A4540HreIntDsc ;
   private String edtHreIntDsc_Internalname ;
   private String AV80HreProCod ;
   private String edtavHreprocod_Internalname ;
   private String AV81HreProDsc ;
   private String edtavHreprodsc_Internalname ;
   private String edtavTablaa_Internalname ;
   private String edtHreDti_Internalname ;
   private String edtHreDtf_Internalname ;
   private String AV112BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String A13842BarNhdr_Hi ;
   private String edtBarNhdr_Hi_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod ;
   private String AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ;
   private String AV142Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel ;
   private String AV144Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ;
   private String AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ;
   private String AV148Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ;
   private String AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ;
   private String AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ;
   private String AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ;
   private String scmdbuf ;
   private String lV142Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String lV144Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String lV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String lV148Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String lV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String lV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String lV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV127Station ;
   private String AV128Emprnom ;
   private String AV129Usurcod ;
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
   private String sCtrlAV91EmprCod ;
   private String sCtrlAV87HreRacab ;
   private String sCtrlAV101Fec1 ;
   private String sCtrlAV102Fec2 ;
   private String sCtrlAV98Calculo ;
   private String sCtrlAV88barcod ;
   private String sCtrlAV89barcodreo ;
   private String sCtrlAV90barcodpar ;
   private String sCtrlAV92ARtcod1 ;
   private String sCtrlAV93Artcod3 ;
   private String sCtrlAV94Barcolnom1 ;
   private String sCtrlAV95Barcolnom3 ;
   private String sCtrlAV96Barcolnum1 ;
   private String sCtrlAV97Barcolnum3 ;
   private String sCtrlAV99Clicod1 ;
   private String sCtrlAV100Clicod3 ;
   private String sCtrlAV103Intcod1 ;
   private String sCtrlAV104Intcod3 ;
   private String sCtrlAV105TipArtCod1 ;
   private String sCtrlAV106Tipartcod3 ;
   private String sCtrlAV107Tipcolcod1 ;
   private String sCtrlAV108Tipcolcod3 ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtHreFecTin_Jsonclick ;
   private String edtavToa_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavBaragrest_Jsonclick ;
   private String edtHreBarKgm_Jsonclick ;
   private String edtHreTotKgm_Jsonclick ;
   private String edtHreMaqCod_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String edtavRb_Jsonclick ;
   private String edtavCostei_Jsonclick ;
   private String edtavCostet_Jsonclick ;
   private String edtavDif_Jsonclick ;
   private String edtavPorc_Jsonclick ;
   private String edtavCostek_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtHreBarSer_Jsonclick ;
   private String edtHreBarDsc_Jsonclick ;
   private String edtHreTipArtD_Jsonclick ;
   private String edtHreColNom_Jsonclick ;
   private String edtHreColNum_Jsonclick ;
   private String edtHreTipColN_Jsonclick ;
   private String edtHreIntDsc_Jsonclick ;
   private String edtavHreprocod_Jsonclick ;
   private String edtavHreprodsc_Jsonclick ;
   private String edtavTablaa_Jsonclick ;
   private String edtHreDti_Jsonclick ;
   private String edtHreDtf_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreLinMaq_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
   private String edtBarNhdr_Hi_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV114TFHreDti ;
   private java.util.Date AV119TFHreDtf ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date AV158Wcwanalisiscostesquimicossds_29_tfhredti ;
   private java.util.Date AV159Wcwanalisiscostesquimicossds_30_tfhredtf ;
   private java.util.Date wcpOAV101Fec1 ;
   private java.util.Date wcpOAV102Fec2 ;
   private java.util.Date AV101Fec1 ;
   private java.util.Date AV102Fec2 ;
   private java.util.Date AV26TFHreFecTin ;
   private java.util.Date AV28DDO_HreFecTinAuxDate ;
   private java.util.Date AV116DDO_HreDtiAuxDate ;
   private java.util.Date AV121DDO_HreDtfAuxDate ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV131Wcwanalisiscostesquimicossds_2_tfhrefectin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12OrderedDsc ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4529HreFecTin ;
   private boolean n4532HreBarKgm ;
   private boolean n4542HreTotKgm ;
   private boolean n252CliCod ;
   private boolean n4517HreBarSer ;
   private boolean n4518HreBarDsc ;
   private boolean n4520HreTipArtD ;
   private boolean n4521HreColNom ;
   private boolean n4522HreColNum ;
   private boolean n4526HreTipColN ;
   private boolean n4540HreIntDsc ;
   private boolean n4519HreTipArt ;
   private boolean n4525HreTipCol ;
   private boolean n4539HreIntCod ;
   private boolean n9808HreRacab ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwccostesproductos ;
   private boolean gx_refresh_fired ;
   private String AV17ColumnsSelectorXML ;
   private String AV23ManageFiltersXml ;
   private String AV18UserCustomValue ;
   private String AV123FilterFullText ;
   private String AV130Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String lV130Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String AV15ExcelFilename ;
   private String AV16ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwccostesproductos ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private byte[] H00T62_A4495HreNumCie ;
   private String[] H00T62_A396EmprCod ;
   private short[] H00T62_A4519HreTipArt ;
   private boolean[] H00T62_n4519HreTipArt ;
   private byte[] H00T62_A4525HreTipCol ;
   private boolean[] H00T62_n4525HreTipCol ;
   private byte[] H00T62_A4539HreIntCod ;
   private boolean[] H00T62_n4539HreIntCod ;
   private String[] H00T62_A9808HreRacab ;
   private boolean[] H00T62_n9808HreRacab ;
   private String[] H00T62_A4516HreDisCli ;
   private boolean[] H00T62_n4516HreDisCli ;
   private String[] H00T62_A11318HreDispCli ;
   private boolean[] H00T62_n11318HreDispCli ;
   private String[] H00T62_A4540HreIntDsc ;
   private boolean[] H00T62_n4540HreIntDsc ;
   private String[] H00T62_A4526HreTipColN ;
   private boolean[] H00T62_n4526HreTipColN ;
   private int[] H00T62_A4522HreColNum ;
   private boolean[] H00T62_n4522HreColNum ;
   private String[] H00T62_A4521HreColNom ;
   private boolean[] H00T62_n4521HreColNom ;
   private String[] H00T62_A4520HreTipArtD ;
   private boolean[] H00T62_n4520HreTipArtD ;
   private String[] H00T62_A4518HreBarDsc ;
   private boolean[] H00T62_n4518HreBarDsc ;
   private String[] H00T62_A4517HreBarSer ;
   private boolean[] H00T62_n4517HreBarSer ;
   private String[] H00T62_A279CliNom ;
   private int[] H00T62_A252CliCod ;
   private boolean[] H00T62_n252CliCod ;
   private java.math.BigDecimal[] H00T62_A4542HreTotKgm ;
   private boolean[] H00T62_n4542HreTotKgm ;
   private java.math.BigDecimal[] H00T62_A4532HreBarKgm ;
   private boolean[] H00T62_n4532HreBarKgm ;
   private java.util.Date[] H00T62_A4529HreFecTin ;
   private boolean[] H00T62_n4529HreFecTin ;
   private String[] H00T62_A4494HreBarPar ;
   private byte[] H00T62_A4493HreBarReo ;
   private int[] H00T62_A4492HreBarCod ;
   private byte[] H00T63_A4495HreNumCie ;
   private String[] H00T63_A396EmprCod ;
   private short[] H00T63_A4519HreTipArt ;
   private boolean[] H00T63_n4519HreTipArt ;
   private byte[] H00T63_A4525HreTipCol ;
   private boolean[] H00T63_n4525HreTipCol ;
   private byte[] H00T63_A4539HreIntCod ;
   private boolean[] H00T63_n4539HreIntCod ;
   private String[] H00T63_A9808HreRacab ;
   private boolean[] H00T63_n9808HreRacab ;
   private String[] H00T63_A4516HreDisCli ;
   private boolean[] H00T63_n4516HreDisCli ;
   private String[] H00T63_A11318HreDispCli ;
   private boolean[] H00T63_n11318HreDispCli ;
   private String[] H00T63_A4540HreIntDsc ;
   private boolean[] H00T63_n4540HreIntDsc ;
   private String[] H00T63_A4526HreTipColN ;
   private boolean[] H00T63_n4526HreTipColN ;
   private int[] H00T63_A4522HreColNum ;
   private boolean[] H00T63_n4522HreColNum ;
   private String[] H00T63_A4521HreColNom ;
   private boolean[] H00T63_n4521HreColNom ;
   private String[] H00T63_A4520HreTipArtD ;
   private boolean[] H00T63_n4520HreTipArtD ;
   private String[] H00T63_A4518HreBarDsc ;
   private boolean[] H00T63_n4518HreBarDsc ;
   private String[] H00T63_A4517HreBarSer ;
   private boolean[] H00T63_n4517HreBarSer ;
   private String[] H00T63_A279CliNom ;
   private int[] H00T63_A252CliCod ;
   private boolean[] H00T63_n252CliCod ;
   private java.math.BigDecimal[] H00T63_A4542HreTotKgm ;
   private boolean[] H00T63_n4542HreTotKgm ;
   private java.math.BigDecimal[] H00T63_A4532HreBarKgm ;
   private boolean[] H00T63_n4532HreBarKgm ;
   private java.util.Date[] H00T63_A4529HreFecTin ;
   private boolean[] H00T63_n4529HreFecTin ;
   private String[] H00T63_A4494HreBarPar ;
   private byte[] H00T63_A4493HreBarReo ;
   private int[] H00T63_A4492HreBarCod ;
   private byte[] H00T64_A4498HreAgrReo ;
   private String[] H00T64_A4499HreAgrPar ;
   private String[] H00T64_A396EmprCod ;
   private int[] H00T64_A4492HreBarCod ;
   private byte[] H00T64_A4493HreBarReo ;
   private String[] H00T64_A4494HreBarPar ;
   private byte[] H00T64_A4495HreNumCie ;
   private int[] H00T64_A4497HreAgrCod ;
   private byte[] H00T65_A9986HreAcReo ;
   private String[] H00T65_A9987HreAcPar ;
   private String[] H00T65_A396EmprCod ;
   private int[] H00T65_A4492HreBarCod ;
   private byte[] H00T65_A4493HreBarReo ;
   private String[] H00T65_A4494HreBarPar ;
   private byte[] H00T65_A4495HreNumCie ;
   private int[] H00T65_A9985HreAcCod ;
   private short[] H00T66_A4545HreLinMaq ;
   private byte[] H00T66_A4550HreLinPro ;
   private String[] H00T66_A396EmprCod ;
   private int[] H00T66_A4492HreBarCod ;
   private byte[] H00T66_A4493HreBarReo ;
   private String[] H00T66_A4494HreBarPar ;
   private byte[] H00T66_A4495HreNumCie ;
   private String[] H00T66_A4551HreProCod ;
   private String[] H00T66_A4552HreProDsc ;
   private byte[] H00T67_A4498HreAgrReo ;
   private String[] H00T67_A4499HreAgrPar ;
   private String[] H00T67_A396EmprCod ;
   private int[] H00T67_A4492HreBarCod ;
   private byte[] H00T67_A4493HreBarReo ;
   private String[] H00T67_A4494HreBarPar ;
   private byte[] H00T67_A4495HreNumCie ;
   private int[] H00T67_A4497HreAgrCod ;
   private byte[] H00T68_A9986HreAcReo ;
   private String[] H00T68_A9987HreAcPar ;
   private String[] H00T68_A396EmprCod ;
   private int[] H00T68_A4492HreBarCod ;
   private byte[] H00T68_A4493HreBarReo ;
   private String[] H00T68_A4494HreBarPar ;
   private byte[] H00T68_A4495HreNumCie ;
   private int[] H00T68_A9985HreAcCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV31DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcwanalisiscostesquimicoss__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00T62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV130Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV131Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV140Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV141Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV142Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV144Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV148Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV158Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV159Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date A10103HreDti ,
                                          java.util.Date A10104HreDtf ,
                                          short AV37OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          java.util.Date AV101Fec1 ,
                                          java.util.Date AV102Fec2 ,
                                          String A9808HreRacab ,
                                          String AV87HreRacab ,
                                          int AV99Clicod1 ,
                                          int AV100Clicod3 ,
                                          String AV92ARtcod1 ,
                                          String AV93Artcod3 ,
                                          short A4519HreTipArt ,
                                          short AV105TipArtCod1 ,
                                          short AV106Tipartcod3 ,
                                          String AV94Barcolnom1 ,
                                          String AV95Barcolnom3 ,
                                          int AV96Barcolnum1 ,
                                          int AV97Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV107Tipcolcod1 ,
                                          byte AV108Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV103Intcod1 ,
                                          byte AV104Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV88barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV89barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV90barcodpar ,
                                          String AV91EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[46];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T1.EmprCod, T1.HreTipArt, T1.HreTipCol, T1.HreIntCod, T1.HreRacab, T1.HreDisCli, T1.HreDispCli, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum, T1.HreColNom," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod FROM (TXPHISREH" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (0==AV140Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (0==AV141Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV142Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV144Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV148Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (0==AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (0==AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreFecTin" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreFecTin DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarSer" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarSer DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNom" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNum" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNum DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipColN" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipColN DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H00T63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV130Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV131Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV137Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV136Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV138Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV139Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV140Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV141Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV142Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV144Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV148Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV158Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV159Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date A10103HreDti ,
                                          java.util.Date A10104HreDtf ,
                                          short AV37OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          java.util.Date AV101Fec1 ,
                                          java.util.Date AV102Fec2 ,
                                          String A9808HreRacab ,
                                          String AV87HreRacab ,
                                          int AV99Clicod1 ,
                                          int AV100Clicod3 ,
                                          String AV92ARtcod1 ,
                                          String AV93Artcod3 ,
                                          short A4519HreTipArt ,
                                          short AV105TipArtCod1 ,
                                          short AV106Tipartcod3 ,
                                          String AV94Barcolnom1 ,
                                          String AV95Barcolnom3 ,
                                          int AV96Barcolnum1 ,
                                          int AV97Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV107Tipcolcod1 ,
                                          byte AV108Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV103Intcod1 ,
                                          byte AV104Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV88barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV89barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV90barcodpar ,
                                          String AV91EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[46];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.HreNumCie, T1.EmprCod, T1.HreTipArt, T1.HreTipCol, T1.HreIntCod, T1.HreRacab, T1.HreDisCli, T1.HreDispCli, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum, T1.HreColNom," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod FROM (TXPHISREH" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (0==AV140Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (0==AV141Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV142Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV144Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV146Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV148Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV150Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! (0==AV152Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (0==AV153Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV154Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV156Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreFecTin" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreFecTin DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTotKgm DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarSer" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarSer DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreBarDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipArtD DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNom" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreColNum" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreColNum DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreTipColN" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreTipColN DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HreIntDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV12OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H00T62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
            case 1 :
                  return conditional_H00T63(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00T62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T64", "SELECT HreAgrReo, HreAgrPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T65", "SELECT HreAcReo, HreAcPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T66", "SELECT HreLinMaq, HreLinPro, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCod, HreProDsc FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T67", "SELECT HreAgrReo, HreAgrPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T68", "SELECT HreAcReo, HreAcPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 30);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((int[]) buf[39])[0] = rslt.getInt(23);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 30);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((int[]) buf[39])[0] = rslt.getInt(23);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

